/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c6fbc..0x1c71b0 (500 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c6fbc_3 {
    char padding_0[56];
    char field_38;
    char padding_39[79];
    unsigned long long field_88;
    uint128_t field_90;
    uint128_t field_a0;
    unsigned long long field_b0;
    char padding_b8[132];
    unsigned int field_13c;
    char field_140;
    char field_141;
    char padding_142[94];
    unsigned int field_1a0;
} st_1c6fbc_3;

typedef struct st_1c6fbc_2 {
    char padding_0[48];
    unsigned int field_30;
} st_1c6fbc_2;

typedef struct st_1c6fbc_1 {
    char padding_0[8];
    char field_8;
    char padding_9[23];
    unsigned int field_20;
    char padding_24[196];
    char field_e8;
    char padding_e9[7];
    char field_f0;
    char padding_f1[135];
    long long field_178;
    uint128_t field_180;
    uint128_t field_190;
    unsigned long long field_1a0;
    char padding_1a8[132];
    unsigned int field_22c;
    char field_230;
    char field_231;
    char padding_232[6];
    char field_238;
    char padding_239[39];
    char field_260;
    char padding_261[23];
    char field_278;
    char padding_279[23];
    unsigned int field_290;
} st_1c6fbc_1;

typedef struct st_1c6fbc_0 {
    char field_0;
} st_1c6fbc_0;

extern char g_10002b0;

unsigned long long sub_1c6fbc(st_1c6fbc_1 *a0, unsigned long long a1)
{
    unsigned long v15;  // x21
    unsigned long long v16;  // 4118
    unsigned long long v17;  // x0
    char *v18;  // x0
    st_1c6fbc_3 *v19;  // x0
    long long v20;  // x0
    long long v21;  // x0
    uint128_t v0;  // [bp-0xe0]
    unsigned long v1;  // [bp-0xd0]
    st_1c6fbc_2 *v2;  // [bp-0xc8]
    unsigned long long v3;  // [bp-0xc0]
    st_1c6fbc_0 **v4;  // [bp-0xb8], Other Possible Types: char
    st_1c6fbc_0 *v5;  // [bp-0xb0]
    st_1c6fbc_0 *v6;  // [bp-0xa8], Other Possible Types: unsigned long
    unsigned long v7;  // [bp-0xa0]
    unsigned long v8;  // [bp-0x98]
    st_1c6fbc_0 **v9;  // [bp-0x90], Other Possible Types: char
    char v10;  // [bp-0x88]
    char v11;  // [bp-0x68]
    unsigned long v12;  // [bp-0x48]
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    v12 = *(long long *)&g_10002b0;
    v5 = &v4;
    v4 = &v5;
    v6 = &v9;
    v9 = &v6;
    if (sub_6b08(&a0->field_278) && !(v15 = a0->field_290, v16 = arm64g_calculate_condition(1, v15 & 0xffffffff, 1, 0), v16 & 1))
    {
        v6 = 0;
        v7 = 0;
        v8 = 0;
        sub_1e524(&v11, &a0->field_238);
        v2 = &a0->field_260;
        v3 = a1;
        v1 = a0->field_1a0;
        v0 = a0->field_190;
        v17 = sub_1b5730(&a0->field_278, &v6, v15, a0->field_22c, a0->field_230, a0->field_231, &v11, a0->field_178, a0->field_180);
        v18 = &v11;
    }
    else
    {
        v6 = 0;
        v7 = 0;
        v8 = 0;
        v19 = sub_71aac(&a0->field_e8, &a0->field_8);
        if (&a0->field_f0 != v19)
            v6 = v19 + 56;
        sub_1e524(&v10, &a0->field_238);
        v2 = &a0->field_260;
        v3 = a1;
        v1 = a0->field_1a0;
        v0 = a0->field_190;
        v17 = sub_1b5730(&a0->field_8, &v6, a0->field_20, a0->field_22c, a0->field_230, a0->field_231, &v10, a0->field_178, a0->field_180);
        v18 = &v10;
    }
    sub_181a8(v18);
    if (*(long long *)&g_10002b0 == v12)
        return v17;
    v20 = ___stack_chk_fail();
    sub_181a8(&v11);
    v21 = __Unwind_Resume(v20);
    __Unwind_Resume(v21);
}
