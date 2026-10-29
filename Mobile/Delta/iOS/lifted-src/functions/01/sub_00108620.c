/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x108620..0x108654 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00b50;
extern char g_f00b58;
extern unsigned int g_f0c948;

long long sub_108620(void)
{
    unsigned long v0;  // x0

    if (!(g_f00b58 & 1))
    {
        g_f00b58 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00b50 = g_f0c948;
    }
    return v0;
}
