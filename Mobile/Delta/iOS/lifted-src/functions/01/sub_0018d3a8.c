/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18d3a8..0x18d440 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f021c8;
extern unsigned short g_f021ca;
extern unsigned short g_f021cc;
extern unsigned short g_f021ce;
extern unsigned long long g_f022d8;
extern unsigned short g_f10100;
extern unsigned short g_f10102;
extern unsigned short g_f10104;
extern unsigned short g_f10106;

long long sub_18d3a8(void)
{
    unsigned long v0;  // x0

    g_f10100 = 57027;
    g_f10102 = 48505;
    g_f10104 = 46715;
    g_f10106 = 55786;
    g_f021c8 = g_f10100 ^ g_f021c8;
    g_f021ca = g_f10102 ^ g_f021ca;
    g_f021cc = g_f10104 ^ g_f021cc;
    g_f021ce = g_f10106 ^ g_f021ce;
    g_f022d8 = g_f022d8 ^ 15702563693356768963;
    return v0;
}
