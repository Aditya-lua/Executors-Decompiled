/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x217064..0x2170fc (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02970;
extern unsigned short g_f02972;
extern unsigned short g_f02974;
extern unsigned short g_f02976;
extern unsigned long long g_f02a80;
extern unsigned short g_f10f88;
extern unsigned short g_f10f8a;
extern unsigned short g_f10f8c;
extern unsigned short g_f10f8e;

long long sub_217064(void)
{
    unsigned long v0;  // x0

    g_f10f88 = 29636;
    g_f10f8a = 37762;
    g_f10f8c = 939;
    g_f10f8e = 41813;
    g_f02970 = g_f10f88 ^ g_f02970;
    g_f02972 = g_f10f8a ^ g_f02972;
    g_f02974 = g_f10f8c ^ g_f02974;
    g_f02976 = g_f10f8e ^ g_f02976;
    g_f02a80 = g_f02a80 ^ 11769317236651750340;
    return v0;
}
