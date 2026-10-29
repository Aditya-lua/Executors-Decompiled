/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1e59e4..0x1e5a7c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f026e8;
extern unsigned short g_f026ea;
extern unsigned short g_f026ec;
extern unsigned short g_f026ee;
extern unsigned long long g_f02718;
extern unsigned short g_f10c18;
extern unsigned short g_f10c1a;
extern unsigned short g_f10c1c;
extern unsigned short g_f10c1e;

long long sub_1e59e4(void)
{
    unsigned long v0;  // x0

    g_f10c18 = 20262;
    g_f10c1a = 11489;
    g_f10c1c = 59679;
    g_f10c1e = 23695;
    g_f026e8 = g_f10c18 ^ g_f026e8;
    g_f026ea = g_f10c1a ^ g_f026ea;
    g_f026ec = g_f10c1c ^ g_f026ec;
    g_f026ee = g_f10c1e ^ g_f026ee;
    g_f02718 = g_f02718 ^ 6669805893265215270;
    return v0;
}
