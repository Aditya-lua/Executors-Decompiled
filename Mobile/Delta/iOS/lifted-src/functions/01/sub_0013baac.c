/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13baac..0x13bb44 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01b78;
extern unsigned short g_f01b7a;
extern unsigned short g_f01b7c;
extern unsigned short g_f01b7e;
extern unsigned long long g_f01c78;
extern unsigned short g_f0eeb0;
extern unsigned short g_f0eeb2;
extern unsigned short g_f0eeb4;
extern unsigned short g_f0eeb6;

long long sub_13baac(void)
{
    unsigned long v0;  // x0

    g_f0eeb0 = 1154;
    g_f0eeb2 = 29702;
    g_f0eeb4 = 45938;
    g_f0eeb6 = 9796;
    g_f01b78 = g_f0eeb0 ^ g_f01b78;
    g_f01b7a = g_f0eeb2 ^ g_f01b7a;
    g_f01b7c = g_f0eeb4 ^ g_f01b7c;
    g_f01b7e = g_f0eeb6 ^ g_f01b7e;
    g_f01c78 = g_f01c78 ^ 2757526176011781250;
    return v0;
}
