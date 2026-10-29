/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1086ec..0x108784 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01648;
extern unsigned short g_f0164a;
extern unsigned short g_f0164c;
extern unsigned short g_f0164e;
extern unsigned long long g_f01788;
extern unsigned short g_f0e160;
extern unsigned short g_f0e162;
extern unsigned short g_f0e164;
extern unsigned short g_f0e166;

long long sub_1086ec(void)
{
    unsigned long v0;  // x0

    g_f0e160 = 11528;
    g_f0e162 = 28285;
    g_f0e164 = 33617;
    g_f0e166 = 44676;
    g_f01648 = g_f0e160 ^ g_f01648;
    g_f0164a = g_f0e162 ^ g_f0164a;
    g_f0164c = g_f0e164 ^ g_f0164c;
    g_f0164e = g_f0e166 ^ g_f0164e;
    g_f01788 = g_f01788 ^ 12575320445294554376;
    return v0;
}
