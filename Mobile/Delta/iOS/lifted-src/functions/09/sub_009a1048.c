/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a1048..0x9a1188 (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_9a0e00;
extern long long g_9a11ec;
extern long long g_9a1208;

unsigned long long * sub_9a1048(long long a0, long long a1, long long a2, unsigned long a3, unsigned long a4, unsigned long a5, unsigned long a6, unsigned long a7)
{
    unsigned long long *v2;  // x20
    unsigned long long *v3;  // x0
    unsigned long v7;  // cc_dep1
    unsigned long v8;  // cc_dep2
    unsigned long v9;  // cc_ndep
    unsigned long long v10;  // 4110
    unsigned long long v11;  // 4102
    unsigned long v12;  // cc_op
    long long v13;  // x2
    unsigned long long *v4;  // x19
    unsigned long long v5;  // 4110
    unsigned long long v6;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bf4c(24, "ssl/statem/extensions_cust.c", 476);
    v3 = sub_a6bf4c(16, "ssl/statem/extensions_cust.c", 478);
    v4 = v3;
    if (v2)
    {
        v5 = arm64g_calculate_condition(v12 | 16, v7, v8, v9);
        v6 = arm64g_calculate_condition(20, (v5 & 1 ? v3 : 0x40000000), 0, 0);
        if (v6 & 1)
            goto LABEL_9a10ec;
LABEL_9a10c4:
        sub_a6c2e4(v2, "ssl/statem/extensions_cust.c", 482);
        v13 = 483;
    }
    else
    {
        v10 = arm64g_calculate_condition(v12 | 16, v7, v8, v9);
        v11 = arm64g_calculate_condition(16, (v10 & 1 ? v3 : 0x40000000), 0, 0);
        if (!(v11 & 1))
            goto LABEL_9a10c4;
LABEL_9a10ec:
        *v2 = a5;
        v2[1] = a3;
        v2[2] = a4;
        *v4 = a7;
        v4[1] = a6;
        if (sub_9a0e78(a0, 0, a1, a2, 464, &g_9a0e00, &g_9a11ec, v2, &g_9a1208, v4))
            return 1;
        sub_a6c2e4(v2, "ssl/statem/extensions_cust.c", 502);
        v13 = 503;
    }
    sub_a6c2e4(v4, "ssl/statem/extensions_cust.c", v13);
    return 0;
}
