/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb239b8..0xb23a60 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b239b8(unsigned long a0, unsigned long a1)
{
    long long v2;  // x0
    long long v3;  // x19
    long long v4;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_9ffdd8())
    {
        v2 = sub_9c1acc();
        if (v2)
        {
            v3 = sub_9cf110();
            sub_9c7a84(v2);
            return v3;
        }
        sub_a368c8();
        sub_a369bc("providers/implementations/encode_decode/encode_key2any.c", 0x202, "dh_pki_priv_to_der");
        v4 = 160;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/encode_decode/encode_key2any.c", 0x1fe, "dh_pki_priv_to_der");
        v4 = 0xdd;
    }
    sub_a36abc(57, v4, 0);
    return 0;
}
