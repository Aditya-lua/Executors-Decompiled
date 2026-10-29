/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1f024..0xa1f454 (1072 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1f024_0 {
    char padding_0[80];
    long long field_50;
} st_a1f024_0;


st_a1f024_0 * sub_a1f024(st_a1f024_0 *a0, st_a1f024_0 *a1, st_a1f024_0 **a2, st_a1f024_0 **a3, st_a1f024_0 *a4, int a5, st_a1f024_0 *a6, unsigned long a7, unsigned long a8, unsigned long long a9)
{
    st_a1f024_0 *v11;  // x19
    st_a1f024_0 *v12;  // x0
    st_a1f024_0 *v21;  // x0
    st_a1f024_0 *v22;  // x0
    unsigned long long v23;  // x0
    unsigned long long v24;  // x23
    st_a1f024_0 *v25;  // x23
    st_a1f024_0 *v26;  // x20
    st_a1f024_0 *v27;  // w0
    st_a1f024_0 *v28;  // x20
    long long v29;  // x20
    st_a1f024_0 *v13;  // x25
    st_a1f024_0 *v14;  // x0
    st_a1f024_0 *v15;  // x0
    long long v16;  // x1
    st_a1f024_0 *v17;  // x23
    st_a1f024_0 *v18;  // x22
    st_a1f024_0 *v19;  // x23
    long long v20;  // x22
    unsigned long v0;  // [bp-0xb0]
    unsigned long long v1;  // [bp-0xa8]
    unsigned long v2;  // [bp-0xa0]
    st_a1f024_0 *v3;  // [bp-0x98]
    st_a1f024_0 *v4;  // [bp-0x90], Other Possible Types: long long
    st_a1f024_0 *v5;  // [bp-0x88]
    st_a1f024_0 *v6;  // [bp-0x80]
    st_a1f024_0 *v7;  // [bp-0x78]
    st_a1f024_0 *v8;  // [bp-0x70]
    st_a1f024_0 *v9;  // [bp-0x68]
    char *v10;  // [bp-0x10]

    v10 = &a8;
    if (a0 && !(v11 = a1, v12 = sub_9ffdd0(), !v12))
    {
        v13 = v12;
        v14 = sub_962b90(a0);
        if (!v14)
        {
            sub_a368c8();
            sub_a369bc("crypto/ec/ecdsa_ossl.c", 152, "ecdsa_sign_setup");
            v16 = 125;
        }
        else if (sub_a19d04(a0))
        {
            v15 = v11;
            if (v15 || !(v15 = sub_9dddcc(a0->field_50), !v15))
            {
                v5 = v14;
                v9 = v15;
                v17 = sub_9e4988(v15);
                v18 = sub_9e4958(v17);
                v7 = sub_9e4958(v18);
                v8 = v17;
                if (!v17)
                {
                    v6 = 0;
                    goto LABEL_a1f398;
                }
                v19 = v18;
                if (!v18)
                {
                    v6 = 0;
                    v18 = v19;
LABEL_a1f398:
                    v20 = 524291;
                    v29 = 172;
                    goto LABEL_a1f3b0;
                }
                v20 = 524291;
                if (!v7)
                {
                    v6 = 0;
                    v29 = 172;
                    v18 = v19;
                    goto LABEL_a1f3b0;
                }
                v21 = sub_a1a56c(v13);
                if (!v21)
                {
                    v6 = 0;
                    v29 = 176;
                    v20 = 524304;
                    v18 = v19;
                    goto LABEL_a1f3b0;
                }
                v4 = 524304;
                v6 = v21;
                v22 = sub_c4ba8(v13);
                if (v22)
                {
                    v3 = v22;
                    v4 = v19;
                    v23 = sub_9e46a8();
                    if ((int)v23 >= 64 && !(v24 = v23, !sub_9e55d4(v8, v24) || !sub_9e55d4(v4, v24) || !sub_9e55d4(v7, v24)))
                    {
                        v1 = a9;
                        v0 = a8;
                        v2 = a5;
                        v25 = v8;
                        v26 = v3;
                    }
                    else
                    {
                        v18 = v4;
                        goto LABEL_a1f3e0;
                    }
                    while (1)
                    {
                        if (!a4)
                        {
                            v27 = (st_a1f024_0 *)(unsigned int)sub_9e93e0(v25, v26, 0, v9);
                        }
                        else if (a6 == 1)
                        {
                            v27 = (st_a1f024_0 *)(unsigned int)sub_a69cd0();
                        }
                        else
                        {
                            v27 = (st_a1f024_0 *)(unsigned int)sub_9e953c();
                        }
                        if (!v27)
                        {
                            v20 = 158;
                            v29 = 216;
                            goto LABEL_a1f44c;
                        }
                        if (sub_9e5c0c(v25, 0))
                            continue;
                        v20 = 524304;
                        if (!sub_a1b804(v13, v6, v25, 0, 0, v9))
                        {
                            v29 = 223;
                            goto LABEL_a1f44c;
                        }
                        else if (sub_a1b3cc(v13, v6, v7, 0, v9))
                        {
                            v18 = v4;
                            v26 = v3;
                            if (!sub_9e5dac(v18, v7, v26, v9))
                            {
                                v29 = 233;
                                v20 = 524291;
                                break;
                            }
                            v25 = v8;
                            v20 = 524291;
                            if (!sub_9e4828(v18))
                            {
                                if (sub_a1b9a0(v13, v25, v25, v9))
                                {
                                    sub_9e4838(*a3);
                                    sub_9e4838(*a2);
                                    *a3 = v4;
                                    *a2 = v25;
                                    v28 = 1;
                                    goto LABEL_a1f3f0;
                                }
                                else
                                {
                                    v29 = 240;
                                    goto LABEL_a1f44c;
                                }
                                goto LABEL_a1f44c;
                            }
                        }
                        else
                        {
                            v29 = 228;
LABEL_a1f44c:
                            v18 = v4;
                            break;
                        }
                    }
                }
                else
                {
                    v29 = 181;
                    v20 = v4;
                    v18 = v19;
                }
LABEL_a1f3b0:
                sub_a368c8();
                sub_a369bc("crypto/ec/ecdsa_ossl.c", v29, "ecdsa_sign_setup");
                sub_a36abc(16, v20, 0);
LABEL_a1f3e0:
                sub_9e4838(v8);
                sub_9e4838(v18);
                v28 = 0;
LABEL_a1f3f0:
                if (v9 != v11)
                    sub_9dded4(v9);
                sub_a1a254(v6);
                sub_9e4838(v7);
                return v28;
            }
            sub_a368c8();
            sub_a369bc("crypto/ec/ecdsa_ossl.c", 163, "ecdsa_sign_setup");
            v16 = 524291;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/ec/ecdsa_ossl.c", 157, "ecdsa_sign_setup");
            v16 = 159;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ecdsa_ossl.c", 148, "ecdsa_sign_setup");
        v16 = 786690;
    }
    sub_a36abc(16, v16, 0);
    return 0;
}
