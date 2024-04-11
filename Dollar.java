static class Dollar {
    int amount = 10;
    Dollar() {}
    void times() {}
}

public void testMultiplication() {
    Dollar five = new Dollar();
    five.times();
    assertEquals(10, five.amount);
}