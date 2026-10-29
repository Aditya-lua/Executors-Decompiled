/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1678a0..0x1679ac (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1678a0_0 {
    long long field_0;
    struct st_1678a0_1 *field_8;
    struct st_1678a0_1 *field_10;
} st_1678a0_0;

typedef struct st_1678a0_1 {
    unsigned long long field_0;
} st_1678a0_1;

typedef struct st_1678a0_2 {
    char field_0;
} st_1678a0_2;


long long sub_1678a0(st_1678a0_0 *a0, unsigned long long *a1)
{
    unsigned long long *v11;  // x8
    unsigned long long v12;  // x9
    long long v13;  // x0
    unsigned long long v14;  // x8
    long long n;  // x2
    long long v16;  // x20
    long long v17;  // x8
    unsigned long long *v18;  // x9
    uint128_t v0;  // [bp-0x80]
    st_1678a0_2 **v1;  // [bp-0x68], Other Possible Types: char
    st_1678a0_2 *v2;  // [bp-0x60]
    char v3;  // [bp-0x58], Other Possible Types: long long
    long long v4;  // [bp-0x50]
    unsigned long long *v5;  // [bp-0x48], Other Possible Types: long long, uint128_t
    unsigned long long *v6;  // [bp-0x40]
    st_1678a0_2 **v7;  // [bp-0x30], Other Possible Types: char
    st_1678a0_2 *v8;  // [bp-0x28]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v11 = a0->field_8;
    if (a0->field_10 <= v11)
    {
        v2 = &v1;
        v1 = &v2;
        v13 = sub_10104(a0, ((char *)v11 - a0->field_0 >> 3) + 1);
        sub_ec54(&v3, v13, (char *)a0->field_8 - a0->field_0 >> 3, a0);
        v14 = *a1;
        *a1 = 0;
        *v5 = v14;
        v5 = _INSERT(CONCAT(v5, 0), 0, v5 + 1);
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
        sub_165390(&v3);
        a0->field_8 = (unsigned long long)v0;
        return (unsigned long long)v0 - 8;
    }
    v12 = *a1;
    *a1 = 0;
    *v11 = v12;
    a0->field_8 = v11 + 1;
    return v11;
}
