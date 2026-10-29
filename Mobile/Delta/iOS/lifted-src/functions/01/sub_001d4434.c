/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d4434..0x1d44cc (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f025c0;
extern unsigned short g_f025c2;
extern unsigned short g_f025c4;
extern unsigned short g_f025c6;
extern unsigned long long g_f02688;
extern unsigned short g_f10878;
extern unsigned short g_f1087a;
extern unsigned short g_f1087c;
extern unsigned short g_f1087e;

long long sub_1d4434(void)
{
    unsigned long v0;  // x0

    g_f10878 = 33114;
    g_f1087a = 27991;
    g_f1087c = 38770;
    g_f1087e = 9756;
    g_f025c0 = g_f10878 ^ g_f025c0;
    g_f025c2 = g_f1087a ^ g_f025c2;
    g_f025c4 = g_f1087c ^ g_f025c4;
    g_f025c6 = g_f1087e ^ g_f025c6;
    g_f02688 = g_f02688 ^ 2746236390505677146;
    return v0;
}
