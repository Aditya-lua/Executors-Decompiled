/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5cde8..0xa5ce38 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_a5cde8(unsigned int *a0)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (*a0 != 4)
    {
        v0 = &v2;
        v1 = v3;
        sub_a368c8();
        sub_a369bc("crypto/evp/pmeth_gn.c", 268, "EVP_PKEY_keygen");
        sub_a36abc(6, 151, 0);
        return 0xffffffff;
    }
}
