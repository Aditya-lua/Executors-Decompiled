/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x108a50..0x108ae8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01688;
extern unsigned short g_f0168a;
extern unsigned short g_f0168c;
extern unsigned short g_f0168e;
extern unsigned long long g_f017c8;
extern unsigned short g_f0e1a0;
extern unsigned short g_f0e1a2;
extern unsigned short g_f0e1a4;
extern unsigned short g_f0e1a6;

long long sub_108a50(void)
{
    unsigned long v0;  // x0

    g_f0e1a0 = 41107;
    g_f0e1a2 = 30783;
    g_f0e1a4 = 31051;
    g_f0e1a6 = 33520;
    g_f01688 = g_f0e1a0 ^ g_f01688;
    g_f0168a = g_f0e1a2 ^ g_f0168a;
    g_f0168c = g_f0e1a4 ^ g_f0168c;
    g_f0168e = g_f0e1a6 ^ g_f0168e;
    g_f017c8 = g_f017c8 ^ 9435174584388133011;
    return v0;
}
