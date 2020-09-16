package cn.school;

import javax.swing.*;
import java.io.*;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.channels.FileChannel;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        HashSet<Integer> integers1 = new HashSet<>();
        integers1.clone();

        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(1);
        integers.addFirst(2);
        integers.add(3);

        integers.poll();
        integers.pollFirst();
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        /**
         * java collection concurrent spring ioc aop transactional spring cloud rabbit mq rocket mq
         * 只有坚持不断的学习，才能取得良好的成绩。打游戏只是一种放松的方式，而不是你整日没事干的
         * 平庸的生活方式是麻醉剂，他只会束缚你，让你没有作为，甚至没有出息地度过一生
         * 等我把高并发看完，就去学习项目
         */
    }
}
