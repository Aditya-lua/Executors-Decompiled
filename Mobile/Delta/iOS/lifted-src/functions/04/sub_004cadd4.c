/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4cadd4..0x4cae40 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00b50;
extern char g_f00b58;
extern unsigned int g_f0c948;

long long sub_4cadd4(void)
{
    unsigned int v0;  // w9
    unsigned long v1;  // x0

    v0 = g_f00b58 + ~g_f00b58 * 2;
    if ((-(((v0 + 1 | 1) & ~v0) * 2) & 254) == ((char)v0 ^ (char)~(v0 + 1 | 1)))
    {
        g_f00b58 = 1;
        g_f0c948 = g_f0c948 + (g_f0c948 & 0xfffffffe) + (~g_f0c948 | 1) + 2;
        g_f00b50 = g_f0c948;
    }
    return v1;
}
