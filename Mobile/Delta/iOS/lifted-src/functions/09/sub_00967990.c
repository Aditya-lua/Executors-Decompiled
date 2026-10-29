/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x967990..0x967c3c (684 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_967990_0 {
    char padding_0[8];
    long long field_8;
} st_967990_0;

typedef struct st_967990_3 {
    uint128_t field_0;
    uint128_t field_10;
    char padding_20[1880];
    struct st_967990_0 *field_778;
} st_967990_3;

typedef struct st_967990_2 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    char padding_40[1880];
    struct st_967990_0 *field_798;
} st_967990_2;

typedef struct st_967990_1 {
    char padding_0[360];
    uint128_t field_168;
    uint128_t field_178;
    uint128_t field_188;
    uint128_t field_198;
    char padding_1a8[1880];
    struct st_967990_0 *field_900;
} st_967990_1;


void* sub_967990(st_967990_1 *a0, long long a1, long long a2, long long a3, long long n, void* a5, void* n1, void* a7)
{
    void* v3;  // x8
    long long v4;  // x26
    unsigned long v13;  // cc_dep1
    unsigned long v14;  // cc_dep2
    unsigned long v15;  // cc_ndep
    unsigned long v16;  // 4110
    unsigned long v17;  // cc_op
    unsigned long v18;  // cc_dep1
    unsigned long v19;  // cc_dep2
    unsigned long long v20;  // 4102
    unsigned long v21;  // 4110
    unsigned long long v22;  // 4102
    void* v5;  // x19
    unsigned long v23;  // 4110
    unsigned long v24;  // cc_op
    unsigned long v25;  // cc_dep1
    unsigned long v26;  // cc_dep2
    unsigned long long v27;  // 4102
    unsigned long v28;  // 4110
    unsigned long long v29;  // 4102
    unsigned long v30;  // 4110
    unsigned long v31;  // cc_op
    unsigned long v32;  // cc_dep1
    void* v6;  // x8
    unsigned long v33;  // cc_dep2
    unsigned long long v34;  // 4102
    unsigned long v35;  // 4110
    unsigned long long v36;  // 4102
    unsigned long v37;  // 4110
    unsigned long v38;  // cc_op
    unsigned long v39;  // cc_dep1
    unsigned long v40;  // cc_dep2
    unsigned long long v41;  // 4110
    unsigned long v42;  // 4110
    st_967990_3 *v7;  // x9
    unsigned long long v43;  // 4110
    unsigned long v44;  // 4110
    unsigned long v45;  // cc_op
    unsigned long v46;  // cc_dep1
    unsigned long v47;  // cc_dep2
    unsigned long long v48;  // 4102
    unsigned long v49;  // 4110
    unsigned long long v50;  // 4102
    unsigned long long v51;  // 4110
    unsigned long long v52;  // 4102
    uint128_t v8;  // q1
    unsigned long long v53;  // 4110
    unsigned long long v54;  // 4102
    void* v55;  // x20
    st_967990_2 *v9;  // x9
    uint128_t v10;  // q1
    unsigned long v12;  // cc_op
    long long v0;  // [bp-0x68]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (n1 >= 0x10000)
    {
        sub_a368c8();
        sub_a369bc("ssl/t1_enc.c", 447, "tls1_export_keying_material");
        sub_a36abc(20, 0x80106, 0);
        return 0;
    }
    v3 = n1 + 2;
    if (!a7)
        v3 = 0;
    v4 = n + v3;
    v5 = sub_a6bf4c();
    if (!v5)
    {
LABEL_967bfc:
        sub_a6c4e8(v5, v4 + 64, "ssl/t1_enc.c", 521);
        return 0;
    }
    _memcpy(v5, a3, n);
    v6 = v5 + n;
    v7 = (char *)&a0->field_178 + 8;
    v8 = v7->field_10;
    *(uint128_t *)v6 = v7->field_0;
    *(uint128_t *)&v6[16] = v8;
    v9 = (a0->padding_0)[1];
    v10 = v9->field_10;
    *(uint128_t *)&v6[32] = v9->field_0;
    *(uint128_t *)&v6[48] = v10;
    if (a7)
    {
        *(unsigned short *)&v6[64] = (((((n1 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | n1 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((n1 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | n1 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
        if (a5 || n1)
            _memcpy(v6 + 66, a5, n1);
    }
    if (*(long long *)v5 == 7359009808620022883)
    {
        v16 = arm64g_calculate_condition(v12, v13, v14, v15);
        v17 = 4;
        v18 = (v16 & 1 ? (long long)v5[7] : 0);
        v19 = (v16 & 1 ? 7234303221339941222 : 0);
        v20 = arm64g_calculate_condition(4, v18, v19, 0);
        if (!(v20 & 1))
            goto LABEL_967ac4;
    }
    else
    {
        v21 = arm64g_calculate_condition(v12, v13, v14, v15);
        v17 = 0;
        v18 = (v21 & 1 ? (long long)v5[7] : 0);
        v19 = (v21 & 1 ? 7234303221339941222 : 0);
        v22 = arm64g_calculate_condition(0, v18, v19, 0);
        if (!(v22 & 1))
        {
LABEL_967ac4:
            if (*(long long *)v5 == 7359007571227862387)
            {
                v23 = arm64g_calculate_condition(v17, v18, v19, 0);
                v24 = 4;
                v25 = (v23 & 1 ? (long long)v5[7] : 0);
                v26 = (v23 & 1 ? 7234303221339941222 : 0);
                v27 = arm64g_calculate_condition(4, v25, v26, 0);
                if (!(v27 & 1))
                    goto LABEL_967ae8;
            }
            else
            {
                v28 = arm64g_calculate_condition(v17, v18, v19, 0);
                v24 = 0;
                v25 = (v28 & 1 ? (long long)v5[7] : 0);
                v26 = (v28 & 1 ? 7234303221339941222 : 0);
                v29 = arm64g_calculate_condition(0, v25, v26, 0);
                if (!(v29 & 1))
                {
LABEL_967ae8:
                    if (*(long long *)v5 == 8295756293687435629)
                    {
                        v30 = arm64g_calculate_condition(v24, v25, v26, 0);
                        v31 = 4;
                        v32 = (v30 & 1 ? (long long)v5[5] : 0);
                        v33 = (v30 & 1 ? 8387235652276789362 : 0);
                        v34 = arm64g_calculate_condition(4, v32, v33, 0);
                        if (!(v34 & 1))
                            goto LABEL_967b1c;
                    }
                    else
                    {
                        v35 = arm64g_calculate_condition(v24, v25, v26, 0);
                        v31 = 0;
                        v32 = (v35 & 1 ? (long long)v5[5] : 0);
                        v33 = (v35 & 1 ? 8387235652276789362 : 0);
                        v36 = arm64g_calculate_condition(0, v32, v33, 0);
                        if (!(v36 & 1))
                        {
LABEL_967b1c:
                            if (*(long long *)v5 == 7234298801751881829)
                            {
                                v37 = arm64g_calculate_condition(v31, v32, v33, 0);
                                v38 = 4;
                                v39 = (v37 & 1 ? (long long)v5[8] : 0);
                                v40 = (v37 & 1 ? 2338042707385085216 : 0);
                                v41 = arm64g_calculate_condition(4, v39, v40, 0);
                                if (!(v41 & 1))
                                    goto LABEL_967b4e;
                                goto LABEL_967b4d;
                            }
                            else
                            {
                                v42 = arm64g_calculate_condition(v31, v32, v33, 0);
                                v38 = 0;
                                v39 = (v42 & 1 ? (long long)v5[8] : 0);
                                v40 = (v42 & 1 ? 2338042707385085216 : 0);
                                v43 = arm64g_calculate_condition(0, v39, v40, 0);
                                if (v43 & 1)
                                {
LABEL_967b4d:
                                    v44 = arm64g_calculate_condition(v38, v39, v40, 0);
                                    v45 = 4;
                                    v46 = (v44 & 1 ? (long long)v5[14] : 0);
                                    v47 = (v44 & 1 ? 8387235652276789362 : 0);
                                    v48 = arm64g_calculate_condition(4, v46, v47, 0);
                                    if (!(v48 & 1))
                                        goto LABEL_967b54;
                                }
                                else
                                {
LABEL_967b4e:
                                    v49 = arm64g_calculate_condition(v38, v39, v40, 0);
                                    v45 = 0;
                                    v46 = (v49 & 1 ? (long long)v5[14] : 0);
                                    v47 = (v49 & 1 ? 8387235652276789362 : 0);
                                    v50 = arm64g_calculate_condition(0, v46, v47, 0);
                                    if (!(v50 & 1))
                                    {
LABEL_967b54:
                                        if (*(long long *)v5 == 7021244194802460011)
                                        {
                                            v51 = arm64g_calculate_condition(v45, v46, v47, 0);
                                            v52 = arm64g_calculate_condition(4, (v51 & 1 ? (long long)v5[5] : 0), (v51 & 1 ? 7957695011080990840 : 0), 0);
                                            if (!(v52 & 1))
                                            {
                                                *(unsigned int *)&v0 = 0;
                                                v55 = sub_9674f0(a0, v5, v4 + 64, 0, 0, 0, 0, 0, 0, *(long long *)&a0->padding_1a8[1872] + 80, *(long long *)(*(long long *)&a0->padding_1a8[1872] + 8), a1, a2, v0);
                                                sub_a6c4e8(v5, v4 + 64, "ssl/t1_enc.c", 521);
                                                return v55;
                                            }
                                        }
                                        else
                                        {
                                            v53 = arm64g_calculate_condition(v45, v46, v47, 0);
                                            v54 = arm64g_calculate_condition(0, (v53 & 1 ? (long long)v5[5] : 0), (v53 & 1 ? 7957695011080990840 : 0), 0);
                                            if (!(v54 & 1))
                                            {
                                                *(unsigned int *)&v0 = 0;
                                                v55 = sub_9674f0(a0, v5, v4 + 64, 0, 0, 0, 0, 0, 0, *(long long *)&a0->padding_1a8[1872] + 80, *(long long *)(*(long long *)&a0->padding_1a8[1872] + 8), a1, a2, v0);
                                                sub_a6c4e8(v5, v4 + 64, "ssl/t1_enc.c", 521);
                                                return v55;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    sub_a368c8();
    sub_a369bc("ssl/t1_enc.c", 519, "tls1_export_keying_material");
    sub_a36abc(20, 367, 0);
    goto LABEL_967bfc;
}
