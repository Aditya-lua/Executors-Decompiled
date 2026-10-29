/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x123220..0x1232b8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01a08;
extern unsigned short g_f01a0a;
extern unsigned short g_f01a0c;
extern unsigned short g_f01a0e;
extern unsigned long long g_f01af0;
extern unsigned short g_f0eaa8;
extern unsigned short g_f0eaaa;
extern unsigned short g_f0eaac;
extern unsigned short g_f0eaae;

long long sub_123220(void)
{
    unsigned long v0;  // x0

    g_f0eaa8 = 20504;
    g_f0eaaa = 7574;
    g_f0eaac = 60687;
    g_f0eaae = 8407;
    g_f01a08 = g_f0eaa8 ^ g_f01a08;
    g_f01a0a = g_f0eaaa ^ g_f01a0a;
    g_f01a0c = g_f0eaac ^ g_f01a0c;
    g_f01a0e = g_f0eaae ^ g_f01a0e;
    g_f01af0 = g_f01af0 ^ 2366620778383167512;
    return v0;
}
