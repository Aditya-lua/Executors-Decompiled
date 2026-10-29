/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x92c04..0x92c5c (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_92c04_0 {
    char padding_0[272];
    unsigned int field_110;
} st_92c04_0;

extern unsigned long long g_e6bfb8;

long long sub_92c04(st_92c04_0 *a0)
{
    unsigned int v0;  // w8
    unsigned long long v1;  // x9
    unsigned long long v2;  // x10
    unsigned long long v3;  // x8

    v0 = a0->field_110;
    v1 = 24;
    if (v0 == 7)
        v1 = 0;
    v2 = 8;
    if (v0 == 5)
        v1 = v2;
    v3 = 16;
    if (v0 == 6)
        v1 = v3;
    goto *((void *)(*(long long *)((char *)&g_e6bfb8 + v1)));
}
