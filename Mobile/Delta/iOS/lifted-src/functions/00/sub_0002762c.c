/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2762c..0x27660 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f01060;
extern char g_f01068;
extern unsigned int g_f0c94c;

long long sub_2762c(void)
{
    unsigned long v0;  // x0

    if (!(g_f01068 & 1))
    {
        g_f01068 = 1;
        g_f0c94c = g_f0c94c + 1;
        g_f01060 = g_f0c94c;
    }
    return v0;
}
