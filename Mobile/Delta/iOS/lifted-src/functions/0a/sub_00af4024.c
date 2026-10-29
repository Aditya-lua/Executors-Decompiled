/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf4024..0xaf404c (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_eb9ef0[4];

long long sub_af4024(unsigned long long a0)
{
    if (95 < (unsigned int)a0)
        return "unknown certificate verification error";
    return g_eb9ef0[a0 & 127];
}
