/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18c124..0x18c1bc (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02138;
extern unsigned short g_f0213a;
extern unsigned short g_f0213c;
extern unsigned short g_f0213e;
extern unsigned long long g_f02248;
extern unsigned short g_f10070;
extern unsigned short g_f10072;
extern unsigned short g_f10074;
extern unsigned short g_f10076;

long long sub_18c124(void)
{
    unsigned long v0;  // x0

    g_f10070 = 20967;
    g_f10072 = 11699;
    g_f10074 = 52486;
    g_f10076 = 15351;
    g_f02138 = g_f10070 ^ g_f02138;
    g_f0213a = g_f10072 ^ g_f0213a;
    g_f0213c = g_f10074 ^ g_f0213c;
    g_f0213e = g_f10076 ^ g_f0213e;
    g_f02248 = g_f02248 ^ 4321147793905504743;
    return v0;
}
