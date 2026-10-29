/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x216a40..0x216ad8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f029e0;
extern unsigned short g_f029e2;
extern unsigned short g_f029e4;
extern unsigned short g_f029e6;
extern unsigned long long g_f02af0;
extern unsigned short g_f10ff8;
extern unsigned short g_f10ffa;
extern unsigned short g_f10ffc;
extern unsigned short g_f10ffe;

long long sub_216a40(void)
{
    unsigned long v0;  // x0

    g_f10ff8 = 39250;
    g_f10ffa = 58903;
    g_f10ffc = 61988;
    g_f10ffe = 22289;
    g_f029e0 = g_f10ff8 ^ g_f029e0;
    g_f029e2 = g_f10ffa ^ g_f029e2;
    g_f029e4 = g_f10ffc ^ g_f029e4;
    g_f029e6 = g_f10ffe ^ g_f029e6;
    g_f02af0 = g_f02af0 ^ 6274061996196862290;
    return v0;
}
