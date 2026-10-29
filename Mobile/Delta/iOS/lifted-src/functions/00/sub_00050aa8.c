/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x50aa8..0x50adc (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00d10;
extern char g_f00d18;
extern unsigned int g_f0c948;

long long sub_50aa8(void)
{
    unsigned long v0;  // x0

    if (!(g_f00d18 & 1))
    {
        g_f00d18 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00d10 = g_f0c948;
    }
    return v0;
}
