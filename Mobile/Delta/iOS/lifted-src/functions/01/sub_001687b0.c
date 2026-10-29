/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1687b0..0x168f64 (1972 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1687b0_5 {
    unsigned long long field_0;
} st_1687b0_5;

typedef struct st_1687b0_1 {
    unsigned long long field_0;
    char padding_8[16];
    unsigned long long field_18;
    char padding_20[57];
    unsigned short field_59;
} st_1687b0_1;

typedef struct st_1687b0_4 {
    char padding_0[88];
    struct st_1687b0_5 *field_58;
} st_1687b0_4;

typedef struct st_1687b0_0 {
    char field_0;
} st_1687b0_0;

typedef struct st_1687b0_2 {
    char padding_0[257];
    char field_101;
} st_1687b0_2;

typedef struct st_1687b0_6 {
    char padding_0[16];
    struct st_1687b0_5 *field_10;
} st_1687b0_6;

typedef struct st_1687b0_3 {
    char padding_0[96];
    struct st_1687b0_2 *field_60;
} st_1687b0_3;

extern char g_e6dc30;
extern char g_f02382;
extern st_1687b0_3 *g_f0d198;
extern st_1687b0_6 *g_f0d3d8;
extern char g_10002b0;

long long sub_1687b0(st_1687b0_4 *a0)
{
    st_1687b0_1 *v12;  // x8
    unsigned long long *v13;  // x8
    long long v14;  // x0
    st_1687b0_0 **v0;  // [bp-0xd8], Other Possible Types: char
    st_1687b0_0 *v1;  // [bp-0xd0]
    st_1687b0_1 *v2;  // [bp-0xc8]
    st_1687b0_1 *v3;  // [bp-0xc0]
    st_1687b0_0 **v4;  // [bp-0xb8], Other Possible Types: char
    st_1687b0_0 *v5;  // [bp-0xb0]
    char v6;  // [bp-0x80]
    long long v7;  // [bp-0x78]
    st_1687b0_1 *v8;  // [bp-0x70], Other Possible Types: char
    unsigned long v9;  // [bp-0x68]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v9 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v7 = 1;
    v8 = sub_e3cdc(&v6, 1);
    v8->field_0 = &g_e6dc30;
    *(unsigned long long *)&v8->padding_8[0] = 0;
    *(unsigned long long *)&v8->padding_8[8] = 0;
    v8->field_18 = 850045863;
    *(uint128_t *)&v8->padding_20[0] = 0;
    *(uint128_t *)&v8->padding_20[16] = 0;
    *(uint128_t *)&v8->padding_20[32] = 0;
    *(uint128_t *)&v8->padding_20[41] = 0;
    *(unsigned short *)&(v8->padding_20)[1] = 0x101;
    *((char *)&v8->field_59 + 1) = 0;
    memset((char *)&v8[1].field_0 + 4, 0, 48);
    v12 = v8;
    v8 = 0;
    v2 = &v12->field_18;
    v3 = v12;
    sub_60c14(&v6);
    v5 = &v4;
    v4 = &v5;
    if (g_f0d198->field_60->field_101 >> 2 & 1 && sub_e3ad4(a0))
    {
        v13 = a0->field_58;
        *v13 = &g_f02382;
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
