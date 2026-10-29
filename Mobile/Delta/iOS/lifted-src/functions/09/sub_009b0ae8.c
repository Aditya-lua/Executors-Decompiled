/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b0ae8..0x9b0df0 (776 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b0ae8_5 {
    char padding_0[24];
    struct st_9b0ae8_2 *field_18;
    char padding_20[88];
    unsigned int field_78;
    char padding_7c[124];
    struct st_9b0ae8_4 *field_f8;
    unsigned long long field_100;
    char field_108;
    char padding_109[487];
    char field_2f0;
    char padding_2f1[7];
    unsigned int field_2f8;
    char padding_2fc[508];
    struct st_9b0ae8_6 *field_4f8;
} st_9b0ae8_5;

typedef struct st_9b0ae8_4 {
    char padding_0[8];
    struct st_9b0ae8_3 *field_8;
} st_9b0ae8_4;

typedef struct st_9b0ae8_2 {
    int field_0;
    char padding_4[124];
    struct st_9b0ae8_1 *field_80;
    char padding_88[80];
    struct st_9b0ae8_0 *field_d8;
} st_9b0ae8_2;

typedef struct st_9b0ae8_3 {
    char field_0;
    char padding_1[5];
    unsigned long long field_6;
    char padding_e[16];
    unsigned long long field_1e;
} st_9b0ae8_3;

typedef struct st_9b0ae8_0 {
    char padding_0[24];
    struct st_9b0ae8_1 *field_18;
    char padding_20[48];
    char field_50;
} st_9b0ae8_0;

typedef struct st_9b0ae8_1 {
    unsigned long long field_0;
} st_9b0ae8_1;

typedef struct st_9b0ae8_6 {
    char field_0;
} st_9b0ae8_6;


unsigned long long sub_9b0ae8(st_9b0ae8_5 *a0, unsigned long a1)
{
    char v2;  // x8
    unsigned long long v3;  // x24
    unsigned long long v8;  // 4102
    unsigned long v9;  // cc_op
    unsigned long v10;  // cc_dep1
    unsigned long v11;  // cc_dep2
    unsigned long v12;  // cc_ndep
    unsigned long long v13;  // 4110
    unsigned long long v14;  // 4102
    unsigned long long v4;  // x23
    unsigned long v15;  // cc_dep1
    unsigned long long v16;  // 4107
    unsigned long long v17;  // 4107
    unsigned long long v18;  // x0
    unsigned long long v5;  // x26
    unsigned int v20;  // w8
    char v21;  // x8
    st_9b0ae8_4 *v22;  // x9
    unsigned long v23;  // cc_dep1
    st_9b0ae8_3 *v24;  // x10
    unsigned long v25;  // 4110
    unsigned long v26;  // cc_op
    unsigned long v27;  // cc_dep1
    unsigned long v28;  // cc_dep2
    unsigned long v29;  // 4110
    unsigned long long v30;  // 4119
    unsigned long v31;  // 4110
    unsigned long v32;  // cc_op
    unsigned long v33;  // cc_dep1
    unsigned long v34;  // cc_dep2
    unsigned long v35;  // 4110
    unsigned long long v36;  // 4119
    unsigned long long v37;  // 4110
    unsigned long long v38;  // 4102
    unsigned long long v39;  // 4110
    unsigned long long v40;  // 4102
    unsigned long long v7;  // 4110
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0->field_2f8 == 0x101)
    {
        *(long long *)a1 = *(long long *)&a0->field_108;
        return 1;
    }
    v2 = *(long long *)&a0->field_108;
    v3 = *(long long *)&a0->field_2f0 - v2;
    if (*(long long *)&a0->field_2f0 != v2)
    {
        if (v3 >= 0x4000)
            v3 = 0x4000;
        v4 = v3 + v2 + 4;
        v5 = a0->field_100 - (char *)a0->field_f8->field_8;
        if (sub_9ebee0())
        {
            v7 = arm64g_calculate_condition(v9 | 16, v10, v11, v12);
            v8 = arm64g_calculate_condition(132, (v7 & 1 ? v5 : 0x20000000), (v7 & 1 ? v4 : 0), 0);
            if (!(v8 & 1))
            {
                a0->field_100 = &(&a0->field_f8->field_8->field_0)[v5];
                a0->field_18->field_80();
            }
        }
        else
        {
            v13 = arm64g_calculate_condition(v9 | 16, v10, v11, v12);
            v14 = arm64g_calculate_condition(128, (v13 & 1 ? v5 : 0x20000000), (v13 & 1 ? v4 : 0), 0);
            if (!(v14 & 1))
            {
                a0->field_100 = &(&a0->field_f8->field_8->field_0)[v5];
                a0->field_18->field_80();
            }
        }
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_lib.c", 1703, "tls_get_message_body");
        sub_9a58a4(a0, 80, 0x80007, 0);
        return 0;
    }
    if (a0->field_f8->field_8->field_0 == 20)
    {
        v15 = a0->field_78;
        if (!a0->field_78)
        {
            v16 = arm64g_calculate_condition(3, v15, 0, 0);
            if (!(v16 & 1))
                goto LABEL_9b0c06;
LABEL_9b0c05:
        }
        else
        {
            v17 = arm64g_calculate_condition(3, v15, 0, 0);
            if (v17 & 1)
                goto LABEL_9b0c05;
LABEL_9b0c06:
        }
        a0->field_18->field_d8->field_18();
    }
    else if (sub_993e5c(&a0[2].padding_109[335]))
    {
        v18 = sub_9544f0(a0, a0->field_f8->field_8, *(long long *)&a0->field_108);
        if (!(unsigned int)v18)
        {
            *(unsigned long long *)a1 = 0;
            return v18;
        }
        if (!a0->field_4f8)
        {
            *(long long *)a1 = *(long long *)&a0->field_108;
            return 1;
        }
        a0->field_4f8();
    }
    else
    {
        if (!(a0->field_18->field_d8->field_50 >> 3 & 1) && a0->field_18->field_0 >= 772 && a0->field_18->field_0 != 0x10000)
        {
            v20 = a0->field_2f8;
            if (v20 != 4 && v20 != 24)
                goto LABEL_9b0d1c;
        }
        else
        {
            v20 = a0->field_2f8;
LABEL_9b0d1c:
            if (v20 == 2)
            {
                v21 = *(long long *)&a0->field_108;
                v22 = a0->field_f8;
                v23 = v21;
                if (v21 >= 38)
                {
                    v24 = v22->field_8;
                    if (*(long long *)(v24->padding_1)[1] == 1252452481681400271)
                    {
                        v25 = arm64g_calculate_condition(4, v23, 38, 0);
                        v26 = 4;
                        v27 = (v25 & 1 ? *(long long *)((char *)&v24->field_6 + 6) : 0);
                        v28 = (v25 & 1 ? 10500253710780472766 : 0);
                    }
                    else
                    {
                        v29 = arm64g_calculate_condition(4, v23, 38, 0);
                        v26 = 0;
                        v27 = (v29 & 1 ? *(long long *)((char *)&v24->field_6 + 6) : 0);
                        v28 = (v29 & 1 ? 10500253710780472766 : 0);
                    }
                    v30 = arm64g_calculate_condition(v26, v27, v28, 0);
                    if (v30 & 1)
                    {
                        v31 = arm64g_calculate_condition(v26, v27, v28, 0);
                        v32 = 4;
                        v33 = (v31 & 1 ? *(long long *)&v24->padding_e[6] : 0);
                        v34 = (v31 & 1 ? 6813026469335376578 : 0);
                    }
                    else
                    {
                        v35 = arm64g_calculate_condition(v26, v27, v28, 0);
                        v32 = 0;
                        v33 = (v35 & 1 ? *(long long *)&v24->padding_e[6] : 0);
                        v34 = (v35 & 1 ? 6813026469335376578 : 0);
                    }
                    v36 = arm64g_calculate_condition(v32, v33, v34, 0);
                    if (v36 & 1)
                    {
                        v37 = arm64g_calculate_condition(v32, v33, v34, 0);
                        v38 = arm64g_calculate_condition(20, (v37 & 1 ? *(long long *)&v24->padding_e[14] : 0), (v37 & 1 ? 11255525474468208135 : 0), 0);
                        if (!(v38 & 1))
                            goto LABEL_9b0dbc;
                    }
                    else
                    {
                        v39 = arm64g_calculate_condition(v32, v33, v34, 0);
                        v40 = arm64g_calculate_condition(16, (v39 & 1 ? *(long long *)&v24->padding_e[14] : 0), (v39 & 1 ? 11255525474468208135 : 0), 0);
                        if (!(v40 & 1))
                            goto LABEL_9b0dbc;
                    }
                }
            }
            else
            {
                v22 = a0->field_f8;
                v21 = *(long long *)&a0->field_108;
            }
            v18 = sub_9544f0(a0, v22->field_8, v21 + 4);
            if (!(unsigned int)v18)
            {
                *(unsigned long long *)a1 = 0;
                return v18;
            }
        }
LABEL_9b0dbc:
        if (!a0->field_4f8)
        {
            *(long long *)a1 = *(long long *)&a0->field_108;
            return 1;
        }
        a0->field_4f8();
    }
}
