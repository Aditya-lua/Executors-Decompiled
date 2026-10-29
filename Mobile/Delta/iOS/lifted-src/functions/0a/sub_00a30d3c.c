/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa30d3c..0xa311a0 (1124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a30d3c_0 {
    char padding_0[72];
    unsigned int field_48;
} st_a30d3c_0;

typedef struct st_a30d3c_1 {
    struct st_a30d3c_0 *field_0;
    unsigned int field_8;
} st_a30d3c_1;

extern long long g_a311a0;
extern long long g_a311ec;
extern long long g_a3130c;
extern long long g_a313bc;
extern char g_10002b0;

char sub_a30d3c(st_a30d3c_0 *a0, unsigned long long a1, long long a2, char a3, long long a4)
{
    char v14;  // x19
    char v15;  // x0
    unsigned long long v24;  // x24
    unsigned int *v25;  // x0
    char idx;  // x28
    long long v16;  // x0
    long long v17;  // x0
    long long v18;  // x25
    char v19;  // x0
    st_a30d3c_1 *v20;  // x24
    uint128_t v21;  // q0
    long long v22;  // x0
    unsigned long long v23;  // x0
    st_a30d3c_1 *v0;  // [bp-0xd8]
    char v1;  // [bp-0xd0], Other Possible Types: unsigned int
    char v2;  // [bp-0xc8]
    char v3;  // [bp-0xc0], Other Possible Types: unsigned long
    char v4;  // [bp-0xb8]
    char v5;  // [bp-0xb0], Other Possible Types: uint128_t
    char v6;  // [bp-0xa0], Other Possible Types: long long
    unsigned long long v7;  // [bp-0x98]
    char v8;  // [bp-0x90]
    char v9;  // [bp-0x8c]
    char v10;  // [bp-0x80]
    unsigned long v11;  // [bp-0x68]
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v11 = *(long long *)&g_10002b0;
    if (a0)
    {
        if (!*(long long *)&a0->padding_0[32] && !*(long long *)&a0[1].padding_0[28])
        {
            sub_a368c8();
            sub_a369bc("crypto/encode_decode/encoder_pkey.c", 357, "OSSL_ENCODER_CTX_new_for_pkey");
            sub_a36abc(59, 0x80106, "The passed EVP_PKEY must be assigned a key");
            if (*(long long *)&g_10002b0 == v11)
                return 0;
            ___stack_chk_fail();
        }
        v14 = sub_a30438();
        if (v14)
        {
            if (*(long long *)&a0[1].padding_0[20])
                v15 = sub_a7a42c(sub_975ff4(*(long long *)&a0[1].padding_0[20]));
            else
                v15 = 0;
            if (sub_a2f690(v14, a2) && (!a3 || sub_a2f6bc(v14, a3)) && sub_a2f658(v14, a1))
            {
                if (*(long long *)&a0[1].padding_0[20])
                {
                    v16 = sub_975ff4(*(long long *)&a0[1].padding_0[20]);
                    v17 = sub_a7a42c(v16);
                    if (!*(long long *)&a0[1].padding_0[20])
                        goto LABEL_a31104;
                    v18 = v17;
                    v19 = sub_a6bffc(40, "crypto/encode_decode/encoder_pkey.c", 252);
                    if (!v19)
                    {
                        sub_a3050c(v14);
                        if (*(long long *)&g_10002b0 == v11)
                            return 0;
                        ___stack_chk_fail();
                    }
                    v20 = (st_a30d3c_1 *)v19;
                    v1 = sub_ad61b4();
                    if (v1)
                    {
                        v2 = 0;
                        sub_a55910(*(long long *)&a0[1].padding_0[20], &g_a311a0, &v1);
                        if (!(v2 & 1))
                        {
                            v0 = v20;
                            v21 = __dirty_unsupported_Iop_SliceV128(*(int128_t *)(v14 + 8), *(int128_t *)(v14 + 8), 8);
                            v5 = v21;
                            v9 = 0;
                            v6 = v16;
                            v7 = v14;
                            v3 = v1;
                            v4 = 0;
                            v22 = sub_a68f38(v18);
                            v23 = sub_ad69e4(v3);
                            if ((int)v23 >= 1)
                            {
                                v24 = v23;
                                v25 = sub_a6bf4c((v24 * 4 | v24 >> 62) & 0x3fffffffc & 0x3ffffffff, "crypto/encode_decode/encoder_pkey.c", 288);
                                v4 = (char)v25;
                                if (v4)
                                {
                                    idx = 0;
                                    do
                                    {
                                        v25[idx] = sub_a68e7c(v22, sub_ad69f8(v1, idx));
                                        idx += 1;
                                    } while ((v24 & 0xffffffff) != idx);
                                    goto LABEL_a30f58;
                                }
                                else
                                {
                                    sub_ad6020(v1);
LABEL_a310bc:
                                    v20 = v0;
                                }
                            }
                            else
                            {
LABEL_a30f58:
                                v8 = 0;
                                sub_a3039c(v18, &g_a311ec, &v3);
                                v8 |= 1;
                                sub_a3039c(v18, &g_a311ec, &v3);
                                sub_a6c2e4(v4, "crypto/encode_decode/encoder_pkey.c", 313);
                                sub_ad6020(v1);
                                if (v9)
                                {
                                    sub_a368c8();
                                    sub_a369bc("crypto/encode_decode/encoder_pkey.c", 316, "ossl_encoder_ctx_setup_for_pkey");
                                    sub_a36abc(59, 0x8000f, 0);
                                    goto LABEL_a310bc;
                                }
                                v20 = v0;
                                if (sub_a2c0c0(v14))
                                {
                                    if (!sub_a2f9e8(v14, &g_a3130c) || !sub_a2fa10(v14, v20) || !sub_a2fa38(v14, &g_a313bc))
                                        goto LABEL_a310c0;
                                    v20->field_0 = a0;
                                    v20->field_8 = a1;
                                    goto LABEL_a31104;
                                }
                                else
                                {
                                    sub_a2fa10(v14, 0);
                                    sub_a6c2e4(v20, "crypto/encode_decode/encoder_pkey.c", 337);
                                }
                            }
                        }
                        else
                        {
                            sub_ad6020(v1);
                        }
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/encode_decode/encoder_pkey.c", 261, "ossl_encoder_ctx_setup_for_pkey");
                        sub_a36abc(59, 0x8000f, 0);
                    }
LABEL_a310c0:
                    sub_a2fa10(v14, 0);
                    sub_a6c2e4(v20, "crypto/encode_decode/encoder_pkey.c", 337);
                    sub_a3050c(v14);
                    if (*(long long *)&g_10002b0 == v11)
                        return 0;
                    ___stack_chk_fail();
                }
                else
                {
LABEL_a31104:
                    if (sub_a2f9e0(v14, v15, a4))
                    {
                        v8 = 0;
                        v10 = 0;
                        v5 = 0;
                        v6 = 0;
                        v3 = 0;
                        v1 = a0->field_48;
                        sub_a6ffac("save-parameters", &v1);
                        sub_a3044c(v14, &v3);
                        if (*(long long *)&g_10002b0 == v11)
                            return v14;
                        ___stack_chk_fail();
                    }
                    else
                    {
                        sub_a3050c(v14);
                        if (*(long long *)&g_10002b0 == v11)
                            return 0;
                        ___stack_chk_fail();
                    }
                }
            }
            sub_a3050c(v14);
            if (*(long long *)&g_10002b0 == v11)
                return 0;
            ___stack_chk_fail();
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/encode_decode/encoder_pkey.c", 363, "OSSL_ENCODER_CTX_new_for_pkey");
            sub_a36abc(59, 0x8003b, 0);
            if (*(long long *)&g_10002b0 == v11)
                return v14;
            ___stack_chk_fail();
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/encode_decode/encoder_pkey.c", 352, "OSSL_ENCODER_CTX_new_for_pkey");
        sub_a36abc(59, 0xc0102, 0);
        if (*(long long *)&g_10002b0 == v11)
            return 0;
        ___stack_chk_fail();
    }
}
