/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5faa0..0xc5fafc (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long * sub_c5faa0(long long *a0, long long a1)
{
    long long v2;  // x2
    long long v3;  // x19
    unsigned long long v4;  // 4105
    long long *dst;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1)
        return a0;
    v2 = a0[2];
    v3 = v2 - a1;
    if ((unsigned long long)v2 >= (unsigned long long)a1)
    {
        a0[2] = 0;
        v4 = arm64g_calculate_condition(4, v2, a1, 0);
        if (v4 & 1)
            return a0;
        dst = _memmove(a0[1], a0[1] + a1, v3);
        a0[2] = v3;
        return dst;
    }
    sub_c73bb0(0);
}
