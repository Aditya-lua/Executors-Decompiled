/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb39fb8..0xb39fe4 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_ee63f0[4];

long long sub_b39fb8(unsigned int a0)
{
    unsigned int v0;  // w9

    if (!(a0 & 132))
        v0 = 2;
    else
        v0 = 3;
    if (!(a0 & 3))
        v0 = (a0 & 132) != 0;
    return g_ee63f0[v0];
}
