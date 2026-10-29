/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbf30c..0xbf358 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_cc0da0[4];

long long sub_bf30c(unsigned long long a0, unsigned long long a1)
{
    unsigned long long v0;  // x8
    unsigned int *v1;  // x8
    unsigned int v2;  // w8

    if (a0 > a1)
        v0 = a1 * 16 / a0 & 0xffffffff;
    else
        v0 = 15;
    v1 = &g_cc0da0[4 * v0];
    v2 = v1[2] + (unsigned int)(a0 >> 8) * v1[3];
    return *v1 + (unsigned int)(a0 >> 8) * v1[1] > v2 + (v2 >> 5);
}
