/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x10d5c..0x10e6c (272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_10d5c_1 {
    struct st_10d5c_1 *field_0;
    unsigned long long field_8;
} st_10d5c_1;

typedef struct st_10d5c_2 {
    struct st_10d5c_3 *field_0;
    struct st_10d5c_1 *field_8;
    struct st_10d5c_1 *field_10;
    long long field_18;
} st_10d5c_2;

typedef struct st_10d5c_3 {
    struct st_10d5c_1 *field_0;
} st_10d5c_3;

typedef struct st_10d5c_0 {
    char field_0;
} st_10d5c_0;


unsigned long long sub_10d5c(st_10d5c_2 *a0, st_10d5c_1 *a1)
{
    unsigned long long v5;  // x0
    st_10d5c_1 *v6;  // x22
    unsigned long long index;  // x0
    st_10d5c_1 *v8;  // x23
    unsigned long long v9;  // x21
    unsigned long long idx;  // x0
    st_10d5c_1 **v11;  // x8
    unsigned long long v12;  // x0
    st_10d5c_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_10d5c_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a1)
    {
        v12 = sub_203f8(a0);
        a0->field_8 = 0;
        return v12;
    }
    sub_203f8(a0, sub_12a38(&a0->field_8));
    a0->field_8 = a1;
    v5 = _bzero(a0->field_0, a1 * 8);
    v6 = a0->field_10;
    if (!v6)
        return v5;
    index = sub_10c04(v6->field_8, a1);
    *(st_10d5c_2 **)&a0->field_0[index] = &a0->field_10;
    v8 = v6->field_0;
    if (!v8)
        return index;
    v9 = index;
    do
    {
        idx = sub_10c04(v8->field_8, a1);
        if (idx == v9)
        {
            idx = v9;
        }
        else
        {
            v11 = a0->field_0;
            if (v11[idx])
            {
                v6->field_0 = v8->field_0;
                v8->field_0 = v11[idx]->field_0;
                v11[idx]->field_0 = v8;
                idx = v9;
                v8 = v6;
            }
            else
            {
                v11[idx] = v6;
            }
        }
    } while ((v6 = v8, v8 = v8->field_0, v9 = idx, v8));
    return idx;
}
