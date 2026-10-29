/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a1c90..0x1a1d28 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02448;
extern unsigned short g_f0244a;
extern unsigned short g_f0244c;
extern unsigned short g_f0244e;
extern unsigned long long g_f024b0;
extern unsigned short g_f10620;
extern unsigned short g_f10622;
extern unsigned short g_f10624;
extern unsigned short g_f10626;

long long sub_1a1c90(void)
{
    unsigned long v0;  // x0

    g_f10620 = 0xffde;
    g_f10622 = 63774;
    g_f10624 = 21071;
    g_f10626 = 9762;
    g_f02448 = g_f10620 ^ g_f02448;
    g_f0244a = g_f10622 ^ g_f0244a;
    g_f0244c = g_f10624 ^ g_f0244c;
    g_f0244e = g_f10626 ^ g_f0244e;
    g_f024b0 = g_f024b0 ^ 0x2622524ff91effde;
    return v0;
}
