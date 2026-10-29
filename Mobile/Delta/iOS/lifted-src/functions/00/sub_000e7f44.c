/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xe7f44..0xe7f78 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00c90;
extern char g_f00c98;
extern unsigned int g_f0c948;

long long sub_e7f44(void)
{
    unsigned long v0;  // x0

    if (!(g_f00c98 & 1))
    {
        g_f00c98 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00c90 = g_f0c948;
    }
    return v0;
}
