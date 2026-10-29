/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2b938..0xa2b990 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a2b938(unsigned long a0, unsigned long a1, unsigned long long *a2)
{
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    long long v0;  // [bp-0x30]
    long long v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = sub_a2b9a0();
    if (!(unsigned int)v4)
        return v4;
    if (a1)
    {
        v5 = sub_a0daf0(a1, v1, v0);
        if (!(unsigned int)v5)
            return v5;
    }
    *a2 = 32;
    return 1;
}
