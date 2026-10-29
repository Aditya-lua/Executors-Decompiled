/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x112ed4..0x112f6c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01820;
extern unsigned short g_f01822;
extern unsigned short g_f01824;
extern unsigned short g_f01826;
extern unsigned long long g_f018b8;
extern unsigned short g_f0e6f8;
extern unsigned short g_f0e6fa;
extern unsigned short g_f0e6fc;
extern unsigned short g_f0e6fe;

long long sub_112ed4(void)
{
    unsigned long v0;  // x0

    g_f0e6f8 = 6701;
    g_f0e6fa = 55569;
    g_f0e6fc = 47474;
    g_f0e6fe = 27936;
    g_f01820 = g_f0e6f8 ^ g_f01820;
    g_f01822 = g_f0e6fa ^ g_f01822;
    g_f01824 = g_f0e6fc ^ g_f01824;
    g_f01826 = g_f0e6fe ^ g_f01826;
    g_f018b8 = g_f018b8 ^ 7863488852308073005;
    return v0;
}
