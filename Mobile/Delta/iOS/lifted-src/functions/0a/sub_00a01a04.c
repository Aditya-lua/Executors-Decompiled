/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa01a04..0xa01a5c (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a01a04(long long a0, long long a1, unsigned int *a2)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a01940();
    if (!(unsigned int)v2)
        return v2;
    v3 = sub_a60ad0(a0 + 8, a1, a2);
    if (!(unsigned int)v3)
        return v3;
    return !*a2;
}
