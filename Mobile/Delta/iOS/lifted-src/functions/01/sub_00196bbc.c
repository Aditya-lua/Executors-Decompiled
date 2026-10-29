/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x196bbc..0x197e08 (4684 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_196bbc_0 {
    char field_0;
} st_196bbc_0;

typedef struct st_196bbc_4 {
    unsigned long long field_0;
} st_196bbc_4;

typedef struct st_196bbc_1 {
    char padding_0[257];
    char field_101;
} st_196bbc_1;

typedef struct st_196bbc_3 {
    char padding_0[376];
    struct st_196bbc_4 *field_178;
} st_196bbc_3;

typedef struct st_196bbc_2 {
    char padding_0[96];
    struct st_196bbc_1 *field_60;
} st_196bbc_2;

extern st_196bbc_2 *g_f0d198;
extern st_196bbc_3 *g_f0d3d8;
extern char g_10002b0;

void sub_196bbc(long long a0)
{
    unsigned long long v21;  // d9
    unsigned long long v22;  // d8
    unsigned long long v31;  // x20
    unsigned long long v32;  // x19
    unsigned long long v33;  // x30
    char v34;  // x0
    unsigned long long v23;  // x28
    unsigned long long v24;  // x27
    unsigned long long v25;  // x26
    unsigned long long v26;  // x25
    unsigned long long v27;  // x24
    unsigned long long v28;  // x23
    unsigned long long v29;  // x22
    unsigned long long v30;  // x21
    st_196bbc_0 **v0;  // [bp-0x1e0], Other Possible Types: char
    st_196bbc_0 *v1;  // [bp-0x1d8]
    st_196bbc_0 *v2;  // [bp-0x1a0]
    st_196bbc_0 **v3;  // [bp-0xe8], Other Possible Types: char
    st_196bbc_0 *v4;  // [bp-0xe0], Other Possible Types: st_196bbc_0 **, char
    unsigned long v5;  // [bp-0x80]
    unsigned long long v6;  // [bp-0x70]
    unsigned long long v7;  // [bp-0x68]
    unsigned long long v8;  // [bp-0x60]
    unsigned long long v9;  // [bp-0x58]
    unsigned long long v10;  // [bp-0x50]
    unsigned long long v11;  // [bp-0x48]
    unsigned long long v12;  // [bp-0x40]
    unsigned long long v13;  // [bp-0x38]
    unsigned long long v14;  // [bp-0x30]
    unsigned long long v15;  // [bp-0x28]
    unsigned long long v16;  // [bp-0x20]
    unsigned long long v17;  // [bp-0x18]
    char *v18;  // [bp-0x10]
    unsigned long long v19;  // [bp-0x8]
    char v20;  // [bp+0x0]

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
    v17 = v32;
    v18 = &v20;
    v19 = v33;
    v5 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v2 = &v4;
    v4 = &v2;
    if (g_f0d198->field_60->field_101 >> 2 & 1)
    {
        v34 = sub_e1864(a0, 1);
        if (v34 && *(long long *)(v34 + 24))
        {
            v4 = &v3;
            v3 = &v4;
            g_f0d3d8->field_178();
        }
    }
    sub_c60dac(a0);
    __debugbreak();
}
