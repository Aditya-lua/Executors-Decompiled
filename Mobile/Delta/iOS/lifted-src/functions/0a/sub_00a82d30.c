/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa82d30..0xa82e24 (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a82d30_1 {
    struct st_a82d30_0 *field_0;
    char padding_8[8];
    long long field_10;
    long long field_18;
    long long field_20;
    long long field_28;
    char padding_30[16];
    struct st_a82d30_1 *field_40;
    char padding_48[8];
    struct st_a82d30_1 *field_50;
    char padding_58[8];
    struct st_a82d30_1 *field_60;
    char padding_68[4];
    char field_6c;
    char padding_6d[67];
    struct st_a82d30_1 *field_b0;
} st_a82d30_1;

typedef struct st_a82d30_0 {
    char padding_0[8];
    long long field_8;
    char padding_10[56];
    int field_48;
} st_a82d30_0;


void sub_a82d30(st_a82d30_1 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    sub_a3f52c(a0->field_10);
    sub_a3f52c(a0->field_18);
    sub_a3f52c(a0->field_20);
    sub_a3f52c(a0->field_28);
    if (a0->field_b0 || !a0->field_50 && a0->field_60)
    {
        sub_a66ec0(&a0->field_6c, 64);
        if (a0->field_b0)
        {
            sub_a66ec0(a0->field_b0, a0->field_0->field_8);
            sub_a6c2e4(a0->field_b0, "crypto/ml_kem/ml_kem.c", 2069);
        }
    }
    if (a0->field_40)
    {
        if (a0->field_50)
            sub_a66ec0(a0->field_50, 64 | a0->field_0->field_48 * 0x200);
        sub_a6c2e4();
        memset(&a0->field_40, 0, 40);
    }
    sub_a6c2e4();
    return;
}
