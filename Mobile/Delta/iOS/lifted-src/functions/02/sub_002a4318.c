/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a4318..0x2a4590 (632 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a4318_3 {
    char padding_0[2];
    char field_2;
    char padding_3[5];
    struct st_2a4318_2 *field_8;
} st_2a4318_3;

typedef struct st_2a4318_2 {
    char padding_0[24];
    struct st_2a4318_1 *field_18;
} st_2a4318_2;

typedef struct st_2a4318_1 {
    char padding_0[48];
    unsigned long long field_30;
} st_2a4318_1;

typedef struct st_2a4318_0 {
    char field_0;
} st_2a4318_0;

typedef struct st_2a4318_4 {
    char padding_0[1408];
    unsigned long long field_580;
} st_2a4318_4;

typedef struct st_2a4318_6 {
    char padding_0[376];
    struct st_2a4318_7 *field_178;
} st_2a4318_6;

typedef struct st_2a4318_7 {
    unsigned long long field_0;
} st_2a4318_7;

typedef struct st_2a4318_5 {
    char padding_0[96];
    struct st_2a4318_4 *field_60;
} st_2a4318_5;

extern st_2a4318_5 *g_f0d198;
extern st_2a4318_7 *g_f0d3b0;
extern st_2a4318_6 *g_f0d3d8;

void sub_2a4318(st_2a4318_3 *a0)
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
    st_2a4318_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_2a4318_0 *v1;  // [bp-0x68]
    st_2a4318_0 **v2;  // [bp-0x60], Other Possible Types: char
    st_2a4318_0 *v3;  // [bp-0x58]
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
    if (a0->field_8->field_18->field_30 == g_f0d198->field_60->field_580 && a0->field_2 < 0)
    {
        v3 = &v2;
        v2 = &v3;
        g_f0d3d8->field_178();
    }
    g_f0d3b0();
}
