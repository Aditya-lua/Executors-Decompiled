/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c599c..0x3c5a44 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c599c_1 {
    char padding_0[88];
    unsigned long long field_58;
} st_3c599c_1;

typedef struct st_3c599c_0 {
    char field_0;
} st_3c599c_0;

typedef struct st_3c599c_3 {
    unsigned long long field_0;
} st_3c599c_3;

typedef struct st_3c599c_2 {
    char padding_0[176];
    struct st_3c599c_3 *field_b0;
} st_3c599c_2;

extern st_3c599c_2 *g_f0d3d8;

void sub_3c599c(st_3c599c_1 *a0, int a1, unsigned int a2, char a3)
{
    unsigned long long v10;  // x20
    unsigned long long v11;  // x19
    unsigned long long v12;  // x30
    st_3c599c_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_3c599c_0 *v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned int v3;  // [bp-0x28]
    char v4;  // [bp-0x24]
    unsigned long long v5;  // [bp-0x20]
    unsigned long long v6;  // [bp-0x18]
    char *v7;  // [bp-0x10]
    unsigned long long v8;  // [bp-0x8]
    char v9;  // [bp+0x0]

    v5 = v10;
    v6 = v11;
    v7 = &v9;
    v8 = v12;
    v1 = &v0;
    v0 = &v1;
    v2 = a0->field_58 + ~a1 * 16;
    v3 = a2;
    v4 = a3;
    g_f0d3d8->field_b0();
}
