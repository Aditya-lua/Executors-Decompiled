/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x215d94..0x215e2c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02990;
extern unsigned short g_f02992;
extern unsigned short g_f02994;
extern unsigned short g_f02996;
extern unsigned long long g_f02aa0;
extern unsigned short g_f10fa8;
extern unsigned short g_f10faa;
extern unsigned short g_f10fac;
extern unsigned short g_f10fae;

long long sub_215d94(void)
{
    unsigned long v0;  // x0

    g_f10fa8 = 64817;
    g_f10faa = 24459;
    g_f10fac = 65192;
    g_f10fae = 36234;
    g_f02990 = g_f10fa8 ^ g_f02990;
    g_f02992 = g_f10faa ^ g_f02992;
    g_f02994 = g_f10fac ^ g_f02994;
    g_f02996 = g_f10fae ^ g_f02996;
    g_f02aa0 = g_f02aa0 ^ 0x8d8afea85f8bfd31;
    return v0;
}
