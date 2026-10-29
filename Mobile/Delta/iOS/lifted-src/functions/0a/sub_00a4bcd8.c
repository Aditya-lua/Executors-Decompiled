/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4bcd8..0xa4c694 (2492 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4bcd8_0 {
    unsigned int field_0;
    unsigned int field_4;
    char padding_8[8];
    char field_10;
    char padding_11[15];
    struct st_a4bcd8_1 *field_20;
    char padding_28[8];
    struct st_a4bcd8_1 *field_30;
    int field_38;
    char padding_3c[76];
    struct st_a4bcd8_1 *field_88;
    struct st_a4bcd8_1 *field_90;
    unsigned long long field_98;
    char padding_a0[120];
    struct st_a4bcd8_1 *field_118;
    unsigned long long field_120;
} st_a4bcd8_0;

typedef struct st_a4bcd8_3 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
} st_a4bcd8_3;

typedef struct st_a4bcd8_2 {
    unsigned int field_0;
    char padding_4[4];
    unsigned int field_8;
    char padding_c[44];
    int field_38;
} st_a4bcd8_2;

typedef struct st_a4bcd8_1 {
    unsigned long long field_0;
} st_a4bcd8_1;

extern char g_10002b0;

unsigned long long sub_a4bcd8(void* a0, st_a4bcd8_2 *a1, unsigned long long a2, unsigned long long a3, unsigned long long a4, unsigned long long a5, unsigned long long a6, unsigned long long a7)
{
    st_a4bcd8_2 *v13;  // x24
    unsigned long v14;  // cc_op
    st_a4bcd8_0 *v23;  // x8
    unsigned long long v24;  // x25
    unsigned long v25;  // x25
    unsigned long v26;  // x0
    long long *v27;  // x24
    unsigned long long v28;  // w8
    unsigned long long v29;  // 4102
    long long *v30;  // x24
    unsigned long long v31;  // w8
    unsigned long long v32;  // 4102
    unsigned long v15;  // cc_dep1
    unsigned long long v33;  // x0
    st_a4bcd8_3 *iter;  // x24
    unsigned long long idx;  // x0
    uint128_t v36;  // q0
    uint128_t v37;  // q1
    long long v38;  // x1
    st_a4bcd8_0 *v39;  // x8
    unsigned long long *v40;  // x25
    unsigned long long *v41;  // x22
    long long v42;  // x1
    unsigned long long v16;  // cc_dep2
    long long *v43;  // x23
    unsigned long long v44;  // w8
    unsigned long long v45;  // 4102
    unsigned long v46;  // x26
    unsigned long long v47;  // x8
    unsigned long v49;  // x0
    unsigned long long v50;  // x0
    unsigned long long v51;  // w0
    unsigned int v52;  // w8
    unsigned long long v17;  // 4199
    unsigned long long v53;  // 4112
    unsigned long long v54;  // 4102
    unsigned long long v55;  // 4112
    unsigned long long v56;  // 4102
    unsigned long long v57;  // w8
    unsigned long long v58;  // 4102
    unsigned int v59;  // w0
    long long v60;  // x1
    unsigned long n;  // x23
    void* v62;  // x0
    unsigned long long v18;  // w22
    void* v63;  // x1
    unsigned long n1;  // x2
    unsigned int v65;  // w0
    unsigned long long v66;  // 4118
    st_a4bcd8_0 *v67;  // x8
    unsigned long long v19;  // x26
    st_a4bcd8_0 *v20;  // x0
    unsigned long v21;  // cc_ndep
    long long v22;  // x9
    unsigned long long v0;  // [bp-0xe4]
    uint320_t v1;  // [bp-0xe0], Other Possible Types: unsigned long long
    uint320_t v2;  // [bp-0xe0]
    unsigned long long v3;  // [bp-0xd0]
    uint384_t v4;  // [bp-0xc0], Other Possible Types: unsigned long long
    unsigned long long v5;  // [bp-0xb0]
    unsigned long long v6;  // [bp-0xa0]
    unsigned long long v7;  // [bp-0x90]
    unsigned long long v8;  // [bp-0x80]
    unsigned long long v9;  // [bp-0x70]
    unsigned long v10;  // [bp-0x68]
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]

    v11 = &v12;
    v13 = a1;
    v10 = *(long long *)&g_10002b0;
    v14 = 1;
    v15 = a5;
    v16 = 1;
    v17 = arm64g_calculate_condition(1, a5, 1, 0);
    if (!(v17 & 1))
    {
        v14 = 3;
        v15 = a5;
        v16 = 0;
        v18 = a5 != 0;
        *(unsigned int *)&a0[16] = v18;
        if (!v13)
            goto LABEL_a4bd70;
        goto LABEL_a4bd34;
    }
    v18 = (int)a0[16];
    if (v13)
    {
LABEL_a4bd34:
        if (a6)
        {
            v19 = 0;
            if (*(long long *)a0)
                goto LABEL_a4bd44;
            goto LABEL_a4bd58;
        }
        goto LABEL_a4bd9c;
    }
