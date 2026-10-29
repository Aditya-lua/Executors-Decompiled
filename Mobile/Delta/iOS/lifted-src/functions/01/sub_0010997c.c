/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x10997c..0x109a14 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01670;
extern unsigned short g_f01672;
extern unsigned short g_f01674;
extern unsigned short g_f01676;
extern unsigned long long g_f017b0;
extern unsigned short g_f0e188;
extern unsigned short g_f0e18a;
extern unsigned short g_f0e18c;
extern unsigned short g_f0e18e;

long long sub_10997c(void)
{
    unsigned long v0;  // x0

    g_f0e188 = 57145;
    g_f0e18a = 46472;
    g_f0e18c = 64789;
    g_f0e18e = 37703;
    g_f01670 = g_f0e188 ^ g_f01670;
    g_f01672 = g_f0e18a ^ g_f01672;
    g_f01674 = g_f0e18c ^ g_f01674;
    g_f01676 = g_f0e18e ^ g_f01676;
    g_f017b0 = g_f017b0 ^ 0x9347fd15b588df39;
    return v0;
}
