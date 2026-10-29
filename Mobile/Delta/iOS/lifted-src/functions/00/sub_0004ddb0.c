/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4ddb0..0x4de2c (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4ddb0_1 {
    char padding_0[40];
    unsigned long long field_28;
    struct st_4ddb0_2 *field_30;
    unsigned long long field_38;
} st_4ddb0_1;

typedef struct st_4ddb0_2 {
    long long field_0;
} st_4ddb0_2;

typedef struct st_4ddb0_0 {
    char field_0;
} st_4ddb0_0;


int sub_4ddb0(long long a0, st_4ddb0_1 *a1)
{
    unsigned long long i;  // x21
    st_4ddb0_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_4ddb0_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a1->field_38)
        return 1;
    i = 0;
    while (a1->field_28 > i)
    {
        sub_4a078(a0, *(long long *)&a1->field_30[i]);
        i += 1;
        if (i >= a1->field_38)
            return 1;
    }
    return 1;
}
