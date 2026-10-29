/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8b4b40..0x8b4d1c (476 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8b4b40_1 {
    uint128_t field_0;
} st_8b4b40_1;

typedef struct st_8b4b40_0 {
    unsigned long long field_0;
    struct st_8b4b40_1 *field_8;
    char *field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    char padding_28[8];
    unsigned int field_30;
    unsigned int field_34;
} st_8b4b40_0;

typedef struct st_8b4b40_2 {
    char field_0;
} st_8b4b40_2;


double sub_8b4b40(st_8b4b40_0 *a0, void* a1)
{
    unsigned long v4;  // x8
    unsigned long long v5;  // x9
    unsigned long long v14;  // x10
    long long idx;  // x21
    char *v16;  // x8
    unsigned int v17;  // w10
    unsigned long long v18;  // x9
    char *v19;  // x8
    char *v20;  // x8
    uint128_t *v22;  // x23
    uint128_t v23;  // q0
    unsigned long long v6;  // x9
    unsigned long long v24;  // x8
    unsigned long long v7;  // x8
    unsigned long long v8;  // x8
    unsigned long long v9;  // x10
    unsigned long long v10;  // x8
    unsigned int v11;  // w9
    unsigned long long i;  // w22
    unsigned long long v13;  // x8
    st_8b4b40_2 **v0;  // [bp-0x50], Other Possible Types: char
    st_8b4b40_2 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a0->padding_28 && !(sub_8b2d7c(a0) & 1))
        sub_e2504(a0);
    v4 = *(long long *)a1;
    v5 = v4 >> 33;
    v6 = -v5;
    v7 = ((unsigned int)v4 + ~(unsigned int)v4 * 2 + 1 & v5) + (v6 & v4);
    v8 = a0->field_0 * (0xff51afd7ed558ccd * ((v6 ^ v4) + v7 * 2) ^ 0xff51afd7ed558ccd * ((v6 ^ v4) + v7 * 2) >> 33);
    v9 = v8 + ~v8 * 2 + 1;
    v10 = (v8 ^ -(v8 >> 33)) + (v9 + (v8 & -(v8 >> 33)) + (v8 >> 33 | ~v9)) * 2 + 2;
    v11 = a0->field_30;
    i = v11 + (unsigned int)((v10 & 31) >> ((char)a0->field_34 & 63));
    v13 = (v10 >> 5) + ~(v10 >> 5) * 2;
    v14 = v13 + 1 | a0->field_20;
    idx = (v13 ^ ~v14) + (v14 & ~v13) * 2;
    v16 = a0->field_10;
    v17 = v16[idx];
    if (v17 >= i)
    {
        do
        {
            i = (i ^ v11 + 1) + (i & v11 + 1) * 2 - 1;
            idx += 1;
            v17 = v16[idx];
        } while (i <= v17);
    }
    if ((i & 0xff) + (v11 | ~(i & 0xff)) + (i & 0xff | v11) + 1 >= 0x100)
    {
        *(unsigned long long *)a0->padding_28 = 0;
        v17 = v16[idx];
    }
    if (v17)
    {
        v18 = 0;
        v19 = v16 + 1;
        do
        {
            v20 = v19;
            v18 -= 1;
            v19 = v20 + 1;
        } while (v20[idx]);
        v22 = a0->field_8;
        if (v18)
            sub_8af8ac(a0, idx - v18, idx);
    }
    else
    {
        v22 = a0->field_8;
    }
    v23 = *(int128_t *)a1;
    v22[idx] = v23;
    a0->field_10[idx] = i;
    v24 = a0->field_18;
    a0->field_18 = v24 + (v24 | 1) + (~v24 | 1) + 1;
    return *(unsigned long long *)&v23;
}
