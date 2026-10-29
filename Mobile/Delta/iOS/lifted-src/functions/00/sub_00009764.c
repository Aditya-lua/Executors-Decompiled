/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9764..0x9794 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f01090;
extern char g_f01098;
extern unsigned int g_f0c94c;

long long sub_9764(void)
{
    unsigned long v0;  // x0

    if (!(g_f01098 & 1))
    {
        g_f01098 = 1;
        g_f0c94c = g_f0c94c + 1;
        g_f01090 = g_f0c94c;
    }
    return v0;
}
