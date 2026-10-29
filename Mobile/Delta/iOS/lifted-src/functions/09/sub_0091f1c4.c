/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x91f1c4..0x91f218 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00af0;
extern char g_f00af8;
extern unsigned int g_f0c948;

long long sub_91f1c4(void)
{
    unsigned int v0;  // w9
    unsigned long v2;  // x0

    v0 = g_f00af8 + 1;
    if ((-((v0 & (~g_f00af8 | 1)) * 2) & 254) == ((v0 ^ (~g_f00af8 | 1)) & 0xff))
    {
        g_f00af8 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00af0 = g_f0c948;
    }
    return v2;
}
