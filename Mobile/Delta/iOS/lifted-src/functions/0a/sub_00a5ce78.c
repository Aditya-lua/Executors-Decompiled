/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5ce78..0xa5cf34 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int * sub_a5ce78(unsigned long a0, unsigned long a1, long long a2, long long a3)
{
    unsigned int *v3;  // x0
    unsigned int *v4;  // x19
    unsigned int *v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    v3 = sub_a5d7a0();
    if (!v3)
        return v3;
    v4 = v3;
    if ((int)sub_a5c944() >= 1 && (int)sub_a5e690(v4, a2, a3) >= 1)
    {
        if (*v4 == 4)
        {
            sub_a5ca98(v4, &v0);
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/evp/pmeth_gn.c", 268, "EVP_PKEY_keygen");
            sub_a36abc(6, 151, 0);
        }
    }
    sub_a5d6b0(v4);
    return v0;
}
