/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2277e8..0x227880 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02bb0;
extern unsigned short g_f02bb2;
extern unsigned short g_f02bb4;
extern unsigned short g_f02bb6;
extern unsigned long long g_f02c40;
extern unsigned short g_f11510;
extern unsigned short g_f11512;
extern unsigned short g_f11514;
extern unsigned short g_f11516;

long long sub_2277e8(void)
{
    unsigned long v0;  // x0

    g_f11510 = 30676;
    g_f11512 = 20642;
    g_f11514 = 43396;
    g_f11516 = 6944;
    g_f02bb0 = g_f11510 ^ g_f02bb0;
    g_f02bb2 = g_f11512 ^ g_f02bb2;
    g_f02bb4 = g_f11514 ^ g_f02bb4;
    g_f02bb6 = g_f11516 ^ g_f02bb6;
    g_f02c40 = g_f02c40 ^ 1954748624032397268;
    return v0;
}
