/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18c818..0x18c8b0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02110;
extern unsigned short g_f02112;
extern unsigned short g_f02114;
extern unsigned short g_f02116;
extern unsigned long long g_f02220;
extern unsigned short g_f10048;
extern unsigned short g_f1004a;
extern unsigned short g_f1004c;
extern unsigned short g_f1004e;

long long sub_18c818(void)
{
    unsigned long v0;  // x0

    g_f10048 = 41862;
    g_f1004a = 25869;
    g_f1004c = 21320;
    g_f1004e = 22324;
    g_f02110 = g_f10048 ^ g_f02110;
    g_f02112 = g_f1004a ^ g_f02112;
    g_f02114 = g_f1004c ^ g_f02114;
    g_f02116 = g_f1004e ^ g_f02116;
    g_f02220 = g_f02220 ^ 6283738950486827910;
    return v0;
}
