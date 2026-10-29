/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ea6e0..0x1ea778 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02808;
extern unsigned short g_f0280a;
extern unsigned short g_f0280c;
extern unsigned short g_f0280e;
extern unsigned long long g_f02818;
extern unsigned short g_f10e90;
extern unsigned short g_f10e92;
extern unsigned short g_f10e94;
extern unsigned short g_f10e96;

long long sub_1ea6e0(void)
{
    unsigned long v0;  // x0

    g_f10e90 = 36398;
    g_f10e92 = 2929;
    g_f10e94 = 48140;
    g_f10e96 = 39029;
    g_f02808 = g_f10e90 ^ g_f02808;
    g_f0280a = g_f10e92 ^ g_f0280a;
    g_f0280c = g_f10e94 ^ g_f0280c;
    g_f0280e = g_f10e96 ^ g_f0280e;
    g_f02818 = g_f02818 ^ 10985893625957813806;
    return v0;
}
