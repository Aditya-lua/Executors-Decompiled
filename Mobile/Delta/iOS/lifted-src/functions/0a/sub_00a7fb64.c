/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7fb64..0xa7fbd8 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7fb64_0 {
    char padding_0[8];
    struct st_a7fb64_1 *field_8;
    char padding_10[192];
    unsigned long long field_d0;
    unsigned long long field_d8;
    unsigned long long field_e0;
    unsigned long long field_e8;
    unsigned long long field_f0;
    unsigned long long field_f8;
} st_a7fb64_0;

typedef struct st_a7fb64_1 {
    char padding_0[32];
    unsigned long long field_20;
    unsigned long long field_28;
} st_a7fb64_1;


unsigned long long sub_a7fb64(st_a7fb64_0 *a0)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long long v12;  // x20
    unsigned long long v13;  // x21
    unsigned long long v14;  // x0
    unsigned long long v15;  // x8
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (a0->field_f0)
        return 0;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = a0->field_8->field_20;
    v13 = a0->field_8->field_28;
    v14 = sub_a6bf4c(v13 * 0x400 + v12 * 0x800, "crypto/ml_dsa/ml_dsa_vector.h", 35);
    a0->field_f0 = v14;
    if (!v14)
        return v14;
    a0->field_f8 = v13;
    v15 = v14 + v13 * 0x400;
    a0->field_e0 = v15;
    a0->field_e8 = v12;
    a0->field_d0 = v15 + v12 * 0x400;
    a0->field_d8 = v12;
    return 1;
}
