/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d3a80..0x1d3b18 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02518;
extern unsigned short g_f0251a;
extern unsigned short g_f0251c;
extern unsigned short g_f0251e;
extern unsigned long long g_f025e0;
extern unsigned short g_f107d0;
extern unsigned short g_f107d2;
extern unsigned short g_f107d4;
extern unsigned short g_f107d6;

long long sub_1d3a80(void)
{
    unsigned long v0;  // x0

    g_f107d0 = 22980;
    g_f107d2 = 22919;
    g_f107d4 = 12731;
    g_f107d6 = 39041;
    g_f02518 = g_f107d0 ^ g_f02518;
    g_f0251a = g_f107d2 ^ g_f0251a;
    g_f0251c = g_f107d4 ^ g_f0251c;
    g_f0251e = g_f107d6 ^ g_f0251e;
    g_f025e0 = g_f025e0 ^ 10989119246491408836;
    return v0;
}
