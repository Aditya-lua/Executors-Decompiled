/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x216c3c..0x216cd4 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02968;
extern unsigned short g_f0296a;
extern unsigned short g_f0296c;
extern unsigned short g_f0296e;
extern unsigned long long g_f02a78;
extern unsigned short g_f10f80;
extern unsigned short g_f10f82;
extern unsigned short g_f10f84;
extern unsigned short g_f10f86;

long long sub_216c3c(void)
{
    unsigned long v0;  // x0

    g_f10f80 = 12080;
    g_f10f82 = 22594;
    g_f10f84 = 34026;
    g_f10f86 = 43207;
    g_f02968 = g_f10f80 ^ g_f02968;
    g_f0296a = g_f10f82 ^ g_f0296a;
    g_f0296c = g_f10f84 ^ g_f0296c;
    g_f0296e = g_f10f86 ^ g_f0296e;
    g_f02a78 = g_f02a78 ^ 12161835460775259952;
    return v0;
}
