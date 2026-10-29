/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab5dfc..0xab61c8 (972 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_ab5dfc(long long a0, void* a1, unsigned long long a2, void* a3, int a4, unsigned long long a5, long long a6)
{
    unsigned long long i;  // x21
    unsigned long long v5;  // x0
    unsigned long v14;  // cc_dep1
    unsigned long v15;  // cc_dep2
    unsigned long long v16;  // w13
    unsigned long long v17;  // 4105
    unsigned long long v18;  // 4105
    unsigned long long v19;  // w14
    unsigned long long v20;  // w12
    unsigned long long v21;  // w13
    unsigned long long v22;  // x14
    int v23;  // w15
    char *v6;  // x19
    unsigned long long v24;  // x21
    unsigned long long v25;  // w12
    unsigned long long v26;  // w11
    unsigned long long v27;  // w13
    unsigned int v28;  // w11
    char v29;  // x10
    unsigned long long v30;  // x12
    unsigned long v31;  // x16
    unsigned long v32;  // x13
    unsigned long long v33;  // x14
    unsigned long long v7;  // x9
    unsigned long long v34;  // x15
    unsigned long long v35;  // x15
    unsigned long long v36;  // x15
    unsigned long v37;  // x14
    uint128_t v38;  // q0
    unsigned long v39;  // x0
    uint128_t v40;  // q1
    uint128_t *node;  // x16
    uint128_t *iter;  // x17
    void* iter1;  // x0
    unsigned long long v8;  // w8
    unsigned long long j;  // x1
    unsigned long long v45;  // x1
    uint128_t v46;  // q3
    uint128_t v47;  // q5
    long long v49;  // x1
    unsigned int v9;  // w10
    unsigned int v10;  // w11
    unsigned long long v11;  // x9
    unsigned long v12;  // x12
    unsigned int v13;  // w12
    unsigned short v0;  // [bp-0x168]
    unsigned long v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = *(long long *)&g_10002b0;
    if (a4 >= 1 && a2 >= 1 && (unsigned int)a5 == a4)
    {
        i = a5 & 0xffffffff;
        v5 = sub_a6bf4c(i, "crypto/rsa/rsa_pk1.c", 424);
        if (v5)
        {
            v6 = v5;
            if (!(sub_ab61c8(a0, v6, a5, "message", 7, a6, __ROL__((unsigned int)a5, 3) & 0xfff8 & 0xffff) >> 31 & 1) && !(sub_ab61c8(a0, &v0, 0x100, "length", 6, a6, 0x800) >> 31 & 1))
            {
                v7 = 0;
                v8 = 0;
                v9 = (unsigned int)a5 + 0xfff6 & 0xffff;
                v10 = v9 | v9 >> 1 | (v9 | v9 >> 1) >> 2;
                do
                {
                    v11 = v7;
                    v12 = *(short *)((char *)&v0 + v11);
                    v13 = (v10 | v10 >> 4 | (v10 | v10 >> 4) >> 8) & (unsigned int)((((((v12 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v12 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v12 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v12 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48);
                    v14 = v13;
                    v15 = v9;
                    if (v13 < v9)
                    {
                        v16 = 0;
                        v17 = arm64g_calculate_condition(35, v14, v15, 0);
                        if (!(v17 & 1))
                            goto LABEL_ab5f0a;
                        goto LABEL_ab5f09;
                    }
                    else
                    {
                        v16 = 0xffffffff;
                        v18 = arm64g_calculate_condition(35, v14, v15, 0);
                        if (v18 & 1)
                        {
LABEL_ab5f09:
                            v19 = 0;
                            continue;
                        }
                        else
                        {
LABEL_ab5f0a:
                            v19 = 0xffffffff;
                        }
                    }
                } while ((v8 = v13 & v19 | v16 & v8, v7 = v11 + 2, v11 < 254));
                v20 = 0;
                if ((int)a5 >= 3)
                {
                    v21 = 0;
                    v22 = 2;
                    do
                    {
                        v23 = *((char *)a3 + v22) - 1 >> 31;
                        v20 = ~(v23 & ~v21) & v20 | v23 & ~v21 & (unsigned int)v22;
                        v21 |= v23;
                        v22 += 1;
                    } while (i != v22);
                }
                v24 = 0;
                v25 = v20 + 1;
                if ((((unsigned int)(a2 - (a5 - v25)) ^ (unsigned int)(a5 - v25) | (unsigned int)(a5 - v25) ^ a2) ^ a2) < 0)
                    v26 = 0;
                else
                    v26 = (long long)(((char)a3[1] ^ 2) - 1 & *(char *)a3 - 1 & (9 - v20 | v20)) >> 31;
                v27 = ~v26 & (unsigned int)(a5 - v8) | v26 & v25;
                if ((int)a5 > v27)
                {
                    v28 = v26 & 0xff;
                    v29 = ~v28;
                    v30 = a2;
                    v31 = v27;
                    v32 = (int)a5;
                    v33 = ~v31 + v32;
                    if (1 < v30)
                        v34 = v30;
                    else
                        v34 = 1;
                    v35 = v34 - 1;
                    if (v33 >= v35)
                        v33 = v35;
                    if (v33 < 31 || 32 > a1 - a3 - v31)
                    {
                        v24 = 0;
                        v37 = v31;
                    }
                    else
                    {
                        v36 = v33 + 1;
                        v24 = v36 & 0xffffffffffffffe0;
                        v37 = v24 + v31;
                        v38 = CONCAT(v28 & 0xff | (v28 & 0xff) * 0x100 | (v28 & 0xff | (v28 & 0xff) * 0x100) * 0x10000 | (v28 & 0xff | (v28 & 0xff) * 0x100 | (v28 & 0xff | (v28 & 0xff) * 0x100) * 0x10000) * 0x100000000, v28 & 0xff | (v28 & 0xff) * 0x100 | (v28 & 0xff | (v28 & 0xff) * 0x100) * 0x10000 | (v28 & 0xff | (v28 & 0xff) * 0x100 | (v28 & 0xff | (v28 & 0xff) * 0x100) * 0x10000) * 0x100000000);
                        v39 = v31 + 16;
                        v40 = CONCAT(v29 | v29 * 0x100 | (v29 | v29 * 0x100) * 0x10000 | (v29 | v29 * 0x100 | (v29 | v29 * 0x100) * 0x10000) * 0x100000000, v29 | v29 * 0x100 | (v29 | v29 * 0x100) * 0x10000 | (v29 | v29 * 0x100 | (v29 | v29 * 0x100) * 0x10000) * 0x100000000);
                        node = &v6[v39];
                        iter = a1 + 16;
                        iter1 = a3 + v39;
                        j = v24;
                        do
                        {
                            v45 = j;
                            v46 = v38 & *(int128_t *)iter1;
                            v47 = v40 & *node;
                            *(uint128_t *)((char *)iter - 16) = v40 & *(int128_t *)((char *)node - 16) | v38 & *(int128_t *)((char *)iter1 - 16);
                            *iter = v47 | v46;
                            node += 2;
                            iter += 2;
                            iter1 += 32;
                            j = v45 - 32;
                        } while (j);
                        if (v36 == v24)
                            goto LABEL_ab60cc;
                    }
                    do
                    {
                        *((char *)a1 + v24) = v29 & v6[v37] | (char)v28 & *((char *)a3 + v37);
                        v37 += 1;
                        v24 += 1;
                    } while ((long long)v32 > (long long)v37 && v24 < v30);
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/rsa/rsa_pk1.c", 520, "ossl_rsa_padding_check_PKCS1_type_2");
                sub_a36abc(4, 0xc0103, 0);
                v24 = 0xffffffff;
            }
LABEL_ab60cc:
            sub_a6c2e4(v6, "crypto/rsa/rsa_pk1.c", 521);
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/rsa/rsa_pk1.c", 426, "ossl_rsa_padding_check_PKCS1_type_2");
            v49 = 0xc0100;
LABEL_ab6110:
            sub_a36abc(4, v49, 0);
            v24 = 0xffffffff;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/rsa/rsa_pk1.c", 419, "ossl_rsa_padding_check_PKCS1_type_2");
        v49 = 786691;
        goto LABEL_ab6110;
    }
    if (*(long long *)&g_10002b0 == v1)
        return v24;
    ___stack_chk_fail();
}
