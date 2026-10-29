/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2639f0..0x26433c (2380 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2639f0_3 {
    char padding_0[8];
    struct st_2639f0_2 *field_8;
} st_2639f0_3;

typedef struct st_2639f0_2 {
    char padding_0[24];
    struct st_2639f0_1 *field_18;
} st_2639f0_2;

typedef struct st_2639f0_4 {
    char padding_0[40];
    struct st_2639f0_3 *field_28;
} st_2639f0_4;

typedef struct st_2639f0_1 {
    char padding_0[48];
    unsigned long long field_30;
} st_2639f0_1;

typedef struct st_2639f0_0 {
    char field_0;
} st_2639f0_0;

typedef struct st_2639f0_5 {
    char padding_0[263];
    char field_107;
    char padding_108[1144];
    unsigned long long field_580;
} st_2639f0_5;

typedef struct st_2639f0_7 {
    char padding_0[376];
    struct st_2639f0_8 *field_178;
} st_2639f0_7;

typedef struct st_2639f0_8 {
    unsigned long long field_0;
} st_2639f0_8;

typedef struct st_2639f0_6 {
    char padding_0[96];
    struct st_2639f0_5 *field_60;
} st_2639f0_6;

extern st_2639f0_6 *g_f0d198;
extern st_2639f0_8 *g_f0d330;
extern st_2639f0_7 *g_f0d3d8;
extern char g_10002b0;

void sub_2639f0(unsigned long a0, unsigned long a1, unsigned long a2, st_2639f0_4 **a3, unsigned long a4, unsigned long a5)
{
    unsigned long long v20;  // d9
    unsigned long long v21;  // d8
    unsigned long long v30;  // x20
    unsigned long long v31;  // x19
    unsigned long long v32;  // x30
    unsigned long long v22;  // x28
    unsigned long long v23;  // x27
    unsigned long long v24;  // x26
    unsigned long long v25;  // x25
    unsigned long long v26;  // x24
    unsigned long long v27;  // x23
    unsigned long long v28;  // x22
    unsigned long long v29;  // x21
    st_2639f0_0 **v0;  // [bp-0x148], Other Possible Types: char
    st_2639f0_0 *v1;  // [bp-0x140]
    st_2639f0_0 *v2;  // [bp-0xd0]
    st_2639f0_0 **v3;  // [bp-0xa0], Other Possible Types: char
    unsigned long v4;  // [bp-0x78]
    unsigned long long v5;  // [bp-0x70]
    unsigned long long v6;  // [bp-0x68]
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
    v15 = v30;
    v16 = v31;
    v17 = &v19;
    v18 = v32;
    v4 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    if (*a3->field_28->field_8->field_18->field_30 == g_f0d198->field_60->field_580 && g_f0d198->field_60->field_107 >> 3 & 1)
    {
        v2 = &v3;
        v3 = &v2;
        g_f0d3d8->field_178();
    }
    g_f0d330();
}
