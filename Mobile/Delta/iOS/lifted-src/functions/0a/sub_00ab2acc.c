/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab2acc..0xab2f14 (1096 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab2acc_0 {
    char padding_0[1];
    uint128_t field_1;
    uint128_t field_11;
} st_ab2acc_0;

extern char g_10002b0;

unsigned long long sub_ab2acc(long long a0, st_ab2acc_0 *a1, unsigned int a2, long long a3, unsigned long long a4, long long a5, int a6, unsigned long long a7)
{
    unsigned long long v7;  // x19
    unsigned long long v8;  // w0
    unsigned long long v17;  // x21
    unsigned long v18;  // x24
    unsigned long long v19;  // x20
    unsigned long long v20;  // x8
    uint128_t *iter;  // x9
    uint128_t *iter1;  // x10
    unsigned long long i;  // x11
    unsigned long long v24;  // x11
    uint128_t v25;  // q1
    uint128_t v26;  // q3
    unsigned long v9;  // x19
    unsigned long long v28;  // x11
    double *v29;  // x9
    unsigned long long *iter2;  // x10
    unsigned long long v31;  // x11
    unsigned long v33;  // d0
    unsigned long long v35;  // 4121
    char *v36;  // x9
    unsigned int v10;  // w8
    char *v37;  // x10
    unsigned long long j;  // x8
    unsigned long long v39;  // x8
    unsigned long long v42;  // x8
    uint128_t *v43;  // x9
    uint128_t *node;  // x10
    unsigned long long k;  // x11
    unsigned long long v46;  // x11
    unsigned long v11;  // x22
    uint128_t v47;  // q1
    uint128_t v48;  // q3
    unsigned long long v50;  // x11
    double *v51;  // x9
    unsigned long long *v52;  // x10
    unsigned long long v53;  // x11
    unsigned long v55;  // d0
    long long v12;  // x1
    unsigned long long v57;  // 4121
    char *v58;  // x9
    char *v59;  // x10
    unsigned long long l;  // x8
    unsigned long long v61;  // x8
    unsigned long long v64;  // x19
    uint128_t *v13;  // x26
    unsigned long long v14;  // x23
    long long v15;  // x28
    unsigned long long v16;  // x21
    unsigned long long v0;  // [bp-0xb4]
    unsigned long long v1;  // [bp-0xb0]
    char v2;  // [bp-0xa8]
    unsigned long v4;  // [bp-0x68]
    char *v5;  // [bp-0x10]
    unsigned long long v6;  // [bp+0x0]

    v5 = &v6;
    v7 = v6;
    v4 = *(long long *)&g_10002b0;
    if (!a7)
        a7 = sub_a5609c();
    if (!v7)
        v7 = a7;
    v8 = (unsigned int)sub_a50ac8();
    if (v8 > 0)
    {
        v1 = v7;
        v9 = a2 - 1;
        v10 = v8 * 2;
        v11 = ~v10;
        if ((int)a4 > (int)((unsigned int)v9 + (unsigned int)v11))
        {
            sub_a368c8();
            sub_a369bc("crypto/rsa/rsa_oaep.c", 99, "ossl_rsa_padding_add_PKCS1_OAEP_mgf1_ex");
            v12 = 110;
        }
        else if ((int)a2 > (int)(v10 | 1))
        {
            *(char *)a1->padding_0 = 0;
            v13 = (a1->padding_0)[1];
            v0 = v8;
            v14 = v8;
            v15 = (char *)v13 + v14;
            if (sub_a40abc(a5, a6, v15, 0, a7, 0))
            {
                v16 = v9 - a4;
                _bzero(v15 + v14, v16 + v11);
                *(char *)(v15 + v16 + ~v0) = 1;
                _memcpy(v15 + (v9 & 0xffffffff) - (int)a4 - v14, a3, a4 & 0xffffffff);
                if ((int)sub_aa8658(a0, v13, v14, 0) < 1)
                    goto LABEL_ab2d18;
                v17 = v9 - v0;
                v18 = (int)v17;
                v19 = sub_a6bf4c(v18, "crypto/rsa/rsa_oaep.c", 126);
                if (v19 && !(sub_ab2f14(v19, v18, v13, v14, v1) >> 31 & 1))
                {
                    if ((int)v17 >= 1)
                    {
                        if (8 > (unsigned int)v17)
                        {
                            v20 = 0;
                        }
                        else if (32 > (unsigned int)v17)
                        {
                            v20 = 0;
LABEL_ab2d80:
                            v28 = v20;
                            v20 = v17 & 0x7ffffff8;
                            v29 = v19 + v28;
                            iter2 = &(a1->padding_0)[v14 + v28 + 1];
                            v31 = v28 - v20;
                            do
                            {
                                v33 = __dirty_unsupported_Iop_ZeroHI64ofV128(*(unsigned long long *)&*v29 ^ *(unsigned long long *)&*(double *)iter2);
                                *iter2 = v33;
                                iter2 += 1;
                                v35 = arm64g_calculate_condition(18, v31, 8, 0);
                                v29 += 1;
                                v31 += 8;
                            } while (v35 & 1);
                            if (v20 == v17)
                                goto LABEL_ab2de8;
                        }
                        else
                        {
                            v20 = v17 & 0x7fffffe0;
                            iter = v19 + 16;
                            iter1 = &(a1->padding_0)[v14 + 0x11];
                            i = v20;
                            do
                            {
                                v24 = i;
                                v25 = *iter;
                                v26 = *iter1;
                                *(int128_t *)((char *)iter1 - 16) = *(int128_t *)((char *)iter - 16) ^ *(int128_t *)((char *)iter1 - 16);
                                *iter1 = v25 ^ v26;
                                iter += 2;
                                iter1 += 2;
                                i = v24 - 32;
                            } while (i);
                            if (v20 == v17)
                                goto LABEL_ab2de8;
                            if (v17 & 24)
                                goto LABEL_ab2d80;
                        }
                        v36 = &(a1->padding_0)[1 + v14 + v20];
                        v37 = v19 + v20;
                        j = v17 - v20;
                        do
                        {
                            v39 = j;
                            *v36 = *v36 ^ *v37;
                            v36 += 1;
                            j = v39 - 1;
                            v37 += 1;
                        } while (j);
                    }
LABEL_ab2de8:
                    if (sub_ab2f14(&v2, v14, v15, v18, v1) >> 31 & 1)
                        goto LABEL_ab2e18;
                    if (8 > v0)
                    {
                        v42 = 0;
                    }
                    else if (32 > v0)
                    {
                        v42 = 0;
LABEL_ab2e78:
                        v50 = v42;
                        v42 = v14 & 0x7ffffff8;
                        v51 = &(&v2)[v50];
                        v52 = &(a1->padding_0)[v50 + 1];
                        v53 = v50 - v42;
                        do
                        {
                            v55 = __dirty_unsupported_Iop_ZeroHI64ofV128(*(unsigned long long *)&*v51 ^ *(unsigned long long *)&*(double *)v52);
                            *v52 = v55;
                            v52 += 1;
                            v57 = arm64g_calculate_condition(18, v53, 8, 0);
                            v51 += 1;
                            v53 += 8;
                        } while (v57 & 1);
                        if (v42 == v14)
                            goto LABEL_ab2ee0;
                    }
                    else
                    {
                        v42 = v14 & 0x7fffffe0;
                        v43 = &v2 + 16;
                        node = (char *)&a1->field_1 + 1;
                        k = v42;
                        do
                        {
                            v46 = k;
                            v47 = *v43;
                            v48 = *node;
                            *(int128_t *)((char *)node - 16) = *(int128_t *)((char *)v43 - 16) ^ *(int128_t *)((char *)node - 16);
                            *node = v47 ^ v48;
                            v43 += 2;
                            node += 2;
                            k = v46 - 32;
                        } while (k);
                        if (v42 == v14)
                            goto LABEL_ab2ee0;
                        if (v14 & 24)
                            goto LABEL_ab2e78;
                    }
                    v58 = &(a1->padding_0)[1 + v42];
                    v59 = &(&v2)[v42];
                    l = v14 - v42;
                    do
                    {
                        v61 = l;
                        *v58 = *v58 ^ *v59;
                        v58 += 1;
                        l = v61 - 1;
                        v59 += 1;
                    } while (l);
LABEL_ab2ee0:
                    v64 = 1;
                }
                else
                {
LABEL_ab2e18:
                    v64 = 0;
                }
            }
            else
            {
LABEL_ab2d18:
                v64 = 0;
                v19 = 0;
                v17 = 0;
            }
            sub_a66ec0(&v2, 64);
            sub_a6c4e8(v19, (int)v17, "crypto/rsa/rsa_oaep.c", 147);
            if (*(long long *)&g_10002b0 == v4)
                return v64;
            ___stack_chk_fail();
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/rsa/rsa_oaep.c", 104, "ossl_rsa_padding_add_PKCS1_OAEP_mgf1_ex");
            v12 = 120;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/rsa/rsa_oaep.c", 93, "ossl_rsa_padding_add_PKCS1_OAEP_mgf1_ex");
        v12 = 181;
    }
    sub_a36abc(4, v12, 0);
    if (*(long long *)&g_10002b0 == v4)
        return 0;
    ___stack_chk_fail();
}
