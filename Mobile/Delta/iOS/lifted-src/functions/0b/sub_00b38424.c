/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb38424..0xb38534 (272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_b38424(unsigned long a0, long long a1)
{
    unsigned int v2;  // w0
    unsigned int v3;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_b39248();
    if (!v2)
        return v2;
    if (sub_a6fbc4(a1, "safeprime-generator"))
    {
        v3 = sub_a6fc2c();
        if (!v3)
            return v3;
    }
    if (!sub_a6fbc4(a1, "gindex") && !sub_a6fbc4(a1, "pcounter") && !sub_a6fbc4(a1, "hindex") && !sub_a6fbc4(a1, "seed") && !sub_a6fbc4(a1, "qbits") && !sub_a6fbc4(a1, "digest") && !sub_a6fbc4(a1, "properties"))
        return 1;
    sub_a368c8();
    sub_a369bc("providers/implementations/keymgmt/dh_kmgmt.c", 677, "dh_gen_set_params");
    sub_a36abc(57, 0x80106, 0);
    return 0;
}
