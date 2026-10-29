/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x109080..0x109118 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f015b8;
extern unsigned short g_f015ba;
extern unsigned short g_f015bc;
extern unsigned short g_f015be;
extern unsigned long long g_f016f8;
extern unsigned short g_f0e0d0;
extern unsigned short g_f0e0d2;
extern unsigned short g_f0e0d4;
extern unsigned short g_f0e0d6;

long long sub_109080(void)
{
    unsigned long v0;  // x0

    g_f0e0d0 = 51884;
    g_f0e0d2 = 7862;
    g_f0e0d4 = 39390;
    g_f0e0d6 = 4241;
    g_f015b8 = g_f0e0d0 ^ g_f015b8;
    g_f015ba = g_f0e0d2 ^ g_f015ba;
    g_f015bc = g_f0e0d4 ^ g_f015bc;
    g_f015be = g_f0e0d6 ^ g_f015be;
    g_f016f8 = g_f016f8 ^ 1193904555506977452;
    return v0;
}
