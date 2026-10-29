/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2ab0f8..0x2ab22c (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2ab0f8_1 {
    uint128_t field_0;
} st_2ab0f8_1;

typedef struct st_2ab0f8_0 {
    long long field_0;
    struct st_2ab0f8_1 *field_8;
    struct st_2ab0f8_1 *field_10;
} st_2ab0f8_0;

typedef struct st_2ab0f8_2 {
    char field_0;
} st_2ab0f8_2;


long long sub_2ab0f8(st_2ab0f8_0 *a0, void* a1)
{
    uint128_t *v11;  // x8
    long long v12;  // x0
    long long v13;  // x20
    long long v14;  // x8
    uint128_t *v15;  // x9
    uint128_t v0;  // [bp-0x80]
    st_2ab0f8_2 **v1;  // [bp-0x68], Other Possible Types: char
    st_2ab0f8_2 *v2;  // [bp-0x60]
    char v3;  // [bp-0x58], Other Possible Types: long long
    long long v4;  // [bp-0x50]
    uint128_t *v5;  // [bp-0x48], Other Possible Types: long long, uint128_t
    uint128_t *v6;  // [bp-0x40]
    st_2ab0f8_2 **v7;  // [bp-0x30], Other Possible Types: char
    st_2ab0f8_2 *v8;  // [bp-0x28]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v11 = a0->field_8;
    if (a0->field_10 <= v11)
    {
        v2 = &v1;
        v1 = &v2;
        v12 = sub_20b20(a0, ((char *)v11 - a0->field_0 >> 4) + 1);
        sub_1b298(&v3, v12, (char *)a0->field_8 - a0->field_0 >> 4, a0);
        *v5 = *(int128_t *)a1;
        *(char *)a1 = 0;
        *(unsigned long long *)&a1[8] = 0;
        v5 = _INSERT(CONCAT(v5, 0), 0, v5 + 1);
        v8 = &v7;
        v7 = &v8;
        v13 = v4 + a0->field_0 - (char *)a0->field_8;
        sub_2aa9a0(a0, a0->field_0, a0->field_8, v13);
        v14 = a0->field_0;
        a0->field_0 = v13;
        v15 = a0->field_10;
        v0 = v5;
        *(uint128_t *)&a0->field_8 = v5;
        v5 = v14;
        v6 = v15;
        v3 = v14;
        v4 = v14;
        sub_2b0718(&v3);
        a0->field_8 = (unsigned long long)v0;
        return (unsigned long long)v0 - 16;
    }
    *v11 = *(int128_t *)a1;
    *(char *)a1 = 0;
    *(unsigned long long *)&a1[8] = 0;
    a0->field_8 = v11 + 1;
    return v11;
}
