/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbf124..0xbf23c (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bf124_0 {
    char field_0;
} st_bf124_0;

typedef struct st_bf124_2 {
    unsigned long long field_0;
} st_bf124_2;

typedef struct st_bf124_1 {
    struct st_bf124_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_bf124_1;

extern st_bf124_1 g_e6c8a0;

void sub_bf124(unsigned long a0, unsigned long a1, unsigned long long a2, long long a3)
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
    st_bf124_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_bf124_0 *v1;  // [bp-0x68]
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
    _bzero(a3, 0x2010);
    (&g_e6c8a0.field_0)[(unsigned int)a2]();
}
