/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x284f8..0x2852c (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f01030;
extern char g_f01038;
extern unsigned int g_f0c94c;

long long sub_284f8(void)
{
    unsigned long v0;  // x0

    if (!(g_f01038 & 1))
    {
        g_f01038 = 1;
        g_f0c94c = g_f0c94c + 1;
        g_f01030 = g_f0c94c;
    }
    return v0;
}
