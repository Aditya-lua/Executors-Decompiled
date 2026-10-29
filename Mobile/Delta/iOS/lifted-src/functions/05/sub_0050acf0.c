/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x50acf0..0x50ad58 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00b60;
extern char g_f00b68;
extern unsigned int g_f0c948;

long long sub_50acf0(void)
{
    unsigned int v0;  // w10
    unsigned int v2;  // w9
    unsigned long v3;  // x0

    v0 = ~g_f00b68 | 1;
    if ((-((v0 & g_f00b68 + 1) * 2) & 254) == ((v0 ^ g_f00b68 + 1) & 0xff))
    {
        g_f00b68 = 1;
        v2 = (g_f0c948 * 2 & 4) + (g_f0c948 ^ 2);
        g_f0c948 = ~v2 + v2 * 2;
        g_f00b60 = g_f0c948;
    }
    return v3;
}
