/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1136f4..0x11378c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01888;
extern unsigned short g_f0188a;
extern unsigned short g_f0188c;
extern unsigned short g_f0188e;
extern unsigned long long g_f01920;
extern unsigned short g_f0e760;
extern unsigned short g_f0e762;
extern unsigned short g_f0e764;
extern unsigned short g_f0e766;

long long sub_1136f4(void)
{
    unsigned long v0;  // x0

    g_f0e760 = 19896;
    g_f0e762 = 10327;
    g_f0e764 = 10539;
    g_f0e766 = 9808;
    g_f01888 = g_f0e760 ^ g_f01888;
    g_f0188a = g_f0e762 ^ g_f0188a;
    g_f0188c = g_f0e764 ^ g_f0188c;
    g_f0188e = g_f0e766 ^ g_f0188e;
    g_f01920 = g_f01920 ^ 2760751836915256760;
    return v0;
}
