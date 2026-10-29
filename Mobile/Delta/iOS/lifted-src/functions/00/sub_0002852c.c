/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2852c..0x28560 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f01080;
extern char g_f01088;
extern unsigned int g_f0c94c;

long long sub_2852c(void)
{
    unsigned long v0;  // x0

    if (!(g_f01088 & 1))
    {
        g_f01088 = 1;
        g_f0c94c = g_f0c94c + 1;
        g_f01080 = g_f0c94c;
    }
    return v0;
}
