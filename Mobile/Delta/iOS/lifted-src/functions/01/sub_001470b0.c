/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1470b0..0x14789c (2028 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1470b0_0 {
    char field_0;
} st_1470b0_0;

typedef struct st_1470b0_2 {
    unsigned long long field_0;
} st_1470b0_2;

typedef struct st_1470b0_1 {
    char padding_0[376];
    struct st_1470b0_2 *field_178;
} st_1470b0_1;

extern st_1470b0_1 *g_f0d3d8;
extern char g_10002b0;

void sub_1470b0(unsigned long a0)
{
    unsigned long long v16;  // d9
    unsigned long long v17;  // d8
    unsigned long long v26;  // x30
    unsigned long long v18;  // x26
    unsigned long long v19;  // x25
    unsigned long long v20;  // x24
    unsigned long long v21;  // x23
    unsigned long long v22;  // x22
    unsigned long long v23;  // x21
    unsigned long long v24;  // x20
    unsigned long long v25;  // x19
    st_1470b0_0 **v0;  // [bp-0xd8], Other Possible Types: char
    st_1470b0_0 *v1;  // [bp-0xd0]
    unsigned long v2;  // [bp-0x68]
    unsigned long long v3;  // [bp-0x60]
    unsigned long long v4;  // [bp-0x58]
    unsigned long long v5;  // [bp-0x50]
    unsigned long long v6;  // [bp-0x48]
    unsigned long long v7;  // [bp-0x40]
    unsigned long long v8;  // [bp-0x38]
    unsigned long long v9;  // [bp-0x30]
    unsigned long long v10;  // [bp-0x28]
    unsigned long long v11;  // [bp-0x20]
    unsigned long long v12;  // [bp-0x18]
    char *v13;  // [bp-0x10]
    unsigned long long v14;  // [bp-0x8]
    char v15;  // [bp+0x0]

    v3 = v16;
    v4 = v17;
    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = v25;
    v13 = &v15;
    v14 = v26;
    v2 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    g_f0d3d8->field_178();
}
