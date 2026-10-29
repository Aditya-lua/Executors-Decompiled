/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x108c1c..0x108cb4 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f015e8;
extern unsigned short g_f015ea;
extern unsigned short g_f015ec;
extern unsigned short g_f015ee;
extern unsigned long long g_f01728;
extern unsigned short g_f0e100;
extern unsigned short g_f0e102;
extern unsigned short g_f0e104;
extern unsigned short g_f0e106;

long long sub_108c1c(void)
{
    unsigned long v0;  // x0

    g_f0e100 = 63504;
    g_f0e102 = 25936;
    g_f0e104 = 37468;
    g_f0e106 = 61410;
    g_f015e8 = g_f0e100 ^ g_f015e8;
    g_f015ea = g_f0e102 ^ g_f015ea;
    g_f015ec = g_f0e104 ^ g_f015ec;
    g_f015ee = g_f0e106 ^ g_f015ee;
    g_f01728 = g_f01728 ^ 17285539245335836688;
    return v0;
}
