/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7e4bc..0x7e4fc (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_7e4bc(unsigned long long a0, unsigned long a1, unsigned long a2)
{
    unsigned long v0;  // x8
    unsigned long long v1;  // x9
    unsigned int v2;  // w9
    unsigned int v3;  // w9
    unsigned int v4;  // w9

    if (!a2)
        return a0;
    v0 = 1 << ((char)a0 & 63);
    v1 = v0 + a2;
    v2 = (unsigned int)v1 - 1;
    if (!(v2 * 0x100000000))
        v3 = 32;
    else
        v3 = Clz(v2 * 0x100000000);
    if (v1 > 0x7fffffff)
        v4 = 31;
    else
        v4 = 32 - v3;
    if (a2 + a1 > v0)
        return v4;
    return a0 & 0xffffffff;
}
