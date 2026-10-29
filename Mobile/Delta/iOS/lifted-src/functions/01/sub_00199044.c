/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x199044..0x199330 (748 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_199044_1 {
    unsigned long long field_0;
} st_199044_1;

typedef struct st_199044_0 {
    char padding_0[72];
    struct st_199044_1 *field_48;
} st_199044_0;

extern st_199044_0 *g_f0d3d8;

void sub_199044(unsigned long a0)
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
    g_f0d3d8->field_48();
}
