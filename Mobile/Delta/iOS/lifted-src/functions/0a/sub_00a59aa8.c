/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa59aa8..0xa59af4 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a59aa8(long long a0, long long a1)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_ab146c(a1);
    if (!(unsigned int)v2)
        return v2;
    v3 = sub_a5ab14(a0, 6, a1);
    if ((unsigned int)v3)
        return v3;
    sub_ab1360(a1);
    return 0;
}
