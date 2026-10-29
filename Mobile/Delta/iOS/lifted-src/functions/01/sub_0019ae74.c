/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x19ae74..0x19aea8 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00c70;
extern char g_f00c78;
extern unsigned int g_f0c948;

long long sub_19ae74(void)
{
    unsigned long v0;  // x0

    if (!(g_f00c78 & 1))
    {
        g_f00c78 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00c70 = g_f0c948;
    }
    return v0;
}
