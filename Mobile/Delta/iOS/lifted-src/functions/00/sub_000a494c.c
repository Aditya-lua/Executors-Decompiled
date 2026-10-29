/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa494c..0xa4c34 (744 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a494c_1 {
    long long field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned int field_18;
    char padding_1c[84];
    struct st_a494c_2 *field_70;
    char padding_78[8];
    struct st_a494c_2 *field_80;
    char padding_88[124];
    unsigned int field_104;
    unsigned int field_108;
} st_a494c_1;

typedef struct st_a494c_3 {
    char padding_0[8];
    struct st_a494c_2 *field_8;
    char padding_10[8];
    unsigned int field_18;
    unsigned int field_1c;
    char padding_20[8];
    unsigned int field_28;
    unsigned int field_2c;
    char padding_30[64];
    struct st_a494c_2 *field_70;
    char padding_78[8];
    struct st_a494c_2 *field_80;
    char padding_88[112];
    struct st_a494c_1 *field_f8;
    unsigned int field_100;
    unsigned int field_104;
    unsigned int field_108;
    unsigned int field_10c;
    char padding_110[28];
    unsigned int field_12c;
} st_a494c_3;

typedef struct st_a494c_2 {
    unsigned int field_0;
} st_a494c_2;

typedef struct st_a494c_0 {
    char field_0;
} st_a494c_0;


unsigned long long sub_a494c(st_a494c_3 *a0, unsigned int *a1, long long a2, unsigned long long *a3)
{
    unsigned int *v11;  // x23
    char v12;  // x12
    unsigned long v19;  // cc_dep2
    unsigned long v20;  // cc_ndep
    unsigned long long v21;  // 4112
    unsigned long long v22;  // 4108
    unsigned long v23;  // cc_op
    unsigned long v24;  // cc_dep1
    unsigned long long v25;  // 4112
    unsigned long long v26;  // 4108
    unsigned int v13;  // w9
    unsigned int *v14;  // x24
    unsigned int v27;  // w26
    unsigned int v28;  // w28
    unsigned int *v29;  // x11
    unsigned int v30;  // w13
    char v31;  // x12
    unsigned long v32;  // cc_dep1
    unsigned long v33;  // cc_dep2
    unsigned long long v34;  // 4102
    unsigned int *v15;  // x1
    unsigned int v35;  // w14
    unsigned long long v36;  // 4102
    unsigned int v37;  // w15
    unsigned long v38;  // x20
    unsigned long long v39;  // x22
    unsigned int v40;  // w28
    unsigned int v41;  // w28
    unsigned long long v42;  // x0
    st_a494c_1 *v43;  // x12
    unsigned int v44;  // w8
    unsigned int v16;  // w10
    long long v45;  // x23
    unsigned long long v46;  // x25
    unsigned int v47;  // w9
    unsigned int v48;  // w26
    unsigned int v49;  // w19
    unsigned long v50;  // x20
    unsigned int *v51;  // x21
    unsigned int v52;  // w28
    unsigned int *v53;  // x8
    unsigned long long v54;  // x8
    unsigned int v17;  // w13
    unsigned int v55;  // w28
    unsigned long long i;  // x10
    unsigned int *v0;  // [bp-0xc0]
    unsigned int v1;  // [bp-0xb4]
    st_a494c_1 *v2;  // [bp-0xb0], Other Possible Types: unsigned int
    unsigned long v3;  // [bp-0xa0]
    unsigned int v4;  // [bp-0x94]
    st_a494c_0 **v5;  // [bp-0x80], Other Possible Types: char
    st_a494c_0 *v6;  // [bp-0x78]
    st_a494c_0 **v7;  // [bp-0x70], Other Possible Types: char
    st_a494c_0 *v8;  // [bp-0x68]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v6 = &v5;
    v5 = &v6;
    v11 = a0->field_80;
    v12 = a0->field_104;
    v13 = 1 << (v12 & 31);
    v14 = a0->field_8;
    v15 = a1 - v14;
    v16 = 1 << ((char)a0->field_100 & 31);
    v3 = a0->field_18;
    v17 = a0->field_1c;
    i = a0->field_2c;
    if (v16 < (unsigned int)(unsigned int *)((char *)v15 - a0->field_1c))
    {
        v21 = arm64g_calculate_condition(v23 | 128, v24, v19, v20);
        v22 = arm64g_calculate_condition(3, (v21 & 1 ? a0->field_28 : 0), 0, 0);
        if (!(v22 & 1))
            goto LABEL_a49ca;
LABEL_a49c9:
        v17 = (unsigned int)(unsigned int *)((char *)v15 - v16);
    }
    else
    {
        v25 = arm64g_calculate_condition(v23 | 128, v24, v19, v20);
        v26 = arm64g_calculate_condition(0, (v25 & 1 ? a0->field_28 : 0), 0, 0);
        if (v26 & 1)
            goto LABEL_a49c9;
LABEL_a49ca:
    }
    if ((unsigned int)v15 < v13)
        v27 = 0;
    else
        v27 = (unsigned int)(unsigned int *)((char *)v15 - v13);
    v28 = 1 << ((char)a0->field_10c & 31);
    v2 = a0->field_f8;
    v8 = &v7;
    v7 = &v8;
    v29 = a0->field_70;
    v30 = ~(0xffffffff << (v12 & 31));
    v31 = 32 - a0->field_108;
    v32 = i & 0xffffffff;
    v33 = v15 & 0xffffffff;
    if (a0->field_12c)
    {
        v34 = arm64g_calculate_condition(35, v32, v33, 0);
        if (!(v34 & 1))
        {
            v35 = 2654435761 * *(int *)((char *)v14 + i) >> (v31 & 31);
            v11[(unsigned int)i & v30] = v29[v35];
            v29[v35] = i;
        }
    }
    else
    {
        v36 = arm64g_calculate_condition(35, v32, v33, 0);
        if (!(v36 & 1))
        {
            do
            {
                v37 = 2654435761 * *(int *)((char *)v14 + i) >> (v31 & 31);
                v11[(unsigned int)i & v30] = v29[v37];
                v29[v37] = i;
                i += 1;
            } while (i < (v15 & 0xffffffff));
        }
    }
    a0->field_2c = (unsigned int)v15;
    v4 = *a1;
    v1 = 2654435761 * v4;
    v38 = v29[v1 >> (v31 & 31)];
    v0 = v15;
    if (v17 > (unsigned int)v38)
    {
        v39 = 3;
    }
    else
    {
        v39 = 3;
        v40 = v28;
        do
        {
            v41 = v40;
            if (*(int *)((char *)v14 + (v38 & 0xffffffff) + v39 - 3) == *(int *)((char *)a1 + v39 - 3) && (v42 = sub_7cdfc(a1), v42 > v39 && (*a3 = (unsigned int)v15 + 3 - v38, v39 = v42, (char *)a1 + v42 == a2)))
            {
                v39 = v42;
                v28 = v41;
                break;
            }
        } while ((v28 = v41, (unsigned int)v38 > v27 && (v40 = v41 - 1, v28 = v40, v41 != 1 && (v38 = v11[(unsigned int)v38 & v13 - 1], v28 = v40, v17 <= (unsigned int)v38))));
    }
    v43 = v2;
    v44 = 1 << ((char)v43->field_104 & 31);
    v45 = v43->field_0;
    v46 = v43->field_8;
    v47 = v45 - v46;
    if (v47 < v44)
        v48 = 0;
    else
        v48 = v47 - v44;
    if (!v28)
        return v39;
    v49 = v43->field_18;
    v50 = *(int *)&v43->field_70[v1 >> ((char)-v43->field_108 & 31)];
    if ((unsigned int)v50 < v49)
        return v39;
    v51 = v43->field_80;
    v2 = (unsigned int)(unsigned int *)((char *)v0 - v3) + v47 + 3;
    v52 = v28 - 1;
    while (1)
    {
        v53 = v46 + (v50 & 0xffffffff);
        if (*v53 == v4)
        {
            v54 = sub_84f30(a1 + 1, v53 + 1, a2, v45, (char *)v14 + v3) + 4;
            if (v54 > v39)
            {
                *a3 = v2 - v50;
                v39 = v54;
                if ((char *)a1 + v39 == a2)
                    return v39;
            }
        }
        if ((unsigned int)v50 <= v48)
            return v39;
        v55 = v52 - 1;
        if (v52 < 1)
            return v39;
        v50 = v51[(unsigned int)v50 & v44 - 1];
        v52 = v55;
        if (v49 > (unsigned int)v50)
            return v39;
    }
}
