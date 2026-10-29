/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1dac8c..0x1dadb0 (292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1dac8c_4 {
    struct st_1dac8c_4 *field_0;
    char padding_8[8];
    struct st_1dac8c_4 *field_10;
    char padding_18[8];
    struct st_1dac8c_4 *field_20;
    char field_28;
    char padding_29[7];
    struct st_1dac8c_4 *field_30;
    char padding_38[4];
    struct st_1dac8c_4 *field_3c;
    char padding_44[12];
    struct st_1dac8c_4 *field_50;
    struct st_1dac8c_4 *field_58;
    long long field_60;
    struct st_1dac8c_4 *field_68;
    struct st_1dac8c_4 *field_70;
} st_1dac8c_4;

typedef struct st_1dac8c_2 {
    char padding_0[24];
    struct st_1dac8c_1 *field_18;
} st_1dac8c_2;

typedef struct st_1dac8c_1 {
    char padding_0[48];
    unsigned long long field_30;
} st_1dac8c_1;

typedef struct st_1dac8c_3 {
    char padding_0[8];
    struct st_1dac8c_2 *field_8;
    char padding_10[64];
    unsigned long long field_50;
} st_1dac8c_3;

typedef struct st_1dac8c_0 {
    char field_0;
} st_1dac8c_0;

typedef struct st_1dac8c_6 {
    unsigned long long field_0;
} st_1dac8c_6;

typedef struct st_1dac8c_5 {
    char padding_0[176];
    struct st_1dac8c_6 *field_b0;
} st_1dac8c_5;

extern long long g_f026d0;
extern st_1dac8c_5 *g_f0d3d8;
extern char g_1000188;

st_1dac8c_4 * sub_1dac8c(st_1dac8c_3 *a0, unsigned long long a1, unsigned long long a2, unsigned int a3, unsigned int *a4)
{
    st_1dac8c_4 *v8;  // x20
    st_1dac8c_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_1dac8c_0 *v1;  // [bp-0x68]
    st_1dac8c_4 *v2;  // [bp-0x60]
    unsigned long long v3;  // [bp-0x58]
    unsigned long long v4;  // [bp-0x50]
    unsigned int v5;  // [bp-0x48]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v0 = &v1;
    v8 = operatornew(120, &g_1000188);
    if (!v8)
    {
        *a4 = 4;
        return v8;
    }
    *(uint128_t *)(v8->padding_38)[1] = 0;
    *(uint128_t *)&v8->field_20 = 0;
    *(uint128_t *)&v8->field_30 = 0;
    *(uint128_t *)&v8->field_0 = 0;
    *(uint128_t *)&v8->field_10 = 0;
    *(unsigned long long *)&v8->padding_44[8] = 0;
    v8->field_50 = 0;
    *(char *)&v8->field_58 = 1;
    v8->field_60 = 0;
    *(char *)&v8->field_68 = 0;
    v8->field_0 = a0;
    v8->field_20 = a0->field_50;
    *(unsigned long long *)&v8->field_28 = a0->field_8->field_18->field_30;
    v8->field_50 = sub_60a74(&g_f026d0, 1, 0);
    v2 = v8;
    v3 = a1;
    v4 = a2;
    v5 = a3;
    g_f0d3d8->field_b0();
}
