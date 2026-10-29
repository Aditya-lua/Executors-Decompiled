/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x20de0..0x20e70 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_20de0_1 {
    char padding_0[216];
    long long field_d8;
    char padding_e0[240];
    unsigned long long field_1d0;
    unsigned long long field_1d8;
} st_20de0_1;

typedef struct st_20de0_0 {
    char field_0;
} st_20de0_0;


long long sub_20de0(st_20de0_1 *a0, unsigned long a1, long long a2, unsigned long a3)
{
    long long v7;  // x0
    st_20de0_0 **v0;  // [bp-0x48], Other Possible Types: char
    st_20de0_0 *v1;  // [bp-0x40]
    unsigned long v2;  // [bp-0x38]
    unsigned long v3;  // [bp-0x30]
    char *v4;  // [bp-0x28]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    v4 = &v6;
    sub_1b464();
    v2 = 0;
    v3 = 0;
    v7 = sub_404c(a0->field_d8, 56);
    return sub_4ed8(v7, a2, &v2, 1, 0xffffffff + 2863311531 * (unsigned int)(a0->field_1d8 - a0->field_1d0 >> 4));
}
