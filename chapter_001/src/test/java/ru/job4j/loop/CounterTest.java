package ru.job4j.loop;

import org.hamcrest.Matchers;
import org.junit.Test;
import ru.job4j.condition.SqMax;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        //напишите здесь тест, проверяющий, что сумма чётных чисел от 1 до 10 при вызове метода counter.add будет равна 30.
        Counter counter = new Counter();
        int result = counter.add(1, 10);
        assertThat(result, Matchers.is(30));
    }
}

