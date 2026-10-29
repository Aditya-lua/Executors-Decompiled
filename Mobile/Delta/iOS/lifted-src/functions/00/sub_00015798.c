/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x15798..0x158b8 (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_15798_0 {
    uint128_t field_0;
    unsigned long long field_10;
} st_15798_0;

typedef struct st_15798_1 {
    long long field_0;
    struct st_15798_0 *field_8;
    struct st_15798_0 *field_10;
} st_15798_1;

typedef struct st_15798_2 {
    char field_0;
} st_15798_2;


st_15798_0 * sub_15798(st_15798_1 *a0, st_15798_0 *a1)
{
    st_15798_0 *v11;  // x8
    uint128_t v12;  // q0
    st_15798_0 *v13;  // x8
    long long v14;  // x0
    unsigned long long v15;  // x9
    long long n;  // x2
    long long v17;  // x20
    long long v18;  // x8
    st_15798_0 *v19;  // x9
    uint128_t v0;  // [bp-0x90]
    st_15798_2 **v1;  // [bp-0x78], Other Possible Types: char
    st_15798_2 *v2;  // [bp-0x70]
    char v3;  // [bp-0x68], Other Possible Types: long long
    long long v4;  // [bp-0x60]
    st_15798_0 *v5;  // [bp-0x58], Other Possible Types: long long, uint128_t
    st_15798_0 *v6;  // [bp-0x50]
    st_15798_2 **v7;  // [bp-0x40], Other Possible Types: char
    st_15798_2 *v8;  // [bp-0x38]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v11 = a0->field_8;
    if (a0->field_10 > v11)
    {
        v12 = a1->field_0;
        v11->field_10 = a1->field_10;
        v11->field_0 = v12;
        v13 = v11 + 1;
    }
    else
    {
        v2 = &v1;
        v1 = &v2;
        v14 = sub_1e4b0(a0, 1 + 12297829382473034411 * ((char *)v11 - a0->field_0 >> 3));
        sub_16a40(&v3, v14, 12297829382473034411 * ((char *)a0->field_8 - a0->field_0 >> 3), a0);
        v15 = a1->field_10;
        v5->field_0 = a1->field_0;
        v5->field_10 = v15;
        v5 = _INSERT(CONCAT(v5, 0), 0, v5 + 1);
        v8 = &v7;
        v7 = &v8;
        n = (char *)a0->field_8 - a0->field_0;
        v17 = v4 - n;
        _memcpy(v17, a0->field_0, n);
        v18 = a0->field_0;
        a0->field_0 = v17;
        v19 = a0->field_10;
        v0 = v5;
        *(uint128_t *)&a0->field_8 = v5;
        v5 = v18;
        v6 = v19;
        v3 = v18;
        v4 = v18;
        sub_1f268(&v3);
        v13 = (unsigned long long)v0;
    }
    a0->field_8 = v13;
    return (char *)v13 - 24;
}
