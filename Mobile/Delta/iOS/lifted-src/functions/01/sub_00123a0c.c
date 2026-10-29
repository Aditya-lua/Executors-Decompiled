/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x123a0c..0x123aa4 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01970;
extern unsigned short g_f01972;
extern unsigned short g_f01974;
extern unsigned short g_f01976;
extern unsigned long long g_f01a58;
extern unsigned short g_f0ea10;
extern unsigned short g_f0ea12;
extern unsigned short g_f0ea14;
extern unsigned short g_f0ea16;

long long sub_123a0c(void)
{
    unsigned long v0;  // x0

    g_f0ea10 = 47225;
    g_f0ea12 = 29409;
    g_f0ea14 = 34013;
    g_f0ea16 = 34903;
    g_f01970 = g_f0ea10 ^ g_f01970;
    g_f01972 = g_f0ea12 ^ g_f01972;
    g_f01974 = g_f0ea14 ^ g_f01974;
    g_f01976 = g_f0ea16 ^ g_f01976;
    g_f01a58 = g_f01a58 ^ 9824467198782060665;
    return v0;
}
