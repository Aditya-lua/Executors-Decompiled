/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x19ada4..0x19add8 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00c80;
extern char g_f00c88;
extern unsigned int g_f0c948;

long long sub_19ada4(void)
{
    unsigned long v0;  // x0

    if (!(g_f00c88 & 1))
    {
        g_f00c88 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00c80 = g_f0c948;
    }
    return v0;
}
