/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x21722c..0x2172c4 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f029a8;
extern unsigned short g_f029aa;
extern unsigned short g_f029ac;
extern unsigned short g_f029ae;
extern unsigned long long g_f02ab8;
extern unsigned short g_f10fc0;
extern unsigned short g_f10fc2;
extern unsigned short g_f10fc4;
extern unsigned short g_f10fc6;

long long sub_21722c(void)
{
    unsigned long v0;  // x0

    g_f10fc0 = 60635;
    g_f10fc2 = 39546;
    g_f10fc4 = 31465;
    g_f10fc6 = 32051;
    g_f029a8 = g_f10fc0 ^ g_f029a8;
    g_f029aa = g_f10fc2 ^ g_f029aa;
    g_f029ac = g_f10fc4 ^ g_f029ac;
    g_f029ae = g_f10fc6 ^ g_f029ae;
    g_f02ab8 = g_f02ab8 ^ 9021689622290951387;
    return v0;
}
