/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb08664..0xb08840 (476 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b08664_0 {
    char padding_0[108];
    char field_6c;
} st_b08664_0;


char sub_b08664(st_b08664_0 *a0, long long a1)
{
    long long v2;  // x1
    char v3;  // x0
    unsigned long long v5;  // 4113
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a6fbc4(a1, "ivlen") && !sub_a70efc())
    {
        sub_a368c8();
        v2 = 107;
    }
    else if (sub_a6fbc4(a1, "keylen") && !sub_a70efc())
    {
        sub_a368c8();
        v2 = 113;
    }
    else if (sub_a6fbc4(a1, "taglen") && !sub_a70efc())
    {
        sub_a368c8();
        v2 = 118;
    }
    else if (!sub_a6fbc4(a1, "tlsaadpad") || sub_a70efc())
    {
        v3 = sub_a6fbc4(a1, "tag");
        if (!v3)
            return 1;
        if (*(int *)(v3 + 8) == 5)
        {
            if (!(a0->field_6c >> 1 & 1))
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/ciphers/cipher_chacha20_poly1305.c", 134, "chacha20_poly1305_get_ctx_params");
                sub_a36abc(57, 0x77, 0);
                return 0;
            }
            v5 = arm64g_calculate_condition(130, *(long long *)(v3 + 24) - 0x11, 0x11, 0);
            if (v5 & 1)
            {
                _memcpy(*(long long *)(v3 + 16), &a0[7].padding_0[1]);
                return 1;
            }
            sub_a368c8();
            sub_a369bc("providers/implementations/ciphers/cipher_chacha20_poly1305.c", 138, "chacha20_poly1305_get_ctx_params");
            sub_a36abc(57, 118, 0);
            return 0;
        }
        sub_a368c8();
        v2 = 130;
    }
    else
    {
        sub_a368c8();
        v2 = 123;
    }
    sub_a369bc("providers/implementations/ciphers/cipher_chacha20_poly1305.c", v2, "chacha20_poly1305_get_ctx_params");
    sub_a36abc(57, 104, 0);
    return 0;
}
