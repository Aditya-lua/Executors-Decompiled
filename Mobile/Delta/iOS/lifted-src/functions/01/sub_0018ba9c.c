/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18ba9c..0x18bb34 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02210;
extern unsigned short g_f02212;
extern unsigned short g_f02214;
extern unsigned short g_f02216;
extern unsigned long long g_f02320;
extern unsigned short g_f10148;
extern unsigned short g_f1014a;
extern unsigned short g_f1014c;
extern unsigned short g_f1014e;

long long sub_18ba9c(void)
{
    unsigned long v0;  // x0

    g_f10148 = 24337;
    g_f1014a = 29981;
    g_f1014c = 11069;
    g_f1014e = 43236;
    g_f02210 = g_f10148 ^ g_f02210;
    g_f02212 = g_f1014a ^ g_f02212;
    g_f02214 = g_f1014c ^ g_f02214;
    g_f02216 = g_f1014e ^ g_f02216;
    g_f02320 = g_f02320 ^ 12169899636019781393;
    return v0;
}
