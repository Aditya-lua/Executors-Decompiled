/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13918..0x139b8 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_13918_1 {
    char padding_0[8];
    unsigned long long field_8;
} st_13918_1;

typedef struct st_13918_0 {
    char field_0;
} st_13918_0;


long long sub_13918(st_13918_1 *a0, long long a1, long long a2)
{
    st_13918_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_13918_0 *v1;  // [bp-0x48]
    st_13918_0 **v2;  // [bp-0x40], Other Possible Types: char
    st_13918_0 *v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if (a2 == a1)
        return a1;
    v3 = &v2;
    v2 = &v3;
    sub_19748(a1, a2, 7905747460161236407 * ((long long)(a0->field_8 - a2) >> 3));
    sub_c84c(a0, a0->field_8 + a1 - a2);
    return a1;
}
