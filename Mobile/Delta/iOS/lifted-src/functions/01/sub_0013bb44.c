/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13bb44..0x13bbdc (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01c50;
extern unsigned short g_f01c52;
extern unsigned short g_f01c54;
extern unsigned short g_f01c56;
extern unsigned long long g_f01d50;
extern unsigned short g_f0ef88;
extern unsigned short g_f0ef8a;
extern unsigned short g_f0ef8c;
extern unsigned short g_f0ef8e;

long long sub_13bb44(void)
{
    unsigned long v0;  // x0

    g_f0ef88 = 57612;
    g_f0ef8a = 8154;
    g_f0ef8c = 4519;
    g_f0ef8e = 37681;
    g_f01c50 = g_f0ef88 ^ g_f01c50;
    g_f01c52 = g_f0ef8a ^ g_f01c52;
    g_f01c54 = g_f0ef8c ^ g_f01c54;
    g_f01c56 = g_f0ef8e ^ g_f01c56;
    g_f01d50 = g_f01d50 ^ 10606278006925877516;
    return v0;
}
