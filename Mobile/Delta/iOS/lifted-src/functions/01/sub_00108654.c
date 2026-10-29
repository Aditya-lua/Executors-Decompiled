/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x108654..0x1086ec (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01678;
extern unsigned short g_f0167a;
extern unsigned short g_f0167c;
extern unsigned short g_f0167e;
extern unsigned long long g_f017b8;
extern unsigned short g_f0e190;
extern unsigned short g_f0e192;
extern unsigned short g_f0e194;
extern unsigned short g_f0e196;

long long sub_108654(void)
{
    unsigned long v0;  // x0

    g_f0e190 = 16540;
    g_f0e192 = 62664;
    g_f0e194 = 31700;
    g_f0e196 = 36309;
    g_f01678 = g_f0e190 ^ g_f01678;
    g_f0167a = g_f0e192 ^ g_f0167a;
    g_f0167c = g_f0e194 ^ g_f0167c;
    g_f0167e = g_f0e196 ^ g_f0167e;
    g_f017b8 = g_f017b8 ^ 10220211083957256348;
    return v0;
}
