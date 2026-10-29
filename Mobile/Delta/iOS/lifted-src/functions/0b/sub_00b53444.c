/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb53444..0xb53498 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b53444_0 {
    char padding_0[8];
    long long field_8;
    char padding_10[264];
    char field_118;
    char padding_119[55];
    long long field_150;
} st_b53444_0;


void sub_b53444(st_b53444_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    sub_ac3738(a0->field_8);
    sub_a6c2e4(a0->field_150, "providers/implementations/signature/slh_dsa_sig.c", 63);
    sub_a66ec0(&a0->field_118, 32);
    sub_a6c2e4();
    return;
}
