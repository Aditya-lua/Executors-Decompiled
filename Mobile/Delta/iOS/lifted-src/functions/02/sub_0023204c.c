/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x23204c..0x2327e8 (1948 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_23204c_5 {
    unsigned long long field_0;
} st_23204c_5;

typedef struct st_23204c_4 {
    char padding_0[88];
    struct st_23204c_5 *field_58;
} st_23204c_4;

typedef struct st_23204c_0 {
    char field_0;
} st_23204c_0;

typedef struct st_23204c_2 {
    char padding_0[257];
    char field_101;
} st_23204c_2;

typedef struct st_23204c_6 {
    char padding_0[16];
    struct st_23204c_5 *field_10;
} st_23204c_6;

typedef struct st_23204c_3 {
    char padding_0[96];
    struct st_23204c_2 *field_60;
} st_23204c_3;

extern char g_e79c78;
extern char g_f02cb3;
extern st_23204c_3 *g_f0d198;
extern st_23204c_6 *g_f0d3d8;
extern char g_10002b0;

long long sub_23204c(st_23204c_4 *a0)
{
    unsigned long long *v12;  // x8
    unsigned long long *v13;  // x8
    long long v14;  // x0
    st_23204c_0 **v0;  // [bp-0xd8], Other Possible Types: char
    st_23204c_0 *v1;  // [bp-0xd0]
    unsigned long long *v2;  // [bp-0xc8]
    unsigned long long *v3;  // [bp-0xc0]
    st_23204c_0 **v4;  // [bp-0xb8], Other Possible Types: char
    st_23204c_0 *v5;  // [bp-0xb0]
    char v6;  // [bp-0x80]
    long long v7;  // [bp-0x78]
    unsigned long long *v8;  // [bp-0x70], Other Possible Types: char
    unsigned long v9;  // [bp-0x68]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v9 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v7 = 1;
    v8 = sub_e04cc(&v6, 1);
    *v8 = &g_e79c78;
    v8[1] = 0;
    v8[2] = 0;
    v8[3] = 850045863;
    *(uint128_t *)&v8[4] = 0;
    *(uint128_t *)&v8[6] = 0;
    *(uint128_t *)&v8[8] = 0;
    *(uint128_t *)&v8[10] = 0;
    *(uint128_t *)((char *)&v8[11] + 1) = 0;
    v12 = v8;
    v8 = 0;
    v2 = v12 + 3;
    v3 = v12;
    sub_60c14(&v6);
    v5 = &v4;
    v4 = &v5;
    if (g_f0d198->field_60->field_101 >> 2 & 1 && sub_233450(a0))
    {
        v13 = a0->field_58;
        *v13 = &g_f02cb3;
        *(double *)&v13[1] = 4.243991582e-314;
        a0->field_58 = a0->field_58 + 2;
        g_f0d3d8->field_10();
    }
    sub_60b78(&v2);
    if (*(long long *)&g_10002b0 == v9)
        return 1;
    v14 = __Unwind_Resume(___stack_chk_fail());
    sub_60b78(&v2);
    __Unwind_Resume(v14);
}
