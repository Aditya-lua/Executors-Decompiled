/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x14f48c..0x14f524 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01dd0;
extern unsigned short g_f01dd2;
extern unsigned short g_f01dd4;
extern unsigned short g_f01dd6;
extern unsigned long long g_f01e20;
extern unsigned short g_f0f790;
extern unsigned short g_f0f792;
extern unsigned short g_f0f794;
extern unsigned short g_f0f796;

long long sub_14f48c(void)
{
    unsigned long v0;  // x0

    g_f0f790 = 13228;
    g_f0f792 = 60259;
    g_f0f794 = 54659;
    g_f0f796 = 36280;
    g_f01dd0 = g_f0f790 ^ g_f01dd0;
    g_f01dd2 = g_f0f792 ^ g_f01dd2;
    g_f01dd4 = g_f0f794 ^ g_f01dd4;
    g_f01dd6 = g_f0f796 ^ g_f01dd6;
    g_f01e20 = g_f01e20 ^ 10212146917629178796;
    return v0;
}
