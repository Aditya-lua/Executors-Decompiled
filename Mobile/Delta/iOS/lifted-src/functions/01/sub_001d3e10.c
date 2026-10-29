/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d3e10..0x1d3ea8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f025b8;
extern unsigned short g_f025ba;
extern unsigned short g_f025bc;
extern unsigned short g_f025be;
extern unsigned long long g_f02680;
extern unsigned short g_f10870;
extern unsigned short g_f10872;
extern unsigned short g_f10874;
extern unsigned short g_f10876;

long long sub_1d3e10(void)
{
    unsigned long v0;  // x0

    g_f10870 = 4551;
    g_f10872 = 44926;
    g_f10874 = 6322;
    g_f10876 = 11151;
    g_f025b8 = g_f10870 ^ g_f025b8;
    g_f025ba = g_f10872 ^ g_f025ba;
    g_f025bc = g_f10874 ^ g_f025bc;
    g_f025be = g_f10876 ^ g_f025be;
    g_f02680 = g_f02680 ^ 3138754621028045255;
    return v0;
}
