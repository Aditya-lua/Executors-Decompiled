/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2838c..0x283c0 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00fc0;
extern char g_f00fc8;
extern unsigned int g_f0c94c;

long long sub_2838c(void)
{
    unsigned long v0;  // x0

    if (!(g_f00fc8 & 1))
    {
        g_f00fc8 = 1;
        g_f0c94c = g_f0c94c + 1;
        g_f00fc0 = g_f0c94c;
    }
    return v0;
}
