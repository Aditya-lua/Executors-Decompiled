/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2169a8..0x216a40 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02988;
extern unsigned short g_f0298a;
extern unsigned short g_f0298c;
extern unsigned short g_f0298e;
extern unsigned long long g_f02a98;
extern unsigned short g_f10fa0;
extern unsigned short g_f10fa2;
extern unsigned short g_f10fa4;
extern unsigned short g_f10fa6;

long long sub_2169a8(void)
{
    unsigned long v0;  // x0

    g_f10fa0 = 24206;
    g_f10fa2 = 24260;
    g_f10fa4 = 0x7fe8;
    g_f10fa6 = 37629;
    g_f02988 = g_f10fa0 ^ g_f02988;
    g_f0298a = g_f10fa2 ^ g_f0298a;
    g_f0298c = g_f10fa4 ^ g_f0298c;
    g_f0298e = g_f10fa6 ^ g_f0298e;
    g_f02a98 = g_f02a98 ^ 0x92fd7fe85ec45e8e;
    return v0;
}
