/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xe8db4..0xe8e4c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01450;
extern unsigned short g_f01452;
extern unsigned short g_f01454;
extern unsigned short g_f01456;
extern unsigned long long g_f014e0;
extern unsigned short g_f0dd30;
extern unsigned short g_f0dd32;
extern unsigned short g_f0dd34;
extern unsigned short g_f0dd36;

long long sub_e8db4(void)
{
    unsigned long v0;  // x0

    g_f0dd30 = 38358;
    g_f0dd32 = 62590;
    g_f0dd34 = 21048;
    g_f0dd36 = 1458;
    g_f01450 = g_f0dd30 ^ g_f01450;
    g_f01452 = g_f0dd32 ^ g_f01452;
    g_f01454 = g_f0dd34 ^ g_f01454;
    g_f01456 = g_f0dd36 ^ g_f01456;
    g_f014e0 = g_f014e0 ^ 410480920617719254;
    return v0;
}
