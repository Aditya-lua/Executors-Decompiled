/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1098e4..0x10997c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01588;
extern unsigned short g_f0158a;
extern unsigned short g_f0158c;
extern unsigned short g_f0158e;
extern unsigned long long g_f016c8;
extern unsigned short g_f0e0a0;
extern unsigned short g_f0e0a2;
extern unsigned short g_f0e0a4;
extern unsigned short g_f0e0a6;

long long sub_1098e4(void)
{
    unsigned long v0;  // x0

    g_f0e0a0 = 38648;
    g_f0e0a2 = 36906;
    g_f0e0a4 = 41315;
    g_f0e0a6 = 12608;
    g_f01588 = g_f0e0a0 ^ g_f01588;
    g_f0158a = g_f0e0a2 ^ g_f0158a;
    g_f0158c = g_f0e0a4 ^ g_f0158c;
    g_f0158e = g_f0e0a6 ^ g_f0158e;
    g_f016c8 = g_f016c8 ^ 3549013955360495352;
    return v0;
}
