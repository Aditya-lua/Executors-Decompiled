/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a2250..0x1a22e8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02438;
extern unsigned short g_f0243a;
extern unsigned short g_f0243c;
extern unsigned short g_f0243e;
extern unsigned long long g_f024a0;
extern unsigned short g_f10610;
extern unsigned short g_f10612;
extern unsigned short g_f10614;
extern unsigned short g_f10616;

long long sub_1a2250(void)
{
    unsigned long v0;  // x0

    g_f10610 = 1703;
    g_f10612 = 31369;
    g_f10614 = 21710;
    g_f10616 = 12551;
    g_f02438 = g_f10610 ^ g_f02438;
    g_f0243a = g_f10612 ^ g_f0243a;
    g_f0243c = g_f10614 ^ g_f0243c;
    g_f0243e = g_f10616 ^ g_f0243e;
    g_f024a0 = g_f024a0 ^ 3532885678491240103;
    return v0;
}
