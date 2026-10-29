/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5091a0..0x5091fc (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00d90;
extern char g_f00d98;
extern unsigned int g_f0c948;

long long sub_5091a0(void)
{
    unsigned int v0;  // w10
    unsigned long v2;  // x0

    v0 = g_f00d98 + ~g_f00d98 * 2;
    if ((-((v0 + (g_f00d98 & 1) + 1 & ~v0) * 2) & 254) == ((v0 ^ ~(v0 + (g_f00d98 & 1) + 1)) & 0xff))
    {
        g_f00d98 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00d90 = g_f0c948;
    }
    return v2;
}
