/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a4590..0x2a4c24 (1684 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a4590_0 {
    char field_0;
} st_2a4590_0;

typedef struct st_2a4590_2 {
    unsigned long long field_0;
} st_2a4590_2;

typedef struct st_2a4590_1 {
    char padding_0[376];
    struct st_2a4590_2 *field_178;
} st_2a4590_1;

extern st_2a4590_1 *g_f0d3d8;
extern char g_10002b0;

void sub_2a4590(unsigned long a0)
{
    unsigned long long v18;  // x26
    unsigned long long v19;  // x25
    unsigned long long v20;  // x24
    unsigned long long v21;  // x23
    unsigned long long v22;  // x22
    unsigned long long v23;  // x21
    unsigned long long v24;  // x20
    unsigned long long v25;  // x19
    unsigned long long v26;  // x30
    st_2a4590_0 **v0;  // [bp-0x1c8], Other Possible Types: char
    st_2a4590_0 *v1;  // [bp-0x1c0]
    st_2a4590_0 **v2;  // [bp-0x1b8], Other Possible Types: char
    st_2a4590_0 *v3;  // [bp-0x1b0]
    st_2a4590_0 **v4;  // [bp-0x198], Other Possible Types: char
    st_2a4590_0 *v5;  // [bp-0x190]
    unsigned long v6;  // [bp-0x58]
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

    v7 = v18;
    v8 = v19;
    v9 = v20;
    v10 = v21;
    v11 = v22;
    v12 = v23;
    v13 = v24;
    v14 = v25;
    v15 = &v17;
    v16 = v26;
    v6 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v3 = &v2;
    v2 = &v3;
    v5 = &v4;
    v4 = &v5;
    g_f0d3d8->field_178();
}
