/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x19a4f0..0x19a524 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00b20;
extern char g_f00b28;
extern unsigned int g_f0c948;

long long sub_19a4f0(void)
{
    unsigned long v0;  // x0

    if (!(g_f00b28 & 1))
    {
        g_f00b28 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00b20 = g_f0c948;
    }
    return v0;
}
