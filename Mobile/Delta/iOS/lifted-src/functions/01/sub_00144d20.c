/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x144d20..0x144db8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01d88;
extern unsigned short g_f01d8a;
extern unsigned short g_f01d8c;
extern unsigned short g_f01d8e;
extern unsigned long long g_f01db8;
extern unsigned short g_f0f3c0;
extern unsigned short g_f0f3c2;
extern unsigned short g_f0f3c4;
extern unsigned short g_f0f3c6;

long long sub_144d20(void)
{
    unsigned long v0;  // x0

    g_f0f3c0 = 910;
    g_f0f3c2 = 13165;
    g_f0f3c4 = 24777;
    g_f0f3c6 = 48831;
    g_f01d88 = g_f0f3c0 ^ g_f01d88;
    g_f01d8a = g_f0f3c2 ^ g_f01d8a;
    g_f01d8c = g_f0f3c4 ^ g_f01d8c;
    g_f01d8e = g_f0f3c6 ^ g_f01d8e;
    g_f01db8 = g_f01db8 ^ 13744811005025518478;
    return v0;
}
