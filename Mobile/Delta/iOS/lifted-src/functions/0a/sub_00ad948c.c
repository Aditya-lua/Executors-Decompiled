/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad948c..0xad94e4 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_ad948c(unsigned long a0, unsigned long a1, unsigned long long a2)
{
    unsigned long long v5;  // 4106
    unsigned long long v6;  // x30
    unsigned long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v5 = arm64g_calculate_condition(2, a2, 1, 0);
    if (!(v5 & 1))
    {
        v2 = &v4;
        v3 = v6;
        v0 = (a2 >> 9) / 1953125;
        v1 = a2 - 1000000000 * v0;
        _pthread_cond_timedwait();
        return;
    }
}
