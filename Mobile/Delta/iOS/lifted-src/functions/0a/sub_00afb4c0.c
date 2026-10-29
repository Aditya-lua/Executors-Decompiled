/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafb4c0..0xafb528 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_afb4c0(void)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_afb440();
    if (!v2)
    {
        return v2;
    }
    else if (!sub_a5bba8())
    {
        sub_a368c8(v2);
        sub_a369bc("crypto/x509/x_pubkey.c", 478, "X509_PUBKEY_get");
        sub_a36abc(11, 0xc0103, 0);
        return 0;
    }
    else
    {
        return v2;
    }
}
