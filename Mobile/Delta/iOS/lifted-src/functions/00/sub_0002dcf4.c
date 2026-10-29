/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2dcf4..0x2de18 (292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2dcf4_1 {
    long long field_0;
    struct st_2dcf4_0 *field_8;
    struct st_2dcf4_0 *field_10;
} st_2dcf4_1;

typedef struct st_2dcf4_0 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
} st_2dcf4_0;

typedef struct st_2dcf4_2 {
    char field_0;
} st_2dcf4_2;


st_2dcf4_0 * sub_2dcf4(st_2dcf4_1 *a0, st_2dcf4_0 *a1)
{
    st_2dcf4_0 *v11;  // x8
    uint128_t v12;  // q0
    st_2dcf4_0 *v21;  // x9
    uint128_t v13;  // q1
    st_2dcf4_0 *v14;  // x8
    long long v15;  // x0
    unsigned long long v16;  // x9
    uint128_t v17;  // q1
    long long n;  // x2
    long long v19;  // x20
    long long v20;  // x8
    uint128_t v0;  // [bp-0x90]
    st_2dcf4_2 **v1;  // [bp-0x78], Other Possible Types: char
    st_2dcf4_2 *v2;  // [bp-0x70]
    char v3;  // [bp-0x68], Other Possible Types: long long
    long long v4;  // [bp-0x60]
    st_2dcf4_0 *idx;  // [bp-0x58], Other Possible Types: long long, uint128_t
    st_2dcf4_0 *v6;  // [bp-0x50]
    st_2dcf4_2 **v7;  // [bp-0x40], Other Possible Types: char
    st_2dcf4_2 *v8;  // [bp-0x38]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v11 = a0->field_8;
    if (a0->field_10 > v11)
    {
        v12 = a1->field_0;
        v13 = a1->field_10;
        v11->field_20 = a1->field_20;
        v11->field_0 = v12;
        v11->field_10 = v13;
        v14 = v11 + 1;
    }
    else
    {
        v2 = &v1;
        v1 = &v2;
        v15 = sub_1ed6c(a0, 1 + 14757395258967641293 * ((char *)v11 - a0->field_0 >> 3));
        sub_1acbc(&v3, v15, 14757395258967641293 * ((char *)a0->field_8 - a0->field_0 >> 3), a0);
        v16 = a1->field_20;
        v17 = a1->field_10;
        idx->field_0 = a1->field_0;
        idx->field_10 = v17;
        idx->field_20 = v16;
        idx = _INSERT(CONCAT(idx, 0), 0, idx + 1);
        v8 = &v7;
        v7 = &v8;
        n = (char *)a0->field_8 - a0->field_0;
        v19 = v4 - n;
        _memcpy(v19, a0->field_0, n);
        v20 = a0->field_0;
        a0->field_0 = v19;
        v21 = a0->field_10;
        v0 = idx;
        *(uint128_t *)&a0->field_8 = idx;
        idx = v20;
        v6 = v21;
        v3 = v20;
        v4 = v20;
        sub_2e228(&v3);
        v14 = (unsigned long long)v0;
    }
    a0->field_8 = v14;
    return (char *)v14 - 40;
}
