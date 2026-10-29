/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x783f0..0x7845c (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_783f0(unsigned long long a0, unsigned int a1, unsigned int a2, unsigned int a3)
{
    unsigned int v0;  // w8
    unsigned long long v1;  // w8
    unsigned int v2;  // w9
    unsigned long long v3;  // w9
    unsigned int v4;  // w9
    unsigned int v5;  // w9
    unsigned long long v6;  // w9

    if (!(a1 * 0x100000000))
        v0 = 32;
    else
        v0 = Clz(a1 * 0x100000000);
    v1 = (unsigned int)(32 - v0);
    if (!(a2 * 0x100000000))
        v2 = 32;
    else
        v2 = Clz(a2 * 0x100000000);
    v3 = 33 - v2;
    if (v1 >= v3)
        v1 = v3;
    v4 = a1 - 1;
    if (!(v4 * 0x100000000))
        v5 = 32;
    else
        v5 = Clz(v4 * 0x100000000);
    v6 = 31 - a3 - v5;
    if (!a0)
        a0 = 11;
    if (v6 < a0)
        a0 = v6;
    if (a0 >= v1)
        v1 = a0;
    if (5 >= v1)
        v1 = 5;
    if (v1 >= 12)
        return 12;
    return v1;
}
