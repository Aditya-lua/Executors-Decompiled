/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xe8ce8..0xe8d80 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01420;
extern unsigned short g_f01422;
extern unsigned short g_f01424;
extern unsigned short g_f01426;
extern unsigned long long g_f014b0;
extern unsigned short g_f0dd00;
extern unsigned short g_f0dd02;
extern unsigned short g_f0dd04;
extern unsigned short g_f0dd06;

long long sub_e8ce8(void)
{
    unsigned long v0;  // x0

    g_f0dd00 = 20546;
    g_f0dd02 = 27371;
    g_f0dd04 = 22973;
    g_f0dd06 = 9825;
    g_f01420 = g_f0dd00 ^ g_f01420;
    g_f01422 = g_f0dd02 ^ g_f01422;
    g_f01424 = g_f0dd04 ^ g_f01424;
    g_f01426 = g_f0dd06 ^ g_f01426;
    g_f014b0 = g_f014b0 ^ 2765590316259692610;
    return v0;
}
