/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x140874..0x140bc0 (844 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_140874_1 {
    char padding_0[2];
    char field_2;
    char padding_3[77];
    struct st_140874_0 *field_50;
    struct st_140874_2 *field_58;
    char padding_60[24];
    unsigned long long field_78;
} st_140874_1;

typedef struct st_140874_2 {
    unsigned long long field_0;
    char padding_8[4];
    unsigned int field_c;
} st_140874_2;

typedef struct st_140874_0 {
    char padding_0[32];
    struct st_140874_1 *field_20;
} st_140874_0;

typedef struct st_140874_4 {
    unsigned long long field_0;
} st_140874_4;

typedef struct st_140874_3 {
    char padding_0[376];
    struct st_140874_4 *field_178;
} st_140874_3;

extern st_140874_3 *g_f0d3d8;

void sub_140874(st_140874_1 *a0, float *a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_140874_2 *v12;  // x8
    unsigned long v13;  // x8
    st_140874_0 *v14;  // x9
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = a0->field_58;
    *(double *)&v12->field_0 = *a1;
    v12->field_c = 3;
    a0->field_58 = a0->field_58 + 1;
    v13 = a0->field_2;
    if (v13 >> 2 & 1)
    {
        v14 = a0->field_50;
        a0->field_2 = (char)v13 & 251;
        a0->field_78 = v14->field_20;
        v14->field_20 = a0;
    }
    g_f0d3d8->field_178();
}
