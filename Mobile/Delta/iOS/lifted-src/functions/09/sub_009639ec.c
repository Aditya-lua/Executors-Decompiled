/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9639ec..0x963ccc (736 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9639ec_1 {
    long long field_0;
    struct st_9639ec_0 *field_8;
} st_9639ec_1;

typedef struct st_9639ec_0 {
    struct st_9639ec_0 *field_0;
} st_9639ec_0;


st_9639ec_0 ** sub_9639ec(long long a0, st_9639ec_1 *a1, st_9639ec_0 **a2, st_9639ec_0 **a3, st_9639ec_0 **a4, st_9639ec_0 **a5)
{
    long long v4;  // x21
    st_9639ec_0 **v5;  // x8
    st_9639ec_0 **v14;  // x0
    st_9639ec_0 **v15;  // x27
    long long v16;  // x0
    long long v17;  // x1
    long long v18;  // x2
    long long v19;  // x1
    st_9639ec_0 **v20;  // x8
    st_9639ec_0 **n;  // x25
    long long v7;  // x1
    long long v8;  // x2
    st_9639ec_0 **v10;  // x20
    st_9639ec_0 **v11;  // x19
    st_9639ec_0 **v12;  // x28
    char *v13;  // x26
    st_9639ec_0 **v0;  // [bp-0x63], Other Possible Types: char
    char v1;  // [bp-0x62]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a0;
    v5 = a1->field_8;
    if (v5)
    {
        if (!a4)
            n = 2;
        else
            n = 3;
        if ((char *)v5 - n * v5 / n)
        {
            sub_a368c8();
            if (!a5)
            {
                sub_a369bc("ssl/ssl_lib.c", 0x1c07, "ossl_bytes_to_cipher_list");
                sub_a36abc(20, 151, 0);
                return 0;
            }
            sub_a369bc("ssl/ssl_lib.c", 0x1c05, "ossl_bytes_to_cipher_list");
            v7 = 50;
            v8 = 151;
        }
        else
        {
            v10 = sub_ad61b4();
            v11 = sub_ad61b4(v10);
            if (v10 && v11)
            {
                v12 = a1->field_8;
                if (n > v12)
                {
LABEL_963acc:
                    if (!v12)
                    {
                        if (a2)
                        {
                            *a2 = v10;
                            v20 = a3;
                            if (!v20)
                                goto LABEL_963cb4;
LABEL_963c30:
                            *v20 = v11;
                        }
                        else
                        {
                            sub_ad6020(v10);
                            v20 = a3;
                            if (v20)
                                goto LABEL_963c30;
LABEL_963cb4:
                            sub_ad6020(v11);
                        }
                        return 1;
                    }
                    sub_a368c8();
                    if (!a5)
                    {
                        sub_a369bc("ssl/ssl_lib.c", 0x1c2e, "ossl_bytes_to_cipher_list");
                        v19 = 271;
LABEL_963c48:
                        sub_a36abc(20, v19, 0);
                        sub_ad6020(v10);
                        sub_ad6020(v11);
                        return 0;
                    }
                    sub_a369bc("ssl/ssl_lib.c", 0x1c2c, "ossl_bytes_to_cipher_list");
                    v16 = v4;
                    v17 = 50;
                    v18 = 271;
                }
                else
                {
                    if (!a4)
                        v13 = &v0;
                    else
                        v13 = &v1;
                    while (1)
                    {
                        ___memcpy_chk(&v0, a1->field_0, n, 3);
                        a1->field_0 = a1->field_0 + (char *)n;
                        a1->field_8 = v12 - n;
                        if ((!a4 || !v0) && (v14 = sub_95c29c(v4, v13, 1), v14))
                            break;
LABEL_963b8c:
                        v12 = a1->field_8;
                        if (v12 < n)
                            goto LABEL_963acc;
                    }
                    v15 = v14;
                    if (!*(int *)v14)
                    {
LABEL_963b7c:
                        if (!sub_ad68a0(v11, v15))
                            goto LABEL_963c84;
                        goto LABEL_963b8c;
                    }
                    if (sub_ad68a0(v10, v15))
                    {
                        if (*(int *)v15)
                            goto LABEL_963b8c;
                        goto LABEL_963b7c;
                    }
LABEL_963c84:
                    sub_a368c8();
                    if (!a5)
                    {
LABEL_963c08:
                        sub_a369bc();
                        v19 = 524303;
                        goto LABEL_963c48;
                    }
LABEL_963b4c:
                    sub_a369bc();
                    v16 = v4;
                    v17 = 80;
                    v18 = 524303;
                }
                sub_9a58a4(v16, v17, v18, 0);
                sub_ad6020(v10);
                sub_ad6020(v11);
                return 0;
            }
            sub_a368c8();
            if (a5)
                goto LABEL_963b4c;
            else
                goto LABEL_963c08;
        }
    }
    else
    {
        sub_a368c8();
        if (!a5)
        {
            sub_a369bc("ssl/ssl_lib.c", 0x1bfe, "ossl_bytes_to_cipher_list");
            sub_a36abc(20, 183, 0);
            return 0;
        }
        sub_a369bc("ssl/ssl_lib.c", 0x1bfc, "ossl_bytes_to_cipher_list");
        v7 = 47;
        v8 = 183;
    }
    sub_9a58a4(v4, v7, v8, 0);
    return 0;
}
