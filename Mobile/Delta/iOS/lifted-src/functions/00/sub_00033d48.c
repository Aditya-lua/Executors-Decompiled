/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x33d48..0x33d7c (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00b40;
extern char g_f00b48;
extern unsigned int g_f0c948;

long long sub_33d48(void)
{
    unsigned long v0;  // x0

    if (!(g_f00b48 & 1))
    {
        g_f00b48 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00b40 = g_f0c948;
    }
    return v0;
}
