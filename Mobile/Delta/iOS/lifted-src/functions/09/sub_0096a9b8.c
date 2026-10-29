/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96a9b8..0x96af20 (1384 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_96a9b8_1 {
    unsigned int field_0;
    char padding_4[212];
    struct st_96a9b8_0 *field_d8;
} st_96a9b8_1;

typedef struct st_96a9b8_4 {
    char padding_0[8];
    struct st_96a9b8_5 *field_8;
    char padding_10[8];
    struct st_96a9b8_1 *field_18;
    char padding_20[2920];
    struct st_96a9b8_2 *field_b88;
} st_96a9b8_4;

typedef struct st_96a9b8_0 {
    char padding_0[80];
    char field_50;
} st_96a9b8_0;

typedef struct st_96a9b8_2 {
    char padding_0[576];
    unsigned long long field_240;
    unsigned long long field_248;
    long long field_250;
    struct st_96a9b8_3 *field_258;
    struct st_96a9b8_3 *field_260;
    char padding_268[456];
    struct st_96a9b8_3 *field_430;
} st_96a9b8_2;

typedef struct st_96a9b8_3 {
    char field_0;
} st_96a9b8_3;

typedef struct st_96a9b8_5 {
    long long field_0;
    char padding_8[1128];
    long long field_470;
} st_96a9b8_5;

extern char g_10002b0;

char sub_96a9b8(st_96a9b8_4 *a0, unsigned long long *a1, long long a2, long long a3, char n, char *a5)
{
    long long iter;  // x22
    st_96a9b8_2 *v9;  // x27
    unsigned long v16;  // cc_dep2
    unsigned long v17;  // cc_ndep
    unsigned long long v18;  // 4110
    unsigned long long v19;  // 4102
    unsigned long v20;  // cc_op
    unsigned long v21;  // cc_dep1
    unsigned long long v22;  // 4110
    unsigned long long v23;  // 4102
    long long *v10;  // x28
    char v24;  // x25
    unsigned int v25;  // w8
    unsigned long long v26;  // 4112
    unsigned long long v27;  // 4109
    unsigned long long v28;  // 4112
    unsigned long long v29;  // 4109
    char v11;  // x25
    char v30;  // x27
    unsigned long long v31;  // x0
    unsigned long v32;  // x26
    char v12;  // x0
    unsigned long v33;  // cc_op
    unsigned long v34;  // cc_dep1
    unsigned long v35;  // cc_dep2
    unsigned long v36;  // cc_ndep
    unsigned int v37;  // w10
    char v13;  // x23
    unsigned long long v38;  // 4112
    unsigned long long v39;  // 4102
    unsigned long long v40;  // 4112
    unsigned long long v41;  // 4102
    char v15;  // x24
    char v0;  // [bp-0xd0], Other Possible Types: unsigned int
    char v1;  // [bp-0xb8], Other Possible Types: unsigned int
    char node;  // [bp-0xb4], Other Possible Types: int, unsigned int
    unsigned long v3;  // [bp-0xb0]
    char v4;  // [bp-0xa8]
    unsigned long v5;  // [bp-0x68]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    iter = a2;
    v5 = *(long long *)&g_10002b0;
    if (a2)
    {
        v9 = a0->field_b88;
        v10 = &a0->field_8->field_0;
        if (!(a0->field_18->field_d8->field_50 >> 3 & 1) && (int)a0->field_18->field_0 >= 772 && a0->field_18->field_0 != 0x10000)
        {
            if (32 <= (unsigned long long)iter)
                goto LABEL_96aa4c;
            v11 = 4;
        }
        else
        {
            v11 = 4;
            if ((unsigned long long)iter >= 32 && !*(long long *)&a0->padding_20[2752])
            {
LABEL_96aa4c:
                v12 = sub_96af20(v9);
                if (v12)
                {
                    v13 = v12;
                    v15 = sub_a4bc70();
                    if (!v15)
                    {
                        v11 = 0;
                        v30 = 0;
                    }
                    else if (v9->field_260)
                    {
                        v9->field_260();
                    }
                    else if (v9->field_258)
                    {
                        sub_c4c40(v13);
                        v9->field_258();
                    }
                    else
                    {
                        if (*a1 == v9->field_240)
                        {
                            v18 = arm64g_calculate_condition(v20, v21, v16, v17);
                            v19 = arm64g_calculate_condition(20, (v18 & 1 ? a1[1] : 0), (v18 & 1 ? v9->field_248 : 0), 0);
                            if (!(v19 & 1))
                                goto LABEL_96ac84;
                            goto LABEL_96ad9c;
                        }
                        v22 = arm64g_calculate_condition(v20, v21, v16, v17);
                        v23 = arm64g_calculate_condition(16, (v22 & 1 ? a1[1] : 0), (v22 & 1 ? v9->field_248 : 0), 0);
                        if (v23 & 1)
                            goto LABEL_96ad9c;
LABEL_96ac84:
                        v24 = sub_a4e104(*v10, "AES-256-CBC", v10[142]);
                        if (!v24 || (int)sub_96afdc(v13, v9->field_250, 32, "SHA256") < 1 || (int)sub_a4d058(v15, v24, 0, v9->field_250 + 32, a1 + 2) <= 0)
                        {
                            sub_a4bbe4(v24);
                            goto LABEL_96adb0;
                        }
                        sub_a4bbe4(v24);
                        v11 = 5;
                        if (!(a0->field_18->field_d8->field_50 >> 3 & 1))
                        {
                            v25 = a0->field_18->field_0;
                            if (v25 != 0x10000)
                            {
                                v26 = arm64g_calculate_condition(v20 | 16, v21, v16, v17);
                                v27 = arm64g_calculate_condition(179, (v26 & 1 ? v25 : 0x80000000), (v26 & 1 ? 772 : 0), 0);
                                if (!(v27 & 1))
                                    goto LABEL_96ad12;
LABEL_96ad11:
                                v11 = 5;
                            }
                            else
                            {
                                v28 = arm64g_calculate_condition(v20 | 16, v21, v16, v17);
                                v29 = arm64g_calculate_condition(176, (v28 & 1 ? v25 : 0x80000000), (v28 & 1 ? 772 : 0), 0);
                                if (v29 & 1)
                                    goto LABEL_96ad11;
LABEL_96ad12:
                                v11 = 6;
                            }
                        }
                        if (*(long long *)v13)
                        {
                            v30 = sub_a58044(*(long long *)v13);
                            if (v30)
                                goto LABEL_96ad30;
                            goto LABEL_96adb4;
                        }
                        if (!*(long long *)(v13 + 8))
                            goto LABEL_96adb0;
                        v30 = sub_970740(v13);
                        if (!v30)
                            goto LABEL_96adb4;
LABEL_96ad30:
                        v31 = sub_a4fbf0(v15);
                        if (v31 >> 31 & 1)
                            goto LABEL_96adb0;
                        v32 = (unsigned int)v31 + 16;
                        if ((unsigned long long)iter <= v30 + v32)
                            goto LABEL_96ad9c;
                        v0 = v31;
                        iter -= v30;
                        if ((int)sub_96b0bc(v13, a1, iter) < 1 || (int)sub_96b0e0(v13, &v4, 0, 64) < 1)
                            goto LABEL_96adb0;
                        if (sub_a66f20(&v4, (char *)a1 + iter, v30))
                            goto LABEL_96ad9c;
                        v3 = (char *)a1 + v0 + 16;
                        iter -= v32;
                        v0 = sub_a6bf4c(iter, "ssl/t1_lib.c", 3185);
                        if (!v0 || (int)sub_a4c6b0(v15, v0, &node, v3, iter) <= 0)
                        {
                            sub_a6c2e4(v0, "ssl/t1_lib.c", 3187);
LABEL_96adb0:
                            v30 = 0;
LABEL_96adb4:
                            v11 = 1;
                            goto LABEL_96adb8;
                        }
                        if ((int)sub_a4d028(v15, v0 + node, &v1) > 0)
                        {
                            node += v1;
                            v3 = v0;
                            v30 = sub_957c58(0, &v3, node, *v10, v10[142]);
                            node += (unsigned int)(v3 - (unsigned int)v3);
                            sub_a6c2e4(v3, "ssl/t1_lib.c", 3201);
                            if (!v30)
                            {
                                sub_a35af4();
LABEL_96ada0:
                                v11 = 4;
                                goto LABEL_96adb8;
                            }
                            if (node)
                            {
                                sub_9662a0(v30);
                                goto LABEL_96ad9c;
                            }
                            else if (n)
                            {
                                _memcpy(v30 + 600, a3, n);
                                *(unsigned long long *)(v30 + 592) = n;
                            }
                        }
                        else
                        {
                            sub_a6c2e4(v0, "ssl/t1_lib.c", 3192);
LABEL_96ad9c:
                            v30 = 0;
                            goto LABEL_96ada0;
                        }
                    }
LABEL_96adb8:
                    sub_a4bca0(v15);
                    sub_a57f0c(*(long long *)v13);
                    sub_970698(v13);
                    sub_a6c2e4(v13, "ssl/t1_lib.c", 0x12cc);
                    goto LABEL_96aab0;
                }
                else
                {
                    v11 = 0;
                }
            }
        }
    }
    else
    {
        v11 = 3;
    }
    sub_a4bca0(0);
    v30 = 0;
LABEL_96aab0:
    v37 = v11 - 3;
    if (a0->field_b88->field_430)
    {
        v38 = arm64g_calculate_condition(v33 | 16, v34, v35, v36);
        v39 = arm64g_calculate_condition(131, (v38 & 1 ? v37 : 0x20000000), (v38 & 1 ? 3 : 0), 0);
        if (v39 & 1)
            goto LABEL_96ab58;
    }
    else
    {
        v40 = arm64g_calculate_condition(v33 | 16, v34, v35, v36);
        v41 = arm64g_calculate_condition(128, (v40 & 1 ? v37 : 0x20000000), (v40 & 1 ? 3 : 0), 0);
        if (v41 & 1)
        {
LABEL_96ab58:
            if ((!*(long long *)&a0->padding_20[2752] || !(a0->field_18->field_d8->field_50 >> 3 & 1) && (int)a0->field_18->field_0 >= 772 && a0->field_18->field_0 != 0x10000) && 6 >= v11 && 1 << (v11 & 31) & 88)
                *(unsigned int *)&a0->padding_20[2624] = 1;
            *(unsigned long long *)a5 = v30;
            if (*(long long *)&g_10002b0 == v5)
                return v11;
            ___stack_chk_fail();
        }
    }
    a0->field_b88->field_430();
}
