/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x148088..0x14882c (1956 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_148088_5 {
    unsigned long long field_0;
} st_148088_5;

typedef struct st_148088_4 {
    char padding_0[88];
    struct st_148088_5 *field_58;
} st_148088_4;

typedef struct st_148088_1 {
    unsigned long long field_0;
    char padding_8[16];
    unsigned long long field_18;
    char field_20;
    char padding_21[55];
    unsigned long long field_58;
} st_148088_1;

typedef struct st_148088_0 {
    char field_0;
} st_148088_0;

typedef struct st_148088_2 {
    char padding_0[257];
    char field_101;
} st_148088_2;

typedef struct st_148088_6 {
    char padding_0[16];
    struct st_148088_5 *field_10;
} st_148088_6;

typedef struct st_148088_3 {
    char padding_0[96];
    struct st_148088_2 *field_60;
} st_148088_3;

extern char g_e6f3d0;
extern char g_f02cb2;
extern st_148088_3 *g_f0d198;
extern st_148088_6 *g_f0d3d8;
extern char g_10002b0;

long long sub_148088(st_148088_4 *a0)
{
    unsigned long long t;  // x0
    st_148088_1 *v13;  // x0
    st_148088_1 *v14;  // x8
    unsigned long long *v15;  // x8
    long long v16;  // x0
    st_148088_0 **v0;  // [bp-0xd8], Other Possible Types: char
    st_148088_0 *v1;  // [bp-0xd0]
    st_148088_1 *v2;  // [bp-0xc8]
    st_148088_1 *v3;  // [bp-0xc0]
    st_148088_0 **v4;  // [bp-0xb8], Other Possible Types: char
    st_148088_0 *v5;  // [bp-0xb0]
    char v6;  // [bp-0x80]
    long long v7;  // [bp-0x78]
    st_148088_1 *v8;  // [bp-0x70], Other Possible Types: char
    unsigned long v9;  // [bp-0x68]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v9 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    t = std::__1::chrono::system_clock::now();
    v7 = 1;
    v13 = sub_149b1c(&v6, 1);
    v8 = v13;
    v8->field_0 = &g_e6f3d0;
    *(unsigned long long *)&v8->padding_8[0] = 0;
    *(unsigned long long *)&v8->padding_8[8] = 0;
    v8->field_18 = 850045863;
    memset(&v8->field_20, 0, 56);
    v13->field_58 = 1000 * t;
    v14 = v8;
    v8 = 0;
    v2 = &v14->field_18;
    v3 = v14;
    sub_60c14(&v6);
    v5 = &v4;
    v4 = &v5;
    if (g_f0d198->field_60->field_101 >> 2 & 1 && sub_149164(a0))
    {
        v15 = a0->field_58;
        *v15 = &g_f02cb2;
        *(double *)&v15[1] = 4.243991582e-314;
        a0->field_58 = a0->field_58 + 2;
        g_f0d3d8->field_10();
    }
    sub_60b78(&v2);
    if (*(long long *)&g_10002b0 == v9)
        return 1;
    v16 = __Unwind_Resume(___stack_chk_fail());
    sub_60b78(&v2);
    __Unwind_Resume(v16);
}
