/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x227e10..0x227ea8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02bd8;
extern unsigned short g_f02bda;
extern unsigned short g_f02bdc;
extern unsigned short g_f02bde;
extern unsigned long long g_f02c68;
extern unsigned short g_f11538;
extern unsigned short g_f1153a;
extern unsigned short g_f1153c;
extern unsigned short g_f1153e;

long long sub_227e10(void)
{
    unsigned long v0;  // x0

    g_f11538 = 8692;
    g_f1153a = 24612;
    g_f1153c = 9030;
    g_f1153e = 0xffe4;
    g_f02bd8 = g_f11538 ^ g_f02bd8;
    g_f02bda = g_f1153a ^ g_f02bda;
    g_f02bdc = g_f1153c ^ g_f02bdc;
    g_f02bde = g_f1153e ^ g_f02bde;
    g_f02c68 = g_f02c68 ^ 0xffe42346602421f4;
    return v0;
}
