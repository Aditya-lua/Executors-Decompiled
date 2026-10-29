/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95bcfc..0x95c1d8 (1244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_95bcfc_3 {
    char padding_0[152];
    unsigned int field_98;
} st_95bcfc_3;

typedef struct st_95bcfc_0 {
    char padding_0[8];
    long long field_8;
    char padding_10[44];
    unsigned int field_3c;
} st_95bcfc_0;

typedef struct st_95bcfc_1 {
    char field_0;
    char field_1;
    char padding_2[7];
    char field_9;
} st_95bcfc_1;

typedef struct st_95bcfc_2 {
    struct st_95bcfc_0 *field_0;
    unsigned int field_8;
} st_95bcfc_2;


unsigned int sub_95bcfc(st_95bcfc_1 *a0, long long a1, long long a2, st_95bcfc_2 *a3, st_95bcfc_3 *a4)
{
    st_95bcfc_1 *iter;  // x28
    unsigned int v16;  // w8
    st_95bcfc_1 *v25;  // x24
    char v26;  // x22
    unsigned int v27;  // w8
    unsigned long v28;  // 4112
    unsigned long long v29;  // 4102
    unsigned long v30;  // 4112
    unsigned long long v31;  // 4102
    unsigned int v32;  // w8
    unsigned long long v33;  // x8
    unsigned long v34;  // 4110
    unsigned int v17;  // x10
    unsigned long long v35;  // 4102
    unsigned long v36;  // 4110
    unsigned long long v37;  // 4102
    st_95bcfc_1 *v38;  // x19
    st_95bcfc_0 *v39;  // x25
    unsigned long long *node;  // x21
    unsigned int v41;  // x23
    unsigned int v42;  // w8
    unsigned int v43;  // w9
    unsigned int v44;  // w9
    unsigned long v18;  // cc_dep1
    unsigned int v45;  // w8
    unsigned int v46;  // w9
    unsigned int v47;  // w9
    unsigned int v48;  // w8
    unsigned int v49;  // w9
    unsigned int v50;  // w9
    unsigned int v51;  // w8
    unsigned int v52;  // w8
    unsigned int v53;  // w11
    unsigned int v54;  // w8
    unsigned long v19;  // cc_dep2
    unsigned int v55;  // w8
    unsigned int v56;  // w8
    unsigned long v57;  // cc_op
    unsigned long v58;  // cc_dep1
    unsigned long v59;  // cc_dep2
    unsigned long long v60;  // x9
    unsigned long v61;  // 4110
    unsigned long long v62;  // 4102
    unsigned long v63;  // 4110
    unsigned long long v64;  // 4102
    unsigned int v20;  // w8
    long long v66;  // x19
    unsigned int v67;  // w8
    unsigned int v68;  // w9
    unsigned long v69;  // cc_op
    unsigned long v70;  // cc_dep1
    unsigned long v71;  // cc_dep2
    unsigned long v72;  // cc_ndep
    unsigned long long v73;  // 4124
    unsigned long long v74;  // x9
    unsigned int v21;  // w8
    unsigned long v75;  // 4110
    unsigned long long v76;  // 4102
    unsigned long v77;  // 4110
    unsigned long long v78;  // 4102
    st_95bcfc_1 *v22;  // x8
    unsigned long v23;  // cc_op
    unsigned int v24;  // x26
    unsigned int v0;  // [bp-0xd0]
    long long v1;  // [bp-0xc8]
    long long v2;  // [bp-0xc0]
    unsigned int v3;  // [bp-0x9c]
    unsigned int v4;  // [bp-0x98]
    unsigned int v5;  // [bp-0x94]
    unsigned long long *v6;  // [bp-0x90]
    unsigned int v7;  // [bp-0x80]
    unsigned int v8;  // [bp-0x7c]
    st_95bcfc_1 *v9;  // [bp-0x78]
    unsigned int v10;  // [bp-0x70]
    unsigned int v11;  // [bp-0x6c], Other Possible Types: unsigned long
    unsigned int v12;  // [bp-0x64]
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    iter = a0;
    v6 = &a3->field_8;
    v3 = 1;
    while (1)
    {
        v16 = iter->field_0;
        while (1)
        {
            v17 = 0;
            if (44 < (int)v16)
            {
                v18 = v16;
                v19 = 45;
                switch (v16)
                {
                case 45:
                    v17 = 0;
                    iter = &iter->field_1;
                    v20 = 3;
                    break;
                case 64:
                    v18 = v16;
                    v19 = 64;
                    iter = &iter->field_1;
                    v17 = 1;
                    v20 = 5;
                    break;
                default:
                    v18 = v16;
                    v19 = 64;
                    v21 = v16 - 58;
                    v18 = v21;
                    v19 = 2;
                    if (2 > v21)
                        goto LABEL_95c17c;
                    else
                        goto LABEL_95bdf0;
                    goto LABEL_95bdf0;
                }
            }
            else if (42 >= (int)v16)
            {
                v18 = v16;
                v19 = 33;
                if (v16 == 33)
                {
                    v17 = 0;
                    iter = &iter->field_1;
                    v20 = 2;
                }
                else
                {
                    if (!v16)
                        return v3;
                    v18 = v16;
                    v19 = 32;
                    if (v16 == 32)
                        break;
                    else
                        goto LABEL_95bdf0;
                    goto LABEL_95bdf0;
                }
            }
            else
            {
                v18 = v16;
                v19 = 43;
                if (v16 == 43)
                {
                    v17 = 0;
                    iter = &iter->field_1;
                    v20 = 4;
                }
                else
                {
                    v18 = v16;
                    v19 = 44;
                    if (v16 == 44)
                        break;
LABEL_95bdf0:
                    v20 = 1;
                }
            }
            v4 = v20;
            v11 = 0;
            v10 = 0;
            v8 = 0;
            v12 = 0;
            v5 = 0;
            v7 = v17;
            v22 = iter;
            while (1)
            {
                v23 = 3;
                v24 = 0;
                v25 = v22;
                while (1)
                {
                    v26 = (&v25->field_0)[v24];
                    v27 = v26 - 48;
                    if (26 <= (v26 & 0xffffffdf) - 65)
                    {
                        v28 = arm64g_calculate_condition(v23 | 32, v18, v19, 0);
                        v23 = 3;
                        v18 = (v28 & 1 ? v27 : 0);
                        v19 = (v28 & 1 ? 10 : 0);
                        v29 = arm64g_calculate_condition(0x33, v18, v19, 0);
                        if (!(v29 & 1))
                            goto LABEL_95be48;
                    }
                    else
                    {
                        v30 = arm64g_calculate_condition(v23 | 32, v18, v19, 0);
                        v23 = 0;
                        v18 = (v30 & 1 ? v27 : 0);
                        v19 = (v30 & 1 ? 10 : 0);
                        v31 = arm64g_calculate_condition(48, v18, v19, 0);
                        if (!(v31 & 1))
                        {
LABEL_95be48:
                            v32 = v26 - 45;
                            v33 = 1 << ((char)v32 & 63) & 1125899906908163;
                            if (v32 <= 50)
                            {
                                v34 = arm64g_calculate_condition(v23 | 144, v18, v19, 0);
                                v23 = 4;
                                v18 = (v34 & 1 ? v33 : 0x40000000);
                                v19 = 0;
                                v35 = arm64g_calculate_condition(20, v18, 0, 0);
                                if (!(v35 & 1))
                                    break;
                            }
                            else
                            {
                                v36 = arm64g_calculate_condition(v23 | 144, v18, v19, 0);
                                v23 = 0;
                                v18 = (v36 & 1 ? v33 : 0x40000000);
                                v19 = 0;
                                v37 = arm64g_calculate_condition(16, v18, 0, 0);
                                if (!(v37 & 1))
                                    break;
                            }
                        }
                    }
                    v24 += 1;
                }
                if (!v24)
                {
                    sub_a368c8();
                    sub_a369bc("ssl/ssl_ciph.c", 0x3ff, "ssl_cipher_process_rulestr");
                    sub_a36abc(20, 280, 0);
                    v3 = 0;
                    return v3;
                }
                if (v17 & 1)
                {
                    if (v24 != 10)
                    {
                        if (v24 == 8 && !_strncmp(iter, "STRENGTH", 8))
                        {
                            if (sub_95bb8c(a1, a2))
                                goto LABEL_95c130;
                            goto LABEL_95c12c;
                        }
                        goto LABEL_95c0fc;
                    }
                    else if (_strncmp(iter, "SECLEVEL=", 9))
                    {
LABEL_95c0fc:
                        v66 = 1185;
                        goto LABEL_95c100;
                    }
                    else
                    {
                        v67 = iter->field_9;
                        v68 = v67 - 54;
                        v69 = 1;
                        v70 = v68;
                        v71 = 6;
                        v72 = 0;
                        v73 = arm64g_calculate_condition(33, v68, 6, 0);
                        if (!(v73 & 1))
                        {
                            v66 = 1179;
LABEL_95c100:
                            sub_a368c8();
                            sub_a369bc("ssl/ssl_ciph.c", v66, "ssl_cipher_process_rulestr");
                            sub_a36abc(20, 280, 0);
LABEL_95c12c:
                            v3 = 0;
                            goto LABEL_95c130;
                        }
                        else
                        {
                            a4->field_98 = v67 - 48;
LABEL_95c130:
                            iter = &(&v25->field_0)[v24];
                            while (1)
                            {
                                v16 = iter->field_0;
                                v74 = 1 << ((char)v16 & 63) & 864708724936146945;
                                if (v16 <= 59)
                                {
                                    v75 = arm64g_calculate_condition(v69 | 144, v70, v71, v72);
                                    v69 = 4;
                                    v70 = (v75 & 1 ? v74 : 0x40000000);
                                    v76 = arm64g_calculate_condition(20, v70, 0, 0);
                                    if (v76 & 1)
                                        break;
                                }
                                else
                                {
                                    v77 = arm64g_calculate_condition(v69 | 144, v70, v71, v72);
                                    v69 = 0;
                                    v70 = (v77 & 1 ? v74 : 0x40000000);
                                    v78 = arm64g_calculate_condition(16, v70, 0, 0);
                                    if (v78 & 1)
                                        break;
                                }
                                v71 = 0;
                                v72 = 0;
                                iter = &iter->field_1;
                            }
                        }
                    }
                }
                v38 = &(&v25->field_0)[v24];
                v39 = a3->field_0;
                if (a3->field_0)
                {
                    v9 = &v38->field_1;
                    node = v6;
                    while ((_strncmp(v25, v39->field_8, v24) || *(char *)(v39->field_8 + v24)) && (v41 = *(long long *)&v39->padding_10[0], !v41 || _strncmp(v25, v41, v24) || *(char *)(v41 + v24)))
                    {
                        node += 1;
                        if (!*node)
                            goto LABEL_95c028;
                    }
                    v42 = *(int *)&v39->padding_10[12];
                    if (v42)
                    {
                        v43 = *&(&v11)[1];
                        if (v43)
                        {
                            v44 = v42 & v43;
                            if (!(v42 & v43))
                                goto LABEL_95c028;
                        }
                        else
                        {
                            v44 = v42;
                        }
                    }
                    else
                    {
                        v44 = *&(&v11)[1];
                    }
                    v45 = *(int *)&v39->padding_10[16];
                    *(unsigned int *)((char *)&v11 + 4) = v44;
                    if (v45)
                    {
                        v46 = v11;
                        if (v46)
                        {
                            v47 = v45 & v46;
                            if (!(v45 & v46))
                                goto LABEL_95c028;
                        }
                        else
                        {
                            v47 = v45;
                        }
                    }
                    else
                    {
                        v47 = v11;
                    }
                    v48 = *(int *)&v39->padding_10[20];
                    v11 = v47;
                    if (v48)
                    {
                        v49 = v10;
                        if (v49)
                        {
                            v50 = v48 & v49;
                            if (!(v48 & v49))
                                goto LABEL_95c028;
                        }
                        else
                        {
                            v50 = v48;
                        }
                    }
                    else
                    {
                        v50 = v10;
                    }
                    v51 = *(int *)&v39->padding_10[24];
                    v10 = v50;
                    if (v51)
                    {
                        if (v8)
                        {
                            v8 &= v51;
                            if (!(v51 & v8))
                                goto LABEL_95c028;
                        }
                        else
                        {
                            v8 = v51;
                        }
                    }
                    v52 = v39->field_3c;
                    if (v52 & 31)
                    {
                        if (v12 & 31)
                        {
                            v12 &= v52 | 0xffffffe0;
                            if (!(v12 & 31))
                                goto LABEL_95c028;
                        }
                        else
                        {
                            v12 = v52 & 31;
                        }
                    }
                    v53 = v12;
                    if (!(v53 & 32) & v52 >> 5)
                        v53 |= 32;
                    v12 = v53;
                    if (*(int *)&v39->padding_0[0])
                        goto LABEL_95bfdc;
                    v54 = *(int *)&v39->padding_10[28];
                    if (!v54)
                        goto LABEL_95bfdc;
                    if (v5)
                    {
                        v5 = v54;
                        if (v5 == v54)
                            goto LABEL_95bfdc;
                        goto LABEL_95c028;
                    }
                    else
                    {
                        v5 = v54;
LABEL_95bfdc:
                        v55 = v26;
                        v18 = v55;
                        v19 = 43;
                        v17 = v7;
                        v22 = v9;
                        if (v55 != 43)
                        {
                            v1 = a1;
                            v2 = a2;
                            v0 = 0xffffffff;
                            sub_95b8e4();
                            iter = &(&v25->field_0)[v24];
                            v16 = iter->field_0;
                            break;
                        }
                    }
                }
                else
                {
LABEL_95c028:
                    v56 = v26;
                    v57 = 3;
                    v58 = v56;
                    v59 = 43;
                    if (v56 != 43)
                        iter = v38;
                    else
                        iter = &v38->field_1;
                    while (1)
                    {
                        v16 = iter->field_0;
                        v60 = 1 << ((char)v16 & 63) & 864708724936146945;
                        if (v16 <= 59)
                        {
                            v61 = arm64g_calculate_condition(v57 | 144, v58, v59, 0);
                            v57 = 4;
                            v58 = (v61 & 1 ? v60 : 0x40000000);
                            v62 = arm64g_calculate_condition(20, v58, 0, 0);
                            if (v62 & 1)
                                break;
                        }
                        else
                        {
                            v63 = arm64g_calculate_condition(v57 | 144, v58, v59, 0);
                            v57 = 0;
                            v58 = (v63 & 1 ? v60 : 0x40000000);
                            v64 = arm64g_calculate_condition(16, v58, 0, 0);
                            if (v64 & 1)
                                break;
                        }
                        v59 = 0;
                        iter = &iter->field_1;
                    }
                    break;
                }
            }
            if (!v16)
                return v3;
        }
LABEL_95c17c:
        iter = &iter->field_1;
    }
}
