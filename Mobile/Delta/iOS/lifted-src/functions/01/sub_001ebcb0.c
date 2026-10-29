/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ebcb0..0x1ebd3c (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ebcb0_1 {
    struct st_1ebcb0_2 *field_0;
    unsigned long long field_8;
    char padding_10[56];
    unsigned int field_48;
} st_1ebcb0_1;

typedef struct st_1ebcb0_2 {
    unsigned int field_0;
    unsigned int field_4;
} st_1ebcb0_2;

typedef struct st_1ebcb0_0 {
    char field_0;
} st_1ebcb0_0;


double sub_1ebcb0(st_1ebcb0_1 *a0)
{
    double v4;  // d0
    unsigned int *v5;  // x8
    st_1ebcb0_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1ebcb0_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (1 >= a0->field_8)
    {
        sub_1fb614(a0, 2);
        v4 = 5e-324;
        *(double *)a0->field_0 = 5e-324;
    }
    else
    {
        v5 = &a0->field_0->field_0;
        if (*v5 == v5[1])
        {
            *v5 = *v5 + 1;
            a0->field_48 = 0;
            return v4;
        }
    }
    a0->field_48 = 0;
    return v4;
}
