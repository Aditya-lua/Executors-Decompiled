/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x123d9c..0x123e34 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01990;
extern unsigned short g_f01992;
extern unsigned short g_f01994;
extern unsigned short g_f01996;
extern unsigned long long g_f01a78;
extern unsigned short g_f0ea30;
extern unsigned short g_f0ea32;
extern unsigned short g_f0ea34;
extern unsigned short g_f0ea36;

long long sub_123d9c(void)
{
    unsigned long v0;  // x0

    g_f0ea30 = 50918;
    g_f0ea32 = 20324;
    g_f0ea34 = 0x7fd5;
    g_f0ea36 = 29325;
    g_f01990 = g_f0ea30 ^ g_f01990;
    g_f01992 = g_f0ea32 ^ g_f01992;
    g_f01994 = g_f0ea34 ^ g_f01994;
    g_f01996 = g_f0ea36 ^ g_f01996;
    g_f01a78 = g_f01a78 ^ 0x728d7fd54f64c6e6;
    return v0;
}
