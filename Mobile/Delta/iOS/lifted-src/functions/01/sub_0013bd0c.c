/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13bd0c..0x13bda4 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01c38;
extern unsigned short g_f01c3a;
extern unsigned short g_f01c3c;
extern unsigned short g_f01c3e;
extern unsigned long long g_f01d38;
extern unsigned short g_f0ef70;
extern unsigned short g_f0ef72;
extern unsigned short g_f0ef74;
extern unsigned short g_f0ef76;

long long sub_13bd0c(void)
{
    unsigned long v0;  // x0

    g_f0ef70 = 37874;
    g_f0ef72 = 23049;
    g_f0ef74 = 38240;
    g_f0ef76 = 41864;
    g_f01c38 = g_f0ef70 ^ g_f01c38;
    g_f01c3a = g_f0ef72 ^ g_f01c3a;
    g_f01c3c = g_f0ef74 ^ g_f01c3c;
    g_f01c3e = g_f0ef76 ^ g_f01c3e;
    g_f01d38 = g_f01d38 ^ 11783832666074878962;
    return v0;
}
