/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9890..0x98c0 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00f20;
extern char g_f00f28;
extern unsigned int g_f0c94c;

long long sub_9890(void)
{
    unsigned long v0;  // x0

    if (!(g_f00f28 & 1))
    {
        g_f00f28 = 1;
        g_f0c94c = g_f0c94c + 1;
        g_f00f20 = g_f0c94c;
    }
    return v0;
}
