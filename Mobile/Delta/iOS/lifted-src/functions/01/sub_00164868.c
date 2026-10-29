/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x164868..0x16526c (2564 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_164868_1 {
    struct st_164868_0 *field_0;
} st_164868_1;

typedef struct st_164868_0 {
    char field_0;
} st_164868_0;

typedef struct st_164868_5 {
    unsigned long long field_0;
} st_164868_5;

typedef struct st_164868_2 {
    char padding_0[257];
    char field_101;
} st_164868_2;

typedef struct st_164868_4 {
    char padding_0[376];
    struct st_164868_5 *field_178;
} st_164868_4;

typedef struct st_164868_3 {
    char padding_0[96];
    struct st_164868_2 *field_60;
} st_164868_3;

extern st_164868_3 *g_f0d198;
extern st_164868_4 *g_f0d3d8;
extern char g_10002b0;

void sub_164868(long long a0)
{
    unsigned long long v18;  // d9
    unsigned long long v19;  // d8
    unsigned long long v28;  // x30
    char v29;  // x0
    unsigned long long v20;  // x26
    unsigned long long v21;  // x25
    unsigned long long v22;  // x24
    unsigned long long v23;  // x23
    unsigned long long v24;  // x22
    unsigned long long v25;  // x21
    unsigned long long v26;  // x20
    unsigned long long v27;  // x19
    st_164868_0 **v0;  // [bp-0xe8], Other Possible Types: char
    st_164868_0 *v1;  // [bp-0xe0]
    st_164868_0 **v2;  // [bp-0xc8], Other Possible Types: st_164868_1 **, char
    st_164868_0 *v3;  // [bp-0x80], Other Possible Types: st_164868_1 **
    unsigned long v4;  // [bp-0x68]
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
    char v17;  // [bp+0x0]

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
    v4 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v3 = &v2;
    v2 = &v3;
    if (g_f0d198->field_60->field_101 >> 2 & 1)
    {
        v29 = sub_e21e0(a0, 1);
        if (v29 && *(long long *)(v29 + 24))
        {
            v3 = &v2;
            v2 = &v3;
            g_f0d3d8->field_178();
        }
    }
    sub_c60d64(a0);
    __debugbreak();
}
