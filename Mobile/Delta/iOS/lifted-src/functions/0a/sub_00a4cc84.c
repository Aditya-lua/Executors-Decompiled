/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4cc84..0xa4d024 (928 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4cc84_0 {
    char padding_0[4];
    unsigned int field_4;
    char padding_8[10];
    char field_12;
    char padding_13[21];
    struct st_a4cc84_1 *field_28;
    char padding_30[120];
    struct st_a4cc84_1 *field_a8;
} st_a4cc84_0;

typedef struct st_a4cc84_1 {
    unsigned long long field_0;
} st_a4cc84_1;


unsigned long long sub_a4cc84(void* a0, void* a1, unsigned long long *a2)
{
    long long v2;  // x1
    st_a4cc84_0 *v3;  // x8
    unsigned long long v12;  // 4112
    unsigned long long v13;  // 4102
    long long v14;  // x1
    unsigned long v15;  // x12
    unsigned long long v16;  // x8
    unsigned long long *v17;  // x2
    unsigned long long v18;  // x9
    uint128_t *node;  // x13
    uint128_t *iter;  // x14
    unsigned long long j;  // x15
    unsigned long long v22;  // x15
    uint128_t v23;  // q1
    unsigned long long v25;  // x15
    unsigned long long *v26;  // x13
    void* iter1;  // x14
    unsigned long long v28;  // x15
    unsigned long long v31;  // 4112
    unsigned long v5;  // x8
    void* iter2;  // x10
    char *v33;  // x11
    unsigned long long i;  // x9
    unsigned long long v35;  // x9
    unsigned long v6;  // cc_dep1
    char *v7;  // x9
    unsigned int v8;  // w11
    unsigned long v9;  // x10
    unsigned long long v10;  // 4112
    unsigned long long v11;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a2)
    {
        *(unsigned int *)a2 = 0;
        if ((int)a0[16])
        {
            sub_a368c8();
            sub_a369bc("crypto/evp/evp_enc.c", 1284, "EVP_DecryptFinal_ex");
            v2 = 148;
        }
        else
        {
            v3 = *(long long *)a0;
            if (!v3)
            {
                sub_a368c8();
                sub_a369bc("crypto/evp/evp_enc.c", 1289, "EVP_DecryptFinal_ex");
                v2 = 131;
            }
            else if (*(long long *)&v3->padding_30[72])
            {
                if ((int)sub_a50638() >= 1 && *(long long *)(*(long long *)a0 + 168))
                    (*(long long *)(*(long long *)a0 + 168))();
                sub_a368c8();
                sub_a369bc("crypto/evp/evp_enc.c", 1299, "EVP_DecryptFinal_ex");
                v2 = 188;
            }
            else if (v3->field_12 >> 4 & 1)
            {
                v3->field_28();
            }
            else if (!((char)a0[113] & 1))
            {
                v5 = v3->field_4;
                if ((unsigned int)v5 < 2)
                    return 1;
                if ((int)a0[20] || !(int)a0[128])
                {
                    sub_a368c8();
                    sub_a369bc("crypto/evp/evp_enc.c", 1340, "EVP_DecryptFinal_ex");
                    v2 = 109;
                }
                else
                {
                    v6 = v5 & 0xffffffff;
                    if (33 <= (unsigned int)v5)
                        sub_a69928("assertion failed: b <= sizeof(ctx->final)", "crypto/evp/evp_enc.c", 1343);
                    v7 = a0 + 0x88;
                    v8 = (unsigned int)v5 - 1;
                    v9 = v7[v8];
                    if ((unsigned int)v9)
                    {
                        v10 = arm64g_calculate_condition(19, v6, 33, 0);
                        v11 = arm64g_calculate_condition(35, (v10 & 1 ? v5 & 0xffffffff : 0), (v10 & 1 ? v9 & 0xff : 0), 0);
                        if (v11 & 1)
                            goto LABEL_a4cecc;
                    }
                    else
                    {
                        v12 = arm64g_calculate_condition(19, v6, 33, 0);
                        v13 = arm64g_calculate_condition(32, (v12 & 1 ? v5 & 0xffffffff : 0), (v12 & 1 ? v9 & 0xff : 0), 0);
                        if (v13 & 1)
                        {
LABEL_a4cecc:
                            v15 = v9;
                            do
                            {
                                if (v7[v8] != (unsigned int)v9)
                                {
                                    sub_a368c8();
                                    v14 = 1356;
                                    goto LABEL_a4cf54;
                                }
                            } while ((v8 -= 1, v15 = (unsigned int)v15 - 1, (unsigned int)v15));
                            v16 = v5 - v9;
                            v17 = a2;
                            if ((int)v16 >= 1)
                            {
                                if ((unsigned int)v16 < 8 || 32 > a1 - a0 - 0x88)
                                {
                                    v18 = 0;
                                    v17 = a2;
                                    goto LABEL_a4cf10;
                                }
                                else
                                {
                                    if (32 > (unsigned int)v16)
                                    {
                                        v18 = 0;
LABEL_a4cfc4:
                                        v25 = v18;
                                        v18 = v16 & 0x7ffffff8;
                                        v26 = v25 + a0 + 0x88;
                                        iter1 = a1 + v25;
                                        v28 = v25 - v18;
                                        do
                                        {
                                            *(double *)iter1 = *(double *)v26;
                                            iter1 += 8;
                                            v31 = arm64g_calculate_condition(18, v28, 8, 0);
                                            v26 += 1;
                                            v28 += 8;
                                        } while (v31 & 1);
                                        v17 = a2;
                                        if (v18 != v16)
                                            goto LABEL_a4cf10;
                                    }
                                    else
                                    {
                                        v18 = v16 & 0x7fffffe0;
                                        node = a0 + 152;
                                        iter = a1 + 16;
                                        j = v18;
                                        do
                                        {
                                            v22 = j;
                                            v23 = *node;
                                            *(int128_t *)((char *)iter - 16) = *(int128_t *)((char *)node - 16);
                                            *iter = v23;
                                            node += 2;
                                            iter += 2;
                                            j = v22 - 32;
                                        } while (j);
                                        v17 = a2;
                                        if (v18 != v16)
                                        {
                                            a1 = a1;
                                            a0 = a0;
                                            if (v16 & 24)
                                                goto LABEL_a4cfc4;
LABEL_a4cf10:
                                            iter2 = a1 + v18;
                                            v33 = v18 + a0 + 0x88;
                                            i = v16 - v18;
                                            do
                                            {
                                                v35 = i;
                                                *(char *)iter2 = *v33;
                                                iter2 += 1;
                                                i = v35 - 1;
                                                v33 += 1;
                                            } while (i);
                                        }
                                    }
                                }
                            }
                            *(unsigned int *)v17 = v16;
                            return 1;
                        }
                    }
                    sub_a368c8();
                    v14 = 1351;
LABEL_a4cf54:
                    sub_a369bc("crypto/evp/evp_enc.c", v14, "EVP_DecryptFinal_ex");
                    v2 = 100;
                }
            }
            else if ((int)a0[20])
            {
                sub_a368c8();
                sub_a369bc("crypto/evp/evp_enc.c", 1332, "EVP_DecryptFinal_ex");
                v2 = 138;
            }
            else
            {
                return 1;
            }
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/evp_enc.c", 1278, "EVP_DecryptFinal_ex");
        v2 = 786690;
    }
    sub_a36abc(6, v2, 0);
    return 0;
}
