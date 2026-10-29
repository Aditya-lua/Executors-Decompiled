/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1083ec..0x108484 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01680;
extern unsigned short g_f01682;
extern unsigned short g_f01684;
extern unsigned short g_f01686;
extern unsigned long long g_f017c0;
extern unsigned short g_f0e198;
extern unsigned short g_f0e19a;
extern unsigned short g_f0e19c;
extern unsigned short g_f0e19e;

long long sub_1083ec(void)
{
    unsigned long v0;  // x0

    g_f0e198 = 0xd000;
    g_f0e19a = 17927;
    g_f0e19c = 64148;
    g_f0e19e = 34914;
    g_f01680 = g_f0e198 ^ g_f01680;
    g_f01682 = g_f0e19a ^ g_f01682;
    g_f01684 = g_f0e19c ^ g_f01684;
    g_f01686 = g_f0e19e ^ g_f01686;
    g_f017c0 = g_f017c0 ^ 0x8862fa944607d000;
    return v0;
}
