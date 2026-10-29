/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x25c8c..0x25cc0 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00f30;
extern char g_f00f38;
extern unsigned int g_f0c94c;

long long sub_25c8c(void)
{
    unsigned long v0;  // x0

    if (!(g_f00f38 & 1))
    {
        g_f00f38 = 1;
        g_f0c94c = g_f0c94c + 1;
        g_f00f30 = g_f0c94c;
    }
    return v0;
}
