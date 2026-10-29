/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb9f1a4..0xb9f260 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b9f1a4(unsigned long long a0, unsigned long long a1)
{
    unsigned long long v2;  // x23
    unsigned long long i;  // x0
    long long *v4;  // x25
    unsigned long long v5;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = 0;
    for (i = a0; a1 != v2; i = sub_b9b2c4(v4 + 1))
    {
        v4 = a0 + 72 * v2;
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
            sub_b86a90(*v4);
        }
    }
    return i;
}
