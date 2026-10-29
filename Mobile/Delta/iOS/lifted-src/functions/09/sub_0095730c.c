/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95730c..0x957564 (600 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_95730c(void* a0, unsigned long a1, void* a2, void* a3, unsigned int a4)
{
    void* v4;  // x20
    long long v5;  // x19
    unsigned long v10;  // cc_op
    unsigned long v11;  // cc_dep1
    unsigned long long v12;  // 4110
    unsigned long v13;  // cc_op
    unsigned long v14;  // cc_dep1
    unsigned long v15;  // cc_dep2
    unsigned long v16;  // cc_ndep
    unsigned long v17;  // 4110
    unsigned long long v18;  // 4110
    unsigned long long v19;  // 4110
    unsigned long long v20;  // 4102
    unsigned long long v21;  // 4110
    unsigned long v7;  // x9
    unsigned long long v22;  // 4102
    unsigned long v23;  // x21
    unsigned long v24;  // x22
    unsigned long v25;  // x20
    long long v26;  // x1
    long long v27;  // x2
    unsigned long v8;  // x0
    unsigned long v9;  // 4110
    unsigned long v0;  // [bp-0x60]
    unsigned long v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a0;
    v0 = 0;
    v1 = 0;
    if (!a1)
    {
        sub_a368c8();
        sub_a369bc("ssl/s3_lib.c", 0x1593, "ssl_encapsulate");
        sub_9a58a4(v4, 80, 0xc0103, 0);
        return 0;
    }
    v5 = sub_a5d5a8(*(long long *)(long long)v4[8]);
    if ((int)sub_a54180(v5, 0, *(long long *)((long long)v4[8] + 1136)) < 1)
    {
LABEL_957394:
        sub_a368c8();
        sub_a369bc("ssl/s3_lib.c", 0x159c, "ssl_encapsulate");
        sub_9a58a4(v4, 80, 0xc0103, 0);
        v23 = 0;
        v24 = 0;
        goto LABEL_9574e4;
    }
    v7 = v0;
    v8 = v1;
    if (1 <= (int)sub_a54190(v5, 0, &v0, 0, &v1))
    {
        v9 = arm64g_calculate_condition(v13 | 160, v14, v15, v16);
        v10 = 4;
        v11 = (v9 & 1 ? v8 : 0x40000000);
        v12 = arm64g_calculate_condition(20, v11, 0, 0);
        if (!(v12 & 1))
            goto LABEL_95738e;
LABEL_95738d:
        v19 = arm64g_calculate_condition(v10 | 16, v11, 0, 0);
        v20 = arm64g_calculate_condition(20, (v19 & 1 ? v7 : 0x40000000), 0, 0);
        if (v20 & 1)
            goto LABEL_957410;
        goto LABEL_957394;
    }
    v17 = arm64g_calculate_condition(v13 | 160, v14, v15, v16);
    v10 = 0;
    v11 = (v17 & 1 ? v8 : 0x40000000);
    v18 = arm64g_calculate_condition(16, v11, 0, 0);
    if (v18 & 1)
        goto LABEL_95738d;
LABEL_95738e:
    v21 = arm64g_calculate_condition(v10 | 16, v11, 0, 0);
    v22 = arm64g_calculate_condition(16, (v21 & 1 ? v7 : 0x40000000), 0, 0);
    if (!(v22 & 1))
        goto LABEL_957394;
LABEL_957410:
    v23 = sub_a6bf4c(v8, "ssl/s3_lib.c", 0x15a0);
    v24 = sub_a6bf4c(v0, "ssl/s3_lib.c", 0x15a1);
    if (!v23 || !v24)
    {
        sub_a368c8();
        sub_a369bc("ssl/s3_lib.c", 0x15a3, "ssl_encapsulate");
        v26 = 80;
        v27 = 524303;
        goto LABEL_9574dc;
    }
    if ((int)sub_a54190(v5, v24, &v0, v23, &v1) <= 0)
    {
        sub_a368c8();
        sub_a369bc("ssl/s3_lib.c", 0x15a8, "ssl_encapsulate");
        v26 = 47;
        v27 = 108;
LABEL_9574dc:
        sub_9a58a4(v4, v26, v27, 0);
LABEL_9574e4:
        v25 = 0;
    }
    else if (a4)
    {
        if (1 <= (int)sub_956e18(v4, v23, v1))
            goto LABEL_95754c;
        goto LABEL_9574e4;
    }
    else
    {
        *(unsigned long *)&v4[944] = v23;
        *(unsigned long *)&v4[952] = v1;
        v23 = 0;
LABEL_95754c:
        *(unsigned long *)a2 = v24;
        *(unsigned long *)a3 = v0;
        v25 = 1;
        v24 = 0;
    }
    sub_a6c4e8(v23, v1, "ssl/s3_lib.c", 0x15bf);
    sub_a6c2e4(v24, "ssl/s3_lib.c", 0x15c0);
    sub_a5d6b0(v5);
    return v25;
}
