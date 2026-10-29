/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb51f10..0xb521cc (700 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b51f10_0 {
    char padding_0[8];
    long long field_8;
    struct st_b51f10_0 *field_10;
    unsigned int field_18;
    char field_1c;
    char padding_1d[23];
    char field_34;
    char padding_35[51];
    unsigned int field_68;
    char padding_6c[16];
    char field_7c;
    char padding_7d[51];
    unsigned int field_b0;
} st_b51f10_0;


st_b51f10_0 * sub_b51f10(st_b51f10_0 *a0, st_b51f10_0 *a1, unsigned long long *a2, unsigned long a3, unsigned long long a4)
{
    st_b51f10_0 *v3;  // x23
    st_b51f10_0 *v4;  // w0
    st_b51f10_0 *v13;  // x0
    st_b51f10_0 *v14;  // x24
    st_b51f10_0 *v15;  // x0
    st_b51f10_0 *v16;  // x0
    st_b51f10_0 *v17;  // x0
    st_b51f10_0 *v5;  // x0
    st_b51f10_0 *v6;  // x0
    st_b51f10_0 *v7;  // w0
    long long v8;  // x22
    long long v9;  // x0
    long long v10;  // x0
    unsigned long long v11;  // x22
    st_b51f10_0 *v12;  // x23
    char v0;  // [bp-0x44]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a1;
    v4 = (st_b51f10_0 *)(unsigned int)sub_a2f9e0();
    if (!a0)
    {
        return 0;
    }
    else if (v4)
    {
        if (v3)
        {
            v5 = sub_ab146c(v3);
            if (!(unsigned int)v5)
                return v5;
            sub_ab1360(a0->field_10);
            a0->field_10 = v3;
LABEL_b51f78:
            v6 = sub_afe6f0(v3, a4, &v0);
            if (!(unsigned int)v6)
                return v6;
            a0->field_18 = a4;
            a0->field_1c = a0->field_1c | 56;
            *(double *)&a0->field_b0 = nan;
            sub_ab1cb0(a0->field_10, 0xf000);
            switch (v7)
            {
            case 4096:
                a0->field_68 = 6;
                v8 = sub_ab1c98(a0->field_10);
                if (sub_ab8c18(v8))
                    a2();
                v9 = sub_ab8ca8(v8);
                v10 = sub_ab8cd0(v8);
                v11 = sub_ab8ce4(v8);
                v12 = sub_ab8f24(v9);
                v13 = sub_ab8f24(v10);
                if (v12)
                {
                    v14 = v13;
                    if (!v13)
                    {
                        sub_a368c8();
                        sub_a369bc("providers/implementations/signature/rsa_sig.c", 563, "rsa_signverify_init");
                    }
                    else if (sub_a6db20(&a0->field_34, v12, 50) >= 50)
                    {
                        sub_a368c8();
                        sub_a369bc("providers/implementations/signature/rsa_sig.c", 571, "rsa_signverify_init");
                    }
                    else if (sub_a6db20(&a0->field_7c, v14, 50) >= 50)
                    {
                        sub_a368c8();
                        sub_a369bc("providers/implementations/signature/rsa_sig.c", 578, "rsa_signverify_init");
                    }
                    else
                    {
                        a0->field_b0 = v11;
                        v15 = sub_b521cc(a0, v14, a0->field_8);
                        if (!(unsigned int)v15)
                            return v15;
                        v16 = sub_b52328(a0, v12, a0->field_8);
                        if (!(unsigned int)v16)
                            return v16;
                        v17 = sub_b5255c(a0, v11);
                        if (!(unsigned int)v17)
                            return v17;
                        a2();
                    }
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("providers/implementations/signature/rsa_sig.c", 558, "rsa_signverify_init");
                }
                sub_a36abc();
                return 0;
            case 0:
                a0->field_68 = 1;
                a2();
            default:
                sub_a368c8();
                sub_a369bc("providers/implementations/signature/rsa_sig.c", 594, "rsa_signverify_init");
                break;
            }
        }
        else
        {
            v3 = a0->field_10;
            if (v3)
                goto LABEL_b51f78;
            sub_a368c8();
            sub_a369bc("providers/implementations/signature/rsa_sig.c", 515, "rsa_signverify_init");
        }
        sub_a36abc();
        return 0;
    }
    else
    {
        return 0;
    }
}
