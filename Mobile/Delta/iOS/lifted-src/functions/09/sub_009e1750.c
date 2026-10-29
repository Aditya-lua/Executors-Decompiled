/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e1750..0x9e1838 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9e1750(long long a0, long long a1, long long a2, long long a3)
{
    long long v3;  // x19
    long long v4;  // x0
    long long v0;  // [bp-0x34]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    if (a3)
    {
        v3 = 0;
    }
    else
    {
        v3 = sub_9dddcc(0);
        if (!v3)
        {
            sub_a368c8(a0, a1, a2, 0);
            sub_a369bc("crypto/bn/bn_gcd.c", 525, "BN_mod_inverse");
            sub_a36abc(3, 0x80003, 0);
            return 0;
        }
    }
    v4 = sub_9e0e6c();
    if (v0)
    {
        sub_a368c8();
        sub_a369bc("crypto/bn/bn_gcd.c", 532, "BN_mod_inverse");
        sub_a36abc(3, 108, 0);
    }
    sub_9dded4(v3);
    return v4;
}
