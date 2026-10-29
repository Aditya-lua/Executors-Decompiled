/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x107dec..0x107e84 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01598;
extern unsigned short g_f0159a;
extern unsigned short g_f0159c;
extern unsigned short g_f0159e;
extern unsigned long long g_f016d8;
extern unsigned short g_f0e0b0;
extern unsigned short g_f0e0b2;
extern unsigned short g_f0e0b4;
extern unsigned short g_f0e0b6;

long long sub_107dec(void)
{
    unsigned long v0;  // x0

    g_f0e0b0 = 40383;
    g_f0e0b2 = 56660;
    g_f0e0b4 = 40673;
    g_f0e0b6 = 9819;
    g_f01598 = g_f0e0b0 ^ g_f01598;
    g_f0159a = g_f0e0b2 ^ g_f0159a;
    g_f0159c = g_f0e0b4 ^ g_f0159c;
    g_f0159e = g_f0e0b6 ^ g_f0159e;
    g_f016d8 = g_f016d8 ^ 2763977489240071615;
    return v0;
}
