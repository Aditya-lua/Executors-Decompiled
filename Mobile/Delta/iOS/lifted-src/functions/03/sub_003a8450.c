/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3a8450..0x3a851c (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_f03540;
extern char g_f03548;
extern unsigned short g_f03560;
extern unsigned short g_f03562;
extern unsigned short g_f03564;
extern unsigned short g_f03566;
extern unsigned short g_f03568;
extern unsigned short g_f0356a;
extern unsigned short g_f0356c;
extern unsigned short g_f0356e;
extern unsigned long long g_f03570;

long long sub_3a8450(void)
{
    unsigned long v0;  // x0

    if (g_f03548 & 1)
        return v0;
    g_f03548 = 1;
    g_f03562 = 6045;
    g_f03564 = 42410;
    g_f03566 = 9547;
    g_f03568 = 33400;
    g_f03560 = g_f03562 ^ g_f03560;
    g_f0356a = g_f03564 ^ g_f0356a;
    g_f0356c = g_f03566 ^ g_f0356c;
    g_f0356e = g_f03568 ^ g_f0356e;
    g_f03570 = g_f03570 ^ 9401305228968073117;
    *(unsigned int *)&g_f03540 = 0;
    return v0;
}
