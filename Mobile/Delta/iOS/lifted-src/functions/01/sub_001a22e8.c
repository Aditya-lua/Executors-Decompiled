/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a22e8..0x1a2380 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02408;
extern unsigned short g_f0240a;
extern unsigned short g_f0240c;
extern unsigned short g_f0240e;
extern unsigned long long g_f02470;
extern unsigned short g_f105e0;
extern unsigned short g_f105e2;
extern unsigned short g_f105e4;
extern unsigned short g_f105e6;

long long sub_1a22e8(void)
{
    unsigned long v0;  // x0

    g_f105e0 = 55539;
    g_f105e2 = 0xff1b;
    g_f105e4 = 23633;
    g_f105e6 = 20918;
    g_f02408 = g_f105e0 ^ g_f02408;
    g_f0240a = g_f105e2 ^ g_f0240a;
    g_f0240c = g_f105e4 ^ g_f0240c;
    g_f0240e = g_f105e6 ^ g_f0240e;
    g_f02470 = g_f02470 ^ 0x51b65c51ff1bd8f3;
    return v0;
}
