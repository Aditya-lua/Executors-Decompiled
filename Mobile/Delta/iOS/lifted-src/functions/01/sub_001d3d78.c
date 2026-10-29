/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d3d78..0x1d3e10 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f025a0;
extern unsigned short g_f025a2;
extern unsigned short g_f025a4;
extern unsigned short g_f025a6;
extern unsigned long long g_f02668;
extern unsigned short g_f10858;
extern unsigned short g_f1085a;
extern unsigned short g_f1085c;
extern unsigned short g_f1085e;

long long sub_1d3d78(void)
{
    unsigned long v0;  // x0

    g_f10858 = 17037;
    g_f1085a = 27701;
    g_f1085c = 40052;
    g_f1085e = 15334;
    g_f025a0 = g_f10858 ^ g_f025a0;
    g_f025a2 = g_f1085a ^ g_f025a2;
    g_f025a4 = g_f1085c ^ g_f025a4;
    g_f025a6 = g_f1085e ^ g_f025a6;
    g_f02668 = g_f02668 ^ 4316309316726768269;
    return v0;
}
