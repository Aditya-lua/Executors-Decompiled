/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1284cc..0x1285d4 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1284cc_0 {
    char field_0;
} st_1284cc_0;

typedef struct st_1284cc_2 {
    unsigned long long field_0;
} st_1284cc_2;

typedef struct st_1284cc_1 {
    char padding_0[376];
    struct st_1284cc_2 *field_178;
} st_1284cc_1;

extern st_1284cc_1 *g_f0d3d8;
extern char g_10002b0;

void sub_1284cc(unsigned long a0)
{
    unsigned long long v12;  // x28
    unsigned long long v13;  // x27
    unsigned long long v14;  // x22
    unsigned long long v15;  // x21
    unsigned long long v16;  // x20
    unsigned long long v17;  // x19
    unsigned long long v18;  // x30
    st_1284cc_0 **v0;  // [bp-0x190], Other Possible Types: char
    st_1284cc_0 *v1;  // [bp-0x188]
    unsigned long v2;  // [bp-0x48]
    unsigned long long v3;  // [bp-0x40]
    unsigned long long v4;  // [bp-0x38]
    unsigned long long v5;  // [bp-0x30]
    unsigned long long v6;  // [bp-0x28]
    unsigned long long v7;  // [bp-0x20]
    unsigned long long v8;  // [bp-0x18]
    char *v9;  // [bp-0x10]
    unsigned long long v10;  // [bp-0x8]
    char v11;  // [bp+0x0]

    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = v15;
    v7 = v16;
    v8 = v17;
    v9 = &v11;
    v10 = v18;
    v2 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    g_f0d3d8->field_178();
}
