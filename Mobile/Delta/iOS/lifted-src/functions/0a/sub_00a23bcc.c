/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa23bcc..0xa23fd0 (1028 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a23bcc_0 {
    struct st_a23bcc_0 *field_0;
    unsigned long long field_8;
    char padding_10[8];
    long long field_18;
    struct st_a23bcc_0 *field_20;
    char padding_28[128];
    long long field_a8;
    char padding_b0[32];
    struct st_a23bcc_0 *field_d0;
} st_a23bcc_0;


st_a23bcc_0 * sub_a23bcc(st_a23bcc_0 *a0, st_a23bcc_0 *a1)
{
    st_a23bcc_0 *v4;  // x20
    st_a23bcc_0 *v5;  // x0
    st_a23bcc_0 *v6;  // x0
    st_a23bcc_0 *v7;  // x19
    st_a23bcc_0 *v8;  // x21
    st_a23bcc_0 *v9;  // x24
    st_a23bcc_0 *v10;  // x22
    st_a23bcc_0 *v11;  // x23
    st_a23bcc_0 *v12;  // w8
    unsigned long long v13;  // 4102
    unsigned long v0;  // [bp-0xb0]
    st_a23bcc_0 *v1;  // [bp-0xa4]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a1;
    sub_a1a12c();
    v5 = sub_c4c40(a0);
    if (!v5)
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ecp_nistz256.c", 818, "ecp_nistz256_mult_precompute");
        sub_a36abc(16, 113, 0);
    }
    else if (sub_a248a0())
    {
        return 1;
    }
    else if (a0)
    {
        v6 = sub_a6bffc(40, "crypto/ec/ecp_nistz256.c", 1195);
        if (!v6)
            return v6;
        v7 = v6;
        v6->field_0 = a0;
        v6->field_8 = 6;
        /* unsupported instruction */;
        *(unsigned int *)&v6->field_20 = 1;
        if (v4)
        {
            v8 = 0;
LABEL_a23cbc:
            sub_9de064(v4);
            if (sub_c4ba8(a0))
            {
                if (sub_9e4828())
                {
                    sub_a368c8();
                    sub_a369bc("crypto/ec/ecp_nistz256.c", 846, "ecp_nistz256_mult_precompute");
                    sub_a36abc(16, 114, 0);
                }
                else
                {
                    v9 = sub_a6bf4c(0x25040, "crypto/ec/ecp_nistz256.c", 852);
                    if (v9)
                    {
                        v10 = sub_a1a56c(a0);
                        v11 = sub_a1a56c(a0);
                        if (v10 && v11 && sub_a1a654(v11, v5))
                        {
                            v1 = (st_a23bcc_0 *)0;
                            v0 = (v9 & 0xffffffffffffffc0) + 64;
                            if (sub_a1a654(v10, v11) && a0->field_0->field_d0)
                                a0->field_0->field_d0();
                        }
                    }
                    else
                    {
                        v10 = 0;
                        v11 = 0;
                    }
LABEL_a23d14:
                    sub_9de17c(v4);
                    sub_9dded4(v8);
                    if (v7)
                    {
                        do
                        {
                            /* unsupported instruction */;
                            v12 = (st_a23bcc_0 *)/* unsupported instruction */;
                            /* unsupported instruction */;
                            /* unsupported instruction */;
                        } while (/* unsupported instruction */ ^ 1);
                        v13 = arm64g_calculate_condition(19, (unsigned long long)v12, 1, 0);
                        if (!(v13 & 1))
                        {
                            /* unsupported instruction */;
                        }
                        else if (1 < v12)
                        {
                            goto LABEL_a23d78;
                        }
                        sub_a6c2e4(v7->field_18, "crypto/ec/ecp_nistz256.c", 1231);
                        sub_a6c2e4(v7, "crypto/ec/ecp_nistz256.c", 1233);
                    }
LABEL_a23d78:
                    sub_a6c2e4(v9, "crypto/ec/ecp_nistz256.c", 909);
                    sub_a1a254(v10);
                    sub_a1a254(v11);
                    return 0;
                }
            }
        }
        else
        {
            v4 = sub_9dddcc(a0->field_a8);
            v8 = v4;
            if (v4)
                goto LABEL_a23cbc;
        }
        v10 = 0;
        v11 = 0;
        v9 = 0;
        goto LABEL_a23d14;
    }
    return 0;
}
