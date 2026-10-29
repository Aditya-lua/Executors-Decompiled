/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x560a0..0x560d4 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00d90;
extern char g_f00d98;
extern unsigned int g_f0c948;

long long sub_560a0(void)
{
    unsigned long v0;  // x0

    if (!(g_f00d98 & 1))
    {
        g_f00d98 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00d90 = g_f0c948;
    }
    return v0;
}
