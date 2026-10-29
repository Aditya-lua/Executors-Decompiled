/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb23edc..0xb23f70 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b23edc(long long a0, long long *a1)
{
    long long v2;  // x20
    long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0)
    {
        v2 = sub_ac4014();
        v3 = sub_a6dac4(sub_ab1c60(a0), v2, "providers/implementations/encode_decode/encode_key2any.c", 1032);
        if (v3)
        {
            *a1 = v3;
            return v2;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/encode_decode/encode_key2any.c", 0x404, "slh_dsa_spki_pub_to_der");
        sub_a36abc(57, 0xc0102, 0);
    }
    return 0;
}
