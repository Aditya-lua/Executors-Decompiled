/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x227918..0x2279b0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02c00;
extern unsigned short g_f02c02;
extern unsigned short g_f02c04;
extern unsigned short g_f02c06;
extern unsigned long long g_f02c90;
extern unsigned short g_f11560;
extern unsigned short g_f11562;
extern unsigned short g_f11564;
extern unsigned short g_f11566;

long long sub_227918(void)
{
    unsigned long v0;  // x0

    g_f11560 = 56309;
    g_f11562 = 37215;
    g_f11564 = 40185;
    g_f11566 = 58535;
    g_f02c00 = g_f11560 ^ g_f02c00;
    g_f02c02 = g_f11562 ^ g_f02c02;
    g_f02c04 = g_f11564 ^ g_f02c04;
    g_f02c06 = g_f11566 ^ g_f02c06;
    g_f02c90 = g_f02c90 ^ 16476310357458017269;
    return v0;
}
