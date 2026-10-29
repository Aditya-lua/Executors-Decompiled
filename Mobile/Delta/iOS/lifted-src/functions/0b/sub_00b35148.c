/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb35148..0xb354a0 (856 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b35148_1 {
    char padding_0[32];
    struct st_b35148_0 *field_20;
    struct st_b35148_0 *field_28;
    struct st_b35148_0 *field_30;
    long long field_38;
} st_b35148_1;

typedef struct st_b35148_2 {
    long long field_0;
    long long field_8;
    long long field_10;
    long long field_18;
    struct st_b35148_0 *field_20;
    struct st_b35148_0 *field_28;
    struct st_b35148_0 *field_30;
    char padding_38[8];
    struct st_b35148_1 *field_40;
} st_b35148_2;

typedef struct st_b35148_0 {
    struct st_b35148_0 *field_0;
} st_b35148_0;

extern char g_10002b0;

st_b35148_0 ** sub_b35148(st_b35148_2 *a0, st_b35148_0 **a1, st_b35148_0 **a2, long long a3, st_b35148_0 **a4)
{
    st_b35148_1 *v5;  // x25
    st_b35148_0 **v6;  // x0
    st_b35148_0 **v15;  // x0
    st_b35148_0 **v16;  // x20
    st_b35148_0 **v7;  // x22
    st_b35148_0 **v8;  // x19
    long long v9;  // x23
    st_b35148_0 **v10;  // w24
    long long v11;  // x0
    st_b35148_0 **v12;  // x0
    st_b35148_0 **n;  // x22
    long long v14;  // x0
    char v0;  // [bp-0x17a]
    char v1;  // [bp-0xf5]
    unsigned long v2;  // [bp-0x70]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    if ((int)a0->field_20 == 1)
    {
        v5 = a0->field_40;
        if (a1)
        {
            if (v5->field_20 > *a4)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/kem/ec_kem.c", 666, "dhkem_encap");
                goto LABEL_b3523c;
            }
            else if (v5->field_28 > *a2)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/kem/ec_kem.c", 670, "dhkem_encap");
LABEL_b3523c:
                sub_a36abc(57, 142);
                v6 = 0;
            }
            else
            {
                v7 = a0->field_28;
                v8 = sub_a18b7c(a0->field_10, a0->field_18);
                if (v8 && sub_a19718(v8, sub_9ffdd0(a0->field_0)))
                {
                    if (!v7 || !a0->field_30)
                    {
                        v9 = a0->field_40->field_38;
                        if (66 >= (unsigned long long)v9 && (int)sub_aa845c(a0->field_10, &v1, v9, 0) >= 1)
                        {
                            v10 = (st_b35148_0 **)(unsigned int)sub_a18dfc(v8, &v1, v9);
                            if (&v1 != v7)
                            {
                                sub_a66ec0(&v1, v9);
                                if (1 <= v10)
                                    goto LABEL_b352d4;
                            }
                            else
                            {
                                if (0 < v10)
                                {
LABEL_b352d4:
                                    v11 = sub_9ffdd0(v8);
                                    v12 = sub_a1d9f8(v11, sub_975ff4(v8), 4, &v1, 133, 0);
                                    if (v12)
                                    {
                                        n = v12;
                                        v14 = sub_9ffdd0(a0->field_0);
                                        v15 = sub_a1d9f8(v14, sub_975ff4(a0->field_0), 4, &v0, 133, 0);
                                        if (v15)
                                        {
                                            if (v15 == n && n == v5->field_30)
                                            {
                                                if (sub_b35bcc(a0, a3, v8, a0->field_0, a0->field_8, a0->field_0, &v1, &v0))
                                                {
                                                    _memcpy(a1, &v1, n);
                                                    *a2 = n;
                                                    *a4 = v5->field_20;
                                                    v16 = 1;
                                                    goto LABEL_b35458;
                                                }
                                            }
                                            else
                                            {
                                                sub_a368c8();
                                                sub_a369bc("providers/implementations/kem/ec_kem.c", 686, "dhkem_encap");
                                                sub_a36abc(57, 158, "Invalid public key");
                                                goto LABEL_b35454;
                                            }
                                        }
                                    }
                                    goto LABEL_b35454;
                                }
                            }
                        }
                    }
                    else if (!((int)sub_a18dfc(v8, v7, a0->field_30) < 1))
                    {
                        goto LABEL_b352d4;
                    }
                }
                sub_a18c08(v8);
                v8 = 0;
LABEL_b35454:
                v16 = 0;
LABEL_b35458:
                sub_a18c08(v8);
                v6 = v16;
            }
        }
        else
        {
            if (!a2 && !a4)
            {
                v6 = 0;
            }
            else
            {
                if (a2)
                    *a2 = v5->field_28;
                if (a4)
                {
                    *a4 = v5->field_20;
                    v6 = 1;
                }
                else
                {
                    v6 = 1;
                }
            }
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/kem/ec_kem.c", 779, "eckem_encapsulate");
        sub_a36abc(57, 125, 0);
        v6 = 0xfffffffe;
    }
    if (*(long long *)&g_10002b0 == v2)
        return v6;
    ___stack_chk_fail();
}
