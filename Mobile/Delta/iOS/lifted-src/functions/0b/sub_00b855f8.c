/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb855f8..0xb85668 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b855f8_0 {
    long long field_0;
    char padding_8[8];
    unsigned long long field_10;
} st_b855f8_0;


st_b855f8_0 * sub_b855f8(st_b855f8_0 *a0)
{
    unsigned long v2;  // cc_op
    unsigned long v3;  // cc_dep1
    unsigned long long v12;  // 4102
    unsigned long v4;  // cc_dep2
    unsigned long v5;  // cc_ndep
    unsigned long long v6;  // 4102
    st_b855f8_0 *v7;  // x0
    unsigned long long v8;  // x9
    unsigned long long v9;  // 4110
    unsigned long long v10;  // 4102
    unsigned long long v11;  // 4110
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    do
    {
        /* unsupported instruction */;
        v2 = 4;
        v3 = /* unsupported instruction */;
        v4 = 1;
        v5 = 0;
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    v6 = arm64g_calculate_condition(20, v3, 1, 0);
    v7 = a0;
    if (!(v6 & 1))
    {
        /* unsupported instruction */;
        v7 = sub_b86a90(a0->field_0);
    }
    v8 = a0->field_10 * 0x11;
    if (a0->field_10)
    {
        v9 = arm64g_calculate_condition(v2 | 16, v3, v4, v5);
        v10 = arm64g_calculate_condition(18, (v9 & 1 ? v8 : 0x40000000), (v9 & 1 ? 25 : 0), 0);
        if (!(v10 & 1))
            return v7;
    }
    else
    {
        v11 = arm64g_calculate_condition(v2 | 16, v3, v4, v5);
        v12 = arm64g_calculate_condition(16, (v11 & 1 ? v8 : 0x40000000), (v11 & 1 ? 25 : 0), 0);
        if (!(v12 & 1))
            return v7;
    }
}
