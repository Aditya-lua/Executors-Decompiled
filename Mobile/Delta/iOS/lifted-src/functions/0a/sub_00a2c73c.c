/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2c73c..0xa2c910 (468 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2c73c_0 {
    struct st_a2c73c_0 *field_0;
    struct st_a2c73c_0 *field_8;
    struct st_a2c73c_0 *field_10;
    unsigned long long field_18;
    struct st_a2c73c_0 *field_20;
    char padding_28[16];
    struct st_a2c73c_1 *field_38;
} st_a2c73c_0;

typedef struct st_a2c73c_1 {
    unsigned long long field_0;
} st_a2c73c_1;


st_a2c73c_0 * sub_a2c73c(st_a2c73c_0 *a0, st_a2c73c_0 *a1)
{
    st_a2c73c_0 *v4;  // x19
    long long v5;  // x22
    st_a2c73c_0 *v6;  // x0
    st_a2c73c_0 *v7;  // x0
    st_a2c73c_0 *v8;  // x0
    long long v9;  // x1
    unsigned long long v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (!a0)
    {
        sub_c66a80();
LABEL_a2c8b8:
        return 0;
    }
    v4 = sub_a6bffc(48, "crypto/encode_decode/decoder_lib.c", 0x100);
    if (!v4)
        return v4;
    v5 = sub_a7a42c(sub_a2d6cc(a0));
    v6 = sub_a2d718(a0);
    if (v6)
    {
        v7 = sub_aa7914(v5, sub_aa7894());
        v4->field_10 = v7;
        *(unsigned int *)&v4->field_20 = 0;
        if (v7)
        {
            v8 = sub_aa7894(v6, v5, "structure");
            if (v8)
                v4->field_18 = sub_aa7914(v5, v8);
            if (sub_a2d050(a0))
            {
                v4->field_0 = a0;
                v4->field_8 = a1;
                return v4;
            }
            sub_a368c8();
            sub_a369bc("crypto/encode_decode/decoder_lib.c", 290, "ossl_decoder_instance_new");
            v9 = 786691;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/encode_decode/decoder_lib.c", 274, "ossl_decoder_instance_new");
            v0 = sub_c4ba8(a0);
            v1 = sub_a2d6f0(a0);
LABEL_a2c870:
            v9 = 524558;
        }
        sub_a36abc(60, v9);
        if (v4->field_0)
            v4->field_0->field_38();
        v4->field_8 = 0;
        sub_a2d06c(0);
        v4->field_0 = 0;
        sub_a6c2e4(v4, "crypto/encode_decode/decoder_lib.c", 309);
        goto LABEL_a2c8b8;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/encode_decode/decoder_lib.c", 263, "ossl_decoder_instance_new");
        v0 = sub_c4ba8(a0);
        goto LABEL_a2c870;
    }
}
