/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b08ec..0x1b09bc (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b08ec_1 {
    struct st_1b08ec_1 *field_0;
    unsigned long long field_8;
} st_1b08ec_1;

typedef struct st_1b08ec_2 {
    struct st_1b08ec_3 *field_0;
    long long field_8;
    struct st_1b08ec_1 *field_10;
    long long field_18;
} st_1b08ec_2;

typedef struct st_1b08ec_3 {
    struct st_1b08ec_1 *field_0;
} st_1b08ec_3;

typedef struct st_1b08ec_0 {
    char field_0;
} st_1b08ec_0;


unsigned long long sub_1b08ec(st_1b08ec_2 *a0, st_1b08ec_1 *a1, st_1b08ec_1 *a2)
{
    long long v4;  // x21
    unsigned long long idx;  // x0
    unsigned long long index;  // x22
    st_1b08ec_1 *v7;  // x8
    st_1b08ec_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1b08ec_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0->field_8;
    idx = sub_10c04(a1->field_8, v4);
    index = idx;
    if (a2)
    {
        a1->field_0 = a2->field_0;
        a2->field_0 = a1;
        if (a1->field_0 && !(idx = sub_10c04(a1->field_0->field_8, v4), idx == index))
            goto LABEL_1b0990;
    }
    else
    {
        v7 = &a0->field_10;
        a1->field_0 = a0->field_10;
        v7->field_0 = a1;
        *(st_1b08ec_1 **)&a0->field_0[index] = v7;
        if (a1->field_0)
        {
            idx = sub_10c04(a1->field_0->field_8, v4);
LABEL_1b0990:
            *(st_1b08ec_1 **)&a0->field_0[idx] = a1;
        }
    }
    a0->field_18 = a0->field_18 + 1;
    return idx;
}
