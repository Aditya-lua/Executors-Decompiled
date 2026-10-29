/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1be52c..0x1be638 (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1be52c_1 {
    struct st_1be52c_1 *field_0;
    long long field_8;
} st_1be52c_1;

typedef struct st_1be52c_4 {
    struct st_1be52c_1 *field_0;
    struct st_1be52c_2 *field_8;
    char field_10;
} st_1be52c_4;

typedef struct st_1be52c_2 {
    struct st_1be52c_3 *field_0;
    long long field_8;
    struct st_1be52c_1 *field_10;
    long long field_18;
} st_1be52c_2;

typedef struct st_1be52c_3 {
    struct st_1be52c_1 *field_0;
} st_1be52c_3;

typedef struct st_1be52c_0 {
    char field_0;
} st_1be52c_0;


long long sub_1be52c(st_1be52c_2 *a0, st_1be52c_1 *i)
{
    long long v4;  // x22
    unsigned long long idx;  // x23
    st_1be52c_1 *v6;  // x8
    st_1be52c_1 *v7;  // x8
    st_1be52c_1 *v8;  // x24
    unsigned long long index;  // x0
    st_1be52c_4 *v11;  // x8
    st_1be52c_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1be52c_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0->field_8;
    idx = sub_10c04(i->field_8, v4);
    v6 = *(long long *)&a0->field_0[idx];
    do
    {
        v7 = v6;
        v8 = v7;
        v6 = v7->field_0;
    } while (v7->field_0 != i);
    if ((v8 == &a0->field_10 || sub_10c04(v8->field_8, v4) != idx) && (!i->field_0 || sub_10c04(i->field_0->field_8, v4) != idx))
        *(unsigned long long *)&a0->field_0[idx] = 0;
    if (i->field_0)
    {
        index = sub_10c04(i->field_0->field_8, v4);
        if (index != idx)
            *(st_1be52c_1 **)&a0->field_0[index] = v8;
    }
    v8->field_0 = i->field_0;
    i->field_0 = 0;
    a0->field_18 = a0->field_18 - 1;
    v11->field_0 = i;
    v11->field_8 = a0;
    v11->field_10 = 1;
    return sub_16f34(v11 + 1);
}
