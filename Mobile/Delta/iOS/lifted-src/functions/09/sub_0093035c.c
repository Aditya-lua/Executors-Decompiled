/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x93035c..0x930498 (316 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_f049c8;
extern char g_f049d0;
extern unsigned short g_f04a28;
extern unsigned short g_f04a2a;
extern unsigned short g_f04a2c;
extern unsigned short g_f04a2e;
extern unsigned short g_f04a30;
extern unsigned short g_f04a32;
extern unsigned short g_f04a34;
extern unsigned short g_f04a36;
extern unsigned long long g_f04a38;

long long sub_93035c(void)
{
    unsigned long long v0;  // x9
    unsigned short v1;  // x11
    unsigned short v2;  // x12
    unsigned short v3;  // x10
    unsigned long long v4;  // x11
    unsigned long long v5;  // x9
    unsigned long v6;  // x0

    if (g_f049d0 & 1)
        return v6;
    g_f049d0 = 1;
    v0 = 11815646031973816745 + ((6631098053006803464 + ~6631098053006803464 * 2 + 1 & 12351382622) + 0x5c06648910404200) * 2;
    g_f04a2a = v0;
    g_f04a2e = v0 >> 16;
    g_f04a32 = v0 >> 32;
    g_f04a36 = v0 >> 48;
    g_f04a28 = g_f04a2a ^ g_f04a28;
    g_f04a2c = g_f04a2c - g_f04a2e + (g_f04a2e & ~g_f04a2c) * 2;
    v1 = -g_f04a32;
    g_f04a30 = (v1 ^ g_f04a30) + (v1 & g_f04a30 | g_f04a32 & ~g_f04a30) * 2;
    v2 = g_f04a36 | g_f04a34;
    v3 = -(g_f04a36 & g_f04a34);
    g_f04a34 = (v2 ^ v3) + (v2 & v3) * 2;
    v4 = g_f04a38 | v0;
    v5 = -(g_f04a38 & v0);
    g_f04a38 = (v4 ^ v5) + (v4 & v5) * 2;
    *(unsigned int *)&g_f049c8 = 0;
    return v6;
}
