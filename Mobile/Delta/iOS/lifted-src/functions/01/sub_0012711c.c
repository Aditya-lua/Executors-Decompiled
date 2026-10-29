/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x12711c..0x1271bc (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_12711c_1 {
    char padding_0[2];
    char field_2;
    char padding_3[77];
    struct st_12711c_0 *field_50;
    char padding_58[32];
    unsigned long long field_78;
} st_12711c_1;

typedef struct st_12711c_0 {
    char padding_0[32];
    struct st_12711c_1 *field_20;
} st_12711c_0;

typedef struct st_12711c_3 {
    unsigned long long field_0;
} st_12711c_3;

typedef struct st_12711c_2 {
    char padding_0[376];
    struct st_12711c_3 *field_178;
} st_12711c_2;

extern st_12711c_2 *g_f0d3d8;

void sub_12711c(st_12711c_1 *a0, unsigned long a1, unsigned long a2)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long v12;  // x8
    st_12711c_0 *v13;  // x9
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
    v12 = a0->field_2;
    if (v12 >> 2 & 1)
    {
        v13 = a0->field_50;
        a0->field_2 = (char)v12 & 251;
        a0->field_78 = v13->field_20;
        v13->field_20 = a0;
    }
    g_f0d3d8->field_178();
}
