/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb01690..0xb01788 (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b01690_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[12];
    unsigned long long field_18;
} st_b01690_0;

typedef struct st_b01690_1 {
    char padding_0[440];
    char field_1b8;
} st_b01690_1;


unsigned int sub_b01690(st_b01690_1 *a0, long long a1)
{
    st_b01690_0 *v2;  // x0
    long long v3;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6fbc4(a1, "tag");
    if (v2 && v2->field_8 == 5 && (~a0->field_1b8 & 5 || v2->field_18 != 16 || !sub_a715c0()))
    {
        v3 = 185;
    }
    else if (!sub_a6fbc4(a1, "taglen") || sub_a70efc())
    {
        if (!sub_a6fbc4(a1, "keylen") || sub_a70efc())
            return 1;
        v3 = 196;
    }
    else
    {
        v3 = 191;
    }
    sub_a368c8();
    sub_a369bc("providers/implementations/ciphers/cipher_aes_gcm_siv.c", v3, "ossl_aes_gcm_siv_get_ctx_params");
    sub_a36abc(57, 104, 0);
    return 0;
}
