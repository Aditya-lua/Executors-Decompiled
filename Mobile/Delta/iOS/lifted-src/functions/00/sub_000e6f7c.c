/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xe6f7c..0xe77f0 (2164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_e6f7c_1 {
    double field_0;
    char padding_8[4];
    unsigned int field_c;
} st_e6f7c_1;

typedef struct st_e6f7c_3 {
    unsigned long long field_0;
    char padding_8[4];
    unsigned int field_c;
} st_e6f7c_3;

typedef struct st_e6f7c_2 {
    char padding_0[88];
    struct st_e6f7c_1 *field_58;
} st_e6f7c_2;

typedef struct st_e6f7c_0 {
    char field_0;
} st_e6f7c_0;

typedef struct st_e6f7c_7 {
    unsigned long long field_0;
} st_e6f7c_7;

typedef struct st_e6f7c_4 {
    char padding_0[257];
    char field_101;
} st_e6f7c_4;

typedef struct st_e6f7c_6 {
    char padding_0[16];
    struct st_e6f7c_7 *field_10;
} st_e6f7c_6;

typedef struct st_e6f7c_5 {
    char padding_0[96];
    struct st_e6f7c_4 *field_60;
} st_e6f7c_5;

extern long long g_f013a8;
extern double g_f013fe;
extern st_e6f7c_5 *g_f0d198;
extern st_e6f7c_6 *g_f0d3d8;
extern long long g_f0dca8;
extern unsigned int g_f0dcc0;
extern char g_10002b0;

int sub_e6f7c(st_e6f7c_2 *a0)
{
    long long v14;  // x8
    uint128_t *v15;  // x19
    st_e6f7c_2 *v16;  // x8
    st_e6f7c_3 *v17;  // x9
    st_e6f7c_2 *v18;  // x19
    st_e6f7c_1 *v19;  // x8
    long long v20;  // x0
    long long v21;  // x0
    long long v22;  // x0
    long long v23;  // x0
    st_e6f7c_0 **v0;  // [bp-0xe8], Other Possible Types: char
    st_e6f7c_0 *v1;  // [bp-0xe0]
    unsigned int v2;  // [bp-0xd4]
    char v3;  // [bp-0xd0]
    long long v4;  // [bp-0xc8]
    st_e6f7c_2 *v5;  // [bp-0xc0]
    st_e6f7c_0 **v6;  // [bp-0xb8], Other Possible Types: char
    st_e6f7c_0 *v7;  // [bp-0xb0]
    uint128_t v8;  // [bp-0x80]
    uint128_t v9;  // [bp-0x80]
    char v10;  // [bp-0x70], Other Possible Types: long long
    unsigned long v11;  // [bp-0x68]
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v11 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v5 = a0;
    v9 = _INSERT(v8, 8, 1);
    v10 = sub_e078c(&v9, 1);
    sub_d4f6c(v10, &v5);
    v14 = v10;
    v10 = 0;
    v3 = v14 + 24;
    v4 = v14;
    sub_60c14(&v9);
    std::__1::mutex::lock(&g_f013a8);
    v2 = g_f0dcc0 + 1;
    v15 = sub_e6c24(&g_f0dca8, &v2);
    sub_61070(&v9, &v3);
    v8 = *v15;
    *v15 = v9;
    sub_60b78(&v8);
    std::__1::mutex::unlock(&g_f013a8);
    v16 = v5;
    v17 = v16->field_58;
    *(double *)&v17->field_0 = (double)(_mm_cvtsi128_si64(_mm_unpacklo_epi32(_mm_setzero_si128(), v2)) >> 32);
    v17->field_c = 3;
    v16->field_58 = v16->field_58 + 1;
    v18 = v5;
    v7 = &v6;
    v6 = &v7;
    if (g_f0d198->field_60->field_101 >> 2 & 1 && v3 && sub_e2318(v18))
    {
        v19 = v18->field_58;
        *(double **)&v19->field_0 = &g_f013fe;
        *(double *)v19->padding_8 = 4.243991582e-314;
        v18->field_58 = v18->field_58 + 1;
        g_f0d3d8->field_10();
    }
    sub_60b78(&v3);
    if (*(long long *)&g_10002b0 == v11)
        return 2;
    v20 = ___stack_chk_fail();
    std::__1::mutex::unlock(&g_f013a8);
    sub_60b78(&v3);
    v21 = __Unwind_Resume(v20);
    sub_60b78(&v3);
    v22 = __Unwind_Resume(v21);
    sub_60c14(&v8);
    v23 = __Unwind_Resume(__Unwind_Resume(v22));
    sub_60b78(&v3);
    __Unwind_Resume(v23);
}
