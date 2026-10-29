/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab8274..0xab8788 (1300 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab8274_0 {
    char padding_0[40];
    long long field_28;
} st_ab8274_0;

extern long long g_df6e68;
extern char g_10002b0;

unsigned long long sub_ab8274(st_ab8274_0 *a0, long long a1, long long a2, unsigned long long a3, void* a4, unsigned int *a5)
{
    void* v12;  // x25
    unsigned long v13;  // x28
    unsigned long v22;  // cc_dep1
    unsigned long v23;  // x23
    unsigned long long v24;  // w13
    unsigned long long v25;  // 4106
    unsigned long long v26;  // 4106
    void* v27;  // x11
    unsigned long long v28;  // x8
    long long v29;  // x1
    unsigned long v30;  // x12
    unsigned long long v31;  // 4131
    unsigned long long v14;  // x19
    unsigned long v32;  // x12
    unsigned long long v33;  // x28
    unsigned long long v34;  // x0
    unsigned long v35;  // cc_op
    unsigned long v36;  // cc_dep1
    unsigned long v37;  // cc_dep2
    void* v38;  // x10
    unsigned long long v39;  // x11
    uint128_t *node;  // x12
    uint128_t *iter;  // x13
    unsigned long v15;  // x0
    unsigned long long i;  // x14
    unsigned long long v43;  // x14
    uint128_t v44;  // q1
    uint128_t v45;  // q3
    unsigned long long v47;  // x14
    void* v48;  // x12
    void* iter1;  // x13
    unsigned long long v50;  // x14
    void* v51;  // x12
    unsigned long long v16;  // 4112
    unsigned long v52;  // d0
    unsigned long long v54;  // 4121
    void* iter2;  // x12
    void* v56;  // x13
    unsigned long long j;  // x11
    unsigned long long v58;  // x11
    void* v59;  // x13
    unsigned long long v61;  // x24
    unsigned long long v17;  // 4112
    unsigned long v62;  // x11
    unsigned int v63;  // w12
    unsigned long v64;  // 4110
    unsigned long long v65;  // 4105
    unsigned long v66;  // 4110
    unsigned long long v67;  // 4105
    unsigned long v68;  // x12
    unsigned long long v69;  // x23
    unsigned long long v70;  // 4132
    unsigned long long v71;  // x2
    long long v18;  // x1
    long long v72;  // x1
    unsigned long long v73;  // x21
    unsigned long long v19;  // w24
    unsigned long long v20;  // w27
    unsigned long long v21;  // x0
    unsigned long v0;  // [bp-0xe0]
    unsigned long long v1;  // [bp-0xd8]
    unsigned long v2;  // [bp-0xd0]
    unsigned long v3;  // [bp-0xc8]
    unsigned long long v4;  // [bp-0xc0]
    unsigned int v5;  // [bp-0xbc]
    void* v6;  // [bp-0xb8]
    void* v7;  // [bp-0xb0]
    char v8;  // [bp-0xa8]
    unsigned long v9;  // [bp-0x68]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v12 = a4;
    v9 = *(long long *)&g_10002b0;
    v13 = *a5;
    v14 = sub_a3f728();
    if (v14)
    {
        v15 = sub_a50ac8();
        if ((int)v15 >= 1)
        {
            v16 = arm64g_calculate_condition(1, v13 & 0xffffffff, 1, 0);
            if (!(v16 & 1))
            {
                v17 = arm64g_calculate_condition(193, v13 & 0xffffffff, 5, 0);
                if (v17 & 1)
                    goto LABEL_ab8320;
                sub_a368c8();
                sub_a369bc("crypto/rsa/rsa_pss.c", 78, "ossl_rsa_verify_PKCS1_PSS_mgf1");
                v18 = 0x88;
            }
            else
            {
                v13 = v15;
LABEL_ab8320:
                v19 = (unsigned int)v15;
                v20 = sub_9e46a8(a0->field_28) - 1 & 7;
                v21 = sub_aafbcc(a0);
                if ((char)(*(char *)v12) >> ((char)v20 & 31))
                {
                    sub_a368c8();
                    sub_a369bc("crypto/rsa/rsa_pss.c", 0x55, "ossl_rsa_verify_PKCS1_PSS_mgf1");
                    v18 = 133;
                }
                else
                {
                    v22 = v20;
                    v23 = !v20;
                    if (v20)
                    {
                        v24 = 0;
                        v25 = arm64g_calculate_condition(19, v22, 0, 0);
                        if (!(v25 & 1))
                            goto LABEL_ab837e;
LABEL_ab837d:
                        v27 = v12;
                    }
                    else
                    {
                        v24 = 0xffffffff;
                        v26 = arm64g_calculate_condition(19, v22, 0, 0);
                        if (v26 & 1)
                            goto LABEL_ab837d;
LABEL_ab837e:
                        v27 = v12 + 1;
                    }
                    v28 = v21 - v23;
                    if (v19 + 2 > (int)v28)
                    {
                        sub_a368c8();
                        v29 = 93;
                        goto LABEL_ab83a8;
                    }
                    v30 = (unsigned int)(v28 - v19) - 2;
                    v31 = arm64g_calculate_condition(1, v13 & 0xffffffff, 3, 0);
                    v32 = v30;
                    if (!(v31 & 1) && (v32 = v13, (int)v32 > (int)v30))
                    {
                        sub_a368c8();
                        v29 = 99;
LABEL_ab83a8:
                        sub_a369bc("crypto/rsa/rsa_pss.c", v29, "ossl_rsa_verify_PKCS1_PSS_mgf1");
                        v18 = 109;
                    }
                    else
                    {
                        if (*((char *)v27 + (v28 & 0xffffffff) - 1) == 188)
                        {
                            v4 = v24;
                            v5 = v21;
                            v3 = v32;
                            v6 = v27;
                            v33 = v28 + ~v19;
                            v34 = sub_a6bf4c(v33, "crypto/rsa/rsa_pss.c", 108);
                            if (!v34)
                                goto LABEL_ab847c;
                            v7 = v34;
                            v2 = v19;
                            if (!(sub_ab2f14() >> 31 & 1))
                            {
                                v35 = 3;
                                v36 = v33 & 0xffffffff;
                                v37 = 1;
                                v38 = v7;
                                if ((int)v33 >= 1)
                                {
                                    if (8 > (unsigned int)v33)
                                    {
                                        v39 = 0;
                                    }
                                    else if (32 > (unsigned int)v33)
                                    {
                                        v39 = 0;
LABEL_ab8564:
                                        v47 = v39;
                                        v39 = v33 & 0x7ffffff8;
                                        v48 = v12 + v47 + v23;
                                        iter1 = v38 + v47;
                                        v50 = v47 - v39;
                                        do
                                        {
                                            v51 = v48 + 8;
                                            v52 = __dirty_unsupported_Iop_ZeroHI64ofV128(*(unsigned long long *)&*(double *)v48 ^ *(unsigned long long *)&*(double *)iter1);
                                            *(unsigned long *)iter1 = v52;
                                            iter1 += 8;
                                            v54 = arm64g_calculate_condition(18, v50, 8, 0);
                                            v48 = v51;
                                            v50 += 8;
                                        } while (v54 & 1);
                                        v35 = 4;
                                        v36 = v39;
                                        v37 = v33;
                                        if (v39 == v33)
                                            goto LABEL_ab85c4;
                                    }
                                    else
                                    {
                                        v39 = v33 & 0x7fffffe0;
                                        node = v23 + v12 + 16;
                                        iter = v38 + 16;
                                        i = v39;
                                        do
                                        {
                                            v43 = i;
                                            v44 = *node;
                                            v45 = *iter;
                                            *(int128_t *)((char *)iter - 16) = *(int128_t *)((char *)node - 16) ^ *(int128_t *)((char *)iter - 16);
                                            *iter = v44 ^ v45;
                                            node += 2;
                                            iter += 2;
                                            i = v43 - 32;
                                        } while (i);
                                        v35 = 4;
                                        v36 = v39;
                                        v37 = v33;
                                        if (v39 == v33)
                                            goto LABEL_ab85c4;
                                        if (v33 & 24)
                                            goto LABEL_ab8564;
                                    }
                                    iter2 = v38 + v39;
                                    v56 = v12 + v39 + v23;
                                    j = v33 - v39;
                                    do
                                    {
                                        v58 = j;
                                        v59 = v56 + 1;
                                        *(char *)iter2 = *(char *)iter2 ^ *(char *)v56;
                                        iter2 += 1;
                                        v35 = 4;
                                        v36 = v58;
                                        v37 = 1;
                                        v56 = v59;
                                        j = v58 - 1;
                                    } while (j);
                                }
LABEL_ab85c4:
                                if (v20)
                                    *(char *)v38 = *(char *)v38 & (char)(0xff >> ((char)(8 - v20) & 31));
                                v61 = 0;
                                v62 = (unsigned int)v33 - 1;
                                while (1)
                                {
                                    v63 = *((char *)v38 + v61);
                                    if (!v63)
                                    {
                                        v64 = arm64g_calculate_condition(v35, v36, v37, 0);
                                        v35 = 4;
                                        v36 = (v64 & 1 ? v61 : 0);
                                        v37 = (v64 & 1 ? v62 : 0);
                                        v61 += 1;
                                        v65 = arm64g_calculate_condition(180, v36, v37, 0);
                                        if (!(v65 & 1))
                                            break;
                                    }
                                    else
                                    {
                                        v66 = arm64g_calculate_condition(v35, v36, v37, 0);
                                        v35 = 0;
                                        v36 = (v66 & 1 ? v61 : 0);
                                        v37 = (v66 & 1 ? v62 : 0);
                                        v61 += 1;
                                        v67 = arm64g_calculate_condition(176, v36, v37, 0);
                                        if (!(v67 & 1))
                                            break;
                                    }
                                }
                                if (v63 != 1)
                                {
                                    sub_a368c8();
                                    sub_a369bc("crypto/rsa/rsa_pss.c", 120, "ossl_rsa_verify_PKCS1_PSS_mgf1");
                                    v72 = 135;
                                    v71 = 0;
                                    goto LABEL_ab86a0;
                                }
                                v68 = v3;
                                v69 = (v33 & 0xffffffff) - v61;
                                v70 = arm64g_calculate_condition(1, (unsigned int)v68 & 0xfffffffd, 4, 0);
                                if (!(v70 & 1) && (unsigned int)(~v19 + v5 + v4 - v68) != (unsigned int)v61)
                                {
                                    sub_a368c8();
                                    sub_a369bc("crypto/rsa/rsa_pss.c", 126, "ossl_rsa_verify_PKCS1_PSS_mgf1");
                                    v0 = v68;
                                    v1 = v69;
                                    v71 = "expected: %d retrieved: %d";
                                    v72 = 0x88;
LABEL_ab86a0:
                                    sub_a36abc(4, v72, v71);
                                    goto LABEL_ab86a4;
                                }
                                else
                                {
                                    if (!sub_a3fe04(v14, a2, 0) || !sub_a3fe10(v14, &g_df6e68, 8) || !sub_a3fe10(v14, a1, v2) || (unsigned int)v33 != (unsigned int)v61 && !sub_a3fe10(v14, v7 + v61, (int)v69) || !sub_a3ff7c(v14, &v8, 0))
                                        goto LABEL_ab86a4;
                                    if (_memcmp(&v8, v6 + v33, v2))
                                    {
                                        sub_a368c8();
                                        sub_a369bc("crypto/rsa/rsa_pss.c", 144, "ossl_rsa_verify_PKCS1_PSS_mgf1");
                                        sub_a36abc(4, 104, 0);
                                        v73 = 0;
                                    }
                                    else
                                    {
                                        v73 = 1;
                                    }
                                    *a5 = v69;
                                }
                            }
                            else
                            {
LABEL_ab86a4:
                                v73 = 0;
                            }
                            goto LABEL_ab84b8;
                        }
                        else
                        {
                            sub_a368c8();
                            sub_a369bc("crypto/rsa/rsa_pss.c", 103, "ossl_rsa_verify_PKCS1_PSS_mgf1");
                            v18 = 134;
                        }
                    }
                }
            }
            sub_a36abc(4, v18, 0);
            goto LABEL_ab84b0;
        }
        else
        {
LABEL_ab84b0:
            v73 = 0;
        }
    }
    else
    {
LABEL_ab847c:
        v73 = 0;
    }
LABEL_ab84b8:
    sub_a6c2e4();
    sub_a3f73c(v14);
    if (*(long long *)&g_10002b0 == v9)
        return v73;
    ___stack_chk_fail();
}
