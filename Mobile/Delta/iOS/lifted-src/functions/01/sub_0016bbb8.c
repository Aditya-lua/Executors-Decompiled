/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x16bbb8..0x16bd34 (380 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_16bbb8_0 {
    char field_0;
} st_16bbb8_0;

typedef struct st_16bbb8_2 {
    unsigned long long field_0;
} st_16bbb8_2;

typedef struct st_16bbb8_1 {
    char padding_0[376];
    struct st_16bbb8_2 *field_178;
} st_16bbb8_1;

extern st_16bbb8_1 *g_f0d3d8;
extern char g_10002b0;

void sub_16bbb8(unsigned long a0)
{
    unsigned long long v14;  // d9
    unsigned long long v15;  // d8
    unsigned long long v16;  // x24
    unsigned long long v17;  // x23
    unsigned long long v18;  // x22
    unsigned long long v19;  // x21
    unsigned long long v20;  // x20
    unsigned long long v21;  // x19
    unsigned long long v22;  // x30
    st_16bbb8_0 **v0;  // [bp-0x250], Other Possible Types: char
    st_16bbb8_0 *v1;  // [bp-0x248]
    unsigned long v2;  // [bp-0x58]
    unsigned long long v3;  // [bp-0x50]
    unsigned long long v4;  // [bp-0x48]
    unsigned long long v5;  // [bp-0x40]
    unsigned long long v6;  // [bp-0x38]
    unsigned long long v7;  // [bp-0x30]
    unsigned long long v8;  // [bp-0x28]
    unsigned long long v9;  // [bp-0x20]
    unsigned long long v10;  // [bp-0x18]
    char *v11;  // [bp-0x10]
    unsigned long long v12;  // [bp-0x8]
    char v13;  // [bp+0x0]

    v3 = v14;
    v4 = v15;
    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = v19;
    v9 = v20;
    v10 = v21;
    v11 = &v13;
    v12 = v22;
    v2 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    g_f0d3d8->field_178();
}
