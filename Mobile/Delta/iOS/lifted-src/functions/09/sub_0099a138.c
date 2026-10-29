/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99a138..0x99a188 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_99a138(unsigned long a0, long long a1)
{
    unsigned long long v3;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!a1)
        return 1;
    v0 = &v2;
    v1 = v3;
    sub_a368c8();
    sub_a369bc("ssl/record/methods/tlsany_meth.c", 28, "tls_any_set_crypto_state");
    sub_a36abc(20, 0xc0103, 0);
    return 0xfffffffe;
}
