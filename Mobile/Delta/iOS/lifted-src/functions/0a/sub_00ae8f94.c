/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae8f94..0xae9748 (1972 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae8f94_3 {
    char padding_0[8];
    struct st_ae8f94_1 *field_8;
} st_ae8f94_3;

typedef struct st_ae8f94_2 {
    int field_0;
    char padding_4[4];
    struct st_ae8f94_1 *field_8;
} st_ae8f94_2;

typedef struct st_ae8f94_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_ae8f94_0;

typedef struct st_ae8f94_1 {
    unsigned int field_0;
    char padding_4[4];
    void* field_8;
    char padding_10[8];
    long long field_18;
} st_ae8f94_1;

extern char g_10002b0;

unsigned int sub_ae8f94(unsigned int a0, st_ae8f94_2 *a1, st_ae8f94_3 *a2)
{
    int v6;  // w9
    unsigned int v7;  // x0
    unsigned int v16;  // w12
    unsigned int v17;  // w11
    void* v18;  // x19
    unsigned int v19;  // x22
    unsigned int v20;  // x9
    unsigned int v21;  // x9
    unsigned int v22;  // x25
    void* v23;  // x20
    unsigned int v24;  // w24
    unsigned int v25;  // w8
    unsigned int v8;  // x8
    unsigned int v26;  // w8
    unsigned int v27;  // x26
    unsigned int v28;  // x23
    long long v29;  // x21
    char *iter;  // x8
    char *v31;  // x8
    unsigned int v32;  // x22
    unsigned int v33;  // w10
    unsigned int v34;  // w9
    unsigned int v35;  // w10
    st_ae8f94_1 *v9;  // x10
    unsigned int v36;  // w9
    unsigned int v37;  // x9
    unsigned int v38;  // x9
    unsigned int v39;  // w11
    unsigned int v40;  // w10
    unsigned int v41;  // w11
    unsigned int v42;  // w10
    unsigned int v43;  // x19
    unsigned int v44;  // x0
    st_ae8f94_0 *v45;  // x20
    unsigned int v10;  // w11
    unsigned long long v46;  // x21
    unsigned int v47;  // w8
    unsigned int v48;  // w8
    unsigned int v49;  // x19
    unsigned int v50;  // w8
    unsigned long v51;  // x19
    unsigned long len;  // x0
    long long v53;  // x20
    unsigned long v54;  // cc_dep1
    unsigned int v55;  // x8
    void* v11;  // x9
    unsigned long v56;  // 4112
    unsigned long v57;  // cc_op
    unsigned long v58;  // cc_dep1
    unsigned long v59;  // cc_dep2
    unsigned long long v60;  // 4102
    unsigned long v61;  // 4112
    unsigned long long v62;  // 4102
    unsigned int v63;  // w11
    unsigned long long v64;  // 4112
    unsigned long long v65;  // 4102
    void* v12;  // x10
    unsigned long long v66;  // 4112
    unsigned long long v67;  // 4102
    void* v68;  // x9
    void* v69;  // x10
    unsigned int v70;  // x11
    unsigned int v71;  // x11
    void* v73;  // x21
    unsigned int v74;  // x0
    long long v75;  // x19
    unsigned int v13;  // x8
    long long v76;  // x19
    unsigned long long len1;  // x0
    unsigned int v78;  // x9
    unsigned int v79;  // x9
    unsigned int v80;  // w11
    unsigned int v81;  // w10
    unsigned int v82;  // w11
    unsigned int v83;  // w10
    unsigned long long v85;  // 4109
    unsigned int v14;  // w12
    unsigned int v86;  // x9
    unsigned int v87;  // x8
    unsigned int v88;  // w11
    unsigned int v89;  // w10
    unsigned int v90;  // w11
    unsigned int v91;  // w10
    st_ae8f94_1 *v92;  // x19
    st_ae8f94_1 *v93;  // x20
    unsigned int v15;  // w11
    long long v0;  // [bp-0x180], Other Possible Types: unsigned int
    long long v1;  // [bp-0x170]
    char v2;  // [bp-0x168], Other Possible Types: unsigned int
    unsigned long v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    v6 = a1->field_0;
    if (3 >= v6)
    {
        if (v6)
        {
            if (v6 != 1)
            {
                if (v6 != 2)
                {
                    if (*(long long *)&g_10002b0 == v3)
                        return 0x33;
                    ___stack_chk_fail();
                }
                v8 = a2->field_8->field_0;
                if (!v8)
                {
                    if (*(long long *)&g_10002b0 == v3)
                        return 0;
                    ___stack_chk_fail();
                }
                v9 = a1->field_8;
                v10 = v9->field_0;
                if ((int)v10 >= (int)v8 && !(v11 = a2->field_8->field_8, v12 = v9->field_8, (int)v10 > (int)v8 && !(v12 = v9->field_8 + (int)(v10 - v8), *(char *)v11 == 46 || *((char *)v12 - 1) == 46)))
                {
                    do
                    {
                        v13 = v8;
                        v14 = *(char *)v11;
                        v15 = *(char *)v12;
                        if (v14 == v15)
                            continue;
                        if (v14 - 65 < 26)
                            v16 = v14 | 32;
                        else
                            v16 = v14 & 0xff;
                        if (v15 - 65 < 26)
                            v17 = v15 | 32;
                        else
                            v17 = v15 & 0xff;
                        if (v16 != v17)
                            goto LABEL_ae95e4;
                    } while ((v7 = 0, v11 += 1, v12 += 1, v8 = v13 - 1, v13 != 1));
                    goto LABEL_ae9690;
                }
                goto LABEL_ae95e4;
            }
            v18 = a2->field_8->field_8;
            v19 = a2->field_8->field_0;
            if ((int)v19 >= 1)
            {
                v20 = v19;
                do
                {
                    v21 = v20;
                    if (*((char *)v18 + (v21 & 0xffffffff) - 1) == 64)
                        goto LABEL_ae9354;
                } while ((v20 = v21 - 1, 1 < (int)v21));
LABEL_ae9360:
                v22 = 0;
            }
            else
            {
                v21 = v19;
                if (!v21)
                    goto LABEL_ae9360;
LABEL_ae9354:
                v22 = (unsigned int)(v18 + v21 - 1);
            }
            v23 = a1->field_8->field_8;
            v24 = a1->field_8->field_0;
            if ((int)v24 >= 1)
            {
                v25 = v24;
                do
                {
                    v26 = v25;
                    if (*((char *)v23 + v26 - 1) == 64)
                        goto LABEL_ae93a4;
                } while ((v25 = v26 - 1, 1 < (int)v26));
            }
            else
            {
                v26 = v24;
                if (v26)
                {
LABEL_ae93a4:
                    v27 = v26;
                    v28 = (unsigned int)(v23 + v27);
                    if (v28 != 1)
                    {
                        if (v22)
                        {
                            v29 = v22 - v18;
                            if (v22 == v18)
                            {
LABEL_ae9408:
                                iter = v22 + 1;
                                goto LABEL_ae9570;
                            }
                            if (v29 != v28 - 1 - v23)
                                goto LABEL_ae95e4;
                            if (!_memchr(v18, 0, v29) && !_memchr(v23, 0, v29))
                            {
                                if (!_strncmp(v18, v23, v29))
                                    goto LABEL_ae9408;
                                goto LABEL_ae95e4;
                            }
                        }
                        else
                        {
                            if ((int)v19 >= 1 && *(char *)v18 == 46)
                            {
                                if ((int)v24 > (int)v19)
                                {
                                    v31 = v23 + (int)(v24 - v19);
                                    do
                                    {
                                        v32 = v19;
                                        v33 = *(char *)v18;
                                        v34 = *v31;
                                        if (v33 == v34)
                                            continue;
                                        if (v33 - 65 < 26)
                                            v35 = v33 | 32;
                                        else
                                            v35 = v33 & 0xff;
                                        if (v34 - 65 < 26)
                                            v36 = v34 | 32;
                                        else
                                            v36 = v34 & 0xff;
                                        if (v35 != v36)
                                            goto LABEL_ae95e4;
                                    } while ((v7 = 0, v18 += 1, v31 += 1, v19 = v32 - 1, v32 != 1));
                                    goto LABEL_ae9690;
                                }
                            }
                            else
                            {
                                iter = v18;
LABEL_ae9570:
                                v37 = v19 + v18 - iter;
                                if (v37 == v24 - v27)
                                {
                                    if (!v37)
                                    {
                                        if (*(long long *)&g_10002b0 == v3)
                                            return 0;
                                        ___stack_chk_fail();
                                    }
                                    else
                                    {
                                        do
                                        {
                                            v38 = v37;
                                            v39 = *iter;
                                            v40 = *(char *)v28;
                                            if (v39 == v40)
                                                continue;
                                            if (v39 - 65 < 26)
                                                v41 = v39 | 32;
                                            else
                                                v41 = v39 & 0xff;
                                            if (v40 - 65 < 26)
                                                v42 = v40 | 32;
                                            else
                                                v42 = v40 & 0xff;
                                            if (v41 != v42)
                                                goto LABEL_ae95e4;
                                        } while ((v7 = 0, iter += 1, v28 += 1, v37 = v38 - 1, v38 != 1));
                                    }
                                    goto LABEL_ae9690;
                                }
                            }
LABEL_ae95e4:
                            v7 = 47;
LABEL_ae9690:
                            if (*(long long *)&g_10002b0 == v3)
                                return v7;
                            ___stack_chk_fail();
                        }
                    }
                }
            }
        }
        else if (a0 == 1)
        {
            v43 = a2->field_8->field_0;
            if ((int)v43 < 1 || !_memchr(a2->field_8->field_8, 0, v43))
            {
                v44 = sub_a6da14(a2->field_8->field_8, v43, "crypto/x509/v3_ncons.c", 678);
                if (v44)
                {
                    if (*(int *)a1->field_8->field_8 == 12)
                    {
                        v45 = (long long)a1->field_8->field_8[8];
                        v46 = v45->field_8;
                        v47 = v45->field_0;
                        if ((int)v47 >= 1)
                        {
                            do
                            {
                                v48 = v47;
                                if (*(char *)(v46 - 1 + v48) == 64)
                                    goto LABEL_ae9610;
                            } while ((v47 = v48 - 1, 1 < (int)v48));
                        }
                        else
                        {
                            v48 = v47;
                            if (v48)
                            {
LABEL_ae9610:
                                v49 = v46 + v48;
                                if (v49 != 1)
                                {
                                    v50 = *(char *)v44;
                                    if (v50 == 46)
                                    {
                                        v2 = v50;
                                        if ((int)sub_c694a8() >= 1)
                                        {
                                            v51 = v45->field_0;
                                            len = _strlen(&v2);
                                            if (v51 <= len || sub_ae9748(&v2, v46 + v51 - len, len))
                                                v7 = 47;
                                            else
                                                v7 = 0;
                                        }
                                        else
                                        {
                                            v7 = 1;
                                        }
                                        sub_a6c2e4();
                                        if (*(long long *)&g_10002b0 == v3)
                                            return v7;
                                        ___stack_chk_fail();
                                    }
                                    else
                                    {
                                        if ((int)sub_c694a8() >= 1)
                                        {
                                            v53 = v45->field_8 - v49 + v45->field_0;
                                            if (v53 != _strlen(&v2) || sub_ae9748(&v2, v49, v53))
                                                v7 = 47;
                                            else
                                                v7 = 0;
                                        }
                                        else
                                        {
                                            v7 = 1;
                                        }
                                        sub_a6c2e4();
                                        if (*(long long *)&g_10002b0 == v3)
                                            return v7;
                                        ___stack_chk_fail();
                                    }
                                }
                            }
                        }
                    }
                    sub_a6c2e4();
                    if (*(long long *)&g_10002b0 == v3)
                        return 53;
                    ___stack_chk_fail();
                }
                else
                {
                    if (*(long long *)&g_10002b0 == v3)
                        return 0x11;
                    ___stack_chk_fail();
                }
            }
        }
        else
        {
            if (*(long long *)&g_10002b0 == v3)
                return 0x33;
            ___stack_chk_fail();
        }
    }
    else
    {
        if (v6 == 4)
        {
            v92 = a1->field_8;
            v93 = a2->field_8;
            if ((int)v92->field_8 && sub_afa378(v92, 0) >> 31 & 1)
            {
                if (*(long long *)&g_10002b0 == v3)
                    return 0x11;
                ___stack_chk_fail();
            }
            if ((int)v93->field_8 && sub_afa378(v93, 0) >> 31 & 1)
            {
                if (*(long long *)&g_10002b0 == v3)
                    return 0x11;
                ___stack_chk_fail();
            }
            if ((int)v92[1].field_0 >= (int)v93[1].field_0)
            {
                if (v93[1].field_0)
                {
                    if (!_memcmp(v93->field_18, v92->field_18))
                        v7 = 0;
                    else
                        v7 = 47;
                    if (*(long long *)&g_10002b0 == v3)
                        return v7;
                    ___stack_chk_fail();
                }
                else
                {
                    if (*(long long *)&g_10002b0 == v3)
                        return 0;
                    ___stack_chk_fail();
                }
            }
            goto LABEL_ae95e4;
        }
        else if (v6 != 6)
        {
            v54 = v6;
            if (v6 != 7)
            {
                if (*(long long *)&g_10002b0 == v3)
                    return 0x33;
                ___stack_chk_fail();
            }
            v55 = a1->field_8->field_0;
            if (v55 != 16)
            {
                v56 = arm64g_calculate_condition(19, v54, 7, 0);
                v57 = 3;
                v58 = (v56 & 1 ? v55 & 0xffffffff : 0x40000000);
                v59 = (v56 & 1 ? 4 : 0);
                v60 = arm64g_calculate_condition(19, v58, v59, 0);
                if (!(v60 & 1))
                    goto LABEL_ae90b8;
            }
            else
            {
                v61 = arm64g_calculate_condition(19, v54, 7, 0);
                v57 = 0;
                v58 = (v61 & 1 ? v55 & 0xffffffff : 0x40000000);
                v59 = (v61 & 1 ? 4 : 0);
                v62 = arm64g_calculate_condition(16, v58, v59, 0);
                if (!(v62 & 1))
                {
LABEL_ae90b8:
                    v63 = a2->field_8->field_0;
                    if (v63 != 32)
                    {
                        v64 = arm64g_calculate_condition(v57 | 16, v58, v59, 0);
                        v65 = arm64g_calculate_condition(19, (v64 & 1 ? v63 : 0x40000000), (v64 & 1 ? 8 : 0), 0);
                        if (!(v65 & 1))
                            goto LABEL_ae90cc;
                    }
                    else
                    {
                        v66 = arm64g_calculate_condition(v57 | 16, v58, v59, 0);
                        v67 = arm64g_calculate_condition(16, (v66 & 1 ? v63 : 0x40000000), (v66 & 1 ? 8 : 0), 0);
                        if (!(v67 & 1))
                        {
LABEL_ae90cc:
                            if (v63 == v55 * 2)
                            {
                                v68 = a1->field_8->field_8;
                                v69 = a2->field_8->field_8;
                                v70 = v55;
                                do
                                {
                                    v71 = v70;
                                    if ((*(char *)v69 ^ *(char *)v68) & *((char *)v69 + v55))
                                        goto LABEL_ae95e4;
                                } while ((v7 = 0, v69 += 1, v70 = v71 - 1, v68 += 1, v71 != 1));
                                goto LABEL_ae9690;
                            }
                            goto LABEL_ae95e4;
                        }
                    }
                }
            }
        }
        else
        {
            v73 = a2->field_8->field_8;
            v74 = sub_a6da14(a1->field_8->field_8, a1->field_8->field_0, "crypto/x509/v3_ncons.c", 786);
            if (v74)
            {
                v75 = v74;
                v0 = 0;
                if (sub_a64e9c())
                {
                    if (v2 && *(char *)v2)
                    {
                        sub_a6c2e4();
                        sub_a6c2e4(v75, "crypto/x509/v3_ncons.c", 806);
                        v76 = v1;
                        len1 = _strlen(v76);
                        v78 = a2->field_8->field_0;
                        if ((int)v78 >= 1 && *(char *)v73 == 46)
                        {
                            if ((int)len1 <= (int)v78)
                                goto LABEL_ae9564;
                            v79 = -v78;
                            do
                            {
                                v80 = *(char *)(v76 + (len1 & 0xffffffff) + v79);
                                v81 = *(char *)v73;
                                if (v80 == v81)
                                    continue;
                                if (v80 - 65 < 26)
                                    v82 = v80 | 32;
                                else
                                    v82 = v80 & 0xff;
                                if (v81 - 65 < 26)
                                    v83 = v81 | 32;
                                else
                                    v83 = v81 & 0xff;
                                if (v82 != v83)
                                    goto LABEL_ae9564;
                            } while ((v73 += 1, v85 = arm64g_calculate_condition(0x22, v79, 1, 0), v79 += 1, !(v85 & 1)));
                            goto LABEL_ae95ec;
                        }
                        else if (v78 == (unsigned int)len1)
                        {
                            v86 = len1 * 0x100000000;
                            if (v86)
                            {
                                v87 = 0;
                                do
                                {
                                    v88 = *(char *)(v76 + v87);
                                    v89 = *((char *)v73 + v87);
                                    if (v88 == v89)
                                        continue;
                                    if (v88 - 65 < 26)
                                        v90 = v88 | 32;
                                    else
                                        v90 = v88 & 0xff;
                                    if (v89 - 65 < 26)
                                        v91 = v89 | 32;
                                    else
                                        v91 = v89 & 0xff;
                                    if (v90 != v91)
                                        goto LABEL_ae9564;
                                } while ((v87 += 1, (int)(v86) >> 32 != v87));
                            }
LABEL_ae95ec:
                            v7 = 0;
                        }
                        else
                        {
LABEL_ae9564:
                            v7 = 47;
                        }
                    }
                    else
                    {
                        sub_a368c8(v2);
                        sub_a369bc("crypto/x509/v3_ncons.c", 796, "nc_uri");
                        v0 = v75;
                        v7 = 53;
                        sub_a36abc(0x22, 53, "x509: missing scheme in URI: %s\n");
                        sub_a6c2e4(v2, "crypto/x509/v3_ncons.c", 798);
                        sub_a6c2e4(v75, "crypto/x509/v3_ncons.c", 799);
                        v76 = v1;
                    }
                    sub_a6c2e4(v76, "crypto/x509/v3_ncons.c", 830);
                    if (*(long long *)&g_10002b0 == v3)
                        return v7;
                    ___stack_chk_fail();
                }
                else
                {
                    sub_a6c2e4(v75, "crypto/x509/v3_ncons.c", 790);
                }
            }
            else
            {
                if (*(long long *)&g_10002b0 == v3)
                    return 1;
                ___stack_chk_fail();
            }
        }
    }
    if (*(long long *)&g_10002b0 == v3)
        return 53;
    ___stack_chk_fail();
}
