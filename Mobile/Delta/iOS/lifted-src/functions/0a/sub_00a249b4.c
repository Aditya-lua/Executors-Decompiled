/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa249b4..0xa24dc8 (1044 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a249b4_3 {
    struct st_a249b4_1 *field_0;
    char padding_8[56];
    long long field_40;
    char padding_48[40];
    struct st_a249b4_0 *field_70;
    char padding_78[48];
    long long field_a8;
} st_a249b4_3;

typedef struct st_a249b4_1 {
    char padding_0[248];
    struct st_a249b4_2 *field_f8;
    struct st_a249b4_2 *field_100;
    char padding_108[24];
    struct st_a249b4_0 *field_120;
} st_a249b4_1;

typedef struct st_a249b4_2 {
    unsigned long long field_0;
} st_a249b4_2;

typedef struct st_a249b4_0 {
    struct st_a249b4_0 *field_0;
} st_a249b4_0;


st_a249b4_0 ** sub_a249b4(st_a249b4_3 *a0, long long a1, long long a2, st_a249b4_0 **a3, st_a249b4_0 **a4)
{
    st_a249b4_0 **v2;  // x20
    unsigned int v3;  // w28
    long long v12;  // x1
    st_a249b4_0 **v13;  // x21
    st_a249b4_1 *v16;  // x9
    long long v4;  // x25
    long long v5;  // x26
    long long v6;  // x23
    st_a249b4_0 **v7;  // x0
    st_a249b4_0 **v8;  // x24
    unsigned int v9;  // w0
    unsigned long long v10;  // 4112
    long long v11;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a4)
    {
        v2 = 0;
    }
    else
    {
        a4 = sub_9dddcc(a0->field_a8);
        v2 = a4;
        if (!v2)
            return 0;
    }
    v3 = a3 != 0;
    sub_9de064(a4);
    v4 = sub_9de208(a4);
    v5 = sub_9de208(a4);
    v6 = sub_9de208(a4);
    v7 = sub_9de208(a4);
    if (v7 && (v8 = v7, sub_9e5dac(v6, a2, a0->field_40, a4)))
    {
        if (!a0->field_0->field_120)
            a0->field_0->field_100();
        if (sub_9e6528(v5, a2, a0->field_40, a4) && sub_9e6404(v4, v5, a2, a0->field_40, a4))
        {
            if (!(int)a0->field_70)
            {
                v16 = a0->field_0;
                if (!v16->field_120)
                    v16->field_f8();
                v16->field_120();
            }
            if (sub_9e6584(v5, v6, a0->field_40) && sub_9e6104(v5, v5, v6, a0->field_40) && sub_9e6378(v4, v4, v5, a0->field_40))
            {
                if (a0->field_0->field_120)
                    a0->field_0->field_120();
                if (sub_9e6104(v4, v4))
                {
                    sub_a36c8c();
                    if (!sub_9eb0e4(v8, v4, a0->field_40, a4))
                    {
                        if (sub_a36000() == 25165935)
                        {
                            sub_a368c8(sub_a36cd4());
                            v12 = 112;
                            goto LABEL_a24d80;
                        }
                        else
                        {
                            sub_a368c8(sub_a36e70());
                            sub_a369bc("crypto/ec/ecp_oct.c", 117, "ossl_ec_GFp_simple_set_compressed_coordinates");
                            v11 = 524291;
                            goto LABEL_a24d8c;
                        }
                        goto LABEL_a24d8c;
                    }
                    sub_a36e70();
                    if (sub_9e5c70(v8) == v3)
                    {
LABEL_a24c3c:
                        if (sub_9e5c70(v8) == v3)
                        {
                            v13 = sub_a1b250(a0, a1, v6, v8, a4) != 0;
                            sub_9de17c(a4);
                            sub_9dded4(v2);
                            return v13;
                        }
                        sub_a368c8();
                        sub_a369bc("crypto/ec/ecp_oct.c", 144, "ossl_ec_GFp_simple_set_compressed_coordinates");
                        v11 = 786691;
                        goto LABEL_a24d8c;
                        goto LABEL_a24d8c;
                    }
                    else if (sub_9e4828(v8))
                    {
                        v9 = sub_9e43b0(v6);
                        v10 = arm64g_calculate_condition(1, v9, 2, 0);
                        if (!(v10 & 1))
                        {
                            if (v9 == 1)
                            {
                                sub_a368c8();
                                sub_a369bc("crypto/ec/ecp_oct.c", 132, "ossl_ec_GFp_simple_set_compressed_coordinates");
                                v11 = 109;
                            }
                            else
                            {
                                sub_a368c8();
                                v12 = 137;
LABEL_a24d80:
                                sub_a369bc("crypto/ec/ecp_oct.c", v12, "ossl_ec_GFp_simple_set_compressed_coordinates");
                                v11 = 110;
                            }
LABEL_a24d8c:
                            sub_a36abc(16, v11, 0);
                        }
                    }
                    else if (sub_9db498(v8))
                    {
                        goto LABEL_a24c3c;
                    }
                }
            }
        }
    }
    sub_9de17c(a4);
    sub_9dded4(v2);
    return 0;
}
