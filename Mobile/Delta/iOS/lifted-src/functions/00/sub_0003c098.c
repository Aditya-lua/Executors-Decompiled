/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c098..0x3c0f0 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c098_3 {
    struct st_3c098_1 *field_0;
    unsigned long long field_8;
} st_3c098_3;

typedef struct st_3c098_1 {
    struct st_3c098_2 *field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
} st_3c098_1;

typedef struct st_3c098_2 {
    unsigned long long field_0;
} st_3c098_2;

typedef struct st_3c098_0 {
    char field_0;
} st_3c098_0;


st_3c098_3 * sub_3c098(st_3c098_3 *a0)
{
    st_3c098_1 *v2;  // x8
    unsigned long long v3;  // x11
    unsigned long long v4;  // x10
    unsigned long long v5;  // x9
    unsigned long long v6;  // x10
    st_3c098_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_3c098_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = a0->field_0;
    v3 = v2->field_8;
    v4 = a0->field_8 + 1;
    if (v4 < v3)
        v5 = v3;
    else
        v5 = a0->field_8 + 1;
    while (1)
    {
        v6 = v4;
        if (v3 <= v6)
            break;
        v4 = v6 + 1;
        if (*(long long *)&v2->field_0[v6] != v2->field_18)
        {
            v5 = v4 - 1;
            break;
        }
    }
    a0->field_8 = v5;
    return a0;
}
