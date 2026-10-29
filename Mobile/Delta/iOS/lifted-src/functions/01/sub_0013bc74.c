/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13bc74..0x13bd0c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01b90;
extern unsigned short g_f01b92;
extern unsigned short g_f01b94;
extern unsigned short g_f01b96;
extern unsigned long long g_f01c90;
extern unsigned short g_f0eec8;
extern unsigned short g_f0eeca;
extern unsigned short g_f0eecc;
extern unsigned short g_f0eece;

long long sub_13bc74(void)
{
    unsigned long v0;  // x0

    g_f0eec8 = 45020;
    g_f0eeca = 10561;
    g_f0eecc = 12209;
    g_f0eece = 5613;
    g_f01b90 = g_f0eec8 ^ g_f01b90;
    g_f01b92 = g_f0eeca ^ g_f01b92;
    g_f01b94 = g_f0eecc ^ g_f01b94;
    g_f01b96 = g_f0eece ^ g_f01b96;
    g_f01c90 = g_f01c90 ^ 1579971482224799708;
    return v0;
}
