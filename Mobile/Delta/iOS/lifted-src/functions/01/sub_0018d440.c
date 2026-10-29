/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18d440..0x18d4d8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f021d0;
extern unsigned short g_f021d2;
extern unsigned short g_f021d4;
extern unsigned short g_f021d6;
extern unsigned long long g_f022e0;
extern unsigned short g_f10108;
extern unsigned short g_f1010a;
extern unsigned short g_f1010c;
extern unsigned short g_f1010e;

long long sub_18d440(void)
{
    unsigned long v0;  // x0

    g_f10108 = 31350;
    g_f1010a = 32537;
    g_f1010c = 13626;
    g_f1010e = 54392;
    g_f021d0 = g_f10108 ^ g_f021d0;
    g_f021d2 = g_f1010a ^ g_f021d2;
    g_f021d4 = g_f1010c ^ g_f021d4;
    g_f021d6 = g_f1010e ^ g_f021d6;
    g_f022e0 = g_f022e0 ^ 15310045458602752630;
    return v0;
}
