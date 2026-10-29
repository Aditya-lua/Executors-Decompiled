/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xecb60..0xecbf8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01528;
extern unsigned short g_f0152a;
extern unsigned short g_f0152c;
extern unsigned short g_f0152e;
extern unsigned long long g_f01558;
extern unsigned short g_f0dfb8;
extern unsigned short g_f0dfba;
extern unsigned short g_f0dfbc;
extern unsigned short g_f0dfbe;

long long sub_ecb60(void)
{
    unsigned long v0;  // x0

    g_f0dfb8 = 21056;
    g_f0dfba = 36591;
    g_f0dfbc = 45162;
    g_f0dfbe = 29342;
    g_f01528 = g_f0dfb8 ^ g_f01528;
    g_f0152a = g_f0dfba ^ g_f0152a;
    g_f0152c = g_f0dfbc ^ g_f0152c;
    g_f0152e = g_f0dfbe ^ g_f0152e;
    g_f01558 = g_f01558 ^ 8259232738355139136;
    return v0;
}
