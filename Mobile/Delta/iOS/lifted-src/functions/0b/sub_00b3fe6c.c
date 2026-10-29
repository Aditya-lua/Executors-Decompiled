/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3fe6c..0xb3fec8 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_b3fe6c(long long *a0)
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
    sub_a6c2e4(a0[1], "providers/implementations/keymgmt/mlx_kmgmt.c", 0x44);
    sub_a5a4c8(a0[4]);
    sub_a5a4c8(a0[5]);
    sub_a6c2e4();
    return;
}
