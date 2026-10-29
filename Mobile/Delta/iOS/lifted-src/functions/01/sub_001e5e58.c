/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1e5e58..0x1e5ef0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f026e0;
extern unsigned short g_f026e2;
extern unsigned short g_f026e4;
extern unsigned short g_f026e6;
extern unsigned long long g_f02710;
extern unsigned short g_f10c10;
extern unsigned short g_f10c12;
extern unsigned short g_f10c14;
extern unsigned short g_f10c16;

long long sub_1e5e58(void)
{
    unsigned long v0;  // x0

    g_f10c10 = 62354;
    g_f10c12 = 19938;
    g_f10c14 = 27229;
    g_f10c16 = 25090;
    g_f026e0 = g_f10c10 ^ g_f026e0;
    g_f026e2 = g_f10c12 ^ g_f026e2;
    g_f026e4 = g_f10c14 ^ g_f026e4;
    g_f026e6 = g_f10c16 ^ g_f026e6;
    g_f02710 = g_f02710 ^ 7062324114641580946;
    return v0;
}
