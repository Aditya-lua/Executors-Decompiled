/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4d150..0xb4d304 (436 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4d150_0 {
    char padding_0[16];
    struct st_b4d150_0 *field_10;
    char padding_18[336];
    struct st_b4d150_0 *field_168;
    char padding_170[8];
    struct st_b4d150_0 *field_178;
} st_b4d150_0;

typedef struct st_b4d150_1 {
    char padding_0[8];
    struct st_b4d150_0 *field_8;
    struct st_b4d150_0 *field_10;
    char padding_18[328];
    struct st_b4d150_0 *field_160;
    struct st_b4d150_0 *field_168;
    char padding_170[8];
    struct st_b4d150_0 *field_178;
    long long field_180;
    struct st_b4d150_0 *field_188;
    struct st_b4d150_0 *field_190;
} st_b4d150_1;


st_b4d150_0 * sub_b4d150(st_b4d150_1 *a0)
{
    st_b4d150_0 *v2;  // x0
    st_b4d150_0 **v3;  // x21
    st_b4d150_0 **v4;  // x21
    st_b4d150_0 *v5;  // x8
    st_b4d150_0 *v6;  // x20
    st_b4d150_0 *v7;  // x8
    st_b4d150_0 *v8;  // x8
    st_b4d150_0 *v9;  // x8
    st_b4d150_0 *v10;  // x8
    long long *v11;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0() || a0->field_188 || a0->field_190)
    {
LABEL_b4d2f0:
        return 0;
    }
    v2 = sub_a6dac4(a0, 416, "providers/implementations/signature/ecdsa_sig.c", 637);
    if (!v2)
        return v2;
    v3 = v2;
    v3[1] = 0;
    v4 = v3 + 1;
    v4[46] = 0;
    v4[1] = 0;
    v4[43] = 0;
    v4[44] = 0;
    v5 = a0->field_10;
    v6 = v2;
    if (v5)
    {
        v2 = v6;
        if (sub_a18cf0(v5))
        {
            v5 = a0->field_10;
            goto LABEL_b4d1d0;
        }
    }
    else
    {
LABEL_b4d1d0:
        v2->field_10 = v5;
        v7 = a0->field_160;
        if (v7)
        {
            v2 = v6;
            if (sub_a40a98(v7))
            {
                v7 = a0->field_160;
                goto LABEL_b4d1f4;
            }
        }
        else
        {
LABEL_b4d1f4:
            v4[43] = v7;
            if (!a0->field_168 || (v8 = sub_a3f728(), v2 = v6, v6->field_168 = v8, v8 && !(v2 = v6, !sub_a40520(v8, a0->field_168))))
            {
                if (!a0->field_8 || (v9 = sub_a6d9b4(a0->field_8, "providers/implementations/signature/ecdsa_sig.c", 659), v2 = v6, *v4 = v9, v9))
                {
                    if (!a0->field_178)
                        return v2;
                    v10 = sub_a6dac4(a0->field_178, a0->field_180, "providers/implementations/signature/ecdsa_sig.c", 662);
                    v6->field_178 = v10;
                    v2 = v6;
                    if (v10)
                        return v6;
                }
            }
        }
    }
    v11 = v2;
    sub_a3f73c(v2->field_168);
    sub_a3f52c(v11[44]);
    sub_a6c2e4(v11[1], "providers/implementations/signature/ecdsa_sig.c", 620);
    sub_a6c2e4(v11[47], "providers/implementations/signature/ecdsa_sig.c", 621);
    sub_a18c08(v11[2]);
    sub_9e4838(v11[49]);
    sub_9e4838(v11[50]);
    sub_a6c2e4(v11, "providers/implementations/signature/ecdsa_sig.c", 625);
    goto LABEL_b4d2f0;
}
