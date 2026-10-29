/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc13c14..0xc13ca4 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_c13c14(unsigned long long *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4)
{
    unsigned long long v7;  // x8
    unsigned long long v8;  // 4107
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long long v12;  // x9
    unsigned long v0;  // [bp-0x38]
    unsigned long long v1;  // [bp-0x30]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v7 = a2 + a1;
    v8 = arm64g_calculate_condition(50, a2, a1, 0);
    if (!(v8 & 1))
        return 0;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    if (*a0 * 2 >= v7)
        v7 = *a0 * 2;
    v12 = 4;
    if (a4 == 1)
        v12 = 8;
    if (v12 >= v7)
        v7 = v12;
    sub_c75134();
    if (v0 != 1)
    {
        *a0 = v7;
        a0[1] = v1;
        return 9223372036854775809;
    }
    return v1;
}
