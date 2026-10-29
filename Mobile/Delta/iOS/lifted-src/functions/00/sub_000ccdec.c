/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xccdec..0xcce34 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_ccdec(unsigned long long a0, unsigned long long a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
    {
        return 0;
    }
    else if (a1 >> 5 < 513)
    {
        return 0;
    }
    else if (!(a0 & 7))
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        _bzero();
        return a0;
    }
    else
    {
        return 0;
    }
}
