/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x17505c..0x1750f4 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02050;
extern unsigned short g_f02052;
extern unsigned short g_f02054;
extern unsigned short g_f02056;
extern unsigned long long g_f020d8;
extern unsigned short g_f0fda0;
extern unsigned short g_f0fda2;
extern unsigned short g_f0fda4;
extern unsigned short g_f0fda6;

long long sub_17505c(void)
{
    unsigned long v0;  // x0

    g_f0fda0 = 10966;
    g_f0fda2 = 4870;
    g_f0fda4 = 29022;
    g_f0fda6 = 55792;
    g_f02050 = g_f0fda0 ^ g_f02050;
    g_f02052 = g_f0fda2 ^ g_f02052;
    g_f02054 = g_f0fda4 ^ g_f02054;
    g_f02056 = g_f0fda6 ^ g_f02056;
    g_f020d8 = g_f020d8 ^ 15704176549500955350;
    return v0;
}
