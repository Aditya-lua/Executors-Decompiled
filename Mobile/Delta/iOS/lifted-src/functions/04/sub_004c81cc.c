/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4c81cc..0x4c8244 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00cb0;
extern char g_f00cb8;
extern unsigned int g_f0c948;

long long sub_4c81cc(void)
{
    unsigned int v0;  // w9
    unsigned int v1;  // w10
    unsigned long v2;  // x0

    v0 = g_f00cb8 + 1;
    v1 = v0 + ~g_f00cb8 * 2;
    if ((-(((v1 ^ 1) + (v0 & 1) & -v1) * 2) & 254) == (((char)v1 ^ 1) + ((char)v0 & 1) ^ (char)-v1))
    {
        g_f00cb8 = 1;
        g_f0c948 = g_f0c948 + (g_f0c948 | 1) + (~g_f0c948 | 1) + 1;
        g_f00cb0 = g_f0c948;
    }
    return v2;
}
