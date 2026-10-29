/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa440c..0xa46f8 (748 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a440c_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned int field_18;
    char padding_1c[84];
    struct st_a440c_2 *field_70;
    char padding_78[8];
    struct st_a440c_2 *field_80;
    char padding_88[124];
    unsigned int field_104;
    unsigned int field_108;
} st_a440c_1;

typedef struct st_a440c_3 {
    char padding_0[8];
    struct st_a440c_4 *field_8;
    char padding_10[8];
    unsigned int field_18;
    unsigned int field_1c;
    char padding_20[8];
    unsigned int field_28;
    unsigned int field_2c;
    char padding_30[64];
    struct st_a440c_2 *field_70;
    char padding_78[8];
    struct st_a440c_2 *field_80;
    char padding_88[112];
    struct st_a440c_1 *field_f8;
    unsigned int field_100;
    unsigned int field_104;
    unsigned int field_108;
    unsigned int field_10c;
    char padding_110[28];
    unsigned int field_12c;
} st_a440c_3;

typedef struct st_a440c_2 {
    unsigned int field_0;
} st_a440c_2;

typedef struct st_a440c_4 {
    unsigned long long field_0;
} st_a440c_4;

typedef struct st_a440c_0 {
    char field_0;
} st_a440c_0;


unsigned long long sub_a440c(st_a440c_3 *a0, void* a1, long long a2, unsigned long long *a3)
{
    unsigned int *v10;  // x23
    char v11;  // x12
    unsigned long v18;  // cc_dep2
    unsigned long v19;  // cc_ndep
    unsigned long long v20;  // 4112
    unsigned long long v21;  // 4108
    unsigned long v22;  // cc_op
    unsigned long v23;  // cc_dep1
    unsigned long long v24;  // 4112
    unsigned long long v25;  // 4108
    unsigned int v12;  // w9
    unsigned long long *v13;  // x25
    unsigned int v26;  // w26
    unsigned int v27;  // w28
    st_a440c_1 *v28;  // x24
    unsigned int *v29;  // x11
    unsigned int v30;  // w13
    char v31;  // x12
    unsigned long v32;  // cc_dep1
    unsigned long v33;  // cc_dep2
    void* v14;  // x1
    unsigned long long v34;  // 4102
    unsigned long idx;  // x14
    unsigned long long v36;  // 4102
    unsigned long index;  // x15
    unsigned long v38;  // x10
    unsigned long v39;  // x21
    unsigned long long v40;  // x22
    unsigned int v41;  // w28
    unsigned int v42;  // w28
    unsigned long long v43;  // x0
    unsigned int v15;  // w10
    unsigned int v44;  // w9
    unsigned long long v45;  // x19
    unsigned int v46;  // w8
    unsigned int v47;  // w26
    unsigned int v48;  // w27
    unsigned long v49;  // x21
    unsigned int *v50;  // x20
    unsigned int v51;  // w24
    unsigned int v52;  // w28
    unsigned int *v53;  // x8
    unsigned int v16;  // w13
    unsigned long long v54;  // x8
    unsigned int v55;  // w28
    unsigned long long i;  // x10
    void* v0;  // [bp-0xb8], Other Possible Types: unsigned int
    unsigned long v1;  // [bp-0xb0], Other Possible Types: unsigned long long
    unsigned int v2;  // [bp-0xa8], Other Possible Types: unsigned long
    unsigned long v3;  // [bp-0x98]
    st_a440c_0 **v4;  // [bp-0x80], Other Possible Types: char
    st_a440c_0 *v5;  // [bp-0x78]
    st_a440c_0 **v6;  // [bp-0x70], Other Possible Types: char
    st_a440c_0 *v7;  // [bp-0x68]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v5 = &v4;
    v4 = &v5;
    v10 = a0->field_80;
    v11 = a0->field_104;
    v12 = 1 << (v11 & 31);
    v13 = a0->field_8;
    v14 = a1 - v13;
    v15 = 1 << ((char)a0->field_100 & 31);
    v3 = a0->field_18;
    v16 = a0->field_1c;
    i = a0->field_2c;
    if (v15 < (unsigned int)(v14 - a0->field_1c))
    {
        v20 = arm64g_calculate_condition(v22 | 128, v23, v18, v19);
        v21 = arm64g_calculate_condition(3, (v20 & 1 ? a0->field_28 : 0), 0, 0);
        if (!(v21 & 1))
            goto LABEL_a448e;
LABEL_a448d:
        v16 = (unsigned int)(v14 - v15);
    }
    else
    {
        v24 = arm64g_calculate_condition(v22 | 128, v23, v18, v19);
        v25 = arm64g_calculate_condition(0, (v24 & 1 ? a0->field_28 : 0), 0, 0);
        if (v25 & 1)
            goto LABEL_a448d;
LABEL_a448e:
    }
    if ((unsigned int)v14 < v12)
        v26 = 0;
    else
        v26 = (unsigned int)(v14 - v12);
    v27 = 1 << ((char)a0->field_10c & 31);
    v28 = a0->field_f8;
    v7 = &v6;
    v6 = &v7;
    v29 = a0->field_70;
    v30 = ~(0xffffffff << (v11 & 31));
    v31 = 64 - a0->field_108;
    v32 = i & 0xffffffff;
    v33 = v14 & 0xffffffff;
    if (a0->field_12c)
    {
        v34 = arm64g_calculate_condition(35, v32, v33, 0);
        if (!(v34 & 1))
        {
            idx = 0xcf1bbcdcbb000000 * *(long long *)((char *)v13 + i) >> (v31 & 63);
            v10[(unsigned int)i & v30] = v29[idx];
            v29[idx] = i;
        }
    }
    else
    {
        v36 = arm64g_calculate_condition(35, v32, v33, 0);
        if (!(v36 & 1))
        {
            do
            {
                index = 0xcf1bbcdcbb000000 * *(long long *)((char *)v13 + i) >> (v31 & 63);
                v10[(unsigned int)i & v30] = v29[index];
                v29[index] = i;
                i += 1;
            } while (i < (v14 & 0xffffffff));
        }
    }
    v38 = *(long long *)a1;
    a0->field_2c = (unsigned int)v14;
    v0 = v14;
    v1 = 0xcf1bbcdcbb000000 * v38;
    v39 = v29[v1 >> (v31 & 63)];
    if (v16 > (unsigned int)v39)
    {
        v40 = 3;
    }
    else
    {
        v2 = (unsigned int)v14 + 3;
        v40 = 3;
        v41 = v27;
        do
        {
            v42 = v41;
            if (*(int *)((char *)v13 + (v39 & 0xffffffff) + v40 - 3) == *(int *)((char *)a1 + v40 - 3) && (v43 = sub_7cdfc(a1), v43 > v40 && (*a3 = v2 - v39, v40 = v43, a1 + v43 == a2)))
            {
                v40 = v43;
                v27 = v42;
                break;
            }
        } while ((v27 = v42, (unsigned int)v39 > v26 && (v41 = v42 - 1, v27 = v41, v42 != 1 && (v39 = v10[(unsigned int)v39 & v12 - 1], v27 = v41, v16 <= (unsigned int)v39))));
    }
    v44 = 1 << ((char)v28->field_104 & 31);
    v45 = v28->field_8;
    v2 = v28->field_0;
    v46 = v28->field_0 - v45;
    if (v46 < v44)
        v47 = 0;
    else
        v47 = v46 - v44;
    if (!v27)
        return v40;
    v48 = v28->field_18;
    v49 = *(int *)&v28->field_70[v1 >> ((char)-v28->field_108 & 63)];
    if ((unsigned int)v49 < v48)
        return v40;
    v50 = v28->field_80;
    v51 = *(int *)a1;
    v1 = a1 + 4;
    v0 = (unsigned int)((v0 & 0xffffffff) - v3) + v46 + 3;
    v52 = v27 - 1;
    while (1)
    {
        v53 = v45 + (v49 & 0xffffffff);
        if (*v53 == v51)
        {
            v54 = sub_84f30(v1, v53 + 1, a2, v2, (char *)v13 + v3) + 4;
            if (v54 > v40)
            {
                *a3 = v0 - v49;
                v40 = v54;
                if (a1 + v40 == a2)
                    return v40;
            }
        }
        if ((unsigned int)v49 <= v47)
            return v40;
        v55 = v52 - 1;
        if (v52 < 1)
            return v40;
        v49 = v50[(unsigned int)v49 & v44 - 1];
        v52 = v55;
        if (v48 > (unsigned int)v49)
            return v40;
    }
}
