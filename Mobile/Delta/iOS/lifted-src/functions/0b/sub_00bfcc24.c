/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbfcc24..0xbfcd0c (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_bfcc24(unsigned long long a0, unsigned long long a1)
{
    unsigned long long i;  // x23
    unsigned long long v3;  // x0
    long long *v4;  // x8
    unsigned long long v5;  // x9
    unsigned long long v6;  // x10
    unsigned long long v7;  // 4121
    unsigned long long v8;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1)
        return a0;
    i = 0;
    v3 = a0;
    do
    {
        v4 = a0 + 24 * i;
        v5 = *v4;
        v6 = v5 ^ 0x8000000000000000;
        v7 = arm64g_calculate_condition(0x44, v5, 0, 0);
        if (!(v7 & 1))
            v6 = 1;
        if (!v6)
        {
            do
            {
                /* unsupported instruction */;
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            v8 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
            if (!(v8 & 1))
            {
                /* unsupported instruction */;
                v3 = sub_b86a90(v4[1]);
            }
        }
        else if (v6 != 1)
        {
            v3 = sub_bfcd0c(v4 + 1);
        }
        else if (v5)
        {
            v3 = _free(v4[1]);
        }
        i += 1;
    } while (i != a1);
    return v3;
}
