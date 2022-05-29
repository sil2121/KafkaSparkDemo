package com.mlp.spark_kafka_test;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

public class HadoopTest {

        public static void main(String[] args) throws IOException{
            //查看
            catFile();
            //创建
            //mkdir();
        }
        public static void catFile() throws IOException {
            //获取配置文件对象
            Configuration conf = new Configuration();
            //添加配置信息
            conf.set("fs.defaultFS","hdfs://localhost:9000");
            //获取文件系统对象
            FileSystem fs = FileSystem.get(conf);
            //操作文件系统
            FSDataInputStream fis = fs.open(new Path("c:\\git\\hello"));
            //读取文件输出到控制台
            IOUtils.copyBytes(fis, System.out, conf, true);
            //关闭文件系统
            if(fs != null) {
                fs.close();
            }
        }

        public static void mkdir() throws IOException {
            Configuration conf = new Configuration();
            conf.set("fs.defaultFS","hdfs://master:9000");
            FileSystem fs = FileSystem.get(conf);

            Path outputDir=new Path("c:\\git\\first");
            if(!fs.exists(outputDir)){//判断如果不存在就创建
                fs.mkdirs(new Path("c:\\git\\first"));
                System.out.println("文件创建成功！");
            }else {
                System.out.println("文件路径已经存在！");
            }
            fs.close();
        }
}