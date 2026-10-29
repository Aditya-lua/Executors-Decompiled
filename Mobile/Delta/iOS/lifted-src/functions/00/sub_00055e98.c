/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x55e98..0x55ecc (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00dd0;
extern char g_f00dd8;
extern unsigned int g_f0c948;

long long sub_55e98(void)
{
    unsigned long v0;  // x0

    if (!(g_f00dd8 & 1))
    {
        g_f00dd8 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00dd0 = g_f0c948;
    }
    return v0;
}
