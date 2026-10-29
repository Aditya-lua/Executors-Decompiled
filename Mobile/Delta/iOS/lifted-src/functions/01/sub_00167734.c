/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x167734..0x167790 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_167734_0 {
    char padding_0[24];
    unsigned long long field_18;
} st_167734_0;

extern st_167734_0 *g_f0d3d8;

void sub_167734(unsigned long a0, long long a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    sub_a0c8(a1);
    sub_6b08(a1);
    goto *((void *)(g_f0d3d8->field_18));
}
