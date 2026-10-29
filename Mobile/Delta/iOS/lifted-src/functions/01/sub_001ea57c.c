/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ea57c..0x1ea614 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02810;
extern unsigned short g_f02812;
extern unsigned short g_f02814;
extern unsigned short g_f02816;
extern unsigned long long g_f02820;
extern unsigned short g_f10e98;
extern unsigned short g_f10e9a;
extern unsigned short g_f10e9c;
extern unsigned short g_f10e9e;

long long sub_1ea57c(void)
{
    unsigned long v0;  // x0

    g_f10e98 = 657;
    g_f10e9a = 43921;
    g_f10e9c = 15052;
    g_f10e9e = 37635;
    g_f02810 = g_f10e98 ^ g_f02810;
    g_f02812 = g_f10e9a ^ g_f02812;
    g_f02814 = g_f10e9c ^ g_f02814;
    g_f02816 = g_f10e9e ^ g_f02816;
    g_f02820 = g_f02820 ^ 10593375399231685265;
    return v0;
}
