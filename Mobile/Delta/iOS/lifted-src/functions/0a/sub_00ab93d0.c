/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab93d0..0xab9840 (1136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ab93d0_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[16];
    unsigned int field_20;
} st_ab93d0_0;


void* sub_ab93d0(unsigned long long a0, st_ab93d0_0 *a1, void* a2, void* ptr, void* *a4, long long a5, unsigned long a6, long long a7)
{
    void* v4;  // w26
    st_ab93d0_0 *v5;  // x25
    unsigned long v14;  // cc_op
    unsigned long v15;  // cc_dep1
    unsigned long v16;  // cc_dep2
    unsigned long long v17;  // 4110
    unsigned long v18;  // 4110
    unsigned long long v19;  // 4110
    unsigned long v20;  // 4110
    unsigned long v21;  // cc_op
    unsigned long v22;  // cc_dep1
    unsigned long v23;  // cc_dep2
    void* v6;  // x20
    unsigned long long v24;  // 4110
    unsigned long v25;  // 4110
    unsigned long long v26;  // 4110
    unsigned long v27;  // 4110
    unsigned long v28;  // cc_op
    unsigned long v29;  // cc_dep1
    unsigned long v30;  // cc_dep2
    unsigned long long v31;  // 4110
    unsigned long v32;  // 4110
    unsigned long long v33;  // 4110
    void* v7;  // w0
    unsigned long long v34;  // 4110
    unsigned long long v35;  // 4102
    unsigned long long v36;  // 4110
    unsigned long long v37;  // 4102
    long long v38;  // x1
    long long v39;  // x1
    void* v40;  // x25
    unsigned long v41;  // cc_dep1
    unsigned long long v42;  // 4110
    unsigned long long v43;  // 4102
    uint128_t v8;  // q1
    unsigned long long v44;  // 4110
    unsigned long long v45;  // 4102
    long long v46;  // x1
    void* v47;  // x24
    void* n;  // x26
    void* v9;  // x8
    unsigned long v10;  // cc_dep1
    unsigned long v11;  // x16
    unsigned long v12;  // x17
    unsigned long v13;  // 4110
    void* v0;  // [bp-0x70]
    void* v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a2;
    v5 = a1;
    v0 = 0;
    v1 = 0;
    if (sub_aafbcc(a7) != a6)
    {
        sub_a368c8();
        sub_a369bc("crypto/rsa/rsa_sign.c", 353, "ossl_rsa_verify");
        sub_a36abc(4, 0x77, 0);
        return 0;
    }
    v6 = sub_a6bf4c(a6, "crypto/rsa/rsa_sign.c", 358);
    if (!v6 || (v7 = (void*)(unsigned int)sub_aafc18(a6, a5, v6, a7, 1), v7 < 1))
    {
LABEL_ab96dc:
        goto LABEL_ab96e0;
    }
    if ((unsigned int)a0 == 114)
    {
        if (v7 != 36)
        {
            sub_a368c8();
            v38 = 376;
            goto LABEL_ab9564;
        }
        if (ptr)
        {
            v8 = (int128_t)v6[16];
            *(int128_t *)ptr = *(int128_t *)v6;
            *(uint128_t *)&ptr[16] = v8;
            *(int *)&ptr[32] = (int)v6[32];
            v9 = 36;
            goto LABEL_ab9490;
        }
        v10 = v4;
        if (v4 != 36)
        {
            sub_a368c8();
            v39 = 385;
            goto LABEL_ab9640;
        }
        v11 = (int)v6[32];
        v12 = v5->field_20;
        if (*(long long *)v6 == v5->field_0)
        {
            v13 = arm64g_calculate_condition(3, v10, 36, 0);
            v14 = 4;
            v15 = (v13 & 1 ? (long long)v6[8] : 0);
            v16 = (v13 & 1 ? v5->field_8 : 0);
            v17 = arm64g_calculate_condition(4, v15, v16, 0);
            if (!(v17 & 1))
                goto LABEL_ab95c6;
            goto LABEL_ab95c5;
        }
        v18 = arm64g_calculate_condition(3, v10, 36, 0);
        v14 = 0;
        v15 = (v18 & 1 ? (long long)v6[8] : 0);
        v16 = (v18 & 1 ? v5->field_8 : 0);
        v19 = arm64g_calculate_condition(0, v15, v16, 0);
        if (v19 & 1)
        {
LABEL_ab95c5:
            v20 = arm64g_calculate_condition(v14, v15, v16, 0);
            v21 = 4;
            v22 = (v20 & 1 ? (long long)v6[16] : 0);
            v23 = (v20 & 1 ? *(long long *)&v5->padding_10[0] : 0);
            v24 = arm64g_calculate_condition(4, v22, v23, 0);
            if (!(v24 & 1))
                goto LABEL_ab95ca;
            goto LABEL_ab95c9;
        }
LABEL_ab95c6:
        v25 = arm64g_calculate_condition(v14, v15, v16, 0);
        v21 = 0;
        v22 = (v25 & 1 ? (long long)v6[16] : 0);
        v23 = (v25 & 1 ? *(long long *)&v5->padding_10[0] : 0);
        v26 = arm64g_calculate_condition(0, v22, v23, 0);
        if (v26 & 1)
        {
LABEL_ab95c9:
            v27 = arm64g_calculate_condition(v21, v22, v23, 0);
            v28 = 4;
            v29 = (v27 & 1 ? (long long)v6[24] : 0);
            v30 = (v27 & 1 ? *(long long *)&v5->padding_10[8] : 0);
            v31 = arm64g_calculate_condition(4, v29, v30, 0);
            if (!(v31 & 1))
                goto LABEL_ab95ce;
            goto LABEL_ab95cd;
        }
LABEL_ab95ca:
        v32 = arm64g_calculate_condition(v21, v22, v23, 0);
        v28 = 0;
        v29 = (v32 & 1 ? (long long)v6[24] : 0);
        v30 = (v32 & 1 ? *(long long *)&v5->padding_10[8] : 0);
        v33 = arm64g_calculate_condition(0, v29, v30, 0);
        if (v33 & 1)
        {
LABEL_ab95cd:
            v34 = arm64g_calculate_condition(v28, v29, v30, 0);
            v35 = arm64g_calculate_condition(4, (v34 & 1 ? v11 : 0), (v34 & 1 ? v12 : 0), 0);
            if (!(v35 & 1))
                goto LABEL_ab95d4;
            goto LABEL_ab9818;
        }
        else
        {
LABEL_ab95ce:
            v36 = arm64g_calculate_condition(v28, v29, v30, 0);
            v37 = arm64g_calculate_condition(0, (v36 & 1 ? v11 : 0), (v36 & 1 ? v12 : 0), 0);
            if (!(v37 & 1))
            {
LABEL_ab95d4:
                sub_a368c8();
                v38 = 390;
                goto LABEL_ab9564;
            }
        }
    }
    if ((unsigned int)a0 != 95 || v7 != 18 || *(char *)v6 != 4 || (char)v6[1] != 16)
    {
        v47 = v7;
        if (ptr)
        {
            v40 = 0;
            if ((int)a0 > 673)
            {
                if (1095 >= (int)a0)
                {
                    if (1093 >= (int)a0)
                    {
                        if ((unsigned int)a0 == 674)
                            goto LABEL_ab9694;
                        if ((unsigned int)a0 == 675)
                            goto LABEL_ab967c;
                    }
                    else
                    {
                        if ((unsigned int)a0 != 1094)
                        {
                            if ((unsigned int)a0 != 1095)
                            {
                                sub_a6c4e8(v0);
                                sub_a6c4e8(v6, a6, "crypto/rsa/rsa_sign.c", 456);
                                return 0;
                            }
LABEL_ab9674:
                            v4 = (void*)32;
                            goto LABEL_ab96a8;
                        }
                        else
                        {
LABEL_ab967c:
                            v4 = (void*)28;
                            goto LABEL_ab96a8;
                        }
                    }
                }
                else
                {
                    if (1097 >= (int)a0)
                    {
                        if ((unsigned int)a0 == 1096)
                            goto LABEL_ab967c;
                        if ((unsigned int)a0 == 1097)
                            goto LABEL_ab9674;
                    }
                    else
                    {
                        if ((unsigned int)a0 != 1098)
                        {
                            if ((unsigned int)a0 != 1099)
                            {
                                sub_a6c4e8(v0);
                                sub_a6c4e8(v6, a6, "crypto/rsa/rsa_sign.c", 456);
                                return 0;
                            }
LABEL_ab9694:
                            v4 = (void*)64;
                            goto LABEL_ab96a8;
                        }
                        else
                        {
LABEL_ab969c:
                            v4 = (void*)48;
                            goto LABEL_ab96a8;
                        }
                    }
                }
            }
            else
            {
                v4 = (void*)16;
                if ((int)a0 > 116)
                {
                    if (671 >= (int)a0)
                    {
                        if ((unsigned int)a0 == 117)
                            goto LABEL_ab96a4;
                        if ((unsigned int)a0 == 0x101)
                            goto LABEL_ab96a8;
                    }
                    else
                    {
                        if ((unsigned int)a0 == 672)
                            goto LABEL_ab9674;
                        if ((unsigned int)a0 == 673)
                            goto LABEL_ab969c;
                    }
                }
                else
                {
                    if ((unsigned int)a0 == 4)
                        goto LABEL_ab96a8;
                    if ((unsigned int)a0 != 64)
                    {
                        if ((unsigned int)a0 == 95)
                            goto LABEL_ab96a8;
                    }
                    else
                    {
LABEL_ab96a4:
                        v4 = (void*)20;
LABEL_ab96a8:
                        if (v4 > v7)
                        {
                            sub_a368c8();
                            sub_a369bc("crypto/rsa/rsa_sign.c", 429, "ossl_rsa_verify");
                            v46 = 143;
                            goto LABEL_ab96d4;
                        }
                        else
                        {
                            v5 = v6 + v47 - (unsigned long long)v4;
                            goto LABEL_ab973c;
                        }
                    }
                }
            }
        }
        else
        {
LABEL_ab973c:
            n = v4;
            if (!sub_ab915c(&v0, &v1, a0, v5, n))
            {
LABEL_ab96e0:
                v40 = 0;
            }
            else
            {
                if (v1 != v47 || _memcmp(v0, v6, v47))
                {
                    sub_a368c8();
                    sub_a369bc("crypto/rsa/rsa_sign.c", 441, "ossl_rsa_verify");
                    sub_a36abc(4, 104, 0);
                    v40 = 0;
                }
                else
                {
                    if (ptr)
                    {
                        _memcpy(ptr, v5, n);
                        *a4 = n;
                    }
                    v40 = 1;
                }
            }
        }
    }
    else if (ptr)
    {
        *(int128_t *)ptr = (int128_t)v6[2];
        v9 = 16;
LABEL_ab9490:
        *a4 = v9;
        v40 = 1;
    }
    else
    {
        v41 = v4;
        if (v4 != 16)
        {
            sub_a368c8();
            v39 = 405;
LABEL_ab9640:
            sub_a369bc("crypto/rsa/rsa_sign.c", v39, "ossl_rsa_verify");
            v46 = 131;
LABEL_ab96d4:
            sub_a36abc(4, v46, 0);
            goto LABEL_ab96dc;
        }
        if (v5->field_0 == (long long)v6[2])
        {
            v42 = arm64g_calculate_condition(3, v41, 16, 0);
            v43 = arm64g_calculate_condition(4, (v42 & 1 ? v5->field_8 : 0), (v42 & 1 ? (long long)v6[10] : 0), 0);
            if (!(v43 & 1))
                goto LABEL_ab97fc;
        }
        else
        {
            v44 = arm64g_calculate_condition(3, v41, 16, 0);
            v45 = arm64g_calculate_condition(0, (v44 & 1 ? v5->field_8 : 0), (v44 & 1 ? (long long)v6[10] : 0), 0);
            if (!(v45 & 1))
            {
LABEL_ab97fc:
                sub_a368c8();
                v38 = 410;
LABEL_ab9564:
                sub_a369bc("crypto/rsa/rsa_sign.c", v38, "ossl_rsa_verify");
                v46 = 104;
                goto LABEL_ab96d4;
            }
        }
LABEL_ab9818:
        v40 = 1;
    }
    sub_a6c4e8(v0);
    sub_a6c4e8(v6, a6, "crypto/rsa/rsa_sign.c", 456);
    return v40;
}
