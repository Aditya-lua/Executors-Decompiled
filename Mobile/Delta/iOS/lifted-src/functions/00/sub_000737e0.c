/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x737e0..0x7386c (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_737e0_1 {
    char padding_0[8];
    struct st_737e0_2 *field_8;
} st_737e0_1;

typedef struct st_737e0_3 {
    struct st_737e0_1 *field_0;
    struct st_737e0_3 *field_8;
    unsigned long long field_10;
} st_737e0_3;

typedef struct st_737e0_2 {
    struct st_737e0_1 *field_0;
} st_737e0_2;

typedef struct st_737e0_0 {
    char field_0;
} st_737e0_0;


st_737e0_3 * sub_737e0(st_737e0_3 *i)
{
    st_737e0_3 *v4;  // x20
    st_737e0_1 **v5;  // x8
    st_737e0_1 *v6;  // x9
    st_737e0_3 *v7;  // x20
    st_737e0_3 *v8;  // x0
    st_737e0_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_737e0_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!i->field_10)
        return i;
    v4 = i->field_8;
    v5 = i->field_0->field_8;
    v6 = v4->field_0;
    v6->field_8 = v5;
    *v5 = v6;
    i->field_10 = 0;
    if (v4 == i)
        return i;
    do
    {
        v7 = v4;
        v8 = sub_4e14(v7, 1, 8);
        v4 = v7->field_8;
    } while (v7->field_8 != i);
    return v8;
}
