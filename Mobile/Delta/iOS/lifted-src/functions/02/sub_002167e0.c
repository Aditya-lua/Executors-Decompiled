/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2167e0..0x216878 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f029d0;
extern unsigned short g_f029d2;
extern unsigned short g_f029d4;
extern unsigned short g_f029d6;
extern unsigned long long g_f02ae0;
extern unsigned short g_f10fe8;
extern unsigned short g_f10fea;
extern unsigned short g_f10fec;
extern unsigned short g_f10fee;

long long sub_2167e0(void)
{
    unsigned long v0;  // x0

    g_f10fe8 = 40620;
    g_f10fea = 34440;
    g_f10fec = 62628;
    g_f10fee = 25078;
    g_f029d0 = g_f10fe8 ^ g_f029d0;
    g_f029d2 = g_f10fea ^ g_f029d2;
    g_f029d4 = g_f10fec ^ g_f029d4;
    g_f029d6 = g_f10fee ^ g_f029d6;
    g_f02ae0 = g_f02ae0 ^ 7059098453418745516;
    return v0;
}
