/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x57b24..0x57b58 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00c10;
extern char g_f00c18;
extern unsigned int g_f0c948;

long long sub_57b24(void)
{
    unsigned long v0;  // x0

    if (!(g_f00c18 & 1))
    {
        g_f00c18 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00c10 = g_f0c948;
    }
    return v0;
}
