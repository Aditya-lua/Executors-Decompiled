/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae06c..0xae2b4 (584 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae06c_1 {
    char padding_0[8];
    struct st_ae06c_2 *field_8;
    unsigned long long field_10;
    unsigned int field_18;
    unsigned int field_1c;
    char padding_20[8];
    unsigned int field_28;
    unsigned int field_2c;
    char padding_30[64];
    struct st_ae06c_2 *field_70;
    char padding_78[8];
    struct st_ae06c_2 *field_80;
    char padding_88[120];
    unsigned int field_100;
    unsigned int field_104;
    unsigned int field_108;
    unsigned int field_10c;
    char padding_110[28];
    unsigned int field_12c;
} st_ae06c_1;

typedef struct st_ae06c_2 {
    unsigned int field_0;
} st_ae06c_2;

typedef struct st_ae06c_0 {
    char field_0;
} st_ae06c_0;


unsigned long long sub_ae06c(st_ae06c_1 *a0, unsigned int *a1, long long a2, unsigned long long *a3)
{
    unsigned int *v10;  // x4
    unsigned int *v11;  // x22
    unsigned long i;  // x13
    unsigned long v21;  // cc_op
    unsigned long v22;  // cc_dep1
    unsigned long v23;  // cc_dep2
    unsigned long v24;  // cc_ndep
    unsigned long long v25;  // 4112
    unsigned long long v26;  // 4108
    char v12;  // x15
    unsigned long long v27;  // 4112
    unsigned long long v28;  // 4108
    unsigned int v13;  // w10
    unsigned int v29;  // w27
    char v30;  // x12
    unsigned int *v31;  // x14
    unsigned int v32;  // w16
    char v33;  // x15
    unsigned int *v14;  // x23
    unsigned long v34;  // cc_dep1
    unsigned long v35;  // cc_dep2
    unsigned long long v36;  // 4102
    unsigned int v37;  // w17
    unsigned long long v38;  // 4102
    unsigned int v39;  // w1
    unsigned int *v40;  // x28
    unsigned int v41;  // w9
    unsigned int v42;  // w24
    unsigned long long v43;  // x21
    unsigned long v15;  // x5
    unsigned long v44;  // x19
    unsigned int *v45;  // x8
    unsigned long long v46;  // x0
    unsigned int v47;  // w24
    unsigned int v16;  // w11
    unsigned int v17;  // w12
    unsigned long v18;  // x25
    unsigned int v19;  // w14
    unsigned int v0;  // [bp-0xac]
    unsigned long v1;  // [bp-0xa0]
    unsigned int *v2;  // [bp-0x98]
    unsigned int v3;  // [bp-0x8c]
    st_ae06c_0 **v4;  // [bp-0x80], Other Possible Types: char
    st_ae06c_0 *v5;  // [bp-0x78]
    st_ae06c_0 **v6;  // [bp-0x70], Other Possible Types: char
    st_ae06c_0 *v7;  // [bp-0x68]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v10 = a1;
    v5 = &v4;
    v4 = &v5;
    v11 = a0->field_80;
    v12 = a0->field_104;
    v13 = 1 << (v12 & 31);
    v14 = a0->field_8;
    v15 = a0->field_10;
    v16 = a1 - v14;
    v17 = 1 << ((char)a0->field_100 & 31);
    v18 = a0->field_18;
    v19 = a0->field_1c;
    i = a0->field_2c;
    if (v17 < v16 - a0->field_1c)
    {
        v25 = arm64g_calculate_condition(v21 | 128, v22, v23, v24);
        v26 = arm64g_calculate_condition(3, (v25 & 1 ? a0->field_28 : 0), 0, 0);
        if (!(v26 & 1))
            goto LABEL_ae0e6;
LABEL_ae0e5:
        v19 = v16 - v17;
    }
    else
    {
        v27 = arm64g_calculate_condition(v21 | 128, v22, v23, v24);
        v28 = arm64g_calculate_condition(0, (v27 & 1 ? a0->field_28 : 0), 0, 0);
        if (v28 & 1)
            goto LABEL_ae0e5;
LABEL_ae0e6:
    }
    if (v16 < v13)
        v29 = 0;
    else
        v29 = v16 - v13;
    v30 = a0->field_10c;
    v7 = &v6;
    v6 = &v7;
    v31 = a0->field_70;
    v32 = ~(0xffffffff << (v12 & 31));
    v33 = 32 - a0->field_108;
    v34 = i & 0xffffffff;
    v35 = v16;
    if (a0->field_12c)
    {
        v36 = arm64g_calculate_condition(35, v34, v35, 0);
        if (!(v36 & 1))
        {
            v37 = 2654435761 * *(int *)((char *)v14 + i) >> (v33 & 31);
            v11[(unsigned int)i & v32] = v31[v37];
            v31[v37] = i;
        }
    }
    else
    {
        v38 = arm64g_calculate_condition(35, v34, v35, 0);
        if (!(v38 & 1))
        {
            do
            {
                v39 = 2654435761 * *(int *)((char *)v14 + i) >> (v33 & 31);
                v11[(unsigned int)i & v32] = v31[v39];
                v31[v39] = i;
                i += 1;
            } while (i < v16);
        }
    }
    a0->field_2c = v16;
    v40 = v10;
    v3 = *v40;
    v41 = v31[2654435761 * *v40 >> (v33 & 31)];
    if (v19 > v41)
        return 3;
    v0 = v16 + 3;
    v42 = (1 << (v30 & 31)) - 1;
    v43 = 3;
    v1 = v15;
    v2 = v10;
    while (1)
    {
        v44 = v41;
        if ((unsigned int)v18 > v41)
        {
            v45 = v15 + v44;
            if (*v45 == v3 && !(v46 = sub_84f30(v10 + 1, v45 + 1, a2, v15 + v18, (char *)v14 + v18) + 4, v15 = v1, v10 = v2, v43 >= v46))
                goto LABEL_ae244;
        }
        else if (*(int *)((char *)v14 + v44 + v43 - 3) == *(int *)((char *)v40 + v43 - 3) && !(v46 = sub_7cdfc(v10), v15 = v1, v10 = v2, v46 <= v43))
        {
LABEL_ae244:
            *a3 = v0 - v44;
            v43 = v46;
            if ((char *)v10 + v46 == a2)
                return v46;
        }
        if ((unsigned int)v44 <= v29 || !(v47 = v42 - 1, v42 >= 1))
            break;
        v41 = v11[(unsigned int)v44 & v13 - 1];
        v42 -= 1;
        if (v19 > v41)
            return v43;
    }
    return v43;
}
