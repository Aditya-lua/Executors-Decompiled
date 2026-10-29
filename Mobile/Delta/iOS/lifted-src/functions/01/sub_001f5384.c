/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f5384..0x1f6a18 (5780 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f5384_0 {
    char field_0;
} st_1f5384_0;

typedef struct st_1f5384_2 {
    unsigned long long field_0;
} st_1f5384_2;

typedef struct st_1f5384_1 {
    char padding_0[312];
    struct st_1f5384_2 *field_138;
} st_1f5384_1;

extern st_1f5384_1 *g_f0d3d8;
extern char g_10002b0;

void sub_1f5384(unsigned long a0)
{
    unsigned long long v18;  // d9
    unsigned long long v19;  // d8
    unsigned long long v28;  // x20
    unsigned long long v29;  // x19
    unsigned long long v30;  // x30
    unsigned long long v20;  // x28
    unsigned long long v21;  // x27
    unsigned long long v22;  // x26
    unsigned long long v23;  // x25
    unsigned long long v24;  // x24
    unsigned long long v25;  // x23
    unsigned long long v26;  // x22
    unsigned long long v27;  // x21
    st_1f5384_0 **v0;  // [bp-0x1b8], Other Possible Types: char
    st_1f5384_0 *v1;  // [bp-0x1b0]
    unsigned long v2;  // [bp-0x78]
    unsigned long long v3;  // [bp-0x70]
    unsigned long long v4;  // [bp-0x68]
    unsigned long long v5;  // [bp-0x60]
    unsigned long long v6;  // [bp-0x58]
    unsigned long long v7;  // [bp-0x50]
    unsigned long long v8;  // [bp-0x48]
    unsigned long long v9;  // [bp-0x40]
    unsigned long long v10;  // [bp-0x38]
    unsigned long long v11;  // [bp-0x30]
    unsigned long long v12;  // [bp-0x28]
    unsigned long long v13;  // [bp-0x20]
    unsigned long long v14;  // [bp-0x18]
    char *v15;  // [bp-0x10]
    unsigned long long v16;  // [bp-0x8]
    char v17;  // [bp+0x0]

    v3 = v18;
    v4 = v19;
    v5 = v20;
    v6 = v21;
    v7 = v22;
    v8 = v23;
    v9 = v24;
    v10 = v25;
    v11 = v26;
    v12 = v27;
    v13 = v28;
    v14 = v29;
    v15 = &v17;
    v16 = v30;
    v2 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    g_f0d3d8->field_138();
}
