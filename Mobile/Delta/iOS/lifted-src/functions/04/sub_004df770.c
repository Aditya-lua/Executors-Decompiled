/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4df770..0x4df7d4 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00cc0;
extern char g_f00cc8;
extern unsigned int g_f0c948;

long long sub_4df770(void)
{
    unsigned int v0;  // w9
    unsigned long v2;  // x0

    v0 = g_f00cc8 + 1;
    if ((-(((v0 + ~g_f00cc8 * 2 ^ 1) + (v0 & 1) & -(v0 + ~g_f00cc8 * 2)) * 2) & 254) == (((v0 + ~g_f00cc8 * 2 ^ 1) + (v0 & 1) ^ -(v0 + ~g_f00cc8 * 2)) & 0xff))
    {
        g_f00cc8 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00cc0 = g_f0c948;
    }
    return v2;
}
