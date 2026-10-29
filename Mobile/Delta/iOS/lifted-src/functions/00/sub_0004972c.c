/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4972c..0x49760 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00fa0;
extern char g_f00fa8;
extern unsigned int g_f0c94c;

long long sub_4972c(void)
{
    unsigned long v0;  // x0

    if (!(g_f00fa8 & 1))
    {
        g_f00fa8 = 1;
        g_f0c94c = g_f0c94c + 1;
        g_f00fa0 = g_f0c94c;
    }
    return v0;
}
