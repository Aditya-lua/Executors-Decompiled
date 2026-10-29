/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa250e8..0xa25400 (792 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a250e8(long long *a0, long long a1, char *a2, unsigned long a3, unsigned long long a4)
{
    unsigned int v2;  // w8
    unsigned int v3;  // w9
    unsigned long long v8;  // 4102
    unsigned long v9;  // cc_op
    unsigned long v10;  // cc_dep1
    unsigned long v11;  // cc_dep2
    unsigned long v12;  // cc_ndep
    unsigned long v13;  // 4112
    unsigned long long v14;  // 4102
    unsigned long long v15;  // x21
    unsigned long long v16;  // w28
    unsigned long v17;  // 4112
    unsigned long v18;  // cc_op
    unsigned long v19;  // cc_dep1
    unsigned long v20;  // cc_dep2
    unsigned long long v21;  // 4140
    unsigned int v22;  // w8
    unsigned long v23;  // 4112
    unsigned long long v24;  // 4140
    unsigned long long v25;  // 4112
    unsigned long long v26;  // 4102
    unsigned long long v27;  // 4112
    unsigned long long v28;  // 4102
    unsigned long long v29;  // x26
    unsigned int v30;  // w0
    unsigned long long v31;  // 4209
    unsigned long v32;  // x8
    unsigned long long v33;  // x24
    unsigned long long v34;  // x19
    long long v35;  // x25
    unsigned long long v36;  // x20
    unsigned long long v37;  // x0
    unsigned long long v38;  // x26
    unsigned long v39;  // x27
    long long v40;  // x1
    unsigned long long v41;  // x21
    long long v42;  // x1
    unsigned long v4;  // 4112
    unsigned long v5;  // cc_op
    unsigned long v6;  // cc_dep1
    unsigned long v7;  // cc_dep2
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a3)
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ecp_oct.c", 285, "ossl_ec_GFp_simple_oct2point");
        sub_a36abc(16, 100, 0);
        return 0;
    }
    v2 = *a2;
    v3 = v2 & 252;
    if (4 <= v2)
    {
        v4 = arm64g_calculate_condition(v9 | 32, v10, v11, v12);
        v5 = 3;
        v6 = (v4 & 1 ? v3 : 0x40000000);
        v7 = (v4 & 1 ? 4 : 0);
        v8 = arm64g_calculate_condition(19, v6, v7, 0);
        if (v8 & 1)
            goto LABEL_a251bc;
LABEL_a2511c:
        v15 = v2 & 1;
        v16 = v2 & 254;
        if (v16)
        {
            v17 = arm64g_calculate_condition(v5 | 16, v6, v7, 0);
            v18 = 3;
            v19 = (v17 & 1 ? v16 : 0x40000000);
            v20 = (v17 & 1 ? 4 : 0);
            v21 = arm64g_calculate_condition(19, v19, v20, 0);
            v22 = !(v21 & 1);
            if (!(unsigned int)v15)
                goto LABEL_a25136;
LABEL_a25135:
            v25 = arm64g_calculate_condition(v18 | 16, v19, v20, 0);
            v26 = arm64g_calculate_condition(19, (v25 & 1 ? v22 : 0x40000000), 0, 0);
            if (v26 & 1)
                goto LABEL_a251d8;
            goto LABEL_a2513c;
        }
        else
        {
            v23 = arm64g_calculate_condition(v5 | 16, v6, v7, 0);
            v18 = 0;
            v19 = (v23 & 1 ? v16 : 0x40000000);
            v20 = (v23 & 1 ? 4 : 0);
            v24 = arm64g_calculate_condition(16, v19, v20, 0);
            v22 = !(v24 & 1);
            if ((unsigned int)v15)
                goto LABEL_a25135;
LABEL_a25136:
            v27 = arm64g_calculate_condition(v18 | 16, v19, v20, 0);
            v28 = arm64g_calculate_condition(16, (v27 & 1 ? v22 : 0x40000000), 0, 0);
            if (!(v28 & 1))
            {
LABEL_a2513c:
                if (v16)
                {
                    v29 = a4;
                    v30 = sub_9e46a8(a0[8]);
                    v31 = arm64g_calculate_condition(177, v30, 7, 0);
                    v32 = (v31 & 1 ? v30 + 14 : v30 + 7);
                    v33 = (long long)(v32 * 0x100000000) >> 63 & 0xffffffffe0000000 | __ROL__(v32, 61) & 0xe00000001fffffff & 0x1fffffff;
                    if ((v16 == 2 ? v33 + 1 : ((long long)(((int)((unsigned int)v32) >> 3) * 0x100000000) >> 63 & 0xfffffffe00000000 | __ROL__((int)((unsigned int)v32) >> 3, 1) & 0x1fffffffe & 0x1ffffffff) + 1) == a3)
                    {
                        if (v29)
                        {
                            v34 = 0;
                        }
                        else
                        {
                            v34 = sub_9dddcc(a0[21]);
                            v29 = v34;
                            if (!v29)
                                return v34;
                        }
                        sub_9de064(v29);
                        v35 = sub_9de208(v29);
                        v36 = v29;
                        v37 = sub_9de208(v29);
                        if (v37 && !(v38 = v37, v39 = a2 + 1, !sub_9e4db0(v39, v33, v35)))
                        {
                            if (!(sub_9e53a8(v35, a0[8]) >> 31 & 1))
                            {
                                sub_a368c8();
                                v40 = 334;
                                goto LABEL_a252fc;
                            }
                            if (v16 == 2)
                            {
                                if (!sub_a1d928(a0, a1, v35, v15, v36))
                                    goto LABEL_a25310;
LABEL_a25350:
                                v41 = 1;
                            }
                            else
                            {
                                if (sub_9e4db0(v39 + v33, v33, v38))
                                {
                                    if (!(sub_9e53a8(v38, a0[8]) >> 31 & 1))
                                    {
                                        sub_a368c8();
                                        v40 = 345;
                                        goto LABEL_a252fc;
                                    }
                                    else
                                    {
                                        if (v16 != 6 || (unsigned int)v15 == sub_9e5c70(v38))
                                        {
                                            if (sub_a1b250(a0, a1, v35, v38, v36))
                                                goto LABEL_a25350;
                                            goto LABEL_a25310;
                                        }
                                        else
                                        {
                                            sub_a368c8();
                                            v40 = 350;
LABEL_a252fc:
                                            sub_a369bc("crypto/ec/ecp_oct.c", v40, "ossl_ec_GFp_simple_oct2point");
                                            sub_a36abc(16, 0x66, 0);
                                        }
                                    }
                                }
                                goto LABEL_a25310;
                            }
                        }
                        else
                        {
LABEL_a25310:
                            v41 = 0;
                        }
                        sub_9de17c(v36);
                        sub_9dded4(v34);
                        return v41;
                    }
                    sub_a368c8();
                    v42 = 315;
                }
                else if (a3 != 1)
                {
                    sub_a368c8();
                    v42 = 304;
                }
            }
            else
            {
LABEL_a251d8:
                sub_a368c8();
                v42 = 298;
            }
        }
    }
    else
    {
        v13 = arm64g_calculate_condition(v9 | 32, v10, v11, v12);
        v5 = 0;
        v6 = (v13 & 1 ? v3 : 0x40000000);
        v7 = (v13 & 1 ? 4 : 0);
        v14 = arm64g_calculate_condition(16, v6, v7, 0);
        if (!(v14 & 1))
            goto LABEL_a2511c;
LABEL_a251bc:
        sub_a368c8();
        v42 = 294;
    }
    sub_a369bc("crypto/ec/ecp_oct.c", v42, "ossl_ec_GFp_simple_oct2point");
    sub_a36abc(16, 0x66, 0);
    return 0;
}
