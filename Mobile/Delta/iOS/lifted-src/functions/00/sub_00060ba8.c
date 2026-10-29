/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x60ba8..0x60bc4 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_60ba8_0 {
    char padding_0[32];
    struct st_60ba8_1 *field_20;
} st_60ba8_0;

typedef struct st_60ba8_1 {
    unsigned long long field_0;
} st_60ba8_1;


void sub_60ba8(st_60ba8_0 *a0)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    v0 = &v2;
    v1 = v3;
    a0->field_20();
}
