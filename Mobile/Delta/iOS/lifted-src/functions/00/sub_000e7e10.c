/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xe7e10..0xe7ea8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01458;
extern unsigned short g_f0145a;
extern unsigned short g_f0145c;
extern unsigned short g_f0145e;
extern unsigned long long g_f014e8;
extern unsigned short g_f0dd38;
extern unsigned short g_f0dd3a;
extern unsigned short g_f0dd3c;
extern unsigned short g_f0dd3e;

long long sub_e7e10(void)
{
    unsigned long v0;  // x0

    g_f0dd38 = 60858;
    g_f0dd3a = 17766;
    g_f0dd3c = 53496;
    g_f0dd3e = 63;
    g_f01458 = g_f0dd38 ^ g_f01458;
    g_f0145a = g_f0dd3a ^ g_f0145a;
    g_f0145c = g_f0dd3c ^ g_f0145c;
    g_f0145e = g_f0dd3e ^ g_f0145e;
    g_f014e8 = g_f014e8 ^ 0x3fd0f84566edba;
    return v0;
}
