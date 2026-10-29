/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9aabf4..0x9ab144 (1360 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9aabf4_0 {
    void* field_0;
    unsigned long long field_8;
} st_9aabf4_0;

typedef struct st_9aabf4_1 {
    int field_0;
    char padding_4[212];
    void* field_d8;
} st_9aabf4_1;

typedef struct st_9aabf4_4 {
    char padding_0[8];
    struct st_9aabf4_5 *field_8;
    char padding_10[8];
    struct st_9aabf4_1 *field_18;
    char padding_20[1564];
    char field_63c;
    char padding_63d[707];
    struct st_9aabf4_2 *field_900;
    char padding_908[640];
    struct st_9aabf4_3 *field_b88;
} st_9aabf4_4;

typedef struct st_9aabf4_3 {
    char padding_0[80];
    char field_50;
} st_9aabf4_3;

typedef struct st_9aabf4_6 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[64];
    char field_50;
    char padding_51[511];
    unsigned long long field_250;
    char field_258;
    char padding_259[135];
    unsigned long long field_2e0;
    char padding_2e8[64];
    unsigned long long field_328;
    unsigned long long field_330;
    unsigned long long field_338;
    unsigned int field_340;
} st_9aabf4_6;

typedef struct st_9aabf4_2 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[64];
    char field_50;
    char padding_51[511];
    unsigned long long field_250;
    char field_258;
    char padding_259[135];
    unsigned long long field_2e0;
    char padding_2e8[64];
    unsigned long long field_328;
    unsigned long long field_330;
    unsigned long long field_338;
    unsigned long long field_340;
} st_9aabf4_2;

typedef struct st_9aabf4_5 {
    long long field_0;
    char padding_8[1128];
    long long field_470;
} st_9aabf4_5;


