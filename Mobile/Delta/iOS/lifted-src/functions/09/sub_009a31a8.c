/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a31a8..0x9a32dc (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a31a8_4 {
    char padding_0[8];
    unsigned long long field_8;
} st_9a31a8_4;

typedef struct st_9a31a8_0 {
    char *field_0;
    unsigned long long field_8;
} st_9a31a8_0;

typedef struct st_9a31a8_2 {
    int field_0;
    char padding_4[212];
    struct st_9a31a8_1 *field_d8;
} st_9a31a8_2;

typedef struct st_9a31a8_3 {
    char padding_0[24];
    struct st_9a31a8_2 *field_18;
    char padding_20[2680];
    char field_a98;
    char padding_a99[7];
    long long field_aa0;
} st_9a31a8_3;

typedef struct st_9a31a8_1 {
    char padding_0[80];
    char field_50;
} st_9a31a8_1;


char sub_9a31a8(st_9a31a8_3 *a0, st_9a31a8_0 *a1)
{
    unsigned long v4;  // x11
    char *v5;  // x10
    unsigned long long v14;  // 4110
    unsigned long long v15;  // 4102
    st_9a31a8_4 *v16;  // x2
    unsigned long v6;  // x8
    unsigned long v7;  // x9
    unsigned long v8;  // cc_dep1
    unsigned long v9;  // cc_dep2
    unsigned long v10;  // x10
    unsigned long long v11;  // x8
    unsigned long long v12;  // 4110
    unsigned long long v13;  // 4102
    unsigned long v0;  // [bp-0x30]
    char v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a1->field_8 - 2;
    if (a1->field_8 >= 2)
    {
        v5 = a1->field_0;
        v6 = v5[1];
        v7 = v6 | *v5 * 0x100;
        v8 = v4;
        v9 = v7;
        if (v4 == v7)
        {
            v10 = v5 + 2;
            a1->field_0 = v10 + v7;
            a1->field_8 = 0;
            v0 = v10;
            v1 = v7;
            v11 = v6 & 1;
            if (v1)
            {
                v12 = arm64g_calculate_condition(20, v8, v9, 0);
                v13 = arm64g_calculate_condition(4, (v12 & 1 ? v11 : 0), 0, 0);
                if (v13 & 1)
                    goto LABEL_9a3244;
            }
            else
            {
                v14 = arm64g_calculate_condition(20, v8, v9, 0);
                v15 = arm64g_calculate_condition(0, (v14 & 1 ? v11 : 0), 0, 0);
                if (v15 & 1)
                {
LABEL_9a3244:
                    if (*(int *)&a0->padding_20[1256])
                    {
                        if (a0->field_18->field_d8->field_50 >> 3 & 1)
                        {
                            return 1;
                        }
                        else if (a0->field_18->field_0 < 772)
                        {
                            return 1;
                        }
                        else if (a0->field_18->field_0 == 0x10000)
                        {
                            return 1;
                        }
                    }
                    sub_a6c2e4(a0->field_aa0, "ssl/statem/extensions_srvr.c", 1231);
                    v16 = &a0->field_a98;
                    *(uint128_t *)v16 = 0;
                    if (!sub_96b4b0(&v0, &a0->field_aa0, v16))
                    {
                        sub_a368c8();
                        sub_a369bc("ssl/statem/extensions_srvr.c", 1237, "tls_parse_ctos_supported_groups");
                        sub_9a58a4(a0, 80, 0xc0103, 0);
                        return 0;
                    }
                    return 1;
                }
            }
        }
    }
    sub_a368c8();
    sub_a369bc("ssl/statem/extensions_srvr.c", 1226, "tls_parse_ctos_supported_groups");
    sub_9a58a4(a0, 50, 110, 0);
    return 0;
}
