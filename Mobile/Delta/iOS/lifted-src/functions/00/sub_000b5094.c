/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5094..0xb510c (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5094_1 {
    char padding_0[280];
    unsigned int field_118;
} st_b5094_1;

typedef struct st_b5094_0 {
    char field_0;
} st_b5094_0;

extern unsigned long long g_e6c6f0;

long long sub_b5094(st_b5094_1 *a0)
{
    unsigned long long v5;  // x30
    unsigned int v6;  // w8
    unsigned long long v7;  // x8
    st_b5094_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_b5094_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v2 = &v4;
    v3 = v5;
    v1 = &v0;
    v0 = &v1;
    v6 = a0->field_118;
    v7 = 8;
    if (v6 != 2)
        v7 = ((v6 != 1) * 16 | (char)(v6 != 1) >> 60) & 0xffffffff0 & 0xfffffffff;
    goto *((void *)(*(long long *)((char *)&g_e6c6f0 + v7)));
}
