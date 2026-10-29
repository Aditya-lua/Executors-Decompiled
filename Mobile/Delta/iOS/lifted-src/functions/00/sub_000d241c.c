/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xd241c..0xd24b4 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f012c6;
extern unsigned short g_f012c8;
extern unsigned short g_f012ca;
extern unsigned short g_f012cc;
extern unsigned long long g_f012f8;
extern unsigned short g_f0dc8a;
extern unsigned short g_f0dc8c;
extern unsigned short g_f0dc8e;
extern unsigned short g_f0dc90;

long long sub_d241c(void)
{
    unsigned long v0;  // x0

    g_f0dc8a = 12194;
    g_f0dc8c = 7052;
    g_f0dc8e = 45029;
    g_f0dc90 = 4601;
    g_f012c6 = g_f0dc8a ^ g_f012c6;
    g_f012c8 = g_f0dc8c ^ g_f012c8;
    g_f012ca = g_f0dc8e ^ g_f012ca;
    g_f012cc = g_f0dc90 ^ g_f012cc;
    g_f012f8 = g_f012f8 ^ 1295259766390271906;
    return v0;
}
