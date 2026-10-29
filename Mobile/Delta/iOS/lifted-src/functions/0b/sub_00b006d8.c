/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb006d8..0xb0077c (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b006d8_0 {
    char padding_0[104];
    unsigned int field_68;
} st_b006d8_0;


long long sub_b006d8(st_b006d8_0 *a0, long long a1)
{
    long long v2;  // x0
    long long v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6fbc4(a1, "cts_mode");
    if (v2)
    {
        v3 = sub_b093d0(a0->field_68);
        if (!v3 || !sub_a71468(v2, v3))
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/ciphers/cipher_aes_cts.inc", 56, "aes_cbc_cts_get_ctx_params");
            sub_a36abc(57, 104, 0);
            return 0;
        }
    }
}
