/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1230f0..0x123188 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01958;
extern unsigned short g_f0195a;
extern unsigned short g_f0195c;
extern unsigned short g_f0195e;
extern unsigned long long g_f01a40;
extern unsigned short g_f0e9f8;
extern unsigned short g_f0e9fa;
extern unsigned short g_f0e9fc;
extern unsigned short g_f0e9fe;

long long sub_1230f0(void)
{
    unsigned long v0;  // x0

    g_f0e9f8 = 12207;
    g_f0e9fa = 13600;
    g_f0e9fc = 2206;
    g_f0e9fe = 39087;
    g_f01958 = g_f0e9f8 ^ g_f01958;
    g_f0195a = g_f0e9fa ^ g_f0195a;
    g_f0195c = g_f0e9fc ^ g_f0195c;
    g_f0195e = g_f0e9fe ^ g_f0195e;
    g_f01a40 = g_f01a40 ^ 11002021890278567855;
    return v0;
}
