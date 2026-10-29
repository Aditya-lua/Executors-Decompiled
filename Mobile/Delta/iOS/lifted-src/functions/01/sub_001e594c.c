/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1e594c..0x1e59e4 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f026f0;
extern unsigned short g_f026f2;
extern unsigned short g_f026f4;
extern unsigned short g_f026f6;
extern unsigned long long g_f02720;
extern unsigned short g_f10c20;
extern unsigned short g_f10c22;
extern unsigned short g_f10c24;
extern unsigned short g_f10c26;

long long sub_1e594c(void)
{
    unsigned long v0;  // x0

    g_f10c20 = 20697;
    g_f10c22 = 35745;
    g_f10c24 = 26591;
    g_f10c26 = 22301;
    g_f026f0 = g_f10c20 ^ g_f026f0;
    g_f026f2 = g_f10c22 ^ g_f026f2;
    g_f026f4 = g_f10c24 ^ g_f026f4;
    g_f026f6 = g_f10c26 ^ g_f026f6;
    g_f02720 = g_f02720 ^ 6277287665442312409;
    return v0;
}
