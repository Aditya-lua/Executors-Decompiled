/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x237c30..0x237c84 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_237c30(long long a0, long long a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    std::__1::mutex::lock(a0 + 48);
    sub_1533e4(a0, a1);
    std::__1::condition_variable::notify_one(a0 + 112);
    std::__1::mutex::unlock();
    return;
}
