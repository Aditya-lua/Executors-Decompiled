/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaad0dc..0xaad16c (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_aad0dc(long long a0, unsigned long a1, unsigned long a2, long long *a3, unsigned long a4, long long a5)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a99eac(*a3) != 912)
    {
        sub_a368c8();
        sub_a369bc("crypto/rsa/rsa_ameth.c", 639, "rsa_item_verify");
        sub_a36abc(4, 155, 0);
        return 0xffffffff;
    }
    if (0 < (int)sub_aac82c(a0, 0, a3, a5))
        v2 = 2;
    else
        v2 = 0xffffffff;
    return v2;
}
