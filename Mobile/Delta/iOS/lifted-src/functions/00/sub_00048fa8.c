/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x48fa8..0x48fdc (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00e90;
extern char g_f00e98;
extern unsigned int g_f0c94c;

long long sub_48fa8(void)
{
    unsigned long v0;  // x0

    if (!(g_f00e98 & 1))
    {
        g_f00e98 = 1;
        g_f0c94c = g_f0c94c + 1;
        g_f00e90 = g_f0c94c;
    }
    return v0;
}
