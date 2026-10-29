/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x14f720..0x14f7b8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01de8;
extern unsigned short g_f01dea;
extern unsigned short g_f01dec;
extern unsigned short g_f01dee;
extern unsigned long long g_f01e38;
extern unsigned short g_f0f7a8;
extern unsigned short g_f0f7aa;
extern unsigned short g_f0f7ac;
extern unsigned short g_f0f7ae;

long long sub_14f720(void)
{
    unsigned long v0;  // x0

    g_f0f7a8 = 23782;
    g_f0f7aa = 11680;
    g_f0f7ac = 20934;
    g_f0f7ae = 32097;
    g_f01de8 = g_f0f7a8 ^ g_f01de8;
    g_f01dea = g_f0f7aa ^ g_f01dea;
    g_f01dec = g_f0f7ac ^ g_f01dec;
    g_f01dee = g_f0f7ae ^ g_f01dee;
    g_f01e38 = g_f01e38 ^ 9034592239092784358;
    return v0;
}
