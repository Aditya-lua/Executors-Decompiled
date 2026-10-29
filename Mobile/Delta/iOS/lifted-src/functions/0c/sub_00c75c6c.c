/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc75c6c..0xc75cdc (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_c75c6c(unsigned long long *a0, unsigned long long a1)
{
    unsigned long long v4;  // x10
    unsigned int v0;  // [bp-0x38]
    unsigned long long v1;  // [bp-0x30]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = *a0 * 2;
    if (a1 + 1 > v4)
        v4 = a1 + 1;
    if (4 >= v4)
        v4 = 4;
    sub_c75cdc();
    if (!(v0 & 1))
    {
        *a0 = v4;
        a0[1] = v1;
        return 9223372036854775809;
    }
    return v1;
}
