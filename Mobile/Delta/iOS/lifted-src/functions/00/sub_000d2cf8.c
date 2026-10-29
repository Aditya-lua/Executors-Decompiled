/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xd2cf8..0xd4f60 (8808 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_d2cf8_3 {
    unsigned long long field_0;
} st_d2cf8_3;

typedef struct st_d2cf8_2 {
    char padding_0[72];
    unsigned long long field_48;
    struct st_d2cf8_1 *field_50;
    struct st_d2cf8_3 *field_58;
} st_d2cf8_2;

typedef struct st_d2cf8_1 {
    char padding_0[96];
    unsigned long long field_60;
} st_d2cf8_1;

typedef struct st_d2cf8_4 {
    unsigned long long field_0;
    char padding_8[16];
    unsigned long long field_18;
    char field_20;
    char padding_21[55];
    unsigned long long field_58;
    struct st_d2cf8_2 *field_60;
    char field_68;
} st_d2cf8_4;

typedef struct st_d2cf8_0 {
    char field_0;
} st_d2cf8_0;

typedef struct st_d2cf8_5 {
    char padding_0[80];
    struct st_d2cf8_1 *field_50;
} st_d2cf8_5;

typedef struct st_d2cf8_6 {
    char padding_0[257];
    char field_101;
    char padding_102[1118];
    struct st_d2cf8_5 *field_560;
} st_d2cf8_6;

typedef struct st_d2cf8_8 {
    char padding_0[16];
    struct st_d2cf8_3 *field_10;
    char padding_18[352];
    struct st_d2cf8_3 *field_178;
} st_d2cf8_8;

typedef struct st_d2cf8_7 {
    char padding_0[96];
    struct st_d2cf8_6 *field_60;
} st_d2cf8_7;

extern char g_e6dbc0;
extern char g_f013fa;
extern st_d2cf8_7 *g_f0d198;
extern st_d2cf8_8 *g_f0d3d8;
extern char g_10002b0;

long long sub_d2cf8(st_d2cf8_2 *a0)
{
    unsigned long long v12;  // x8
    unsigned long long *v13;  // x8
    long long v14;  // x0
    long long v15;  // x0
    long long v16;  // x0
    long long v17;  // x0
    long long v18;  // x0
    st_d2cf8_0 **v0;  // [bp-0xe0], Other Possible Types: char
    st_d2cf8_0 *v1;  // [bp-0xd8]
    st_d2cf8_0 **v2;  // [bp-0xc8], Other Possible Types: char, unsigned long long
    unsigned long long v3;  // [bp-0xc0]
    st_d2cf8_0 **v4;  // [bp-0xb8], Other Possible Types: char
    st_d2cf8_0 *v5;  // [bp-0xb0]
    st_d2cf8_0 *v6;  // [bp-0x80]
    long long v7;  // [bp-0x78]
    st_d2cf8_4 *v8;  // [bp-0x70], Other Possible Types: unsigned long long
    unsigned long v9;  // [bp-0x68]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v9 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    if ((char *)a0->field_58 - a0->field_48 & 0xffffffff0)
    {
        v6 = &v2;
        v2 = &v6;
        g_f0d3d8->field_178();
    }
    v7 = 1;
    v8 = sub_e04cc(&v6, 1);
    v8->field_0 = &g_e6dbc0;
    *(unsigned long long *)&v8->padding_8[0] = 0;
    *(unsigned long long *)&v8->padding_8[8] = 0;
    v8->field_18 = 850045863;
    memset(&v8->field_20, 0, 56);
    v8->field_58 = a0->field_50->field_60;
    v8->field_60 = a0;
    v8->field_68 = a0->field_50 != g_f0d198->field_60->field_560->field_50;
    v12 = v8;
    v8 = 0;
    v2 = v12 + 24;
    v3 = v12;
    sub_60c14(&v6);
    v5 = &v4;
    v4 = &v5;
    if (g_f0d198->field_60->field_101 >> 2 & 1 && v2 && sub_e3044(a0))
    {
        v13 = a0->field_58;
        *v13 = &g_f013fa;
        *(double *)&v13[1] = 4.243991582e-314;
        a0->field_58 = a0->field_58 + 2;
        g_f0d3d8->field_10();
    }
    sub_60b78(&v2);
    if (*(long long *)&g_10002b0 == v9)
        return 1;
    v14 = ___stack_chk_fail();
    sub_60b78(&v2);
    v15 = __Unwind_Resume(v14);
    sub_60b78(&v6);
    v16 = __Unwind_Resume(v15);
    sub_60b78(&v2);
    v17 = __Unwind_Resume(v16);
    sub_60b78(&v2);
    v18 = __Unwind_Resume(v17);
    __Unwind_Resume(v18);
}