unsigned long long sub_9aabf4(st_9aabf4_4 *a0, st_9aabf4_0 *a1)
{
    unsigned long v7;  // x11
    unsigned long v8;  // x8
    unsigned long v17;  // x9
    void* v18;  // x8
    unsigned long long v19;  // x8
    unsigned long long v20;  // x8
    unsigned long v21;  // x10
    unsigned long v22;  // x22
    st_9aabf4_1 *v23;  // x9
    unsigned long v24;  // x11
    unsigned int v25;  // w10
    unsigned long v26;  // cc_dep1
    void* v9;  // x10
    unsigned long long v27;  // 4110
    unsigned long long v28;  // 4102
    unsigned long long v29;  // 4110
    unsigned long long v30;  // 4102
    st_9aabf4_0 *v31;  // x27
    st_9aabf4_6 *v32;  // x23
    unsigned long long v33;  // x0
    long long v34;  // x2
    unsigned long long v35;  // x0
    st_9aabf4_6 *v36;  // x28
    void* v10;  // x9
    unsigned long v37;  // x9
    long long v38;  // x1
    st_9aabf4_0 *v39;  // x25
    st_9aabf4_0 *v40;  // x8
    unsigned long v41;  // x9
    unsigned long long v42;  // x9
    void* v43;  // x10
    unsigned long long v44;  // x0
    unsigned long long v45;  // x22
    st_9aabf4_6 *v46;  // x9
    unsigned long v11;  // x25
    long long v47;  // x0
    unsigned long long v48;  // w0
    unsigned long v49;  // x23
    st_9aabf4_4 *v51;  // x0
    long long v52;  // x1
    void* v12;  // x9
    unsigned long long *v13;  // x24
    unsigned long long v14;  // x20
    unsigned long long v15;  // w26
    unsigned long long v16;  // x21
    long long v0;  // [bp-0x88]
    unsigned long long v1;  // [bp-0x80]
    void* v2;  // [bp-0x78]
    unsigned long long v3;  // [bp-0x70]
    unsigned long long v4;  // [bp-0x68]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = 0;
    v7 = a1->field_8;
    v8 = v7 - 4;
    if (v7 >= 4)
    {
        v9 = a1->field_0;
        v10 = v9;
        v11 = *(int *)v10;
        v12 = v10 + 4;
        v13 = a0->field_8;
        a1->field_0 = v12;
        a1->field_8 = v8;
        if (!((char)((char)a0->field_18->field_d8[80]) >> 3 & 1))
        {
            v14 = 0;
            v15 = 0;
            v16 = 0;
            if (a0->field_18->field_0 >= 772 && a0->field_18->field_0 != 0x10000)
            {
                if (v8 < 4 || (v17 = (int)v9[4], v18 = v9 + 8, a1->field_0 = v18, a1->field_8 = v7 - 8, v7 == 8 || (v16 = *(char *)v18, v19 = v7 - 9, v8 = v19 - v16, v19 < v16)))
                    goto LABEL_9aad30;
                v15 = (unsigned int)((((((v17 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v17 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v17 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v17 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32);
                v14 = v9 + 9;
                v12 = v14 + v16;
                a1->field_0 = v12;
                a1->field_8 = v8;
            }
        }
        else
        {
            v15 = 0;
            v14 = 0;
            v16 = 0;
        }
        v20 = v8 - 2;
        if (v8 >= 2)
        {
            v21 = *(short *)v12;
            v22 = (unsigned int)((v21 & 0xff00) >> 8) | (unsigned int)v21 * 0x100 & 0xff00ff00;
            a1->field_0 = v12 + 2;
            a1->field_8 = v20;
            v23 = a0->field_18;
            v24 = (int)v23->field_d8[80];
            if (!(v24 >> 3 & 1) && (v25 = v23->field_0, (int)v25 >= 772 && (v26 = v25, v25 != 0x10000)))
            {
                if ((unsigned int)v22)
                {
                    v27 = arm64g_calculate_condition(19, v26, 0x10000, 0);
                    v28 = arm64g_calculate_condition(36, (v27 & 1 ? v20 : 0), (v27 & 1 ? v22 : 0), 0);
                    if (v28 & 1)
                        goto LABEL_9aad14;
                }
                else
                {
                    v29 = arm64g_calculate_condition(19, v26, 0x10000, 0);
                    v30 = arm64g_calculate_condition(32, (v29 & 1 ? v20 : 0), (v29 & 1 ? v22 : 0), 0);
                    if (v30 & 1)
                        goto LABEL_9aad14;
                }
            }
            else
            {
                if (v20 == (v22 & 0xffffffff))
                {
                    if (!(unsigned int)v22)
                        return 3;
                    if (v24 >> 3 & 1)
                        goto LABEL_9aada0;
                    v25 = v23->field_0;
LABEL_9aad14:
                    if ((int)v25 >= 772 && v25 != 0x10000)
                    {
                        v31 = a1;
                        v32 = a0->field_900;
                        goto LABEL_9aadb0;
                    }
LABEL_9aada0:
                    v31 = a1;
                    v32 = a0->field_900;
                    if (!v32->field_250)
                        goto LABEL_9aae08;
LABEL_9aadb0:
                    v33 = sub_965e7c(v32, 0);
                    if (v33)
                    {
                        v32 = v33;
                        if (a0->field_b88->field_50 & 1 && ((char)((char)a0->field_18->field_d8[80]) >> 3 & 1 || a0->field_18->field_0 < 772 || a0->field_18->field_0 == 0x10000))
                            sub_966abc();
                        sub_9662a0(a0->field_900);
                        a0->field_900 = v32;
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("ssl/statem/statem_clnt.c", 2775, "tls_process_new_session_ticket");
                        v34 = 524308;
                        goto LABEL_9aaee4;
                    }
LABEL_9aae08:
                    v32->field_2e0 = sub_a7c2c0();
                    sub_965adc(a0->field_900);
                    sub_a6c2e4(a0->field_900->field_328, "ssl/statem/statem_clnt.c", 2796);
                    *(uint128_t *)&a0->field_900->field_328 = 0;
                    v35 = sub_a6bf4c(v22, "ssl/statem/statem_clnt.c", 2800);
                    v36 = a0->field_900;
                    v36->field_328 = v35;
                    if (v35)
                    {
                        v37 = v31->field_8;
                        if (v22 > v31->field_8)
                        {
                            sub_a368c8();
                            v38 = 2806;
                            goto LABEL_9aad48;
                        }
                        else
                        {
                            v1 = (((((v11 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v11 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v11 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v11 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                            v39 = v31;
                            _memcpy();
                            v39->field_0 = v39->field_0 + v22;
                            v39->field_8 = v37 - v22;
                            v36->field_338 = v1;
                            v36->field_340 = v15;
                            v36->field_330 = v22;
                            if (!((char)((char)a0->field_18->field_d8[80]) >> 3 & 1) && a0->field_18->field_0 >= 772 && a0->field_18->field_0 != 0x10000)
                            {
                                v40 = v39;
                                if (v39->field_8 >= 2 && !(v41 = *(short *)v40->field_0, v42 = (unsigned int)((v41 & 0xff00) >> 8) | (unsigned int)v41 * 0x100 & 0xff00ff00, v39->field_8 - 2 != v42))
                                {
                                    v43 = v40->field_0 + 2;
                                    v40->field_0 = v43 + v42;
                                    v40->field_8 = 0;
                                    v2 = v43;
                                    v3 = v42;
                                    if (sub_99a780(a0, &v2, 0x2000, &v4, 0, 1) && sub_99b03c(a0, 0x2000, v4, 0, 0, 1))
                                        goto LABEL_9aafbc;
                                }
                                else
                                {
                                    sub_a368c8();
                                    v38 = 0xb0b;
LABEL_9aad48:
                                    sub_a369bc("ssl/statem/statem_clnt.c", v38, "tls_process_new_session_ticket");
                                    v51 = a0;
                                    v52 = 50;
                                    v34 = 159;
                                    goto LABEL_9aad58;
                                }
                            }
                            else
                            {
LABEL_9aafbc:
                                v44 = sub_a40ca8(*v13, "SHA2-256", v13[142]);
                                if (v44)
                                {
                                    v45 = v44;
                                    if (!sub_a40abc(a0->field_900->field_328, v22, &a0->field_900->field_258, &v2, v45, 0))
                                    {
                                        sub_a368c8();
                                        sub_a369bc("ssl/statem/statem_clnt.c", 2866, "tls_process_new_session_ticket");
                                        sub_9a58a4(a0, 80, 0x80006, 0);
                                        sub_a3f52c(v45);
                                        sub_a6c2e4(v4, "ssl/statem/statem_clnt.c", 2910);
                                        return 0;
                                    }
                                    sub_a3f52c(v45);
                                    v46 = a0->field_900;
                                    v46->field_250 = (unsigned int)v2;
                                    *(unsigned int *)&v46->padding_259[87] = 0;
                                    if ((char)((char)a0->field_18->field_d8[80]) >> 3 & 1)
                                    {
                                        return 3;
                                    }
                                    else if (a0->field_18->field_0 < 772)
                                    {
                                        return 3;
                                    }
                                    else if (a0->field_18->field_0 == 0x10000)
                                    {
                                        return 3;
                                    }
                                    else
                                    {
                                        v47 = sub_95a6a8(a0);
                                        v48 = (unsigned int)sub_a50ac8(v47);
                                        if (v48 > 0)
                                        {
                                            v49 = v48;
                                            *(unsigned int *)&v0 = 1;
                                            if (sub_96ede8(a0, v47, &a0->field_63c, "resumption", 10, v14, v16, &a0->field_900->field_50, v49, v0))
                                            {
                                                a0->field_900->field_8 = v49;
                                                sub_a6c2e4(v4, "ssl/statem/statem_clnt.c", 2902);
                                                sub_962408(a0, 1);
                                                return 1;
                                            }
                                        }
                                        else
                                        {
                                            sub_c65568(a0);
                                        }
                                    }
                                }
                                else
                                {
                                    sub_9a5810(a0, 80);
                                }
                            }
                        }
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("ssl/statem/statem_clnt.c", 2802, "tls_process_new_session_ticket");
                        v34 = 524303;
LABEL_9aaee4:
                        v51 = a0;
                        v52 = 80;
LABEL_9aad58:
                        sub_9a58a4(v51, v52, v34, 0);
                    }
                    sub_a3f52c(0);
                    sub_a6c2e4(v4, "ssl/statem/statem_clnt.c", 2910);
                    return 0;
                }
            }
        }
    }
LABEL_9aad30:
    sub_a368c8();
    v38 = 2747;
    goto LABEL_9aad48;
}
