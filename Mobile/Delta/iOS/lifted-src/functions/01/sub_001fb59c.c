/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1fb59c..0x1fb5d8 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1fb59c_1 {
    struct st_1fb59c_2 *field_0;
    unsigned long long field_8;
} st_1fb59c_1;

typedef struct st_1fb59c_2 {
    unsigned int field_0;
    unsigned int field_4;
} st_1fb59c_2;

typedef struct st_1fb59c_0 {
    char field_0;
} st_1fb59c_0;


st_1fb59c_1 * sub_1fb59c(st_1fb59c_1 *a0)
{
    unsigned int *v2;  // x8
    st_1fb59c_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_1fb59c_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (a0->field_8 >= 2)
    {
        v2 = &a0->field_0->field_0;
        if (*v2 != v2[1])
            *v2 = v2[1];
    }
    return a0;
}
