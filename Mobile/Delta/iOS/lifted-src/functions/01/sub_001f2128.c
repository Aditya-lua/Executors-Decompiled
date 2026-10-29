/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f2128..0x1f215c (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_f02830[4];

long long sub_1f2128(unsigned int a0)
{
    unsigned int v0;  // w9
    unsigned int v1;  // w10

    v0 = a0 - 100;
    if (a0 != 200)
        v1 = 20;
    else
        v1 = 21;
    if (v0 < 19)
        v1 = v0;
    if (!a0)
        v1 = 19;
    return g_f02830[v1];
}
