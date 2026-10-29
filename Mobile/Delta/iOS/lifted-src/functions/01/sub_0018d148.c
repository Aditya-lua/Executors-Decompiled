/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18d148..0x18d1e0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f021f0;
extern unsigned short g_f021f2;
extern unsigned short g_f021f4;
extern unsigned short g_f021f6;
extern unsigned long long g_f02300;
extern unsigned short g_f10128;
extern unsigned short g_f1012a;
extern unsigned short g_f1012c;
extern unsigned short g_f1012e;

long long sub_18d148(void)
{
    unsigned long v0;  // x0

    g_f10128 = 60644;
    g_f1012a = 29435;
    g_f1012c = 12351;
    g_f1012e = 48814;
    g_f021f0 = g_f10128 ^ g_f021f0;
    g_f021f2 = g_f1012a ^ g_f021f2;
    g_f021f4 = g_f1012c ^ g_f021f4;
    g_f021f6 = g_f1012e ^ g_f021f6;
    g_f02300 = g_f02300 ^ 13739972562224147684;
    return v0;
}
