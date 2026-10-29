/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x108520..0x1085b8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01608;
extern unsigned short g_f0160a;
extern unsigned short g_f0160c;
extern unsigned short g_f0160e;
extern unsigned long long g_f01748;
extern unsigned short g_f0e120;
extern unsigned short g_f0e122;
extern unsigned short g_f0e124;
extern unsigned short g_f0e126;

long long sub_108520(void)
{
    unsigned long v0;  // x0

    g_f0e120 = 28334;
    g_f0e122 = 5170;
    g_f0e124 = 36190;
    g_f0e126 = 55832;
    g_f01608 = g_f0e120 ^ g_f01608;
    g_f0160a = g_f0e122 ^ g_f0160a;
    g_f0160c = g_f0e124 ^ g_f0160c;
    g_f0160e = g_f0e126 ^ g_f0160e;
    g_f01748 = g_f01748 ^ 15715466334914637486;
    return v0;
}
