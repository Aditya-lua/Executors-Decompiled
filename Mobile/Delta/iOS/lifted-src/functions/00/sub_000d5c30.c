/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xd5c30..0xd5d0c (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_d5c30_0 {
    char field_0;
} st_d5c30_0;

typedef struct st_d5c30_2 {
    unsigned long long field_0;
} st_d5c30_2;

typedef struct st_d5c30_1 {
    char padding_0[32];
    struct st_d5c30_2 *field_20;
} st_d5c30_1;

extern st_d5c30_1 *g_f0d3d8;
extern char g_10002b0;

void sub_d5c30(unsigned long a0, long long a1)
{
    unsigned long long v12;  // x22
    unsigned long long v13;  // x21
    unsigned long long v14;  // x20
    unsigned long long v15;  // x19
    unsigned long long v16;  // x30
    char *v0;  // [bp-0x250]
    st_d5c30_0 **v1;  // [bp-0x248], Other Possible Types: char
    st_d5c30_0 *v2;  // [bp-0x240]
    char v3;  // [bp-0x238]
    unsigned long v4;  // [bp-0x38]
    unsigned long long v5;  // [bp-0x30]
    unsigned long long v6;  // [bp-0x28]
    unsigned long long v7;  // [bp-0x20]
    unsigned long long v8;  // [bp-0x18]
    char *v9;  // [bp-0x10]
    unsigned long long v10;  // [bp-0x8]
    char v11;  // [bp+0x0]

    v5 = v12;
    v6 = v13;
    v7 = v14;
    v8 = v15;
    v9 = &v11;
    v10 = v16;
    v4 = *(long long *)&g_10002b0;
    v0 = &v11;
    v2 = &v1;
    v1 = &v2;
    _vsnprintf(&v3, 0x200, a1, &v11);
    _strlen(&v3);
    g_f0d3d8->field_20();
}
