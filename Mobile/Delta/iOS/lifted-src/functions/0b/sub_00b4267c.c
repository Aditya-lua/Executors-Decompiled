/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4267c..0xb426d0 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4267c_0 {
    char padding_0[16];
    long long field_10;
} st_b4267c_0;


void sub_b4267c(st_b4267c_0 *a0)
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
    sub_a66ec0(a0 + 1, 96);
    sub_a6c2e4(a0->field_10, "providers/implementations/keymgmt/slh_dsa_kmgmt.c", 436);
    sub_a6c2e4();
    return;
}
