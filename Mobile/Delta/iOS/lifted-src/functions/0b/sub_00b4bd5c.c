/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4bd5c..0xb4bea8 (332 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4bd5c_0 {
    char padding_0[8];
    struct st_b4bd5c_0 *field_8;
    struct st_b4bd5c_0 *field_10;
    char padding_18[336];
    struct st_b4bd5c_0 *field_168;
    struct st_b4bd5c_0 *field_170;
    struct st_b4bd5c_0 *field_178;
} st_b4bd5c_0;

typedef struct st_b4bd5c_1 {
    char padding_0[8];
    struct st_b4bd5c_0 *field_8;
    struct st_b4bd5c_0 *field_10;
    char padding_18[336];
    struct st_b4bd5c_0 *field_168;
    struct st_b4bd5c_0 *field_170;
    struct st_b4bd5c_0 *field_178;
    long long field_180;
} st_b4bd5c_1;


st_b4bd5c_0 * sub_b4bd5c(st_b4bd5c_1 *a0)
{
    st_b4bd5c_0 *v2;  // x19
    st_b4bd5c_0 *v3;  // x21
    st_b4bd5c_0 **v4;  // x21
    st_b4bd5c_0 *v5;  // x8
    st_b4bd5c_0 *v6;  // x8
    st_b4bd5c_0 *v7;  // x0
    st_b4bd5c_0 *v8;  // x0
    st_b4bd5c_0 *v9;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
    {
LABEL_b4be90:
        return 0;
    }
    v2 = sub_a6dac4(a0, 392, "providers/implementations/signature/dsa_sig.c", 637);
    if (!v2)
        return v2;
    v3 = v2;
    v3->field_8 = 0;
    v3->field_10 = 0;
    v4 = &v3->field_8;
    memset(v4 + 44, 0, 24);
    if (!a0->field_10)
    {
        v5 = 0;
        goto LABEL_b4bdc4;
    }
    if (sub_a02090(a0->field_10))
    {
        v5 = a0->field_10;
LABEL_b4bdc4:
        v3->field_10 = v5;
        if (!a0->field_168)
        {
            v6 = 0;
            goto LABEL_b4bde4;
        }
        else if (sub_a40a98(a0->field_168))
        {
            v6 = a0->field_168;
LABEL_b4bde4:
            v4[44] = v6;
            if ((!a0->field_170 || (v7 = sub_a40484(a0->field_170), v3->field_170 = v7, v7)) && (!a0->field_8 || (v8 = sub_a6d9b4(a0->field_8, "providers/implementations/signature/dsa_sig.c", 658), *v4 = v8, v8)))
            {
                if (a0->field_178)
                {
                    v9 = sub_a6dac4(a0->field_178, a0->field_180, "providers/implementations/signature/dsa_sig.c", 661);
                    v3->field_178 = v9;
                    if (v9)
                        return v3;
                }
                else
                {
                    return v3;
                }
            }
        }
    }
    sub_a3f73c(v3->field_170);
    sub_a3f52c(v3->field_168);
    sub_a6c2e4(v3->field_178, "providers/implementations/signature/dsa_sig.c", 623);
    sub_a6c2e4(v3->field_8, "providers/implementations/signature/dsa_sig.c", 624);
    sub_a01fd4(v3->field_10);
    sub_a6c2e4(v3, "providers/implementations/signature/dsa_sig.c", 626);
    goto LABEL_b4be90;
}
