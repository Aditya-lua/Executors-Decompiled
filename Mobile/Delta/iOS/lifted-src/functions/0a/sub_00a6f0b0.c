/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6f0b0..0xa6f11c (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a6f0b0(long long a0, long long a1, unsigned int a2)
{
    unsigned int v0;  // [bp-0x14]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = a2;
    if (a0 && a1)
        return (unsigned int)sub_a6efbc();
    sub_a368c8();
    sub_a369bc("crypto/param_build.c", 0x88, "OSSL_PARAM_BLD_push_uint");
    sub_a36abc(15, 0xc0102, 0);
    return 0;
}
