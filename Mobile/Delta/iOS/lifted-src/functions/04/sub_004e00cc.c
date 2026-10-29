/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4e00cc..0x4e0138 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00cf0;
extern char g_f00cf8;
extern unsigned int g_f0c948;

long long sub_4e00cc(void)
{
    unsigned int v0;  // w9
    unsigned long v1;  // x0

    v0 = g_f00cf8 + ~g_f00cf8 * 2;
    if ((-(((v0 + 1 | 1) & ~v0) * 2) & 254) == ((char)v0 ^ (char)~(v0 + 1 | 1)))
    {
        g_f00cf8 = 1;
        g_f0c948 = g_f0c948 + (g_f0c948 | 1) + (~g_f0c948 | 1) + 1;
        g_f00cf0 = g_f0c948;
    }
    return v1;
}
