/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9afc38..0x9b00b8 (1152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9afc38_1 {
    char padding_0[8];
    struct st_9afc38_2 *field_8;
    char padding_10[8];
    void* field_18;
    char padding_20[2968];
    unsigned long long field_bb8;
} st_9afc38_1;

typedef struct st_9afc38_3 {
    void* field_0;
    char field_8;
} st_9afc38_3;

typedef struct st_9afc38_2 {
    long long field_0;
    char padding_8[1128];
    long long field_470;
} st_9afc38_2;


char sub_9afc38(st_9afc38_1 *a0, st_9afc38_3 *a1, unsigned long long a2)
{
    unsigned long long *v6;  // x20
    unsigned long v7;  // x8
    void* v16;  // x8
    char v17;  // x21
    char v18;  // x11
    long long v19;  // x1
    unsigned long long v20;  // x12
    unsigned long v21;  // x13
    char v22;  // x23
    void* v23;  // x25
    st_9afc38_3 *v24;  // x24
    unsigned long v8;  // x10
    char v26;  // x20
    void* v27;  // x8
    unsigned long v28;  // cc_op
    unsigned long v29;  // cc_dep1
    unsigned long v30;  // cc_dep2
    unsigned long v31;  // cc_ndep
    unsigned long long v32;  // 4110
    unsigned long long v33;  // 4102
    long long v9;  // x1
    unsigned long long v34;  // 4110
    unsigned long long v35;  // 4102
    long long v36;  // x1
    st_9afc38_1 *v10;  // x0
    st_9afc38_1 *v37;  // x0
    long long v38;  // x1
    long long v39;  // x2
    char v40;  // x8
    unsigned long v41;  // x8
    unsigned long long v42;  // x8
    char *v43;  // x9
    long long v11;  // x2
    char v12;  // x9
    char v13;  // x11
    void* v14;  // x10
    char v15;  // x22
    void* v0;  // [bp-0x70]
    char *v1;  // [bp-0x68]
    unsigned long long v2;  // [bp-0x60]
    char v3;  // [bp-0x58]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = 0;
    v6 = a0->field_8;
    if (!((char)(*(char *)((long long)a0->field_18[216] + 80)) >> 3 & 1) && *(int *)a0->field_18 >= 772 && *(int *)a0->field_18 != 0x10000)
    {
        if (!*(long long *)&a1->field_8 || (v7 = *(char *)a1->field_0, v8 = *(long long *)&a1->field_8 - 1, v7 > v8))
        {
            sub_a368c8();
            v9 = 1218;
        }
        else
        {
            a1->field_0 = a1->field_0 + 1 + v7;
            *(unsigned long *)&a1->field_8 = v8 - v7;
            if (!*(int *)&a0->padding_20[88])
            {
                if (!(unsigned int)v7)
                    goto LABEL_9afd70;
                sub_a368c8();
                v9 = 1235;
            }
            else if (*(long long *)&a0->padding_20[2960])
            {
                if (a0->field_bb8 == v7 && !(a1 = a1, a2 = a2, sub_a66f20()))
                    goto LABEL_9afd70;
                sub_a368c8();
                v9 = 1229;
            }
            else
            {
                if (!(unsigned int)v7)
                    goto LABEL_9afd70;
                sub_a368c8();
                v9 = 1224;
            }
        }
        sub_a369bc("ssl/statem/statem_lib.c", v9, "tls_process_rpk");
        v10 = a0;
        v11 = 282;
        goto LABEL_9afe24;
    }
    else
    {
LABEL_9afd70:
        v12 = *(long long *)&a1->field_8;
        v13 = v12 - 3;
        if (v12 >= 3)
        {
            v14 = a1->field_0;
            v15 = *(char *)v14 * 0x10000 | (char)v14[1] * 0x100 | (char)v14[2];
            v16 = v14 + 3;
            a1->field_0 = v16;
            *(unsigned long long *)&a1->field_8 = v13;
            if (v13 != v15)
                goto LABEL_9afdfc;
            if (!v15)
                return 1;
            if (!((char)(*(char *)((long long)a0->field_18[216] + 80)) >> 3 & 1) && *(int *)a0->field_18 >= 772)
            {
                v17 = v15;
                v18 = v15;
                if (*(int *)a0->field_18 != 0x10000)
                {
                    if (2 >= v15)
                    {
                        sub_a368c8();
                        v19 = 1264;
                        goto LABEL_9afe14;
                    }
                    v20 = (char)v14[3] * 0x10000 | (char)v14[4] * 0x100;
                    v21 = (char)v14[5];
                    v16 = v14 + 6;
                    v18 = v12 - 6;
                    a1->field_0 = v16;
                    *(unsigned long long *)&a1->field_8 = v18;
                    v17 = v20 | v21;
                    if (!v17)
                    {
                        sub_a368c8();
                        sub_a369bc("ssl/statem/statem_lib.c", 1269, "tls_process_rpk");
                        v10 = a0;
                        v11 = 349;
LABEL_9afe24:
                        sub_9a58a4(v10, 50, v11, 0);
                        sub_a6c2e4(v3, "ssl/statem/statem_lib.c", 1322);
                        sub_a5a4c8(0);
                        return 0;
                    }
                    if (v17 > v18)
                    {
                        sub_a368c8();
                        v19 = 1277;
LABEL_9afe14:
                        sub_a369bc("ssl/statem/statem_lib.c", v19, "tls_process_rpk");
                        v10 = a0;
                        v11 = 159;
                        goto LABEL_9afe24;
                    }
                }
            }
            else
            {
                v17 = v15;
                v18 = v15;
            }
            v22 = a2;
            v0 = v16;
            v23 = v16 + v17;
            a1->field_0 = v23;
            *(unsigned long long *)&a1->field_8 = v18 - v17;
            v24 = a1;
            v26 = sub_afb6e0(0, &v0, v17, *v6, v6[142]);
            v27 = v0;
            if (v26)
            {
                v32 = arm64g_calculate_condition(v28 | 16, v29, v30, v31);
                v33 = arm64g_calculate_condition(4, (v32 & 1 ? v27 : 0), (v32 & 1 ? v23 : 0), 0);
                if (v33 & 1)
                    goto LABEL_9afef0;
LABEL_9afebc:
                sub_a368c8();
                v36 = 1283;
                goto LABEL_9afed4;
            }
            else
            {
                v34 = arm64g_calculate_condition(v28 | 16, v29, v30, v31);
                v35 = arm64g_calculate_condition(0, (v34 & 1 ? v27 : 0), (v34 & 1 ? v23 : 0), 0);
                if (!(v35 & 1))
                    goto LABEL_9afebc;
LABEL_9afef0:
                if (sub_a5a164(v26))
                {
                    sub_a368c8();
                    sub_a369bc("ssl/statem/statem_lib.c", 1288, "tls_process_rpk");
                    v37 = a0;
                    v38 = 80;
                    v39 = 239;
                }
                else
                {
                    if ((char)(*(char *)((long long)a0->field_18[216] + 80)) >> 3 & 1 || *(int *)a0->field_18 < 772 || *(int *)a0->field_18 == 0x10000)
                    {
LABEL_9affd8:
                        if (!v22)
                        {
                            sub_a6c2e4(v3, "ssl/statem/statem_lib.c", 1322);
                            sub_a5a4c8(v26);
                            return 1;
                        }
                        *(unsigned long long *)v22 = v26;
                        sub_a6c2e4(v3, "ssl/statem/statem_lib.c", 1322);
                        sub_a5a4c8(0);
                        return 1;
                    }
                    v40 = *(long long *)&v24->field_8;
                    if (v40 == v15 - v17 - 3)
                    {
                        if (v40 >= 2 && !(v41 = *(short *)v24->field_0, v42 = (unsigned int)((v41 & 0xff00) >> 8) | (unsigned int)v41 * 0x100 & 0xff00ff00, v40 - 2 != v42))
                        {
                            v43 = v24->field_0 + 2;
                            v24->field_0 = &v43[v42];
                            *(unsigned long long *)&v24->field_8 = 0;
                            v1 = v43;
                            v2 = v42;
                            if (!sub_99a780(a0, &v1, 0x10000, &v3, 0, 1) || !sub_99b03c(a0, 0x10000, v3, 0, 0, 1))
                            {
                                sub_a6c2e4(v3, "ssl/statem/statem_lib.c", 1322);
                                sub_a5a4c8(v26);
                                return 0;
                            }
                            goto LABEL_9affd8;
                        }
                        else
                        {
                            sub_a368c8();
                            v36 = 1300;
                        }
LABEL_9afed4:
                        sub_a369bc("ssl/statem/statem_lib.c", v36, "tls_process_rpk");
                        v37 = a0;
                        v38 = 50;
                        v39 = 159;
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("ssl/statem/statem_lib.c", 1295, "tls_process_rpk");
                        v37 = a0;
                        v38 = 50;
                        v39 = 271;
                    }
                }
                sub_9a58a4(v37, v38, v39, 0);
                sub_a6c2e4(v3, "ssl/statem/statem_lib.c", 1322);
                sub_a5a4c8(v26);
                return 0;
            }
        }
        else
        {
LABEL_9afdfc:
            sub_a368c8();
            v19 = 1243;
            goto LABEL_9afe14;
        }
    }
}
