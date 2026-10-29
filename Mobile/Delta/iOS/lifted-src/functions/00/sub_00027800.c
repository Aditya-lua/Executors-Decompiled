/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x27800..0x27834 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f010d0;
extern char g_f010d8;
extern unsigned int g_f0c94c;

long long sub_27800(void)
{
    unsigned long v0;  // x0

    if (!(g_f010d8 & 1))
    {
        g_f010d8 = 1;
        g_f0c94c = g_f0c94c + 1;
        g_f010d0 = g_f0c94c;
    }
    return v0;
}
