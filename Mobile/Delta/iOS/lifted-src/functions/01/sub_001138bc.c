/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1138bc..0x113954 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01878;
extern unsigned short g_f0187a;
extern unsigned short g_f0187c;
extern unsigned short g_f0187e;
extern unsigned long long g_f01910;
extern unsigned short g_f0e750;
extern unsigned short g_f0e752;
extern unsigned short g_f0e754;
extern unsigned short g_f0e756;

long long sub_1138bc(void)
{
    unsigned long v0;  // x0

    g_f0e750 = 25922;
    g_f0e752 = 52436;
    g_f0e754 = 11178;
    g_f0e756 = 12597;
    g_f01878 = g_f0e750 ^ g_f01878;
    g_f0187a = g_f0e752 ^ g_f0187a;
    g_f0187c = g_f0e754 ^ g_f0187c;
    g_f0187e = g_f0e756 ^ g_f0187e;
    g_f01910 = g_f01910 ^ 3545788294205039938;
    return v0;
}
