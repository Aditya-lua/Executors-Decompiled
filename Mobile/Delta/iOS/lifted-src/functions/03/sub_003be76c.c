/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3be76c..0x3be804 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3be76c_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_3be76c_0;

typedef struct st_3be76c_2 {
    struct st_3be76c_0 *field_0;
    struct st_3be76c_0 *field_8;
    unsigned int field_10;
} st_3be76c_2;

typedef struct st_3be76c_1 {
    struct st_3be76c_0 *field_0;
    struct st_3be76c_0 *field_8;
    struct st_3be76c_0 *field_10;
    struct st_3be76c_0 *field_18;
    unsigned int field_20;
} st_3be76c_1;

typedef struct st_3be76c_5 {
    char field_0;
} st_3be76c_5;


float sub_3be76c(st_3be76c_1 *a0, st_3be76c_1 *a1)
{
    st_3be76c_0 *v4;  // x1
    st_3be76c_0 *v5;  // x8
    st_3be76c_2 *v6;  // x19
    st_3be76c_0 *v7;  // x9
    st_3be76c_2 *v8;  // x21
    st_3be76c_0 *v9;  // x9
    unsigned int v10;  // s0
    unsigned long long idx;  // x0
    st_3be76c_5 **v0;  // [bp-0x40], Other Possible Types: char
    st_3be76c_5 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    sub_3d0e4();
    v4 = a1->field_0;
    a1->field_0 = 0;
    sub_203f8(a0, v4);
    v5 = a1->field_10;
    v6 = &a1->field_10;
    v7 = *(long long *)((char *)v6 - 8);
    a0->field_10 = v5;
    v8 = &a0->field_10;
    *(st_3be76c_0 **)((char *)v8 - 8) = v7;
    *(unsigned long long *)((char *)v6 - 8) = 0;
    v9 = v6->field_8;
    v8->field_8 = v9;
    v10 = v6->field_10;
    v8->field_10 = v10;
    if (!v9)
        return v10;
    idx = sub_10c04(v5->field_8, a0->field_8);
    *(st_3be76c_2 **)&(a0->field_0->padding_0)[idx] = v8;
    v6->field_0 = 0;
    v6->field_8 = 0;
    return v10;
}
