/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1250c0..0x1251e4 (292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1250c0_0 {
    char field_0;
} st_1250c0_0;

typedef struct st_1250c0_4 {
    unsigned long long field_0;
} st_1250c0_4;

typedef struct st_1250c0_1 {
    char padding_0[257];
    char field_101;
} st_1250c0_1;

typedef struct st_1250c0_3 {
    char padding_0[376];
    struct st_1250c0_4 *field_178;
} st_1250c0_3;

typedef struct st_1250c0_2 {
    char padding_0[96];
    struct st_1250c0_1 *field_60;
} st_1250c0_2;

extern st_1250c0_2 *g_f0d198;
extern st_1250c0_3 *g_f0d3d8;

void sub_1250c0(long long a0)
{
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    char v16;  // x0
    st_1250c0_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_1250c0_0 *v1;  // [bp-0x48]
    st_1250c0_0 **v2;  // [bp-0x40], Other Possible Types: char
    st_1250c0_0 *v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    v4 = v11;
    v5 = v12;
    v6 = v13;
    v7 = v14;
    v8 = &v10;
    v9 = v15;
    v1 = &v0;
    v0 = &v1;
    v3 = &v2;
    v2 = &v3;
    if (g_f0d198->field_60->field_101 >> 2 & 1)
    {
        v16 = sub_f2358(a0, 1);
        if (v16 && *(long long *)(v16 + 24))
            g_f0d3d8->field_178();
    }
    sub_c60ce4(a0);
}
