/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2d634..0x2d6c4 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2d634_1 {
    struct st_2d634_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned int field_18;
} st_2d634_1;

typedef struct st_2d634_2 {
    unsigned int field_0;
} st_2d634_2;

typedef struct st_2d634_0 {
    char field_0;
} st_2d634_0;


unsigned long long sub_2d634(st_2d634_1 *a0, unsigned int *a1)
{
    unsigned long long v2;  // x8
    unsigned int *v3;  // x9
    unsigned long long v4;  // x11
    unsigned long v5;  // x10
    unsigned long long idx;  // x12
    st_2d634_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_2d634_0 *v1;  // [bp-0x8]

    v2 = 0;
    v1 = &v0;
    v0 = &v1;
    v3 = a0->field_0;
    v4 = a0->field_8 - 1;
    v5 = *a1;
    idx = v4 & v5;
    while (v3[2 * idx] != a0->field_18)
    {
        if (v3[2 * idx] == (unsigned int)v5)
            return &v3[2 * idx];
        v2 += 1;
        idx = v2 + idx & v4;
        if (v2 > v4)
            return 0;
    }
    v3[2 * idx] = v5;
    a0->field_10 = a0->field_10 + 1;
    return &v3[2 * idx];
}
