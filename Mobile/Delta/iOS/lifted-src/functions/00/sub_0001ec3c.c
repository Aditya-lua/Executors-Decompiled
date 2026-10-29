/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ec3c..0x1ed6c (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ec3c_1 {
    uint128_t field_0;
} st_1ec3c_1;

typedef struct st_1ec3c_0 {
    long long field_0;
    struct st_1ec3c_1 *field_8;
    struct st_1ec3c_1 *field_10;
} st_1ec3c_0;

typedef struct st_1ec3c_2 {
    char field_0;
} st_1ec3c_2;


uint128_t * sub_1ec3c(st_1ec3c_0 *a0, uint128_t *a1, long long a2)
{
    uint128_t *v11;  // x22
    uint128_t *v12;  // x8
    long long v13;  // x0
    long long n;  // x2
    long long v15;  // x20
    long long v16;  // x8
    uint128_t *v17;  // x9
    uint128_t v0;  // [bp-0x90]
    st_1ec3c_2 **v1;  // [bp-0x78], Other Possible Types: char
    st_1ec3c_2 *v2;  // [bp-0x70]
    char v3;  // [bp-0x68], Other Possible Types: long long
    long long v4;  // [bp-0x60]
    uint128_t *v5;  // [bp-0x58], Other Possible Types: long long, uint128_t
    uint128_t *v6;  // [bp-0x50]
    st_1ec3c_2 **v7;  // [bp-0x40], Other Possible Types: char
    st_1ec3c_2 *v8;  // [bp-0x38]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v11 = a0->field_8;
    if (a0->field_10 > v11)
    {
        *v11 = *a1;
        sub_5c38(v11 + 1, a2);
        v12 = (char *)&v11[2] + 8;
    }
    else
    {
        v2 = &v1;
        v1 = &v2;
        v13 = sub_1ed6c(a0, 1 + 14757395258967641293 * ((char *)v11 - a0->field_0 >> 3));
        sub_1acbc(&v3, v13, 14757395258967641293 * ((char *)a0->field_8 - a0->field_0 >> 3), a0);
        *v5 = *a1;
        sub_5c38(v5 + 1, a2);
        v5 = _INSERT(CONCAT(v5, 0), 0, (char *)&v5[2] + 8);
        v8 = &v7;
        v7 = &v8;
        n = (char *)a0->field_8 - a0->field_0;
        v15 = v4 - n;
        _memcpy(v15, a0->field_0, n);
        v16 = a0->field_0;
        a0->field_0 = v15;
        v17 = a0->field_10;
        v0 = v5;
        *(uint128_t *)&a0->field_8 = v5;
        v5 = v16;
        v6 = v17;
        v3 = v16;
        v4 = v16;
        sub_18e78(&v3);
        v12 = (unsigned long long)v0;
    }
    a0->field_8 = v12;
    return (char *)v12 - 40;
}
