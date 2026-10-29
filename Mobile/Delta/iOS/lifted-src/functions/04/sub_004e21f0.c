/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4e21f0..0x4e2244 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00d40;
extern char g_f00d48;
extern unsigned int g_f0c948;

long long sub_4e21f0(void)
{
    unsigned int v0;  // w10
    unsigned long v2;  // x0

    v0 = ~g_f00d48 | 1;
    if ((-((v0 & g_f00d48 + 1) * 2) & 254) == ((v0 ^ g_f00d48 + 1) & 0xff))
    {
        g_f00d48 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00d40 = g_f0c948;
    }
    return v2;
}
