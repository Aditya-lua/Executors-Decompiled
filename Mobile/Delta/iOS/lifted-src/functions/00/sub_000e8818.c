/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xe8818..0xe88b0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01488;
extern unsigned short g_f0148a;
extern unsigned short g_f0148c;
extern unsigned short g_f0148e;
extern unsigned long long g_f01518;
extern unsigned short g_f0dd68;
extern unsigned short g_f0dd6a;
extern unsigned short g_f0dd6c;
extern unsigned short g_f0dd6e;

long long sub_e8818(void)
{
    unsigned long v0;  // x0

    g_f0dd68 = 39758;
    g_f0dd6a = 14372;
    g_f0dd6c = 51570;
    g_f0dd6e = 57232;
    g_f01488 = g_f0dd68 ^ g_f01488;
    g_f0148a = g_f0dd6a ^ g_f0148a;
    g_f0148c = g_f0dd6c ^ g_f0148c;
    g_f0148e = g_f0dd6e ^ g_f0148e;
    g_f01518 = g_f01518 ^ 16109597359509642062;
    return v0;
}
