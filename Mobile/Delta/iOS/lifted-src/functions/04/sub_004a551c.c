/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4a551c..0x4a5584 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00c50;
extern char g_f00c58;
extern unsigned int g_f0c948;

long long sub_4a551c(void)
{
    unsigned int v0;  // w9
    unsigned long v2;  // x0

    v0 = g_f00c58 + 1;
    if ((-((v0 & (~g_f00c58 | 1)) * 2) & 254) == ((char)v0 ^ (~g_f00c58 | 1)))
    {
        g_f00c58 = 1;
        g_f0c948 = g_f0c948 + (g_f0c948 | 1) + (~g_f0c948 | 1) + 1;
        g_f00c50 = g_f0c948;
    }
    return v2;
}
