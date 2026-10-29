/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xe7fac..0xe8044 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01438;
extern unsigned short g_f0143a;
extern unsigned short g_f0143c;
extern unsigned short g_f0143e;
extern unsigned long long g_f014c8;
extern unsigned short g_f0dd18;
extern unsigned short g_f0dd1a;
extern unsigned short g_f0dd1c;
extern unsigned short g_f0dd1e;

long long sub_e7fac(void)
{
    unsigned long v0;  // x0

    g_f0dd18 = 32524;
    g_f0dd1a = 10664;
    g_f0dd1c = 54778;
    g_f0dd1e = 5641;
    g_f01438 = g_f0dd18 ^ g_f01438;
    g_f0143a = g_f0dd1a ^ g_f0143a;
    g_f0143c = g_f0dd1c ^ g_f0143c;
    g_f0143e = g_f0dd1e ^ g_f0143e;
    g_f014c8 = g_f014c8 ^ 1588035614042259212;
    return v0;
}
