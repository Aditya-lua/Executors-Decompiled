/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2164b4..0x21654c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02998;
extern unsigned short g_f0299a;
extern unsigned short g_f0299c;
extern unsigned short g_f0299e;
extern unsigned long long g_f02aa8;
extern unsigned short g_f10fb0;
extern unsigned short g_f10fb2;
extern unsigned short g_f10fb4;
extern unsigned short g_f10fb6;

long long sub_2164b4(void)
{
    unsigned long v0;  // x0

    g_f10fb0 = 34276;
    g_f10fb2 = 56907;
    g_f10fb4 = 32111;
    g_f10fb6 = 34840;
    g_f02998 = g_f10fb0 ^ g_f02998;
    g_f0299a = g_f10fb2 ^ g_f0299a;
    g_f0299c = g_f10fb4 ^ g_f0299c;
    g_f0299e = g_f10fb6 ^ g_f0299e;
    g_f02aa8 = g_f02aa8 ^ 9806726108023588324;
    return v0;
}
