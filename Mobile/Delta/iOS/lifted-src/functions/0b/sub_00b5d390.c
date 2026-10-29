/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5d390..0xb5d40c (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b5d390(char *a0, unsigned long a1, long long a2)
{
    unsigned long long v3;  // x0
    unsigned long v4;  // x8
    unsigned long long v5;  // x0
    unsigned long long v0;  // [bp-0x22]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    v3 = sub_a2f9e0();
    if (!(unsigned int)v3)
        return v3;
    v4 = *a0;
    if (!(v4 >> 1 & 1))
        return 0;
    if (v4 >> 2 & 1 && ((unsigned int)v4 & 9) != 9)
    {
        v5 = sub_b5d0e8(a0, &v0, a2, (char *)&v0 + 1, 0);
        if (!(unsigned int)v5)
            return v5;
    }
    *(unsigned long long *)a2 = 0;
    return 1;
}
