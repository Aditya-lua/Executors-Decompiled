/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5a6c4..0xb5a730 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_b5a6c4(long long *a0)
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
    sub_afe028(a0 + 5);
    sub_a6c2e4(a0[3], "providers/implementations/kdfs/pvkkdf.c", 59);
    sub_a6c4e8(a0[1], a0[2], "providers/implementations/kdfs/pvkkdf.c", 60);
    sub_a66ec0(a0, 64);
    sub_a6c2e4();
    return;
}
