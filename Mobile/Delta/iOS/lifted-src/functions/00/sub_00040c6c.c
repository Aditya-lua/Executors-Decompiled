/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x40c6c..0x40d5c (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_40c6c_1 {
    char padding_0[8];
    struct st_40c6c_1 *field_8;
    char padding_10[12];
    unsigned int field_1c;
    void* field_20;
} st_40c6c_1;

typedef struct st_40c6c_0 {
    char field_0;
} st_40c6c_0;

typedef struct st_40c6c_2 {
    char padding_0[8];
    struct st_40c6c_2 *field_8;
    char padding_10[12];
    unsigned int field_1c;
    unsigned long long field_20;
} st_40c6c_2;

extern unsigned long long g_e66fd0;
extern st_40c6c_2 *g_f00ae0;
extern unsigned int g_f00bd0;

st_40c6c_1 * sub_40c6c(long long a0, st_40c6c_1 *a1)
{
    st_40c6c_1 *v5;  // x0
    st_40c6c_1 *v6;  // x8
    unsigned long v10;  // cc_dep1
    unsigned long v11;  // cc_dep2
    unsigned long v12;  // cc_ndep
    unsigned long long v13;  // 4112
    unsigned long long v14;  // 4102
    unsigned long v15;  // cc_op
    st_40c6c_1 *v16;  // x0
    st_40c6c_1 *v7;  // w9
    unsigned int v17;  // w9
    unsigned long v18;  // cc_dep1
    unsigned long long v19;  // x10
    unsigned long long v20;  // 4112
    unsigned long long v21;  // 4106
    unsigned long long v22;  // 4112
    unsigned long long v23;  // 4106
    unsigned long long v8;  // 4112
    unsigned long long v9;  // 4102
    st_40c6c_0 **v0;  // [bp-0x38], Other Possible Types: char
    st_40c6c_0 *v1;  // [bp-0x30]
    st_40c6c_1 *v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v2 = a1;
    v0 = &v1;
    v5 = sub_3a7e0(a0 + 264, &v2);
    if (v5 && (int)v5->field_8)
        return 1;
    v6 = v2;
    v7 = (st_40c6c_1 *)(int)v6->field_8;
    if (v6)
    {
        v8 = arm64g_calculate_condition(v15 | 16, v10, v11, v12);
        v9 = arm64g_calculate_condition(3, (v8 & 1 ? (unsigned long long)v7 : 0), (v8 & 1 ? g_f00bd0 : 0), 0);
        if (v9 & 1)
            goto LABEL_40cf8;
    }
    else
    {
        v13 = arm64g_calculate_condition(v15 | 16, v10, v11, v12);
        v14 = arm64g_calculate_condition(0, (v13 & 1 ? (unsigned long long)v7 : 0), (v13 & 1 ? g_f00bd0 : 0), 0);
        if (v14 & 1)
        {
LABEL_40cf8:
            v17 = v6->field_1c & 0xfffffffe;
            v18 = v17;
            v19 = 56;
            if (v17 == 14)
                v19 = 72;
            if ((v6->field_1c & 0xfffffffc) != 8)
            {
                v20 = arm64g_calculate_condition(19, v18, 14, 0);
                v21 = arm64g_calculate_condition(3, (v20 & 1 ? v17 : 0x40000000), (v20 & 1 ? 12 : 0), 0);
                if (!(v21 & 1))
                    goto LABEL_40d22;
                v19 = 88;
LABEL_40d21:
            }
            else
            {
                v22 = arm64g_calculate_condition(19, v18, 14, 0);
                v23 = arm64g_calculate_condition(0, (v22 & 1 ? v17 : 0x40000000), (v22 & 1 ? 12 : 0), 0);
                if (v23 & 1)
                    goto LABEL_40d21;
LABEL_40d22:
            }
            goto *((void *)(*(long long *)((char *)&g_e66fd0 + v19)));
        }
    }
    v16 = 0;
    if (v6 && v7 == (int)g_f00ae0)
        v16 = sub_40c6c(a0, v6->field_20);
    return v16;
}
