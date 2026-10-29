/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xe81dc..0xe8274 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01430;
extern unsigned short g_f01432;
extern unsigned short g_f01434;
extern unsigned short g_f01436;
extern unsigned long long g_f014c0;
extern unsigned short g_f0dd10;
extern unsigned short g_f0dd12;
extern unsigned short g_f0dd14;
extern unsigned short g_f0dd16;

long long sub_e81dc(void)
{
    unsigned long v0;  // x0

    g_f0dd10 = 54185;
    g_f0dd12 = 62680;
    g_f0dd14 = 22331;
    g_f0dd16 = 7036;
    g_f01430 = g_f0dd10 ^ g_f01430;
    g_f01432 = g_f0dd12 ^ g_f01432;
    g_f01434 = g_f0dd14 ^ g_f01434;
    g_f01436 = g_f0dd16 ^ g_f01436;
    g_f014c0 = g_f014c0 ^ 1980553851158713257;
    return v0;
}
