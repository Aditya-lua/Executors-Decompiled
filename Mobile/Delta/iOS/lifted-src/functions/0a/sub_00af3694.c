/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf3694..0xaf3ae0 (1100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af3694_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned long long field_8;
} st_af3694_0;

typedef struct st_af3694_1 {
    long long field_0;
    struct st_af3694_0 *field_8;
    unsigned int field_10;
} st_af3694_1;

typedef struct st_af3694_2 {
    char field_0;
    unsigned short field_1;
    char field_2;
} st_af3694_2;

extern char g_10002b0;

unsigned int sub_af3694(unsigned int a0, unsigned int a1, unsigned long long a2)
{
    unsigned int ptr;  // x19
    unsigned long long v10;  // x20
    unsigned int v19;  // w0
    st_af3694_0 *v20;  // x8
    unsigned int v21;  // x22
    unsigned long v22;  // cc_dep1
    unsigned int v23;  // w27
    unsigned long v24;  // x8
    unsigned long long v25;  // 4112
    unsigned long long v26;  // 4102
    unsigned long long v27;  // 4112
    unsigned long long v28;  // 4102
    long long v11;  // x22
    unsigned long v29;  // cc_dep1
    unsigned long v30;  // x9
    unsigned long long v31;  // 4110
    unsigned long long v32;  // 4102
    unsigned long long v33;  // 4110
    unsigned long long v34;  // 4102
    unsigned int v35;  // x9
    uint128_t v36;  // q0
    unsigned int v37;  // x10
    unsigned int v38;  // w9
    unsigned int v12;  // x0
    unsigned int v39;  // w11
    unsigned long long v40;  // 4148
    unsigned int v41;  // w9
    unsigned int v42;  // w21
    unsigned long v43;  // x8
    unsigned int *v44;  // x28
    unsigned int v45;  // x8
    st_af3694_2 *v46;  // x26
    unsigned short *iter;  // x26
    unsigned int v48;  // x20
    unsigned int idx;  // x20
    unsigned long v49;  // x27
    unsigned int v50;  // w1
    long long v51;  // x19
    unsigned int v52;  // x0
    unsigned long n;  // x20
    unsigned int v14;  // w28
    unsigned int v15;  // x24
    unsigned int v16;  // w19
    st_af3694_1 *v17;  // x25
    unsigned int v18;  // x26
    uint128_t v0;  // [bp-0x100]
    unsigned long long v1;  // [bp-0xe8]
    unsigned int v2;  // [bp-0xe0]
    unsigned int v3;  // [bp-0xd8]
    char v4;  // [bp-0xd0]
    uint128_t v5;  // [bp-0x80]
    unsigned long v6;  // [bp-0x70]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    ptr = a1;
    v6 = *(long long *)&g_10002b0;
    if (a1)
    {
        v10 = a2;
        if (!(unsigned int)a2)
            goto LABEL_af39dc;
        if (!a0)
            goto LABEL_af3a38;
        v3 = 0;
        goto LABEL_af3718;
    }
    v11 = 524295;
    v12 = sub_9ebce0();
    if (v12)
    {
        idx = v12;
        if (!sub_9ebd68())
            goto LABEL_af39a4;
        *(char *)*(long long *)(idx + 8) = 0;
        if (a0)
        {
            v3 = idx;
            v10 = 200;
LABEL_af3718:
            v2 = ptr;
            if ((int)sub_ad69e4(*(long long *)a0) >= 1)
            {
                v1 = v10;
                v14 = 0;
                v15 = 0;
                v16 = 0xffffffff;
                v0 = 0x1000000000000000000000000;
                while (1)
                {
                    v17 = sub_ad69f8(*(long long *)a0, v15);
                    if (!sub_a99eac(v17->field_0) || (v18 = sub_a9976c(), !v18))
                    {
                        v18 = (unsigned int)&v4;
                        sub_9c3058(&v4, 80, v17->field_0);
                    }
                    v19 = _strlen(v18);
                    v20 = v17->field_8;
                    v21 = v20->field_0;
                    v22 = v21 & 0xffffffff;
                    if (0x100000 < (int)v21)
                    {
                        v11 = 134;
                        v51 = 75;
                        idx = v3;
                        break;
                    }
                    v23 = v19;
                    v24 = v20->field_8;
                    if (!(v21 & 3))
                    {
                        v25 = arm64g_calculate_condition(3, v22, 0x100000, 0);
                        v26 = arm64g_calculate_condition(19, (v25 & 1 ? v20->field_4 : 0), (v25 & 1 ? 27 : 0), 0);
                        if (!(v26 & 1))
                            goto LABEL_af37dc;
                        goto LABEL_af383c;
                    }
                    else
                    {
                        v27 = arm64g_calculate_condition(3, v22, 0x100000, 0);
                        v28 = arm64g_calculate_condition(16, (v27 & 1 ? v20->field_4 : 0), (v27 & 1 ? 27 : 0), 0);
                        if (v28 & 1)
                            goto LABEL_af383c;
LABEL_af37dc:
                        v5 = 0;
                        v29 = v21 & 0xffffffff;
                        if ((int)v21 >= 1)
                        {
                            v30 = v21 - 5;
                            if (8 <= v21)
                            {
                                v31 = arm64g_calculate_condition(35, v29, 1, 0);
                                v32 = arm64g_calculate_condition(130, (v31 & 1 ? v30 : 0), (v31 & 1 ? 5 : 0), 0);
                                if (v32 & 1)
                                    goto LABEL_af3ac4;
                            }
                            else
                            {
                                v33 = arm64g_calculate_condition(35, v29, 1, 0);
                                v34 = arm64g_calculate_condition(128, (v33 & 1 ? v30 : 0), (v33 & 1 ? 5 : 0), 0);
                                if (v34 & 1)
                                {
LABEL_af3ac4:
                                    if (16 > v21)
                                    {
                                        while (1)
                                        ;
                                    }
                                    else
                                    {
                                        while (1)
                                        ;
                                    }
                                }
                            }
                            v35 = 0;
                            do
                            {
                                if (*(char *)(v24 + v35))
                                    *(unsigned int *)(&v5 | (&v5 & 0xfffffffffffffff3 | (v35 * 4 | v35 >> 62) & 12) & 15) = 1;
                            } while ((v35 += 1, v21 != v35));
                            if (!*(unsigned int *)((void*)&v5 + 4) && !*(unsigned int *)&v5 && !*(unsigned int *)((void*)&v5 + 8))
                                goto LABEL_af3844;
LABEL_af383c:
                            v36 = CONCAT(4294967297, 4294967297);
                            goto LABEL_af3848;
                        }
                        else
                        {
LABEL_af3844:
                            v36 = v0;
LABEL_af3848:
                            v5 = v36;
                            if ((int)v21 >= 1)
                            {
                                v37 = 0;
                                v38 = 0;
                                do
                                {
                                    if (*(int *)(&v5 | (&v5 & 0xfffffffffffffff3 | (v37 * 4 | v37 >> 62) & 12) & 15))
                                    {
                                        v39 = *(char *)(v24 + v37);
                                        v40 = arm64g_calculate_condition(49, v39 - 127, 95, 0);
                                        if (v40 & 1)
                                            v41 = v38 + 4;
                                        else
                                            v41 = v38 + 1;
                                        if ((v39 | 4) == 47)
                                            v38 += 2;
                                        else
                                            v38 = v41;
                                    }
                                } while ((v37 += 1, v21 != v37));
                            }
                            else
                            {
                                v38 = 0;
                            }
                            v42 = v14 + v23 + v38 + 2;
                            if (0x100000 >= (int)v42)
                            {
                                idx = v3;
                                if (!idx)
                                {
                                    v43 = v2;
                                    if ((int)v1 <= (int)v42)
                                        goto LABEL_af3a0c;
                                }
                                else if (sub_9ebd68(idx, v42 + 1))
                                {
                                    v43 = *(long long *)(idx + 8);
                                }
                                else
                                {
                                    v51 = 175;
                                    v11 = 524295;
                                    break;
                                }
                                v44 = v43 + v14;
                                if (v16 == v17->field_10)
                                    v45 = 43;
                                else
                                    v45 = 47;
                                *(char *)v44 = v45;
                                _memcpy();
                                v46 = (char *)v44 + v23 + 1;
                                v46->field_0 = 61;
                                iter = &(&v46->field_0)[1];
                                if ((int)v21 >= 1)
                                {
                                    v48 = 0;
                                    v49 = v17->field_8->field_8;
                                    do
                                    {
                                        if (*(int *)(&v5 | (&v5 & 0xfffffffffffffff3 | (v48 * 4 | v48 >> 62) & 12) & 15))
                                        {
                                            v50 = *(char *)(v49 + v48);
                                            if ((char)v50 - 127 <= 160)
                                            {
                                                *iter = 30812;
                                                iter = (char *)iter + sub_a6e2d0(iter + 1) + 1;
                                            }
                                            else
                                            {
                                                if ((v50 & 123) == 43)
                                                {
                                                    *(char *)iter = 92;
                                                    iter = (char *)iter + 1;
                                                }
                                                *(char *)iter = v50;
                                                iter = (char *)iter + 1;
                                            }
                                        }
                                    } while ((v48 += 1, v21 != v48));
                                }
                                *(char *)iter = 0;
                                v16 = v17->field_10;
                                v15 += 1;
                                v14 = v42;
                                if ((int)sub_ad69e4(*(long long *)a0) <= (int)v15)
                                    goto LABEL_af39e8;
                            }
                            else
                            {
                                v11 = 134;
                                v51 = 116;
                                idx = v3;
                                break;
                            }
                        }
                    }
                }
LABEL_af39a8:
                sub_a368c8();
                sub_a369bc("crypto/x509/x509_obj.c", v51, "X509_NAME_oneline");
                sub_a36abc(11, v11, 0);
                sub_9ebcf4(idx);
LABEL_af39dc:
                ptr = 0;
            }
            else
            {
                v15 = 0;
LABEL_af39e8:
                v52 = v3;
                if (v52)
                {
                    ptr = *(long long *)(v52 + 8);
                    sub_a6c2e4(v52, "crypto/x509/x509_obj.c", 168);
                    if (!v15)
                        goto LABEL_af3a14;
                }
                else
                {
LABEL_af3a0c:
                    ptr = v2;
                    if (!v15)
                    {
LABEL_af3a14:
                        *(char *)ptr = 0;
                    }
                }
            }
        }
        else
        {
            ptr = *(long long *)(idx + 8);
            sub_a6c2e4(idx, "crypto/x509/x509_obj.c", 54);
            v10 = 200;
LABEL_af3a38:
            n = (int)v10;
            _strncpy(ptr, "NO X509_NAME", n);
            *(char *)(n + ptr - 1) = 0;
        }
    }
    else
    {
        idx = 0;
LABEL_af39a4:
        v51 = 175;
        goto LABEL_af39a8;
    }
    if (*(long long *)&g_10002b0 == v6)
        return ptr;
    ___stack_chk_fail();
}
