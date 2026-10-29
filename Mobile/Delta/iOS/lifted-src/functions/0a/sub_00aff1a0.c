/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaff1a0..0xaff4fc (860 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aff1a0_0 {
    struct st_aff1a0_0 *field_0;
    struct st_aff1a0_0 *field_8;
    struct st_aff1a0_0 *field_10;
    struct st_aff1a0_0 *field_18;
    struct st_aff1a0_0 *field_20;
    struct st_aff1a0_0 *field_28;
    unsigned long long field_30;
    struct st_aff1a0_0 *field_38;
    struct st_aff1a0_0 *field_3c;
    struct st_aff1a0_0 *field_40;
} st_aff1a0_0;

extern char g_10002b0;

st_aff1a0_0 * sub_aff1a0(st_aff1a0_0 *a0, st_aff1a0_0 *a1)
{
    st_aff1a0_0 *v23;  // x0
    st_aff1a0_0 *v24;  // x0
    st_aff1a0_0 *v25;  // w8
    st_aff1a0_0 *v26;  // x21
    st_aff1a0_0 *v27;  // x0
    unsigned long v0;  // [bp-0x188]
    st_aff1a0_0 *v1;  // [bp-0x180]
    st_aff1a0_0 **v2;  // [bp-0x178], Other Possible Types: char *, st_aff1a0_0 *
    st_aff1a0_0 *v3;  // [bp-0x170]
    st_aff1a0_0 *v4;  // [bp-0x160]
    st_aff1a0_0 *v5;  // [bp-0x150]
    st_aff1a0_0 *v6;  // [bp-0x140]
    st_aff1a0_0 *v7;  // [bp-0x130]
    st_aff1a0_0 *v8;  // [bp-0x120]
    st_aff1a0_0 *v9;  // [bp-0x110]
    st_aff1a0_0 *v10;  // [bp-0x100]
    st_aff1a0_0 *v11;  // [bp-0xf0]
    st_aff1a0_0 *v12;  // [bp-0xe0]
    st_aff1a0_0 *v13;  // [bp-0xd0]
    st_aff1a0_0 *v14;  // [bp-0xc0]
    st_aff1a0_0 *v15;  // [bp-0xb0]
    st_aff1a0_0 *v16;  // [bp-0xa0]
    st_aff1a0_0 *v17;  // [bp-0x90]
    st_aff1a0_0 *v18;  // [bp-0x80]
    char v19;  // [bp-0x6a]
    unsigned long v20;  // [bp-0x38]
    char *v21;  // [bp-0x10]
    char v22;  // [bp+0x0]

    v21 = &v22;
    v20 = *(long long *)&g_10002b0;
    v17 = (st_aff1a0_0 *)0;
    v18 = (st_aff1a0_0 *)0;
    v15 = (st_aff1a0_0 *)0;
    v16 = (st_aff1a0_0 *)0;
    v13 = (st_aff1a0_0 *)0;
    v14 = (st_aff1a0_0 *)0;
    v11 = (st_aff1a0_0 *)0;
    v12 = (st_aff1a0_0 *)0;
    v10 = (st_aff1a0_0 *)0;
    v8 = (st_aff1a0_0 *)0;
    v9 = (st_aff1a0_0 *)0;
    v6 = (st_aff1a0_0 *)0;
    v7 = (st_aff1a0_0 *)0;
    v4 = (st_aff1a0_0 *)0;
    v5 = (st_aff1a0_0 *)0;
    v3 = (st_aff1a0_0 *)0;
    v2 = 0;
    v23 = a0;
    if (v23)
    {
        if (!a1 || !a1->field_0)
        {
LABEL_aff4c8:
            v23 = 1;
        }
        else if (sub_a6fbc4(a1, "digest"))
        {
            v2 = &v19;
            v23 = sub_a71220();
            if ((unsigned int)v23 && (!sub_a6fbc4(a1, "digest-props") || (v2 = &v3, v23 = sub_a71220(), (unsigned int)v23)))
            {
                sub_a3f52c(a0->field_18);
                v23 = sub_a40ca8(a0->field_0, &v19, &v3);
                a0->field_18 = v23;
                if (v23)
                    goto LABEL_aff284;
            }
        }
        else
        {
LABEL_aff284:
            v24 = sub_a6fbc4(a1, "pad-mode");
            if (v24)
            {
                *(unsigned int *)&v1 = 0;
                if ((int)v24->field_8 == 4)
                {
                    v26 = v24->field_10;
                    if (!v26)
                        goto LABEL_aff3dc;
                    if (!_strcmp(v26, "pkcs1"))
                    {
                        v25 = (st_aff1a0_0 *)1;
                        goto LABEL_aff338;
                    }
                    if (_strcmp(v26, "none"))
                    {
                        if (_strcmp(v26, "oaep") && _strcmp(v26, "oeap"))
                        {
                            v25 = (st_aff1a0_0 *)0;
                            goto LABEL_aff37c;
                        }
                        else
                        {
                            v25 = (st_aff1a0_0 *)4;
                            goto LABEL_aff338;
                        }
                    }
                    else
                    {
                        v25 = (st_aff1a0_0 *)3;
LABEL_aff338:
                        v1 = v25;
LABEL_aff33c:
                        switch (v25)
                        {
                        case 6:
LABEL_aff3dc:
                            v23 = 0;
                            break;
                        case 4:
                            if (a0->field_18)
                            {
                                v25 = (st_aff1a0_0 *)4;
                            }
                            else
                            {
                                v27 = sub_a40ca8(a0->field_0, "SHA1", &v3);
                                a0->field_18 = v27;
                                if (!v27)
                                    goto LABEL_aff3dc;
                                v25 = (st_aff1a0_0 *)(unsigned int)v1;
                            }
LABEL_aff37c:
                            *(unsigned int *)&a0->field_10 = (unsigned int)v25;
                            goto LABEL_aff380;
                        default:
                            goto LABEL_aff37c;
                        }
                    }
                }
                else if ((int)v24->field_8 == 1 && sub_a6fc2c())
                {
                    v25 = (st_aff1a0_0 *)(unsigned int)v1;
                    goto LABEL_aff33c;
                }
            }
            else
            {
LABEL_aff380:
                if (!sub_a6fbc4(a1, "mgf1-digest"))
                {
LABEL_aff408:
                    if (sub_a6fbc4(a1, "oaep-label"))
                    {
                        v1 = 0;
                        v23 = sub_a71440();
                        if ((unsigned int)v23)
                        {
                            sub_a6c2e4(a0->field_28, "providers/implementations/asymciphers/rsa_enc.c", 571);
                            a0->field_28 = v1;
                            a0->field_30 = v0;
                        }
                        else
                        {
                            if (*(long long *)&g_10002b0 == v20)
                                return v23;
                            ___stack_chk_fail();
                        }
                    }
                    if (sub_a6fbc4(a1, "tls-client-version"))
                    {
                        v23 = sub_a6ffcc();
                        if ((unsigned int)v23)
                        {
                            *(unsigned int *)&a0->field_38 = (unsigned int)v1;
                        }
                        else
                        {
                            if (*(long long *)&g_10002b0 == v20)
                                return v23;
                            ___stack_chk_fail();
                        }
                    }
                    if (sub_a6fbc4(a1, "tls-negotiated-version"))
                    {
                        v23 = sub_a6ffcc();
                        if ((unsigned int)v23)
                        {
                            *(unsigned int *)((char *)&a0->field_38 + 4) = (unsigned int)v1;
                        }
                        else
                        {
                            if (*(long long *)&g_10002b0 == v20)
                                return v23;
                            ___stack_chk_fail();
                        }
                    }
                    if (sub_a6fbc4(a1, "implicit-rejection"))
                    {
                        v23 = sub_a6ffcc();
                        if ((unsigned int)v23)
                        {
                            *(unsigned int *)&a0->field_3c = (unsigned int)v1;
                            goto LABEL_aff4c8;
                        }
                        else
                        {
                            if (*(long long *)&g_10002b0 == v20)
                                return v23;
                            ___stack_chk_fail();
                        }
                    }
                }
                v2 = &v19;
                v23 = sub_a71220();
                if ((unsigned int)v23)
                {
                    if (sub_a6fbc4(a1, "mgf1-properties"))
                    {
                        v2 = &v3;
                        v23 = sub_a71220();
                        if ((unsigned int)v23)
                            goto LABEL_aff3e8;
                    }
                    else
                    {
                        v2 = 0;
LABEL_aff3e8:
                        sub_a3f52c(a0->field_20);
                        v23 = sub_a40ca8(a0->field_0, &v19, v2);
                        a0->field_20 = v23;
                        if (v23)
                            goto LABEL_aff408;
                    }
                }
            }
        }
    }
    if (*(long long *)&g_10002b0 == v20)
        return v23;
    ___stack_chk_fail();
}
