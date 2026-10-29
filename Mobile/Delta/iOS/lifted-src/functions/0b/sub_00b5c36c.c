/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5c36c..0xb5c520 (436 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5c36c_0 {
    char padding_0[80];
    long long field_50;
} st_b5c36c_0;


long long sub_b5c36c(st_b5c36c_0 *a0, long long a1)
{
    long long v2;  // x19
    long long v3;  // x0
    long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a6fbc4(a1, "ivlen") && !sub_a70efc())
    {
        v2 = 603;
    }
    else if (!sub_a6fbc4(a1, "padding") || sub_a70210())
    {
        v3 = sub_a6fbc4(a1, "iv");
        if (!v3 || sub_a71800() || sub_a715c0(v3, a0, a0->field_50))
        {
            v4 = sub_a6fbc4(a1, "updated-iv");
            if (v4 && !sub_a71800() && !sub_a715c0(v4, &a0->padding_0[32], a0->field_50))
            {
                v2 = 622;
            }
            else if (sub_a6fbc4(a1, "num") && !sub_a70210())
            {
                v2 = 627;
            }
            else if (!sub_a6fbc4(a1, "keylen") || sub_a70efc())
            {
                if (!sub_a6fbc4(a1, "tls-mac") || sub_a71800())
                    return 1;
                v2 = 638;
            }
            else
            {
                v2 = 632;
            }
        }
        else
        {
            v2 = 615;
        }
    }
    else
    {
        v2 = 608;
    }
    sub_a368c8();
    sub_a369bc("providers/implementations/ciphers/ciphercommon.c", v2, "ossl_cipher_generic_get_ctx_params");
    sub_a36abc(57, 104, 0);
    return 0;
}
