/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2e1e4..0xa2e274 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a2e160;

int sub_a2e1e4(void)
{
    long long *v2;  // x0
    long long *v3;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6820c();
    if (v2)
    {
        v3 = v2;
        if (sub_a7c198(*v2))
        {
            sub_a66c58(v3[1], &g_a2e160);
            sub_a66710(v3[1]);
            sub_a7c1b4(*v3);
            v2 = 1;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/encode_decode/decoder_pkey.c", 809, "ossl_decoder_cache_flush");
            sub_a36abc(60, 0x8003c, 0);
            v2 = 0;
        }
    }
    return (unsigned int)v2;
}
