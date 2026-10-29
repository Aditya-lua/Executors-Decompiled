/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc52c..0xc5cc (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_e61ea0;

long long sub_c52c(unsigned int a0)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x9
    unsigned long long v2;  // x9
    unsigned long long v3;  // x9
    unsigned long long v4;  // x9
    unsigned long long v5;  // x9
    unsigned long long v6;  // x9

    v0 = ((a0 != 97) * 64 | (char)(a0 != 97) >> 58) & 0x3fffffffc0 & 0x3fffffffff;
    v1 = 8;
    if (a0 == 98)
        v0 = v1;
    v2 = 16;
    if (a0 == 0x66)
        v0 = v2;
    v3 = 32;
    if (a0 == 110)
        v0 = v3;
    v4 = 24;
    if (a0 == 114)
        v0 = v4;
    v5 = 56;
    if (a0 == 116)
        v0 = v5;
    v6 = 48;
    if (a0 == 118)
        v0 = v6;
    goto *((void *)(*(long long *)((char *)&g_e61ea0 + v0)));
}
