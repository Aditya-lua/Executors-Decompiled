/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb00dd0..0xb00e2c (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b00dd0_0 {
    char padding_0[640];
    struct st_b00dd0_0 *field_280;
} st_b00dd0_0;


st_b00dd0_0 * sub_b00dd0(st_b00dd0_0 *a0)
{
    st_b00dd0_0 *v2;  // w0
    st_b00dd0_0 *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (st_b00dd0_0 *)(unsigned int)sub_a2f9e0();
    if (!a0)
    {
        return 0;
    }
    else if (v2)
    {
        v3 = sub_a6dac4(a0, 960, "providers/implementations/ciphers/cipher_aes_gcm.c", 48);
        if (!v3)
        {
            return v3;
        }
        else if (v3->field_280)
        {
            v3->field_280 = &v3[1].padding_0[56];
            return v3;
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
