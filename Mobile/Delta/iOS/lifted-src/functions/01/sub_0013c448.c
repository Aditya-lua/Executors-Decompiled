/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13c448..0x13c4d8 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_13c448_0 {
    char padding_0[80];
    char field_50;
} st_13c448_0;

extern unsigned long long g_e6f2c8;

long long sub_13c448(st_13c448_0 *a0)
{
    unsigned int v0;  // w8
    unsigned long long v1;  // x9
    unsigned long long v2;  // x10
    unsigned long long v3;  // x10
    unsigned long long v4;  // x10
    unsigned long long v5;  // x10
    unsigned long long v6;  // x10
    unsigned long long v7;  // x8

    v0 = a0->field_50;
    v1 = ((v0 == 1) * 8 | (char)(v0 == 1) >> 61) & 0x7fffffff8 & 0x7ffffffff;
    v2 = 32;
    if (v0 == 2)
        v1 = v2;
    v3 = 48;
    if (v0 == 3)
        v1 = v3;
    v4 = 56;
    if (v0 == 4)
        v1 = v4;
    v5 = 40;
    if (v0 == 7)
        v1 = v5;
    v6 = 24;
    if (v0 == 5)
        v1 = v6;
    v7 = 16;
    if (v0 == 6)
        v1 = v7;
    goto *((void *)(*(long long *)((char *)&g_e6f2c8 + v1)));
}
