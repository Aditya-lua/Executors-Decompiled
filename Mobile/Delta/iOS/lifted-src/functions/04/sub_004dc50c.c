/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4dc50c..0x4dc574 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00dc0;
extern char g_f00dc8;
extern unsigned int g_f0c948;

long long sub_4dc50c(void)
{
    unsigned int v0;  // w10
    unsigned long v2;  // x0

    v0 = g_f00dc8 + 1;
    if ((-((v0 & -(g_f00dc8 | 1)) * 2) & 254) == ((char)v0 ^ (char)-(g_f00dc8 | 1)))
    {
        g_f00dc8 = 1;
        g_f0c948 = g_f0c948 + (g_f0c948 & 0xfffffffe) + (~g_f0c948 | 1) + 2;
        g_f00dc0 = g_f0c948;
    }
    return v2;
}
