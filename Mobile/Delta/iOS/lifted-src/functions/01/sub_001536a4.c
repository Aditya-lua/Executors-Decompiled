/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1536a4..0x1537b4 (272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1536a4_1 {
    struct st_1536a4_2 *field_0;
    struct st_1536a4_2 *field_8;
    struct st_1536a4_2 *field_10;
    struct st_1536a4_2 *field_18;
} st_1536a4_1;

typedef struct st_1536a4_2 {
    unsigned long long field_0;
} st_1536a4_2;

typedef struct st_1536a4_0 {
    char field_0;
} st_1536a4_0;


st_1536a4_1 * sub_1536a4(st_1536a4_1 *a0, unsigned long long *a1)
{
    unsigned long long *iter;  // x21
    st_1536a4_1 *v8;  // x0
    unsigned long long *v9;  // x8
    unsigned long long *v10;  // x1
    unsigned long long v11;  // x22
    unsigned long long *v12;  // q2
    unsigned long long *v13;  // q3
    st_1536a4_1 *v14;  // x0
    st_1536a4_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_1536a4_0 *v1;  // [bp-0x68]
    st_1536a4_0 *v2;  // [bp-0x60], Other Possible Types: unsigned long long *
    unsigned long long *v3;  // [bp-0x50]
    st_1536a4_0 **v4;  // [bp-0x38], Other Possible Types: char
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    iter = a0->field_10;
    v8 = a0;
    if (iter == v8->field_18)
    {
        v9 = a0->field_0;
        v10 = a0->field_8;
        if (v10 > v9)
        {
            v11 = (((long long)(v10 - v9) >> 3) + 1 + (((long long)(v10 - v9) >> 3) + 1 >> 63) >> 1) * 8;
            v2 = &v4;
            v4 = &v2;
            v8 = sub_13bbc((char *)v10 - v11);
            iter = (char *)iter - v11;
            a0->field_8 = (char *)a0->field_8 - v11;
            a0->field_10 = iter;
        }
        else
        {
            sub_ec54();
            sub_159aa4(&v2, a0->field_8, (long long)(a0->field_10 - a0->field_8) >> 3);
            v12 = (unsigned long long *)*(int128_t *)&a0->field_0;
            v13 = (unsigned long long *)*(int128_t *)&a0->field_10;
            *(uint128_t *)&a0->field_0 = (uint128_t)v2;
            *(uint128_t *)&a0->field_10 = (uint128_t)v3;
            v2 = v12;
            v3 = v13;
            v8 = sub_1089c(&v2);
            iter = a0->field_10;
        }
    }
    v14 = v8;
    *iter = *a1;
    a0->field_10 = iter + 1;
    return v14;
}
