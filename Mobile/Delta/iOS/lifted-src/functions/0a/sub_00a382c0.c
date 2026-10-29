/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa382c0..0xa385f0 (816 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a382c0_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_a382c0_0;

typedef struct st_a382c0_1 {
    char padding_0[16];
    struct st_a382c0_0 *field_10;
    unsigned long long field_18;
} st_a382c0_1;


void* sub_a382c0(unsigned int a0, st_a382c0_1 *a1, long long a2)
{
    st_a382c0_0 *v2;  // x24
    unsigned int v3;  // x0
    unsigned long long *v12;  // x13
    unsigned int v13;  // w14
    unsigned int v14;  // w12
    unsigned long v15;  // cc_dep1
    unsigned long long v16;  // 4112
    unsigned long long v17;  // 4102
    unsigned long long v18;  // 4112
    unsigned long long v19;  // 4102
    unsigned int v20;  // w8
    unsigned long long v21;  // 4102
    void* v4;  // x19
    unsigned int v5;  // x0
    unsigned int iter;  // w12
    unsigned int node;  // w10
    unsigned int iter1;  // w11
    unsigned int iter2;  // w9
    unsigned int v10;  // w8
    unsigned long long *v11;  // x13
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_10;
    v3 = sub_a6bffc(128, "crypto/evp/asymcipher.c", 352);
    if (v3)
    {
        v4 = (void*)v3;
        /* unsupported instruction */;
        *(unsigned int *)(v3 + 32) = 1;
        if (sub_a78c78(a2))
        {
            *(long long *)&v4[24] = a2;
            *(unsigned int *)v4 = a0;
            v5 = sub_a6895c(a1);
            *(unsigned long long *)&v4[8] = v5;
            if (v5)
            {
                iter = 0;
                node = 0;
                iter1 = 0;
                iter2 = 0;
                v10 = 0;
                *(unsigned long long *)&v4[16] = a1->field_18;
                v11 = &v2->field_8;
                while (1)
                {
                    v12 = v11;
                    v13 = *(int *)((char *)v12 - 8);
                    if ((int)v13 > 5)
                    {
                        if (8 >= (int)v13)
                        {
                            if (v13 != 6)
                            {
                                if (v13 != 7)
                                {
                                    if (v13 == 8 && !(long long)v4[96])
                                    {
                                        v11 = v12 + 2;
                                        *(unsigned long long *)&v4[96] = *v12;
                                        iter2 += 1;
                                        continue;
                                    }
                                }
                                else
                                {
                                    if (!(long long)v4[88])
                                    {
                                        v11 = v12 + 2;
                                        *(unsigned long long *)&v4[88] = *v12;
                                        continue;
                                    }
                                }
                            }
                            else
                            {
                                if (!(long long)v4[80])
                                {
                                    v11 = v12 + 2;
                                    *(unsigned long long *)&v4[80] = *v12;
                                    iter += 1;
                                    continue;
                                }
                            }
                        }
                        else
                        {
                            if (v13 != 9)
                            {
                                if (v13 != 10)
                                {
                                    if (v13 == 11 && !(long long)v4[120])
                                    {
                                        *(unsigned long long *)&v4[120] = *v12;
                                        goto LABEL_a3835c;
                                    }
                                }
                                else
                                {
                                    if (!(long long)v4[112])
                                    {
                                        *(unsigned long long *)&v4[112] = *v12;
LABEL_a3835c:
                                        v10 += 1;
                                        goto LABEL_a38360;
                                    }
                                }
                            }
                            else
                            {
                                if (!(long long)v4[104])
                                {
                                    v11 = v12 + 2;
                                    *(unsigned long long *)&v4[104] = *v12;
                                    iter2 += 1;
                                    continue;
                                }
                            }
                        }
                        goto LABEL_a38360;
                    }
                    if ((int)v13 > 2)
                    {
                        if (v13 != 3)
                        {
                            if (v13 != 4)
                            {
                                if (v13 == 5 && !(long long)v4[72])
                                {
                                    v11 = v12 + 2;
                                    *(unsigned long long *)&v4[72] = *v12;
                                    iter1 += 1;
                                    continue;
                                }
                            }
                            else
                            {
                                if (!(long long)v4[64])
                                {
                                    v11 = v12 + 2;
                                    *(unsigned long long *)&v4[64] = *v12;
                                    iter1 += 1;
                                    continue;
                                }
                            }
                        }
                        else
                        {
                            if (!(long long)v4[56])
                            {
                                v11 = v12 + 2;
                                *(unsigned long long *)&v4[56] = *v12;
                                node += 1;
                                continue;
                            }
                        }
                        goto LABEL_a38360;
                    }
                    switch (v13)
                    {
                    case 1:
                        if ((long long)v4[40])
                        {
LABEL_a38360:
                            v11 = v12 + 2;
                        }
                        else
                        {
                            v11 = v12 + 2;
                            *(unsigned long long *)&v4[40] = *v12;
                            iter += 1;
                        }
                        break;
                    default:
                        if (v13 == 2)
                        {
                            if (!(long long)v4[48])
                            {
                                v11 = v12 + 2;
                                *(unsigned long long *)&v4[48] = *v12;
                                node += 1;
                                continue;
                            }
                        }
                        else
                        {
                            if (!v13)
                                break;
                            else
                                goto LABEL_a38360;
                        }
                        goto LABEL_a38360;
                    }
                }
                if (iter == 2 && (node | 2) == 2 && !(v14 = iter1 | 2, v15 = v14, v14 != 2))
                {
                    if (iter1 != 2)
                    {
                        v16 = arm64g_calculate_condition(19, v15, 2, 0);
                        v17 = arm64g_calculate_condition(19, (v16 & 1 ? node : 0x40000000), (v16 & 1 ? 2 : 0), 0);
                        if (!(v17 & 1))
                            goto LABEL_a384fc;
                    }
                    else
                    {
                        v18 = arm64g_calculate_condition(19, v15, 2, 0);
                        v19 = arm64g_calculate_condition(16, (v18 & 1 ? node : 0x40000000), (v18 & 1 ? 2 : 0), 0);
                        if (!(v19 & 1))
                        {
LABEL_a384fc:
                            if (!(iter2 & 0xfffffffd) && !(v10 & 0xfffffffd))
                                return v4;
                        }
                    }
                }
                sub_a368c8();
                sub_a369bc("crypto/evp/asymcipher.c", 475, "evp_asym_cipher_from_algorithm");
                sub_a36abc(6, 193, 0);
            }
            do
            {
                /* unsupported instruction */;
                v20 = /* unsupported instruction */;
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            v21 = arm64g_calculate_condition(19, v20, 1, 0);
            if (!(v21 & 1))
            {
                /* unsupported instruction */;
            }
            else if (1 < (int)v20)
            {
                return 0;
            }
            sub_a6c2e4((long long)v4[8], "crypto/evp/asymcipher.c", 494);
            sub_a78ccc((long long)v4[24]);
            sub_a6c2e4(v4, "crypto/evp/asymcipher.c", 497);
            return 0;
        }
        sub_a6c2e4(v4, "crypto/evp/asymcipher.c", 360);
    }
    sub_a368c8();
    sub_a369bc("crypto/evp/asymcipher.c", 378, "evp_asym_cipher_from_algorithm");
    sub_a36abc(6, 0x80006, 0);
    return 0;
}
