/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d44cc..0x1d4564 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02580;
extern unsigned short g_f02582;
extern unsigned short g_f02584;
extern unsigned short g_f02586;
extern unsigned long long g_f02648;
extern unsigned short g_f10838;
extern unsigned short g_f1083a;
extern unsigned short g_f1083c;
extern unsigned short g_f1083e;

long long sub_1d44cc(void)
{
    unsigned long v0;  // x0

    g_f10838 = 3136;
    g_f1083a = 34261;
    g_f1083c = 41338;
    g_f1083e = 20912;
    g_f02580 = g_f10838 ^ g_f02580;
    g_f02582 = g_f1083a ^ g_f02582;
    g_f02584 = g_f1083c ^ g_f02584;
    g_f02586 = g_f1083e ^ g_f02586;
    g_f02648 = g_f02648 ^ 5886382260576652352;
    return v0;
}
