/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d426c..0x1d4304 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02570;
extern unsigned short g_f02572;
extern unsigned short g_f02574;
extern unsigned short g_f02576;
extern unsigned long long g_f02638;
extern unsigned short g_f10828;
extern unsigned short g_f1082a;
extern unsigned short g_f1082c;
extern unsigned short g_f1082e;

long long sub_1d426c(void)
{
    unsigned long v0;  // x0

    g_f10828 = 9593;
    g_f1082a = 54874;
    g_f1082c = 41979;
    g_f1082e = 23701;
    g_f02570 = g_f10828 ^ g_f02570;
    g_f02572 = g_f1082a ^ g_f02572;
    g_f02574 = g_f1082c ^ g_f02574;
    g_f02576 = g_f1082e ^ g_f02576;
    g_f02638 = g_f02638 ^ 6671418725047608697;
    return v0;
}
