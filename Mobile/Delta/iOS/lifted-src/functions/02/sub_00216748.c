/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x216748..0x2167e0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f029f8;
extern unsigned short g_f029fa;
extern unsigned short g_f029fc;
extern unsigned short g_f029fe;
extern unsigned long long g_f02b08;
extern unsigned short g_f11010;
extern unsigned short g_f11012;
extern unsigned short g_f11014;
extern unsigned short g_f11016;

long long sub_216748(void)
{
    unsigned long v0;  // x0

    g_f11010 = 18620;
    g_f11012 = 43854;
    g_f11014 = 28262;
    g_f11016 = 18106;
    g_f029f8 = g_f11010 ^ g_f029f8;
    g_f029fa = g_f11012 ^ g_f029fa;
    g_f029fc = g_f11014 ^ g_f029fc;
    g_f029fe = g_f11016 ^ g_f029fe;
    g_f02b08 = g_f02b08 ^ 5096507315562891452;
    return v0;
}
