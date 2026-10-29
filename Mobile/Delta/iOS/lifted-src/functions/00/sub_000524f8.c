/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x524f8..0x5252c (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00e40;
extern char g_f00e48;
extern unsigned int g_f0c948;

long long sub_524f8(void)
{
    unsigned long v0;  // x0

    if (!(g_f00e48 & 1))
    {
        g_f00e48 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00e40 = g_f0c948;
    }
    return v0;
}
