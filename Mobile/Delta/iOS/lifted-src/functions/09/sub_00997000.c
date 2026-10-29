/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x997000..0x997034 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_997000(void)
{
    unsigned long long v3;  // x30
    unsigned int v4;  // w0
    unsigned long v5;  // cc_dep1
    unsigned int v6;  // w10
    unsigned long long v7;  // 4112
    unsigned long long v8;  // 4108
    unsigned long long v9;  // 4112
    unsigned long long v10;  // 4108
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    v0 = &v2;
    v1 = v3;
    v4 = sub_9c7b68(sub_a2d030());
    v5 = v4;
    if (v4 == 64)
        v6 = 1;
    else
        v6 = 0;
    if (4 <= v4 - 672)
    {
        v7 = arm64g_calculate_condition(35, v5, 64, 0);
        v8 = arm64g_calculate_condition(3, (v7 & 1 ? v4 : 0x40000000), (v7 & 1 ? 4 : 0), 0);
        if (!(v8 & 1))
            return v6;
    }
    else
    {
        v9 = arm64g_calculate_condition(35, v5, 64, 0);
        v10 = arm64g_calculate_condition(0, (v9 & 1 ? v4 : 0x40000000), (v9 & 1 ? 4 : 0), 0);
        if (!(v10 & 1))
            return v6;
    }
    return 1;
}
