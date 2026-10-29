/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f9c1c..0x1f9da4 (392 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f9c1c_3 {
    char field_0;
    char padding_1[3];
    unsigned int field_4;
    unsigned long long field_8;
} st_1f9c1c_3;

typedef struct st_1f9c1c_1 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned int field_10;
} st_1f9c1c_1;

typedef struct st_1f9c1c_4 {
    char padding_0[32];
    char field_20;
} st_1f9c1c_4;

typedef struct st_1f9c1c_2 {
    struct st_1f9c1c_1 *field_0;
    unsigned long long field_8;
    char padding_10[8];
    char field_18;
    char padding_19[23];
    long long field_30;
    unsigned long long field_38;
    char padding_40[40];
    long long field_68;
} st_1f9c1c_2;

typedef struct st_1f9c1c_0 {
    char field_0;
} st_1f9c1c_0;


double * sub_1f9c1c(st_1f9c1c_2 *a0, char a1)
{
    double *v6;  // x0
    unsigned long v7;  // cc_op
    st_1f9c1c_4 *v16;  // x8
    char v17;  // x9
    char v18;  // w8
    unsigned int v19;  // w9
    unsigned long long v20;  // 4112
    unsigned long long v21;  // 4102
    unsigned long long v22;  // 4112
    unsigned long long v23;  // 4102
    st_1f9c1c_3 *v24;  // x27
    unsigned long v8;  // cc_dep1
    unsigned long v9;  // cc_dep2
    unsigned long v10;  // cc_ndep
    char v11;  // x20
    char i;  // x21
    st_1f9c1c_1 *v13;  // x26
    unsigned int *v14;  // x25
    unsigned int v15;  // w9
    st_1f9c1c_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_1f9c1c_0 *v1;  // [bp-0x78]
    st_1f9c1c_0 **v2;  // [bp-0x70], Other Possible Types: char
    st_1f9c1c_0 *v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v3 = &v2;
    v2 = &v3;
    *(unsigned long long *)&a0->padding_19[7] = 0;
    sub_1fb5d8(&a0->field_30, a0->field_68);
    v6 = _bzero(a0->field_30, a0->field_38 * 8);
    if (a1)
    {
        v6 = sub_1f7364(&a0->field_18, a0->field_0->field_10);
        *(double *)&a0->field_0->field_8 = *v6;
    }
    if (!a0->field_8)
        return v6;
    v11 = 0;
    i = 0;
    do
    {
        v13 = a0->field_0;
        v14 = &v13->padding_0[v11];
        if (!*(long long *)&v14[6])
        {
            v15 = *v14 | 2;
            v7 = 3;
            v8 = v15;
            v9 = 2;
            v10 = 0;
            if (v15 == 2)
                goto LABEL_1f9cf8;
            *(unsigned long long *)&v14[6] = 0;
            v16 = &v13->padding_0[v11];
            v17 = *(long long *)&v16->field_20;
            if (!v17)
                goto LABEL_1f9d1c;
LABEL_1f9d10:
            v17 = (char)(struct st_1f9c1c_1 *)&a0->field_0[2 * v17].padding_0[v11];
LABEL_1f9d1c:
            *(unsigned long long *)&v16->field_20 = v17;
            v18 = *v14;
            v19 = 1 << (v18 & 31) & 1835012;
            if (v18 <= 20)
            {
                v20 = arm64g_calculate_condition(v7 | 144, v8, v9, v10);
                v21 = arm64g_calculate_condition(3, (v20 & 1 ? v19 : 0x40000000), 0, 0);
                if (v21 & 1)
                    continue;
            }
            else
            {
                v22 = arm64g_calculate_condition(v7 | 144, v8, v9, v10);
                v23 = arm64g_calculate_condition(0, (v22 & 1 ? v19 : 0x40000000), 0, 0);
                if (v23 & 1)
                    continue;
            }
            v24 = &v13->padding_0[v11];
            v6 = sub_1f7364(&a0->field_18, v24->field_4);
            *(double *)&v24->field_8 = *v6;
            v18 = *(int *)&v24->field_0;
        }
        else
        {
LABEL_1f9cf8:
            *(st_1f9c1c_1 **)&v14[6] = &v13[2 * *(long long *)&v14[6]].padding_0[v11];
            v16 = &v13->padding_0[v11];
            v17 = *(long long *)&v16->field_20;
            if (!v17)
                goto LABEL_1f9d1c;
            goto LABEL_1f9d10;
        }
        if (!v18 && v13[1].padding_0[v11] & 1)
            *v14 = 1;
        i += 1;
        v11 += 40;
        v7 = 4;
        v8 = i;
        v9 = a0->field_8;
        v10 = 0;
    } while (a0->field_8 > i);
    return v6;
}
