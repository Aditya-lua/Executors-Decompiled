/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18bcfc..0x18bd94 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02120;
extern unsigned short g_f02122;
extern unsigned short g_f02124;
extern unsigned short g_f02126;
extern unsigned long long g_f02230;
extern unsigned short g_f10058;
extern unsigned short g_f1005a;
extern unsigned short g_f1005c;
extern unsigned short g_f1005e;

long long sub_18bcfc(void)
{
    unsigned long v0;  // x0

    g_f10058 = 33005;
    g_f1005a = 53362;
    g_f1005c = 20683;
    g_f1005e = 19535;
    g_f02120 = g_f10058 ^ g_f02120;
    g_f02122 = g_f1005a ^ g_f02122;
    g_f02124 = g_f1005c ^ g_f02124;
    g_f02126 = g_f1005e ^ g_f02126;
    g_f02230 = g_f02230 ^ 5498702506348413165;
    return v0;
}
