/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x113200..0x113298 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01830;
extern unsigned short g_f01832;
extern unsigned short g_f01834;
extern unsigned short g_f01836;
extern unsigned long long g_f018c8;
extern unsigned short g_f0e708;
extern unsigned short g_f0e70a;
extern unsigned short g_f0e70c;
extern unsigned short g_f0e70e;

long long sub_113200(void)
{
    unsigned long v0;  // x0

    g_f0e708 = 10740;
    g_f0e70a = 38064;
    g_f0e70c = 46835;
    g_f0e70e = 25147;
    g_f01830 = g_f0e708 ^ g_f01830;
    g_f01832 = g_f0e70a ^ g_f01832;
    g_f01834 = g_f0e70c ^ g_f01834;
    g_f01836 = g_f0e70e ^ g_f01836;
    g_f018c8 = g_f018c8 ^ 7078452396630747636;
    return v0;
}
