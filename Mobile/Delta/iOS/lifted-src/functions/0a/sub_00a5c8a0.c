/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5c8a0..0xa5c93c (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a5c8a0(long long *a0, long long a1, long long a2)
{
    unsigned long long v6;  // x20
    unsigned long long v7;  // x19
    unsigned long long v8;  // x30
    long long v9;  // x0
    long long v0;  // [bp-0x28]
    unsigned long long v1;  // [bp-0x20]
    unsigned long long v2;  // [bp-0x18]
    char *v3;  // [bp-0x10]
    unsigned long long v4;  // [bp-0x8]
    char v5;  // [bp+0x0]

    if (!a0[4])
        return 0xffffffff;
    v1 = v6;
    v2 = v7;
    v3 = &v5;
    v4 = v8;
    v0 = a0[4];
    v9 = sub_a5a1f8(a0[0x11], a0[1], &v0, a0[2]);
    if (!v9)
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/pmeth_check.c", 40, "try_provided_check");
        sub_a36abc(6, 134, 0);
        return 0;
    }
    return sub_a55bbc(v0, v9, a1, a2);
}
