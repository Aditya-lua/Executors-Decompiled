/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5280c..0xa52aec (736 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5280c_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_a5280c_0;

typedef struct st_a5280c_1 {
    char padding_0[16];
    struct st_a5280c_0 *field_10;
    unsigned long long field_18;
} st_a5280c_1;


void* sub_a5280c(unsigned int a0, st_a5280c_1 *a1, long long a2)
{
    st_a5280c_0 *v2;  // x24
    unsigned int v3;  // x0
    unsigned int v12;  // w8
    unsigned long long v13;  // 4102
    void* v4;  // x19
    unsigned int v5;  // x0
    unsigned int iter;  // w10
    unsigned int v7;  // w8
    unsigned int node;  // w9
    unsigned long long *v9;  // x11
    unsigned long long *v10;  // x11
    unsigned int v11;  // w12
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_10;
    v3 = sub_a6bffc(120, "crypto/evp/exchange.c", 33);
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
                v7 = 0;
                node = 0;
                *(unsigned long long *)&v4[16] = a1->field_18;
                v9 = &v2->field_8;
                while (1)
                {
                    v10 = v9;
                    v11 = *(int *)((char *)v10 - 8);
                    if (5 >= (int)v11)
                    {
                        if ((int)v11 > 2)
                        {
                            if (v11 != 3)
                            {
                                if (v11 != 4)
                                {
                                    if (v11 == 5 && !(long long)v4[72])
                                    {
                                        v9 = v10 + 2;
                                        *(unsigned long long *)&v4[72] = *v10;
                                        iter += 1;
                                        continue;
                                    }
                                }
                                else
                                {
                                    if (!(long long)v4[56])
                                    {
                                        v9 = v10 + 2;
                                        *(unsigned long long *)&v4[56] = *v10;
                                        continue;
                                    }
                                }
                            }
                            else
                            {
                                if (!(long long)v4[64])
                                {
                                    v9 = v10 + 2;
                                    *(unsigned long long *)&v4[64] = *v10;
                                    iter += 1;
                                    continue;
                                }
                            }
                        }
                        else
                        {
                            if (v11 != 1)
                            {
                                if (v11 == 2)
                                {
                                    if (!(long long)v4[48])
                                    {
                                        v9 = v10 + 2;
                                        *(unsigned long long *)&v4[48] = *v10;
                                        iter += 1;
                                        continue;
                                    }
                                }
                                else
                                {
                                    if (!v11)
                                        break;
                                    else
                                        goto LABEL_a528a4;
                                }
                            }
                            else
                            {
                                if (!(long long)v4[40])
                                {
                                    v9 = v10 + 2;
                                    *(unsigned long long *)&v4[40] = *v10;
                                    iter += 1;
                                    continue;
                                }
                            }
                        }
                        goto LABEL_a528a4;
                    }
                    if ((int)v11 > 7)
                    {
                        if (v11 != 8)
                        {
                            if (v11 != 9)
                            {
                                if (v11 == 10 && !(long long)v4[112])
                                {
                                    v9 = v10 + 2;
                                    *(unsigned long long *)&v4[112] = *v10;
                                    node += 1;
                                    continue;
                                }
                            }
                            else
                            {
                                if (!(long long)v4[104])
                                {
                                    v9 = v10 + 2;
                                    *(unsigned long long *)&v4[104] = *v10;
                                    node += 1;
                                    continue;
                                }
                            }
                        }
                        else
                        {
                            if (!(long long)v4[96])
                            {
                                *(unsigned long long *)&v4[96] = *v10;
LABEL_a528a0:
                                v7 += 1;
                                goto LABEL_a528a4;
                            }
                        }
                    }
                    switch (v11)
                    {
                    case 6:
                        if ((long long)v4[80])
                        {
LABEL_a528a4:
                            v9 = v10 + 2;
                        }
                        else
                        {
                            v9 = v10 + 2;
                            *(unsigned long long *)&v4[80] = *v10;
                        }
                        break;
                    default:
                        if (v11 == 7 && !(long long)v4[88])
                        {
                            *(unsigned long long *)&v4[88] = *v10;
                            goto LABEL_a528a0;
                        }
                        goto LABEL_a528a4;
                    }
                }
                if (iter == 4 && !(node & 0xfffffffd) && !(v7 & 0xfffffffd))
                    return v4;
                sub_a368c8();
                sub_a369bc("crypto/evp/exchange.c", 142, "evp_keyexch_from_algorithm");
                sub_a36abc(6, 193, 0);
            }
            do
            {
                /* unsupported instruction */;
                v12 = /* unsupported instruction */;
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            v13 = arm64g_calculate_condition(19, v12, 1, 0);
            if (!(v13 & 1))
            {
                /* unsupported instruction */;
            }
            else if (1 < (int)v12)
            {
                return 0;
            }
            sub_a6c2e4((long long)v4[8], "crypto/evp/exchange.c", 162);
            sub_a78ccc((long long)v4[24]);
            sub_a6c2e4(v4, "crypto/evp/exchange.c", 165);
            return 0;
        }
        sub_a6c2e4(v4, "crypto/evp/exchange.c", 41);
    }
    sub_a368c8();
    sub_a369bc("crypto/evp/exchange.c", 58, "evp_keyexch_from_algorithm");
    sub_a36abc(6, 0x80006, 0);
    return 0;
}
