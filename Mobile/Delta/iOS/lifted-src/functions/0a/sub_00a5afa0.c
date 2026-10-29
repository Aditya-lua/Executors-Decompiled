/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5afa0..0xa5b018 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a5afa0(unsigned int *a0)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (*a0 != 28 && *a0 != 920)
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/p_lib.c", 996, "evp_pkey_get0_DH_int");
        sub_a36abc(6, 128, 0);
        return 0;
    }
    v2 = sub_c67c9c();
    if (!v2)
        return v2;
    if (!sub_9ffbf8())
        v2 = 0;
    return v2;
}
