/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x26928..0x2695c (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00ec0;
extern char g_f00ec8;
extern unsigned int g_f0c94c;

long long sub_26928(void)
{
    unsigned long v0;  // x0

    if (!(g_f00ec8 & 1))
    {
        g_f00ec8 = 1;
        g_f0c94c = g_f0c94c + 1;
        g_f00ec0 = g_f0c94c;
    }
    return v0;
}
