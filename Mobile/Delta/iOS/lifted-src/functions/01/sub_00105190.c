/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x105190..0x105220 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_105190_0 {
    char field_0;
} st_105190_0;


unsigned long long sub_105190(unsigned long a0, unsigned long long a1, unsigned long a2, unsigned long long a3, unsigned long a4)
{
    unsigned long long v10;  // x22
    unsigned long long v11;  // x21
    unsigned long v17;  // cc_ndep
    unsigned long long v18;  // 4110
    unsigned long long v19;  // 4105
    unsigned long v20;  // cc_op
    unsigned long v21;  // cc_dep1
    unsigned long v22;  // cc_dep2
    unsigned long long v23;  // 4110
    unsigned long long v24;  // 4105
    unsigned long long v12;  // x20
    unsigned long long v13;  // x19
    unsigned long long v14;  // x30
    unsigned long long v16;  // x0
    st_105190_0 **v0;  // [bp-0x48], Other Possible Types: char
    st_105190_0 *v1;  // [bp-0x40]
    char v2;  // [bp-0x31]
    unsigned long long v3;  // [bp-0x30]
    unsigned long long v4;  // [bp-0x28]
    unsigned long long v5;  // [bp-0x20]
    unsigned long long v6;  // [bp-0x18]
    char *v7;  // [bp-0x10]
    unsigned long long v8;  // [bp-0x8]
    char v9;  // [bp+0x0]

    v3 = v10;
    v4 = v11;
    v5 = v12;
    v6 = v13;
    v7 = &v9;
    v8 = v14;
    v1 = &v0;
    v0 = &v1;
    if (a1 < a3)
        a3 = a1;
    if (a4 < a1 - a3)
        a1 = a3 + a4;
    v2 = 0;
    v16 = sub_f0c14();
    if (a0 + a1 == v16)
    {
        v18 = arm64g_calculate_condition(v20, v21, v22, v17);
        v19 = arm64g_calculate_condition(4, (v18 & 1 ? a4 : 0x40000000), 0, 0);
        if (!(v19 & 1))
            return 0xffffffffffffffff;
    }
    else
    {
        v23 = arm64g_calculate_condition(v20, v21, v22, v17);
        v24 = arm64g_calculate_condition(0, (v23 & 1 ? a4 : 0x40000000), 0, 0);
        if (!(v24 & 1))
            return 0xffffffffffffffff;
    }
    return v16 - a0;
}
