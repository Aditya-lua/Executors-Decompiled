/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13b228..0x13b2c0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01c40;
extern unsigned short g_f01c42;
extern unsigned short g_f01c44;
extern unsigned short g_f01c46;
extern unsigned long long g_f01d40;
extern unsigned short g_f0ef78;
extern unsigned short g_f0ef7a;
extern unsigned short g_f0ef7c;
extern unsigned short g_f0ef7e;

long long sub_13b228(void)
{
    unsigned long v0;  // x0

    g_f0ef78 = 15973;
    g_f0ef7a = 16457;
    g_f0ef7c = 5152;
    g_f0ef7e = 40470;
    g_f01c40 = g_f0ef78 ^ g_f01c40;
    g_f01c42 = g_f0ef7a ^ g_f01c42;
    g_f01c44 = g_f0ef7c ^ g_f01c44;
    g_f01c46 = g_f0ef7e ^ g_f01c46;
    g_f01d40 = g_f01d40 ^ 11391314436230299237;
    return v0;
}
