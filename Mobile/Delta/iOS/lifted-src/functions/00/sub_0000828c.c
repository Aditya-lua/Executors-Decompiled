/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x828c..0x82bc (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00c70;
extern char g_f00c78;
extern unsigned int g_f0c948;

long long sub_828c(void)
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
