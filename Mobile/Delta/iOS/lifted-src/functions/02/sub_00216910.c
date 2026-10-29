/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x216910..0x2169a8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02960;
extern unsigned short g_f02962;
extern unsigned short g_f02964;
extern unsigned short g_f02966;
extern unsigned long long g_f02a70;
extern unsigned short g_f10f78;
extern unsigned short g_f10f7a;
extern unsigned short g_f10f7c;
extern unsigned short g_f10f7e;

long long sub_216910(void)
{
    unsigned long v0;  // x0

    g_f10f78 = 37021;
    g_f10f7a = 49665;
    g_f10f7c = 1578;
    g_f10f7e = 44602;
    g_f02960 = g_f10f78 ^ g_f02960;
    g_f02962 = g_f10f7a ^ g_f02962;
    g_f02964 = g_f10f7c ^ g_f02964;
    g_f02966 = g_f10f7e ^ g_f02966;
    g_f02a70 = g_f02a70 ^ 12554353691961954461;
    return v0;
}
