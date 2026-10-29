/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97cbc4..0x97cc5c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int * sub_97cbc4(unsigned int *a0)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0 && (*a0 & 0xfffffffc) == 128)
    {
        sub_a368c8();
        sub_a369bc("ssl/quic/quic_impl.c", 880, "ossl_quic_reset");
        sub_a36abc(20, 0x8010c, 0);
        return 0;
    }
    sub_97c738();
    return 0;
}
