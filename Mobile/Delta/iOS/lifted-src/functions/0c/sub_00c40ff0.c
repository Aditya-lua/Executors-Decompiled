/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc40ff0..0xc4108c (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c40ff0_0 {
    unsigned long long field_0;
} st_c40ff0_0;


void sub_c40ff0(void* *a0)
{
    void* v2;  // x19
    unsigned long long v3;  // x8
    unsigned long v6;  // cc_dep2
    unsigned long v7;  // cc_ndep
    unsigned long long v8;  // 4110
    unsigned long long v9;  // 4102
    unsigned long v10;  // cc_op
    unsigned long v11;  // cc_dep1
    st_c40ff0_0 **v12;  // x21
    unsigned long long v4;  // 4110
    unsigned long long v5;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *a0;
    v3 = v2 & 3;
    if (2 <= v3 - 2)
    {
        v4 = arm64g_calculate_condition(v10 | 32, v11, v6, v7);
        v5 = arm64g_calculate_condition(20, (v4 & 1 ? v3 : 0x40000000), 0, 0);
        if (!(v5 & 1))
            return;
    }
    else
    {
        v8 = arm64g_calculate_condition(v10 | 32, v11, v6, v7);
        v9 = arm64g_calculate_condition(16, (v8 & 1 ? v3 : 0x40000000), 0, 0);
        if (!(v9 & 1))
            return;
    }
    v12 = (long long)v2[7];
    if (*v12)
        (*v12)();
    if (v12[1])
        _free(*(long long *)((char *)v2 - 1));
    _free();
    return;
}
