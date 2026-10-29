/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc13a2c..0xc13a74 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_c13a2c(unsigned long long a0, unsigned long a1, unsigned long long a2, unsigned long long a3)
{
    unsigned long long v2;  // x8
    unsigned long long *v3;  // x9
    unsigned long long v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]

    if (a0)
    {
        v2 = a3 * a0;
        v1 = a2;
        v3 = &v0;
    }
    else
    {
        v2 = 0;
        v3 = &v1;
    }
    *v3 = v2;
    if (!v1)
    {
        return;
    }
    else if (!v0)
    {
        return;
    }
}
