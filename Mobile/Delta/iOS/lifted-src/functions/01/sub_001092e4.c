/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1092e4..0x10937c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f015c8;
extern unsigned short g_f015ca;
extern unsigned short g_f015cc;
extern unsigned short g_f015ce;
extern unsigned long long g_f01708;
extern unsigned short g_f0e0e0;
extern unsigned short g_f0e0e2;
extern unsigned short g_f0e0e4;
extern unsigned short g_f0e0e6;

long long sub_1092e4(void)
{
    unsigned long v0;  // x0

    g_f0e0e0 = 27587;
    g_f0e0e2 = 17142;
    g_f0e0e4 = 38749;
    g_f0e0e6 = 1452;
    g_f015c8 = g_f0e0e0 ^ g_f015c8;
    g_f015ca = g_f0e0e2 ^ g_f015ca;
    g_f015cc = g_f0e0e4 ^ g_f015cc;
    g_f015ce = g_f0e0e6 ^ g_f015ce;
    g_f01708 = g_f01708 ^ 408868092995070915;
    return v0;
}
