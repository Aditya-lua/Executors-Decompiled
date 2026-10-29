/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb23dbc..0xb23e3c (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_b23dbc(void* a0, void* *a1)
{
    void* v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/encode_decode/encode_key2any.c", 788, "ecx_spki_pub_to_der");
        sub_a36abc(57, 0xc0102, 0);
        return 0;
    }
    v2 = sub_a6dac4(a0 + 0x11, (long long)a0[88], "providers/implementations/encode_decode/encode_key2any.c", 792);
    if (!v2)
        return v2;
    *a1 = v2;
    return (int)a0[88];
}
