/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xece8c..0xecf24 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01520;
extern unsigned short g_f01522;
extern unsigned short g_f01524;
extern unsigned short g_f01526;
extern unsigned long long g_f01550;
extern unsigned short g_f0dfb0;
extern unsigned short g_f0dfb2;
extern unsigned short g_f0dfb4;
extern unsigned short g_f0dfb6;

long long sub_ece8c(void)
{
    unsigned long v0;  // x0

    g_f0dfb0 = 59373;
    g_f0dfb2 = 28647;
    g_f0dfb4 = 12714;
    g_f0dfb6 = 30737;
    g_f01520 = g_f0dfb0 ^ g_f01520;
    g_f01522 = g_f0dfb2 ^ g_f01522;
    g_f01524 = g_f0dfb4 ^ g_f01524;
    g_f01526 = g_f0dfb6 ^ g_f01526;
    g_f01550 = g_f01550 ^ 8651750967247103981;
    return v0;
}
