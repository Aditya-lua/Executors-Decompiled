/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5af48..0xa5afa0 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a5af48(unsigned int *a0)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (*a0 != 28 && *a0 != 920)
    {
        v0 = &v2;
        v1 = v3;
        sub_a368c8();
        sub_a369bc("crypto/evp/p_lib.c", 996, "evp_pkey_get0_DH_int");
        sub_a36abc(6, 128, 0);
        return 0;
    }
}
