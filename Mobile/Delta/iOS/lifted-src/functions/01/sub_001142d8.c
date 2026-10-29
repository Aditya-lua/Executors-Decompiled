/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1142d8..0x114394 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1142d8_0 {
    char field_0;
} st_1142d8_0;

typedef struct st_1142d8_2 {
    unsigned long long field_0;
} st_1142d8_2;

typedef struct st_1142d8_1 {
    char padding_0[24];
    struct st_1142d8_2 *field_18;
} st_1142d8_1;

extern st_1142d8_1 *g_f0d3d8;

void sub_1142d8(unsigned long a0)
{
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_1142d8_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_1142d8_0 *v1;  // [bp-0x58]
    char v2;  // [bp-0x50]
    char v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v4 = v9;
    v5 = v10;
    v6 = &v8;
    v7 = v11;
    v1 = &v0;
    v0 = &v1;
    sub_3d9744(32);
    sub_122d38(&v2);
    sub_a0c8(&v3);
    sub_6b08(&v3);
    g_f0d3d8->field_18();
}
