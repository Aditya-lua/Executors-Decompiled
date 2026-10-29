/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d36f0..0x1d3788 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02598;
extern unsigned short g_f0259a;
extern unsigned short g_f0259c;
extern unsigned short g_f0259e;
extern unsigned long long g_f02660;
extern unsigned short g_f10850;
extern unsigned short g_f10852;
extern unsigned short g_f10854;
extern unsigned short g_f10856;

long long sub_1d36f0(void)
{
    unsigned long v0;  // x0

    g_f10850 = 55050;
    g_f10852 = 17053;
    g_f10854 = 7604;
    g_f10856 = 16729;
    g_f02598 = g_f10850 ^ g_f02598;
    g_f0259a = g_f10852 ^ g_f0259a;
    g_f0259c = g_f10854 ^ g_f0259c;
    g_f0259e = g_f10856 ^ g_f0259e;
    g_f02660 = g_f02660 ^ 4708827545441523466;
    return v0;
}
