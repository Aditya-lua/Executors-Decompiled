/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9544f0..0x9545a8 (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9544f0(long long *a0, unsigned long a1, unsigned long long a2)
{
    long long v2;  // x20
    long long v3;  // x21
    unsigned long v8;  // cc_op
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long v11;  // cc_ndep
    unsigned long long v12;  // 4112
    unsigned long long v13;  // 4102
    unsigned int v4;  // w20
    long long v5;  // w0
    unsigned long long v6;  // 4112
    unsigned long long v7;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0[54])
    {
        if (sub_a3fe10(a0[54]))
            return 1;
        v2 = 786691;
        v3 = 265;
    }
    else if (a2 > 0x7fffffff)
    {
        v2 = 237;
        v3 = 254;
    }
    else
    {
        v4 = a2;
        v5 = (unsigned int)sub_9d3fec(a0[53]);
        if (1 <= v5)
        {
            v6 = arm64g_calculate_condition(v8 | 160, v9, v10, v11);
            v7 = arm64g_calculate_condition(3, (v6 & 1 ? v5 : 0), (v6 & 1 ? v4 : 0), 0);
            if (v7 & 1)
                return 1;
        }
        else
        {
            v12 = arm64g_calculate_condition(v8 | 160, v9, v10, v11);
            v13 = arm64g_calculate_condition(0, (v12 & 1 ? v5 : 0), (v12 & 1 ? v4 : 0), 0);
            if (v13 & 1)
                return 1;
        }
        v2 = 786691;
        v3 = 259;
    }
    sub_a368c8();
    sub_a369bc("ssl/s3_enc.c", v3, "ssl3_finish_mac");
    sub_9a58a4(a0, 80, v2, 0);
    return 0;
}
