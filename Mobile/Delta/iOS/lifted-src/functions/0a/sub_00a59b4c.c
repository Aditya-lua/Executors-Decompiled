/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa59b4c..0xa59bc4 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a59b4c(long long *a0)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (*(int *)a0 != 6 && *(int *)a0 != 912)
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/p_legacy.c", 43, "evp_pkey_get0_RSA_int");
        sub_a36abc(6, 127, 0);
        return 0;
    }
    v2 = sub_c67c9c();
    if (!v2)
        return v2;
    if (!sub_ab146c())
        v2 = 0;
    return v2;
}
