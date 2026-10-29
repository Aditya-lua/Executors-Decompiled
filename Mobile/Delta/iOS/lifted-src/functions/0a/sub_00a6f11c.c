/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6f11c..0xa6f188 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a6f11c(long long a0, long long a1, unsigned long long a2)
{
    unsigned long long v0;  // [bp-0x18]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = a2;
    if (a0 && a1)
        return (unsigned int)sub_a6efbc();
    sub_a368c8();
    sub_a369bc("crypto/param_build.c", 148, "OSSL_PARAM_BLD_push_long");
    sub_a36abc(15, 0xc0102, 0);
    return 0;
}
