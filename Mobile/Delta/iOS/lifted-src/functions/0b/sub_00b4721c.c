/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4721c..0xb472b4 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b4721c(unsigned long long *a0, long long a1, long long a2, long long a3, long long a4, long long a5)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *a0;
    if (v2)
    {
        v2 = sub_a7c198(v2);
        if (!(unsigned int)v2)
            return v2;
    }
    v3 = sub_a2f9e0(v2);
    if ((unsigned int)v3)
    {
        v3 = sub_b48b8c(a0, a5);
        if ((unsigned int)v3)
            v3 = sub_b45dd0(a0, a1, a2, a3, a4);
    }
    if (!*a0)
        return v3;
    sub_a7c1b4(*a0);
    return v3;
}
