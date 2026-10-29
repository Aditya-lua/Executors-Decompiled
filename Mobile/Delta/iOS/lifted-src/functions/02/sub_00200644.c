/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x200644..0x2006a0 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_200644_1 {
    double field_0;
    char padding_8[4];
    unsigned int field_c;
} st_200644_1;

typedef struct st_200644_2 {
    char padding_0[88];
    struct st_200644_1 *field_58;
} st_200644_2;

typedef struct st_200644_0 {
    char field_0;
} st_200644_0;


int sub_200644(st_200644_2 *a0)
{
    unsigned int v4;  // w0
    st_200644_1 *v5;  // x8
    st_200644_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_200644_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_3c5e8c();
    v5 = a0->field_58;
    v5->field_0 = (double)(int)v4;
    v5->field_c = 3;
    a0->field_58 = a0->field_58 + 1;
    return 1;
}
