/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9cc1c..0xa9cf18 (764 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a9cc1c_1 {
    char field_0;
    struct st_a9cc1c_0 *field_1;
} st_a9cc1c_1;

typedef struct st_a9cc1c_2 {
    struct st_a9cc1c_0 *field_0;
    struct st_a9cc1c_0 *field_1;
} st_a9cc1c_2;

typedef struct st_a9cc1c_0 {
    char field_0;
} st_a9cc1c_0;


int sub_a9cc1c(char *a0, st_a9cc1c_0 **a1)
{
    char *v3;  // w8
    unsigned long v4;  // cc_op
    unsigned long v7;  // cc_ndep
    unsigned long long v8;  // 4112
    unsigned long long v9;  // 4102
    unsigned long v10;  // cc_dep1
    unsigned long v11;  // cc_dep2
    long long v12;  // x1
    st_a9cc1c_1 *v13;  // x8
    long long v14;  // x20
    long long v15;  // x20
    char *v16;  // x20
    long long v17;  // x20
    st_a9cc1c_2 *v18;  // x22
    char *v19;  // x24
    char *v20;  // x20
    char *v22;  // w0
    unsigned long long v5;  // 4112
    unsigned long long v6;  // 4102
    st_a9cc1c_2 *iter;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    *a1 = 0;
    a1[1] = 0;
    a1[2] = 0;
    if (!a0)
        return 1;
    v3 = (char *)*a0;
    if (v3)
    {
        v5 = arm64g_calculate_condition(v4 | 16, v10, v11, v7);
        v6 = arm64g_calculate_condition(19, (v5 & 1 ? v3 & 0xff : 0x40000000), (v5 & 1 ? 10 : 0), 0);
        if (v6 & 1)
            goto LABEL_a9cc60;
    }
    else
    {
        v8 = arm64g_calculate_condition(v4 | 16, v10, v11, v7);
        v9 = arm64g_calculate_condition(16, (v8 & 1 ? v3 & 0xff : 0x40000000), (v8 & 1 ? 10 : 0), 0);
        if (v9 & 1)
        {
LABEL_a9cc60:
            if (_strncmp())
            {
                sub_a368c8();
                sub_a369bc("crypto/pem/pem_lib.c", 531, "PEM_get_EVP_CIPHER_INFO");
                v12 = 107;
            }
            else
            {
                v13 = &a0[10 + _strspn(a0 + 10, " \t")];
                if (v13->field_0 != 52)
                {
                    return 0;
                }
                else if ((&v13->field_0)[1] == 44)
                {
                    v14 = &(&v13->field_0)[2 + _strspn(&(&v13->field_0)[2], " \t")];
                    if (_strncmp(v14, "ENCRYPTED", 9) || (v15 = v14 + 9, !_strspn(v15, " \t\r\n")))
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/pem/pem_lib.c", 542, "PEM_get_EVP_CIPHER_INFO");
                        v12 = 106;
                    }
                    else
                    {
                        v16 = v15 + _strspn(v15, " \t\r");
                        if (*v16 != 10)
                        {
                            sub_a368c8();
                            sub_a369bc("crypto/pem/pem_lib.c", 547, "PEM_get_EVP_CIPHER_INFO");
                            v12 = 112;
                        }
                        else if (_strncmp(v16 + 1, "DEK-Info:", 9))
                        {
                            sub_a368c8();
                            sub_a369bc("crypto/pem/pem_lib.c", 556, "PEM_get_EVP_CIPHER_INFO");
                            v12 = 105;
                        }
                        else
                        {
                            v17 = &v16[10 + _strspn(v16 + 10, " \t")];
                            v18 = v17 + _strcspn(v17, " \t,");
                            v19 = (char *)(char)v18->field_0;
                            *(char *)&v18->field_0 = 0;
                            v20 = sub_a58c5c(v17);
                            *a1 = v20;
                            *(char *)&v18->field_0 = (char)v19;
                            iter = (char *)v18 + _strspn(v18, " \t");
                            if (v20)
                            {
                                v22 = (char *)(unsigned int)sub_a50728(v20);
                                if (v22 >= 1)
                                {
                                    iter = (char *)&iter->field_0 + 1;
                                    if ((char)iter->field_0 == 44)
                                    {
                                        iter = iter;
                                        return sub_a9cf18(&iter, a1 + 1, sub_a50728(v20));
                                    }
                                    sub_a368c8();
                                    sub_a369bc("crypto/pem/pem_lib.c", 579, "PEM_get_EVP_CIPHER_INFO");
                                    v12 = 129;
                                }
                                else
                                {
                                    iter = iter;
                                    if (v22)
                                    {
                                        iter = iter;
                                        return sub_a9cf18(&iter, a1 + 1, sub_a50728(v20));
                                    }
                                    iter = iter;
                                    if ((char)iter->field_0 != 44)
                                    {
                                        iter = iter;
                                        return sub_a9cf18(&iter, a1 + 1, sub_a50728(v20));
                                    }
                                    sub_a368c8();
                                    sub_a369bc("crypto/pem/pem_lib.c", 582, "PEM_get_EVP_CIPHER_INFO");
                                    v12 = 130;
                                }
                            }
                            else
                            {
                                sub_a368c8();
                                sub_a369bc("crypto/pem/pem_lib.c", 574, "PEM_get_EVP_CIPHER_INFO");
                                v12 = 114;
                            }
                        }
                    }
                }
                else
                {
                    return 0;
                }
            }
            sub_a36abc(9, v12, 0);
            return 0;
        }
    }
    return 1;
}
