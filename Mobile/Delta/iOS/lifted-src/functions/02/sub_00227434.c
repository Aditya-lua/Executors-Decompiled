/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x227434..0x2274cc (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02ba0;
extern unsigned short g_f02ba2;
extern unsigned short g_f02ba4;
extern unsigned short g_f02ba6;
extern unsigned long long g_f02c30;
extern unsigned short g_f11500;
extern unsigned short g_f11502;
extern unsigned short g_f11504;
extern unsigned short g_f11506;

long long sub_227434(void)
{
    unsigned long v0;  // x0

    g_f11500 = 3853;
    g_f11502 = 33891;
    g_f11504 = 44036;
    g_f11506 = 9733;
    g_f02ba0 = g_f11500 ^ g_f02ba0;
    g_f02ba2 = g_f11502 ^ g_f02ba2;
    g_f02ba4 = g_f11504 ^ g_f02ba4;
    g_f02ba6 = g_f11506 ^ g_f02ba6;
    g_f02c30 = g_f02c30 ^ 2739785083725745933;
    return v0;
}
