/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xcdc54..0xcdd28 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_cdc54_1 {
    char padding_0[104];
    unsigned long long field_68;
    char padding_70[16];
    unsigned long long field_80;
    unsigned long long field_88;
    struct st_cdc54_1 *field_90;
    char padding_98[88];
    unsigned long long field_f0;
    unsigned long long field_f8;
    unsigned long long field_100;
} st_cdc54_1;

typedef struct st_cdc54_0 {
    char field_0;
} st_cdc54_0;


st_cdc54_1 * sub_cdc54(st_cdc54_1 *a0)
{
    unsigned long v5;  // x8
    unsigned long v6;  // cc_op
    unsigned long v9;  // cc_ndep
    unsigned long long v10;  // 4110
    unsigned long long v11;  // 4102
    unsigned long v12;  // cc_dep1
    unsigned long v13;  // cc_dep2
    unsigned long v14;  // x9
    unsigned long v15;  // x10
    unsigned long v16;  // x10
    unsigned long v17;  // x11
    st_cdc54_1 *v18;  // w0
    unsigned long long v7;  // 4110
    unsigned long long v8;  // 4102
    st_cdc54_1 *v0;  // [bp-0x40]
    st_cdc54_0 **v1;  // [bp-0x30], Other Possible Types: char
    st_cdc54_0 *v2;  // [bp-0x28]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = &v1;
    v1 = &v2;
    if (!a0)
    {
        return 0xffffff9a;
    }
    else if (a0->field_90)
    {
        v5 = a0->field_80 + 1;
        if (a0->field_68 != 0xffff)
        {
            v7 = arm64g_calculate_condition(v6 | 16, v12, v13, v9);
            v8 = arm64g_calculate_condition(4, (v7 & 1 ? v5 : 0), (v7 & 1 ? a0->field_68 : 0), 0);
            if (v8 & 1)
                return 0xffffff9c;
        }
        else
        {
            v10 = arm64g_calculate_condition(v6 | 16, v12, v13, v9);
            v11 = arm64g_calculate_condition(0, (v10 & 1 ? v5 : 0), (v10 & 1 ? 0xffff : 0), 0);
            if (v11 & 1)
                return 0xffffff9c;
        }
        v14 = a0->field_f0;
        v15 = a0->field_f8;
        v16 = a0->field_100;
        v17 = a0->field_88;
        a0->field_80 = v5;
        a0->field_88 = v14 + v15 + v16 + v17 + 46;
        v0 = 0;
        v18 = (st_cdc54_1 *)(unsigned int)sub_cdd28();
        a0->field_90 = !v18;
        return v18;
    }
    else
    {
        return 0xffffff9c;
    }
}
