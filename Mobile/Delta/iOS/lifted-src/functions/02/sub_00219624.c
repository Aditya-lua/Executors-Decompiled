/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x219624..0x219758 (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_219624_0 {
    long long field_0;
    uint128_t *field_8;
    uint128_t *field_10;
} st_219624_0;

typedef struct st_219624_1 {
    char field_0;
} st_219624_1;


uint128_t * sub_219624(st_219624_0 *a0, uint128_t *a1)
{
    uint128_t *v11;  // x8
    uint128_t v12;  // q0
    long long v21;  // x20
    long long v22;  // x8
    uint128_t *v23;  // x9
    uint128_t v13;  // q1
    uint128_t v14;  // q3
    uint128_t *v15;  // x8
    long long v16;  // x0
    uint128_t v17;  // q1
    uint128_t v18;  // q3
    uint128_t v19;  // q2
    long long n;  // x2
    uint128_t v0;  // [bp-0x90]
    st_219624_1 **v1;  // [bp-0x78], Other Possible Types: char
    st_219624_1 *v2;  // [bp-0x70]
    char v3;  // [bp-0x68], Other Possible Types: long long
    long long v4;  // [bp-0x60]
    uint128_t *idx;  // [bp-0x58], Other Possible Types: long long, uint128_t
    uint128_t *v6;  // [bp-0x50]
    st_219624_1 **v7;  // [bp-0x40], Other Possible Types: char
    st_219624_1 *v8;  // [bp-0x38]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v11 = a0->field_8;
    if (a0->field_10 > v11)
    {
        *v11 = *a1;
        v12 = a1[1];
        v13 = a1[2];
        v14 = a1[4];
        v11[3] = a1[3];
        v11[4] = v14;
        v11[1] = v12;
        v11[2] = v13;
        v15 = v11 + 5;
    }
    else
    {
        v2 = &v1;
        v1 = &v2;
        v16 = sub_218fc(a0, 1 + 14757395258967641293 * ((char *)v11 - a0->field_0 >> 4));
        sub_13b40(&v3, v16, 14757395258967641293 * ((char *)a0->field_8 - a0->field_0 >> 4), a0);
        *idx = *a1;
        v17 = a1[4];
        v18 = a1[1];
        v19 = a1[2];
        idx[3] = a1[3];
        idx[4] = v17;
        idx[1] = v18;
        idx[2] = v19;
        idx = _INSERT(CONCAT(idx, 0), 0, idx + 5);
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
        sub_219260(&v3);
        v15 = (unsigned long long)v0;
    }
    a0->field_8 = v15;
    return (char *)v15 - 80;
}
