/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4965c..0x49690 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00f10;
extern char g_f00f18;
extern unsigned int g_f0c94c;

long long sub_4965c(void)
{
    unsigned long v0;  // x0

    if (!(g_f00f18 & 1))
    {
        g_f00f18 = 1;
        g_f0c94c = g_f0c94c + 1;
        g_f00f10 = g_f0c94c;
    }
    return v0;
}
