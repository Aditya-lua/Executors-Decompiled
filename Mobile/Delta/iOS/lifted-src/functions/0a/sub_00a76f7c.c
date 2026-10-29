/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa76f7c..0xa774bc (1344 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a76f7c_0 {
    unsigned int field_0;
    char padding_4[4];
    struct st_a76f7c_1 *field_8;
    char field_10;
    char padding_11[7];
    char field_18;
    char padding_19[7];
    char field_20;
    char padding_21[7];
    long long field_28;
} st_a76f7c_0;

typedef struct st_a76f7c_1 {
    char field_0;
} st_a76f7c_1;


char sub_a76f7c(char a0, char a1, char a2, long long a3, unsigned long long a4, st_a76f7c_0 *a5)
{
    unsigned long long *v4;  // x9
    long long v14;  // x25
    char v15;  // x26
    char v16;  // w0
    char v17;  // x0
    long long v18;  // x1
    unsigned int v19;  // w0
    unsigned long long v20;  // 4112
    unsigned long long v21;  // 4112
    long long v22;  // x1
    unsigned long long v23;  // x0
    long long v6;  // x27
    unsigned long long n;  // x2
    char v25;  // x28
    char v26;  // x0
    char v7;  // x0
    char v8;  // x24
    char v9;  // x0
    char v10;  // x8
    long long v11;  // x1
    char v12;  // x0
    long long v13;  // x23
    char v0;  // [bp-0x70], Other Possible Types: long long
    char v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (a5->field_0 == 1)
    {
        if (!a5->field_8)
            goto LABEL_a7701c;
        v4 = &a5->field_10;
    }
    else if (a5->field_18 & 1 && *(long long *)&a5->field_20)
    {
        v4 = &a5->field_28;
    }
    else
    {
        if (a5->field_0 == 3)
            a5->field_8();
LABEL_a7701c:
        v6 = a1;
        v7 = sub_a6fbc4(a3, "info");
        if (!v7)
        {
            v8 = 0;
            goto LABEL_a77050;
        }
        if (*(int *)(v7 + 8) == 4)
        {
            v8 = *(long long *)(v7 + 16);
LABEL_a77050:
            if (a5->field_0 != 4)
            {
                if (a5->field_0 != 2)
                    goto LABEL_a771f0;
                v9 = sub_adae68(a5->field_8, a4);
                v10 = v6;
                if (v9)
                    goto LABEL_a770f0;
                sub_a368c8();
                sub_a369bc("crypto/passphrase.c", 266, "ossl_pw_get_passphrase");
                v11 = 524328;
            }
            else
            {
                if (a5->field_8)
                {
                    v9 = 0;
                    v10 = v6;
LABEL_a770f0:
                    if (a0 && v10 && a2)
                    {
                        v12 = sub_ad9a4c();
                        if (v12)
                        {
                            v13 = v12;
                            sub_ada298();
                            if (*(long long *)&a5->field_10)
                                sub_ad9eec(v13, *(long long *)&a5->field_10);
                            v1 = sub_ad9dac(v13, "pass phrase", v8);
                            if (v1)
                            {
                                v14 = v6 + 1;
                                v15 = sub_a6bffc(v14, "crypto/passphrase.c", 147);
                                if (v15)
                                {
                                    v16 = sub_ad9c70(v13, v1, 2, v15, 0, v6);
                                    if (v16 > 0)
                                    {
                                        if ((unsigned int)a4)
                                        {
                                            v17 = sub_a6bffc(v14, "crypto/passphrase.c", 162);
                                            if (!v17)
                                                goto LABEL_a772ac;
                                            v0 = v17;
                                            if (0 < (int)sub_ad9d08(v13, v1, 2, v0, 0, v6, v15))
                                                goto LABEL_a772f4;
                                            sub_a368c8();
                                            v18 = 171;
                                        }
                                        else
                                        {
                                            v0 = 0;
LABEL_a772f4:
                                            v19 = sub_ada010(v13);
                                            v20 = arm64g_calculate_condition(1, v19, 1, 0);
                                            if (!(v20 & 1))
                                            {
                                                v21 = arm64g_calculate_condition(0x11, v19, 2, 0);
                                                if (!(v21 & 1))
                                                {
                                                    sub_a368c8();
                                                    sub_a369bc("crypto/passphrase.c", 178, "do_ui_passphrase");
                                                    v22 = 524553;
                                                    goto LABEL_a773ac;
                                                }
                                                else
                                                {
                                                    v23 = sub_ad9f60(v13, v16 - 1);
                                                    if (!(v23 >> 31 & 1))
                                                    {
                                                        n = v23 & 0xffffffff;
                                                        *(unsigned long long *)a2 = n;
                                                        _memcpy(a0, v15, n);
                                                        v25 = 1;
                                                        goto LABEL_a773b8;
                                                    }
                                                    else
                                                    {
                                                        sub_a368c8();
                                                        v18 = 186;
                                                    }
                                                }
                                            }
                                            else
                                            {
                                                sub_a368c8();
                                                v18 = 181;
                                            }
                                        }
                                        sub_a369bc("crypto/passphrase.c", v18, "do_ui_passphrase");
                                        v22 = 524328;
LABEL_a773ac:
                                        sub_a36abc(15, v22, 0);
                                        v25 = 0;
LABEL_a773b8:
                                    }
                                    else
                                    {
                                        sub_a368c8();
                                        sub_a369bc("crypto/passphrase.c", 156, "do_ui_passphrase");
                                        sub_a36abc(15, 0x80028, 0);
                                        v25 = 0;
                                    }
                                }
                                else
                                {
LABEL_a772ac:
                                    v25 = 0;
                                }
                            }
                            else
                            {
                                sub_a368c8();
                                sub_a369bc("crypto/passphrase.c", 142, "do_ui_passphrase");
                                sub_a36abc(15, 0x80028, 0);
                                v15 = 0;
                                v25 = 0;
                                v14 = v6 + 1;
                            }
                            sub_a6c4e8();
                            sub_a6c4e8(v15, v14, "crypto/passphrase.c", 197);
                            sub_a6c2e4(v1, "crypto/passphrase.c", 198);
                            sub_ad9b6c(v13);
                        }
                        else
                        {
                            sub_a368c8();
                            sub_a369bc("crypto/passphrase.c", 129, "do_ui_passphrase");
                            sub_a36abc(15, 0x80028, 0);
                            v25 = 0;
                        }
                    }
                    else
                    {
                        sub_c69274();
                        v25 = 0;
                    }
                    sub_ada37c(v9);
                    if (!v25)
                    {
                        return v25;
                    }
                    else if (a5->field_18 & 1)
                    {
                        if (*(long long *)&a5->field_20 && (unsigned long long)a5->field_28 >= (unsigned long long)*(long long *)a2)
                        {
                            _memcpy();
                            *(char *)(*(long long *)&a5->field_20 + *(long long *)a2) = 0;
                            a5->field_28 = *(long long *)a2;
                            return v25;
                        }
                        v26 = sub_a6c304();
                        if (!v26)
                        {
                            sub_a66ec0(a0, *(long long *)a2);
                            return 0;
                        }
                        *(unsigned long long *)&a5->field_20 = v26;
                        _memcpy();
                        *(char *)(*(long long *)&a5->field_20 + *(long long *)a2) = 0;
                        a5->field_28 = *(long long *)a2;
                        return v25;
                    }
                    else
                    {
                        return v25;
                    }
                }
LABEL_a771f0:
                sub_a368c8();
                sub_a369bc("crypto/passphrase.c", 275, "ossl_pw_get_passphrase");
LABEL_a7721c:
                v11 = 524550;
            }
            sub_a36abc(15, v11);
            return 0;
        }
        sub_a368c8();
        sub_a369bc("crypto/passphrase.c", 251, "ossl_pw_get_passphrase");
        goto LABEL_a7721c;
    }
    if (*v4 < a1)
        a1 = *v4;
    _memcpy();
    *(unsigned long long *)a2 = a1;
    return 1;
}
