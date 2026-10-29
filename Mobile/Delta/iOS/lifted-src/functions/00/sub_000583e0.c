/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x583e0..0x58414 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00e60;
extern char g_f00e68;
extern unsigned int g_f0c948;

long long sub_583e0(void)
{
    unsigned long v0;  // x0

    if (!(g_f00e68 & 1))
    {
        g_f00e68 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00e60 = g_f0c948;
    }
    return v0;
}
