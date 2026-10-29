/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x123c6c..0x123d04 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01980;
extern unsigned short g_f01982;
extern unsigned short g_f01984;
extern unsigned short g_f01986;
extern unsigned long long g_f01a68;
extern unsigned short g_f0ea20;
extern unsigned short g_f0ea22;
extern unsigned short g_f0ea24;
extern unsigned short g_f0ea26;

long long sub_123c6c(void)
{
    unsigned long v0;  // x0

    g_f0ea20 = 31040;
    g_f0ea22 = 60962;
    g_f0ea24 = 33371;
    g_f0ea26 = 32114;
    g_f01980 = g_f0ea20 ^ g_f01980;
    g_f01982 = g_f0ea22 ^ g_f01982;
    g_f01984 = g_f0ea24 ^ g_f01984;
    g_f01986 = g_f0ea26 ^ g_f01986;
    g_f01a68 = g_f01a68 ^ 9039430733434878272;
    return v0;
}
