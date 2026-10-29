/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x14f328..0x14f3c0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01e00;
extern unsigned short g_f01e02;
extern unsigned short g_f01e04;
extern unsigned short g_f01e06;
extern unsigned long long g_f01e50;
extern unsigned short g_f0f7c0;
extern unsigned short g_f0f7c2;
extern unsigned short g_f0f7c4;
extern unsigned short g_f0f7c6;

long long sub_14f328(void)
{
    unsigned long v0;  // x0

    g_f0f7c0 = 30240;
    g_f0f7c2 = 28414;
    g_f0f7c4 = 52743;
    g_f0f7c6 = 27913;
    g_f01e00 = g_f0f7c0 ^ g_f01e00;
    g_f01e02 = g_f0f7c2 ^ g_f01e02;
    g_f01e04 = g_f0f7c4 ^ g_f01e04;
    g_f01e06 = g_f0f7c6 ^ g_f01e06;
    g_f01e50 = g_f01e50 ^ 7857037556246804000;
    return v0;
}
