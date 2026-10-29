/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a589c..0x2a5a24 (392 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_e7cc28;

long long sub_2a589c(unsigned long long a0)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x9
    unsigned long long v10;  // x9
    unsigned long long v11;  // x9
    unsigned long long v12;  // x9
    unsigned long long v13;  // x9
    unsigned long long v14;  // x9
    unsigned long long v2;  // x9
    unsigned long long v3;  // x9
    unsigned long long v4;  // x9
    unsigned long long v5;  // x9
    unsigned long long v6;  // x9
    unsigned long long v7;  // x9
    unsigned long long v8;  // x9
    unsigned long long v9;  // x9

    v0 = ((a0 != 0) * 64 | (char)(a0 != 0) >> 58) & 0x3fffffffc0 & 0x3fffffffff;
    v1 = 8;
    if (a0 == 1)
        v0 = v1;
    v2 = 32;
    if (a0 == 2)
        v0 = v2;
    v3 = 96;
    if (a0 == 3)
        v0 = v3;
    v4 = 80;
    if (a0 == 4)
        v0 = v4;
    v5 = 128;
    if (a0 - 5 < 3)
        v0 = v5;
    v6 = 112;
    if (a0 == 8)
        v0 = v6;
    v7 = 72;
    if (a0 == 9)
        v0 = v7;
    v8 = 88;
    if (a0 == 10)
        v0 = v8;
    v9 = 40;
    if (a0 == 11)
        v0 = v9;
    v10 = 24;
    if (a0 == 12)
        v0 = v10;
    v11 = 16;
    if (a0 == 13)
        v0 = v11;
    v12 = 56;
    if (a0 == 14)
        v0 = v12;
    v13 = 104;
    if (a0 == 15)
        v0 = v13;
    v14 = 120;
    if (a0 == 16)
        v0 = v14;
    goto *((void *)(*(long long *)((char *)&g_e7cc28 + v0)));
}
