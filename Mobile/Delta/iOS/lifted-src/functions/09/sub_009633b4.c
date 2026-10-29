/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9633b4..0x9635a8 (500 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9633b4_1 {
    char padding_0[8];
    struct st_9633b4_2 *field_8;
    char padding_10[1296];
    long long field_520;
    char padding_528[8];
    struct st_9633b4_3 *field_530;
    char padding_538[968];
    struct st_9633b4_0 *field_900;
    char padding_908[136];
    long long field_990;
    unsigned long long field_998;
    char padding_9a0[456];
    struct st_9633b4_4 *field_b68;
} st_9633b4_1;

typedef struct st_9633b4_0 {
    char padding_0[704];
    long long field_2c0;
} st_9633b4_0;

typedef struct st_9633b4_4 {
    unsigned long long field_0;
} st_9633b4_4;

typedef struct st_9633b4_3 {
    char field_0;
} st_9633b4_3;

typedef struct st_9633b4_2 {
    long long field_0;
    char padding_8[456];
    long long field_1d0;
    char padding_1d8[664];
    long long field_470;
} st_9633b4_2;


unsigned long long sub_9633b4(st_9633b4_1 *a0)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long v17;  // cc_dep2
    unsigned long v18;  // cc_ndep
    unsigned long long v19;  // 4110
    unsigned long long v20;  // 4102
    unsigned long v21;  // cc_op
    unsigned long v22;  // cc_dep1
    unsigned long long v23;  // 4110
    unsigned long long v24;  // 4102
    unsigned long long v11;  // x22
    st_9633b4_1 *v25;  // x19
    st_9633b4_1 *v26;  // x8
    unsigned long long v27;  // x20
    long long v28;  // x0
    long long v30;  // x1
    unsigned long long v12;  // x21
    long long v31;  // x2
    st_9633b4_1 *v32;  // x0
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    unsigned long v16;  // x21
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (!a0->field_900)
        return 1;
    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    v16 = a0->field_900->field_2c0;
    if (a0->field_b68)
    {
        v19 = arm64g_calculate_condition(v21 | 16, v22, v17, v18);
        v20 = arm64g_calculate_condition(4, (v19 & 1 ? v16 : 0x40000000), 0, 0);
        if (!(v20 & 1))
            goto LABEL_9633e4;
    }
    else
    {
        v23 = arm64g_calculate_condition(v21 | 16, v22, v17, v18);
        v24 = arm64g_calculate_condition(0, (v23 & 1 ? v16 : 0x40000000), 0, 0);
        if (!(v24 & 1))
        {
LABEL_9633e4:
            if (!a0->field_998 && a0->field_990)
            {
                v25 = a0;
                if ((int)sub_ad69e4(a0->field_990) >= 2)
                {
                    v26 = v25;
                    if ((int)sub_ad69e4(v25->field_520) < 1 || !v26->field_530 || (*(char *)v26->field_530 & 254) != 2)
                    {
                        v27 = sub_9f7178(v26->field_8->field_0, v26->field_8->field_470);
                        if (v27)
                        {
                            v28 = sub_ad69f8(v25->field_990, 1);
                            sub_9f7290(v27, v16);
                            sub_9f72c4(v27, v28);
                            sub_9f72f8(v27, v25->field_8->field_1d0);
                            sub_9f7300(v27, 1000 * sub_966d78(v25->field_900));
                            if (!(sub_9f7a8c(sub_9631b4(v25), v27) >> 31 & 1))
                                v25->field_b68();
                            sub_a368c8();
                            sub_a369bc("ssl/ssl_lib.c", 0x1a02, "ssl_validate_ct");
                            v30 = 40;
                            v31 = 208;
                            v32 = v25;
                        }
                        else
                        {
                            sub_a368c8();
                            sub_a369bc("ssl/ssl_lib.c", 0x19e5, "ssl_validate_ct");
                            v30 = 80;
                            v31 = 524338;
                            v32 = v25;
                        }
                        sub_9a58a4(v32, v30, v31, 0);
                        sub_9f7234(v27);
                        v25->field_998 = 71;
                        return 0;
                    }
                }
            }
        }
    }
    return 1;
}
