/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x934268..0x9342e0 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00d30;
extern char g_f00d38;
extern unsigned int g_f0c948;

long long sub_934268(void)
{
    unsigned int v0;  // w9
    unsigned int v1;  // w10
    unsigned long v2;  // x0

    v0 = g_f00d38 + 1;
    v1 = v0 + ~g_f00d38 * 2;
    if ((-(((v1 ^ 1) + (v0 & 1) & -v1) * 2) & 254) == (((char)v1 ^ 1) + ((char)v0 & 1) ^ (char)-v1))
    {
        g_f00d38 = 1;
        g_f0c948 = g_f0c948 + (g_f0c948 | 1) + (~g_f0c948 | 1) + 1;
        g_f00d30 = g_f0c948;
    }
    return v2;
}
