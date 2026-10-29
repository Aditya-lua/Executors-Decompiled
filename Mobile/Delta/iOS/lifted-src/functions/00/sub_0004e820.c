/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4e820..0x4e854 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00c80;
extern char g_f00c88;
extern unsigned int g_f0c948;

long long sub_4e820(void)
{
    unsigned long v0;  // x0

    if (!(g_f00c88 & 1))
    {
        g_f00c88 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00c80 = g_f0c948;
    }
    return v0;
}
