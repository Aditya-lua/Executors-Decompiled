/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13ae18..0x13aeb0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01be8;
extern unsigned short g_f01bea;
extern unsigned short g_f01bec;
extern unsigned short g_f01bee;
extern unsigned long long g_f01ce8;
extern unsigned short g_f0ef20;
extern unsigned short g_f0ef22;
extern unsigned short g_f0ef24;
extern unsigned short g_f0ef26;

long long sub_13ae18(void)
{
    unsigned long v0;  // x0

    g_f0ef20 = 14224;
    g_f0ef22 = 52124;
    g_f0ef24 = 41453;
    g_f0ef26 = 55809;
    g_f01be8 = g_f0ef20 ^ g_f01be8;
    g_f01bea = g_f0ef22 ^ g_f01bea;
    g_f01bec = g_f0ef24 ^ g_f01bec;
    g_f01bee = g_f0ef26 ^ g_f01bee;
    g_f01ce8 = g_f01ce8 ^ 15709015017940334480;
    return v0;
}
