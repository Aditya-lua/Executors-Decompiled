/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d400c..0x1d40a4 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f025d0;
extern unsigned short g_f025d2;
extern unsigned short g_f025d4;
extern unsigned short g_f025d6;
extern unsigned long long g_f02698;
extern unsigned short g_f10888;
extern unsigned short g_f1088a;
extern unsigned short g_f1088c;
extern unsigned short g_f1088e;

long long sub_1d400c(void)
{
    unsigned long v0;  // x0

    g_f10888 = 40961;
    g_f1088a = 60080;
    g_f1088c = 38130;
    g_f1088e = 6967;
    g_f025d0 = g_f10888 ^ g_f025d0;
    g_f025d2 = g_f1088a ^ g_f025d2;
    g_f025d4 = g_f1088c ^ g_f025d4;
    g_f025d6 = g_f1088e ^ g_f025d6;
    g_f02698 = g_f02698 ^ 1961199933783580673;
    return v0;
}
