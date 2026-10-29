/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2afc44..0x2afe80 (572 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2afc44_0 {
    char field_0;
} st_2afc44_0;

typedef struct st_2afc44_1 {
    char padding_0[864];
    char field_360;
} st_2afc44_1;

typedef struct st_2afc44_3 {
    unsigned long long field_0;
} st_2afc44_3;

typedef struct st_2afc44_2 {
    char padding_0[96];
    struct st_2afc44_1 *field_60;
} st_2afc44_2;

extern st_2afc44_2 *g_f0d198;
extern st_2afc44_3 *g_f0d3c8;

void sub_2afc44(unsigned long a0)
{
    unsigned long long v15;  // x28
    unsigned long long v16;  // x27
    unsigned long long v25;  // x30
    unsigned long long v17;  // x26
    unsigned long long v18;  // x25
    unsigned long long v19;  // x24
    unsigned long long v20;  // x23
    unsigned long long v21;  // x22
    unsigned long long v22;  // x21
    unsigned long long v23;  // x20
    unsigned long long v24;  // x19
    st_2afc44_0 **v0;  // [bp-0xa0], Other Possible Types: char
    st_2afc44_0 *v1;  // [bp-0x98]
    unsigned long long v2;  // [bp-0x60]
    unsigned long long v3;  // [bp-0x58]
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

    v2 = v15;
    v3 = v16;
    v4 = v17;
    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = &v14;
    v13 = v25;
    v1 = &v0;
    v0 = &v1;
    g_f0d198->field_60->field_360 = 1;
    g_f0d3c8();
}
