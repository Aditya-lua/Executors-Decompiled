/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c2158..0x9c2890 (1848 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c2158_0 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned long long field_8;
} st_9c2158_0;

extern long long g_9c2a34;
extern unsigned long long g_9c2af0;
extern char _NSHomeDirectory;

unsigned long long sub_9c2158(st_9c2158_0 **a0, char *a1, unsigned long long a2, unsigned long long a3, unsigned long long a4, long long a5, long long a6)
{
    char *iter;  // x25
    st_9c2158_0 **v7;  // x21
    unsigned long v16;  // cc_op
    unsigned long v17;  // cc_dep1
    unsigned long v18;  // cc_dep2
    unsigned long v19;  // cc_ndep
    unsigned long long v20;  // 4110
    unsigned long long v21;  // 4102
    unsigned long long v8;  // 4190
    unsigned long long v22;  // 4110
    unsigned long long v23;  // 4102
    unsigned long long len;  // x22
    long long v24;  // x8
    char *v25;  // x24
    unsigned long long v26;  // x23
    unsigned long v27;  // x19
    char *v28;  // x24
    unsigned long long v29;  // x0
    unsigned long v30;  // x8
    unsigned long v31;  // x25
    unsigned long long v32;  // x8
    long long v10;  // x1
    unsigned long long v34;  // 4110
    unsigned long long v35;  // x8
    unsigned long long v36;  // 4110
    unsigned long long v37;  // 4110
    unsigned long long v38;  // 4110
    unsigned long long v40;  // x8
    unsigned long v41;  // cc_dep1
    unsigned long long v42;  // x0
    unsigned long long v43;  // 4110
    unsigned long long v11;  // w27
    unsigned long long v44;  // 4110
    int v45;  // w19
    st_9c2158_0 *v46;  // x24
    st_9c2158_0 *v47;  // x23
    unsigned long long v48;  // x0
    long long v49;  // x1
    unsigned long long v50;  // x25
    long long v51;  // x1
    unsigned long v52;  // x8
    unsigned long long v12;  // x26
    unsigned long long v13;  // x26
    unsigned long long v14;  // x0
    unsigned long long v15;  // x9
    long long v0;  // [bp-0x90]
    char *v1;  // [bp-0x78]
    unsigned long long v2;  // [bp-0x6c]
    unsigned long v3;  // [bp-0x68], Other Possible Types: unsigned long long
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    iter = a1;
    v7 = a0;
    v2 = 0;
    v8 = arm64g_calculate_condition(1, a2 & 0xffffffff, 1, 0);
    if (!(v8 & 1))
    {
        len = a2;
        if (!(a2 >> 31 & 1))
        {
            if (!a4)
                a4 = 10246;
            if ((unsigned int)len == 0x7fffffff)
            {
                sub_a368c8();
                v10 = 69;
                goto LABEL_9c228c;
            }
            goto LABEL_9c21fc;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/asn1/a_mbstr.c", 66, "ASN1_mbstring_ncopy");
        }
    }
    else
    {
        len = _strlen(iter);
        if (0x7ffffffe >= len)
        {
            if (!a4)
                a4 = 10246;
LABEL_9c21fc:
            if (4097 >= (int)a3)
            {
                if ((unsigned int)a3 != 0x1000)
                {
                    v11 = (unsigned int)len;
                    if ((unsigned int)a3 != 4097)
                        goto LABEL_9c22c4;
                    goto LABEL_9c23c8;
                }
                else
                {
                    v1 = iter;
                    v11 = 0;
                    if ((unsigned int)len)
                    {
                        v12 = len;
                        do
                        {
                            v13 = v12;
                            v14 = sub_9c5604(iter, v13, &v3);
                            if (v14 >> 31 & 1)
                            {
LABEL_9c239c:
                                sub_a368c8();
                                sub_a369bc("crypto/asn1/a_mbstr.c", 97, "ASN1_mbstring_ncopy");
                                sub_a36abc();
                                return 0xffffffff;
                            }
                            v15 = v3 & 0xfffffffffffff800;
                            if (v3 <= 0x10ffff)
                            {
                                v20 = arm64g_calculate_condition(v16 | 144, v17, v18, v19);
                                v21 = arm64g_calculate_condition(4, (v20 & 1 ? v15 : 0x40000000), (v20 & 1 ? 0xd800 : 0), 0);
                                if (!(v21 & 1))
                                    continue;
                                goto LABEL_9c239c;
                            }
                            v22 = arm64g_calculate_condition(v16 | 144, v17, v18, v19);
                            v23 = arm64g_calculate_condition(0, (v22 & 1 ? v15 : 0x40000000), (v22 & 1 ? 0xd800 : 0), 0);
                            if (v23 & 1)
                                goto LABEL_9c239c;
                        } while ((iter = &iter[v14 & 0xffffffff], v11 += 1, v12 = v13 - v14, (unsigned int)v13 != (unsigned int)v14));
                    }
                    iter = v1;
                    goto LABEL_9c23c8;
                }
            }
            if ((unsigned int)a3 != 4100)
            {
                if ((unsigned int)a3 != 4098)
                {
LABEL_9c22c4:
                    sub_a368c8();
                    sub_a369bc("crypto/asn1/a_mbstr.c", 107, "ASN1_mbstring_ncopy");
                }
                else if (!(len & 1))
                {
                    v11 = (unsigned int)len >> 1;
LABEL_9c23c8:
                    v24 = v11;
                    if (a5 >= 1 && a5 > v24)
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/asn1/a_mbstr.c", 112, "ASN1_mbstring_ncopy");
                        v0 = a5;
                        sub_a36abc();
                        return 0xffffffff;
                    }
                    if (a6 >= 1 && v24 > a6)
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/asn1/a_mbstr.c", 118, "ASN1_mbstring_ncopy");
                        v0 = a6;
                        sub_a36abc();
                        return 0xffffffff;
                    }
                    v1 = iter;
                    if ((unsigned int)len)
                    {
                        v25 = v1;
                        v26 = len;
                        do
                        {
                            if ((unsigned int)a3 == 4100)
                            {
                                v3 = *v25 * &_NSHomeDirectory;
                                v3 |= v25[1] * 0x10000;
                                v3 |= v25[2] * 0x100;
                                v28 = v25 + 4;
                                v27 = v3 | v25[3];
                                v3 = v27;
                                v26 = (unsigned int)v26 - 4;
                            }
                            else if ((unsigned int)a3 == 4098)
                            {
                                v30 = *v25;
                                v3 = v30 * 0x100;
                                v28 = v25 + 2;
                                v27 = (v25[1] | (v30 * 0x100 | v30 >> 56) & 0xff00) & 0xffff;
                                v3 = v27;
                                v26 = (unsigned int)v26 - 2;
                            }
                            else if ((unsigned int)a3 == 4097)
                            {
                                v27 = *v25;
                                v28 = v25 + 1;
                                v3 = v27;
                                v26 = (unsigned int)v26 - 1;
                            }
                            else
                            {
                                v29 = sub_9c5604(v25, v26, &v3);
                                if (v29 >> 31 & 1)
                                    goto LABEL_9c261c;
                                v26 -= v29;
                                v28 = &v25[v29 & 0xffffffff];
                                v27 = v3;
                            }
                            if (v27 < 0x7fffffff)
                                v31 = v27;
                            else
                                v31 = 0x7fffffff;
                            v32 = a4 & 10519;
                            if (v32 != a4)
                                v32 |= 0x2000;
                            if (v32 & 1)
                            {
                                if (!sub_a69974(v31))
                                {
                                    v34 = arm64g_calculate_condition(v16, v17, v18, v19);
                                    v35 = v32 & 10518;
                                    v36 = arm64g_calculate_condition(4, (v34 & 1 ? v27 : 0x40000000), (v34 & 1 ? 32 : 0), 0);
                                    if (!(v36 & 1))
                                        goto LABEL_9c256e;
                                }
                                else
                                {
                                    v37 = arm64g_calculate_condition(v16, v17, v18, v19);
                                    v35 = v32 & 10518;
                                    v38 = arm64g_calculate_condition(0, (v37 & 1 ? v27 : 0x40000000), (v37 & 1 ? 32 : 0), 0);
                                    if (!(v38 & 1))
                                    {
LABEL_9c256e:
                                        v32 = v35;
                                        goto LABEL_9c2570;
                                    }
                                }
                                goto LABEL_9c2570;
                            }
                            else
                            {
LABEL_9c2570:
                                if (v32 >> 1 & 1 && !sub_a6994c(v31, 0x800))
                                    v32 &= 0xfffffffffffffffd;
                                if (v27 >= 128)
                                    v32 &= 0xffffffffffffffef;
                                if (0xff < v27)
                                    v32 &= 0xfffffffffffffffb;
                                a4 = v32 & 0xfffffffffffff7ff;
                                if (v27 <= 0xffff)
                                    a4 = v32;
                                if (!(a4 >> 13 & 1))
                                {
                                    v40 = a4;
                                }
                                else
                                {
                                    v40 = a4 & 0xffffffffffffdfff;
                                    if (0x10ffff >= v27 && (v27 & 0xfffffffffffff800) != 0xd800)
                                        continue;
                                }
                                a4 = v40;
                                if (!a4)
                                {
LABEL_9c261c:
                                    sub_a368c8();
                                    sub_a369bc("crypto/asn1/a_mbstr.c", 125, "ASN1_mbstring_ncopy");
                                    sub_a36abc();
                                    return 0xffffffff;
                                }
                            }
                        } while ((v3 = v3, (unsigned int)v26));
                    }
                    if (a4 & 1)
                    {
                        v45 = 4097;
                        v42 = 18;
                    }
                    else if (a4 >> 1 & 1)
                    {
                        v45 = 4097;
                        v42 = 19;
                    }
                    else if (a4 >> 4 & 1)
                    {
                        v45 = 4097;
                        v42 = 22;
                    }
                    else if (a4 >> 2 & 1)
                    {
                        v45 = 4097;
                        v42 = 20;
                    }
                    else if (!(a4 >> 11 & 1))
                    {
                        v41 = a4 & 0x100;
                        if (!(a4 & 0x100))
                        {
                            v42 = 12;
                            v43 = arm64g_calculate_condition(10, v41, 0, 0);
                            if (!(v43 & 1))
                                goto LABEL_9c260a;
LABEL_9c2609:
                            v45 = 0x1000;
                        }
                        else
                        {
                            v42 = 28;
                            v44 = arm64g_calculate_condition(10, v41, 0, 0);
                            if (v44 & 1)
                                goto LABEL_9c2609;
LABEL_9c260a:
                            v45 = 4100;
                        }
                    }
                    else
                    {
                        v45 = 4098;
                        v42 = 30;
                    }
                    if (!v7)
                        return v42;
                    v46 = *v7;
                    if (v46)
                    {
                        sub_9c79a0(v46, 0, 0);
                        v46->field_4 = v42;
                        v47 = v46;
                        goto LABEL_9c26ac;
                    }
                    else
                    {
                        v48 = sub_9c79e8();
                        if (v48)
                        {
                            v47 = v48;
                            *v7 = v48;
LABEL_9c26ac:
                            if (v45 == (unsigned int)a3)
                            {
                                if (sub_9c7770(v47, v1, len))
                                    return v42;
                                if (!v46)
                                {
                                    sub_9c7940(v47);
                                    *v7 = 0;
                                }
                                sub_a368c8();
                                v49 = 175;
                                goto LABEL_9c2784;
                            }
                            else
                            {
                                v50 = 0;
                                if (4097 < v45)
                                {
                                    switch (v45)
                                    {
                                    case 4098:
                                        if (v11 >= 0x40000000)
                                        {
                                            sub_a368c8();
                                            v51 = 190;
LABEL_9c27ec:
                                            sub_a369bc("crypto/asn1/a_mbstr.c", v51, "ASN1_mbstring_ncopy");
                                            sub_a36abc(13, 151, 0);
                                            if (v46)
                                                return 0xffffffff;
                                            goto LABEL_9c2880;
                                        }
                                        else
                                        {
                                            v2 = v11 * 2;
                                            v50 = "(";
                                            break;
                                        }
                                    case 4100:
                                        if (v11 >= 0x20000000)
                                        {
                                            sub_a368c8();
                                            v51 = 203;
                                            goto LABEL_9c27ec;
                                        }
                                        else
                                        {
                                            v2 = v11 * 4;
                                            v50 = "(";
                                            break;
                                        }
                                    default:
                                        break;
                                    }
                                }
                                else if (v45 == 0x1000)
                                {
                                    v2 = 0;
                                    if (sub_9c2890(v1, len, a3, &g_9c2a34, &v2) >> 31 & 1)
                                        goto LABEL_9c287c;
                                    v50 = &g_9c2af0;
                                }
                                else if (v45 == 4097)
                                {
                                    v2 = v11;
                                    v50 = "(";
                                }
                                v3 = sub_a6bf4c(v2 + 1, "crypto/asn1/a_mbstr.c", 227);
                                if (v3)
                                {
                                    v52 = v2;
                                    v47->field_0 = v52;
                                    v47->field_8 = v3;
                                    *(char *)(v3 + v52) = 0;
                                    sub_9c2890(v1, len, a3, v50, &v3);
                                    return v42;
                                }
LABEL_9c287c:
                                if (v46)
                                    return 0xffffffff;
LABEL_9c2880:
                                sub_9c7940(v47);
                                *v7 = 0;
                                return 0xffffffff;
                            }
                            goto LABEL_9c2784;
                        }
                        else
                        {
                            sub_a368c8();
                            v49 = 163;
LABEL_9c2784:
                            sub_a369bc("crypto/asn1/a_mbstr.c", v49, "ASN1_mbstring_ncopy");
                        }
                    }
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("crypto/asn1/a_mbstr.c", 78, "ASN1_mbstring_ncopy");
                }
            }
            else
            {
                if (len & 3)
                {
                    sub_a368c8();
                    sub_a369bc("crypto/asn1/a_mbstr.c", 86, "ASN1_mbstring_ncopy");
                }
                else
                {
                    v11 = (unsigned int)len >> 2;
                    goto LABEL_9c23c8;
                }
            }
        }
        else
        {
            sub_a368c8();
            v10 = 58;
LABEL_9c228c:
            sub_a369bc("crypto/asn1/a_mbstr.c", v10, "ASN1_mbstring_ncopy");
        }
    }
    sub_a36abc();
    return 0xffffffff;
}
