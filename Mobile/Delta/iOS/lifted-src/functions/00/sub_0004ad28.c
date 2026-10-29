/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4ad28..0x4ad98 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4ad28_3 {
    struct st_4ad28_1 *field_0;
    unsigned long long field_8;
} st_4ad28_3;

typedef struct st_4ad28_1 {
    struct st_4ad28_2 *field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
} st_4ad28_1;

typedef struct st_4ad28_2 {
    unsigned long long field_0;
} st_4ad28_2;

typedef struct st_4ad28_0 {
    char field_0;
} st_4ad28_0;


st_4ad28_3 * sub_4ad28(st_4ad28_3 *a0)
{
    st_4ad28_1 *v2;  // x9
    unsigned long long v3;  // x8
    unsigned long long v4;  // x10
    unsigned long long v5;  // x11
    unsigned long long v6;  // x12
    unsigned long long v7;  // x12
    st_4ad28_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_4ad28_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = a0->field_0;
    v3 = a0->field_8;
    v4 = v2->field_8;
    if (v3 + 1 < v4)
        v5 = v4;
    else
        v5 = v3 + 1;
    v6 = 24 + 24 * v3;
    while (1)
    {
        v7 = v6;
        v3 += 1;
        if (v4 <= v3)
        {
            a0->field_8 = v5;
            return a0;
        }
        v6 = v7 + 24;
        if (*(long long *)((char *)v2->field_0 + v7) != v2->field_18)
        {
            a0->field_8 = v3;
            return a0;
        }
    }
}
