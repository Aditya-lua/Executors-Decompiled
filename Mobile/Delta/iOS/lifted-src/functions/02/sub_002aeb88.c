/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2aeb88..0x2aec50 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_e7ba48;

long long sub_2aeb88(char *a0)
{
    unsigned int v0;  // w8
    unsigned long v1;  // x9
    unsigned long v2;  // x10
    unsigned long v3;  // x10
    unsigned long v4;  // x10
    unsigned long v5;  // x10
    unsigned long v6;  // x10
    unsigned long v7;  // x8

    v0 = *a0;
    v1 = ((v0 != 0) * 64 | (char)(v0 != 0) >> 58) & 0x3fffffffc0 & 0x3fffffffff;
    v2 = 8;
    if (v0 == 1)
        v1 = v2;
    v3 = 16;
    if (v0 == 2)
        v1 = v3;
    v4 = 32;
    if (v0 == 3)
        v1 = v4;
    v5 = 24;
    if (v0 == 4)
        v1 = v5;
    v6 = 56;
    if (v0 == 8)
        v1 = v6;
    v7 = 48;
    if (v0 == 9)
        v1 = v7;
    goto *((void *)(*(long long *)((char *)&g_e7ba48 + v1)));
}
