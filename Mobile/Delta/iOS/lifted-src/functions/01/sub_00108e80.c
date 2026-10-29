/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x108e80..0x108f18 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01658;
extern unsigned short g_f0165a;
extern unsigned short g_f0165c;
extern unsigned short g_f0165e;
extern unsigned long long g_f01798;
extern unsigned short g_f0e170;
extern unsigned short g_f0e172;
extern unsigned short g_f0e174;
extern unsigned short g_f0e176;

long long sub_108e80(void)
{
    unsigned long v0;  // x0

    g_f0e170 = 751;
    g_f0e172 = 62286;
    g_f0e174 = 32983;
    g_f0e176 = 41887;
    g_f01658 = g_f0e170 ^ g_f01658;
    g_f0165a = g_f0e172 ^ g_f0165a;
    g_f0165c = g_f0e174 ^ g_f0165c;
    g_f0165e = g_f0e176 ^ g_f0165e;
    g_f01798 = g_f01798 ^ 11790284014467547887;
    return v0;
}
