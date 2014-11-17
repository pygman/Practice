package freemarker;

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.File;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by pygmalion on 2014/11/14.
 */
public class TestFreemarker {

    private Configuration conf;
    //1.创建Configuration实例，该实例负责管理FreeMarker的模板加载路径
    public void first()throws Exception{
        conf=new Configuration();
        //设置Test.ftl文件的路径
        conf.setDirectoryForTemplateLoading(new File("templates"));
    }
    private Template t;
    //2.使用Cnofiguration实力生成的Template实例，同时加载指定的模板文件
    public void second() throws Exception{
        t=conf.getTemplate("test.ftl");
    }
    private Map datamap;
    //3.填充数据模型
    public void third(){
        datamap=new HashMap();
        datamap.put("name","hahahahah");
        datamap.put("msg","欢迎使用FreeMarker!");
    }
    //4.合并处理
    public void four() throws Exception{
        t.process(datamap,new OutputStreamWriter(System.out));
    }
    public static void main(String[] args) throws Exception {
        TestFreemarker testFreemarker = new TestFreemarker();
        testFreemarker.first();
        testFreemarker.second();
        testFreemarker.third();
        testFreemarker.four();
    }
}