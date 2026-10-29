/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab87ac..0xab8bf4 (1096 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_df6e68;

unsigned long long sub_ab87ac(long long *a0, char *a1, long long a2, unsigned long long a3, unsigned long long a4, void* a5)
{
    char *node;  // x20
    unsigned long long v5;  // x28
    unsigned long long v14;  // w21
    unsigned int v15;  // w0
    long long v16;  // x1
    unsigned long long v17;  // w8
    unsigned long long v18;  // 4127
    unsigned long long v19;  // w9
    unsigned long long v20;  // x19
    unsigned long long v21;  // x21
    unsigned long long v22;  // x0
    unsigned long long v23;  // x27
    unsigned long long v6;  // x0
    unsigned long long v24;  // x26
    unsigned long long v25;  // x25
    unsigned long v26;  // x24
    unsigned long v27;  // x12
    char *iter;  // x9
    unsigned long long v29;  // x10
    unsigned long long v30;  // x11
    unsigned long long v31;  // x11
    uint128_t *iter1;  // x13
    uint128_t *iter2;  // x14
    unsigned long long v7;  // x22
    unsigned long long j;  // x15
    unsigned long long v35;  // x15
    uint128_t v36;  // q1
    uint128_t v37;  // q3
    unsigned long long v39;  // x14
    unsigned long long *v40;  // x12
    double *v41;  // x13
    unsigned long long v42;  // x14
    double *v43;  // x13
    unsigned long long v8;  // 4116
    unsigned long v44;  // d0
    unsigned long long v46;  // 4121
    char *v47;  // x12
    unsigned long long i;  // x10
    char *v49;  // x9
    unsigned long long v50;  // x10
    char *v51;  // x12
    unsigned long long v9;  // 4112
    unsigned long long v10;  // 4112
    unsigned long long v11;  // x28
    unsigned long long v12;  // x27
    unsigned long long v13;  // 4112
    unsigned long long v0;  // [bp-0x68]
    unsigned int v1;  // [bp-0x64]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    node = a1;
    v5 = *(int *)a5;
    if (a4)
        a3 = a4;
    v6 = sub_a50ac8();
    if ((int)v6 >= 1)
    {
        v7 = v6;
        v8 = arm64g_calculate_condition(1, v5 & 0xffffffff, 4, 0);
        if (!(v8 & 1))
        {
            v9 = arm64g_calculate_condition(1, v5 & 0xffffffff, 1, 0);
            if (!(v9 & 1))
            {
                v10 = arm64g_calculate_condition(0x11, v5 & 0xffffffff, 2, 0);
                if (!(v10 & 1))
                {
                    v11 = 0xffffffff;
                    v12 = 0xfffffffd;
                }
                else
                {
                    v13 = arm64g_calculate_condition(193, v5 & 0xffffffff, 5, 0);
                    if (!(v13 & 1))
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/rsa/rsa_pss.c", 216, "ossl_rsa_padding_add_PKCS1_PSS_mgf1");
                        sub_a36abc(4, 0x88, 0);
                        goto LABEL_ab886c;
                    }
                    else
                    {
                        v11 = 0xffffffff;
                        v12 = v5;
                    }
                }
            }
            else
            {
                v11 = v5;
                v12 = v7;
            }
        }
        else
        {
            v12 = 0xfffffffd;
            v11 = v7;
        }
        v14 = sub_9e46a8(a0[5]) - 1 & 7;
        v15 = sub_aafbcc(a0);
        if (!v14)
        {
            *node = 0;
            node += 1;
            v15 -= 1;
        }
        if ((int)((unsigned int)v7 + 2) > (int)v15)
        {
            sub_a368c8();
            v16 = 227;
            goto LABEL_ab88cc;
        }
        v17 = (unsigned int)(v15 - v7) - 2;
        v18 = arm64g_calculate_condition(0x11, v12 & 0xffffffff, 3, 0);
        if (!(v18 & 1))
        {
            if (v17 < (int)v11)
                v19 = v17;
            else
                v19 = (unsigned int)v11;
            if ((int)v11 < 0)
                v5 = v17;
            else
                v5 = v19;
            goto LABEL_ab8940;
        }
        else if ((int)v12 > v17)
        {
            sub_a368c8();
            v16 = 235;
LABEL_ab88cc:
            sub_a369bc("crypto/rsa/rsa_pss.c", v16, "ossl_rsa_padding_add_PKCS1_PSS_mgf1");
            sub_a36abc(4, 110, 0);
            v20 = 0;
            v21 = 0;
            v22 = 0;
            v5 = v12;
        }
        else
        {
            v5 = v12;
LABEL_ab8940:
            v0 = v14;
            v1 = v15;
            if ((int)v5 >= 1)
            {
                v23 = v5 & 0xffffffff;
                v22 = sub_a6bf4c(v23, "crypto/rsa/rsa_pss.c", 239);
                v21 = v22;
                if (!v22)
                    goto LABEL_ab8a4c;
                if (1 <= (int)sub_aa8658(a0[1], v21, v23, 0))
                    goto LABEL_ab8998;
                v20 = 0;
                v22 = 0;
            }
            else
            {
                v21 = 0;
LABEL_ab8998:
                v22 = sub_a3f728();
                if (v22)
                {
                    v24 = v22;
                    if (!sub_a3fe04() || !sub_a3fe10(v24, &g_df6e68, 8) || (v25 = v7 & 0xffffffff, !sub_a3fe10(v24, a2, v25) || (unsigned int)v5 && !sub_a3fe10(v24, v21, (int)v5) || (v26 = v1 + ~(unsigned int)v7, !sub_a3ff7c(v24, &node[v26], 0) || sub_ab2f14(node, v26, &node[v26], v25, a3))))
                    {
                        v20 = 0;
                        v22 = v24;
                    }
                    else
                    {
                        v27 = (unsigned int)(v1 - (v7 + v5)) - 2;
                        iter = &node[v27];
                        *iter = *iter ^ 1;
                        v22 = v24;
                        if ((int)v5 >= 1)
                        {
                            v29 = v5 & 0xffffffff;
                            if ((unsigned int)v5 < 8 || (v30 = &node[v27 + 1], v21 + v29 > &node[v27 + 1] && &node[v27 + 1 + v29] > v21))
                            {
                                v31 = 0;
                            }
                            else if (32 > (unsigned int)v5)
                            {
                                v31 = 0;
LABEL_ab8ba8:
                                v39 = v31;
                                v31 = v29 & 0x7ffffff8;
                                iter = &iter[v31];
                                v40 = &node[v27 + v39 + 1];
                                v41 = v21 + v39;
                                v42 = v39 - v31;
                                do
                                {
                                    v43 = v41 + 1;
                                    v44 = __dirty_unsupported_Iop_ZeroHI64ofV128(*(unsigned long long *)&*v41 ^ *(unsigned long long *)&*(double *)v40);
                                    *v40 = v44;
                                    v40 += 1;
                                    v46 = arm64g_calculate_condition(18, v42, 8, 0);
                                    v41 = v43;
                                    v42 += 8;
                                } while (v46 & 1);
                                if (v31 == v29)
                                    goto LABEL_ab8b14;
                            }
                            else
                            {
                                v31 = v29 & 0x7fffffe0;
                                iter1 = &node[v27 + 0x11];
                                iter2 = v21 + 16;
                                j = v31;
                                do
                                {
                                    v35 = j;
                                    v36 = *iter2;
                                    v37 = *iter1;
                                    *(int128_t *)((char *)iter1 - 16) = *(int128_t *)((char *)iter2 - 16) ^ *(int128_t *)((char *)iter1 - 16);
                                    *iter1 = v36 ^ v37;
                                    iter1 += 2;
                                    iter2 += 2;
                                    j = v35 - 32;
                                } while (j);
                                if (v31 == v29)
                                    goto LABEL_ab8b14;
                                if (v29 & 24)
                                    goto LABEL_ab8ba8;
                                iter = &iter[v31];
                            }
                            v47 = v21 + v31;
                            i = v29 - v31;
                            v49 = iter + 1;
                            do
                            {
                                v50 = i;
                                v51 = v47 + 1;
                                *v49 = *v49 ^ *v47;
                                v49 += 1;
                                v47 = v51;
                                i = v50 - 1;
                            } while (i);
                        }
LABEL_ab8b14:
                        if (v0)
                            *node = *node & (char)(0xff >> ((char)(8 - v0) & 31));
                        *(&node[v1] - 1) = 188;
                        *(unsigned int *)a5 = v5;
                        v20 = 1;
                    }
                }
                else
                {
LABEL_ab8a4c:
                    v20 = 0;
                }
            }
        }
    }
    else
    {
LABEL_ab886c:
        v20 = 0;
        v21 = 0;
        v22 = 0;
    }
    sub_a3f73c(v22);
    sub_a6c4e8(v21, (int)v5, "crypto/rsa/rsa_pss.c", 287);
    return v20;
}
