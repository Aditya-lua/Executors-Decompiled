/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x264b0..0x264e4 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f01030;
extern char g_f01038;
extern unsigned int g_f0c94c;

long long sub_264b0(void)
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
