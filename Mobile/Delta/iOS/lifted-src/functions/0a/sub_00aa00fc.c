/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa00fc..0xaa01b0 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_aa00fc(long long *a0, unsigned long a1, unsigned long a2)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a99eac(a0[3]) != 26)
    {
        return 0;
    }
    else if (a0[4])
    {
        sub_aa038c();
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/pkcs12/p12_add.c", 162, "PKCS12_unpack_p7encdata");
        sub_a36abc(35, 101, 0);
        return 0;
    }
}
