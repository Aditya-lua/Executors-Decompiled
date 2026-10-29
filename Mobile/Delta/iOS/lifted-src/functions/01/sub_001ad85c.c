/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ad85c..0x1ad980 (292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ad85c_2 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
} st_1ad85c_2;

typedef struct st_1ad85c_0 {
    char padding_0[392];
    uint128_t field_188;
    uint128_t field_198;
    unsigned long long field_1a8;
} st_1ad85c_0;

typedef struct st_1ad85c_1 {
    char field_0;
} st_1ad85c_1;

extern char g_e70038;
extern char g_10002b0;

unsigned long long sub_1ad85c(st_1ad85c_0 *a0, unsigned int *a1, unsigned long long a2, long long a3)
{
    st_1ad85c_2 *v18;  // x8
    unsigned long long v19;  // x0
    long long v20;  // x0
    long long v21;  // x0
    uint128_t v0;  // [bp-0x100]
    uint128_t v1;  // [bp-0xf0]
    unsigned long v2;  // [bp-0xd8]
    unsigned int v3;  // [bp-0xd0]
    uint128_t v4;  // [bp-0xc8]
    uint128_t v5;  // [bp-0xb8]
    unsigned long v6;  // [bp-0xa8]
    unsigned long long v7;  // [bp-0xa0]
    char v8;  // [bp-0x98]
    unsigned long v9;  // [bp-0x80]
    unsigned long v10;  // [bp-0x78]
    st_1ad85c_1 **v11;  // [bp-0x70], Other Possible Types: char
    char v12;  // [bp-0x61]
    st_1ad85c_1 *v13;  // [bp-0x60], Other Possible Types: char *
    char v14;  // [bp-0x58]
    unsigned long v15;  // [bp-0x38]
    char *v16;  // [bp-0x10]
    char v17;  // [bp+0x0]

    v16 = &v17;
    v15 = *(long long *)&g_10002b0;
    v18 = (a0->padding_0)[1];
    v0 = v18->field_10;
    v1 = v18->field_0;
    sub_1a4b00(&v14, a3);
    v13 = &v11;
    v11 = &v13;
    v2 = &g_e70038;
    v3 = *a1;
    v5 = v0;
    v4 = v1;
    v6 = *(long long *)((char *)&a0->field_198 + 8);
    v7 = a2;
    v12 = 0;
    sub_1bc374(&v8, 0x1000, &v12);
    v9 = 0;
    v10 = 0;
    v19 = sub_6b0cc(&v14, &v2);
    v13 = &v8;
    sub_d18e4(&v13);
    sub_181a8(&v14);
    if (*(long long *)&g_10002b0 == v15)
        return v19;
    v20 = ___stack_chk_fail();
    v13 = &v8;
    sub_d18e4(&v13);
    sub_181a8(&v14);
    v21 = __Unwind_Resume(v20);
    sub_181a8(&v14);
    __Unwind_Resume(v21);
}
