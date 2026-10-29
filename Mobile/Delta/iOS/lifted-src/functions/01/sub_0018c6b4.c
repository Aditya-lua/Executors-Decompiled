/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18c6b4..0x18c74c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02200;
extern unsigned short g_f02202;
extern unsigned short g_f02204;
extern unsigned short g_f02206;
extern unsigned long long g_f02310;
extern unsigned short g_f10138;
extern unsigned short g_f1013a;
extern unsigned short g_f1013c;
extern unsigned short g_f1013e;

long long sub_18c6b4(void)
{
    unsigned long v0;  // x0

    g_f10138 = 22474;
    g_f1013a = 49834;
    g_f1013c = 11708;
    g_f1013e = 46025;
    g_f02200 = g_f10138 ^ g_f02200;
    g_f02202 = g_f1013a ^ g_f02202;
    g_f02204 = g_f1013c ^ g_f02204;
    g_f02206 = g_f1013e ^ g_f02206;
    g_f02310 = g_f02310 ^ 12954936091850987466;
    return v0;
}
