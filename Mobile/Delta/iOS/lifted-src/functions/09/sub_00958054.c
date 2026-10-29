/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x958054..0x9580bc (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_958054(unsigned long a0, unsigned long long *a1, unsigned int *a2, unsigned long long a3)
{
    unsigned long long v5;  // x8
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    unsigned long long v9;  // x8
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a2 || (v5 = *a2, !(unsigned int)v5))
    {
        v9 = 0;
    }
    else if (v5 >> 31 & 1)
    {
        return 0;
    }
    else if (a3 >= (int)v5)
    {
        v0 = v6;
        v1 = v7;
        v2 = &v4;
        v3 = v8;
        _memcpy();
        v9 = *a2;
    }
    else
    {
        return 0;
    }
    *a1 = v9;
    return 1;
}
