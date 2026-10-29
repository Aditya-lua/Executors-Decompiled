/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1096e8..0x109780 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f015f0;
extern unsigned short g_f015f2;
extern unsigned short g_f015f4;
extern unsigned short g_f015f6;
extern unsigned long long g_f01730;
extern unsigned short g_f0e108;
extern unsigned short g_f0e10a;
extern unsigned short g_f0e10c;
extern unsigned short g_f0e10e;

long long sub_1096e8(void)
{
    unsigned long v0;  // x0

    g_f0e108 = 23012;
    g_f0e10a = 55152;
    g_f0e10c = 4381;
    g_f0e10e = 60016;
    g_f015f0 = g_f0e108 ^ g_f015f0;
    g_f015f2 = g_f0e10a ^ g_f015f2;
    g_f015f4 = g_f0e10c ^ g_f015f4;
    g_f015f6 = g_f0e10e ^ g_f015f6;
    g_f01730 = g_f01730 ^ 16893021022132918756;
    return v0;
}
