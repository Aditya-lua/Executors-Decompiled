/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaae01c..0xaae64c (1584 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aae01c_0 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[32];
    unsigned long long field_30;
} st_aae01c_0;

extern st_aae01c_0 *g_f090a0;
extern st_aae01c_0 *g_f090a8;
extern long long g_f090f8;
extern long long g_f09150;

long long * sub_aae01c(long long *a0, long long a1, long long *a2)
{
    long long *v12;  // x20
    long long *v13;  // x0
    st_aae01c_0 **v22;  // x21
    st_aae01c_0 **v23;  // x21
    long long *v24;  // x21
    long long *v25;  // x22
    long long v26;  // x1
    long long v28;  // x1
    long long *v29;  // x2
    long long v30;  // x0
    long long v31;  // x1
    long long *v14;  // x19
    long long v32;  // x0
    long long v33;  // x0
    unsigned long long v34;  // x0
    long long *v35;  // x20
    long long *v15;  // x25
    long long v16;  // x1
    long long *v17;  // x19
    long long *v18;  // x21
    long long *v19;  // x0
    long long *v20;  // x20
    long long *v21;  // x20
    unsigned long long v0;  // [bp-0xa0]
    unsigned long long v1;  // [bp-0x98]
    unsigned long long v2;  // [bp-0x90]
    long long *v3;  // [bp-0x84]
    long long *v4;  // [bp-0x80]
    long long *v5;  // [bp-0x78]
    long long *v6;  // [bp-0x70]
    long long *v7;  // [bp-0x68]
    long long *v8;  // [bp-0x60]
    long long *v9;  // [bp-0x58]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v7 = 0;
    v8 = 0;
    v5 = 0;
    v6 = 0;
    v4 = 0;
    v3 = (long long *)0;
    if (!a0)
        return 0;
    v12 = sub_a6fbc4(a1, "n");
    v13 = sub_a6fbc4(a1, "e");
    if (!v12 || (v14 = v13, !sub_a70f20(v12, &v6) || !v14 || !sub_a70f20(v14, &v5)))
    {
        sub_a368c8();
        v16 = 83;
        goto LABEL_aae1a8;
    }
    if (a2)
    {
        if (sub_a6fbc4(a1, "rsa-derive-from-pq") && !sub_a6fc2c())
            goto LABEL_aae1c0;
        v15 = sub_a6fbc4(a1, "d");
        if (!v15 || sub_a70f20(v15, &v4))
        {
            if (v3)
            {
                v17 = sub_9dddcc(a0[1]);
                if (v17)
                {
                    v18 = sub_a6fbc4(a1, "rsa-factor1");
                    v19 = sub_a6fbc4(a1, "rsa-factor2");
                    if (v18 && !(v20 = v19, !sub_a70f20(v18, &v8) || !v20 || !sub_a70f20(v20, &v7)))
                        goto LABEL_aae260;
                    sub_a368c8();
                    sub_a369bc("crypto/rsa/rsa_backend.c", 111, "ossl_rsa_fromdata");
                    sub_a36abc(4, 0xc0102, 0);
                    goto LABEL_aae2e8;
                }
            }
            goto LABEL_aae25c;
        }
        else
        {
            sub_a368c8();
            v16 = 97;
LABEL_aae1a8:
            sub_a369bc("crypto/rsa/rsa_backend.c", v16, "ossl_rsa_fromdata");
            sub_a36abc(4, 0xc0102, 0);
LABEL_aae1c0:
            v21 = 0;
            v24 = 0;
            v25 = 0;
            v17 = 0;
            goto LABEL_aae1d0;
        }
        goto LABEL_aae1d0;
    }
    v15 = 0;
LABEL_aae25c:
    v17 = 0;
LABEL_aae260:
    v21 = v4;
    if (!sub_ab18b8(a0, v6, v5, v21))
    {
LABEL_aae2e8:
        v21 = 0;
LABEL_aae2ec:
        v24 = 0;
        v25 = 0;
        goto LABEL_aae1d0;
    }
    v4 = 0;
    v5 = 0;
    v6 = 0;
    if (!v21)
    {
        v24 = 0;
        v25 = 0;
        goto LABEL_aae300;
    }
    v21 = sub_ad61b4();
    if (!v21)
        goto LABEL_aae2ec;
    if (g_f090a0)
    {
        v22 = &g_f090a8;
        do
        {
            v23 = v22;
            if (!sub_a6fbc4(a1))
                continue;
            v9 = 0;
            if (!sub_a70f20())
                goto LABEL_aae2ec;
            if (!sub_ad68a0(v21, v9))
            {
                sub_9e4838(v9);
                goto LABEL_aae2ec;
            }
        } while ((v22 = v23 + 1, *v23));
    }
    v24 = sub_ad61b4();
    if (sub_aae64c(v24, a1, &g_f090f8))
    {
        v25 = sub_ad61b4();
        if (!sub_aae64c(v25, a1, &g_f09150))
            goto LABEL_aae1d0;
        if (!v3 || sub_ad69e4(v24) || sub_ad69e4(v25))
        {
            if (!sub_ad69e4(v21) || sub_ab1ccc(a0, v21, v24, v25))
                goto LABEL_aae3d4;
            goto LABEL_aae1d0;
        }
        if (1 >= (int)sub_ad69e4(v21))
        {
            sub_a368c8();
            v26 = 139;
            goto LABEL_aae4ec;
        }
        if (!v15 && (int)sub_ad69e4(v21) >= 3)
        {
            sub_a368c8();
            v26 = 149;
LABEL_aae4ec:
            sub_a369bc("crypto/rsa/rsa_backend.c", v26, "ossl_rsa_fromdata");
            v28 = 786690;
            v29 = 0;
            goto LABEL_aae484;
        }
        if (sub_ad69e4(v21) == 2)
        {
            v30 = sub_ad69f8(v21, 0);
            if (sub_ab1958(a0, v30, sub_ad69f8(v21, 1)))
            {
                sub_ad692c(v21);
                sub_ad692c(v21);
                if (sub_ab9edc(a0, sub_aafbc4(a0), 0, v17))
                    goto LABEL_aae3d4;
                sub_a368c8();
                v31 = 177;
                goto LABEL_aae630;
            }
            else
            {
                sub_a368c8();
                v31 = 158;
                goto LABEL_aae630;
            }
        }
        v32 = sub_aafbc4(a0);
        v33 = sub_ad69e4(v21);
        if (sub_ab0a8c(a0, v32, v33, a0[6], v21, v24, v25))
        {
            if (!sub_ab1ccc(a0, v21, v24, v25))
            {
                sub_a368c8();
                v31 = 199;
                goto LABEL_aae630;
            }
LABEL_aae3d4:
            if (sub_ad69e4(v21) || sub_ad69e4(v24) || sub_ad69e4(v25))
            {
                sub_a368c8();
                sub_a369bc("crypto/rsa/rsa_backend.c", 223, "ossl_rsa_fromdata");
                v34 = sub_ad69e4(v21);
                v1 = sub_ad69e4(v24);
                v2 = sub_ad69e4(v25);
                v0 = v34;
                v29 = "There are %d, %d, %d elements left on our factors, exps, coeffs stacks\n";
                v28 = 786691;
                goto LABEL_aae484;
            }
LABEL_aae300:
            if (sub_ab2070(a0))
            {
                sub_9e4838(v8);
                sub_9e4838(v7);
                sub_ad6020(v21);
                sub_ad6020(v24);
                sub_ad6020(v25);
                v35 = 1;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/rsa/rsa_backend.c", 232, "ossl_rsa_fromdata");
                v29 = "RSA factors/exponents are too big for for n-modulus\n";
                v28 = 171;
                goto LABEL_aae484;
            }
        }
        else
        {
            sub_a368c8();
            v31 = 190;
LABEL_aae630:
            sub_a369bc("crypto/rsa/rsa_backend.c", v31, "ossl_rsa_fromdata");
            v28 = 786691;
            v29 = 0;
LABEL_aae484:
            sub_a36abc(4, v28, v29);
LABEL_aae1d0:
            sub_9e48d4(v6);
            sub_9e48d4(v5);
            sub_9e48d4(v4);
            sub_9e4838(v8);
            sub_9e4838(v7);
            sub_ad6958(v21, sub_9e4838);
            sub_ad6958(v24, sub_9e4838);
            sub_ad6958(v25, sub_9e4838);
            v35 = 0;
        }
    }
    else
    {
        v25 = 0;
        goto LABEL_aae1d0;
    }
    sub_9dded4(v17);
    return v35;
}
