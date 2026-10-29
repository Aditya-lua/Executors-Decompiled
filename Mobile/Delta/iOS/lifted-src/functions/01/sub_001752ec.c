/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1752ec..0x175384 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02070;
extern unsigned short g_f02072;
extern unsigned short g_f02074;
extern unsigned short g_f02076;
extern unsigned long long g_f020f8;
extern unsigned short g_f0fdc0;
extern unsigned short g_f0fdc2;
extern unsigned short g_f0fdc4;
extern unsigned short g_f0fdc6;

long long sub_1752ec(void)
{
    unsigned long v0;  // x0

    g_f0fdc0 = 23300;
    g_f0fdc2 = 42500;
    g_f0fdc4 = 27728;
    g_f0fdc6 = 50214;
    g_f02070 = g_f0fdc0 ^ g_f02070;
    g_f02072 = g_f0fdc2 ^ g_f02072;
    g_f02074 = g_f0fdc4 ^ g_f02074;
    g_f02076 = g_f0fdc6 ^ g_f02076;
    g_f020f8 = g_f020f8 ^ 14134103574187367172;
    return v0;
}
