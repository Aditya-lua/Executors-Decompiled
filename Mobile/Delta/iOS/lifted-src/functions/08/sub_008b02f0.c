/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8b02f0..0x8b0378 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8b02f0_1 {
    char padding_0[8];
    struct st_8b02f0_2 *field_8;
    char padding_10[16];
    unsigned long long field_20;
} st_8b02f0_1;

typedef struct st_8b02f0_2 {
    long long field_0;
} st_8b02f0_2;

typedef struct st_8b02f0_0 {
    char field_0;
} st_8b02f0_0;


int sub_8b02f0(st_8b02f0_1 *a0, unsigned int a1)
{
    unsigned long long v4;  // x19
    st_8b02f0_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_8b02f0_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (64 > a0->field_20)
        a1 = 1;
    if (128 <= a0->field_20)
        v4 = 0;
    else
        v4 = a1;
    if (!(v4 & 1))
    {
        sub_4e14(*(long long *)a0->field_8, 64, 8);
        a0->field_8 = a0->field_8 + 1;
        a0->field_20 = (a0->field_20 ^ 0xffffffffffffffc0) + (a0->field_20 >> 6) * 128;
    }
    return (unsigned int)v4 ^ 1;
}
