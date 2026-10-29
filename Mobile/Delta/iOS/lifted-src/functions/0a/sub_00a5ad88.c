/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5ad88..0xa5adfc (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a5ad88(unsigned int *a0)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (*a0 != 116)
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/p_lib.c", 885, "evp_pkey_get0_DSA_int");
        sub_a36abc(6, 129, 0);
    }
    else
    {
        v2 = sub_c67c9c();
        if (!v2)
        {
            return v2;
        }
        else if (sub_a02090())
        {
            return v2;
        }
    }
    return 0;
}
