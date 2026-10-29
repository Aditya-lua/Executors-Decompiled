/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xd684..0xd6b8 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00db0;
extern char g_f00db8;
extern unsigned int g_f0c948;

long long sub_d684(void)
{
    unsigned long v0;  // x0

    if (!(g_f00db8 & 1))
    {
        g_f00db8 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00db0 = g_f0c948;
    }
    return v0;
}
