/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa59af4..0xa59b4c (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a59af4(long long *a0)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (*(int *)a0 != 6 && *(int *)a0 != 912)
    {
        v0 = &v2;
        v1 = v3;
        sub_a368c8();
        sub_a369bc("crypto/evp/p_legacy.c", 43, "evp_pkey_get0_RSA_int");
        sub_a36abc(6, 127, 0);
        return 0;
    }
}
