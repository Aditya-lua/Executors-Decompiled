/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1089b8..0x108a50 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f015b0;
extern unsigned short g_f015b2;
extern unsigned short g_f015b4;
extern unsigned short g_f015b6;
extern unsigned long long g_f016f0;
extern unsigned short g_f0e0c8;
extern unsigned short g_f0e0ca;
extern unsigned short g_f0e0cc;
extern unsigned short g_f0e0ce;

long long sub_1089b8(void)
{
    unsigned long v0;  // x0

    g_f0e0c8 = 17673;
    g_f0e0ca = 40877;
    g_f0e0cc = 6943;
    g_f0e0ce = 5636;
    g_f015b0 = g_f0e0c8 ^ g_f015b0;
    g_f015b2 = g_f0e0ca ^ g_f015b2;
    g_f015b4 = g_f0e0cc ^ g_f015b4;
    g_f015b6 = g_f0e0ce ^ g_f015b6;
    g_f016f0 = g_f016f0 ^ 1586422791378126089;
    return v0;
}
