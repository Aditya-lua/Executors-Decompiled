/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x50c48..0x50c7c (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00ab0;
extern char g_f00ab8;
extern unsigned int g_f0c948;

long long sub_50c48(void)
{
    unsigned long v0;  // x0

    if (!(g_f00ab8 & 1))
    {
        g_f00ab8 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00ab0 = g_f0c948;
    }
    return v0;
}
