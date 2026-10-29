/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafae4..0xafcc8 (484 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afae4_1 {
    char padding_0[8];
    struct st_afae4_2 *field_8;
    char padding_10[12];
    unsigned int field_1c;
    char padding_20[8];
    unsigned int field_28;
    unsigned int field_2c;
    char padding_30[64];
    struct st_afae4_2 *field_70;
    char padding_78[8];
    struct st_afae4_2 *field_80;
    char padding_88[120];
    unsigned int field_100;
    unsigned int field_104;
    unsigned int field_108;
    unsigned int field_10c;
    char padding_110[28];
    unsigned int field_12c;
} st_afae4_1;

typedef struct st_afae4_2 {
    unsigned int field_0;
} st_afae4_2;

typedef struct st_afae4_0 {
    char field_0;
} st_afae4_0;


unsigned long long sub_afae4(st_afae4_1 *a0, unsigned int *a1, unsigned long a2, unsigned long long *a3)
{
    unsigned int *v7;  // x23
    char v8;  // x15
    unsigned long v15;  // cc_dep2
    unsigned long v16;  // cc_ndep
    unsigned long long v17;  // 4112
    unsigned long long v18;  // 4108
    unsigned long v19;  // cc_op
    unsigned long v20;  // cc_dep1
    unsigned long long v21;  // 4112
    unsigned long long v22;  // 4108
    unsigned int v9;  // w10
    unsigned int *v10;  // x24
    unsigned int v23;  // w26
    char v24;  // x12
    unsigned int *v25;  // x14
    unsigned int v26;  // w16
    char v27;  // x15
    unsigned long v28;  // cc_dep1
    unsigned long v29;  // cc_dep2
    unsigned long long v30;  // 4102
    unsigned int v11;  // w11
    unsigned int v31;  // w17
    unsigned long long v32;  // 4102
    unsigned int v33;  // w1
    unsigned long v34;  // x28
    unsigned int v35;  // w20
    unsigned long long v36;  // x22
    unsigned long long v37;  // x0
    unsigned int v38;  // w20
    unsigned int v12;  // w12
    unsigned int v13;  // w14
    unsigned long i;  // x13
    unsigned int v0;  // [bp-0x94]
    st_afae4_0 **v1;  // [bp-0x80], Other Possible Types: char
    st_afae4_0 *v2;  // [bp-0x78]
    st_afae4_0 **v3;  // [bp-0x70], Other Possible Types: char
    st_afae4_0 *v4;  // [bp-0x68]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v2 = &v1;
    v1 = &v2;
    v7 = a0->field_80;
    v8 = a0->field_104;
    v9 = 1 << (v8 & 31);
    v10 = a0->field_8;
    v11 = a1 - v10;
    v12 = 1 << ((char)a0->field_100 & 31);
    v13 = a0->field_1c;
    i = a0->field_2c;
    if (v12 < v11 - a0->field_1c)
    {
        v17 = arm64g_calculate_condition(v19 | 128, v20, v15, v16);
        v18 = arm64g_calculate_condition(3, (v17 & 1 ? a0->field_28 : 0), 0, 0);
        if (!(v18 & 1))
            goto LABEL_afb5e;
LABEL_afb5d:
        v13 = v11 - v12;
    }
    else
    {
        v21 = arm64g_calculate_condition(v19 | 128, v20, v15, v16);
        v22 = arm64g_calculate_condition(0, (v21 & 1 ? a0->field_28 : 0), 0, 0);
        if (v22 & 1)
            goto LABEL_afb5d;
LABEL_afb5e:
    }
    if (v11 < v9)
        v23 = 0;
    else
        v23 = v11 - v9;
    v24 = a0->field_10c;
    v4 = &v3;
    v3 = &v4;
    v25 = a0->field_70;
    v26 = ~(0xffffffff << (v8 & 31));
    v27 = 32 - a0->field_108;
    v28 = i & 0xffffffff;
    v29 = v11;
    if (a0->field_12c)
    {
        v30 = arm64g_calculate_condition(35, v28, v29, 0);
        if (!(v30 & 1))
        {
            v31 = 2654435761 * *(int *)((char *)v10 + i) >> (v27 & 31);
            v7[(unsigned int)i & v26] = v25[v31];
            v25[v31] = i;
        }
    }
    else
    {
        v32 = arm64g_calculate_condition(35, v28, v29, 0);
        if (!(v32 & 1))
        {
            do
            {
                v33 = 2654435761 * *(int *)((char *)v10 + i) >> (v27 & 31);
                v7[(unsigned int)i & v26] = v25[v33];
                v25[v33] = i;
                i += 1;
            } while (i < v11);
        }
    }
    a0->field_2c = v11;
    v34 = v25[2654435761 * *a1 >> (v27 & 31)];
    if (v13 > (unsigned int)v34)
        return 3;
    v0 = v11 + 3;
    v35 = (1 << (v24 & 31)) - 1;
    v36 = 3;
    while (1)
    {
        if (*(int *)((char *)v10 + (v34 & 0xffffffff) + v36 - 3) == *(int *)((char *)a1 + v36 - 3))
        {
            v37 = sub_7cdfc(a1);
            if (v37 > v36)
            {
                *a3 = v0 - v34;
                v36 = v37;
                if ((char *)a1 + v36 == a2)
                    return v37;
            }
        }
        if ((unsigned int)v34 <= v23)
            return v36;
        v38 = v35 - 1;
        if (v35 < 1)
            return v36;
        v34 = v7[(unsigned int)v34 & v9 - 1];
        v35 = v38;
        if (v13 > (unsigned int)v34)
            return v36;
    }
}
