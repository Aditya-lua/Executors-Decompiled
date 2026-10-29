/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xe8980..0xe8a18 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01478;
extern unsigned short g_f0147a;
extern unsigned short g_f0147c;
extern unsigned short g_f0147e;
extern unsigned long long g_f01508;
extern unsigned short g_f0dd58;
extern unsigned short g_f0dd5a;
extern unsigned short g_f0dd5c;
extern unsigned short g_f0dd5e;

long long sub_e8980(void)
{
    unsigned long v0;  // x0

    g_f0dd58 = 23479;
    g_f0dd5a = 48356;
    g_f0dd5c = 52210;
    g_f0dd5e = 60021;
    g_f01478 = g_f0dd58 ^ g_f01478;
    g_f0147a = g_f0dd5a ^ g_f0147a;
    g_f0147c = g_f0dd5c ^ g_f0147c;
    g_f0147e = g_f0dd5e ^ g_f0147e;
    g_f01508 = g_f01508 ^ 16894633820561890231;
    return v0;
}
