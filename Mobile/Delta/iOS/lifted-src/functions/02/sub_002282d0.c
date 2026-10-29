/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2282d0..0x228368 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02ba8;
extern unsigned short g_f02baa;
extern unsigned short g_f02bac;
extern unsigned short g_f02bae;
extern unsigned long long g_f02c38;
extern unsigned short g_f11508;
extern unsigned short g_f1150a;
extern unsigned short g_f1150c;
extern unsigned short g_f1150e;

long long sub_2282d0(void)
{
    unsigned long v0;  // x0

    g_f11508 = 33696;
    g_f1150a = 6755;
    g_f1150c = 10948;
    g_f1150e = 8339;
    g_f02ba8 = g_f11508 ^ g_f02ba8;
    g_f02baa = g_f1150a ^ g_f02baa;
    g_f02bac = g_f1150c ^ g_f02bac;
    g_f02bae = g_f1150e ^ g_f02bae;
    g_f02c38 = g_f02c38 ^ 2347266852534846368;
    return v0;
}
