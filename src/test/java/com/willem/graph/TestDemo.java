package com.willem.graph;

import com.alibaba.fastjson.JSONObject;
import com.facebook.thrift.TException;
import com.vesoft.nebula.client.graph.*;
import com.vesoft.nebula.graph.RowValue;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author: willem
 * @create: 2020/11/28 02:41
 * @description:
 */
@Slf4j
public class TestDemo {

    @Test
    public void test() throws TException, ConnectionException, NGQLException {
        GraphClient client = new GraphClientImpl("10.26.27.81", 3699);
        client.connect();
        client.switchSpace("nba");
        ResultSet set = client.executeQuery("fetch prop on player 100");
        List<String> columnList = set.getColumns();
        for (String column : columnList) {
            log.info(column);
        }
        List<RowValue> rowList = set.getRows();
        for (RowValue row : rowList) {
            System.out.println(JSONObject.toJSONString(row.getColumns().get(1).getFieldValue()));
        }
    }
}
