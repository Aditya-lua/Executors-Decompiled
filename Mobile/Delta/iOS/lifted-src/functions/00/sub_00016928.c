/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x16928..0x16a40 (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_16928_0 {
    char field_0;
} st_16928_0;

typedef struct st_16928_2 {
    unsigned long long field_0;
} st_16928_2;

typedef struct st_16928_1 {
    struct st_16928_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_16928_1;

extern st_16928_1 g_e61fb8;

void sub_16928(unsigned long long *a0, int *a1)
{
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    long long v16;  // x0
    unsigned long v17;  // x8
    st_16928_0 **v0;  // [bp-0x78], Other Possible Types: char
    st_16928_0 *v1;  // [bp-0x70]
    char v2;  // [bp-0x68]
    unsigned int *v3;  // [bp-0x58]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    v4 = v11;
    v5 = v12;
    v6 = v13;
    v7 = v14;
    v8 = &v10;
    v9 = v15;
    v1 = &v0;
    v0 = &v1;
    v16 = sub_218fc();
    sub_13b40(&v2, v16, 14757395258967641293 * ((long long)(a0[1] - *a0) >> 4), a0);
    v17 = *a1;
    *v3 = v17;
    (&g_e61fb8.field_0)[v17]();
}
