/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3eff8..0xb3f050 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3eff8_0 {
    char padding_0[8];
    long long field_8;
    char padding_10[72];
    struct st_b3eff8_0 *field_58;
} st_b3eff8_0;


void sub_b3eff8(st_b3eff8_0 *a0)
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
    if (a0->field_58)
        sub_a66ec0(a0->field_58, 64);
    sub_a6c2e4(a0->field_8, "providers/implementations/keymgmt/ml_kem_kmgmt.c", 811);
    sub_a6c2e4();
    return;
}
