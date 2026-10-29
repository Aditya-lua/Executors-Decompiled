/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb01794..0xb01910 (380 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b01794_0 {
    char padding_0[48];
    unsigned long long field_30;
    char padding_38[96];
    uint128_t field_98;
    char padding_a8[272];
    char field_1b8;
} st_b01794_0;


unsigned long long sub_b01794(st_b01794_0 *a0, unsigned long long a1)
{
    unsigned long long v4;  // x0
    unsigned long v5;  // x8
    long long v8;  // x19
    long long v9;  // x20
    unsigned long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x24]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = 0;
    if (!a1)
    {
        return 1;
    }
    else if (*(long long *)a1)
    {
        v4 = sub_a6fbc4(a1, "tag");
        if (v4)
        {
            if (*(int *)(v4 + 8) == 5 && *(long long *)(v4 + 24) == 16)
            {
                v5 = a0->padding_a8[264];
                if (!(v5 & 1))
                {
                    *(int128_t *)&(a0->padding_38)[1] = *(int128_t *)*(long long *)(v4 + 16);
                    a0->padding_a8[264] = (char)v5 | 2;
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/ciphers/cipher_aes_gcm_siv.c", 228, "ossl_aes_gcm_siv_set_ctx_params");
                sub_a36abc(57, 103, 0);
                return 0;
            }
        }
        if (sub_a6fbc4(a1, "speed"))
        {
            if (sub_a6ffcc())
            {
                a0->padding_a8[264] = a0->padding_a8[264] & 0xffffffdf | (v1 != 0) * 32;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/ciphers/cipher_aes_gcm_siv.c", 239, "ossl_aes_gcm_siv_set_ctx_params");
                sub_a36abc(57, 103, 0);
                return 0;
            }
        }
        if (!sub_a6fbc4(a1, "keylen"))
            return 1;
        if (sub_a70ef8())
        {
            if (v0 == a0->field_30)
                return 1;
            v8 = 105;
            v9 = 254;
        }
        else
        {
            v8 = 103;
            v9 = 249;
        }
        sub_a368c8();
        sub_a369bc("providers/implementations/ciphers/cipher_aes_gcm_siv.c", v9, "ossl_aes_gcm_siv_set_ctx_params");
        sub_a36abc(57, v8, 0);
        return 0;
    }
    else
    {
        return 1;
    }
}
