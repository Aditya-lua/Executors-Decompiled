/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb008dc..0xb00930 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b008dc_0 {
    char padding_0[128];
    unsigned long long field_80;
} st_b008dc_0;


st_b008dc_0 * sub_b008dc(st_b008dc_0 *a0)
{
    st_b008dc_0 *v2;  // w0
    st_b008dc_0 *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (st_b008dc_0 *)(unsigned int)sub_a2f9e0();
    if (!a0)
    {
        return 0;
    }
    else if (v2)
    {
        v3 = sub_a6dac4(a0, 416, "providers/implementations/ciphers/cipher_aes_ccm.c", 46);
        if (!v3)
            return v3;
        v3->field_80 = &v3[1].padding_0[32];
        return v3;
    }
    else
    {
        return 0;
    }
}
