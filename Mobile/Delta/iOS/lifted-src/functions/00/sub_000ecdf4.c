/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xecdf4..0xece8c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01538;
extern unsigned short g_f0153a;
extern unsigned short g_f0153c;
extern unsigned short g_f0153e;
extern unsigned long long g_f01568;
extern unsigned short g_f0dfc8;
extern unsigned short g_f0dfca;
extern unsigned short g_f0dfcc;
extern unsigned short g_f0dfce;

long long sub_ecdf4(void)
{
    unsigned long v0;  // x0

    g_f0dfc8 = 62183;
    g_f0dfca = 53950;
    g_f0dfcc = 44516;
    g_f0dfce = 26553;
    g_f01538 = g_f0dfc8 ^ g_f01538;
    g_f0153a = g_f0dfca ^ g_f0153a;
    g_f0153c = g_f0dfcc ^ g_f0153c;
    g_f0153e = g_f0dfce ^ g_f0153e;
    g_f01568 = g_f01568 ^ 7474196254897926887;
    return v0;
}
