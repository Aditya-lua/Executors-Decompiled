/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d3788..0x1d3820 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02510;
extern unsigned short g_f02512;
extern unsigned short g_f02514;
extern unsigned short g_f02516;
extern unsigned long long g_f025d8;
extern unsigned short g_f107c8;
extern unsigned short g_f107ca;
extern unsigned short g_f107cc;
extern unsigned short g_f107ce;

long long sub_1d3788(void)
{
    unsigned long v0;  // x0

    g_f107c8 = 62929;
    g_f107ca = 56703;
    g_f107cc = 45828;
    g_f107ce = 40435;
    g_f02510 = g_f107c8 ^ g_f02510;
    g_f02512 = g_f107ca ^ g_f02512;
    g_f02514 = g_f107cc ^ g_f02514;
    g_f02516 = g_f107ce ^ g_f02516;
    g_f025d8 = g_f025d8 ^ 0x9df3b304dd7ff5d1;
    return v0;
}
