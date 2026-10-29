/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x74234..0x742c4 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_74234_1 {
    char padding_0[16];
    unsigned long long field_10;
} st_74234_1;

typedef struct st_74234_2 {
    unsigned long long field_0;
    struct st_74234_1 *field_8;
    struct st_74234_1 *field_10;
} st_74234_2;

typedef struct st_74234_0 {
    char field_0;
} st_74234_0;


void sub_74234(st_74234_2 *a0, st_74234_2 *a1)
{
    unsigned long v4;  // x21
    st_74234_1 *v5;  // x9
    unsigned long v6;  // x8
    st_74234_1 *v7;  // x10
    st_74234_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_74234_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = &a0->field_8;
    sub_62aa0();
    a0->field_0 = a1->field_0;
    v5 = a1->field_8;
    v6 = &a1->field_8;
    *(st_74234_1 **)v4 = v5;
    v7 = a1->field_10;
    a0->field_10 = v7;
    if (!v7)
    {
        a0->field_0 = v4;
        return;
    }
    v5->field_10 = v4;
    a1->field_0 = v6;
    *(unsigned long long *)v6 = 0;
    *(unsigned long long *)(v6 + 8) = 0;
    return;
}
