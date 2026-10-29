/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa002c..0xaa00fc (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_aa002c(long long *a0)
{
    long long v2;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a99eac(a0[3]) != 21)
    {
        sub_a368c8();
        sub_a369bc("crypto/pkcs12/p12_add.c", 78, "PKCS12_unpack_p7data");
        v2 = 121;
    }
    else if (a0[4])
    {
        sub_aa038c();
        sub_a2d030(a0 + 5);
        sub_9f2aec(a0 + 5);
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/pkcs12/p12_add.c", 83, "PKCS12_unpack_p7data");
        v2 = 101;
    }
    sub_a36abc(35, v2, 0);
    return 0;
}
