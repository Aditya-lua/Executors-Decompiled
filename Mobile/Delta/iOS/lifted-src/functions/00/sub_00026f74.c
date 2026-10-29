/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x26f74..0x26fa8 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f01040;
extern char g_f01048;
extern unsigned int g_f0c94c;

long long sub_26f74(void)
{
    unsigned long v0;  // x0

    if (!(g_f01048 & 1))
    {
        g_f01048 = 1;
        g_f0c94c = g_f0c94c + 1;
        g_f01040 = g_f0c94c;
    }
    return v0;
}
