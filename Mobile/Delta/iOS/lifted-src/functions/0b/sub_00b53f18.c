/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb53f18..0xb53f84 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_b53f18(long long *a0)
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
    sub_a3f73c(a0[44]);
    sub_a3f52c(a0[43]);
    a0[43] = 0;
    a0[44] = 0;
    sub_a18c08(a0[2]);
    sub_a6c2e4(a0[1], "providers/implementations/signature/sm2_sig.c", 346);
    sub_a6c2e4(a0[46], "providers/implementations/signature/sm2_sig.c", 347);
    sub_a6c2e4();
    return;
}
