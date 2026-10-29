/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99d184..0x99d2dc (344 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99d184_1 {
    unsigned int field_0;
    char padding_4[212];
    struct st_99d184_0 *field_d8;
} st_99d184_1;

typedef struct st_99d184_2 {
    char padding_0[24];
    struct st_99d184_1 *field_18;
    char padding_20[40];
    unsigned int field_48;
    char padding_4c[2440];
    unsigned int field_9d4;
} st_99d184_2;

typedef struct st_99d184_0 {
    char padding_0[80];
    char field_50;
} st_99d184_0;


long long sub_99d184(st_99d184_2 *a0, long long a1)
{
    st_99d184_1 *v3;  // x8
    unsigned int v4;  // w9
    unsigned long v7;  // cc_dep2
    unsigned long v8;  // cc_ndep
    unsigned long long v9;  // 4112
    unsigned long long v10;  // 4102
    unsigned long v11;  // cc_op
    unsigned long v12;  // cc_dep1
    unsigned long v13;  // cc_dep1
    unsigned int v14;  // w8
    unsigned long long v15;  // 4112
    unsigned long long v16;  // 4102
    unsigned long long v17;  // 4112
    unsigned long long v18;  // 4102
    long long v19;  // x0
    unsigned long long v5;  // 4112
    unsigned long long v6;  // 4102
    long long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a0->field_18;
    v4 = a0->field_9d4;
    if (!(v3->field_d8->field_50 >> 3 & 1))
    {
        if ((int)v4 >= 0x303 && (v3->field_0 == 0x10000 || (int)a0->field_48 >= 0x303))
            goto LABEL_99d210;
    }
    else
    {
        if (v4 != 0x100)
        {
            v5 = arm64g_calculate_condition(v11 | 16, v12, v7, v8);
            v6 = arm64g_calculate_condition(211, (v5 & 1 ? v4 : 0), (v5 & 1 ? 65277 : 0), 0);
            if (v6 & 1)
                goto LABEL_99d1ec;
        }
        else
        {
            v9 = arm64g_calculate_condition(v11 | 16, v12, v7, v8);
            v10 = arm64g_calculate_condition(208, (v9 & 1 ? v4 : 0), (v9 & 1 ? 65277 : 0), 0);
            if (v10 & 1)
            {
LABEL_99d1ec:
                v13 = v3->field_0;
                if (v3->field_0 != 0x1ffff)
                {
                    v14 = a0->field_48;
                    if (v14 != 0x100)
                    {
                        v15 = arm64g_calculate_condition(19, v13, 0x1ffff, 0);
                        v16 = arm64g_calculate_condition(195, (v15 & 1 ? v14 : 0), (v15 & 1 ? 65277 : 0), 0);
                        if (!(v16 & 1))
                            goto LABEL_99d210;
                    }
                    else
                    {
                        v17 = arm64g_calculate_condition(19, v13, 0x1ffff, 0);
                        v18 = arm64g_calculate_condition(192, (v17 & 1 ? v14 : 0), (v17 & 1 ? 65277 : 0), 0);
                        if (!(v18 & 1))
                            goto LABEL_99d210;
                    }
                }
                else
                {
LABEL_99d210:
                    v19 = sub_9696b0();
                    if (sub_c68d5c(a1, 13, 2) && sub_c6876c(a1, 2) && sub_c6876c(a1, 2) && sub_96b360(a0, a1, v0, v19) && sub_a6e970(a1) && sub_a6e970(a1))
                        return 1;
                    sub_a368c8();
                    sub_a369bc("ssl/statem/extensions_clnt.c", 356, "tls_construct_ctos_sig_algs");
                    sub_9a58a4(a0, 80, 0xc0103, 0);
                    return 0;
                }
            }
        }
    }
    return 2;
}
