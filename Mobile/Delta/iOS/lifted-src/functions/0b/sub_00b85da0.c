/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb85da0..0xb85e90 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b85da0_2 {
    char padding_0[8];
    struct st_b85da0_0 *field_8;
} st_b85da0_2;

typedef struct st_b85da0_0 {
    char padding_0[24];
    struct st_b85da0_1 *field_18;
} st_b85da0_0;

typedef struct st_b85da0_1 {
    unsigned long long field_0;
} st_b85da0_1;


void sub_b85da0(unsigned long a0, st_b85da0_2 *a1)
{
    unsigned long long v10;  // x22
    unsigned long long v11;  // x21
    unsigned long long v12;  // x20
    unsigned long long v13;  // x19
    unsigned long long v14;  // x30
    st_b85da0_2 *v0;  // [bp-0x48]
    unsigned long long v1;  // [bp-0x40]
    char v2;  // [bp-0x38]
    unsigned long long v3;  // [bp-0x30]
    unsigned long long v4;  // [bp-0x28]
    unsigned long long v5;  // [bp-0x20]
    unsigned long long v6;  // [bp-0x18]
    char *v7;  // [bp-0x10]
    unsigned long long v8;  // [bp-0x8]
    char v9;  // [bp+0x0]

    v3 = v10;
    v4 = v11;
    v5 = v12;
    v6 = v13;
    v7 = &v9;
    v8 = v14;
    v2 = 1;
    v0 = a1;
    v1 = 0;
    a1->field_8->field_18();
}
