/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x43a30..0x43b7c (332 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_43a30_1 {
    long long field_0;
    struct st_43a30_0 *field_8;
    struct st_43a30_0 *field_10;
} st_43a30_1;

typedef struct st_43a30_0 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    unsigned long long field_40;
} st_43a30_0;

typedef struct st_43a30_2 {
    char field_0;
} st_43a30_2;


st_43a30_0 * sub_43a30(st_43a30_1 *a0, st_43a30_0 *a1)
{
    st_43a30_0 *v11;  // x8
    uint128_t v12;  // q0
    long long v21;  // x20
    long long v22;  // x8
    st_43a30_0 *v23;  // x9
    uint128_t v13;  // q1
    uint128_t v14;  // q2
    st_43a30_0 *v15;  // x8
    long long v16;  // x0
    uint128_t v17;  // q1
    uint128_t v18;  // q0
    uint128_t v19;  // q2
    long long n;  // x2
    uint128_t v0;  // [bp-0x90]
    st_43a30_2 **v1;  // [bp-0x78], Other Possible Types: char
    st_43a30_2 *v2;  // [bp-0x70]
    char v3;  // [bp-0x68], Other Possible Types: long long
    long long v4;  // [bp-0x60]
    st_43a30_0 *idx;  // [bp-0x58], Other Possible Types: long long, uint128_t
    st_43a30_0 *v6;  // [bp-0x50]
    st_43a30_2 **v7;  // [bp-0x40], Other Possible Types: char
    st_43a30_2 *v8;  // [bp-0x38]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v11 = a0->field_8;
    if (a0->field_10 > v11)
    {
        v11->field_0 = a1->field_0;
        v12 = a1->field_10;
        v13 = a1->field_20;
        v14 = a1->field_30;
        v11->field_40 = a1->field_40;
        v11->field_20 = v13;
        v11->field_30 = v14;
        v11->field_10 = v12;
        v15 = v11 + 1;
    }
    else
    {
        v2 = &v1;
        v1 = &v2;
        v16 = sub_48570(a0, 1 + 10248191152060862009 * ((char *)v11 - a0->field_0 >> 3));
        sub_42404(&v3, v16, 10248191152060862009 * ((char *)a0->field_8 - a0->field_0 >> 3), a0);
        idx->field_0 = a1->field_0;
        v17 = a1->field_20;
        v18 = a1->field_30;
        v19 = a1->field_10;
        idx->field_40 = a1->field_40;
        idx->field_20 = v17;
        idx->field_30 = v18;
        idx->field_10 = v19;
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
        sub_43398(&v3);
        v15 = (unsigned long long)v0;
    }
    a0->field_8 = v15;
    return (char *)v15 - 72;
}
