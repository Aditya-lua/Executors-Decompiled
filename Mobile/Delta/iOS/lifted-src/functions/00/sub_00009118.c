/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9118..0x9148 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f010a0;
extern char g_f010a8;
extern unsigned int g_f0c94c;

long long sub_9118(void)
{
    unsigned long v0;  // x0

    if (!(g_f010a8 & 1))
    {
        g_f010a8 = 1;
        g_f0c94c = g_f0c94c + 1;
        g_f010a0 = g_f0c94c;
    }
    return v0;
}
