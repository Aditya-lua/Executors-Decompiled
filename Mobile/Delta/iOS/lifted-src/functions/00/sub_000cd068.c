/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xcd068..0xcd0b8 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_cd068_2 {
    unsigned long long field_0;
} st_cd068_2;

typedef struct st_cd068_1 {
    char padding_0[32];
    struct st_cd068_2 *field_20;
    char padding_28[40];
    struct st_cd068_2 *field_50;
} st_cd068_1;

typedef struct st_cd068_0 {
    char field_0;
} st_cd068_0;


void sub_cd068(st_cd068_1 *a0)
{
    unsigned long long v5;  // x30
    st_cd068_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_cd068_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v2 = &v4;
    v3 = v5;
    v1 = &v0;
    v0 = &v1;
    if (!a0->field_20)
        a0->field_50();
    a0->field_20();
}
