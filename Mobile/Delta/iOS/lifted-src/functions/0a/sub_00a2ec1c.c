/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2ec1c..0xa2edc0 (420 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2ec1c_1 {
    char padding_0[36];
    struct st_a2ec1c_0 *field_24;
    char padding_2c[4];
    long long field_30;
} st_a2ec1c_1;

typedef struct st_a2ec1c_3 {
    unsigned long long field_0;
} st_a2ec1c_3;

typedef struct st_a2ec1c_0 {
    struct st_a2ec1c_0 *field_0;
} st_a2ec1c_0;

typedef struct st_a2ec1c_2 {
    char padding_0[4];
    unsigned int field_4;
    unsigned int field_8;
    char padding_c[36];
    struct st_a2ec1c_3 *field_30;
    char padding_38[40];
    struct st_a2ec1c_0 *field_60;
} st_a2ec1c_2;


st_a2ec1c_2 * sub_a2ec1c(st_a2ec1c_2 *a0, st_a2ec1c_1 *a1)
{
    unsigned long long v13;  // x28
    unsigned long long v14;  // x27
    unsigned long long v23;  // x30
    st_a2ec1c_2 *v25;  // x0
    unsigned int v26;  // w28
    st_a2ec1c_0 **v27;  // x23
    st_a2ec1c_0 **v28;  // x23
    st_a2ec1c_2 *v29;  // x0
    unsigned long v30;  // cc_dep1
    unsigned long v31;  // cc_dep2
    unsigned long long v32;  // 4112
    unsigned long long v15;  // x26
    unsigned long long v33;  // 4108
    unsigned long long v34;  // 4112
    unsigned long long v35;  // 4108
    unsigned long long v16;  // x25
    unsigned long long v17;  // x24
    unsigned long long v18;  // x23
    unsigned long long v19;  // x22
    unsigned long long v20;  // x21
    unsigned long long v21;  // x20
    unsigned long long v22;  // x19
    unsigned long long v0;  // [bp-0x60]
    unsigned long long v1;  // [bp-0x58]
    unsigned long long v2;  // [bp-0x50]
    unsigned long long v3;  // [bp-0x48]
    unsigned long long v4;  // [bp-0x40]
    unsigned long long v5;  // [bp-0x38]
    unsigned long long v6;  // [bp-0x30]
    unsigned long long v7;  // [bp-0x28]
    unsigned long long v8;  // [bp-0x20]
    unsigned long long v9;  // [bp-0x18]
    char *v10;  // [bp-0x10]
    unsigned long long v11;  // [bp-0x8]
    char v12;  // [bp+0x0]

    if ((a1->padding_0)[1])
        return a0;
    v0 = v13;
    v1 = v14;
    v2 = v15;
    v3 = v16;
    v4 = v17;
    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = &v12;
    v11 = v23;
    sub_a77638(sub_a2d6cc());
    if (a0->field_60)
        a0->field_60();
    v25 = sub_ad69e4(*(long long *)a1->padding_2c);
    v26 = (unsigned int)v25 - 1;
    if ((int)(unsigned int)v25 < 1)
        return v25;
    v27 = 0;
    while (1)
    {
        v28 = v27;
        v29 = sub_ad69f8(*(long long *)a1->padding_2c, v28);
        v30 = v29->field_4;
        v31 = a0->field_8;
        if (v29->field_4 == a0->field_8)
        {
            a0->field_30();
        }
        else if (!(a1->padding_0)[1])
        {
            v32 = arm64g_calculate_condition(3, v30, v31, 0);
            v27 = (unsigned int)v28 + 1;
            v33 = arm64g_calculate_condition(3, (v32 & 1 ? v26 : 0x40000000), (v32 & 1 ? v28 & 0xffffffff : 0), 0);
            if (v33 & 1)
                return v29;
        }
        else
        {
            v34 = arm64g_calculate_condition(3, v30, v31, 0);
            v27 = (unsigned int)v28 + 1;
            v35 = arm64g_calculate_condition(0, (v34 & 1 ? v26 : 0x40000000), (v34 & 1 ? v28 & 0xffffffff : 0), 0);
            if (v35 & 1)
                return v29;
        }
    }
}
