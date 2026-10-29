/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x39ab8..0x39b14 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_39ab8_1 {
    struct st_39ab8_2 *field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
} st_39ab8_1;

typedef struct st_39ab8_2 {
    unsigned long long field_0;
} st_39ab8_2;

typedef struct st_39ab8_0 {
    char field_0;
} st_39ab8_0;


st_39ab8_1 * sub_39ab8(st_39ab8_1 *a0)
{
    unsigned long long v2;  // x1
    unsigned long long *v3;  // x9
    st_39ab8_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_39ab8_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (!a0->field_8)
        return a0;
    v2 = 0;
    v3 = a0->field_0;
    while (*v3 == a0->field_18)
    {
        v2 += 1;
        v3 += 2;
        if (a0->field_8 == v2)
            return a0;
    }
    return a0;
}
