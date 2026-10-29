/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb9ee34..0xb9eec8 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b9ee34(unsigned long long a0, unsigned long long a1)
{
    unsigned long long v2;  // x21
    unsigned long long i;  // x0
    long long *v4;  // x23
    unsigned long long v5;  // 4102
    unsigned long long v6;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = 0;
    for (i = a0; v2 != a1; i = sub_b86a90(v4[1]))
    {
        v4 = a0 + 24 * v2;
        v2 += 1;
        do
        {
            /* unsupported instruction */;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v5 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
        if (!(v5 & 1))
        {
            /* unsupported instruction */;
            i = sub_b86a90(*v4);
        }
        do
        {
            /* unsupported instruction */;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v6 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
        if (!(v6 & 1))
            /* unsupported instruction */;
    }
    return i;
}
