/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x109a14..0x109aac (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f015a8;
extern unsigned short g_f015aa;
extern unsigned short g_f015ac;
extern unsigned short g_f015ae;
extern unsigned long long g_f016e8;
extern unsigned short g_f0e0c0;
extern unsigned short g_f0e0c2;
extern unsigned short g_f0e0c4;
extern unsigned short g_f0e0c6;

long long sub_109a14(void)
{
    unsigned long v0;  // x0

    g_f0e0c0 = 54646;
    g_f0e0c2 = 8021;
    g_f0e0c4 = 40031;
    g_f0e0c6 = 7030;
    g_f015a8 = g_f0e0c0 ^ g_f015a8;
    g_f015aa = g_f0e0c2 ^ g_f015aa;
    g_f015ac = g_f0e0c4 ^ g_f015ac;
    g_f015ae = g_f0e0c6 ^ g_f015ae;
    g_f016e8 = g_f016e8 ^ 1978941018637456758;
    return v0;
}
