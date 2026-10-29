/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x15fe8..0x16120 (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_15fe8_1 {
    long long field_0;
    struct st_15fe8_0 *field_8;
    struct st_15fe8_0 *field_10;
} st_15fe8_1;

typedef struct st_15fe8_0 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    unsigned long long field_30;
} st_15fe8_0;

typedef struct st_15fe8_2 {
    char field_0;
} st_15fe8_2;


st_15fe8_0 * sub_15fe8(st_15fe8_1 *a0, st_15fe8_0 *a1)
{
    st_15fe8_0 *v11;  // x8
    uint128_t v12;  // q0
    long long v21;  // x20
    long long v22;  // x8
    st_15fe8_0 *v23;  // x9
    uint128_t v13;  // q1
    uint128_t v14;  // q2
    st_15fe8_0 *v15;  // x8
    long long v16;  // x0
    uint128_t v17;  // q2
    uint128_t v18;  // q0
    unsigned long long v19;  // x9
    long long n;  // x2
    uint128_t v0;  // [bp-0x90]
    st_15fe8_2 **v1;  // [bp-0x78], Other Possible Types: char
    st_15fe8_2 *v2;  // [bp-0x70]
    char v3;  // [bp-0x68], Other Possible Types: long long
    long long v4;  // [bp-0x60]
    st_15fe8_0 *idx;  // [bp-0x58], Other Possible Types: long long, uint128_t
    st_15fe8_0 *v6;  // [bp-0x50]
    st_15fe8_2 **v7;  // [bp-0x40], Other Possible Types: char
    st_15fe8_2 *v8;  // [bp-0x38]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v11 = a0->field_8;
    if (a0->field_10 > v11)
    {
        v12 = a1->field_0;
        v13 = a1->field_10;
        v14 = a1->field_20;
        v11->field_30 = a1->field_30;
        v11->field_10 = v13;
        v11->field_20 = v14;
        v11->field_0 = v12;
        v15 = v11 + 1;
    }
    else
    {
        v2 = &v1;
        v1 = &v2;
        v16 = sub_1689c(a0, 1 + 7905747460161236407 * ((char *)v11 - a0->field_0 >> 3));
        sub_19284(&v3, v16, 7905747460161236407 * ((char *)a0->field_8 - a0->field_0 >> 3), a0);
        v17 = a1->field_10;
        v18 = a1->field_20;
        v19 = a1->field_30;
        idx->field_0 = a1->field_0;
        idx->field_10 = v17;
        idx->field_30 = v19;
        idx->field_20 = v18;
        idx = _INSERT(CONCAT(idx, 0), 0, idx + 1);
        v8 = &v7;
        v7 = &v8;
        n = (char *)a0->field_8 - a0->field_0;
        v21 = v4 - n;
        _memcpy(v21, a0->field_0, n);
        v22 = a0->field_0;
        a0->field_0 = v21;
        v23 = a0->field_10;
        v0 = idx;
        *(uint128_t *)&a0->field_8 = idx;
        idx = v22;
        v6 = v23;
        v3 = v22;
        v4 = v22;
        sub_13778(&v3);
        v15 = (unsigned long long)v0;
    }
    a0->field_8 = v15;
    return (char *)v15 - 56;
}
