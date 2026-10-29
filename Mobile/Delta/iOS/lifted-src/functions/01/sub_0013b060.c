/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13b060..0x13b0f8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01c30;
extern unsigned short g_f01c32;
extern unsigned short g_f01c34;
extern unsigned short g_f01c36;
extern unsigned long long g_f01d30;
extern unsigned short g_f0ef68;
extern unsigned short g_f0ef6a;
extern unsigned short g_f0ef6c;
extern unsigned short g_f0ef6e;

long long sub_13b060(void)
{
    unsigned long v0;  // x0

    g_f0ef68 = 26462;
    g_f0ef6a = 40056;
    g_f0ef6c = 5792;
    g_f0ef6e = 43259;
    g_f01c30 = g_f0ef68 ^ g_f01c30;
    g_f01c32 = g_f0ef6a ^ g_f01c32;
    g_f01c34 = g_f0ef6c ^ g_f01c34;
    g_f01c36 = g_f0ef6e ^ g_f01c36;
    g_f01d30 = g_f01d30 ^ 12176350896601982814;
    return v0;
}
