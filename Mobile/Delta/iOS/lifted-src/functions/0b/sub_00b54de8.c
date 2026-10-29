/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb54de8..0xb5543c (1620 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b54de8_3 {
    struct st_b54de8_0 *field_0;
    char padding_8[24];
    struct st_b54de8_0 *field_20;
} st_b54de8_3;

typedef struct st_b54de8_2 {
    struct st_b54de8_0 *field_0;
} st_b54de8_2;

typedef struct st_b54de8_1 {
    long long field_0;
    struct st_b54de8_2 *field_8;
    struct st_b54de8_0 *field_10;
    long long field_18;
    struct st_b54de8_0 *field_20;
    struct st_b54de8_0 *field_24;
    struct st_b54de8_0 *field_28;
    struct st_b54de8_0 *field_30;
    struct st_b54de8_0 *field_38;
    struct st_b54de8_0 *field_40;
    struct st_b54de8_0 *field_44;
} st_b54de8_1;

typedef struct st_b54de8_0 {
    char field_0;
} st_b54de8_0;

extern long long g_b555fc;
extern long long g_b55608;
extern long long g_c7c2eb;
extern uint128_t g_ef3c80;
extern uint128_t g_ef3c90;
extern uint128_t g_ef3ca0;
extern uint128_t g_ef3cb0;
extern uint128_t g_ef3cc0;
extern uint128_t g_ef3cd0;
extern uint128_t g_ef3ce0;
extern unsigned long long g_ef3cf0;
extern st_b54de8_3 g_ef3e18;
extern char g_10002b0;

char * sub_b54de8(st_b54de8_1 *a0, unsigned long long *a1, unsigned long long a2, long long a3, long long a4)
{
    long long v13;  // x0
    char *v14;  // x0
    char *v25;  // x20
    char *v26;  // x0
    char *v27;  // x23
    long long len;  // x0
    unsigned int v29;  // w8
    unsigned long v30;  // cc_op
    unsigned long v31;  // cc_dep1
    unsigned long v32;  // cc_dep2
    char *v15;  // x0
    unsigned long v33;  // cc_ndep
    unsigned long long v34;  // 4112
    unsigned long long v35;  // 4102
    unsigned long long v36;  // 4112
    unsigned long long v37;  // 4102
    char *v16;  // w8
    long long v38;  // x24
    char *v39;  // x9
    char *v40;  // x8
    char *v41;  // x8
    char *v42;  // x8
    char *v43;  // w9
    st_b54de8_0 **v44;  // x24
    long long v17;  // x1
    char *v45;  // w25
    unsigned long long len1;  // x0
    long long v47;  // x28
    char *v48;  // x24
    long long v49;  // x25
    st_b54de8_3 *v18;  // x26
    st_b54de8_0 **v50;  // x1
    char *v51;  // x0
    char *v52;  // w8
    st_b54de8_3 *v19;  // x26
    char *v20;  // x0
    char *v21;  // x28
    long long v22;  // x0
    uint128_t v0;  // [bp-0xe0], Other Possible Types: unsigned long long *
    unsigned long long v1;  // [bp-0xd8]
    uint128_t v2;  // [bp-0xd0]
    uint128_t v3;  // [bp-0xc0]
    uint128_t v4;  // [bp-0xb0]
    char *v5;  // [bp-0xa8]
    uint128_t len2;  // [bp-0xa0], Other Possible Types: unsigned long long
    uint128_t v7;  // [bp-0x90]
    uint128_t v8;  // [bp-0x80]
    unsigned long v9;  // [bp-0x70]
    unsigned long v10;  // [bp-0x68]
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]

    v11 = &v12;
    v10 = *(long long *)&g_10002b0;
    if ((int)a0->field_10 == 1)
    {
        len2 = g_ef3cc0;
        v7 = g_ef3cd0;
        v8 = g_ef3ce0;
        v9 = g_ef3cf0;
        v0 = g_ef3c80;
        v2 = g_ef3c90;
        v3 = g_ef3ca0;
        v4 = g_ef3cb0;
        v27 = a0->field_28;
        while (1)
        {
            if (!v27)
            {
                if (!(int)a0->field_20)
                {
                    sub_a368c8();
                    sub_a369bc("providers/implementations/storemgmt/file_store.c", 697, "file_load_dir_entry");
                    sub_a36abc(2, (int)a0->field_30, 0);
                    if (*(long long *)&g_10002b0 == v10)
                        return 0;
                    ___stack_chk_fail();
                }
                break;
            }
            if (*v27 != 46)
            {
                len = _strlen((char *)&a0->field_20 + 4);
                if (*((char *)&a0->field_20 + 4))
                {
                    v29 = 1 << ((char)(int)a0->field_38 & 31) & 97;
                    if ((unsigned int)(int)a0->field_38 <= 6)
                    {
                        v34 = arm64g_calculate_condition(v30 | 144, v31, v32, v33);
                        v35 = arm64g_calculate_condition(3, (v34 & 1 ? v29 : 0x40000000), 0, 0);
                        if (!(v35 & 1))
                            goto LABEL_b54f38;
                        goto LABEL_b54fbc;
                    }
                    else
                    {
                        v36 = arm64g_calculate_condition(v30 | 144, v31, v32, v33);
                        v37 = arm64g_calculate_condition(0, (v36 & 1 ? v29 : 0x40000000), 0, 0);
                        if (!(v37 & 1))
                        {
LABEL_b54f38:
                            v38 = len;
                            if (!sub_a6e258(v27, (char *)&a0->field_20 + 4, v38) && !(v39 = &v27[v38], *v39 != 46))
                            {
                                v40 = v39;
                                v41 = v40 + 1;
                                if (v40[1] == 114)
                                {
                                    v41 = v40 + 2;
                                    if (!(int)a0->field_38 || (int)a0->field_38 == 6)
                                        goto LABEL_b54f94;
                                    goto LABEL_b54fbc;
                                }
                                else
                                {
                                    if ((int)a0->field_38 != 6)
                                    {
LABEL_b54f94:
                                        if (9 >= *v41 - 48)
                                        {
                                            v42 = v41 + 1;
                                            do
                                            {
                                                v43 = (char *)*v42;
                                                v42 += 1;
                                            } while (v43 - 48 < 10);
                                            if (!v43)
                                            {
                                                v27 = a0->field_28;
                                                goto LABEL_b54ff4;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                else
                {
LABEL_b54ff4:
                    v44 = a0->field_8;
                    if (*(char *)v44)
                        v45 = (char *)(*((char *)v44 + _strlen(v44) - 1) == 47);
                    else
                        v45 = (char *)0;
                    len1 = _strlen(v44);
                    v47 = len1 + (v45 ^ 1) + _strlen(v27);
                    v26 = sub_a6bffc(v47 + 1, "providers/implementations/storemgmt/file_store.c", 605);
                    if (v26)
                    {
                        v48 = v26;
                        if (!v45)
                            v49 = "/";
                        else
                            v49 = &g_c7c2eb;
                        sub_a6db94();
                        sub_a6db94(v48, v49, v47 + 1);
                        sub_a6db94(v48, v27, v47 + 1);
                    }
                    else
                    {
                        if (*(long long *)&g_10002b0 == v10)
                            return v26;
                        ___stack_chk_fail();
                    }
LABEL_b54fc0:
                    v50 = a0->field_8;
                    v51 = sub_a6d858(&a0->field_18, v50);
                    a0->field_28 = v51;
                    v52 = (char *)*(int *)___error(v51, v50);
                    *(unsigned int *)&a0->field_30 = (unsigned int)v52;
                    v27 = a0->field_28;
                    if (!v27 && !v52)
                        *(unsigned int *)&a0->field_20 = 1;
                    if (v48)
                    {
                        v5 = v48;
                        len2 = _strlen(v48);
                        a1();
                    }
                }
            }
            else
            {
LABEL_b54fbc:
                v48 = 0;
                goto LABEL_b54fc0;
            }
        }
    }
    else if (!(int)a0->field_10)
    {
        v13 = sub_9f2aec(a0->field_0);
        v14 = a0->field_20;
        if (v14)
        {
LABEL_b54e50:
            v0 = a1;
            v1 = a2;
            sub_a2cfbc(v14, &v0);
            sub_a36c8c(sub_a2de78(a0->field_20, a3, a4), a3, a4);
            v25 = sub_a2beb4(a0->field_20, a0->field_18);
            if (sub_9d46fc(a0->field_18, 2, 0, 0) && sub_a36000() == 503841036)
            {
                sub_a36cd4();
                if (*(long long *)&g_10002b0 == v10)
                    return v25;
                ___stack_chk_fail();
            }
            sub_a36e70();
            if (*(long long *)&g_10002b0 == v10)
                return v25;
            ___stack_chk_fail();
        }
        v15 = sub_a2d8a0(NULL);
        a0->field_20 = v15;
        if (!v15)
        {
            sub_a368c8();
            v17 = 426;
        }
        else if (sub_a2c604())
        {
            v16 = (char *)(int)a0->field_38;
            if (4 >= v16)
            {
                if (v16 != 3)
                {
                    if (v16 != 4 || sub_a2c62c(a0->field_20, "EncryptedPrivateKeyInfo"))
                        goto LABEL_b552b8;
                    sub_a368c8();
                    v17 = 465;
                }
                else
                {
                    if (sub_a2c62c(a0->field_20, "SubjectPublicKeyInfo"))
                        goto LABEL_b552b8;
                    sub_a368c8();
                    v17 = 448;
                }
            }
            else
            {
                if (v16 != 5)
                {
                    if (v16 != 6 || sub_a2c62c(a0->field_20, "CertificateList"))
                        goto LABEL_b552b8;
                    sub_a368c8();
                    v17 = 481;
                }
                else if (sub_a2c62c(a0->field_20, "Certificate"))
                {
LABEL_b552b8:
                    if (g_ef3e18.field_0)
                    {
                        v18 = &g_ef3e18.field_0;
                        while (1)
                        {
                            while (1)
                            {
                                v19 = v18;
                                v20 = sub_a2d0f8(0, v19, 0);
                                if (!v20)
                                {
                                    sub_a2d06c();
                                    *(unsigned int *)((char *)&a0->field_38 + 4) = 1;
                                    if (*(long long *)&g_10002b0 == v10)
                                        return 0;
                                    ___stack_chk_fail();
                                }
                                v21 = sub_a2c654();
                                sub_a2d06c(v20);
                                if (!v21)
                                {
                                    *(unsigned int *)((char *)&a0->field_38 + 4) = 1;
                                    if (*(long long *)&g_10002b0 == v10)
                                        return 0;
                                    ___stack_chk_fail();
                                }
                                v22 = sub_a2cf88(v21);
                                if (!a0->field_24 || !sub_a6e200() || !sub_a6e200(a0->field_24, "PEM") && !sub_a6e200(v22, "der"))
                                    break;
                                sub_a2c910(v21);
                                v18 = &v19->field_20;
                                if (!v19->field_20)
                                    goto LABEL_b55374;
                            }
                            if (!sub_a2ca84(a0->field_20, v21))
                                break;
                            v18 = &v19->field_20;
                            if (!v19->field_20)
                                goto LABEL_b55374;
                        }
                        sub_a368c8(sub_a2c910(v21));
                        v17 = 526;
                    }
                    else
                    {
LABEL_b55374:
                        if (!sub_a2cb00(a0->field_20, v13, a0->field_28))
                        {
                            sub_a368c8();
                            v17 = 533;
                        }
                        else if (sub_a2cf94(a0->field_20, &g_b555fc) && sub_a2cfe4(a0->field_20, &g_b55608))
                        {
                            v14 = a0->field_20;
                            goto LABEL_b54e50;
                        }
                        else
                        {
                            sub_a368c8();
                            v17 = 545;
                        }
                    }
                }
                else
                {
                    sub_a368c8();
                    v17 = 473;
                }
            }
        }
        else
        {
            sub_a368c8();
            v17 = 433;
        }
        sub_a369bc("providers/implementations/storemgmt/file_store.c", v17, "file_setup_decoders");
        sub_a36abc(57, 0x8003c, 0);
        *(unsigned int *)((char *)&a0->field_38 + 4) = 1;
        if (*(long long *)&g_10002b0 == v10)
            return 0;
        ___stack_chk_fail();
    }
    if (*(long long *)&g_10002b0 == v10)
        return 0;
    ___stack_chk_fail();
}
