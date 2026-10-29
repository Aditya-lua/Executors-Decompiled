/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1e8bb4..0x1e8c4c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f027c8;
extern unsigned short g_f027ca;
extern unsigned short g_f027cc;
extern unsigned short g_f027ce;
extern unsigned long long g_f027f0;
extern unsigned short g_f10dd8;
extern unsigned short g_f10dda;
extern unsigned short g_f10ddc;
extern unsigned short g_f10dde;

long long sub_1e8bb4(void)
{
    unsigned long v0;  // x0

    g_f10dd8 = 2883;
    g_f10dda = 21303;
    g_f10ddc = 50699;
    g_f10dde = 50185;
    g_f027c8 = g_f10dd8 ^ g_f027c8;
    g_f027ca = g_f10dda ^ g_f027ca;
    g_f027cc = g_f10ddc ^ g_f027cc;
    g_f027ce = g_f10dde ^ g_f027ce;
    g_f027f0 = g_f027f0 ^ 14126039458167327555;
    return v0;
}
