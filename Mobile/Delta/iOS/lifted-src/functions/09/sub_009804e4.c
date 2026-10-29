/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9804e4..0x980524 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9804e4(char *a0, char *a1)
{
    unsigned int v3;  // w2
    unsigned long v4;  // cc_op
    unsigned long v7;  // cc_ndep
    unsigned long long v8;  // 4112
    unsigned long long v9;  // 4102
    unsigned long v10;  // cc_dep1
    unsigned long v11;  // cc_dep2
    unsigned long long v12;  // x30
    unsigned long long v5;  // 4112
    unsigned long long v6;  // 4102
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    v3 = *a0;
    if (v3 <= 20)
    {
        v5 = arm64g_calculate_condition(v4 | 144, v10, v11, v7);
        v6 = arm64g_calculate_condition(3, (v5 & 1 ? v3 & 0xff : 0), (v5 & 1 ? *a1 : 0), 0);
        if (!(v6 & 1))
            return 1;
    }
    else
    {
        v8 = arm64g_calculate_condition(v4 | 144, v10, v11, v7);
        v9 = arm64g_calculate_condition(0, (v8 & 1 ? v3 & 0xff : 0), (v8 & 1 ? *a1 : 0), 0);
        if (!(v9 & 1))
            return 1;
    }
    v0 = &v2;
    v1 = v12;
    return _memcmp(a0 + 1, a1 + 1) != 0;
}
