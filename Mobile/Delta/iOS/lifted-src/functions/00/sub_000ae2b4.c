/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae2b4..0xae508 (596 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae2b4_1 {
    char padding_0[8];
    struct st_ae2b4_2 *field_8;
    unsigned long long field_10;
    unsigned int field_18;
    unsigned int field_1c;
    char padding_20[8];
    unsigned int field_28;
    unsigned int field_2c;
    char padding_30[64];
    struct st_ae2b4_3 *field_70;
    char padding_78[8];
    struct st_ae2b4_3 *field_80;
    char padding_88[120];
    unsigned int field_100;
    unsigned int field_104;
    unsigned int field_108;
    unsigned int field_10c;
    char padding_110[28];
    unsigned int field_12c;
} st_ae2b4_1;

typedef struct st_ae2b4_3 {
    unsigned int field_0;
} st_ae2b4_3;

typedef struct st_ae2b4_2 {
    unsigned long long field_0;
} st_ae2b4_2;

typedef struct st_ae2b4_0 {
    char field_0;
} st_ae2b4_0;


unsigned long long sub_ae2b4(st_ae2b4_1 *a0, void* a1, long long a2, unsigned long long *a3)
{
    unsigned int *v9;  // x22
    char v10;  // x15
    unsigned long v19;  // cc_op
    unsigned long v20;  // cc_dep1
    unsigned long v21;  // cc_dep2
    unsigned long v22;  // cc_ndep
    unsigned long long v23;  // 4112
    unsigned long long v24;  // 4108
    unsigned int v11;  // w10
    unsigned long long v25;  // 4112
    unsigned long long v26;  // 4108
    unsigned long long *v12;  // x23
    unsigned int v27;  // w5
    char v28;  // x12
    unsigned int *v29;  // x14
    unsigned int v30;  // w16
    char v31;  // x15
    unsigned long v32;  // cc_dep1
    unsigned long v13;  // x4
    unsigned long v33;  // cc_dep2
    unsigned long long v34;  // 4102
    unsigned long index;  // x17
    unsigned long long v36;  // 4102
    unsigned long idx;  // x1
    unsigned long v38;  // x13
    unsigned int v39;  // w9
    unsigned int v40;  // w20
    unsigned long long v41;  // x24
    unsigned long v42;  // x27
    unsigned int v14;  // w11
    unsigned int *v43;  // x8
    unsigned long long v44;  // x0
    unsigned int v45;  // w20
    unsigned int v15;  // w12
    unsigned long v16;  // x25
    unsigned int v17;  // w14
    unsigned long i;  // x13
    unsigned int v0;  // [bp-0xa4]
    unsigned int v1;  // [bp-0x94]
    unsigned long v2;  // [bp-0x90]
    st_ae2b4_0 **v3;  // [bp-0x80], Other Possible Types: char
    st_ae2b4_0 *v4;  // [bp-0x78]
    st_ae2b4_0 **v5;  // [bp-0x70], Other Possible Types: char
    st_ae2b4_0 *v6;  // [bp-0x68]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v4 = &v3;
    v3 = &v4;
    v9 = a0->field_80;
    v10 = a0->field_104;
    v11 = 1 << (v10 & 31);
    v12 = a0->field_8;
    v13 = a0->field_10;
    v14 = a1 - v12;
    v15 = 1 << ((char)a0->field_100 & 31);
    v16 = a0->field_18;
    v17 = a0->field_1c;
    i = a0->field_2c;
    if (v15 < v14 - a0->field_1c)
    {
        v23 = arm64g_calculate_condition(v19 | 128, v20, v21, v22);
        v24 = arm64g_calculate_condition(3, (v23 & 1 ? a0->field_28 : 0), 0, 0);
        if (!(v24 & 1))
            goto LABEL_ae332;
LABEL_ae331:
        v17 = v14 - v15;
    }
    else
    {
        v25 = arm64g_calculate_condition(v19 | 128, v20, v21, v22);
        v26 = arm64g_calculate_condition(0, (v25 & 1 ? a0->field_28 : 0), 0, 0);
        if (v26 & 1)
            goto LABEL_ae331;
LABEL_ae332:
    }
    if (v14 < v11)
        v27 = 0;
    else
        v27 = v14 - v11;
    v28 = a0->field_10c;
    v6 = &v5;
    v5 = &v6;
    v29 = a0->field_70;
    v30 = ~(0xffffffff << (v10 & 31));
    v31 = 64 - a0->field_108;
    v32 = i & 0xffffffff;
    v33 = v14;
    if (a0->field_12c)
    {
        v34 = arm64g_calculate_condition(35, v32, v33, 0);
        if (!(v34 & 1))
        {
            index = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v12 + i) >> (v31 & 63);
            v9[(unsigned int)i & v30] = v29[index];
            v29[index] = i;
        }
    }
    else
    {
        v36 = arm64g_calculate_condition(35, v32, v33, 0);
        if (!(v36 & 1))
        {
            do
            {
                idx = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v12 + i) >> (v31 & 63);
                v9[(unsigned int)i & v30] = v29[idx];
                v29[idx] = i;
                i += 1;
            } while (i < v14);
        }
    }
    v38 = *(long long *)a1;
    a0->field_2c = v14;
    v39 = v29[0xcf1bbcdcbf9b0000 * v38 >> (v31 & 63)];
    if (v17 > v39)
        return 3;
    v0 = v14 + 3;
    v40 = (1 << (v28 & 31)) - 1;
    v41 = 3;
    v2 = v13;
    v1 = v27;
    while (1)
    {
        v42 = v39;
        if ((unsigned int)v16 > v39)
        {
            v43 = v13 + v42;
            if (*v43 == *(int *)a1 && !(v44 = sub_84f30(a1 + 4, v43 + 1, a2, v13 + v16, (char *)v12 + v16) + 4, v13 = v2, v27 = v1, v41 >= v44))
                goto LABEL_ae498;
        }
        else if (*(int *)((char *)v12 + v42 + v41 - 3) == *(int *)((char *)a1 + v41 - 3) && !(v44 = sub_7cdfc(a1), v13 = v2, v27 = v1, v44 <= v41))
        {
LABEL_ae498:
            *a3 = v0 - v42;
            v41 = v44;
            if (a1 + v44 == a2)
                return v44;
        }
        if ((unsigned int)v42 <= v27 || !(v45 = v40 - 1, v40 >= 1))
            break;
        v39 = v9[(unsigned int)v42 & v11 - 1];
        v40 -= 1;
        if (v17 > v39)
            return v41;
    }
    return v41;
}
