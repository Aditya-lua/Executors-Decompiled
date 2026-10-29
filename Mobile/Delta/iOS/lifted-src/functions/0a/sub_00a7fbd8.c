/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7fbd8..0xa7fcd4 (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a7fbd8_1 {
    char padding_0[8];
    struct st_a7fbd8_0 *field_8;
    char padding_10[112];
    char field_80;
    char padding_81[31];
    long long field_a0;
    long long field_a8;
    long long field_b0;
    char padding_b8[8];
    long long field_c0;
    long long field_c8;
    long long field_d0;
    unsigned long long field_d8;
    long long field_e0;
    unsigned long long field_e8;
    long long field_f0;
    long long field_f8;
} st_a7fbd8_1;

typedef struct st_a7fbd8_0 {
    char padding_0[64];
    long long field_40;
} st_a7fbd8_0;


long long sub_a7fbd8(st_a7fbd8_1 *a0)
{
    unsigned long long *v2;  // x20
    long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = &a0->field_f0;
    if (a0->field_f0)
    {
        _bzero(a0->field_f0, a0->field_f8 * 0x400);
        if (a0->field_e0)
            _bzero(a0->field_e0, a0->field_e8 * 0x400);
        if (a0->field_d0)
            _bzero(a0->field_d0, a0->field_d8 * 0x400);
        sub_a6c2e4(a0->field_f0, "crypto/ml_dsa/ml_dsa_vector.h", 44);
        *v2 = 0;
        v2[1] = 0;
        a0->field_e0 = 0;
        a0->field_d0 = 0;
    }
    sub_a6c2e4(a0->field_c0, "crypto/ml_dsa/ml_dsa_vector.h", 44);
    a0->field_c0 = 0;
    a0->field_c8 = 0;
    sub_a66ec0(&a0->field_80, 32);
    sub_a6c2e4(a0->field_a0, "crypto/ml_dsa/ml_dsa_key.c", 161);
    a0->field_a0 = 0;
    if (a0->field_a8)
        sub_a6c4e8(a0->field_a8, a0->field_8->field_40, "crypto/ml_dsa/ml_dsa_key.c", 164);
    a0->field_a8 = 0;
    v3 = a0->field_b0;
    if (v3)
        v3 = sub_a6c4e8(v3, 32, "crypto/ml_dsa/ml_dsa_key.c", 167);
    a0->field_b0 = 0;
    return v3;
}
