/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9be8..0xaa0f0 (1288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a9be8_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[96];
    unsigned long long field_70;
    char padding_78[8];
    unsigned long long field_80;
    char padding_88[128];
    unsigned int field_108;
} st_a9be8_1;

typedef struct st_a9be8_2 {
    struct st_a9be8_0 *field_0;
} st_a9be8_2;

typedef struct st_a9be8_0 {
    char field_0;
} st_a9be8_0;


long long sub_a9be8(void* a0, void* a1, long long a2)
{
    void* v14;  // x3
    unsigned int *v15;  // x19
    unsigned long v22;  // cc_dep2
    unsigned long v23;  // cc_ndep
    unsigned long long v24;  // 4112
    unsigned long long v25;  // 4108
    unsigned long v26;  // cc_op
    unsigned long v27;  // cc_dep1
    unsigned long long v28;  // 4112
    unsigned long long v29;  // 4108
    char v16;  // x13
    unsigned int v17;  // w8
    unsigned int v30;  // w28
    unsigned int v31;  // w24
    st_a9be8_1 *v32;  // x14
    unsigned long long v33;  // x10
    unsigned long v34;  // x11
    unsigned int *v35;  // x12
    unsigned int v36;  // w15
    unsigned long long i;  // x14
    unsigned long long *v18;  // x25
    char v38;  // x13
    unsigned long v39;  // cc_dep1
    unsigned long v40;  // cc_dep2
    unsigned long long v41;  // 4102
    unsigned long index;  // x9
    unsigned long long v43;  // 4102
    unsigned long idx;  // x17
    unsigned long v45;  // x27
    unsigned long v46;  // x22
    void* v47;  // x3
    void* v19;  // x4
    unsigned int v48;  // w24
    unsigned int v49;  // w24
    unsigned long v50;  // x0
    void* v51;  // x3
    unsigned long long *v52;  // x3
    st_a9be8_1 *v53;  // x10
    unsigned int *v54;  // x23
    unsigned long long v55;  // x19
    unsigned int v56;  // w27
    unsigned int v57;  // w28
    unsigned int v20;  // w11
    unsigned long v58;  // x11
    unsigned int *v59;  // x26
    unsigned long v60;  // x21
    unsigned int *v61;  // x8
    void* v62;  // x3
    unsigned long v63;  // x8
    unsigned long v64;  // x21
    unsigned int *v65;  // x8
    void* v66;  // x3
    unsigned long v67;  // x8
    unsigned int v21;  // w12
    unsigned long v68;  // x21
    unsigned int *v69;  // x8
    void* v70;  // x23
    unsigned long v71;  // x8
    unsigned int v72;  // w8
    unsigned int v73;  // w9
    unsigned long v74;  // x28
    unsigned int v75;  // w8
    unsigned int v76;  // w9
    unsigned long j;  // x8
    unsigned long v78;  // x8
    void* v80;  // x24
    unsigned int v81;  // w21
    unsigned long v82;  // x28
    unsigned long v83;  // x23
    unsigned int *v84;  // x8
    unsigned long v85;  // x8
    void* v0;  // [bp-0xc8]
    unsigned long long v1;  // [bp-0xc0]
    unsigned long v2;  // [bp-0xb8]
    st_a9be8_1 *v3;  // [bp-0xb0], Other Possible Types: unsigned int
    unsigned int *v4;  // [bp-0xa8], Other Possible Types: unsigned long
    unsigned int v5;  // [bp-0x98], Other Possible Types: unsigned long
    unsigned long v6;  // [bp-0x90]
    void* v7;  // [bp-0x88]
    st_a9be8_0 **v8;  // [bp-0x80], Other Possible Types: char
    st_a9be8_0 *v9;  // [bp-0x78]
    st_a9be8_0 **v10;  // [bp-0x70], Other Possible Types: st_a9be8_2 **, char
    st_a9be8_0 *v11;  // [bp-0x68], Other Possible Types: st_a9be8_2 **
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v14 = a1;
    v9 = &v8;
    v8 = &v9;
    v15 = (long long)a0[128];
    v16 = (int)a0[260];
    v17 = 1 << (v16 & 31);
    v18 = (long long)a0[8];
    v19 = a1 - v18;
    v20 = 1 << ((char)(int)a0[0x100] & 31);
    v6 = (int)a0[24];
    v21 = (int)a0[28];
    if (v20 < (unsigned int)(v19 - (int)a0[28]))
    {
        v24 = arm64g_calculate_condition(v26 | 128, v27, v22, v23);
        v25 = arm64g_calculate_condition(3, (v24 & 1 ? (int)a0[40] : 0), 0, 0);
        if (!(v25 & 1))
            goto LABEL_a9c72;
LABEL_a9c71:
        v21 = (unsigned int)(v19 - v20);
    }
    else
    {
        v28 = arm64g_calculate_condition(v26 | 128, v27, v22, v23);
        v29 = arm64g_calculate_condition(0, (v28 & 1 ? (int)a0[40] : 0), 0, 0);
        if (v29 & 1)
            goto LABEL_a9c71;
LABEL_a9c72:
    }
    if ((unsigned int)v19 < v17)
        v30 = 0;
    else
        v30 = (unsigned int)(v19 - v17);
    v31 = 1 << ((char)(int)a0[268] & 31);
    v32 = (long long)a0[248];
    v33 = 0xcf1bbcdcbf9b0000 * *(long long *)a1;
    v34 = v33 >> ((char)(66 - v32->field_108) & 63);
    v3 = v32;
    v11 = &v10;
    v10 = &v11;
    v35 = (long long)a0[112];
    v36 = ~(0xffffffff << (v16 & 31));
    i = (int)a0[44];
    v38 = 64 - (int)a0[264];
    v4 = v32->field_70 + v34 * 16;
    v2 = v32->field_70;
    v39 = i & 0xffffffff;
    v40 = v19 & 0xffffffff;
    if ((int)a0[300])
    {
        v41 = arm64g_calculate_condition(35, v39, v40, 0);
        if (!(v41 & 1))
        {
            index = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v18 + i) >> (v38 & 63);
            v15[(unsigned int)i & v36] = v35[index];
            v35[index] = i;
        }
    }
    else
    {
        v43 = arm64g_calculate_condition(35, v39, v40, 0);
        if (!(v43 & 1))
        {
            do
            {
                idx = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v18 + i) >> (v38 & 63);
                v15[(unsigned int)i & v36] = v35[idx];
                v35[idx] = i;
                i += 1;
            } while (i < (v19 & 0xffffffff));
        }
    }
    v0 = v19;
    v1 = v34 * 4;
    *(unsigned int *)&a0[44] = (unsigned int)v19;
    v45 = v35[v33 >> (v38 & 63)];
    v7 = v14;
    if (v21 > (unsigned int)v45)
    {
        v46 = 3;
        v47 = v14;
    }
    else
    {
        v5 = (unsigned int)v19 + 3;
        v46 = 3;
        v48 = v31;
        v47 = v14;
        do
        {
            v49 = v48;
            if (*(int *)((char *)v18 + (v45 & 0xffffffff) + v46 - 3) == *(int *)((char *)v14 + v46 - 3) && (v50 = sub_7cdfc(v47), v51 = v7, v47 = v51, v50 > v46 && (*v52 = v5 - v45, v46 = v50, v47 = v51, v47 + v50 == a2)))
            {
                v46 = v50;
                v31 = v49;
                v47 = v51;
                break;
            }
        } while ((v31 = v49, (unsigned int)v45 > v30 && (v48 = v49 - 1, v31 = v48, v49 != 1 && (v45 = v15[(unsigned int)v45 & v17 - 1], v31 = v48, v21 <= (unsigned int)v45))));
    }
    v11 = &v10;
    v10 = &v11;
    v53 = v3;
    v54 = v4;
    v55 = v53->field_8;
    v5 = v53->field_0;
    v56 = v53->field_0 - v55 - v6;
    if (v31 < 3)
        v57 = v31;
    else
        v57 = 3;
    v58 = *(int *)(v2 + v1 * 4 + 12);
    v59 = v53->field_80 + (v58 >> 8) * 4;
    if (v31)
    {
        v60 = *v54;
        if (!(unsigned int)v60)
            return v46;
        v3 = (unsigned int)v0 + v56 + 3;
        v61 = v55 + v60;
        if (*v61 == *(int *)v47)
        {
            v56 = v56;
            v62 = v7;
            v63 = sub_84f30(v47 + 4, v61 + 1, a2, v5, (char *)v18 + v6) + 4;
            v47 = v62;
            if (v63 > v46)
            {
                *v52 = v3 - v60;
                v46 = v63;
                v47 = v62;
                if (v47 + v46 == a2)
                    return v46;
            }
        }
        if (v31 != 1)
        {
            v64 = v54[1];
            if (!(unsigned int)v64)
                return v46;
            v65 = v55 + v64;
            if (*v65 == *(int *)v47)
            {
                v56 = v56;
                v66 = v7;
                v67 = sub_84f30(v47 + 4, v65 + 1, a2, v5, (char *)v18 + v6) + 4;
                v47 = v66;
                if (v67 > v46)
                {
                    *v52 = v3 - v64;
                    v46 = v67;
                    v47 = v66;
                    if (v47 + v46 == a2)
                        return v46;
                }
            }
            if (v31 != 2)
            {
                v68 = v54[2];
                if (!(unsigned int)v68)
                    return v46;
                v69 = v55 + v68;
                if (*v69 == *(int *)v47)
                {
                    v4 = v58;
                    v70 = v47;
                    v71 = sub_84f30(v47 + 4, v69 + 1, a2, v5, (char *)v18 + v6) + 4;
                    if (v71 > v46)
                    {
                        v58 = v4;
                        *v52 = v3 - v68;
                        v46 = v71;
                        v47 = v70;
                        if (v70 + v46 == a2)
                            return v46;
                    }
                    else
                    {
                        v47 = v70;
                        v72 = (unsigned int)v4 & 0xff;
                        v73 = v31 - v57;
                        if (v73 < v72)
                            v74 = v73;
                        else
                            v74 = v72;
                        if (!(unsigned int)v74)
                            return v46;
LABEL_aa010:
                        j = v74;
                        do
                        {
                            v78 = j;
                            j = v78 - 1;
                        } while (j);
                        v80 = v47;
                        v81 = *(int *)v80;
                        while (1)
                        {
                            v82 = v74;
                            v83 = *v59;
                            v59 += 1;
                            v84 = v55 + v83;
                            if (*v84 == v81)
                            {
                                v85 = sub_84f30(v80 + 4, v84 + 1, a2, v5, (char *)v18 + v6) + 4;
                                if (v85 > v46)
                                {
                                    *v52 = (unsigned int)v0 + v56 + 3 - v83;
                                    v46 = v85;
                                    if (v7 + v46 == a2)
                                        return v46;
                                }
                            }
                            v74 = (unsigned int)v82 - 1;
                            if ((unsigned int)v82 == 1)
                                return v46;
                        }
                    }
                }
            }
        }
    }
    else
    {
        v57 = 0;
    }
    v75 = (unsigned int)v58 & 0xff;
    v76 = v31 - v57;
    if (v76 < v75)
        v74 = v76;
    else
        v74 = v75;
    if (!(unsigned int)v74)
        return v46;
    goto LABEL_aa010;
}
