/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x22564..0x22670 (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_22564_0 {
    long long field_0;
    uint128_t *field_8;
    uint128_t *field_10;
} st_22564_0;

typedef struct st_22564_1 {
    char field_0;
} st_22564_1;


long long sub_22564(st_22564_0 *a0, uint128_t *a1)
{
    uint128_t *v11;  // x8
    uint128_t v12;  // q1
    long long v13;  // x0
    uint128_t v14;  // q0
    long long n;  // x2
    long long v16;  // x20
    long long v17;  // x8
    uint128_t *v18;  // x9
    uint128_t v0;  // [bp-0x80]
    st_22564_1 **v1;  // [bp-0x68], Other Possible Types: char
    st_22564_1 *v2;  // [bp-0x60]
    char v3;  // [bp-0x58], Other Possible Types: long long
    long long v4;  // [bp-0x50]
    uint128_t *v5;  // [bp-0x48], Other Possible Types: long long, uint128_t
    uint128_t *v6;  // [bp-0x40]
    st_22564_1 **v7;  // [bp-0x30], Other Possible Types: char
    st_22564_1 *v8;  // [bp-0x28]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v11 = a0->field_8;
    if (a0->field_10 <= v11)
    {
        v2 = &v1;
        v1 = &v2;
        v13 = sub_19300(a0, ((char *)v11 - a0->field_0 >> 5) + 1);
        sub_12854(&v3, v13, (char *)a0->field_8 - a0->field_0 >> 5, a0);
        v14 = a1[1];
        *v5 = *a1;
        v5[1] = v14;
        v5 = _INSERT(CONCAT(v5, 0), 0, v5 + 2);
        v8 = &v7;
        v7 = &v8;
        n = (char *)a0->field_8 - a0->field_0;
        v16 = v4 - n;
        _memcpy(v16, a0->field_0, n);
        v17 = a0->field_0;
        a0->field_0 = v16;
        v18 = a0->field_10;
        v0 = v5;
        *(uint128_t *)&a0->field_8 = v5;
        v5 = v17;
        v6 = v18;
        v3 = v17;
        v4 = v17;
        sub_1e69c(&v3);
        a0->field_8 = (unsigned long long)v0;
        return (unsigned long long)v0 - 32;
    }
    v12 = a1[1];
    *v11 = *a1;
    v11[1] = v12;
    a0->field_8 = v11 + 2;
    return v11;
}
