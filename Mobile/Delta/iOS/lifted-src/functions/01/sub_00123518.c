/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x123518..0x1235b0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f019e0;
extern unsigned short g_f019e2;
extern unsigned short g_f019e4;
extern unsigned short g_f019e6;
extern unsigned long long g_f01ac8;
extern unsigned short g_f0ea80;
extern unsigned short g_f0ea82;
extern unsigned short g_f0ea84;
extern unsigned short g_f0ea86;

long long sub_123518(void)
{
    unsigned long v0;  // x0

    g_f0ea80 = 41704;
    g_f0ea82 = 58728;
    g_f0ea84 = 29520;
    g_f0ea86 = 15380;
    g_f019e0 = g_f0ea80 ^ g_f019e0;
    g_f019e2 = g_f0ea82 ^ g_f019e2;
    g_f019e4 = g_f0ea84 ^ g_f019e4;
    g_f019e6 = g_f0ea86 ^ g_f019e6;
    g_f01ac8 = g_f01ac8 ^ 4329211933093307112;
    return v0;
}
