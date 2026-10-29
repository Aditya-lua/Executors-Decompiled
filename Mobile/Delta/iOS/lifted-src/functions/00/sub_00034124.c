/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x34124..0x34158 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00cf0;
extern char g_f00cf8;
extern unsigned int g_f0c948;

long long sub_34124(void)
{
    unsigned long v0;  // x0

    if (!(g_f00cf8 & 1))
    {
        g_f00cf8 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00cf0 = g_f0c948;
    }
    return v0;
}
