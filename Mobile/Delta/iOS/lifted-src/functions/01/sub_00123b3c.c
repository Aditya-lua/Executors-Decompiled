/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x123b3c..0x123bd4 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f019d0;
extern unsigned short g_f019d2;
extern unsigned short g_f019d4;
extern unsigned short g_f019d6;
extern unsigned long long g_f01ab8;
extern unsigned short g_f0ea70;
extern unsigned short g_f0ea72;
extern unsigned short g_f0ea74;
extern unsigned short g_f0ea76;

long long sub_123b3c(void)
{
    unsigned long v0;  // x0

    g_f0ea70 = 50433;
    g_f0ea72 = 1977;
    g_f0ea74 = 30160;
    g_f0ea76 = 18169;
    g_f019d0 = g_f0ea70 ^ g_f019d0;
    g_f019d2 = g_f0ea72 ^ g_f019d2;
    g_f019d4 = g_f0ea74 ^ g_f019d4;
    g_f019d6 = g_f0ea76 ^ g_f019d6;
    g_f01ab8 = g_f01ab8 ^ 5114248388199171329;
    return v0;
}
