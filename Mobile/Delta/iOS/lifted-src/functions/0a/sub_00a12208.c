/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa12208..0xa12574 (876 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a12208_0 {
    char padding_0[264];
    struct st_a12208_1 *field_108;
} st_a12208_0;

typedef struct st_a12208_1 {
    unsigned long long field_0;
} st_a12208_1;


long long sub_a12208(st_a12208_0 **a0, long long a1, char *a2, long long a3, long long a4)
{
    unsigned int v4;  // w8
    unsigned int v5;  // w9
    unsigned long long v10;  // 4102
    unsigned long v11;  // cc_op
    unsigned long v12;  // cc_dep1
    unsigned long v13;  // cc_dep2
    unsigned long v14;  // cc_ndep
    unsigned long v15;  // 4112
    unsigned long long v16;  // 4102
    unsigned long long v17;  // x21
    long long v18;  // w19
    unsigned long v19;  // 4112
    unsigned long v20;  // cc_op
    unsigned long v21;  // cc_dep1
    unsigned long v22;  // cc_dep2
    unsigned long long v23;  // 4140
    unsigned int v24;  // w8
    unsigned long v25;  // 4112
    unsigned long long v26;  // 4140
    unsigned long long v27;  // 4112
    unsigned long long v28;  // 4102
    unsigned long long v29;  // 4112
    unsigned long long v30;  // 4102
    long long v31;  // x24
    unsigned int v32;  // w0
    unsigned long long v33;  // 4209
    unsigned long v34;  // x8
    unsigned long long v35;  // x26
    unsigned int v36;  // w20
    long long v37;  // x8
    long long v38;  // x27
    long long v39;  // x24
    long long v40;  // x25
    unsigned long v41;  // x28
    long long v42;  // x1
    long long v44;  // x1
    unsigned long v6;  // 4112
    unsigned long v7;  // cc_op
    unsigned long v8;  // cc_dep1
    unsigned long v9;  // cc_dep2
    long long v0;  // [bp-0x70]
    long long v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (!a3)
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec2_oct.c", 268, "ossl_ec_GF2m_simple_oct2point");
        sub_a36abc(16, 100, 0);
        return 0;
    }
    v4 = *a2;
    v5 = v4 & 252;
    if (4 <= v4)
    {
        v6 = arm64g_calculate_condition(v11 | 32, v12, v13, v14);
        v7 = 3;
        v8 = (v6 & 1 ? v5 : 0x40000000);
        v9 = (v6 & 1 ? 4 : 0);
        v10 = arm64g_calculate_condition(19, v8, v9, 0);
        if (v10 & 1)
            goto LABEL_a122e4;
LABEL_a12240:
        v17 = v4 & 1;
        v18 = v4 & 254;
        if (v18)
        {
            v19 = arm64g_calculate_condition(v7 | 16, v8, v9, 0);
            v20 = 3;
            v21 = (v19 & 1 ? v18 : 0x40000000);
            v22 = (v19 & 1 ? 4 : 0);
            v23 = arm64g_calculate_condition(19, v21, v22, 0);
            v24 = !(v23 & 1);
            if (!(unsigned int)v17)
                goto LABEL_a1225a;
LABEL_a12259:
            v27 = arm64g_calculate_condition(v20 | 16, v21, v22, 0);
            v28 = arm64g_calculate_condition(19, (v27 & 1 ? v24 : 0x40000000), 0, 0);
            if (v28 & 1)
                goto LABEL_a12300;
            goto LABEL_a12260;
        }
        else
        {
            v25 = arm64g_calculate_condition(v7 | 16, v8, v9, 0);
            v20 = 0;
            v21 = (v25 & 1 ? v18 : 0x40000000);
            v22 = (v25 & 1 ? 4 : 0);
            v26 = arm64g_calculate_condition(16, v21, v22, 0);
            v24 = !(v26 & 1);
            if ((unsigned int)v17)
                goto LABEL_a12259;
LABEL_a1225a:
            v29 = arm64g_calculate_condition(v20 | 16, v21, v22, 0);
            v30 = arm64g_calculate_condition(16, (v29 & 1 ? v24 : 0x40000000), 0, 0);
            if (!(v30 & 1))
            {
LABEL_a12260:
                if (v18)
                {
                    v31 = a4;
                    v32 = sub_a1ad1c();
                    v33 = arm64g_calculate_condition(177, v32, 7, 0);
                    v34 = (v33 & 1 ? v32 + 14 : v32 + 7);
                    v35 = (long long)(v34 * 0x100000000) >> 63 & 0xffffffffe0000000 | __ROL__(v34, 61) & 0xe00000001fffffff & 0x1fffffff;
                    if ((v18 == 2 ? v35 + 1 : ((long long)(((int)((unsigned int)v34) >> 3) * 0x100000000) >> 63 & 0xfffffffe00000000 | __ROL__((int)((unsigned int)v34) >> 3, 1) & 0x1fffffffe & 0x1ffffffff) + 1) == a3)
                    {
                        v36 = v32;
                        if (v31)
                        {
                            v37 = 0;
                        }
                        else
                        {
                            v37 = sub_9dde10();
                            v31 = v37;
                            if (!v31)
                                return v37;
                        }
                        v0 = v37;
                        v38 = v31;
                        sub_9de064(v31);
                        v39 = sub_9de208(v38);
                        v40 = sub_9de208(v38);
                        v1 = v38;
                        if (sub_9de208(v38) && (v41 = a2 + 1, sub_9e4db0(v41, v35, v39)))
                        {
                            if ((int)sub_9e46a8(v39) > (int)v36)
                            {
                                sub_a368c8();
                                v42 = 334;
                                goto LABEL_a12434;
                            }
                            if (v18 == 2)
                            {
                                if (sub_a1d928(a0, a1, v39, v17, v1))
                                {
                                    sub_9de17c(v1);
                                    sub_9dded4(v0);
                                    return 1;
                                }
                            }
                            else
                            {
                                if (sub_9e4db0(v41 + v35, v35, v40))
                                {
                                    if ((int)sub_9e46a8(v40) > (int)v36)
                                    {
                                        sub_a368c8();
                                        v42 = 345;
                                        goto LABEL_a12434;
                                    }
                                    else
                                    {
                                        if (v18 == 6)
                                        {
                                            if (!sub_9e4828(v39))
                                                *a0->field_108();
                                            if (!(unsigned int)v17)
                                                goto LABEL_a12538;
                                            sub_a368c8();
                                            v42 = 356;
LABEL_a12434:
                                            sub_a369bc("crypto/ec/ec2_oct.c", v42, "ossl_ec_GF2m_simple_oct2point");
                                            sub_a36abc(16, 0x66, 0);
                                        }
                                        else
                                        {
LABEL_a12538:
                                            if (sub_a1b250(a0, a1, v39, v40, v1))
                                            {
                                                sub_9de17c(v1);
                                                sub_9dded4(v0);
                                                return 1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        sub_9de17c(v1);
                        sub_9dded4(v0);
                        return 0;
                    }
                    sub_a368c8();
                    v44 = 312;
                }
                else if (a3 != 1)
                {
                    sub_a368c8();
                    v44 = 300;
                }
            }
            else
            {
LABEL_a12300:
                sub_a368c8();
                v44 = 293;
            }
        }
    }
    else
    {
        v15 = arm64g_calculate_condition(v11 | 32, v12, v13, v14);
        v7 = 0;
        v8 = (v15 & 1 ? v5 : 0x40000000);
        v9 = (v15 & 1 ? 4 : 0);
        v16 = arm64g_calculate_condition(16, v8, v9, 0);
        if (!(v16 & 1))
            goto LABEL_a12240;
LABEL_a122e4:
        sub_a368c8();
        v44 = 289;
    }
    sub_a369bc("crypto/ec/ec2_oct.c", v44, "ossl_ec_GF2m_simple_oct2point");
    sub_a36abc(16, 0x66, 0);
    return 0;
}
