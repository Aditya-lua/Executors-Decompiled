/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x433fa8..0x4341ec (580 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_433fa8_1 {
    struct st_433fa8_0 *field_0;
    struct st_433fa8_0 *field_8;
} st_433fa8_1;

typedef struct st_433fa8_3 {
    struct st_433fa8_0 *field_0;
    char padding_8[504];
    char field_200;
} st_433fa8_3;

typedef struct st_433fa8_2 {
    uint128_t field_0;
    char field_10;
    char padding_11[63];
    struct st_433fa8_1 *field_50;
    char field_58;
    char field_59;
    struct st_433fa8_0 *field_5a;
    char padding_62[8];
    char field_6a;
    char padding_6b[495];
    char field_25a;
} st_433fa8_2;

typedef struct st_433fa8_0 {
    char field_0;
} st_433fa8_0;

extern unsigned long long g_e7fb18;

void sub_433fa8(st_433fa8_2 *a0, void* a1, char a2, unsigned long a3)
{
    unsigned long long v9;  // x22
    unsigned long long v10;  // x21
    unsigned int v19;  // w11
    unsigned int v20;  // w12
    unsigned int v21;  // w9
    unsigned int v22;  // w8
    unsigned int v23;  // w12
    unsigned int v24;  // w8
    unsigned int v25;  // w8
    unsigned int v26;  // w9
    char v27;  // x8
    unsigned int v28;  // w10
    unsigned long long v11;  // x20
    unsigned int v29;  // w11
    unsigned int v30;  // w12
    unsigned int v31;  // w8
    unsigned int v32;  // w9
    unsigned int v33;  // w10
    char v34;  // x8
    st_433fa8_3 *v35;  // x22
    unsigned long long v12;  // x19
    unsigned long long v13;  // x30
    st_433fa8_0 **v14;  // x0
    unsigned int v15;  // w9
    unsigned int v16;  // w8
    char v17;  // x8
    unsigned int v18;  // w10
    st_433fa8_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_433fa8_0 *v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v2 = v9;
    v3 = v10;
    v4 = v11;
    v5 = v12;
    v6 = &v8;
    v7 = v13;
    v1 = &v0;
    v0 = &v1;
    a0->field_0 = *(int128_t *)a1;
    *(unsigned long long *)a1 = 0;
    *(unsigned long long *)&a1[8] = 0;
    memset(&a0->field_10, 0, 64);
    v14 = _localeconv();
    a0->field_50 = v14;
    v15 = (char)v1;
    v16 = (char)v0;
    if (v14[1])
    {
        v17 = *(char *)v14[1];
    }
    else
    {
        v18 = v16 | v15;
        v19 = (v16 | ~v15) + v15;
        v20 = v18 + ~v19;
        v21 = (v20 ^ -v15) + ((v20 & -v15) + (v18 - v19 + (v19 - v18) * 2 & v15)) * 2;
        v22 = ((v20 | v16) ^ -(v20 & v16)) + ((v20 | v16) & -(v20 & v16)) * 2;
        v23 = v22 | v21;
        v24 = (v23 ^ -(v21 & v22)) + (v23 & -(v21 & v22)) * 2;
        v17 = (char)v24 + (char)v23 + (char)~((v22 | ~v21) + v21) + ((char)(v23 + ~((v22 | ~v21) + v21) - v24 - (v23 + ~((v22 | ~v21) + v21) | -v24)) + ((char)((v22 | ~v21) + v21 - v23) & (char)-v24)) * 2;
    }
    a0->field_58 = v17;
    v25 = (char)v1;
    v26 = (char)v0;
    if (*v14)
    {
        v27 = *(char *)*v14;
    }
    else
    {
        v28 = v26 ^ v25;
        v29 = (v28 ^ -v25) + (v26 & v25) * 2 + (v28 & -v25) * 2;
        v30 = v26 | v25;
        v31 = (v26 | ~v25) + v28;
        v32 = v30 + ~v31;
        v33 = (v29 ^ -v32) + (v32 & ~v29) * 2 + (v29 & -v32) * 2;
        v34 = v29 - (v32 + (v30 - v31 + (v31 - v30) * 2 & v29) * 2);
        v27 = ((char)v33 ^ v34) + ((char)v33 + (v34 | (char)~v33)) * 2 + 2;
    }
    *(uint128_t *)&(&a0->field_59)[1] = 0;
    v35 = &(&a0->field_59)[1];
    *((char *)v35 - 1) = v27;
    memset(&v35->padding_8[8], 0, 496);
    v35->field_200 = a2;
    (g_e7fb18 - 0x9664c400)();
}
