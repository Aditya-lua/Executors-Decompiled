/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8e80..0x8eb4 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00bb0;
extern char g_f00bb8;
extern unsigned int g_f0c948;

long long sub_8e80(void)
{
    unsigned long v0;  // x0

    if (!(g_f00bb8 & 1))
    {
        g_f00bb8 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00bb0 = g_f0c948;
    }
    return v0;
}
