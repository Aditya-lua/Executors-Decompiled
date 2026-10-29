/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x27148..0x2717c (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f01000;
extern char g_f01008;
extern unsigned int g_f0c94c;

long long sub_27148(void)
{
    unsigned long v0;  // x0

    if (!(g_f01008 & 1))
    {
        g_f01008 = 1;
        g_f0c94c = g_f0c94c + 1;
        g_f01000 = g_f0c94c;
    }
    return v0;
}
