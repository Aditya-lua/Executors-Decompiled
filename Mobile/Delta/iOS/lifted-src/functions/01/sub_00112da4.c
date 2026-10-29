/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x112da4..0x112e3c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01868;
extern unsigned short g_f0186a;
extern unsigned short g_f0186c;
extern unsigned short g_f0186e;
extern unsigned long long g_f01900;
extern unsigned short g_f0e740;
extern unsigned short g_f0e742;
extern unsigned short g_f0e744;
extern unsigned short g_f0e746;

long long sub_112da4(void)
{
    unsigned long v0;  // x0

    g_f0e740 = 6699;
    g_f0e742 = 37109;
    g_f0e744 = 11821;
    g_f0e746 = 15386;
    g_f01868 = g_f0e740 ^ g_f01868;
    g_f0186a = g_f0e742 ^ g_f0186a;
    g_f0186c = g_f0e744 ^ g_f0186c;
    g_f0186e = g_f0e746 ^ g_f0186e;
    g_f01900 = g_f01900 ^ 4330824764910541355;
    return v0;
}
