/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb031d4..0xb0346c (664 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b031d4_0 {
    char padding_0[32];
    char field_20;
    char padding_21[47];
    long long field_50;
    char padding_58[20];
    char field_6c;
    char padding_6d[763];
    unsigned long long field_368;
} st_b031d4_0;


char sub_b031d4(st_b031d4_0 *a0, long long a1)
{
    long long v2;  // x1
    char v3;  // x0
    char v5;  // x0
    char v7;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a6fbc4(a1, "ivlen") && !sub_a70efc())
    {
        sub_a368c8();
        v2 = 422;
    }
    else if (sub_a6fbc4(a1, "keylen") && !sub_a70efc())
    {
        sub_a368c8();
        v2 = 427;
    }
    else if (!sub_a6fbc4(a1, "taglen") || sub_a70efc())
    {
        v3 = sub_a6fbc4(a1, "iv");
        if (v3)
        {
            if ((unsigned long long)a0->field_50 > (unsigned long long)*(long long *)(v3 + 24))
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/ciphers/cipher_aes_ocb.c", 441, "aes_ocb_get_ctx_params");
                sub_a36abc(57, 109, 0);
                return 0;
            }
            if (sub_a715c0() || sub_a71800(v3, a0, a0->field_50))
                goto LABEL_b032e8;
            sub_a368c8();
            v2 = 446;
        }
        else
        {
LABEL_b032e8:
            v5 = sub_a6fbc4(a1, "updated-iv");
            if (v5)
            {
                if ((unsigned long long)a0->field_50 > (unsigned long long)*(long long *)(v5 + 24))
                {
                    sub_a368c8();
                    sub_a369bc("providers/implementations/ciphers/cipher_aes_ocb.c", 453, "aes_ocb_get_ctx_params");
                    sub_a36abc(57, 109, 0);
                    return 0;
                }
                if (sub_a715c0() || sub_a71800(v5, &a0->field_20, a0->field_50))
                    goto LABEL_b03398;
                sub_a368c8();
                v2 = 458;
            }
            else
            {
LABEL_b03398:
                v7 = sub_a6fbc4(a1, "tag");
                if (!v7)
                {
                    return 1;
                }
                else if (*(int *)(v7 + 8) == 5)
                {
                    if (a0->field_6c >> 1 & 1 && *(long long *)(v7 + 24) == a0->field_368)
                    {
                        _memcpy(*(long long *)(v7 + 16), &a0[1].padding_0[16]);
                        return 1;
                    }
                    sub_a368c8();
                    sub_a369bc("providers/implementations/ciphers/cipher_aes_ocb.c", 469, "aes_ocb_get_ctx_params");
                    sub_a36abc(57, 118, 0);
                    return 0;
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("providers/implementations/ciphers/cipher_aes_ocb.c", 465, "aes_ocb_get_ctx_params");
                    sub_a36abc(57, 103, 0);
                    return 0;
                }
            }
        }
    }
    else
    {
        sub_a368c8();
        v2 = 433;
    }
    sub_a369bc("providers/implementations/ciphers/cipher_aes_ocb.c", v2, "aes_ocb_get_ctx_params");
    sub_a36abc(57, 104, 0);
    return 0;
}
