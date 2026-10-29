/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1130d0..0x113168 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01808;
extern unsigned short g_f0180a;
extern unsigned short g_f0180c;
extern unsigned short g_f0180e;
extern unsigned long long g_f018a0;
extern unsigned short g_f0e6e0;
extern unsigned short g_f0e6e2;
extern unsigned short g_f0e6e4;
extern unsigned short g_f0e6e6;

long long sub_1130d0(void)
{
    unsigned long v0;  // x0

    g_f0e6e0 = 30707;
    g_f0e6e2 = 39886;
    g_f0e6e4 = 15664;
    g_f0e6e6 = 32120;
    g_f01808 = g_f0e6e0 ^ g_f01808;
    g_f0180a = g_f0e6e2 ^ g_f0180a;
    g_f0180c = g_f0e6e4 ^ g_f0180c;
    g_f0180e = g_f0e6e6 ^ g_f0180e;
    g_f018a0 = g_f018a0 ^ 9041043530927994867;
    return v0;
}
