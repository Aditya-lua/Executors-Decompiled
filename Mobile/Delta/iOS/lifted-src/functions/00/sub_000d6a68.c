/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xd6a68..0xd6bd0 (360 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_d6a68_1 {
    char padding_0[64];
    struct st_d6a68_2 *field_40;
} st_d6a68_1;

typedef struct st_d6a68_2 {
    unsigned long long field_0;
} st_d6a68_2;

typedef struct st_d6a68_0 {
    char field_0;
} st_d6a68_0;


void sub_d6a68(st_d6a68_1 **a0)
{
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    st_d6a68_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_d6a68_0 *v1;  // [bp-0x48]
    st_d6a68_0 **v2;  // [bp-0x40], Other Possible Types: char
    st_d6a68_0 *v3;  // [bp-0x38]
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
    v3 = &v2;
    v2 = &v3;
    *a0->field_40();
}
