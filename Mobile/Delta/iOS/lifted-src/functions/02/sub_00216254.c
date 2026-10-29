/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x216254..0x2162ec (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02930;
extern unsigned short g_f02932;
extern unsigned short g_f02934;
extern unsigned short g_f02936;
extern unsigned long long g_f02a40;
extern unsigned short g_f10f48;
extern unsigned short g_f10f4a;
extern unsigned short g_f10f4c;
extern unsigned short g_f10f4e;

long long sub_216254(void)
{
    unsigned long v0;  // x0

    g_f10f48 = 22249;
    g_f10f4a = 17551;
    g_f10f4c = 3509;
    g_f10f4e = 52969;
    g_f02930 = g_f10f48 ^ g_f02930;
    g_f02932 = g_f10f4a ^ g_f02932;
    g_f02934 = g_f10f4c ^ g_f02934;
    g_f02936 = g_f10f4e ^ g_f02936;
    g_f02a40 = g_f02a40 ^ 14909463113577223913;
    return v0;
}
