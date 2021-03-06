package app.rest.dao;

import app.rest.pojo.SmokerTrend;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.jar.Pack200;

/**
 * Created by JHP on 12/24/15.
 */
public class SmokerTrendDaoTest {
    private SmokerTrendDao dataDao;

    @Before
    public void initialize(){
        this.dataDao = new SmokerTrendDao();
    }

    @Test
    public void getDataTest(){
       final List<SmokerTrend> allSmokerData = dataDao.getAllSmokerData();
        for (SmokerTrend s: allSmokerData){
            //System.out.println(s.getGender());
            //System.out.println(s.getNumRespondents());
            //System.out.println(s.getPercentage());
            //System.out.println(s.getYear());
        }
        Assert.assertNotNull(allSmokerData);
    }

    @Test
    public void getHeadersTest(){
        final List<String> allHeaders = dataDao.getAllHeaders();
        Assert.assertNotNull(allHeaders);
        for (String s: allHeaders){
            System.out.println(s);
        }
    }

    @Test
    public void getDataTotalTest(){
        final List<SmokerTrend> genderData = dataDao.getTotalSmokerData();
        Assert.assertNotNull(genderData);
        for (SmokerTrend s: genderData){
            Assert.assertEquals(s.getGender(),"Total");
        }
    }

    @Test
    public void getDataByGenderTest(){
        final List<SmokerTrend> genderData = dataDao.getSmokerDataByGender();
        Assert.assertNotNull(genderData);
        for (SmokerTrend s: genderData){
            Assert.assertNotEquals(s.getGender(),"Total");
        }
    }
    @Test
    public void getDefinitionHeadersTest(){
        final List<String> defHeaders = dataDao.getAllDefinitions();
        Assert.assertNotNull(defHeaders);
        for (String s: defHeaders){
            System.out.println(s);
        }
    }
}
