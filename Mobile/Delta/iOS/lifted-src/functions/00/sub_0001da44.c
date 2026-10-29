/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1da44..0x1db64 (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1da44_0 {
    long long field_0;
    uint128_t *field_8;
    uint128_t *field_10;
} st_1da44_0;

typedef struct st_1da44_1 {
    char field_0;
} st_1da44_1;


uint128_t * sub_1da44(st_1da44_0 *a0, uint128_t *a1)
{
    uint128_t *v11;  // x8
    uint128_t v12;  // q0
    uint128_t *v21;  // x9
    uint128_t v13;  // q2
    uint128_t *v14;  // x8
    long long v15;  // x0
    uint128_t v16;  // q2
    uint128_t v17;  // q0
    long long n;  // x2
    long long v19;  // x20
    long long v20;  // x8
    uint128_t v0;  // [bp-0x90]
    st_1da44_1 **v1;  // [bp-0x78], Other Possible Types: char
    st_1da44_1 *v2;  // [bp-0x70]
    char v3;  // [bp-0x68], Other Possible Types: long long
    long long v4;  // [bp-0x60]
    uint128_t *idx;  // [bp-0x58], Other Possible Types: long long, uint128_t
    uint128_t *v6;  // [bp-0x50]
    st_1da44_1 **v7;  // [bp-0x40], Other Possible Types: char
    st_1da44_1 *v8;  // [bp-0x38]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v11 = a0->field_8;
    if (a0->field_10 > v11)
    {
        v12 = *a1;
        v13 = a1[2];
        v11[1] = a1[1];
        v11[2] = v13;
        *v11 = v12;
        v14 = v11 + 3;
    }
    else
    {
        v2 = &v1;
        v1 = &v2;
        v15 = sub_13bcc(a0, 1 + 12297829382473034411 * ((char *)v11 - a0->field_0 >> 4));
        sub_10900(&v3, v15, 12297829382473034411 * ((char *)a0->field_8 - a0->field_0 >> 4), a0);
        v16 = a1[1];
        v17 = a1[2];
        *idx = *a1;
        idx[1] = v16;
        idx[2] = v17;
        idx = _INSERT(CONCAT(idx, 0), 0, idx + 3);
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
        sub_174ec(&v3);
        v14 = (unsigned long long)v0;
    }
    a0->field_8 = v14;
    return (char *)v14 - 48;
}
