/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8b232c..0x8b24b4 (392 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8b232c_1 {
    struct st_8b232c_2 *field_0;
    struct st_8b232c_2 *field_8;
    struct st_8b232c_2 *field_10;
    struct st_8b232c_2 *field_18;
} st_8b232c_1;

typedef struct st_8b232c_2 {
    unsigned long long field_0;
} st_8b232c_2;

typedef struct st_8b232c_0 {
    char field_0;
} st_8b232c_0;


st_8b232c_1 * sub_8b232c(st_8b232c_1 *a0, unsigned long long *a1)
{
    unsigned long long *v7;  // x8
    st_8b232c_1 *v8;  // x0
    unsigned long long *v17;  // q2
    unsigned long long *v18;  // q3
    st_8b232c_1 *v19;  // x0
    unsigned long long *v9;  // x9
    unsigned long long *v10;  // x1
    long long v11;  // x9
    unsigned long long v12;  // x22
    long long v13;  // x20
    unsigned long long v14;  // x8
    unsigned long long *v15;  // x8
    unsigned long long *v16;  // x9
    st_8b232c_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_8b232c_0 *v1;  // [bp-0x78]
    st_8b232c_0 *v2;  // [bp-0x70], Other Possible Types: unsigned long long *
    unsigned long long *v3;  // [bp-0x60]
    st_8b232c_0 **v4;  // [bp-0x48], Other Possible Types: char
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    v7 = a0->field_10;
    v8 = a0;
    if (v7 == v8->field_18)
    {
        v9 = a0->field_0;
        v10 = a0->field_8;
        if (v10 > v9)
        {
            v11 = (long long)(v9 + v10 + (-v9 & ~v10) * 2 + ((char *)v10 + (-v9 | ~v10)) * 2 + 2) >> 3;
            v12 = ((unsigned long long)(v11 + 1 + ((unsigned long long)(v11 + 1) >> 63)) >> 1) * 8;
            v13 = (char *)v10 - v12;
            v2 = &v4;
            v4 = &v2;
            v8 = sub_13bbc(v13);
            v14 = v13 + v7 + v10 + ~v10 * 2 + 2;
            v7 = v13 * 2 + v14 + (-v13 & ~v14) * 2 + (v14 + (-v13 | ~v14)) * 2 + 2;
            a0->field_8 = (char *)a0->field_8 - v12;
            a0->field_10 = v7;
        }
        else
        {
            sub_ec54();
            v15 = a0->field_10;
            v16 = -a0->field_8;
            sub_159aa4(&v2, a0->field_8, (long long)((v15 ^ v16) + ((char *)v15 + (v16 | ~v15)) * 2 + 2) >> 3);
            v17 = (unsigned long long *)*(int128_t *)&a0->field_0;
            v18 = (unsigned long long *)*(int128_t *)&a0->field_10;
            *(uint128_t *)&a0->field_0 = (uint128_t)v2;
            *(uint128_t *)&a0->field_10 = (uint128_t)v3;
            v2 = v17;
            v3 = v18;
            v8 = sub_1089c(&v2);
            v7 = a0->field_10;
        }
    }
    v19 = v8;
    *v7 = *a1;
    a0->field_10 = a0->field_10 + 1;
    return v19;
}
