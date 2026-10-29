/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c6c68..0x1c6ce4 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char * sub_1c6c68(unsigned long a0, char *a1, char *a2)
{
    unsigned int v2;  // w8
    unsigned int v3;  // w9
    unsigned long long v4;  // x9
    unsigned long long v5;  // 4110
    unsigned long long v6;  // 4102
    unsigned long long v7;  // 4110
    unsigned long long v8;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1 == a2)
        return a1;
    v2 = *a1;
    v3 = v2 - 36;
    v4 = 1 << ((char)v3 & 63) & 540431955418678513;
    if (v3 <= 58)
    {
        v5 = arm64g_calculate_condition(148, a1, a2, 0);
        v6 = arm64g_calculate_condition(4, (v5 & 1 ? v4 : 0x40000000), 0, 0);
        if (!(v6 & 1))
            return a1;
    }
    else
    {
        v7 = arm64g_calculate_condition(148, a1, a2, 0);
        v8 = arm64g_calculate_condition(0, (v7 & 1 ? v4 : 0x40000000), 0, 0);
        if (!(v8 & 1))
            return a1;
    }
    if (v2 - 123 >= 3)
    {
        sub_1bbad0();
        return a1 + 1;
    }
    return a1;
}
