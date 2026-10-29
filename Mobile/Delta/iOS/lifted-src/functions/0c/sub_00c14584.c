/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc14584..0xc1460c (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


uint128_t sub_c14584(char *a0, uint128_t a1)
{
    uint128_t v0;  // x11
    uint128_t v1;  // x1
    char v2;  // w9
    unsigned int v3;  // w11
    unsigned long long v4;  // x12
    unsigned long long v5;  // 4151

    if (*a0 == 32)
        return 0;
    v0 = 0;
    do
    {
        v1 = v0;
        if (!a1)
            return 1;
        v2 = *a0;
        a0 += 1;
        if (v2 == 32)
            return 1;
        v3 = v2 - 48;
        if (9 < v3)
            return 0;
        v4 = v1 * 10;
        v0 = v4 + v3;
        v5 = arm64g_calculate_condition(50, v4, v3, 0);
    } while (v1 * 10 <= 0xffffffffffffffff && (a1 -= 1, v5 & 1));
    return 0;
}
