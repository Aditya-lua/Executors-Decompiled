/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2e8b0..0x2eac0 (528 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2e8b0_1 {
    char padding_0[16];
    struct st_2e8b0_2 *field_10;
} st_2e8b0_1;

typedef struct st_2e8b0_3 {
    struct st_2e8b0_1 *field_0;
} st_2e8b0_3;

typedef struct st_2e8b0_2 {
    unsigned long long field_0;
} st_2e8b0_2;

typedef struct st_2e8b0_5 {
    unsigned long long field_0;
    char padding_8[40];
    unsigned long long field_30;
    char padding_38[432];
    unsigned long long field_1e8;
    char padding_1f0[16];
    unsigned long long field_200;
    char padding_208[16];
    unsigned long long field_218;
    char padding_220[16];
    unsigned long long field_230;
    char padding_238[112];
    unsigned long long field_2a8;
    char padding_2b0[40];
    struct st_2e8b0_3 *field_2d8;
    char padding_2e0[104];
    struct st_2e8b0_3 *field_348;
    unsigned long long field_350;
} st_2e8b0_5;

typedef struct st_2e8b0_6 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    char padding_20[16];
    unsigned long long field_30;
    char padding_38[16];
    unsigned long long field_48;
    char padding_50[16];
    unsigned long long field_60;
    char padding_68[16];
    unsigned long long field_78;
    char padding_80[40];
    unsigned long long field_a8;
    char padding_b0[432];
    unsigned long long field_260;
    char padding_268[16];
    unsigned long long field_278;
    char padding_280[16];
    unsigned long long field_290;
    char padding_298[16];
    unsigned long long field_2a8;
    char padding_2b0[112];
    unsigned long long field_320;
    char padding_328[40];
    struct st_2e8b0_3 *field_350;
    char padding_358[104];
    struct st_2e8b0_3 *field_3c0;
    unsigned long long field_3c8;
} st_2e8b0_6;

typedef struct st_2e8b0_4 {
    struct st_2e8b0_3 *field_0;
    unsigned long long field_8;
    char padding_10[16];
    unsigned int field_20;
    char padding_24[4];
    unsigned long long field_28;
    unsigned long long field_30;
    unsigned long long field_38;
    char padding_40[8];
    unsigned long long field_48;
    char padding_50[16];
    unsigned long long field_60;
    char padding_68[16];
    unsigned long long field_78;
    char padding_80[16];
    unsigned long long field_90;
    char padding_98[16];
    unsigned long long field_a8;
    char padding_b0[40];
    unsigned long long field_d8;
    char padding_e0[24];
    char field_f8;
    char padding_f9[71];
    char field_140;
    char padding_141[295];
    char field_268;
    char padding_269[39];
    unsigned long long field_290;
    char padding_298[16];
    unsigned long long field_2a8;
    char padding_2b0[16];
    unsigned long long field_2c0;
    char padding_2c8[16];
    unsigned long long field_2d8;
    char padding_2e0[112];
    unsigned long long field_350;
    char padding_358[16];
    char field_368;
    char padding_369[23];
    struct st_2e8b0_3 *field_380;
    char padding_388[104];
    struct st_2e8b0_3 *field_3f0;
    unsigned long long field_3f8;
} st_2e8b0_4;

typedef struct st_2e8b0_0 {
    char field_0;
} st_2e8b0_0;

extern char g_f0cc78;

long long sub_2e8b0(st_2e8b0_4 *a0, char a1, char a2, long long a3, long long a4)
{
    char *v4;  // x22
    st_2e8b0_1 **v5;  // x9
    st_2e8b0_1 **v6;  // x8
    st_2e8b0_6 *v7;  // x23
    long long v8;  // x8
    st_2e8b0_5 *v9;  // x19
    st_2e8b0_0 **v0;  // [bp-0x68], Other Possible Types: char
    st_2e8b0_0 *v1;  // [bp-0x60]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0->field_8 + a0->field_20 * 0x88;
    v4[24] = a1;
    v4[26] = a2;
    sub_291e0();
    sub_2f8f4(a0);
    v5 = a0->field_3f0;
    v6 = a0->field_3f8 & 1;
    if (v6 || v5)
    {
        if (v6)
            v5 = *(long long *)(*(long long *)((char *)a0 + ((long long)(a0->field_3f8) >> 1)) + (v5 & 0xffffffff));
        v5();
    }
    else
    {
        v7 = &a0->field_30;
        v8 = a0->field_38 - a0->field_30;
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::reserve(v4, v8 * 2 - (v8 >> 2) + 32);
        if (v7->field_350)
            (*(long long *)(*(long long *)v7->field_350 + 16))();
        sub_2c2f8(a0, v4, a0->field_20, a3, a4);
        a0->field_20 = 0xffffffff;
        a0->field_28 = a0->field_28 + ((long long)(a0->field_38 - a0->field_30) >> 2);
        if (g_f0cc78 != 1)
        {
            sub_c84c(v7);
            sub_c84c(&a0->field_48, a0->field_48);
            sub_c84c(&a0->field_60, a0->field_60);
            sub_c84c(&a0->field_78, a0->field_78);
            sub_c84c(&a0->field_90, a0->field_90);
            sub_c84c(&a0->field_d8, a0->field_d8);
            v9 = &a0->field_a8;
            sub_c84c(v9, a0->field_a8);
            sub_c84c(&v9->field_1e8, v9->field_1e8);
            sub_c84c(&v9->field_200, v9->field_200);
            sub_c84c(&v9->field_218, v9->field_218);
            sub_c84c(&v9->field_230, v9->field_230);
            sub_30788(&v9->padding_38[24], 32);
            sub_3131c(&v9->padding_38[96], 32);
            sub_2d334(&v9->padding_38[392], 32);
            sub_c84c(&v9->field_2a8, v9->field_2a8);
            return sub_30d84(&v9->padding_2b0[16]);
        }
        return sub_30fd8(a0);
    }
}
