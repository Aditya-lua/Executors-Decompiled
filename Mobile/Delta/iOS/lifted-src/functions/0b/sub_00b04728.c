/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb04728..0xb047c4 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b04728_0 {
    char padding_0[120];
    struct st_b04728_0 *field_78;
    struct st_b04728_0 *field_80;
    long long field_88;
} st_b04728_0;


st_b04728_0 * sub_b04728(st_b04728_0 *a0)
{
    st_b04728_0 *v2;  // w0
    st_b04728_0 *v3;  // x0
    st_b04728_0 *v4;  // x8
    st_b04728_0 *v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (st_b04728_0 *)(unsigned int)sub_a2f9e0();
    if (!a0)
    {
        return 0;
    }
    else if (v2)
    {
        v3 = sub_a6dac4(a0, 448, "providers/implementations/ciphers/cipher_aes_wrp.c", 78);
        if (!v3)
        {
            return v3;
        }
        else if (!v3->field_78)
        {
            return v3;
        }
        else if ((int)v3->field_80)
        {
            v4 = sub_a6dac4(v3->field_78, v3->field_88, "providers/implementations/ciphers/cipher_aes_wrp.c", 82);
            v5 = v3;
            v5->field_78 = v4;
            if (v4)
                return v5;
            sub_a6c2e4(v5, "providers/implementations/ciphers/cipher_aes_wrp.c", 84);
            return 0;
        }
        else
        {
            return v3;
        }
    }
    else
    {
        return 0;
    }
}
