/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d66e4..0x1d677c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f026b0;
extern unsigned short g_f026b2;
extern unsigned short g_f026b4;
extern unsigned short g_f026b6;
extern unsigned long long g_f026c8;
extern unsigned short g_f10ba0;
extern unsigned short g_f10ba2;
extern unsigned short g_f10ba4;
extern unsigned short g_f10ba6;

long long sub_1d66e4(void)
{
    unsigned long v0;  // x0

    g_f10ba0 = 0xb5fe;
    g_f10ba2 = 51308;
    g_f10ba4 = 29157;
    g_f10ba6 = 33457;
    g_f026b0 = g_f10ba0 ^ g_f026b0;
    g_f026b2 = g_f10ba2 ^ g_f026b2;
    g_f026b4 = g_f10ba4 ^ g_f026b4;
    g_f026b6 = g_f10ba6 ^ g_f026b6;
    g_f026c8 = g_f026c8 ^ 0x82b171e5c86cb5fe;
    return v0;
}
