/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8ebe38..0x8ed92c (6900 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8ebe38_0 {
    char field_0;
} st_8ebe38_0;

typedef struct st_8ebe38_4 {
    unsigned long long field_0;
} st_8ebe38_4;

typedef struct st_8ebe38_1 {
    char padding_0[1504];
    unsigned long long field_5e0;
} st_8ebe38_1;

typedef struct st_8ebe38_3 {
    char padding_0[416];
    struct st_8ebe38_4 *field_1a0;
} st_8ebe38_3;

typedef struct st_8ebe38_2 {
    char padding_0[96];
    struct st_8ebe38_1 *field_60;
    char padding_68[1048];
    unsigned long long field_480;
} st_8ebe38_2;

extern st_8ebe38_2 *g_f0d198;
extern st_8ebe38_3 *g_f0d3d8;
extern char g_10002b0;

void sub_8ebe38(void)
{
    unsigned long long v20;  // x28
    unsigned long long v21;  // x27
    unsigned long long v30;  // x30
    unsigned long long v22;  // x26
    unsigned long long v23;  // x25
    unsigned long long v24;  // x24
    unsigned long long v25;  // x23
    unsigned long long v26;  // x22
    unsigned long long v27;  // x21
    unsigned long long v28;  // x20
    unsigned long long v29;  // x19
    st_8ebe38_0 **v0;  // [bp-0x1e8], Other Possible Types: char
    st_8ebe38_0 *v1;  // [bp-0x1e0]
    unsigned long long v2;  // [bp-0x1d8]
    st_8ebe38_0 **v3;  // [bp-0x178], Other Possible Types: char
    unsigned int v4;  // [bp-0x118]
    st_8ebe38_0 *v5;  // [bp-0xd0]
    unsigned long v6;  // [bp-0x70]
    unsigned long long v7;  // [bp-0x60]
    unsigned long long v8;  // [bp-0x58]
    unsigned long long v9;  // [bp-0x50]
    unsigned long long v10;  // [bp-0x48]
    unsigned long long v11;  // [bp-0x40]
    unsigned long long v12;  // [bp-0x38]
    unsigned long long v13;  // [bp-0x30]
    unsigned long long v14;  // [bp-0x28]
    unsigned long long v15;  // [bp-0x20]
    unsigned long long v16;  // [bp-0x18]
    char *v17;  // [bp-0x10]
    unsigned long long v18;  // [bp-0x8]
    char v19;  // [bp+0x0]

    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = v25;
    v13 = v26;
    v14 = v27;
    v15 = v28;
    v16 = v29;
    v17 = &v19;
    v18 = v30;
    v6 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    sub_8af810(g_f0d198->field_480 + 81352);
    g_f0d198->field_60->field_5e0 = 0;
    v5 = &v3;
    v3 = &v5;
    v4 = 2;
    v2 = 0;
    g_f0d3d8->field_1a0();
}
