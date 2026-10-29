/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x93e870..0x93e8c4 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00c60;
extern char g_f00c68;
extern unsigned int g_f0c948;

long long sub_93e870(void)
{
    unsigned int v0;  // w10
    unsigned long v2;  // x0

    v0 = g_f00c68 + 1;
    if ((-((v0 & -(g_f00c68 | 1)) * 2) & 254) == ((v0 ^ -(g_f00c68 | 1)) & 0xff))
    {
        g_f00c68 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00c60 = g_f0c948;
    }
    return v2;
}
