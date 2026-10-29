/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa390..0xa494 (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a390_0 {
    long long field_0;
    struct st_a390_1 *field_8;
    struct st_a390_1 *field_10;
} st_a390_0;

typedef struct st_a390_1 {
    unsigned int field_0;
} st_a390_1;

typedef struct st_a390_2 {
    char field_0;
} st_a390_2;


long long sub_a390(st_a390_0 *a0, unsigned int *a1)
{
    unsigned int *v11;  // x8
    long long v12;  // x0
    long long n;  // x2
    long long v14;  // x20
    long long v15;  // x8
    unsigned int *v16;  // x9
    uint128_t v0;  // [bp-0x80]
    st_a390_2 **v1;  // [bp-0x68], Other Possible Types: char
    st_a390_2 *v2;  // [bp-0x60]
    char v3;  // [bp-0x58], Other Possible Types: long long
    long long v4;  // [bp-0x50]
    unsigned int *v5;  // [bp-0x48], Other Possible Types: long long, uint128_t
    unsigned int *v6;  // [bp-0x40]
    st_a390_2 **v7;  // [bp-0x30], Other Possible Types: char
    st_a390_2 *v8;  // [bp-0x28]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v11 = a0->field_8;
    if (a0->field_10 <= v11)
    {
        v2 = &v1;
        v1 = &v2;
        v12 = sub_a1b0(a0, ((char *)v11 - a0->field_0 >> 2) + 1);
        sub_a118(&v3, v12, (char *)a0->field_8 - a0->field_0 >> 2, a0);
        *v5 = *a1;
        v5 = _INSERT(CONCAT(v5, 0), 0, v5 + 1);
        v8 = &v7;
        v7 = &v8;
        n = (char *)a0->field_8 - a0->field_0;
        v14 = v4 - n;
        _memcpy(v14, a0->field_0, n);
        v15 = a0->field_0;
        a0->field_0 = v14;
        v16 = a0->field_10;
        v0 = v5;
        *(uint128_t *)&a0->field_8 = v5;
        v5 = v15;
        v6 = v16;
        v3 = v15;
        v4 = v15;
        sub_ca48(&v3);
        a0->field_8 = (unsigned long long)v0;
        return (unsigned long long)v0 - 4;
    }
    *v11 = *a1;
    a0->field_8 = v11 + 1;
    return v11;
}
