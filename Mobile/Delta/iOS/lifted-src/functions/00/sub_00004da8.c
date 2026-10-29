/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4da8..0x4e14 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4da8_0 {
    char padding_0[280];
    struct st_4da8_1 *field_118;
} st_4da8_0;

typedef struct st_4da8_1 {
    unsigned long long field_0;
} st_4da8_1;


void sub_4da8(unsigned long a0, st_4da8_0 **a1)
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
    *a1->field_118();
}
