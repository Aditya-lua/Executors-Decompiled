/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb36864..0xb368c0 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_b36864(long long *a0)
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
    sub_a6c4e8(a0[5], a0[6], "providers/implementations/kem/ecx_kem.c", 174);
    sub_a2a8a4(*a0);
    *a0 = 0;
    sub_a2a8a4(a0[1]);
    a0[1] = 0;
}
