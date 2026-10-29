/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4047c8..0x404a5c (660 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4047c8_1 {
    long long field_0;
    struct st_4047c8_2 *field_8;
    struct st_4047c8_2 *field_10;
} st_4047c8_1;

typedef struct st_4047c8_2 {
    unsigned long long field_0;
} st_4047c8_2;

typedef struct st_4047c8_0 {
    char field_0;
} st_4047c8_0;


unsigned long long * sub_4047c8(st_4047c8_1 *a0, unsigned long long *ptr, unsigned long long *a2)
{
    unsigned long long *v11;  // x2
    long long v12;  // x9
    st_4047c8_0 **v21;  // x10
    unsigned long long v22;  // x11
    unsigned long long v23;  // x9
    unsigned long long *v24;  // x8
    long long v25;  // x1
    long long v26;  // x8
    unsigned long v27;  // x9
    long long v28;  // x21
    long long v29;  // x8
    unsigned long long *v30;  // x9
    long long v13;  // x8
    st_4047c8_0 **v14;  // x9
    unsigned long long v15;  // x10
    unsigned long long v16;  // x10
    unsigned long long v17;  // x9
    unsigned long long v18;  // x8
    long long v19;  // x0
    st_4047c8_0 *v20;  // x9
    st_4047c8_0 **v0;  // [bp-0x78], Other Possible Types: char, unsigned long long
    st_4047c8_0 *v1;  // [bp-0x70], Other Possible Types: unsigned long long
    char v2;  // [bp-0x68], Other Possible Types: long long
    unsigned long long *v3;  // [bp-0x60]
    long long v4;  // [bp-0x60]
    unsigned long long *v5;  // [bp-0x58], Other Possible Types: long long
    unsigned long long *v6;  // [bp-0x50]
    st_4047c8_0 **v7;  // [bp-0x40], Other Possible Types: char
    st_4047c8_0 *v8;  // [bp-0x38]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v1 = &v0;
    v0 = &v1;
    v11 = a0->field_8;
    if (a0->field_10 <= v11)
    {
        v12 = -a0->field_0;
        v13 = (char *)v11 + a0->field_0 + 0x2 * v11 + 2 * (v12 | ~v11) + 2 * (v12 & ~v11);
        v14 = v0;
        v15 = ~(unsigned int)v14 | 0xffffffffffffffae;
        v16 = ((char *)v14 + v15 + 82 ^ -(v14 & 81)) + ((char *)v14 + v15 + 82 & -(v14 & 81)) * 2;
        v17 = ((v16 ^ -v14) + (v14 & ~v16 | v16 & -v14) * 2 | 1) + ~((v16 ^ -v14) + (v14 & ~v16 | v16 & -v14) * 2 | 1) * 2;
        v18 = ((v17 ^ ~(v17 + 2)) + (v17 + 1 & ~v17) * 2 + 1 ^ v13 + 2 >> 3) + ((v17 ^ ~(v17 + 2)) + (v17 + 1 & ~v17) * 2 + 1 & v13 + 2 >> 3) * 2;
        v19 = sub_41d56c(a0, ~v18 + v18 * 2);
        v20 = v1;
        v21 = v0;
        v22 = (v20 ^ -v21) + (v20 & -v21 | v21 & ~v20) * 2;
        v23 = (v22 ^ -(v21 ^ v20)) + (v22 - ((v21 ^ v20) + (v22 | -(v21 ^ v20)))) * 2;
        v0 = v23 + 3;
        v1 = v23 + 5;
        sub_ec54(&v2, v19, ((char *)ptr + a0->field_0 + 2 * ~a0->field_0 + 2) / ((v1 + 1 ^ v0) + (v1 + 1 & v0) * 2 - 1), a0);
        sub_49a218(&v2, a2);
        v8 = &v7;
        v7 = &v8;
        v24 = a0->field_8;
        _memcpy(v5, ptr, (v24 ^ -ptr) + ((char *)v24 + (-ptr | ~v24)) * 2 + 2);
        v25 = a0->field_0;
        v5 = (unsigned long long *)_INSERT(CONCAT(v5, 0), 0, v5 + a0->field_8 - ptr);
        a0->field_8 = ptr;
        v26 = -v25;
        v27 = v26 ^ ptr;
        v28 = (char *)v3 - v27 + -0x2 * ptr + 2 * v25 + 2 * (v26 | ptr);
        _memcpy(v28, v25, v27 + ((char *)ptr + (v26 | ~ptr)) * 2 + 2);
        v29 = a0->field_0;
        a0->field_0 = v28;
        v30 = a0->field_10;
        *(uint128_t *)&a0->field_8 = (uint128_t)v5;
        v5 = v29;
        v6 = v30;
        v2 = v29;
        v4 = v29;
        sub_3db3b4(&v2);
        return v3;
    }
    else if (ptr != v11)
    {
        sub_429728(a0, ptr);
        *ptr = *a2;
        return ptr;
    }
    else
    {
        *v11 = *a2;
        a0->field_8 = v11 + 1;
        return ptr;
    }
}
