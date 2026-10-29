/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa14dcc..0xa15520 (1876 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a14dcc_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
    struct st_a14dcc_1 *field_10;
} st_a14dcc_0;

typedef struct st_a14dcc_1 {
    char padding_0[4];
    unsigned int field_4;
    unsigned int field_8;
} st_a14dcc_1;

extern long long g_e8e828;
extern long long g_e8ea00;
extern long long g_e8eab0;

unsigned long long sub_a14dcc(unsigned long long a0, unsigned long long a1)
{
    unsigned long long idx;  // x20
    long long v8;  // x22
    unsigned long long v17;  // x0
    long long v18;  // x1
    unsigned long long v19;  // x0
    unsigned long long v20;  // x0
    st_a14dcc_0 *v21;  // x22
    unsigned long long v22;  // w0
    unsigned long long v23;  // w23
    unsigned long long v24;  // x0
    unsigned long long v25;  // x0
    long long v26;  // x21
    long long v9;  // x23
    long long v27;  // x1
    unsigned long long v28;  // x0
    unsigned long long v29;  // x0
    unsigned long long idx1;  // x25
    unsigned long long v31;  // x22
    long long v32;  // x26
    unsigned long long v33;  // x23
    unsigned long long v34;  // x27
    unsigned long long v35;  // x24
    unsigned long long v36;  // x0
    unsigned long long index;  // x24
    long long v37;  // x21
    unsigned long long v38;  // x0
    unsigned long long v39;  // x0
    unsigned long long v40;  // x0
    unsigned long v41;  // x22
    unsigned long long v42;  // x0
    unsigned long v43;  // x21
    unsigned long long v44;  // x0
    unsigned long long v45;  // x25
    long long v46;  // x1
    unsigned long long v11;  // x0
    unsigned int v12;  // w22
    unsigned long long v13;  // x0
    unsigned long long v14;  // x0
    unsigned long long v15;  // x22
    unsigned long long v16;  // x0
    unsigned long long v0;  // [bp-0x80]
    unsigned long long v1;  // [bp-0x78]
    char v2;  // [bp-0x6c], Other Possible Types: unsigned int
    char v3;  // [bp-0x68], Other Possible Types: unsigned int
    unsigned int v4;  // [bp-0x64]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = 0;
    idx = a1;
    if (!idx)
    {
        idx = sub_9cde20(&g_e8e828);
        if (!idx)
        {
            sub_a368c8();
            sub_a369bc("crypto/ec/ec_asn1.c", 385, "EC_GROUP_get_ecparameters");
            sub_a36abc(16, 0x8000d, 0);
            sub_9cd960(idx, &g_e8e828);
            return 0;
        }
    }
    *(unsigned int *)idx = 1;
    v8 = 524304;
    v9 = 396;
    if (a0 && (index = *(long long *)(idx + 8), index))
    {
        sub_9c3580(*(long long *)index);
        sub_9cf1fc(*(long long *)(index + 8));
        v11 = sub_a1abd4(a0);
        v12 = v11;
        v13 = sub_a99624(v11);
        *(unsigned long long *)index = v13;
        if (!v13)
        {
            sub_a368c8();
            v46 = 194;
            goto LABEL_a14ecc;
        }
        if (v12 != 407)
        {
            if (v12 != 406)
            {
                sub_a368c8();
                sub_a369bc("crypto/ec/ec_asn1.c", 290, "ec_asn1_group2fieldid");
                goto LABEL_a15004;
            }
            v14 = sub_9e4958();
            if (!v14)
            {
                sub_a368c8();
                sub_a369bc("crypto/ec/ec_asn1.c", 200, "ec_asn1_group2fieldid");
                goto LABEL_a14ed4;
            }
            v15 = v14;
            if (!sub_a1acc8(a0, v15, 0, 0, 0))
            {
                sub_a368c8();
                sub_a369bc("crypto/ec/ec_asn1.c", 205, "ec_asn1_group2fieldid");
                v18 = 524304;
                goto LABEL_a150f8;
            }
            v16 = sub_9c1acc(v15, 0);
            *(unsigned long long *)(index + 8) = v16;
            if (v16)
            {
                v17 = v15;
                goto LABEL_a15188;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/ec/ec_asn1.c", 211, "ec_asn1_group2fieldid");
                v18 = 524301;
LABEL_a150f8:
                sub_a36abc(16, v18, 0);
                v19 = v15;
LABEL_a15010:
                sub_9e48d4(v19);
                v8 = 524304;
                v9 = 396;
            }
        }
        else
        {
            v20 = sub_9cde20(&g_e8eab0);
            *(unsigned long long *)(index + 8) = v20;
            if (!v20)
            {
                sub_a368c8();
                v27 = 229;
                goto LABEL_a14ff4;
            }
            v21 = v20;
            v21->field_0 = sub_a1ad1c(a0);
            v22 = (unsigned int)sub_a1baa8(a0);
            if (!v22)
            {
                sub_a368c8();
                sub_a369bc("crypto/ec/ec_asn1.c", 0xee, "ec_asn1_group2fieldid");
                goto LABEL_a14ed4;
            }
            v23 = v22;
            v24 = sub_a99624();
            v21->field_8 = v24;
            if (!v24)
            {
                sub_a368c8();
                v46 = 243;
LABEL_a14ecc:
                sub_a369bc("crypto/ec/ec_asn1.c", v46, "ec_asn1_group2fieldid");
LABEL_a14ed4:
                goto LABEL_a15004;
            }
            if (v23 == 683)
            {
                if (!sub_a1bb7c(a0, &v4, &v3, &v2))
                {
LABEL_a1500c:
                    v19 = 0;
                    goto LABEL_a15010;
                }
                v29 = sub_9cde20(&g_e8ea00);
                v21->field_10 = v29;
                if (v29)
                {
                    v17 = 0;
                    *(unsigned int *)v29 = v4;
                    v21->field_10->field_4 = v3;
                    v21->field_10->field_8 = v2;
                    goto LABEL_a15188;
                }
                else
                {
                    sub_a368c8();
                    v27 = 270;
                    goto LABEL_a14ff4;
                }
                goto LABEL_a14ff4;
            }
            if (v23 == 682)
            {
                if (!sub_a1bafc(a0, &v4))
                    goto LABEL_a1500c;
                v25 = sub_9cf11c();
                v21->field_10 = v25;
                if (v25)
                {
                    if (sub_9c19dc())
                        goto LABEL_a15184;
                    v26 = 259;
                }
                else
                {
                    v26 = 0xff;
                }
                sub_a368c8();
                v27 = v26;
                goto LABEL_a14ff4;
            }
            v28 = sub_9cf1a8();
            v21->field_10 = v28;
            if (!v28)
            {
                sub_a368c8();
                v27 = 283;
LABEL_a14ff4:
                sub_a369bc("crypto/ec/ec_asn1.c", v27, "ec_asn1_group2fieldid");
LABEL_a15004:
                sub_a36abc(16);
                goto LABEL_a1500c;
            }
LABEL_a15184:
            v17 = 0;
LABEL_a15188:
            sub_9e48d4(v17);
            idx1 = *(long long *)(idx + 16);
            v8 = 524304;
            if (!idx1 || !*(long long *)idx1)
            {
                v9 = 402;
            }
            else if (*(long long *)(idx1 + 8))
            {
                v31 = sub_9e4958();
                v32 = 524291;
                if (!v31)
                {
                    v33 = 0;
LABEL_a152c8:
                    v35 = 0;
                    v45 = 0;
                    v37 = 312;
                    goto LABEL_a152d4;
                }
                v33 = sub_9e4958();
                if (!v33)
                    goto LABEL_a152c8;
                if (!sub_a1acc8(a0, 0, v31, v33, 0))
                {
                    v35 = 0;
                    v45 = 0;
                    v32 = 524304;
                    v37 = 318;
                    goto LABEL_a152d4;
                }
                v34 = sub_a1ad1c(a0) + 7 >> 3;
                v35 = sub_a6bf4c(v34, "crypto/ec/ec_asn1.c", 328);
                if (!v35 || (v0 = sub_a6bf4c(v34, "crypto/ec/ec_asn1.c", 329), !v0))
                {
                    v45 = 0;
LABEL_a15300:
                    sub_a6c2e4(v35, "crypto/ec/ec_asn1.c", 365);
                    sub_a6c2e4(v45, "crypto/ec/ec_asn1.c", 366);
                    sub_9e48d4(v31);
                    sub_9e48d4(v33);
                    goto LABEL_a15338;
                }
                if (sub_9e5174(v31, v35, v34) >> 31 & 1 || sub_9e5174(v33, v0, v34) >> 31 & 1)
                {
                    v37 = 333;
                    v45 = v0;
                    goto LABEL_a152d4;
                }
                else if (!sub_9c026c(*(long long *)idx1, v35, v34) || !sub_9c026c(*(long long *)(idx1 + 8), v0, v34))
                {
                    v37 = 340;
LABEL_a153c8:
                    v32 = 524301;
                    v45 = v0;
LABEL_a152d4:
                    sub_a368c8();
                    sub_a369bc("crypto/ec/ec_asn1.c", v37, "ec_asn1_group2curve");
                    sub_a36abc(16, v32, 0);
                    goto LABEL_a15300;
                }
                else if (!*(long long *)(a0 + 48))
                {
                    sub_9cf0f4(*(long long *)(idx1 + 16));
                    *(unsigned long long *)(idx1 + 16) = 0;
LABEL_a153e0:
                    sub_a6c2e4(v35, "crypto/ec/ec_asn1.c", 365);
                    sub_a6c2e4(v0, "crypto/ec/ec_asn1.c", 366);
                    sub_9e48d4(v31);
                    sub_9e48d4(v33);
                    v38 = sub_c4c40(a0);
                    if (v38)
                    {
                        v39 = sub_a1dbcc(a0, v38, sub_a1abe8(a0), &v1, 0);
                        if (v39)
                        {
                            v40 = *(long long *)(idx + 24);
                            if (v40 || !(v40 = sub_9cf0ec(0), *(unsigned long long *)(idx + 24) = v40, !v40))
                            {
                                sub_9c79a0(v40, v1, v39);
                                if (sub_c4ba8(a0))
                                {
                                    v41 = *(long long *)(idx + 32);
                                    v42 = sub_9c1acc();
                                    *(unsigned long long *)(idx + 32) = v42;
                                    if (v42)
                                    {
                                        if (!sub_9ffdd0(a0) || !(v43 = *(long long *)(idx + 40), v44 = sub_9c1acc(), *(unsigned long long *)(idx + 40) = v44, !v44))
                                            return idx;
                                        *(long long *)(idx + 40) = *(long long *)(idx + 40);
                                        v9 = 445;
                                        goto LABEL_a15514;
                                    }
                                    else
                                    {
                                        *(unsigned long *)(idx + 32) = v41;
                                        v9 = 435;
                                        goto LABEL_a15514;
                                    }
                                    goto LABEL_a15514;
                                }
                                else
                                {
                                    v8 = 524304;
                                    v9 = 429;
                                }
                            }
                            else
                            {
                                sub_a6c2e4(v1, "crypto/ec/ec_asn1.c", 420);
                                v9 = 421;
LABEL_a15514:
                                v8 = 524301;
                            }
                        }
                        else
                        {
                            v8 = 524304;
                            v9 = 416;
                        }
                    }
                    else
                    {
                        v8 = 113;
                        v9 = 408;
                    }
                }
                else if (*(long long *)(idx1 + 16) || !(v36 = sub_9cf14c(), *(unsigned long long *)(idx1 + 16) = v36, !v36))
                {
                    sub_9c76f4();
                    if (sub_9c026c(*(long long *)(idx1 + 16), *(long long *)(a0 + 48), *(int *)(a0 + 56)))
                        goto LABEL_a153e0;
                    v37 = 354;
                    goto LABEL_a153c8;
                }
                else
                {
                    v37 = 348;
                    goto LABEL_a153c8;
                }
            }
            else
            {
LABEL_a15338:
                v8 = 524304;
                v9 = 402;
            }
        }
    }
    sub_a368c8();
    sub_a369bc("crypto/ec/ec_asn1.c", v9, "EC_GROUP_get_ecparameters");
    sub_a36abc(16, v8, 0);
    if (a1)
        return 0;
    sub_9cd960(idx, &g_e8e828);
    return 0;
}
