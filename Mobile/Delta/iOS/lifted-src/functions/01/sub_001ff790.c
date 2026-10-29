/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ff790..0x1ffc48 (1208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ff790_1 {
    char padding_0[64];
    struct st_1ff790_2 *field_40;
} st_1ff790_1;

typedef struct st_1ff790_2 {
    unsigned long long field_0;
} st_1ff790_2;

typedef struct st_1ff790_0 {
    char field_0;
} st_1ff790_0;


void sub_1ff790(st_1ff790_1 **a0)
{
    unsigned long long v14;  // x22
    unsigned long long v15;  // x21
    unsigned long long v16;  // x20
    unsigned long long v17;  // x19
    unsigned long long v18;  // x30
    st_1ff790_0 **v0;  // [bp-0xa0], Other Possible Types: char
    st_1ff790_0 *v1;  // [bp-0x98]
    st_1ff790_0 **v2;  // [bp-0x88], Other Possible Types: char
    st_1ff790_0 *v3;  // [bp-0x70]
    unsigned long long v4;  // [bp-0x58]
    unsigned long long v5;  // [bp-0x50]
    unsigned long long v6;  // [bp-0x48]
    unsigned long long v7;  // [bp-0x30]
    unsigned long long v8;  // [bp-0x28]
    unsigned long long v9;  // [bp-0x20]
    unsigned long long v10;  // [bp-0x18]
    char *v11;  // [bp-0x10]
    unsigned long long v12;  // [bp-0x8]
    char v13;  // [bp+0x0]

    v7 = v14;
    v8 = v15;
    v9 = v16;
    v10 = v17;
    v11 = &v13;
    v12 = v18;
    v1 = &v0;
    v0 = &v1;
    v4 = 0;
    v5 = 0;
    v6 = 0;
    v3 = &v2;
    v2 = &v3;
    *a0->field_40();
}
