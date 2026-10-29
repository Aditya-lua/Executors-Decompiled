/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbbd94..0xbc49c (1800 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bbd94_3 {
    unsigned long long field_0;
    unsigned long long field_4;
} st_bbd94_3;

typedef struct st_bbd94_1 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[8];
    unsigned int field_18;
    unsigned int field_1c;
    char padding_20[8];
    unsigned int field_28;
    unsigned int field_2c;
    char padding_30[64];
    struct st_bbd94_2 *field_70;
    char padding_78[8];
    unsigned long long field_80;
    char padding_88[120];
    unsigned int field_100;
    unsigned int field_104;
    unsigned int field_108;
    unsigned int field_10c;
    char padding_110[4];
    unsigned int field_114;
} st_bbd94_1;

typedef struct st_bbd94_2 {
    unsigned int field_0;
} st_bbd94_2;

typedef struct st_bbd94_4 {
    struct st_bbd94_0 *field_0;
} st_bbd94_4;

typedef struct st_bbd94_0 {
    char field_0;
} st_bbd94_0;


unsigned long long sub_bbd94(st_bbd94_3 *a0, st_bbd94_1 *a1, unsigned long a2, void* a3, long long a4, unsigned int *a5, unsigned long long a6, unsigned int a7)
{
    unsigned long v22;  // x28
    unsigned long v23;  // x23
    unsigned long v32;  // cc_dep1
    unsigned long v33;  // cc_dep2
    unsigned long long v34;  // w8
    unsigned int v35;  // w8
    unsigned long long v36;  // 4112
    unsigned long long v37;  // 4108
    unsigned long long v38;  // 4112
    unsigned long long v39;  // 4108
    unsigned long long v40;  // w24
    unsigned long long v41;  // w8
    void* v24;  // x25
    unsigned int *v42;  // x12, Other Possible Types: unsigned long long
    unsigned long long v43;  // 4137
    unsigned long long v44;  // x11
    unsigned long idx;  // x14
    unsigned int v46;  // w21
    unsigned long long v47;  // x0
    unsigned long long v48;  // x27
    unsigned long v49;  // x21
    unsigned int v50;  // w0
    unsigned long v51;  // x8
    void* v25;  // x13
    unsigned long long idx1;  // x8
    unsigned int v53;  // w21
    unsigned int *v54;  // x27
    unsigned long long v55;  // w8
    unsigned long long v56;  // x21
    unsigned long v57;  // x21
    unsigned int v58;  // w0
    st_bbd94_3 *v59;  // x9
    unsigned long long idx2;  // x8
    unsigned int *v26;  // x25
    unsigned int v61;  // w22
    unsigned long long v62;  // w8
    unsigned int v63;  // w0
    unsigned long v64;  // x22
    unsigned int v65;  // w0
    unsigned long long index;  // x23
    st_bbd94_3 *v66;  // x9
    unsigned long long v67;  // x0
    unsigned long long v68;  // x27
    unsigned long long v69;  // x24
    unsigned long long v70;  // x25
    unsigned long long v71;  // x21
    unsigned long long v72;  // w22
    unsigned long v28;  // x26
    unsigned long long v73;  // x20
    unsigned long v74;  // x23
    unsigned long long v75;  // x19
    unsigned long long v76;  // x8
    st_bbd94_3 *v77;  // x10
    void* v78;  // x3
    unsigned int *v79;  // x9
    unsigned long long v80;  // w22
    unsigned long long v29;  // w14
    unsigned int v30;  // w22
    unsigned int v31;  // w8
    unsigned int v0;  // [bp-0x104]
    unsigned int v1;  // [bp-0x100], Other Possible Types: unsigned long long
    unsigned int *v2;  // [bp-0xf8]
    unsigned long v3;  // [bp-0xf0]
    unsigned int v4;  // [bp-0xe8]
    unsigned long long v5;  // [bp-0xe4]
    unsigned long v6;  // [bp-0xd8]
    unsigned int v7;  // [bp-0xd8]
    unsigned long long v8;  // [bp-0xc8]
    unsigned int v9;  // [bp-0xc4]
    unsigned int *v10;  // [bp-0xb8], Other Possible Types: unsigned long
    unsigned long long v11;  // [bp-0xac]
    unsigned long v12;  // [bp-0xa8]
    void* v13;  // [bp-0xa0]
    long long v14;  // [bp-0x98], Other Possible Types: unsigned int
    st_bbd94_0 **v15;  // [bp-0x90], Other Possible Types: char
    st_bbd94_0 *v16;  // [bp-0x88]
    unsigned int v17;  // [bp-0x7c]
    st_bbd94_0 *v18;  // [bp-0x78], Other Possible Types: st_bbd94_4 **
    st_bbd94_0 **v19;  // [bp-0x70], Other Possible Types: st_bbd94_4 **, char
    char *v20;  // [bp-0x10]
    char v21;  // [bp+0x0]

    v20 = &v21;
    v16 = &v15;
    v15 = &v16;
    v22 = a1->field_8;
    v23 = a1->field_2c;
    if (v22 + v23 > a3)
        return 0;
    v18 = &v19;
    v19 = &v18;
    v24 = a3 - v22;
    v13 = a3;
    v25 = v24;
    if ((unsigned int)v25 > (unsigned int)v23)
    {
        do
        {
            v23 += sub_b570c(a1, v22 + (v23 & 0xffffffff), a4, v24, 6, 0);
        } while ((unsigned int)v23 < (unsigned int)v24);
        v22 = a1->field_8;
        a3 = v13;
        v25 = a3 - a1->field_8;
    }
    a1->field_2c = (unsigned int)v24;
    v18 = &v19;
    v19 = &v18;
    v26 = a1->field_70;
    index = 0xcf1bbcdcbf9b0000 * *(long long *)a3 >> ((char)-a1->field_108 & 63);
    v28 = v26[index];
    if (a1->field_114 < 0xfff)
        v29 = a1->field_114;
    else
        v29 = 0xfff;
    v12 = a1->field_80;
    v30 = 0xffffffff << ((char)(a1->field_104 - 1) & 31);
    v31 = ~v30;
    v9 = v31;
    v32 = v25 & 0xffffffff;
    v33 = v31;
    if ((unsigned int)v25 < v31)
        v34 = 0;
    else
        v34 = (unsigned int)(v25 - v31);
    v8 = v34;
    v35 = 1 << ((char)a1->field_100 & 31);
    if (v35 < (unsigned int)(v25 - a1->field_1c))
    {
        v36 = arm64g_calculate_condition(131, v32, v33, 0);
        v37 = arm64g_calculate_condition(3, (v36 & 1 ? a1->field_28 : 0), 0, 0);
        if (!(v37 & 1))
            goto LABEL_bbeea;
LABEL_bbee9:
        v40 = (unsigned int)(v25 - v35);
    }
    else
    {
        v38 = arm64g_calculate_condition(131, v32, v33, 0);
        v39 = arm64g_calculate_condition(0, (v38 & 1 ? a1->field_28 : 0), 0, 0);
        if (v39 & 1)
            goto LABEL_bbee9;
LABEL_bbeea:
        v40 = a1->field_1c;
    }
    if (1 < v40)
        v41 = v40;
    else
        v41 = 1;
    v11 = v41;
    v6 = a1->field_10c;
    v42 = a7 - 1;
    v43 = arm64g_calculate_condition(129, a6, 4, 0);
    if (v43 & 1)
    {
        v67 = 0;
        goto LABEL_bc2e8;
    }
    v5 = v29;
    v44 = v25 - a1->field_18;
    v3 = a3 + 4;
    idx = a6;
    if (a6 == 3)
    {
        v46 = *a5 - 1;
        v14 = (unsigned int)v25;
        v4 = v30;
        v10 = idx;
        if (v46 - 1 < (unsigned int)v44)
            goto LABEL_bbf78;
        goto LABEL_bbf4c;
    }
    v46 = a5[idx];
    v14 = (unsigned int)v25;
    v4 = v30;
    v10 = idx;
    if ((unsigned int)v44 <= v46 - 1)
    {
LABEL_bbf4c:
        v47 = 0;
        goto LABEL_bc070;
    }
LABEL_bbf78:
    v1 = v44;
    v2 = a5;
    v48 = index;
    v0 = sub_b9f30(a3, 4);
    v49 = v46;
    v50 = sub_b9f30(a3 - v49, 4);
    if ((unsigned int)(v25 - v46) >= v40)
    {
        index = v48;
        if (v0 == v50)
        {
            v51 = sub_7cdfc(v3, v3 + -v49, a4) + 4;
            a5 = v2;
            if ((unsigned int)v51 > (unsigned int)v42)
            {
                v47 = 1;
                *(unsigned int *)&a0->field_0 = 1;
                *(unsigned int *)((char *)&a0->field_0 + 4) = v51;
                a3 = v13;
                v25 = v14;
                v44 = v1;
                idx = v10;
                if (v5 < (unsigned int)v51)
                    return 1;
                v42 = v51;
                if (a3 + v51 == a4)
                    return 1;
            }
            else
            {
                a3 = v13;
                v25 = v14;
                v47 = 0;
LABEL_bc068:
                v44 = v1;
                idx = v10;
            }
        }
        else
        {
            a3 = v13;
            v25 = v14;
            goto LABEL_bc050;
        }
    }
    else
    {
        a3 = v13;
        v25 = v14;
        index = v48;
LABEL_bc050:
        a5 = v2;
        goto LABEL_bc068;
    }
LABEL_bc070:
    idx1 = idx + 1;
    if (idx1 == 3)
    {
        v53 = *a5 - 1;
        v54 = a5;
        if (v53 - 1 < (unsigned int)v44)
            goto LABEL_bc0bc;
        goto LABEL_bc094;
    }
    v53 = a5[idx1];
    v54 = a5;
    if ((unsigned int)v44 <= v53 - 1)
    {
LABEL_bc094:
        v55 = 0;
        v56 = 0;
        v10 = idx;
        if (v42 >= 0)
            goto LABEL_bc1e8;
    }
    else
    {
LABEL_bc0bc:
        v1 = index;
        v2 = v26;
        v0 = sub_b9f30(a3, 4);
        v57 = v53;
        v58 = sub_b9f30(a3 - v57, 4);
        v55 = 0;
        if ((unsigned int)(v25 - v53) >= v40)
        {
            v25 = v14;
            index = v1;
            v26 = v2;
            a3 = v13;
            if (v0 == v58)
            {
                v25 = v14;
                a3 = v13;
                v55 = sub_7cdfc(v3, v3 + -v57, a4) + 4;
            }
            v56 = v55;
            idx = v10;
            if (v56 <= v42)
                goto LABEL_bc1e8;
        }
        else
        {
            a3 = v13;
            v25 = v14;
            index = v1;
            v26 = v2;
            idx = v10;
            v56 = 0;
            if (v42 >= 0)
            {
LABEL_bc1e8:
                v56 = v42;
                idx2 = v10 + 2;
                if (idx2 == 3)
                {
LABEL_bc19c:
                    v61 = *v54 - 1;
                    if (v61 - 1 < (unsigned int)v44)
                        goto LABEL_bc208;
                    goto LABEL_bc1b0;
                }
LABEL_bc1f8:
                v61 = v54[idx2];
                if ((unsigned int)v44 <= v61 - 1)
                {
LABEL_bc1b0:
                    v62 = 0;
                    v42 = 0;
                    if (v56 >= 0)
                        goto LABEL_bc2e0;
                }
                else
                {
LABEL_bc208:
                    v1 = index;
                    v2 = v26;
                    v63 = sub_b9f30(a3, 4);
                    v64 = v61;
                    v65 = sub_b9f30(a3 - v64, 4);
                    v62 = 0;
                    if ((unsigned int)(v25 - v61) >= v40)
                    {
                        v25 = v14;
                        index = v1;
                        v26 = v2;
                        a3 = v13;
                        if (v63 == v65)
                        {
                            v25 = v14;
                            a3 = v13;
                            v62 = sub_7cdfc(v3, v3 + -v64, a4) + 4;
                        }
                        v42 = v62;
                        if (v42 <= v56)
                            goto LABEL_bc2e0;
                    }
                    else
                    {
                        a3 = v13;
                        v25 = v14;
                        index = v1;
                        v26 = v2;
                        v42 = 0;
                        if (v56 >= 0)
                        {
LABEL_bc2e0:
                            v42 = v56;
                            v30 = v4;
                            v67 = v47;
LABEL_bc2e8:
                            v68 = v67;
                            v10 = v12 + ((unsigned int)v25 & ~v30) * 2 * 4;
                            v42 = v10 + 1;
                            v69 = (unsigned int)v25 + 9;
                            v26[index] = (unsigned int)v25;
                            if (v11 <= (unsigned int)v28)
                            {
                                v14 = a4;
                                v70 = 0;
                                v71 = 0;
                                v7 = (unsigned int)v25 + 3;
                                v72 = (1 << ((char)v6 & 31)) - 1;
                                do
                                {
                                    if (v71 < v70)
                                        v73 = v71;
                                    else
                                        v73 = v70;
                                    v74 = v22;
                                    v75 = v42;
                                    v76 = sub_7cdfc() + v73;
                                    if (v76 > v75)
                                    {
                                        if (v69 - v28 < v76)
                                            v69 = v28 + v76 & 0xffffffff;
                                        else
                                            v69 &= 0xffffffff;
                                        v77 = &(&a0->field_0)[v68 & 0xffffffff];
                                        *(unsigned int *)&v77->field_0 = v7 - v28;
                                        *(unsigned int *)((char *)&v77->field_0 + 4) = v76;
                                        v68 = (unsigned int)v68 + 1;
                                        if (0x1000 < v76 || (v78 = v13, v42 = v76, v78 + v76 == v14))
                                            break;
                                    }
                                    else
                                    {
                                        v42 = v75;
                                        v78 = v13;
                                    }
                                    v79 = v12 + ((unsigned int)v28 & v9) * 2 * 4;
                                    if (*((char *)v78 + v76) > *(char *)(v22 + (v28 & 0xffffffff) + v76))
                                    {
                                        *v10 = v28;
                                        if ((unsigned int)v28 > v8)
                                        {
                                            v22 = v74;
                                            v79 += 1;
                                            v71 = v76;
                                            v10 = v79;
                                            continue;
                                        }
                                        else
                                        {
                                            v10 = &v17;
                                            break;
                                        }
                                    }
                                    else
                                    {
                                        *v42 = v28;
                                        if ((unsigned int)v28 > v8)
                                        {
                                            v22 = v74;
                                            v70 = v76;
                                            v42 = v79;
                                        }
                                        else
                                        {
                                            v42 = &v17;
                                            break;
                                        }
                                    }
                                    v80 = v72 - 1;
                                } while (v72 >= 1 && (v28 = *v79, v72 = v80, v11 <= (unsigned int)v28));
                            }
                            *v42 = 0;
                            *v10 = 0;
                            a1->field_2c = (unsigned int)v69 - 8;
                            return v68;
                        }
                    }
                }
                v66 = &(&a0->field_0)[v47 & 0xffffffff];
                *(unsigned int *)&v66->field_0 = 3;
                *(unsigned int *)((char *)&v66->field_0 + 4) = v62;
                v67 = (unsigned int)v47 + 1;
                v30 = v4;
                if (v5 < v62)
                {
                    return (unsigned int)v47 + 1;
                }
                else if (a3 + v42 == a4)
                {
                    return (unsigned int)v47 + 1;
                }
                goto LABEL_bc2e8;
            }
        }
    }
    v59 = &(&a0->field_0)[v47 & 0xffffffff];
    *(unsigned int *)&v59->field_0 = 2;
    *(unsigned int *)((char *)&v59->field_0 + 4) = v55;
    v47 = (unsigned int)v47 + 1;
    if (v5 < v55)
        return v47;
    if (a3 + v56 == a4)
        return v47;
    idx2 = idx + 2;
    if (idx2 != 3)
        goto LABEL_bc1f8;
    goto LABEL_bc19c;
}
