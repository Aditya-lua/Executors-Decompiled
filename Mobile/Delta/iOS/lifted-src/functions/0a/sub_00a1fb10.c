/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1fb10..0xa1ffd8 (1224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1fb10_0 {
    char padding_0[80];
    long long field_50;
} st_a1fb10_0;


unsigned long long sub_a1fb10(long long a0, unsigned int a1, unsigned long long a2, st_a1fb10_0 *a3)
{
    unsigned long long v4;  // x0
    unsigned long long v5;  // x21
    unsigned long long v14;  // x25
    unsigned int v15;  // w0
    unsigned long long v16;  // 4180
    unsigned long v17;  // x28
    long long v18;  // x1
    unsigned long long v19;  // x24
    unsigned long long v20;  // x20
    long long v21;  // x1
    long long v22;  // x1
    long long v23;  // x1
    unsigned long long v6;  // x0
    long long v24;  // x1
    unsigned long long v7;  // x0
    unsigned long long v8;  // x19
    long long v9;  // x22
    long long v10;  // x26
    long long v11;  // x24
    unsigned long long v12;  // x0
    unsigned long long v13;  // x0
    unsigned int v0;  // [bp-0x6c]
    unsigned long long v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (!a3 || (v4 = sub_9ffdd0(a3), !v4 || (v5 = v4, v6 = sub_975ff4(a3), !a2 || !v6)))
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ecdsa_ossl.c", 457, "ossl_ecdsa_simple_verify_sig");
        v24 = 124;
    }
    else if (sub_a19d04(a3))
    {
        v7 = sub_9dddcc(a3->field_50);
        if (v7)
        {
            v8 = v7;
            sub_9de064();
            v9 = sub_9de208(v8);
            v10 = sub_9de208(v8);
            v11 = sub_9de208(v8);
            v12 = sub_9de208(v8);
            if (!v12)
            {
                sub_a368c8();
                v18 = 477;
                goto LABEL_a1fd10;
            }
            v1 = v12;
            v13 = sub_c4ba8(v5);
            if (!v13)
            {
                sub_a368c8();
                sub_a369bc("crypto/ec/ecdsa_ossl.c", 483, "ossl_ecdsa_simple_verify_sig");
                v23 = 524304;
LABEL_a1fd50:
                sub_a36abc(16, v23, 0);
                v19 = 0;
                goto LABEL_a1fd5c;
            }
            v14 = v13;
            if (sub_9e4828(*(long long *)a2) || sub_9e5c94(*(long long *)a2) || !(sub_9e53a8(*(long long *)a2, v14) >> 31 & 1) || sub_9e4828(*(long long *)(a2 + 8)) || sub_9e5c94(*(long long *)(a2 + 8)) || !(sub_9e53a8(*(long long *)(a2 + 8), v14) >> 31 & 1))
            {
                sub_a368c8();
                sub_a369bc("crypto/ec/ecdsa_ossl.c", 488, "ossl_ecdsa_simple_verify_sig");
                sub_a36abc(16, 156, 0);
                v20 = 0;
                v19 = 0;
                goto LABEL_a1fd60;
            }
            if (!sub_a1b9a0(v5, v10, *(long long *)(a2 + 8), v8))
            {
                sub_a368c8();
                v18 = 494;
                goto LABEL_a1fd10;
            }
            v15 = sub_9e46a8(v14);
            v16 = arm64g_calculate_condition(177, v15, 7, 0);
            v0 = v15;
            v17 = ((int)(a1 * 8) <= (int)v15 ? a1 : (int)((v16 & 1 ? v15 + 14 : v15 + 7)) >> 3);
            if (!sub_9e4db0(a0, v17, v11))
            {
                sub_a368c8();
                v18 = 505;
                goto LABEL_a1fd10;
            }
            if ((int)((unsigned int)v17 * 8) <= (int)v0 || sub_9ea8ac(v11, v11, 8 - (v0 & 7)))
            {
                if (!sub_9e6404(v9, v11, v10, v14, v8))
                {
                    sub_a368c8();
                    v18 = 515;
                    goto LABEL_a1fd10;
                }
                if (sub_9e6404(v10, *(long long *)a2, v10, v14, v8))
                {
                    v19 = sub_a1a56c(v5);
                    if (!v19)
                    {
                        sub_a368c8();
                        v22 = 525;
                        goto LABEL_a1ff8c;
                    }
                    if (!sub_a1b804(v5, v19, v9, v6, v10, v8))
                    {
                        sub_a368c8();
                        v22 = 529;
                        goto LABEL_a1ff8c;
                    }
                    else if (!sub_a1b3cc(v5, v19, v1, 0, v8))
                    {
                        sub_a368c8();
                        v22 = 534;
LABEL_a1ff8c:
                        sub_a369bc("crypto/ec/ecdsa_ossl.c", v22, "ossl_ecdsa_simple_verify_sig");
                        v21 = 524304;
                        goto LABEL_a1ffa0;
                    }
                    else if (sub_9e5dac(v9, v1, v14, v8))
                    {
                        v20 = !sub_9e53a8(v9, *(long long *)a2);
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/ec/ecdsa_ossl.c", 539, "ossl_ecdsa_simple_verify_sig");
                        v21 = 524291;
LABEL_a1ffa0:
                        sub_a36abc(16, v21, 0);
LABEL_a1fd5c:
                        v20 = 0xffffffff;
                    }
                }
                else
                {
                    sub_a368c8();
                    v18 = 520;
                    goto LABEL_a1fd10;
                }
            }
            else
            {
                sub_a368c8();
                v18 = 0x1fe;
LABEL_a1fd10:
                sub_a369bc("crypto/ec/ecdsa_ossl.c", v18, "ossl_ecdsa_simple_verify_sig");
                v23 = 524291;
                goto LABEL_a1fd50;
            }
LABEL_a1fd60:
            sub_9de17c(v8);
            sub_9dded4(v8);
            sub_a1a254(v19);
            return v20;
        }
        sub_a368c8();
        sub_a369bc("crypto/ec/ecdsa_ossl.c", 468, "ossl_ecdsa_simple_verify_sig");
        v24 = 524291;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ecdsa_ossl.c", 462, "ossl_ecdsa_simple_verify_sig");
        v24 = 159;
    }
    sub_a36abc(16, v24, 0);
    return 0xffffffff;
}
