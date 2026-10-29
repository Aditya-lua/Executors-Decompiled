/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x55cc4..0x55cf8 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00d60;
extern char g_f00d68;
extern unsigned int g_f0c948;

long long sub_55cc4(void)
{
    unsigned long v0;  // x0

    if (!(g_f00d68 & 1))
    {
        g_f00d68 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00d60 = g_f0c948;
    }
    return v0;
}
