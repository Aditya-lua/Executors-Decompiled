/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbed184..0xbed234 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_bed184(char *a0, long long a1)
{
    unsigned long v3;  // x10
    unsigned long v4;  // cc_dep1
    unsigned long long v13;  // 4112
    unsigned long long v14;  // 4102
    unsigned long long v5;  // x11
    long long v6;  // x8
    unsigned long long v7;  // 4112
    unsigned long long v8;  // 4102
    unsigned long long v9;  // 4112
    unsigned long long v10;  // 4102
    unsigned long long v11;  // 4112
    unsigned long long v12;  // 4102
    uint24_t v0;  // [bp-0x13]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = *a0;
    v4 = v3 & 0xff;
    if ((unsigned int)v3 >= 10)
    {
        v5 = 41 * (unsigned int)v3 >> 12;
        *(short *)((char *)&v0 + 1) = *(short *)(2 * ((unsigned int)v3 - 100 * (unsigned int)v5 & 0xff) + 14721940);
        v6 = 1;
        if ((unsigned int)v3)
        {
            v7 = arm64g_calculate_condition(19, v4, 10, 0);
            v8 = arm64g_calculate_condition(19, (v7 & 1 ? v5 & 0xffffffff : 0), 0, 0);
            if (v8 & 1)
                goto LABEL_bed1ec;
        }
        else
        {
            v9 = arm64g_calculate_condition(19, v4, 10, 0);
            v10 = arm64g_calculate_condition(16, (v9 & 1 ? v5 & 0xffffffff : 0), 0, 0);
            if (v10 & 1)
                goto LABEL_bed1ec;
        }
    }
    else
    {
        v6 = 3;
        v5 = v3;
        if ((unsigned int)v3)
        {
            v11 = arm64g_calculate_condition(19, v4, 10, 0);
            v12 = arm64g_calculate_condition(3, (v11 & 1 ? v5 & 0xffffffff : 0), 0, 0);
            if (!(v12 & 1))
                goto LABEL_bed1ec;
        }
        else
        {
            v13 = arm64g_calculate_condition(19, v4, 10, 0);
            v14 = arm64g_calculate_condition(0, (v13 & 1 ? v5 & 0xffffffff : 0), 0, 0);
            if (!(v14 & 1))
            {
LABEL_bed1ec:
                v6 -= 1;
                *((char *)&v0 + v6) = *(char *)(((v5 * 2 | v5 >> 63) & 254 & 0xff) + 14721941);
            }
        }
    }
    return sub_be8310(a1, 1, 1, 0, (char *)&v0 + v6, 3 - v6);
}
