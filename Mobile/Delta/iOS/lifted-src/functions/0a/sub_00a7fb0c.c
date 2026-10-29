/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7fb0c..0xa7fb64 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7fb0c_1 {
    char padding_0[8];
    struct st_a7fb0c_0 *field_8;
    char padding_10[176];
    unsigned long long field_c0;
    unsigned long long field_c8;
} st_a7fb0c_1;

typedef struct st_a7fb0c_0 {
    char padding_0[32];
    unsigned long long field_20;
} st_a7fb0c_0;


unsigned long long sub_a7fb0c(st_a7fb0c_1 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v8;  // x20
    unsigned long long v9;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a0->field_c0)
        return 0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = a0->field_8->field_20;
    v9 = sub_a6bf4c(v8 * 0x400, "crypto/ml_dsa/ml_dsa_vector.h", 35);
    a0->field_c0 = v9;
    if (!v9)
        return v9;
    a0->field_c8 = v8;
    return 1;
}
