/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc685ac..0xc68640 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_c685ac(unsigned long a0, unsigned long long a1)
{
    unsigned long long v2;  // x20
    unsigned long long v3;  // x0
    unsigned long v12;  // cc_dep1
    unsigned long v13;  // cc_dep2
    unsigned long v14;  // cc_ndep
    unsigned long long v15;  // 4102
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    long long v6;  // x19
    unsigned long long v7;  // x0
    unsigned long long v8;  // x0
    unsigned long long v9;  // x0
    unsigned long long v10;  // x0
    unsigned long v11;  // cc_op
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_a69cc4();
    if (!(a1 >> 31 & 1))
    {
        if (30 >= (unsigned int)v2)
        {
            v3 = sub_a69c94();
            if (!(unsigned int)v3)
                return v3;
        }
        else
        {
            return 0;
        }
    }
    v4 = sub_a69c94();
    if (!(unsigned int)v4)
        return v4;
    v5 = sub_a69ca4();
    if (!(unsigned int)v5)
        return v5;
    v7 = sub_a69c9c(v6, 5);
    if (!(unsigned int)v7)
        return v7;
    if (v2 >> 31 & 1)
        return 1;
    v8 = sub_a69c88();
    if (!(unsigned int)v8)
        return v8;
    v9 = sub_a69ca4();
    if (!(unsigned int)v9)
        return v9;
    v10 = sub_a69c6c();
    if (!(unsigned int)v10)
        return v10;
    sub_a69cb8();
    v15 = arm64g_calculate_condition(v11 | 16, v12, v13, v14);
    if (v15 & 1)
        return sub_a69cac(sub_a69c48());
    return 1;
}
