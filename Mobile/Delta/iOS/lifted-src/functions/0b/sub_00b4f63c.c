/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4f63c..0xb4f738 (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4f63c_0 {
    unsigned long long field_0;
    struct st_b4f63c_0 *field_8;
    struct st_b4f63c_0 *field_10;
    struct st_b4f63c_0 *field_18;
} st_b4f63c_0;


st_b4f63c_0 * sub_b4f63c(st_b4f63c_0 *a0)
{
    st_b4f63c_0 *v2;  // x19
    st_b4f63c_0 *v3;  // x0
    st_b4f63c_0 *v4;  // x22
    st_b4f63c_0 *v5;  // x21
    st_b4f63c_0 *v6;  // x0
    st_b4f63c_0 *v7;  // x8
    st_b4f63c_0 *v8;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
    {
LABEL_b4f720:
        return 0;
    }
    v2 = sub_a6bffc(32, "providers/implementations/signature/mac_legacy_sig.c", 180);
    if (!v2)
        return v2;
    v3 = a0->field_8;
    v2->field_0 = a0->field_0;
    v4 = v2;
    v4->field_8 = 0;
    v4->field_10 = 0;
    v4->field_18 = 0;
    if (v3)
    {
        v5 = sub_a6d9b4(v3, "providers/implementations/signature/mac_legacy_sig.c", 189);
        v4->field_8 = v5;
        if (v5)
        {
            v6 = a0->field_10;
            if (!v6)
                goto LABEL_b4f6cc;
LABEL_b4f6b0:
            if (sub_b3cf38(v6))
            {
                v7 = a0->field_10;
LABEL_b4f6d0:
                v4->field_10 = v7;
                if (!a0->field_18)
                    return v4;
                v8 = sub_a57f5c(a0->field_18);
                v4->field_18 = v8;
                if (v8)
                    return v4;
            }
        }
        sub_a6c2e4(v5, "providers/implementations/signature/mac_legacy_sig.c", 166);
        sub_a57f0c(v4->field_18);
        sub_b3d024(v4->field_10);
        sub_a6c2e4(v4, "providers/implementations/signature/mac_legacy_sig.c", 169);
        goto LABEL_b4f720;
    }
    else
    {
        v5 = 0;
        v6 = a0->field_10;
        if (v6)
            goto LABEL_b4f6b0;
LABEL_b4f6cc:
        v7 = 0;
        goto LABEL_b4f6d0;
    }
}
