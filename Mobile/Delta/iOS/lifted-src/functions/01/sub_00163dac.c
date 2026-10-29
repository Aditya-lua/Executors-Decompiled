/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x163dac..0x163e44 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01f48;
extern unsigned short g_f01f4a;
extern unsigned short g_f01f4c;
extern unsigned short g_f01f4e;
extern unsigned long long g_f01fa0;
extern unsigned short g_f0fb50;
extern unsigned short g_f0fb52;
extern unsigned short g_f0fb54;
extern unsigned short g_f0fb56;

long long sub_163dac(void)
{
    unsigned long v0;  // x0

    g_f0fb50 = 47560;
    g_f0fb52 = 29140;
    g_f0fb54 = 6824;
    g_f0fb56 = 36275;
    g_f01f48 = g_f0fb50 ^ g_f01f48;
    g_f01f4a = g_f0fb52 ^ g_f01f4a;
    g_f01f4c = g_f0fb54 ^ g_f01f4c;
    g_f01f4e = g_f0fb56 ^ g_f01f4e;
    g_f01fa0 = g_f01fa0 ^ 10210534090945640904;
    return v0;
}
