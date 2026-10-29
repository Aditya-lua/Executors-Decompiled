/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98f92c..0x98f9e4 (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98f92c_0 {
    struct st_98f92c_1 *field_0;
    unsigned long long field_8;
} st_98f92c_0;

typedef struct st_98f92c_1 {
    char field_0;
} st_98f92c_1;


unsigned long long sub_98f92c(st_98f92c_0 *a0, unsigned long long *a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long v17;  // cc_op
    unsigned long v18;  // cc_dep1
    unsigned long v19;  // cc_dep2
    unsigned long v20;  // cc_ndep
    unsigned long long v21;  // 4110
    unsigned long long v22;  // 4102
    unsigned long long v9;  // x20
    unsigned long long v23;  // 4110
    unsigned long long v24;  // 4102
    unsigned long long v25;  // x21
    unsigned long long v26;  // x9
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long long v12;  // x21
    unsigned long long v13;  // x0
    unsigned long long v14;  // x10
    char *v15;  // x0
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
    if ((v13 & 0xfffffffffffffffe) == 18)
    {
        v21 = arm64g_calculate_condition(v17, v18, v19, v20);
        v22 = arm64g_calculate_condition(4, (v21 & 1 ? v14 : 0x40000000), (v21 & 1 ? v12 : 0), 0);
        if (!(v22 & 1))
            goto LABEL_98f990;
    }
    else
    {
        v23 = arm64g_calculate_condition(v17, v18, v19, v20);
        v24 = arm64g_calculate_condition(0, (v23 & 1 ? v14 : 0x40000000), (v23 & 1 ? v12 : 0), 0);
        if (!(v24 & 1))
        {
LABEL_98f990:
            v25 = 1 << (*v15 >> 6 & 63);
            if (v25 <= v16)
            {
                *a1 = sub_a7b0d8();
                v26 = a0->field_8 - v25;
                a0->field_0 = &a0->field_0[v25];
                a0->field_8 = v26;
                return 1;
            }
        }
    }
    return 0;
}
