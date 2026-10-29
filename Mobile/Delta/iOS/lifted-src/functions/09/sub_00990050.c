/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x990050..0x9901c0 (368 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_990050_0 {
    struct st_990050_1 *field_0;
    unsigned long long field_8;
} st_990050_0;

typedef struct st_990050_2 {
    char field_0;
    char padding_1[7];
    unsigned long long field_8;
    char padding_10[8];
    struct st_990050_1 *field_18;
    unsigned long long field_20;
} st_990050_2;

typedef struct st_990050_1 {
    char field_0;
} st_990050_1;


unsigned long long sub_990050(st_990050_0 *a0, st_990050_2 *a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v17;  // x21
    unsigned long long v18;  // x22
    st_990050_0 *v19;  // x8
    unsigned long long v20;  // x11
    unsigned long long v21;  // x21
    st_990050_0 *v22;  // x8
    unsigned long long v23;  // x9
    unsigned long long v24;  // x21
    unsigned long long v25;  // x0
    char *v26;  // x8
    unsigned long long v9;  // x20
    unsigned long long v27;  // x9
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long long v12;  // x21
    unsigned long long v13;  // x0
    unsigned long long v14;  // x10
    char *v15;  // x8
    unsigned long long v16;  // x9
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0->field_8)
        return 0;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = 1 << ((char)(*(char *)a0->field_0) >> 6 & 63);
    if (a0->field_8 < v12)
        return 0;
    v13 = sub_a7b0d8(a0->field_0);
    v14 = a0->field_8;
    v15 = &a0->field_0[v12];
    v16 = v14 - v12;
    a0->field_0 = v15;
    a0->field_8 = v16;
    if ((v13 & 0xfffffffffffffffe) == 28 && v14 != v12 && (v17 = 1 << (*v15 >> 6 & 63), v17 <= v16))
    {
        v18 = v13;
        v19 = a0;
        a1->field_8 = sub_a7b0d8(v15);
        v20 = a0->field_8 - v17;
        a0->field_0 = &a0->field_0[v17];
        a0->field_8 = v20;
        a1->field_0 = a1->field_0 & 0xfffffffe | (char)v18 & 1;
        if (v18 & 1)
        {
            *(unsigned long long *)a1->padding_10 = 0;
            v23 = v19->field_8;
            goto LABEL_99016c;
        }
        else if (v19->field_8 && (v21 = 1 << ((char)(*(char *)v19->field_0) >> 6 & 63), v19->field_8 >= v21))
        {
            v22 = a0;
            *(unsigned long long *)a1->padding_10 = sub_a7b0d8(v19->field_0);
            v23 = a0->field_8 - v21;
            a0->field_0 = &a0->field_0[v21];
            a0->field_8 = v23;
            v19 = v22;
LABEL_99016c:
            if (v23)
            {
                v24 = 1 << ((char)(*(char *)v19->field_0) >> 6 & 63);
                if (v23 >= v24)
                {
                    v25 = sub_a7b0d8(v19->field_0);
                    v26 = &a0->field_0[v24];
                    v27 = a0->field_8 - v24;
                    a0->field_0 = v26;
                    a0->field_8 = v27;
                    if (v27 >= v25)
                    {
                        a1->field_18 = v26;
                        a0->field_0 = &v26[v25];
                        a0->field_8 = v27 - v25;
                        a1->field_20 = v25;
                        return 1;
                    }
                }
            }
        }
    }
    return 0;
}
