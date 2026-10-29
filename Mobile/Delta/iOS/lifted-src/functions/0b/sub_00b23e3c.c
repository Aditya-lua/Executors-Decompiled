/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb23e3c..0xb23edc (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b23e3c_0 {
    struct st_b23e3c_0 *field_0;
} st_b23e3c_0;


st_b23e3c_0 ** sub_b23e3c(long long a0, st_b23e3c_0 **a1)
{
    st_b23e3c_0 **v2;  // x20
    st_b23e3c_0 **v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_ac4024())
    {
        v2 = sub_ac3e68(a0);
        if (!a1)
            return v2;
        v3 = sub_a6dac4(sub_ac4024(a0), v2, "providers/implementations/encode_decode/encode_key2any.c", 1053);
        *a1 = v3;
        if (v3)
            return v2;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/encode_decode/encode_key2any.c", 1047, "slh_dsa_pki_priv_to_der");
        sub_a36abc(57, 0xc0102, 0);
    }
    return 0;
}
