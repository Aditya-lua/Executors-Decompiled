/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x113824..0x1138bc (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01858;
extern unsigned short g_f0185a;
extern unsigned short g_f0185c;
extern unsigned short g_f0185e;
extern unsigned long long g_f018f0;
extern unsigned short g_f0e730;
extern unsigned short g_f0e732;
extern unsigned short g_f0e734;
extern unsigned short g_f0e736;

long long sub_113824(void)
{
    unsigned long v0;  // x0

    g_f0e730 = 6932;
    g_f0e732 = 44338;
    g_f0e734 = 12463;
    g_f0e736 = 0x46ff;
    g_f01858 = g_f0e730 ^ g_f01858;
    g_f0185a = g_f0e732 ^ g_f0185a;
    g_f0185c = g_f0e734 ^ g_f0185c;
    g_f0185e = g_f0e736 ^ g_f0185e;
    g_f018f0 = g_f018f0 ^ 0x46ff30afad321b14;
    return v0;
}
