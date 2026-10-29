/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x275c4..0x275f8 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f01070;
extern char g_f01078;
extern unsigned int g_f0c94c;

long long sub_275c4(void)
{
    unsigned long v0;  // x0

    if (!(g_f01078 & 1))
    {
        g_f01078 = 1;
        g_f0c94c = g_f0c94c + 1;
        g_f01070 = g_f0c94c;
    }
    return v0;
}
