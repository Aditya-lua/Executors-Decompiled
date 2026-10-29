/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x216e9c..0x216f34 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02920;
extern unsigned short g_f02922;
extern unsigned short g_f02924;
extern unsigned short g_f02926;
extern unsigned long long g_f02a30;
extern unsigned short g_f10f38;
extern unsigned short g_f10f3a;
extern unsigned short g_f10f3c;
extern unsigned short g_f10f3e;

long long sub_216e9c(void)
{
    unsigned long v0;  // x0

    g_f10f38 = 61186;
    g_f10f3a = 36894;
    g_f10f3c = 4146;
    g_f10f3e = 55758;
    g_f02920 = g_f10f38 ^ g_f02920;
    g_f02922 = g_f10f3a ^ g_f02922;
    g_f02924 = g_f10f3c ^ g_f02924;
    g_f02926 = g_f10f3e ^ g_f02926;
    g_f02a30 = g_f02a30 ^ 15694499560785112834;
    return v0;
}
