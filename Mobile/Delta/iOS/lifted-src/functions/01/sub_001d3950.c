/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d3950..0x1d39e8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02520;
extern unsigned short g_f02522;
extern unsigned short g_f02524;
extern unsigned short g_f02526;
extern unsigned long long g_f025e8;
extern unsigned short g_f107d8;
extern unsigned short g_f107da;
extern unsigned short g_f107dc;
extern unsigned short g_f107de;

long long sub_1d3950(void)
{
    unsigned long v0;  // x0

    g_f107d8 = 47448;
    g_f107da = 36942;
    g_f107dc = 45179;
    g_f107de = 37646;
    g_f02520 = g_f107d8 ^ g_f02520;
    g_f02522 = g_f107da ^ g_f02522;
    g_f02524 = g_f107dc ^ g_f02524;
    g_f02526 = g_f107de ^ g_f02526;
    g_f025e8 = g_f025e8 ^ 10596601017997900120;
    return v0;
}
