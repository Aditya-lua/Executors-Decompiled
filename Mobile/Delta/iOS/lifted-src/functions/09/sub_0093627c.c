/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x93627c..0x9362e4 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00ae0;
extern char g_f00ae8;
extern unsigned int g_f0c948;

long long sub_93627c(void)
{
    unsigned int v0;  // w9
    unsigned long v2;  // x0

    v0 = g_f00ae8 + 1;
    if ((-((v0 & (~g_f00ae8 | 1)) * 2) & 254) == ((char)v0 ^ (~g_f00ae8 | 1)))
    {
        g_f00ae8 = 1;
        g_f0c948 = g_f0c948 + (g_f0c948 & 0xfffffffe) + (~g_f0c948 | 1) + 2;
        g_f00ae0 = g_f0c948;
    }
    return v2;
}
