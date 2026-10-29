/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x27a70..0x27aa4 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00e90;
extern char g_f00e98;
extern unsigned int g_f0c94c;

long long sub_27a70(void)
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
