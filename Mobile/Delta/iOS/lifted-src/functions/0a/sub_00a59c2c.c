/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa59c2c..0xa59ca4 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a59c2c(long long a0)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a5b018() != 408)
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/p_legacy.c", 79, "evp_pkey_get0_EC_KEY_int");
        sub_a36abc(6, 142, 0);
        return 0;
    }
    v2 = sub_c67c9c(a0);
    if (!v2)
        return v2;
    if (!sub_a18cf0())
        v2 = 0;
    return v2;
}
