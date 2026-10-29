/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x257d14..0x2580f8 (996 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_257d14_3 {
    char padding_0[8];
    struct st_257d14_2 *field_8;
} st_257d14_3;

typedef struct st_257d14_2 {
    char padding_0[24];
    struct st_257d14_1 *field_18;
} st_257d14_2;

typedef struct st_257d14_4 {
    char padding_0[40];
    struct st_257d14_3 *field_28;
} st_257d14_4;

typedef struct st_257d14_1 {
    char padding_0[48];
    unsigned long long field_30;
} st_257d14_1;

typedef struct st_257d14_0 {
    char field_0;
} st_257d14_0;

typedef struct st_257d14_5 {
    char padding_0[263];
    char field_107;
    char padding_108[1144];
    unsigned long long field_580;
} st_257d14_5;

typedef struct st_257d14_7 {
    char padding_0[376];
    struct st_257d14_8 *field_178;
} st_257d14_7;

typedef struct st_257d14_8 {
    unsigned long long field_0;
} st_257d14_8;

typedef struct st_257d14_6 {
    char padding_0[96];
    struct st_257d14_5 *field_60;
} st_257d14_6;

extern st_257d14_6 *g_f0d198;
extern st_257d14_8 *g_f0d338;
extern st_257d14_7 *g_f0d3d8;

void sub_257d14(unsigned long a0, unsigned long a1, unsigned long a2, st_257d14_4 **a3, unsigned long a4, unsigned long a5)
{
    unsigned long long v15;  // x26
    unsigned long long v16;  // x25
    unsigned long long v17;  // x24
    unsigned long long v18;  // x23
    unsigned long long v19;  // x22
    unsigned long long v20;  // x21
    unsigned long long v21;  // x20
    unsigned long long v22;  // x19
    unsigned long long v23;  // x30
    st_257d14_0 **v0;  // [bp-0xc8], Other Possible Types: char
    st_257d14_0 *v1;  // [bp-0xc0]
    st_257d14_0 **v2;  // [bp-0xa0], Other Possible Types: char
    st_257d14_0 *v3;  // [bp-0x80]
    unsigned long long v4;  // [bp-0x50]
    unsigned long long v5;  // [bp-0x48]
    unsigned long long v6;  // [bp-0x40]
    unsigned long long v7;  // [bp-0x38]
    unsigned long long v8;  // [bp-0x30]
    unsigned long long v9;  // [bp-0x28]
    unsigned long long v10;  // [bp-0x20]
    unsigned long long v11;  // [bp-0x18]
    char *v12;  // [bp-0x10]
    unsigned long long v13;  // [bp-0x8]
    char v14;  // [bp+0x0]

    v4 = v15;
    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = v19;
    v9 = v20;
    v10 = v21;
    v11 = v22;
    v12 = &v14;
    v13 = v23;
    v1 = &v0;
    v0 = &v1;
    if (*a3->field_28->field_8->field_18->field_30 == g_f0d198->field_60->field_580 && g_f0d198->field_60->field_107 >> 3 & 1)
    {
        v3 = &v2;
        v2 = &v3;
        g_f0d3d8->field_178();
    }
    g_f0d338();
}
