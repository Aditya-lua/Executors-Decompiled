/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5ace4..0xa5ad34 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a5ace4(unsigned int *a0)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (*a0 != 116)
    {
        v0 = &v2;
        v1 = v3;
        sub_a368c8();
        sub_a369bc("crypto/evp/p_lib.c", 885, "evp_pkey_get0_DSA_int");
        sub_a36abc(6, 129, 0);
        return 0;
    }
}
