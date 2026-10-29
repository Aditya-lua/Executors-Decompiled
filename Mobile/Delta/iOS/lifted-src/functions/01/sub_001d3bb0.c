/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d3bb0..0x1d3c48 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f025a8;
extern unsigned short g_f025aa;
extern unsigned short g_f025ac;
extern unsigned short g_f025ae;
extern unsigned long long g_f02670;
extern unsigned short g_f10860;
extern unsigned short g_f10862;
extern unsigned short g_f10864;
extern unsigned short g_f10866;

long long sub_1d3bb0(void)
{
    unsigned long v0;  // x0

    g_f10860 = 56864;
    g_f10862 = 44558;
    g_f10864 = 6964;
    g_f10866 = 13940;
    g_f025a8 = g_f10860 ^ g_f025a8;
    g_f025aa = g_f10862 ^ g_f025aa;
    g_f025ac = g_f10864 ^ g_f025ac;
    g_f025ae = g_f10866 ^ g_f025ae;
    g_f02670 = g_f02670 ^ 3923791088419003936;
    return v0;
}
