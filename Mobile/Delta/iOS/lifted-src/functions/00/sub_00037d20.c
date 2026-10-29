/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x37d20..0x37d54 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00c30;
extern char g_f00c38;
extern unsigned int g_f0c948;

long long sub_37d20(void)
{
    unsigned long v0;  // x0

    if (!(g_f00c38 & 1))
    {
        g_f00c38 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00c30 = g_f0c948;
    }
    return v0;
}
