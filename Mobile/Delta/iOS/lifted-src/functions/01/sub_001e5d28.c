/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1e5d28..0x1e5dc0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02700;
extern unsigned short g_f02702;
extern unsigned short g_f02704;
extern unsigned short g_f02706;
extern unsigned long long g_f02730;
extern unsigned short g_f10c30;
extern unsigned short g_f10c32;
extern unsigned short g_f10c34;
extern unsigned short g_f10c36;

long long sub_1e5d28(void)
{
    unsigned long v0;  // x0

    g_f10c30 = 4576;
    g_f10c32 = 26976;
    g_f10c34 = 25950;
    g_f10c36 = 19512;
    g_f02700 = g_f10c30 ^ g_f02700;
    g_f02702 = g_f10c32 ^ g_f02702;
    g_f02704 = g_f10c34 ^ g_f02704;
    g_f02706 = g_f10c36 ^ g_f02706;
    g_f02730 = g_f02730 ^ 5492251201747554784;
    return v0;
}
