/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x265f38..0x26619c (612 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_265f38_0 {
    char field_0;
} st_265f38_0;

typedef struct st_265f38_1 {
    char padding_0[376];
    struct st_265f38_2 *field_178;
} st_265f38_1;

typedef struct st_265f38_2 {
    unsigned long long field_0;
} st_265f38_2;

extern st_265f38_2 *g_f0d348;
extern st_265f38_1 *g_f0d3d8;

void sub_265f38(unsigned long a0, unsigned long a1, unsigned long long *a2, unsigned long a3)
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
    st_265f38_0 **v0;  // [bp-0xa0], Other Possible Types: char
    st_265f38_0 *v1;  // [bp-0x98]
    st_265f38_0 **v2;  // [bp-0x90], Other Possible Types: char
    st_265f38_0 *v3;  // [bp-0x78]
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
    if (sub_2a3e68(a2, 0, 0) && (int)(a2[11] - a2[9] >> 4) >= 2)
    {
        v3 = &v2;
        v2 = &v3;
        g_f0d3d8->field_178();
    }
    g_f0d348();
}
