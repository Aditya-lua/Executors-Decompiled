/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa33e0..0xaa3ab4 (1748 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa33e0_3 {
    unsigned int field_0;
    char padding_4[4];
    char field_8;
    char padding_9[7];
    char field_10;
} st_aa33e0_3;

typedef struct st_aa33e0_6 {
    char padding_0[24];
    long long field_18;
    struct st_aa33e0_0 *field_20;
} st_aa33e0_6;

typedef struct st_aa33e0_2 {
    char padding_0[16];
    unsigned long long field_10;
    long long field_18;
    struct st_aa33e0_3 *field_20;
} st_aa33e0_2;

typedef struct st_aa33e0_0 {
    char padding_0[8];
    struct st_aa33e0_1 *field_8;
    struct st_aa33e0_2 *field_10;
    long long field_18;
    char padding_20[8];
    struct st_aa33e0_2 *field_28;
} st_aa33e0_0;

typedef struct st_aa33e0_7 {
    char padding_0[16];
    struct st_aa33e0_1 *field_10;
    long long field_18;
    char padding_20[8];
    long long field_28;
    char padding_30[8];
    long long field_38;
} st_aa33e0_7;

typedef struct st_aa33e0_1 {
    long long field_0;
} st_aa33e0_1;

extern char g_10002b0;

unsigned long long sub_aa33e0(st_aa33e0_6 *a0, long long a1)
{
    long long v7;  // x0
    long long v8;  // x23
    unsigned long long v17;  // x24
    unsigned long long v18;  // x0
    unsigned long long v19;  // x8
    long long v20;  // x1
    unsigned long long v21;  // x0
    long long v22;  // x1
    st_aa33e0_2 *v23;  // x22
    unsigned long v24;  // x8
    unsigned int *v25;  // x8
    unsigned long long v26;  // x26
    unsigned long long v9;  // x0
    st_aa33e0_7 *v27;  // x0
    st_aa33e0_7 *v28;  // x28
    unsigned long long v29;  // x0
    unsigned long long v30;  // w0
    unsigned long long v31;  // x0
    unsigned long long v32;  // x25
    long long v33;  // x0
    long long v34;  // x0
    long long v36;  // x20
    unsigned long long v10;  // x19
    long long v37;  // x21
    unsigned long long v38;  // x0
    unsigned long long v39;  // x20
    long long v40;  // x0
    long long v42;  // x1
    unsigned int v11;  // w0
    st_aa33e0_2 *v12;  // x22
    unsigned long v13;  // x8
    st_aa33e0_3 *v14;  // x8
    st_aa33e0_3 *v15;  // x22
    long long v16;  // x1
    st_aa33e0_3 *v0;  // [bp-0xc0]
    char v1;  // [bp-0xb8]
    unsigned int v2;  // [bp-0xac]
    char v3;  // [bp-0xa8], Other Possible Types: unsigned long
    unsigned long v4;  // [bp-0x68]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = *(long long *)&g_10002b0;
    if (a0)
    {
        v7 = sub_aa3fb0();
        if (a0->field_20)
        {
            v8 = v7;
            v9 = sub_a3f728();
            if (v9)
            {
                v10 = v9;
                v11 = sub_a99eac(a0->field_18);
                *(unsigned int *)&a0->padding_0[16] = 0;
                if ((int)v11 > 22)
                {
                    if (v11 == 23)
                    {
                        v15 = a0->field_20->field_10->field_10;
                        if (!v15)
                        {
                            v21 = sub_9cf0ec();
                            if (v21)
                            {
                                v15 = v21;
                                a0->field_20->field_10->field_10 = v21;
                            }
                            else
                            {
                                sub_a368c8();
                                v20 = 819;
LABEL_aa3930:
                                sub_a369bc("crypto/pkcs7/pk7_doit.c", v20, "PKCS7_dataFinal");
                                v22 = 524301;
                                goto LABEL_aa3a60;
                            }
                        }
                    }
                    else if (v11 != 24)
                    {
                        if (v11 != 25)
                            goto LABEL_aa35a8;
                        v12 = a0->field_20->field_10;
                        if (!v12)
                        {
                            sub_a368c8();
                            v16 = 842;
                            goto LABEL_aa3604;
                        }
                        if (sub_a99eac(v12->field_18) == 21)
                        {
                            v13 = &v12->field_20;
                            goto LABEL_aa3484;
                        }
                        else if (sub_a99eac(v12->field_18) - 21 >= 6 && !(v14 = v12->field_20, !v14 || v14->field_0 != 4))
                        {
                            v13 = &v14->field_8;
LABEL_aa3484:
                            v15 = *(long long *)v13;
                        }
                        else
                        {
                            v15 = 0;
                        }
                        if (sub_a99eac(a0->field_20->field_10->field_18) == 21 && *(int *)&a0->padding_0[20])
                        {
                            sub_9cf0f4(v15);
                            v15 = 0;
                            a0->field_20->field_10->field_20 = 0;
                        }
                        if (!sub_aa3ab4(&v1, a1, sub_a99eac(*(long long *)a0->field_20->field_8)) || !sub_a3ff7c(v1, &v3, &v2) || !sub_9c026c(a0->field_20->field_18, &v3, v2))
                            goto LABEL_aa3a68;
                    }
                    else
                    {
                        v17 = (unsigned long long)a0->field_20->padding_20;
                        v15 = a0->field_20->field_28->field_10;
                        if (!v15)
                        {
                            v18 = sub_9cf0ec();
                            if (v18)
                            {
                                v15 = v18;
                                v19 = 16;
                                goto LABEL_aa3738;
                            }
                            else
                            {
                                sub_a368c8();
                                v20 = 807;
                                goto LABEL_aa3930;
                            }
                            goto LABEL_aa3930;
                        }
LABEL_aa3744:
                        if (v17 && (int)sub_ad69e4(v17) >= 1)
                        {
                            v0 = v15;
                            v26 = 0;
                            do
                            {
                                v27 = sub_ad69f8(v17, v26);
                                if (v27->field_38)
                                {
                                    v28 = v27;
                                    if (!sub_aa3ab4(&v1, a1, sub_a99eac(*(long long *)v27->field_10)) || !sub_a40520(v10, v1))
                                        goto LABEL_aa3a68;
                                    if ((int)sub_ad69e4(v28->field_18) >= 1)
                                    {
                                        v29 = sub_af13cc(v28->field_18, 52, 0xffffffff);
                                        if ((v29 >> 31 & 1 || !sub_af1810(sub_af1458(v28->field_18, v29), 0)) && !sub_aa2868(v28, 0))
                                        {
                                            v37 = 524321;
                                            v36 = 741;
                                        }
                                        else if (!sub_a3ff7c(v10, &v3, &v2))
                                        {
                                            v36 = 748;
                                            v37 = 524294;
                                        }
                                        else if (sub_aa2904(v28, &v3, v2))
                                        {
                                            if (!sub_aa3b80(v28))
                                            {
                                                sub_a3f73c(v10);
                                                if (*(long long *)&g_10002b0 == v4)
                                                    return 0;
                                                ___stack_chk_fail();
                                            }
                                            goto LABEL_aa3774;
                                        }
                                        else
                                        {
                                            v37 = 524321;
                                            v36 = 752;
                                        }
                                        sub_a368c8();
                                        sub_a369bc("crypto/pkcs7/pk7_doit.c", v36, "do_pkcs7_signed_attrib");
                                        v22 = v37;
                                        goto LABEL_aa3a60;
                                    }
                                    else
                                    {
                                        v30 = (unsigned int)sub_a5bdac(v28->field_38);
                                        v3 = v30;
                                        if (!v30)
                                        {
                                            sub_a3f73c(v10);
                                            if (*(long long *)&g_10002b0 == v4)
                                                return 0;
                                            ___stack_chk_fail();
                                        }
                                        v31 = sub_a6bf4c(v30, "crypto/pkcs7/pk7_doit.c", 893);
                                        if (!v31)
                                            goto LABEL_aa3a68;
                                        v32 = v31;
                                        v33 = sub_a2d030(v8);
                                        v34 = sub_9f2aec(v8);
                                        if (sub_a5c2e0(v10, v32, &v3, v28->field_38, v33, v34))
                                        {
                                            sub_9c79a0(v28->field_28, v32, (unsigned int)v3);
                                        }
                                        else
                                        {
                                            sub_a368c8(sub_a6c2e4(v32, "crypto/pkcs7/pk7_doit.c", 899), "crypto/pkcs7/pk7_doit.c", 899);
                                            sub_a369bc("crypto/pkcs7/pk7_doit.c", 900, "PKCS7_dataFinal");
                                            v22 = 524294;
                                            goto LABEL_aa3a60;
                                        }
                                    }
                                }
LABEL_aa3774:
                            } while ((v26 = (unsigned int)v26 + 1, (int)sub_ad69e4(v17) > (int)v26));
                            v15 = v0;
                        }
                    }
                }
                else
                {
                    if (v11 != 21)
                    {
                        if (v11 == 22)
                        {
                            v23 = a0->field_20->field_28;
                            if (v23)
                            {
                                v17 = (unsigned long long)a0->field_20->padding_20;
                                if (sub_a99eac(v23->field_18) == 21)
                                {
                                    v24 = &v23->field_20;
                                    goto LABEL_aa3548;
                                }
                                else if (sub_a99eac(v23->field_18) - 21 >= 6 && !(v25 = &v23->field_20->field_0, !v25 || *v25 != 4))
                                {
                                    v24 = v25 + 2;
LABEL_aa3548:
                                    v15 = *(long long *)v24;
                                }
                                else
                                {
                                    v15 = 0;
                                }
                                if (sub_a99eac(a0->field_20->field_28->field_18) == 21 && *(int *)&a0->padding_0[20])
                                {
                                    sub_9cf0f4(v15);
                                    v15 = 0;
                                    v19 = 32;
LABEL_aa3738:
                                    *(st_aa33e0_3 **)&a0->field_20->field_28->padding_0[v19] = v15;
                                    goto LABEL_aa3744;
                                }
                            }
                            else
                            {
                                sub_a368c8();
                                v16 = 828;
LABEL_aa3604:
                                sub_a369bc("crypto/pkcs7/pk7_doit.c", v16, "PKCS7_dataFinal");
                                v22 = 122;
                                goto LABEL_aa3a60;
                            }
                        }
                        else
                        {
LABEL_aa35a8:
                            sub_a368c8();
                            sub_a369bc("crypto/pkcs7/pk7_doit.c", 855, "PKCS7_dataFinal");
                            v22 = 112;
                            goto LABEL_aa3a60;
                        }
                        goto LABEL_aa3a60;
                    }
                    else
                    {
                        v15 = a0->field_20;
                    }
                }
                if (sub_a99eac(a0->field_18) == 22 && sub_aa3e38(a0, 2, 0, 0))
                {
                    sub_a3f73c(v10);
                    if (*(long long *)&g_10002b0 == v4)
                        return 1;
                    ___stack_chk_fail();
                }
                if (!v15)
                {
                    sub_a3f73c(v10);
                    if (*(long long *)&g_10002b0 == v4)
                        return 0;
                    ___stack_chk_fail();
                }
                else if (!(v15->field_10 >> 4 & 1))
                {
                    v38 = sub_9d4f8c(a1, 1025);
                    if (v38)
                    {
                        v39 = v38;
                        v40 = sub_9d46fc();
                        sub_9d3d74(v39, 0x200);
                        sub_9d46fc(v39, 130, 0, 0);
                        sub_9c79a0(v15, v3, v40);
                        sub_a3f73c(v10);
                        if (*(long long *)&g_10002b0 == v4)
                            return 1;
                        ___stack_chk_fail();
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/pkcs7/pk7_doit.c", 930, "PKCS7_dataFinal");
                        v22 = 107;
                    }
                }
                else
                {
                    sub_a3f73c(v10);
                    if (*(long long *)&g_10002b0 == v4)
                        return 1;
                    ___stack_chk_fail();
                }
LABEL_aa3a60:
                sub_a36abc(33, v22, 0);
LABEL_aa3a68:
                sub_a3f73c(v10);
                if (*(long long *)&g_10002b0 == v4)
                    return 0;
                ___stack_chk_fail();
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/pkcs7/pk7_doit.c", 789, "PKCS7_dataFinal");
                v42 = 524294;
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/pkcs7/pk7_doit.c", 783, "PKCS7_dataFinal");
            v42 = 122;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/pkcs7/pk7_doit.c", 776, "PKCS7_dataFinal");
        v42 = 143;
    }
    sub_a36abc(33, v42, 0);
    if (*(long long *)&g_10002b0 == v4)
        return 0;
    ___stack_chk_fail();
}
