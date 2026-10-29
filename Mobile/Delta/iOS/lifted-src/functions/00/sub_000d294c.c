/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xd294c..0xd29a8 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_d294c_1 {
    char padding_0[8];
    struct st_d294c_1 *field_8;
    char padding_10[16];
    unsigned long long field_20;
} st_d294c_1;

typedef struct st_d294c_0 {
    char field_0;
} st_d294c_0;


st_d294c_1 * sub_d294c(st_d294c_1 *a0)
{
    st_d294c_1 *v5;  // x0
    st_d294c_0 **v0;  // [bp-0x38], Other Possible Types: char
    st_d294c_0 *v1;  // [bp-0x30]
    char v2;  // [bp-0x21]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    if (!a0->field_20)
        return a0;
    sub_d2c48(&v2, a0);
    v5 = a0->field_8;
    if (v5 == &a0->field_20)
        return v5;
    return _free(v5);
}
