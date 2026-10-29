/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a1b60..0x1a1bf8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02440;
extern unsigned short g_f02442;
extern unsigned short g_f02444;
extern unsigned short g_f02446;
extern unsigned long long g_f024a8;
extern unsigned short g_f10618;
extern unsigned short g_f1061a;
extern unsigned short g_f1061c;
extern unsigned short g_f1061e;

long long sub_1a1b60(void)
{
    unsigned long v0;  // x0

    g_f10618 = 39738;
    g_f1061a = 454;
    g_f1061c = 54158;
    g_f1061e = 11156;
    g_f02440 = g_f10618 ^ g_f02440;
    g_f02442 = g_f1061a ^ g_f02442;
    g_f02444 = g_f1061c ^ g_f02444;
    g_f02446 = g_f1061e ^ g_f02446;
    g_f024a8 = g_f024a8 ^ 3140367447052688186;
    return v0;
}
