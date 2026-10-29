/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2ca84..0xa2cb00 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a2ca84(void* a0, unsigned long a1)
{
    unsigned long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (long long)a0[24];
    if (!v2)
    {
        v2 = sub_ad61b4(0);
        *(unsigned long *)&a0[24] = v2;
        if (!v2)
        {
            sub_a368c8();
            sub_a369bc("crypto/encode_decode/decoder_lib.c", 361, "ossl_decoder_ctx_add_decoder_inst");
            sub_a36abc(60, 0x8000f, 0);
            return 0;
        }
    }
    return (int)sub_ad68a0(v2) > 0;
}
