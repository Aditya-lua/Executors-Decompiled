/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d3ce0..0x1d3d78 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02550;
extern unsigned short g_f02552;
extern unsigned short g_f02554;
extern unsigned short g_f02556;
extern unsigned long long g_f02618;
extern unsigned short g_f10808;
extern unsigned short g_f1080a;
extern unsigned short g_f1080c;
extern unsigned short g_f1080e;

long long sub_1d3ce0(void)
{
    unsigned long v0;  // x0

    g_f10808 = 59084;
    g_f1080a = 6840;
    g_f1080c = 43256;
    g_f1080e = 29279;
    g_f02550 = g_f10808 ^ g_f02550;
    g_f02552 = g_f1080a ^ g_f02552;
    g_f02554 = g_f1080c ^ g_f02554;
    g_f02556 = g_f1080e ^ g_f02556;
    g_f02618 = g_f02618 ^ 8241491626664978124;
    return v0;
}
