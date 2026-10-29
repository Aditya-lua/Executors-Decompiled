/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6f274..0xa6f344 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a6f274(long long a0, long long a1, long long a2, unsigned long a3)
{
    char v0;  // [bp-0x34], Other Possible Types: long long
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (a0 && a1 && a2 && sub_9e5c94(a2))
    {
        sub_c69188(a2, a0, a1, &v0);
        return v0;
    }
    sub_a368c8();
    sub_a369bc("crypto/param_build.c", 312, "OSSL_PARAM_BLD_push_BN_pad");
    sub_a36abc(15, 0xc0102, 0);
    return 0;
}
