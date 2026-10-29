/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cba74..0x9cc2f8 (2180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9cba74_0 {
    char padding_0[4];
    unsigned int field_4;
    struct st_9cba74_0 *field_8;
} st_9cba74_0;

typedef struct st_9cba74_3 {
    char field_0;
} st_9cba74_3;


unsigned long long sub_9cba74(st_9cba74_0 **a0, st_9cba74_3 **a1, long long a2, void* a3, unsigned long long a4, unsigned int a5, unsigned int a6, unsigned int a7)
{
    st_9cba74_0 **v15;  // x20
    unsigned long long v16;  // 4117
    unsigned long long v25;  // x0
    unsigned long long v26;  // 4112
    unsigned long long v27;  // 4112
    char *v28;  // x22
    unsigned int v29;  // w8
    unsigned int v30;  // x23
    char *v31;  // x24
    unsigned int v32;  // w25
    unsigned int v33;  // w25
    char *v34;  // x8
    unsigned long long v17;  // 4123
    unsigned long long v35;  // 4112
    long long v36;  // x20
    long long v37;  // x19
    unsigned int v38;  // x23
    char *v39;  // x8
    unsigned int v40;  // x0
    unsigned int v41;  // x26
    unsigned long v42;  // x24
    unsigned long long v43;  // 4110
    st_9cba74_0 *v44;  // x21
    unsigned int v45;  // x0
    unsigned int v46;  // x25
    long long v47;  // x1
    st_9cba74_0 *v48;  // x0
    unsigned long v20;  // cc_dep1
    unsigned long long v21;  // 4116
    unsigned int v22;  // w9
    unsigned long long v23;  // 4108
    unsigned long long v24;  // 4108
    long long v0;  // [bp-0xc0], Other Possible Types: unsigned long
    unsigned long long v1;  // [bp-0xb8]
    unsigned int v2;  // [bp-0xb0]
    unsigned int v3;  // [bp-0xa0]
    char *v4;  // [bp-0x88]
    unsigned int v5;  // [bp-0x7b]
    char v6;  // [bp-0x7a]
    unsigned int v7;  // [bp-0x79]
    long long v8;  // [bp-0x78]
    unsigned int v9;  // [bp-0x6c]
    char *v10;  // [bp-0x68]
    unsigned int v11;  // [bp-0x59]
    char *v12;  // [bp-0x58], Other Possible Types: char
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    v15 = a0;
    v5 = 0;
    v2 = 0;
    v3 = 0;
    if (*(char *)a3 == 5)
    {
        v9 = a4;
        v16 = arm64g_calculate_condition(0x11, a4 & 0xffffffff, 4, 0);
        if (!(v16 & 1))
        {
            a4 = 0xffffffff;
            goto LABEL_9cbb0c;
        }
        else
        {
            a4 = 0xffffffff;
        }
    }
    else
    {
        v9 = (int)a3[8];
        v17 = arm64g_calculate_condition(0x11, (int)a3[8], 4, 0);
        if (!(v17 & 1))
        {
            if (!(a4 >> 31 & 1))
            {
                sub_a368c8();
                sub_a369bc("crypto/asn1/tasn_dec.c", 753, "asn1_d2i_ex_primitive");
                sub_a36abc(13, 127, 0);
                return 0;
            }
LABEL_9cbb0c:
            if (a6)
            {
                sub_a368c8();
                sub_a369bc("crypto/asn1/tasn_dec.c", 757, "asn1_d2i_ex_primitive");
                sub_a36abc(13, 126, 0);
                return 0;
            }
            v4 = *a1;
            *((char *)&v0 + 4) = 0;
            *(unsigned int *)&v0 = 0;
            if (!sub_9cc2f8(0, &v9, &v12, 0, 0, &v4, a2, 0xffffffff, v0, a7))
            {
                sub_a368c8();
                sub_a369bc("crypto/asn1/tasn_dec.c", 764, "asn1_d2i_ex_primitive");
                sub_a36abc(13, 0x8010a, 0);
                return 0;
            }
            if (*&v12)
                v9 = 0xfffffffd;
        }
    }
    v20 = a4 & 0xffffffff;
    v21 = arm64g_calculate_condition(1, a4 & 0xffffffff, 1, 0);
    if (v21 & 1)
    {
        v22 = 0;
        v23 = arm64g_calculate_condition(1, v20, 1, 0);
        if (!(v23 & 1))
            goto LABEL_9cbbd6;
LABEL_9cbbd5:
    }
    else
    {
        v22 = a5;
        v24 = arm64g_calculate_condition(1, v20, 1, 0);
        if (v24 & 1)
            goto LABEL_9cbbd5;
LABEL_9cbbd6:
    }
    v4 = *a1;
    v1 = a7;
    *((char *)&v0 + 4) = a6;
    *(unsigned int *)&v0 = v22;
    v25 = sub_9cc2f8();
    v26 = arm64g_calculate_condition(1, v25 & 0xffffffff, 1, 0);
    if (v26 & 1)
        return v25;
    if (!(unsigned int)v25)
    {
        sub_a368c8();
        sub_a369bc("crypto/asn1/tasn_dec.c", 779, "asn1_d2i_ex_primitive");
        sub_a36abc(13, 0x8010a, 0);
        return 0;
    }
    if (2 > v9 - 16)
    {
        if (!v7)
        {
            sub_a368c8();
            sub_a369bc("crypto/asn1/tasn_dec.c", 796, "asn1_d2i_ex_primitive");
            sub_a36abc(13, 156, 0);
            return 0;
        }
        goto LABEL_9cbcb8;
    }
    v27 = arm64g_calculate_condition(0x11, v9, 3, 0);
    if (!(v27 & 1))
    {
        if (a7)
            *(char *)a7 = 0;
LABEL_9cbcb8:
        v28 = *a1;
        v29 = v6;
        if (!v29)
        {
            v38 = v4 - v28 + v8;
            v39 = &v4[v8];
            goto LABEL_9cbe0c;
        }
        v11 = (char)v29;
        v10 = v4;
        if (v8 < 1)
        {
LABEL_9cbd90:
            v37 = 137;
            v36 = 1060;
            goto LABEL_9cbf8c;
        }
        v32 = 1;
        while (v30 != 1 && !*v31 && !v31[1])
        {
            v31 += 2;
            v10 = v31;
            v33 = v32 - 1;
            if (v32 == 1)
                goto LABEL_9cbfc0;
            v32 = v33;
            if (0 >= (long long)(v30 - 2))
            {
LABEL_9cbd8c:
                if (v33)
                    goto LABEL_9cbd90;
LABEL_9cbfc0:
                v4 = v31;
                v38 = v31 - v28;
LABEL_9cbe10:
                v41 = 1;
                goto LABEL_9cbe14;
            }
        }
        *((char *)&v0 + 4) = 0;
        *(unsigned int *)&v0 = 0;
        if (sub_9cc2f8(&v12, 0, 0, &v11, 0, &v10, v30, 0xffffffff, v0, 0))
        {
            if (!v11)
            {
                v34 = &v10[v12];
                v10 = v34;
            }
            else
            {
                v35 = arm64g_calculate_condition(1, v32, 1, 0);
                if (!(v35 & 1))
                {
                    v32 += 1;
                    v34 = v10;
                }
                else
                {
                    v36 = 1050;
LABEL_9cbf84:
                    v37 = 524554;
LABEL_9cbf8c:
                    sub_a368c8();
                    sub_a369bc("crypto/asn1/tasn_dec.c", v36, "asn1_find_end");
                    goto LABEL_9cbfb0;
                }
            }
            v31 = v34;
            v33 = v32;
            if (&v31[v30] - v34 > 0)
                continue;
            goto LABEL_9cbd8c;
        }
        else
        {
            v36 = 1045;
            goto LABEL_9cbf84;
        }
    }
    if (!v7)
    {
        v28 = v4;
        v38 = v8;
        v39 = &v28[v38];
LABEL_9cbe0c:
        v4 = v39;
        goto LABEL_9cbe10;
    }
    if (10 >= v9 && 1 << ((char)v9 & 31) & 1126)
    {
        sub_a368c8();
        sub_a369bc("crypto/asn1/tasn_dec.c", 814, "asn1_d2i_ex_primitive");
        sub_a36abc(13, 195, 0);
        return 0;
    }
    v5 = 1;
    v40 = sub_9cc96c(&v2, &v4, v8, v6, 0);
    if (!v40)
    {
LABEL_9cc130:
        if (v5)
        {
            sub_a6c2e4(*(unsigned long long *)((void*)&v2 + 8), "crypto/asn1/tasn_dec.c", 852);
            return v40;
        }
        return v40;
    }
    v38 = v2;
    if (!sub_9ebee0(&v2, v38 + 1))
    {
        sub_a368c8();
        sub_a369bc("crypto/asn1/tasn_dec.c", 832, "asn1_d2i_ex_primitive");
        v37 = 524295;
LABEL_9cbfb0:
        sub_a36abc(13, v37, 0);
        v40 = 0;
        goto LABEL_9cc130;
    }
    v41 = 0;
    *(char *)(*(unsigned long long *)((void*)&v2 + 8) + v38) = 0;
    v28 = *(unsigned long long *)((void*)&v2 + 8);
LABEL_9cbe14:
    v42 = v9;
    v12 = v28;
    if ((long long)a3[32] && *(long long *)((long long)a3[32] + 40))
    {
        if (v38 == v38)
            (*(long long *)((long long)a3[32] + 40))();
        sub_a368c8();
        sub_a369bc("crypto/asn1/tasn_dec.c", 873, "asn1_ex_c2i");
        sub_a36abc(13, 155, 0);
        goto LABEL_9cc104;
        goto LABEL_9cc104;
    }
    v43 = arm64g_calculate_condition(18, (long long)a3[8], 4, 0);
    if (!(v43 & 1))
    {
        v44 = *v15;
        if (!v44)
        {
            v45 = sub_9cf1f0();
            if (v45)
            {
                v44 = (st_9cba74_0 *)v45;
                *v15 = v45;
                goto LABEL_9cbe7c;
            }
            else
            {
                sub_9cf1fc();
                v40 = 0;
                goto LABEL_9cc130;
            }
        }
        else
        {
LABEL_9cbe7c:
            if (v44->padding_0 != (unsigned int)v42)
                sub_9c536c(v44, v42, 0);
            v46 = (unsigned int)v15;
            v15 = &v44->field_8;
            goto LABEL_9cbeac;
        }
        goto LABEL_9cc130;
    }
    v44 = 0;
    v46 = 0;
LABEL_9cbeac:
    if (4 >= (int)v42)
    {
        if ((unsigned int)v42 != 1)
        {
            if ((unsigned int)v42 == 2)
                goto LABEL_9cbf54;
            if ((unsigned int)v42 != 3)
                goto LABEL_9cc00c;
            if (!sub_9c03b8(v15, &v12, v38))
                goto LABEL_9cc0f4;
            goto LABEL_9cc124;
        }
        if (v38 == 1)
        {
            *(unsigned int *)v15 = *v28;
            goto LABEL_9cc124;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/asn1/tasn_dec.c", 908, "asn1_ex_c2i");
            v47 = 106;
        }
    }
    else if ((unsigned int)v42 != 5)
    {
        if ((unsigned int)v42 == 10)
        {
LABEL_9cbf54:
            if (sub_9c12b0(v15, &v12, v38))
            {
                *v15->field_4 = *v15->field_4 & 0x100 | (unsigned int)v42;
                goto LABEL_9cc114;
            }
            goto LABEL_9cc0f4;
        }
        if ((unsigned int)v42 == 6)
        {
            if (v38 != v38 || !sub_9c32d0(v15, &v12, v38))
                goto LABEL_9cc0f4;
            goto LABEL_9cc124;
        }
LABEL_9cc00c:
        if (v38 == v38)
        {
            if ((unsigned int)v42 == 30 && v38 & 1)
            {
                sub_a368c8();
                sub_a369bc("crypto/asn1/tasn_dec.c", 954, "asn1_ex_c2i");
                v47 = 214;
            }
            else
            {
                if ((unsigned int)v42 == 28 && v38 & 3)
                {
                    sub_a368c8();
                    sub_a369bc("crypto/asn1/tasn_dec.c", 958, "asn1_ex_c2i");
                    v47 = 215;
                }
                else
                {
                    if (14 >= v38 && (unsigned int)v42 == 24)
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/asn1/tasn_dec.c", 962, "asn1_ex_c2i");
                        v47 = 232;
                    }
                    else
                    {
                        if (12 >= v38 && (unsigned int)v42 == 23)
                        {
                            sub_a368c8();
                            sub_a369bc("crypto/asn1/tasn_dec.c", 966, "asn1_ex_c2i");
                            v47 = 233;
                        }
                        else
                        {
                            v48 = *v15;
                            if (v48)
                            {
                                v48->field_4 = v42;
                                goto LABEL_9cc258;
                            }
                            v48 = sub_9c79e8(v42);
                            if (v48)
                            {
                                *v15 = v48;
LABEL_9cc258:
                                if (v41 & 1)
                                {
                                    if (!sub_9c7770())
                                    {
                                        sub_a368c8();
                                        sub_a369bc("crypto/asn1/tasn_dec.c", 987, "asn1_ex_c2i");
                                        sub_a36abc(13, 0x8000d, 0);
                                        sub_9c7940(v48);
                                        *v15 = 0;
LABEL_9cc0f4:
                                        sub_9cf1fc(v44);
                                        if (v46)
                                            *(unsigned long long *)v46 = 0;
LABEL_9cc104:
                                        v40 = 0;
                                        goto LABEL_9cc130;
                                    }
                                }
                                else
                                {
                                    sub_9c79a0();
                                    v5 = 0;
                                }
LABEL_9cc124:
                                *a1 = v4;
                                v40 = 1;
                                goto LABEL_9cc130;
                            }
                            else
                            {
                                sub_a368c8();
                                sub_a369bc("crypto/asn1/tasn_dec.c", 973, "asn1_ex_c2i");
                                v47 = 524301;
                            }
                        }
                    }
                }
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/asn1/tasn_dec.c", 950, "asn1_ex_c2i");
            v47 = 155;
        }
    }
    else if (v38)
    {
        sub_a368c8();
        sub_a369bc("crypto/asn1/tasn_dec.c", 900, "asn1_ex_c2i");
        v47 = 144;
    }
    else
    {
        *v15 = 1;
LABEL_9cc114:
        if ((unsigned int)v42 == 5 && v44)
        {
            v44->field_8 = 0;
            goto LABEL_9cc124;
        }
    }
    sub_a36abc(13, v47, 0);
    goto LABEL_9cc0f4;
}
