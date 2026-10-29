/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x19a894..0x19a8c8 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00c40;
extern char g_f00c48;
extern unsigned int g_f0c948;

long long sub_19a894(void)
{
    unsigned long v0;  // x0

    if (!(g_f00c48 & 1))
    {
        g_f00c48 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00c40 = g_f0c948;
    }
    return v0;
}
