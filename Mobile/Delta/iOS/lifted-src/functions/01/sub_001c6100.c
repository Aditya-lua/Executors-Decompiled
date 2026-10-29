/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c6100..0x1c63dc (732 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c6100_0 {
    char field_0;
} st_1c6100_0;

extern unsigned long long g_e70fa8;

char * sub_1c6100(unsigned long a0, char *a1, char *a2)
{
    unsigned int v4;  // w1
    unsigned long v5;  // x8
    st_1c6100_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1c6100_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a1 == a2)
        return a1;
    v4 = *a1;
    v5 = 192;
    if (v4 == 0x66)
        v5 = 312;
    if (v4 == 110)
        v5 = 72;
    if (v4 == 114)
        v5 = 456;
    if (v4 == 116)
        v5 = 368;
    if (v4 == 118)
        v5 = 496;
    if (v4 == 99)
        v5 = 56;
    if (v4 == 117)
        v5 = 416;
    if (v4 == 120)
        v5 = 120;
    if (v4 == 48)
        v5 = 272;
    goto *((void *)(*(long long *)((char *)&g_e70fa8 + v5)));
}
