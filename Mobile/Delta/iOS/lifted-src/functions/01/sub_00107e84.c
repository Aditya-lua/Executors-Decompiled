/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x107e84..0x107f1c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01660;
extern unsigned short g_f01662;
extern unsigned short g_f01664;
extern unsigned short g_f01666;
extern unsigned long long g_f017a0;
extern unsigned short g_f0e178;
extern unsigned short g_f0e17a;
extern unsigned short g_f0e17c;
extern unsigned short g_f0e17e;

long long sub_107e84(void)
{
    unsigned long v0;  // x0

    g_f0e178 = 38514;
    g_f0e17a = 43833;
    g_f0e17c = 0xff96;
    g_f0e17e = 40492;
    g_f01660 = g_f0e178 ^ g_f01660;
    g_f01662 = g_f0e17a ^ g_f01662;
    g_f01664 = g_f0e17c ^ g_f01664;
    g_f01666 = g_f0e17e ^ g_f01666;
    g_f017a0 = g_f017a0 ^ 0x9e2cff96ab399672;
    return v0;
}
