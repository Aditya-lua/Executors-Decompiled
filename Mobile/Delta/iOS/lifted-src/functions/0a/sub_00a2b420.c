/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2b420..0xa2b4cc (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a2b420(long long a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, long long a5)
{
    unsigned int v5;  // w9
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long v11;  // cc_ndep
    unsigned long long v12;  // 4112
    unsigned long long v13;  // 4102
    unsigned long v14;  // cc_op
    unsigned long long v6;  // 4134
    unsigned long long v7;  // 4112
    unsigned long long v8;  // 4102
    unsigned int v0;  // [bp-0x2c]
    char v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    sub_9cf830(&v1, &v0, 0);
    v5 = v0;
    v6 = arm64g_calculate_condition(33, sub_a99eac(v1) - 1089, 2, 0);
    if (v6 & 1)
    {
        v7 = arm64g_calculate_condition(v14 | 32, v9, v10, v11);
        v8 = arm64g_calculate_condition(1, (v7 & 1 ? v5 : 0), v7 & 1, 0);
        if (v8 & 1)
            return (sub_a56ed8(a0, 0, 0, 0, a5) != 0) * 2;
    }
    else
    {
        v12 = arm64g_calculate_condition(v14 | 32, v9, v10, v11);
        v13 = arm64g_calculate_condition(0, (v12 & 1 ? v5 : 0), v12 & 1, 0);
        if (v13 & 1)
            return (sub_a56ed8(a0, 0, 0, 0, a5) != 0) * 2;
    }
    sub_a368c8();
    sub_a369bc("crypto/ec/ecx_meth.c", 552, "ecd_item_verify");
    sub_a36abc(16, 0x66, 0);
    return 0;
}
