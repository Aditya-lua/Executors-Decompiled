/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x37a00..0x37a34 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00b30;
extern char g_f00b38;
extern unsigned int g_f0c948;

long long sub_37a00(void)
{
    unsigned long v0;  // x0

    if (!(g_f00b38 & 1))
    {
        g_f00b38 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00b30 = g_f0c948;
    }
    return v0;
}
