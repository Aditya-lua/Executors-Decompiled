/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xe8078..0xe8110 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01440;
extern unsigned short g_f01442;
extern unsigned short g_f01444;
extern unsigned short g_f01446;
extern unsigned long long g_f014d0;
extern unsigned short g_f0dd20;
extern unsigned short g_f0dd22;
extern unsigned short g_f0dd24;
extern unsigned short g_f0dd26;

long long sub_e8078(void)
{
    unsigned long v0;  // x0

    g_f0dd20 = 37520;
    g_f0dd22 = 32809;
    g_f0dd24 = 21690;
    g_f0dd26 = 4247;
    g_f01440 = g_f0dd20 ^ g_f01440;
    g_f01442 = g_f0dd22 ^ g_f01442;
    g_f01444 = g_f0dd24 ^ g_f01444;
    g_f01446 = g_f0dd26 ^ g_f01446;
    g_f014d0 = g_f014d0 ^ 1195517386081014416;
    return v0;
}
