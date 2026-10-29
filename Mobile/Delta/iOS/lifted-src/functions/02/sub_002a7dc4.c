/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a7dc4..0x2a7f9c (472 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a7dc4_0 {
    char field_0;
    char padding_1[7];
    unsigned long long field_8;
} st_2a7dc4_0;

typedef struct st_2a7dc4_2 {
    char padding_0[8];
    void* field_8;
    void* field_10;
    char padding_18[16];
    unsigned long long field_28;
} st_2a7dc4_2;

typedef struct st_2a7dc4_3 {
    struct st_2a7dc4_4 *field_0;
} st_2a7dc4_3;

typedef struct st_2a7dc4_4 {
    struct st_2a7dc4_3 *field_0;
} st_2a7dc4_4;

typedef struct st_2a7dc4_1 {
    char field_0;
} st_2a7dc4_1;


int sub_2a7dc4(st_2a7dc4_2 *a0)
{
    st_2a7dc4_0 *v14;  // x8
    char v15;  // x1
    unsigned long v16;  // x9
    void* v17;  // x8
    st_2a7dc4_1 **v0;  // [bp-0xb8], Other Possible Types: char
    st_2a7dc4_1 *v1;  // [bp-0xb0]
    st_2a7dc4_4 **v2;  // [bp-0xa8]
    char v3;  // [bp-0x88], Other Possible Types: unsigned long
    uint128_t v4;  // [bp-0x80]
    unsigned long long v5;  // [bp-0x70]
    unsigned long v6;  // [bp-0x68]
    uint128_t v7;  // [bp-0x60]
    unsigned long long v8;  // [bp-0x50]
    char v9;  // [bp-0x48]
    unsigned long v10;  // [bp-0x40]
    st_2a7dc4_4 **v11;  // [bp-0x38]
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v1 = &v0;
    v0 = &v1;
    if (*(long long *)((char *)a0->field_10 - 8))
    {
        *(unsigned int *)&v6 = (unsigned int)(a0->field_10 - a0->field_8 >> 3) - 1;
        v3 = 1;
        if (!(sub_1b2e04(a0 + 2, &v6, &v3) & 1))
        {
            sub_2aff80(&v9, &a0[2].field_28);
            v14 = *(long long *)((char *)a0->field_10 - 8);
            v15 = v14->field_0;
            v14->field_0 = v9;
            v9 = v15;
            v16 = v14->field_8;
            v14->field_8 = v10;
            v10 = v16;
            sub_2a6e94(&v10, v9);
        }
    }
    sub_c84c(&a0->field_8, a0->field_10 - 8);
    a0->field_28 = a0->field_28 - 1;
    v17 = a0->field_10;
    if (a0->field_8 == v17)
    {
        return 1;
    }
    else if (!*(long long *)((char *)v17 - 8))
    {
        return 1;
    }
    else if (sub_2a572c(*(long long *)((char *)v17 - 8)))
    {
        sub_2abea8(&v6, *(long long *)((char *)a0->field_10 - 8));
        sub_2aec58(&v6);
        sub_2abea8(&v3, *(long long *)((char *)a0->field_10 - 8));
        sub_2ab824(&v3);
        v2 = &v11;
        v11 = &v2;
        if (sub_2acb58(&v6, &v3) & 1)
            return 1;
        while (*(char *)sub_2a8f18(&v6) != 9)
        {
            sub_2abe2c(&v6);
            sub_2abea8(&v3, *(long long *)((char *)a0->field_10 - 8));
            sub_2ab824(&v3);
            v2 = &v11;
            v11 = &v2;
            if (sub_2acb58(&v6, &v3))
                return 1;
        }
        v3 = v6;
        v4 = v7;
        v5 = v8;
        sub_2a79c8(*(long long *)((char *)a0->field_10 - 8), &v3);
        return 1;
    }
    else
    {
        return 1;
    }
}
