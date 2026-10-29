/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x14f850..0x14f8e8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01df0;
extern unsigned short g_f01df2;
extern unsigned short g_f01df4;
extern unsigned short g_f01df6;
extern unsigned long long g_f01e40;
extern unsigned short g_f0f7b0;
extern unsigned short g_f0f7b2;
extern unsigned short g_f0f7b4;
extern unsigned short g_f0f7b6;

long long sub_14f850(void)
{
    unsigned long v0;  // x0

    g_f0f7b0 = 48409;
    g_f0f7b2 = 36385;
    g_f0f7b4 = 53382;
    g_f0f7b6 = 30702;
    g_f01df0 = g_f0f7b0 ^ g_f01df0;
    g_f01df2 = g_f0f7b2 ^ g_f01df2;
    g_f01df4 = g_f0f7b4 ^ g_f01df4;
    g_f01df6 = g_f0f7b6 ^ g_f01df6;
    g_f01e40 = g_f01e40 ^ 8642074011299331353;
    return v0;
}
