package fincar.fincar_web.dao;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class TestDAO extends AbstractDAO {

    public List<Map<String, Object>> getTest(Map param){
        return selectList("test.getTest", param);
    }

}
