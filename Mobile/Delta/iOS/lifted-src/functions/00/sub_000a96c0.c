/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa96c0..0xa9be8 (1320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a96c0_1 {
    long long field_0;
    unsigned long long field_8;
    char padding_10[96];
    unsigned long long field_70;
    char padding_78[8];
    unsigned long long field_80;
    char padding_88[128];
    unsigned int field_108;
} st_a96c0_1;

typedef struct st_a96c0_2 {
    char padding_0[8];
    struct st_a96c0_3 *field_8;
    char padding_10[8];
    unsigned int field_18;
    unsigned long long field_1c;
    char padding_24[4];
    unsigned int field_28;
    unsigned int field_2c;
    char padding_30[64];
    struct st_a96c0_3 *field_70;
    char padding_78[8];
    struct st_a96c0_3 *field_80;
    char padding_88[112];
    struct st_a96c0_1 *field_f8;
    unsigned int field_100;
    unsigned int field_104;
    unsigned int field_108;
    unsigned int field_10c;
    char padding_110[28];
    unsigned long long field_12c;
} st_a96c0_2;

typedef struct st_a96c0_3 {
    unsigned int field_0;
} st_a96c0_3;

typedef struct st_a96c0_4 {
    struct st_a96c0_0 *field_0;
} st_a96c0_4;

typedef struct st_a96c0_0 {
    char field_0;
} st_a96c0_0;


unsigned long long sub_a96c0(st_a96c0_2 *a0, unsigned int *a1, long long a2)
{
    unsigned int *v13;  // x3
    unsigned int *v14;  // x23
    unsigned long v21;  // cc_dep2
    unsigned long v22;  // cc_ndep
    unsigned long long v23;  // 4112
    unsigned long long v24;  // 4108
    unsigned long v25;  // cc_op
    unsigned long v26;  // cc_dep1
    unsigned long long v27;  // 4112
    unsigned long long v28;  // 4108
    char v15;  // x12
    unsigned int v16;  // w9
    unsigned long long v29;  // w26
    unsigned long long v30;  // w28
    st_a96c0_1 *v31;  // x17
    unsigned long long v32;  // x10
    unsigned int *v33;  // x11
    unsigned int v34;  // w14
    unsigned long long i;  // x13
    char v36;  // x12
    unsigned int *v17;  // x24
    unsigned long v37;  // cc_dep1
    unsigned long v38;  // cc_dep2
    unsigned long long v39;  // 4102
    unsigned int v40;  // w15
    unsigned long long v41;  // 4102
    unsigned int v42;  // w16
    unsigned int *v43;  // x21
    unsigned long v44;  // x19
    unsigned long long v45;  // x22
    long long v46;  // x2
    unsigned int *v18;  // x4
    unsigned long long v47;  // w28
    unsigned long long v48;  // w28
    unsigned long long v49;  // x0
    unsigned long long *v50;  // x3
    st_a96c0_1 *v51;  // x10
    unsigned int *v52;  // x27
    long long v53;  // x23
    unsigned long long v54;  // x25
    unsigned int v55;  // w11
    unsigned long long v56;  // w12
    unsigned int v19;  // w11
    unsigned long v57;  // x26
    unsigned int *v58;  // x19
    unsigned long v59;  // x21
    unsigned int *v60;  // x8
    unsigned int *v61;  // x3
    unsigned long long v62;  // x8
    unsigned long v63;  // x21
    unsigned int *v64;  // x8
    unsigned long long v20;  // w13
    unsigned int *v65;  // x3
    unsigned long long v66;  // x8
    unsigned long v67;  // x21
    unsigned int *v68;  // x8
    unsigned long long v69;  // x8
    unsigned int v70;  // w8
    unsigned int v71;  // w9
    unsigned long long v72;  // x26
    unsigned int v73;  // w8
    unsigned int v74;  // w9
    unsigned long long j;  // x8
    unsigned long long v76;  // x8
    unsigned long long v78;  // x26
    unsigned long v79;  // x27
    unsigned int *v80;  // x8
    unsigned int *v81;  // x3
    unsigned long long v82;  // x8
    unsigned int *v0;  // [bp-0xd0]
    unsigned long long v1;  // [bp-0xc8]
    st_a96c0_1 *v2;  // [bp-0xb8], Other Possible Types: unsigned int
    unsigned int *v3;  // [bp-0xb0], Other Possible Types: unsigned long long
    unsigned long v4;  // [bp-0x98]
    unsigned int *v5;  // [bp-0x90]
    unsigned int v6;  // [bp-0x84]
    st_a96c0_0 **v7;  // [bp-0x80], Other Possible Types: char
    st_a96c0_0 *v8;  // [bp-0x78]
    st_a96c0_0 **v9;  // [bp-0x70], Other Possible Types: st_a96c0_4 **, char
    st_a96c0_0 *v10;  // [bp-0x68], Other Possible Types: st_a96c0_4 **
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]

    v11 = &v12;
    v13 = a1;
    v8 = &v7;
    v7 = &v8;
    v14 = (unsigned int *)a0->padding_78;
    v15 = *(int *)((char *)&a0->field_f8 + 4);
    v16 = 1 << (v15 & 31);
    v17 = a0->field_8;
    v18 = a1 - v17;
    v19 = 1 << ((char)(int)a0->field_f8 & 31);
    v4 = a0->field_18;
    v20 = (&a0->field_18)[1];
    if (v19 < (unsigned int)(unsigned int *)((char *)v18 - (&a0->field_18)[1]))
    {
        v23 = arm64g_calculate_condition(v25 | 128, v26, v21, v22);
        v24 = arm64g_calculate_condition(3, (v23 & 1 ? (unsigned long long)a0->padding_24 : 0), 0, 0);
        if (!(v24 & 1))
            goto LABEL_a9742;
LABEL_a9741:
        v20 = (unsigned int)(unsigned int *)((char *)v18 - v19);
    }
    else
    {
        v27 = arm64g_calculate_condition(v25 | 128, v26, v21, v22);
        v28 = arm64g_calculate_condition(0, (v27 & 1 ? (unsigned long long)a0->padding_24 : 0), 0, 0);
        if (v28 & 1)
            goto LABEL_a9741;
LABEL_a9742:
    }
    if ((unsigned int)v18 < v16)
        v29 = 0;
    else
        v29 = (unsigned int)(unsigned int *)((char *)v18 - v16);
    v30 = 1 << ((char)a0->field_104 & 31);
    v31 = *(long long *)&a0->padding_88[104];
    v32 = 2654435761 * *a1 >> ((char)(0x22 - v31->field_108) & 31);
    v10 = &v9;
    v9 = &v10;
    v33 = *(long long *)&a0->padding_30[60];
    v34 = ~(0xffffffff << (v15 & 31));
    i = a0->field_28;
    v36 = 32 - a0->field_100;
    v57 = v31->field_70;
    v2 = v31;
    v37 = i & 0xffffffff;
    v38 = v18 & 0xffffffff;
    if (*(int *)&a0->padding_110[20])
    {
        v39 = arm64g_calculate_condition(35, v37, v38, 0);
        if (!(v39 & 1))
        {
            v40 = 2654435761 * *(int *)((char *)v17 + i) >> (v36 & 31);
            v14[(unsigned int)i & v34] = v33[v40];
            v33[v40] = i;
        }
    }
    else
    {
        v41 = arm64g_calculate_condition(35, v37, v38, 0);
        if (!(v41 & 1))
        {
            do
            {
                v42 = 2654435761 * *(int *)((char *)v17 + i) >> (v36 & 31);
                v14[(unsigned int)i & v34] = v33[v42];
                v33[v42] = i;
                i += 1;
            } while (i < (v18 & 0xffffffff));
        }
    }
    v3 = v57 + (v32 & 0xffffffff) * 16;
    v0 = v18;
    v1 = (v32 * 4 | v32 >> 62) & 0x3fffffffc & 0x3ffffffff;
    a0->field_28 = (unsigned int)v18;
    v43 = v13;
    v6 = *v43;
    v44 = v33[2654435761 * *v43 >> (v36 & 31)];
    v5 = v13;
    if (v20 > (unsigned int)v44)
    {
        v45 = 3;
        v46 = a2;
    }
    else
    {
        v55 = (unsigned int)v18 + 3;
        v45 = 3;
        v47 = v30;
        v46 = a2;
        do
        {
            v48 = v47;
            if (*(int *)((char *)v17 + (v44 & 0xffffffff) + v45 - 3) == *(int *)((char *)v43 + v45 - 3) && (v49 = sub_7cdfc(v13), v13 = v5, v46 = a2, v49 > v45 && (*v50 = v55 - v44, v45 = v49, (char *)v13 + v49 == v46)))
            {
                v45 = v49;
                v30 = v48;
                break;
            }
        } while ((v30 = v48, (unsigned int)v44 > v29 && (v47 = v48 - 1, v30 = v47, v48 != 1 && (v44 = v14[(unsigned int)v44 & v16 - 1], v30 = v47, v20 <= (unsigned int)v44))));
    }
    v10 = &v9;
    v9 = &v10;
    v51 = v2;
    v52 = v3;
    v53 = v51->field_0;
    v54 = v51->field_8;
    v55 = v53 - v54 - v4;
    if (v30 < 3)
        v56 = v30;
    else
        v56 = 3;
    v57 = *(int *)(v57 + v1 * 4 + 12);
    v58 = v51->field_80 + (v57 >> 8) * 4;
    if (v30)
    {
        v59 = *v52;
        if (!(unsigned int)v59)
            return v45;
        v2 = (unsigned int)v0 + v55 + 3;
        v60 = v54 + v59;
        if (*v60 == v6)
        {
            v57 = v57;
            v55 = v55;
            v61 = v5;
            v46 = a2;
            v62 = sub_84f30(v13 + 1, v60 + 1, a2, v53, (char *)v17 + v4) + 4;
            v13 = v61;
            if (v62 > v45)
            {
                *v50 = v2 - v59;
                v45 = v62;
                v13 = v61;
                if ((char *)v13 + v45 == v46)
                    return v45;
            }
        }
        if (v30 != 1)
        {
            v63 = v52[1];
            if (!(unsigned int)v63)
                return v45;
            v64 = v54 + v63;
            if (*v64 == v6)
            {
                v57 = v57;
                v55 = v55;
                v65 = v5;
                v46 = a2;
                v66 = sub_84f30(v13 + 1, v64 + 1, a2, v53, (char *)v17 + v4) + 4;
                v13 = v65;
                if (v66 > v45)
                {
                    *v50 = v2 - v63;
                    v45 = v66;
                    v13 = v65;
                    if ((char *)v13 + v45 == v46)
                        return v45;
                }
            }
            if (v30 != 2)
            {
                v67 = v52[2];
                if (!(unsigned int)v67)
                    return v45;
                v68 = v54 + v67;
                if (*v68 == v6)
                {
                    v3 = v56;
                    v69 = sub_84f30(v13 + 1, v68 + 1) + 4;
                    if (v69 > v45)
                    {
                        *v50 = v2 - v67;
                        v13 = v5;
                        v45 = v69;
                        v56 = v3;
                        if ((char *)v13 + v45 == v46)
                            return v45;
                    }
                    else
                    {
                        v13 = v5;
                        v70 = (unsigned int)v57 & 0xff;
                        v71 = v30 - v3;
                        if (v71 < v70)
                            v72 = v71;
                        else
                            v72 = v70;
                        if (!(unsigned int)v72)
                            return v45;
LABEL_a9b04:
                        j = v72;
                        do
                        {
                            v76 = j;
                            j = v76 - 1;
                        } while (j);
                        while (1)
                        {
                            v78 = v72;
                            v79 = *v58;
                            v58 += 1;
                            v80 = v54 + v79;
                            if (*v80 == v6)
                            {
                                v81 = v5;
                                v82 = sub_84f30(v13 + 1, v80 + 1, a2, v53, (char *)v17 + v4) + 4;
                                v13 = v81;
                                if (v82 > v45)
                                {
                                    *v50 = (unsigned int)v0 + v55 + 3 - v79;
                                    v45 = v82;
                                    v13 = v81;
                                    if ((char *)v13 + v45 == a2)
                                        return v45;
                                }
                            }
                            v72 = (unsigned int)v78 - 1;
                            if ((unsigned int)v78 == 1)
                                return v45;
                        }
                    }
                }
            }
        }
    }
    else
    {
        v56 = 0;
    }
    v73 = (unsigned int)v57 & 0xff;
    v74 = v30 - v56;
    if (v74 < v73)
        v72 = v74;
    else
        v72 = v73;
    if (!(unsigned int)v72)
        return v45;
    goto LABEL_a9b04;
}
