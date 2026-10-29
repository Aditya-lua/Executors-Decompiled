/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b12f4..0x1b1560 (620 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b12f4_3 {
    char padding_0[32];
    struct st_1b12f4_4 *field_20;
} st_1b12f4_3;

typedef struct st_1b12f4_4 {
    unsigned long long field_0;
} st_1b12f4_4;

typedef struct st_1b12f4_0 {
    char field_0;
} st_1b12f4_0;

typedef struct st_1b12f4_1 {
    st_1b12f4_0 field_0;
} st_1b12f4_1;

extern char g_10001c8;
extern char g_10002b0;

int sub_1b12f4(st_1b12f4_3 **a0, unsigned long a1, unsigned long a2, unsigned long long a3, unsigned int *a4)
{
    long long v28;  // x0
    long long v29;  // x0
    long long v30;  // x0
    long long v31;  // x0
    long long v32;  // x0
    st_1b12f4_0 **v0;  // [bp-0x238], Other Possible Types: char
    st_1b12f4_0 *v1;  // [bp-0x230]
    char v2;  // [bp-0x222]
    char v3;  // [bp-0x221]
    unsigned long v4;  // [bp-0x220]
    char v5;  // [bp-0x211]
    st_1b12f4_1 **v6;  // [bp-0x210], Other Possible Types: char
    char v7;  // [bp-0x208]
    char v8;  // [bp-0x1e8]
    char v9;  // [bp-0x1c8]
    char v10;  // [bp-0x1a8]
    unsigned long long v11;  // [bp-0xe8]
    char *v12;  // [bp-0xa0]
    char *v13;  // [bp-0x98]
    char *v14;  // [bp-0x90]
    unsigned long long v15;  // [bp-0x88]
    st_1b12f4_3 **v16;  // [bp-0x80]
    char *v17;  // [bp-0x78], Other Possible Types: st_1b12f4_3 **, char
    char *v18;  // [bp-0x70]
    unsigned long long v19;  // [bp-0x68]
    st_1b12f4_3 **v20;  // [bp-0x60]
    unsigned long v21;  // [bp-0x58]
    char *v22;  // [bp-0x10]
    char v23;  // [bp+0x0]

    v22 = &v23;
    v21 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v4 = 0;
    v3 = 1;
    v2 = 1;
    sub_1bdbd4(&v7);
    v12 = &v2;
    v13 = &v3;
    v14 = &v4;
    v15 = a3;
    v16 = a0;
    sub_1bcf00(sub_1b7ce0(&v17, &v12, &v6), &v7, &v6);
    sub_181a8(&v17);
    v17 = a0;
    sub_1b53b8(sub_1b5168(&v12, &v17, &v6), &v8, &v6);
    v17 = &v2;
    v18 = &v3;
    v19 = a3;
    v20 = a0;
    v6 = &v17;
    sub_608dc(sub_1a2c10(sub_181a8(&v12), &v6, &v5), &v9, &v5);
    v6 = &v17;
    sub_1a65ec(sub_1bbee8(sub_181a8(&v12), &v6, &v5), &v10, &v5);
    sub_181a8(&v12);
    if (v3 == 1)
        *a0->field_20();
    *a4 = 0;
    v11 = &g_10001c8;
    sub_181a8(&v10);
    sub_181a8(&v9);
    sub_181a8(&v8);
    sub_181a8(&v7);
    if (*(long long *)&g_10002b0 == v21)
        return v3 ^ 1;
    v28 = ___stack_chk_fail();
    sub_1a5c84(&v7);
    v29 = __Unwind_Resume(v28);
    sub_1a5c84(&v7);
    v30 = __Unwind_Resume(v29);
    sub_1a5c84(&v7);
    v31 = __Unwind_Resume(v30);
    sub_1a5c84(&v7);
    v32 = __Unwind_Resume(__Unwind_Resume(v31));
    sub_1a5c84(&v7);
    __Unwind_Resume(v32);
}
