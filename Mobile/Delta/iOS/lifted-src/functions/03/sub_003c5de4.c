/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c5de4..0x3c5e5c (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c5de4_2 {
    char padding_0[8];
    struct st_3c5de4_1 *field_8;
} st_3c5de4_2;

typedef struct st_3c5de4_1 {
    char padding_0[48];
    unsigned int field_30;
    char padding_34[108];
    unsigned long long field_a0;
} st_3c5de4_1;

typedef struct st_3c5de4_0 {
    char field_0;
} st_3c5de4_0;

typedef struct st_3c5de4_4 {
    unsigned long long field_0;
} st_3c5de4_4;

typedef struct st_3c5de4_3 {
    char padding_0[464];
    struct st_3c5de4_4 *field_1d0;
} st_3c5de4_3;

extern st_3c5de4_3 *g_f0d3d8;

void sub_3c5de4(st_3c5de4_2 *a0, unsigned long long a1)
{
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    unsigned long long v9;  // x30
    unsigned long long v10;  // x0
    st_3c5de4_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_3c5de4_0 *v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v2 = v7;
    v3 = v8;
    v4 = &v6;
    v5 = v9;
    v1 = &v0;
    v0 = &v1;
    v10 = sub_3c5d0c(a1);
    a0->field_8->field_30 = a1;
    a0->field_8->field_a0 = v10 | 0x3fffffffffff00;
    g_f0d3d8->field_1d0();
}
