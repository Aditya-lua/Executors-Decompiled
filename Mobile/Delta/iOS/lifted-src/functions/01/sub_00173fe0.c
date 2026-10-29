/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x173fe0..0x174068 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_173fe0_1 {
    double field_0;
    char padding_8[4];
    unsigned int field_c;
    double field_10;
    char padding_18[4];
    unsigned int field_1c;
} st_173fe0_1;

typedef struct st_173fe0_2 {
    char padding_0[88];
    struct st_173fe0_1 *field_58;
} st_173fe0_2;

typedef struct st_173fe0_0 {
    char field_0;
} st_173fe0_0;


int sub_173fe0(st_173fe0_2 *a0)
{
    unsigned long long v4;  // x0
    st_173fe0_1 *v5;  // x9
    st_173fe0_1 *v6;  // x9
    st_173fe0_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_173fe0_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_16b618();
    v5 = a0->field_58;
    v5->field_0 = (double)(int)v4;
    v5->field_c = 3;
    v6 = a0->field_58;
    a0->field_58 = &v6->field_10;
    v6->field_10 = (double)(int)(v4 >> 32);
    v6->field_1c = 3;
    a0->field_58 = &a0->field_58->field_10;
    return 2;
}
