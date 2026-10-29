/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x30594..0x3069c (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_30594_0 {
    long long field_0;
    struct st_30594_1 *field_8;
    struct st_30594_1 *field_10;
} st_30594_0;

typedef struct st_30594_1 {
    char field_0;
} st_30594_1;


long long sub_30594(st_30594_0 *a0, char *a1)
{
    char *v11;  // x8
    long long v12;  // x0
    long long v13;  // x1
    long long v14;  // x20
    long long v15;  // x8
    char *v16;  // x9
    uint128_t v0;  // [bp-0x80]
    st_30594_1 **v1;  // [bp-0x68], Other Possible Types: char
    st_30594_1 *v2;  // [bp-0x60]
    char v3;  // [bp-0x58], Other Possible Types: long long
    long long v4;  // [bp-0x50], Other Possible Types: unsigned long
    char *v5;  // [bp-0x48], Other Possible Types: long long, uint128_t
    char *v6;  // [bp-0x40]
    st_30594_1 **v7;  // [bp-0x30], Other Possible Types: char
    st_30594_1 *v8;  // [bp-0x28]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v11 = a0->field_8;
    if (a0->field_10 <= v11)
    {
        v2 = &v1;
        v1 = &v2;
        v12 = sub_29ccc(a0, &v11[-1 * a0->field_0 + 1]);
        sub_30f60(&v3, v12, &a0->field_8[-1 * a0->field_0], a0);
        *v5 = *a1;
        v5 = _INSERT(CONCAT(v5, 0), 0, v5 + 1);
        v8 = &v7;
        v7 = &v8;
        v13 = a0->field_0;
        v14 = v4 + v13 - (char *)a0->field_8;
        _memcpy(v14, v13, &a0->field_8[-1 * v13]);
        v15 = a0->field_0;
        a0->field_0 = v14;
        v16 = a0->field_10;
        v0 = v5;
        *(uint128_t *)&a0->field_8 = v5;
        v5 = v15;
        v6 = v16;
        v3 = v15;
        v4 = v15;
        sub_2f3b0(&v3);
        a0->field_8 = (unsigned long long)v0;
        return (unsigned long long)v0 - 1;
    }
    *v11 = *a1;
    a0->field_8 = v11 + 1;
    return v11;
}
