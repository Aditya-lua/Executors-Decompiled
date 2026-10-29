/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x144c88..0x144d20 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01d70;
extern unsigned short g_f01d72;
extern unsigned short g_f01d74;
extern unsigned short g_f01d76;
extern unsigned long long g_f01da0;
extern unsigned short g_f0f3a8;
extern unsigned short g_f0f3aa;
extern unsigned short g_f0f3ac;
extern unsigned short g_f0f3ae;

long long sub_144c88(void)
{
    unsigned long v0;  // x0

    g_f0f3a8 = 63172;
    g_f0f3aa = 65063;
    g_f0f3ac = 58504;
    g_f0f3ae = 53014;
    g_f01d70 = g_f0f3a8 ^ g_f01d70;
    g_f01d72 = g_f0f3aa ^ g_f01d72;
    g_f01d74 = g_f0f3ac ^ g_f01d74;
    g_f01d76 = g_f0f3ae ^ g_f01d76;
    g_f01da0 = g_f01da0 ^ 14922365692369434308;
    return v0;
}
