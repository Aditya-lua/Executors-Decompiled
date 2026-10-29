/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x223688..0x2237c4 (316 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_223688_3 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    unsigned long long field_50;
    char field_58;
    char padding_59[7];
    unsigned long long field_60;
    unsigned int field_68;
    char field_6c;
    char field_6d;
    char padding_6e[2];
    unsigned long long field_70;
    struct st_223688_0 *field_78;
    unsigned long long field_80;
    char field_88;
} st_223688_3;

typedef struct st_223688_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    char padding_28[8];
    unsigned long long field_30;
    char padding_38[8];
    unsigned long long field_40;
    char padding_48[8];
    unsigned long long field_50;
    char field_58;
    char padding_59[7];
    unsigned long long field_60;
    unsigned long long field_68;
    unsigned long long field_6c;
    char field_6d;
    char padding_6e[2];
    unsigned long long field_70;
    struct st_223688_0 *field_78;
    unsigned long long field_80;
    long long field_88;
} st_223688_1;

typedef struct st_223688_4 {
    struct st_223688_2 *field_0;
    struct st_223688_3 *field_8;
} st_223688_4;

typedef struct st_223688_0 {
    char padding_0[32];
    unsigned long long field_20;
} st_223688_0;

typedef struct st_223688_5 {
    char field_0;
} st_223688_5;

typedef struct st_223688_2 {
    unsigned long long field_0;
    uint128_t field_8;
    uint128_t field_18;
    uint128_t field_28;
    unsigned long long field_38;
    char padding_40[8];
    unsigned long long field_48;
    unsigned int field_50;
    char field_54;
    char field_55;
    char padding_56[2];
    unsigned long long field_58;
    struct st_223688_0 *field_60;
    unsigned long long field_68;
    char field_70;
} st_223688_2;

extern char g_e799f8;
extern char g_10002b0;

unsigned long long sub_223688(unsigned long a0, st_223688_0 **a1, char *a2)
{
    st_223688_0 *v9;  // x0
    st_223688_2 *v10;  // x21
    unsigned long v11;  // x1
    st_223688_4 *v12;  // x8
    unsigned long long v13;  // x0
    long long v14;  // x0
    long long v15;  // x0
    st_223688_5 **v0;  // [bp-0x70], Other Possible Types: char
    st_223688_5 *v1;  // [bp-0x68]
    char v2;  // [bp-0x60]
    long long v3;  // [bp-0x58]
    st_223688_1 *v4;  // [bp-0x50]
    unsigned long v5;  // [bp-0x50]
    unsigned long v6;  // [bp-0x48]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    v3 = 1;
    v4 = sub_e3cdc(&v2, 1);
    v4->field_8 = 0;
    v4->field_10 = 0;
    v4->field_0 = &g_e799f8;
    v9 = *a1;
    v4->field_18 = 850045863;
    v10 = &v4->field_18;
    v11 = *a2;
    v1 = &v0;
    v0 = &v1;
    *(uint128_t *)&(&v10->field_0)[1] = 0;
    *(uint128_t *)((char *)&v10->field_8 + 8) = 0;
    *(uint128_t *)((char *)&v10->field_18 + 8) = 0;
    *(unsigned long long *)((char *)&v10->field_28 + 8) = 0;
    *((char *)&v10->field_48 + 4) = 0;
    *(char *)&v10->field_68 = 1;
    *(unsigned long long *)v10->padding_40 = 0;
    *(unsigned int *)&v10->field_48 = 0;
    *((char *)&v10->field_48 + 5) = v11;
    *(unsigned long long *)&v10->field_50 = v9->field_20;
    v10->field_58 = v9;
    v4->field_70 = sub_22421c(v9, v11, &v10->field_38);
    v5 = 0;
    v12->field_0 = &v4->field_18;
    v12->field_8 = v4;
    v13 = sub_60c14(&v2);
    if (*(long long *)&g_10002b0 == v6)
        return v13;
    v14 = ___stack_chk_fail();
    sub_60c14(&v2);
    v15 = __Unwind_Resume(v14);
    __Unwind_Resume(v15);
}