LABEL_a4bd70:
    v20 = *(long long *)a0;
    if (!v20)
    {
        sub_a368c8(NULL);
        sub_a369bc("crypto/evp/evp_enc.c", 118, "evp_cipher_init_internal");
        v38 = 131;
        goto LABEL_a4c5f0;
    }
    if (a6)
    {
        v19 = 0;
        if (!*(long long *)&v20->padding_3c[60])
            goto LABEL_a4bd88;
        goto LABEL_a4c1d4;
    }
    v21 = 0;
LABEL_a4bd9c:
    v22 = (long long)a0[8];
    if (!v22 || !(v23 = *(long long *)a0, v23 && (v20 = v15, !v13 || !(v14 = 3, v20 = v13->field_0, v16 = v23->field_0, v21 = 0, v13->field_0 != v23->field_0))))
    {
        v24 = 0;
        if (v13 && !a2)
        {
            a2 = 0;
            v24 = sub_a34f94(v13->field_0);
            v22 = (long long)a0[8];
        }
        if (a2 || v22 || v24)
        {
            v20 = *(long long *)a0;
            goto LABEL_a4be7c;
        }
        if (v13)
        {
            v20 = *(long long *)a0;
            if (*(int *)&v13->padding_c[12] == 2)
                goto LABEL_a4be7c;
            if (v20)
            {
                if (v20->field_30)
                    v20->field_30();
                sub_a6c4e8((long long)a0[120], v20->field_38, "crypto/evp/evp_enc.c", 167);
                *(unsigned long long *)&a0[120] = 0;
                v19 = 1;
                if (*(long long *)a0)
                {
LABEL_a4bd44:
                    v25 = (long long)a0[112];
                    sub_a4bab0(a0);
                    *(unsigned int *)&a0[16] = v18;
                    *(unsigned long *)&a0[112] = v25;
                }
            }
            else
            {
                v19 = 1;
            }
LABEL_a4bd58:
            v20 = v13;
            if (!*(long long *)&v20->padding_3c[60])
                goto LABEL_a4bd88;
            goto LABEL_a4c1d4;
        }
        v20 = *(long long *)a0;
        if (*(int *)&v20->padding_11[7] == 2)
        {
LABEL_a4be7c:
            v43 = (long long)a0[184];
            v14 = 4;
            if (v20 == v43)
                *(unsigned long long *)a0 = 0;
            v16 = v43;
            if (v16)
            {
                v16 = v43;
                if (!*(int *)(v16 + 24))
                {
                    do
                    {
                        /* unsupported instruction */;
                        v44 = /* unsupported instruction */;
                        v20 = v44;
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                    } while (/* unsupported instruction */ ^ 1);
                    v45 = arm64g_calculate_condition(19, v20, 1, 0);
                    if (!(v45 & 1))
                    {
                        /* unsupported instruction */;
                    }
                    else
                    {
                        v14 = 3;
                        v20 = v44;
                        v16 = 1;
                        if (1 < v44)
                            goto LABEL_a4bf80;
                    }
                    v14 = 3;
                    v16 = 1;
                    sub_a6c2e4(v43[13], "crypto/evp/evp_enc.c", 2113);
                    sub_a78ccc(v43[15]);
                    sub_a6c2e4(v43, "crypto/evp/evp_enc.c", 2116);
                }
            }
            v21 = 0;
LABEL_a4bf80:
            *(unsigned long long *)&a0[184] = 0;
            v23 = *(long long *)a0;
            if (!v13)
            {
                v21 = 0;
LABEL_a4c090:
                if (!v23)
                    goto LABEL_a4c5f8;
                goto LABEL_a4c094;
            }
            if (v23)
            {
                v46 = (long long)a0[112];
                sub_a4bab0(a0);
                *(unsigned int *)&a0[16] = v18;
                *(unsigned long *)&a0[112] = v46;
            }
            if (a2)
            {
                v47 = a2;
                if (sub_a32d54(a2))
                    goto LABEL_a4bfe8;
                sub_a368c8();
                v42 = 354;
                goto LABEL_a4c5e4;
            }
            v47 = v24;
            if (!v24)
                goto LABEL_a4c004;
LABEL_a4bfe8:
            v13 = sub_a34fb0(v47, v13->field_0);
            if (!v13)
            {
                sub_a368c8();
                v42 = 370;
                goto LABEL_a4c5e4;
            }
LABEL_a4c004:
            *(st_a4bcd8_2 **)a0 = v13;
            *(unsigned long long *)&a0[8] = v47;
            v49 = v13->field_38;
            if ((unsigned int)v49)
            {
                v50 = sub_a6bffc(v49, "crypto/evp/evp_enc.c", 387);
                *(unsigned long long *)&a0[120] = v50;
                if (v50)
                {
                    v23 = *(long long *)a0;
                    goto LABEL_a4c054;
                }
                else
                {
                    *(unsigned long long *)a0 = 0;
                    v20 = v50;
                }
            }
            else
            {
                *(unsigned long long *)&a0[120] = 0;
                v23 = v13;
LABEL_a4c054:
                *(unsigned int *)&a0[104] = v13->field_8;
                *(unsigned long long *)&a0[112] = (long long)a0[112] & 1;
                if (!(v23->field_10 >> 6 & 1))
                    goto LABEL_a4c094;
                v51 = (unsigned int)sub_a4d5dc(a0, 0, 0, 0);
                v14 = 3;
                v20 = v51;
                v16 = 1;
                if (v51 >= 1)
                {
                    v23 = *(long long *)a0;
                    goto LABEL_a4c090;
                }
                else
                {
                    *(unsigned long long *)a0 = 0;
                    sub_a368c8();
                    v42 = 401;
                    goto LABEL_a4c5e4;
                }
                goto LABEL_a4c5e4;
            }
        }
        else
        {
            v19 = 1;
            if (!*(long long *)&v20->padding_3c[60])
            {
LABEL_a4bd88:
                v26 = v20->field_0;
                if ((unsigned int)v26)
                    sub_a9976c(v26);
                v20 = sub_a4e6ec(0, 2);
                if (v20)
                {
                    v27 = (long long)a0[184];
                    if (v27 && !(int)v27[3])
                    {
                        do
                        {
                            /* unsupported instruction */;
                            v28 = /* unsupported instruction */;
                            /* unsupported instruction */;
                            /* unsupported instruction */;
                        } while (/* unsupported instruction */ ^ 1);
                        v29 = arm64g_calculate_condition(19, v28, 1, 0);
                        if (!(v29 & 1))
                        {
                            /* unsupported instruction */;
                        }
                        else if (1 < v28)
                        {
                            goto LABEL_a4c1c8;
                        }
                        sub_a6c2e4(v27[13], "crypto/evp/evp_enc.c", 2113);
                        sub_a78ccc(v27[15]);
                        sub_a6c2e4(v27, "crypto/evp/evp_enc.c", 2116);
                    }
LABEL_a4c1c8:
                    *(st_a4bcd8_0 **)&a0[184] = v20;
                    if (*(long long *)&v20->padding_3c[60])
                        goto LABEL_a4c1d4;
                    sub_c67460();
LABEL_a4c5f8:
                    v20 = 0;
                }
            }
            else
            {
LABEL_a4c1d4:
                v30 = (long long)a0[184];
                if (v20 != (long long)a0[184])
                {
                    if (!*(int *)&v20->padding_11[7])
                    {
                        do
                        {
                            /* unsupported instruction */;
                            /* unsupported instruction */;
                        } while (/* unsupported instruction */ ^ 1);
                        v30 = (long long)a0[184];
                    }
                    if (v30 && !(int)v30[3])
                    {
                        do
                        {
                            /* unsupported instruction */;
                            v31 = /* unsupported instruction */;
                            /* unsupported instruction */;
                            /* unsupported instruction */;
                        } while (/* unsupported instruction */ ^ 1);
                        v32 = arm64g_calculate_condition(19, v31, 1, 0);
                        if (!(v32 & 1))
                        {
                            /* unsupported instruction */;
                        }
                        else if (1 < v31)
                        {
                            goto LABEL_a4c270;
                        }
                        sub_a6c2e4(v30[13], "crypto/evp/evp_enc.c", 2113);
                        sub_a78ccc(v30[15]);
                        sub_a6c2e4(v30, "crypto/evp/evp_enc.c", 2116);
                    }
LABEL_a4c270:
                    *(st_a4bcd8_0 **)&a0[184] = v20;
                }
                *(st_a4bcd8_0 **)a0 = v20;
                if (v19 & 1)
                {
LABEL_a4c27c:
                    if (!(long long)a0[176])
                    {
                        sub_a79f54(*(long long *)&v20->padding_3c[60]);
                        v20->field_88();
                    }
                    if ((unsigned long long)((long long)a0[112]) >> 8 & 1)
                    {
                        v5 = 0;
                        v6 = 0;
                        v3 = 0;
                        v4 = 0;
                        v1 = 0;
                        v0 = 0;
                        *(long long *)&a0[112] = (long long)a0[112];
                        if (*(long long *)a0 && !*(long long *)(*(long long *)a0 + 120))
                            goto LABEL_a4c2f4;
                        sub_a70404("padding", &v0);
                        v20 = sub_a52694(*(long long *)a0, (long long)a0[176], &v1);
                        if ((unsigned int)v20)
                            goto LABEL_a4c2f4;
                    }
                    else
                    {
LABEL_a4c2f4:
                        if (a7)
                        {
                            v9 = 0;
                            v7 = 0;
                            v8 = 0;
                            v4 = _INSERT(CONCAT(v4, 0), 16, 0);
                            *(uint128_t *)((char *)&v4 + 32) = 0;
                            v1 = _INSERT(CONCAT(v1, 0), 16, 0);
                            v2 = _INSERT(CONCAT(v1, 0), 0, 0);
                            v2 = _INSERT(v1, 0, 0);
                            v33 = sub_a6fbc4(a7, "keylen");
                            iter = &v2;
                            if (v33)
                            {
                                iter = (char *)&v2 + 8;
                                v4 = _INSERT(CONCAT(v2, 0), 0, *(long long *)(v33 + 32));
                                v1 = _INSERT(v2, 0, *(int128_t *)v33);
                                v2 = _INSERT(v1, 16, *(int128_t *)(v33 + 16));
                            }
                            idx = sub_a6fbc4(a7, "ivlen");
                            if (idx)
                            {
                                v36 = *(int128_t *)idx;
                                v37 = *(int128_t *)(idx + 16);
                                iter->field_20 = *(long long *)(idx + 32);
                                iter->field_0 = v36;
                                iter->field_10 = v37;
                                iter += 1;
                            }
                            if (iter == &v2 || sub_a4dcac(a0, &v2))
                                goto LABEL_a4c380;
                            sub_a368c8();
                            sub_a369bc("crypto/evp/evp_enc.c", 273, "evp_cipher_init_internal");
                            v38 = 0xdd;
                            goto LABEL_a4c5f0;
                        }
                        else
                        {
LABEL_a4c380:
                            if (!(unsigned int)v19)
                                goto LABEL_a4c578;
                            v39 = *(long long *)a0;
                            if (v18)
                            {
                                v40 = v39->field_90;
                                if (!v40)
                                {
                                    if (!a3)
                                    {
                                        v41 = v39->field_118;
                                        if (v41)
                                        {
                                            if (a4)
                                            {
                                                sub_a4fbf0(a0);
                                                v41();
                                            }
                                            v41();
                                        }
                                    }
                                    sub_a368c8();
                                    v42 = 296;
                                }
                                else if (a3)
                                {
                                    sub_a50904(a0);
                                    if (!a4)
                                        v40();
                                    sub_a4fbf0(a0);
                                    v40();
                                }
                                else if (a4)
                                {
                                    sub_a4fbf0(a0);
                                    v40();
                                }
                                else
                                {
                                    v40();
                                }
                            }
                            else
                            {
                                v40 = v39->field_98;
                                if (v40)
                                {
                                    if (a3)
                                        sub_a50904(a0);
                                    if (!a4)
                                        v40();
                                    sub_a4fbf0(a0);
                                    v40();
                                }
                                else
                                {
                                    if (!a3)
                                    {
                                        v41 = v39->field_120;
                                        if (v41)
                                        {
                                            if (a4)
                                            {
                                                sub_a4fbf0(a0);
                                                v41();
                                            }
                                            v41();
                                        }
                                    }
                                    sub_a368c8();
                                    v42 = 322;
                                }
                            }
LABEL_a4c5e4:
                            sub_a369bc("crypto/evp/evp_enc.c", v42, "evp_cipher_init_internal");
                            v38 = 134;
                            goto LABEL_a4c5f0;
                        }
                    }
                }
                else
                {
                    if (v18)
                    {
                        if (*(long long *)&v20->padding_a0[24])
                            goto LABEL_a4c3d4;
                    }
                    else
                    {
                        if (*(long long *)&v20->padding_a0[32])
                        {
LABEL_a4c3d4:
                            if (*(long long *)&v20->padding_a0[40] && *(long long *)&v20->padding_a0[48])
                                goto LABEL_a4c27c;
                        }
                    }
                    sub_a368c8();
                    sub_a369bc("crypto/evp/evp_enc.c", 223, "evp_cipher_init_internal");
                    v38 = 230;
                    goto LABEL_a4c5f0;
                }
            }
        }
    }
    else
    {
LABEL_a4c094:
        v52 = 1 << ((char)v23->field_4 & 31) & 65794;
        if (v23->field_4 <= 16)
        {
            v53 = arm64g_calculate_condition(v14 | 144, v20, v16, v21);
            v54 = arm64g_calculate_condition(3, (v53 & 1 ? v52 : 0x40000000), 0, 0);
            if (v54 & 1)
                sub_a69928("assertion failed: ctx->cipher->block_size == 1 || ctx->cipher->block_size == 8 || ctx->cipher->block_size == 16", "crypto/evp/evp_enc.c", 415);
        }
        else
        {
            v55 = arm64g_calculate_condition(v14 | 144, v20, v16, v21);
            v56 = arm64g_calculate_condition(0, (v55 & 1 ? v52 : 0x40000000), 0, 0);
            if (v56 & 1)
                sub_a69928("assertion failed: ctx->cipher->block_size == 1 || ctx->cipher->block_size == 8 || ctx->cipher->block_size == 16", "crypto/evp/evp_enc.c", 415);
        }
        if (!((char)a0[112] & 1) && sub_a4fdf4(sub_a2d030(a0)) == 65538)
        {
            sub_a368c8();
            sub_a369bc("crypto/evp/evp_enc.c", 419, "evp_cipher_init_internal");
            v38 = 0xaa;
            goto LABEL_a4c5f0;
        }
        if (!(sub_a2cf88(sub_a2d030(a0)) >> 4 & 1))
        {
            v57 = (unsigned int)sub_a4fdf4(sub_a2d030(a0));
            v20 = 0;
            if (2 >= v57)
            {
                v58 = arm64g_calculate_condition(0x33, v57, 2, 0);
                if (v58 & 1)
                    goto LABEL_a4c534;
                if (v57 == 2)
                    goto LABEL_a4c14c;
            }
            else
            {
                if (2 > v57 - 3)
                {
                    *(unsigned int *)&a0[88] = 0;
LABEL_a4c14c:
                    v59 = sub_a4fbf0(a0);
                    if (v59 >= 0x11)
                    {
                        sub_a368c8();
                        v60 = 441;
                        goto LABEL_a4c174;
                    }
                    else
                    {
                        n = v59;
                        if (a4)
                            _memcpy(a0 + 24, a4, n);
                        v62 = a0 + 40;
                        v63 = a0 + 24;
                        n1 = n;
                        goto LABEL_a4c530;
                    }
                }
                if (v57 == 5)
                {
                    *(unsigned int *)&a0[88] = 0;
                    if (!a4)
                        goto LABEL_a4c534;
                    v65 = sub_a4fbf0(a0);
                    v66 = arm64g_calculate_condition(129, v65 - 0x11, 0x11, 0);
                    if (!(v66 & 1))
                    {
                        sub_a368c8();
                        v60 = 455;
LABEL_a4c174:
                        sub_a369bc("crypto/evp/evp_enc.c", v60, "evp_cipher_init_internal");
                        v38 = 194;
                    }
                    else
                    {
                        n1 = v65;
                        v62 = a0 + 40;
                        v63 = a4;
LABEL_a4c530:
                        _memcpy(v62, v63, n1);
                        goto LABEL_a4c534;
                    }
LABEL_a4c5f0:
                    sub_a36abc(6, v38, 0);
                    goto LABEL_a4c5f8;
                }
            }
        }
        else
        {
LABEL_a4c534:
            v67 = *(long long *)a0;
            if (a3 || v67->field_10 >> 5 & 1)
                v67->field_20();
            *(unsigned int *)&a0[20] = 0;
            *(unsigned int *)&a0[128] = 0;
            *(unsigned int *)&a0[132] = v67->field_4 - 1;
LABEL_a4c578:
            v20 = 1;
        }
    }
    if (*(long long *)&g_10002b0 == v10)
        return v20;
    ___stack_chk_fail();
    sub_a69928("assertion failed: ctx->cipher->block_size == 1 || ctx->cipher->block_size == 8 || ctx->cipher->block_size == 16", "crypto/evp/evp_enc.c", 415);
}
