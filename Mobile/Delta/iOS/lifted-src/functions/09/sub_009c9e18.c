/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c9e18..0x9c9ec4 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_9c9e18(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9cf6bc();
    if (v2)
    {
        if (sub_9c9c30())
            return v2;
        sub_9cf6c8(v2);
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/asn1/p5_pbe.c", 97, "PKCS5_pbe_set_ex");
        sub_a36abc(13, 0x8000b, 0);
    }
    return 0;
}
