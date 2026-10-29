/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1e5dc0..0x1e5e58 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f026f8;
extern unsigned short g_f026fa;
extern unsigned short g_f026fc;
extern unsigned short g_f026fe;
extern unsigned long long g_f02728;
extern unsigned short g_f10c28;
extern unsigned short g_f10c2a;
extern unsigned short g_f10c2c;
extern unsigned short g_f10c2e;

long long sub_1e5dc0(void)
{
    unsigned long v0;  // x0

    g_f10c28 = 57468;
    g_f10c2a = 4257;
    g_f10c2c = 59038;
    g_f10c2e = 20906;
    g_f026f8 = g_f10c28 ^ g_f026f8;
    g_f026fa = g_f10c2a ^ g_f026fa;
    g_f026fc = g_f10c2c ^ g_f026fc;
    g_f026fe = g_f10c2e ^ g_f026fe;
    g_f02728 = g_f02728 ^ 5884769429671239804;
    return v0;
}
