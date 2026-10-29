/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xe32d4..0xe3ad4 (2048 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_e32d4_0 {
    char field_0;
} st_e32d4_0;

typedef struct st_e32d4_4 {
    unsigned long long field_0;
} st_e32d4_4;

typedef struct st_e32d4_1 {
    char padding_0[257];
    char field_101;
} st_e32d4_1;

typedef struct st_e32d4_3 {
    char padding_0[376];
    struct st_e32d4_4 *field_178;
} st_e32d4_3;

typedef struct st_e32d4_2 {
    char padding_0[96];
    struct st_e32d4_1 *field_60;
} st_e32d4_2;

extern st_e32d4_2 *g_f0d198;
extern st_e32d4_3 *g_f0d3d8;

void sub_e32d4(long long a0)
{
    unsigned long long v17;  // d9
    unsigned long long v18;  // d8
    unsigned long long v27;  // x30
    char v28;  // x0
    unsigned long long v19;  // x26
    unsigned long long v20;  // x25
    unsigned long long v21;  // x24
    unsigned long long v22;  // x23
    unsigned long long v23;  // x22
    unsigned long long v24;  // x21
    unsigned long long v25;  // x20
    unsigned long long v26;  // x19
    st_e32d4_0 **v0;  // [bp-0xb0], Other Possible Types: char
    st_e32d4_0 *v1;  // [bp-0xa8]
    st_e32d4_0 **v2;  // [bp-0x70], Other Possible Types: char
    st_e32d4_0 *v3;  // [bp-0x68]
    unsigned long long v4;  // [bp-0x60]
    unsigned long long v5;  // [bp-0x58]
    unsigned long long v6;  // [bp-0x50]
    unsigned long long v7;  // [bp-0x48]
    unsigned long long v8;  // [bp-0x40]
    unsigned long long v9;  // [bp-0x38]
    unsigned long long v10;  // [bp-0x30]
    unsigned long long v11;  // [bp-0x28]
    unsigned long long v12;  // [bp-0x20]
    unsigned long long v13;  // [bp-0x18]
    char *v14;  // [bp-0x10]
    unsigned long long v15;  // [bp-0x8]
    char v16;  // [bp+0x0]

    v4 = v17;
    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = v25;
    v13 = v26;
    v14 = &v16;
    v15 = v27;
    v1 = &v0;
    v0 = &v1;
    v3 = &v2;
    v2 = &v3;
    if (g_f0d198->field_60->field_101 >> 2 & 1)
    {
        v28 = sub_d5114(a0, 1);
        if (v28 && *(long long *)(v28 + 24))
            g_f0d3d8->field_178();
    }
    sub_c60ca0(a0);
}
