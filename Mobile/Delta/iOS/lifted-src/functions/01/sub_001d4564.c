/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d4564..0x1d45fc (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02538;
extern unsigned short g_f0253a;
extern unsigned short g_f0253c;
extern unsigned short g_f0253e;
extern unsigned long long g_f02600;
extern unsigned short g_f107f0;
extern unsigned short g_f107f2;
extern unsigned short g_f107f4;
extern unsigned short g_f107f6;

long long sub_1d4564(void)
{
    unsigned long v0;  // x0

    g_f107f0 = 2098;
    g_f107f2 = 24057;
    g_f107f4 = 11449;
    g_f107f6 = 33463;
    g_f02538 = g_f107f0 ^ g_f02538;
    g_f0253a = g_f107f2 ^ g_f0253a;
    g_f0253c = g_f107f4 ^ g_f0253c;
    g_f0253e = g_f107f6 ^ g_f0253e;
    g_f02600 = g_f02600 ^ 9419046320325855282;
    return v0;
}
