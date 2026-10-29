/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x109fa8..0x10a040 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01600;
extern unsigned short g_f01602;
extern unsigned short g_f01604;
extern unsigned short g_f01606;
extern unsigned long long g_f01740;
extern unsigned short g_f0e118;
extern unsigned short g_f0e11a;
extern unsigned short g_f0e11c;
extern unsigned short g_f0e11e;

long long sub_109fa8(void)
{
    unsigned long v0;  // x0

    g_f0e118 = 60106;
    g_f0e11a = 42513;
    g_f0e11c = 3743;
    g_f0e11e = 57227;
    g_f01600 = g_f0e118 ^ g_f01600;
    g_f01602 = g_f0e11a ^ g_f01602;
    g_f01604 = g_f0e11c ^ g_f01604;
    g_f01606 = g_f0e11e ^ g_f01606;
    g_f01740 = g_f01740 ^ 16107984571069491914;
    return v0;
}
