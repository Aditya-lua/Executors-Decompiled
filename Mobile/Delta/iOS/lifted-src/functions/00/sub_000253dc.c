/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x253dc..0x25410 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00b90;
extern char g_f00b98;
extern unsigned int g_f0c948;

long long sub_253dc(void)
{
    unsigned long v0;  // x0

    if (!(g_f00b98 & 1))
    {
        g_f00b98 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00b90 = g_f0c948;
    }
    return v0;
}
