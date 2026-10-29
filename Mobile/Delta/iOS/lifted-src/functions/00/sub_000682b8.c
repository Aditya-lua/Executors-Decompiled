/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x682b8..0x682d0 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_7fffff;

long long sub_682b8(int a0)
{
    unsigned int v0;  // w8

    if (0 <= a0)
        v0 = (unsigned int)&g_7fffff;
    else
        v0 = 0x7fffffff;
    return v0 & a0;
}
