/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x21654c..0x2165e4 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02a20;
extern unsigned short g_f02a22;
extern unsigned short g_f02a24;
extern unsigned short g_f02a26;
extern unsigned long long g_f02b30;
extern unsigned short g_f11038;
extern unsigned short g_f1103a;
extern unsigned short g_f1103c;
extern unsigned short g_f1103e;

long long sub_21654c(void)
{
    unsigned long v0;  // x0

    g_f11038 = 31405;
    g_f1103a = 59412;
    g_f1103c = 59424;
    g_f1103e = 11133;
    g_f02a20 = g_f11038 ^ g_f02a20;
    g_f02a22 = g_f1103a ^ g_f02a22;
    g_f02a24 = g_f1103c ^ g_f02a24;
    g_f02a26 = g_f1103e ^ g_f02a26;
    g_f02b30 = g_f02b30 ^ 3133916143749986989;
    return v0;
}
