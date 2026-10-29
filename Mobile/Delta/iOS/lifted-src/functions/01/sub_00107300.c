/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x107300..0x10776c (1132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_107300_0 {
    char field_0;
} st_107300_0;

typedef struct st_107300_4 {
    unsigned long long field_0;
} st_107300_4;

typedef struct st_107300_1 {
    char padding_0[257];
    char field_101;
} st_107300_1;

typedef struct st_107300_3 {
    char padding_0[376];
    struct st_107300_4 *field_178;
} st_107300_3;

typedef struct st_107300_2 {
    char padding_0[96];
    struct st_107300_1 *field_60;
} st_107300_2;

extern st_107300_2 *g_f0d198;
extern st_107300_3 *g_f0d3d8;

void sub_107300(long long a0)
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
    char v24;  // x0
    st_107300_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_107300_0 *v1;  // [bp-0x68]
    st_107300_0 **v2;  // [bp-0x60], Other Possible Types: char
    st_107300_0 *v3;  // [bp-0x58]
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
    v3 = &v2;
    v2 = &v3;
    if (g_f0d198->field_60->field_101 >> 2 & 1)
    {
        v24 = sub_f2358(a0, 1);
        if (v24 && *(long long *)(v24 + 24))
            g_f0d3d8->field_178();
    }
    sub_c60cc4(a0);
}
