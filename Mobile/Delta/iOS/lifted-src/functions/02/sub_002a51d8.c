/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a51d8..0x2a52ec (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a51d8_3 {
    char field_0;
    char field_1;
} st_2a51d8_3;

typedef struct st_2a51d8_1 {
    char padding_0[260];
    char field_104;
    char padding_105[129];
    char field_186;
} st_2a51d8_1;

typedef struct st_2a51d8_4 {
    char padding_0[16];
    struct st_2a51d8_3 *field_10;
    char padding_18[24];
    unsigned int field_30;
} st_2a51d8_4;

typedef struct st_2a51d8_2 {
    char padding_0[96];
    struct st_2a51d8_1 *field_60;
} st_2a51d8_2;

typedef struct st_2a51d8_0 {
    char field_0;
} st_2a51d8_0;

typedef struct st_2a51d8_5 {
    unsigned long long field_0;
} st_2a51d8_5;

extern st_2a51d8_2 *g_f0d198;
extern st_2a51d8_5 *g_f0d3c0;

void sub_2a51d8(unsigned long a0, st_2a51d8_4 **a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5, unsigned long a6, unsigned long a7)
{
    unsigned long long v18;  // x28
    unsigned long long v19;  // x27
    unsigned long long v28;  // x30
    st_2a51d8_2 *v29;  // x8
    st_2a51d8_4 **v30;  // x1
    unsigned long long v20;  // x26
    unsigned long long v21;  // x25
    unsigned long long v22;  // x24
    unsigned long long v23;  // x23
    unsigned long long v24;  // x22
    unsigned long long v25;  // x21
    unsigned long long v26;  // x20
    unsigned long long v27;  // x19
    unsigned long long v0;  // [bp-0x90]
    st_2a51d8_0 **v1;  // [bp-0x80], Other Possible Types: char
    st_2a51d8_0 *v2;  // [bp-0x78]
    st_2a51d8_4 *v3;  // [bp-0x70]
    unsigned int v4;  // [bp-0x68]
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
    char v17;  // [bp+0x0], Other Possible Types: unsigned long long

    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = v25;
    v13 = v26;
    v14 = v27;
    v15 = &v17;
    v16 = v28;
    v2 = &v1;
    v1 = &v2;
    v29 = g_f0d198;
    v30 = a1;
    if (*v30->field_10->field_0 == 27)
    {
        v30 = a1;
        if (g_f0d198->field_60->field_186 < 0)
        {
            v3 = *a1;
            v4 = 1;
            sub_2a53d8(&v3, 0xffffffff);
            v29 = g_f0d198;
            v30 = a1;
        }
    }
    if (v29->field_60->field_104 >> 6 & 1)
        *v30->field_30 = *v30->field_30 - *a1->field_10->field_1;
    v0 = v17;
    g_f0d3c0();
}
