/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb83dbc..0xb83f40 (388 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b83dbc_0 {
    unsigned long long field_0;
    char field_8;
    char padding_9[79];
    unsigned long long field_58;
    char field_60;
    char padding_61[79];
    unsigned long long field_b0;
} st_b83dbc_0;


double sub_b83dbc(long long a0, st_b83dbc_0 *a1)
{
    unsigned long long *ptr;  // x0
    unsigned long long *v16;  // x21
    unsigned long long *v17;  // x23
    unsigned long long *v18;  // x8
    unsigned long long *ptr1;  // x0
    unsigned long long *ptr2;  // x0
    unsigned long long *v21;  // x8
    unsigned long long *v0;  // [bp-0xe8]
    uint128_t v1;  // [bp-0xe0]
    uint128_t v2;  // [bp-0xd0]
    uint128_t v3;  // [bp-0xc0]
    uint128_t v4;  // [bp-0xb0]
    unsigned long long *v5;  // [bp-0xa0]
    unsigned long long *v6;  // [bp-0x98]
    unsigned long long *v7;  // [bp-0x90]
    unsigned long long *v8;  // [bp-0x88]
    uint128_t v9;  // [bp-0x80]
    uint128_t v10;  // [bp-0x70]
    uint128_t v11;  // [bp-0x60]
    uint128_t v12;  // [bp-0x50]
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    if (a1->field_0 == 0x8000000000000000)
    {
        ptr = _malloc(8);
        if (!ptr)
        {
            sub_c6ba70(8, 8);
            sub_c6ba70(8, 8);
            __debugbreak();
        }
        v16 = ptr;
        *ptr = &a1->field_8;
        v17 = 1;
        if (a1->field_58 == 0x8000000000000000)
            goto LABEL_b83e34;
LABEL_b83e14:
        v18 = 0;
        ptr1 = 8;
    }
    else
    {
        v17 = 0;
        v16 = 8;
        if (a1->field_58 != 0x8000000000000000)
            goto LABEL_b83e14;
LABEL_b83e34:
        ptr1 = _malloc(8);
        if (!ptr1)
        {
            sub_c6ba70(8, 8);
            __debugbreak();
        }
        *ptr1 = &a1->field_60;
        v18 = 1;
    }
    v9 = CONCAT(v16, v16);
    v10 = CONCAT((char *)v16 + 0x8 * v17, v17);
    v11 = CONCAT(ptr1, ptr1);
    v12 = CONCAT((char *)ptr1 + 0x8 * v18, v18);
    if (a1->field_b0 == 0x8000000000000000)
    {
        ptr2 = _malloc(8);
        if (!ptr2)
        {
            sub_c6ba70(8, 8);
            __debugbreak();
        }
        *ptr2 = a1 + 1;
        v21 = 1;
    }
    else
    {
        v21 = 0;
        ptr2 = 8;
    }
    v1 = v9;
    v2 = v10;
    v3 = v11;
    v4 = v12;
    v0 = 1;
    v5 = ptr2;
    v6 = ptr2;
    v7 = v21;
    v8 = (char *)ptr2 + 0x8 * v21;
    sub_b76eb4(a0, &v0);
    return (unsigned long long)v11;
}
