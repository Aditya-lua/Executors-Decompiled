/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa15f8..0xaa1c50 (1624 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa15f8_1 {
    long long field_0;
    struct st_aa15f8_0 *field_8;
} st_aa15f8_1;

typedef struct st_aa15f8_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_aa15f8_0;

typedef struct st_aa15f8_3 {
    char padding_0[8];
    struct st_aa15f8_1 *field_8;
    struct st_aa15f8_2 *field_10;
} st_aa15f8_3;

typedef struct st_aa15f8_2 {
    char padding_0[24];
    long long field_18;
    struct st_aa15f8_0 *field_20;
    unsigned long long field_28;
    unsigned long long field_30;
} st_aa15f8_2;

extern char g_10002b0;

unsigned long long sub_aa15f8(st_aa15f8_3 *a0, long long a1, long long a2, long long a3, long long a4, unsigned long long a5, unsigned long long a6, unsigned long long a7)
{
    st_aa15f8_1 *v15;  // x8
    st_aa15f8_1 *v16;  // x8
    long long v25;  // x0
    unsigned long long v26;  // x0
    unsigned long long v27;  // x8
    unsigned long long v28;  // 4122
    long long v29;  // x0
    long long v30;  // x1
    unsigned long long v31;  // x2
    long long v32;  // x1
    unsigned long long v33;  // x0
    long long v34;  // x1
    unsigned long long v17;  // x0
    unsigned long long v35;  // x19
    unsigned long long v36;  // x20
    unsigned long long v18;  // x23
    long long v20;  // x1
    unsigned long long v21;  // x26
    unsigned int v22;  // w0
    unsigned long long v23;  // x19
    long long v24;  // x0
    unsigned long long v0;  // [bp-0x190]
    unsigned long v1;  // [bp-0x188]
    unsigned long v2;  // [bp-0x180]
    unsigned long v3;  // [bp-0x178]
    unsigned int v4;  // [bp-0x16c]
    unsigned long long v5;  // [bp-0x168]
    long long v6;  // [bp-0x160], Other Possible Types: unsigned long
    long long v7;  // [bp-0x158]
    long long v8;  // [bp-0x150]
    long long v9;  // [bp-0x148]
    char v10;  // [bp-0x140]
    char v11;  // [bp-0xc0]
    unsigned long v12;  // [bp-0x70]
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    v12 = *(long long *)&g_10002b0;
    if (sub_a99eac(a0->field_10->field_18) != 21)
    {
        sub_a368c8();
        sub_a369bc("crypto/pkcs12/p12_mutl.c", 195, "pkcs12_gen_mac");
        v20 = 121;
    }
    else if (a0->field_10->field_20)
    {
        v15 = a0->field_8;
        if (v15[1].field_0)
        {
            v6 = sub_9c1a94(v15[1].field_0);
            v16 = a0->field_8;
        }
        else
        {
            v6 = 1;
            v16 = v15;
        }
        sub_9d0460(v16->field_0, &v8, 0);
        sub_9cf830(&v7, 0, 0, v8);
        if (sub_a99eac(v7) == 162)
            sub_a99624(a5);
        if (sub_a99b48(&v11, 80) >> 31 & 1)
        {
            if (*(long long *)&g_10002b0 == v12)
                return 0;
            ___stack_chk_fail();
        }
        v3 = v15->field_8->field_8;
        v4 = v15->field_8->field_0;
        sub_a36c8c();
        v17 = sub_a40ca8(a0->field_10->field_28, &v11, a0->field_10->field_30);
        v18 = v17;
        if (!v18)
        {
            v18 = sub_a58d60(sub_a9976c(sub_a99eac(v7)));
            if (v18)
                goto LABEL_aa17c0;
            sub_a368c8(sub_a36e70());
            sub_a369bc("crypto/pkcs12/p12_mutl.c", 227, "pkcs12_gen_mac");
            v20 = 118;
        }
        else
        {
LABEL_aa17c0:
            v5 = v17;
            sub_a36cd4();
            v21 = sub_a50ac8(v18);
            v22 = sub_9c7b68(v18);
            if ((int)v21 >= 1)
            {
                if ((unsigned int)a5 && !a7)
                {
                    v23 = sub_aa1508(v8);
                    if (!v23)
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/pkcs12/p12_mutl.c", 122, "PBMAC1_PBKDF2_HMAC");
                        v32 = "h";
                        goto LABEL_aa1ac8;
                    }
                    if (*(long long *)(v23 + 24))
                    {
                        sub_9cf830(&v9, 0, 0);
                        v24 = sub_a99eac(v9);
                    }
                    else
                    {
                        v24 = 163;
                    }
                    v25 = sub_a9976c(sub_a41564(v24));
                    v26 = sub_a40ca8(a0->field_10->field_28, v25, a0->field_10->field_30);
                    if (v26)
                    {
                        v27 = *(long long *)v23;
                        if (v27 && *(int *)v27 == 4)
                        {
                            if (*(long long *)(v23 + 16))
                            {
                                v21 = sub_9c1a94(*(long long *)(v23 + 16));
                                v28 = arm64g_calculate_condition(145, (unsigned int)v21 - 65, 46, 0);
                                if (v28 & 1)
                                    goto LABEL_aa1c0c;
                                v6 = *(long long *)(*(long long *)(v27 + 8) + 8);
                                v29 = sub_9c1a94(*(long long *)(v23 + 8));
                                if (0 < (int)sub_a59470(a1, a2, v6, *(int *)*(long long *)(v27 + 8), v29, v26, v21, &v10))
                                    goto LABEL_aa1c44;
                                sub_a368c8();
                                sub_a369bc("crypto/pkcs12/p12_mutl.c", 160, "PBMAC1_PBKDF2_HMAC");
                                v30 = 786691;
                                v31 = 0;
                            }
                            else
                            {
                                v21 = 0;
LABEL_aa1c0c:
                                sub_a368c8();
                                sub_a369bc("crypto/pkcs12/p12_mutl.c", 152, "PBMAC1_PBKDF2_HMAC");
                                v0 = v21;
                                v31 = "Invalid Key length (%d is not in the range 20..64)";
                                v30 = 114;
                            }
                            sub_a36abc(35, v30, v31);
                            v21 = 0xffffffff;
LABEL_aa1c44:
                        }
                        else
                        {
                            sub_a368c8();
                            sub_a369bc("crypto/pkcs12/p12_mutl.c", 142, "PBMAC1_PBKDF2_HMAC");
                            sub_a36abc(35, 114, 0);
LABEL_aa1ad4:
                            v21 = 0xffffffff;
                        }
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/pkcs12/p12_mutl.c", 135, "PBMAC1_PBKDF2_HMAC");
                        v32 = 524557;
LABEL_aa1ac8:
                        sub_a36abc(35, v32, 0);
                        goto LABEL_aa1ad4;
                    }
                    sub_a3f52c();
                    sub_9c9ee8(v23);
                    if (!(v21 >> 31 & 1))
                        goto LABEL_aa1ae8;
                }
                else if ((v22 - 982 < 2 || v22 == 809) && !sub_a6ac44("LEGACY_GOST_PKCS12"))
                {
                    if (sub_aa1e88(a1, a2, v3, v4, v6, &v10, v18))
                    {
                        v21 = 32;
                    }
                    else
                    {
                        sub_a368c8();
                        v34 = 250;
                        goto LABEL_aa1bc4;
                    }
LABEL_aa1ae8:
                    v35 = sub_a64420();
                    if (v35 && sub_a64000(v35, &v10, v21, v18, 0))
                    {
                        if (sub_a6432c(v35, a0->field_10->field_20->field_8, a0->field_10->field_20->field_0))
                        {
                            v36 = sub_a64344(v35, a3, a4) != 0;
                            goto LABEL_aa1be4;
                        }
                        else
                        {
                            v36 = 0;
                            goto LABEL_aa1be4;
                        }
                    }
                    goto LABEL_aa1bdc;
                }
                else if (!(unsigned int)a6)
                {
                    if (a7)
                    {
                        v0 = v18;
                        a7();
                    }
LABEL_aa1b78:
                    v1 = a0->field_10->field_28;
                    v2 = a0->field_10->field_30;
                    v0 = v18;
                    if (sub_aa0e40(a1, a2, v3, v4, 3))
                        goto LABEL_aa1ae8;
                    sub_a368c8();
                    v34 = 284;
LABEL_aa1bc4:
                    sub_a369bc("crypto/pkcs12/p12_mutl.c", v34, "pkcs12_gen_mac");
                    sub_a36abc(35, 107, 0);
                }
                else if (!(sub_a99b48(&v10, 128, sub_a99624(a6), 0) >> 31 & 1) && !(v33 = sub_a40ca8(0, &v10, 0), !v33))
                {
                    if (a7)
                    {
                        v0 = v33;
                        a7();
                    }
                    sub_a3f52c();
                    goto LABEL_aa1b78;
                    goto LABEL_aa1b78;
                }
            }
            v35 = 0;
LABEL_aa1bdc:
            v36 = 0;
LABEL_aa1be4:
            sub_a66ec0(&v10, 64);
            sub_a644c4(v35);
            sub_a3f52c(v5);
            if (*(long long *)&g_10002b0 == v12)
                return v36;
            ___stack_chk_fail();
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/pkcs12/p12_mutl.c", 200, "pkcs12_gen_mac");
        v20 = 101;
    }
    sub_a36abc(35, v20, 0);
    if (*(long long *)&g_10002b0 == v12)
        return 0;
    ___stack_chk_fail();
}
