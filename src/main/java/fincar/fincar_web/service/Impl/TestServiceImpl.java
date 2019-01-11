package fincar.fincar_web.service.Impl;

import fincar.fincar_web.dao.TestDAO;
import fincar.fincar_web.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDAO testDAO;

    @Override
    public List<Map<String, Object>> getTest(Map param) {
        return testDAO.getTest(param);
    }
}
