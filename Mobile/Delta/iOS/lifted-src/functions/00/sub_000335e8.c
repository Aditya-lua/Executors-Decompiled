/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x335e8..0x3371c (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_e646e0;

long long sub_335e8(unsigned int *a0)
{
    unsigned int v0;  // w9
    unsigned long long v1;  // x10
    unsigned long long v2;  // x11
    unsigned long long v3;  // x11
    unsigned long long v4;  // x11
    unsigned long long v5;  // x11
    unsigned long long v6;  // x9

    v0 = *a0;
    v1 = 48;
    if (v0 == 1)
        v1 = 0;
    v2 = 8;
    if (v0 == 2)
        v1 = v2;
    v3 = 16;
    if (v0 == 3)
        v1 = v3;
    v4 = 32;
    if (v0 == 4)
        v1 = v4;
    v5 = 24;
    if (v0 - 5 < 2)
        v1 = v5;
    v6 = 40;
    if (v0 == 7)
        v1 = v6;
    goto *((void *)(*(long long *)((char *)&g_e646e0 + v1)));
}
