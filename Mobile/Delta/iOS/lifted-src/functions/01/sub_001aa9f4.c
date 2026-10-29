/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1aa9f4..0x1aab44 (336 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1aa9f4_1 {
    char padding_0[8];
    long long field_8;
} st_1aa9f4_1;

typedef struct st_1aa9f4_3 {
    struct st_1aa9f4_2 *field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    float field_20;
} st_1aa9f4_3;

typedef struct st_1aa9f4_2 {
    struct st_1aa9f4_1 *field_0;
} st_1aa9f4_2;

typedef struct st_1aa9f4_0 {
    char field_0;
} st_1aa9f4_0;


unsigned int sub_1aa9f4(st_1aa9f4_3 *a0, long long a1, long long a2)
{
    unsigned long v4;  // x21
    unsigned long long v5;  // x8
    unsigned int v14;  // w0
    unsigned int v15;  // w8
    unsigned long v16;  // cc_dep1
    unsigned long v17;  // cc_dep2
    unsigned int v18;  // w8
    unsigned long long v19;  // 4113
    float v6;  // s0
    float v7;  // s1
    unsigned long long v8;  // 4171
    unsigned int v9;  // w0
    unsigned long long idx;  // x0
    unsigned int v11;  // x22
    unsigned int v12;  // x8
    unsigned int v13;  // w24
    st_1aa9f4_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1aa9f4_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0->field_8;
    if (!v4 || (v5 = a0->field_18, v6 = (float)(a0->field_18 + 1), v7 = a0->field_20 * (float)v4, v8 = arm64g_calculate_condition(80, (((((char)(CmpF(__float_as_int(v7), __float_as_int((float)(a0->field_18 + 1)))) >> 5 & 3 | v7 < (float)(a0->field_18 + 1)) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isunordered(v7, (float)(a0->field_18 + 1))) * 0x10000000, 0, 0), !(v8 & 1)))
    {
        v9 = sub_10884(v4);
        sub_1bc508();
        v4 = a0->field_8;
    }
    idx = sub_10c04(a1, v4);
    v11 = *(long long *)&a0->field_0[idx];
    if (!v11)
        return v11;
    v12 = *(long long *)v11;
    if (!*(long long *)v11)
        return v11;
    v13 = 0;
    while (sub_10c04(*(long long *)(v12 + 8), v4) == idx)
    {
        if (*(long long *)(*(long long *)v11 + 8) == a1)
        {
            v14 = sub_1b01e8(*(long long *)v11 + 16, a2);
            v15 = v13 & 1;
            v16 = v14;
            v17 = v15;
            if (v14 != v15 && !~(v13 & 1))
                return v11;
        }
        else
        {
            v18 = v13 & 1;
            v16 = 0;
            v17 = v18;
            if (0 != v18 && !~(v13 & 1))
                return v11;
        }
        v19 = arm64g_calculate_condition(3, v16, v17, 0);
        v11 = *(long long *)v11;
        v13 |= (unsigned int)!(v19 & 1);
        v12 = *(long long *)v11;
        if (!*(long long *)v11)
            return v11;
    }
    return v11;
}
