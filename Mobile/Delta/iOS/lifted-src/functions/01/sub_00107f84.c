/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x107f84..0x10801c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f015a0;
extern unsigned short g_f015a2;
extern unsigned short g_f015a4;
extern unsigned short g_f015a6;
extern unsigned long long g_f016e0;
extern unsigned short g_f0e0b8;
extern unsigned short g_f0e0ba;
extern unsigned short g_f0e0bc;
extern unsigned short g_f0e0be;

long long sub_107f84(void)
{
    unsigned long v0;  // x0

    g_f0e0b8 = 15394;
    g_f0e0ba = 23932;
    g_f0e0bc = 7585;
    g_f0e0be = 8425;
    g_f015a0 = g_f0e0b8 ^ g_f015a0;
    g_f015a2 = g_f0e0ba ^ g_f015a2;
    g_f015a4 = g_f0e0bc ^ g_f015a4;
    g_f015a6 = g_f0e0be ^ g_f015a6;
    g_f016e0 = g_f016e0 ^ 2371459257682639906;
    return v0;
}
