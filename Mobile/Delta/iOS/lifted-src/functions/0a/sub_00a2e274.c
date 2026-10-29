/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2e274..0xa2eb20 (2220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2e274_2 {
    unsigned long long field_0;
    char padding_8[8];
    unsigned int field_10;
} st_a2e274_2;

typedef struct st_a2e274_1 {
    unsigned long long field_0;
    char padding_8[8];
    unsigned int field_10;
    char padding_14[4];
    unsigned int field_18;
} st_a2e274_1;

typedef struct st_a2e274_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned int field_8;
    char padding_c[4];
    unsigned int field_10;
    char padding_14[4];
    unsigned int field_18;
    char padding_1c[4];
    unsigned int field_20;
    char padding_24[4];
    unsigned int field_28;
} st_a2e274_0;

extern long long g_a2c910;
extern long long g_a2c970;
extern long long g_a2eb30;
extern long long g_a2ec1c;
extern long long g_a2edc0;
extern long long g_a2efd4;
extern long long g_a2f040;
extern long long g_a55830;
extern char g_10002b0;

unsigned int sub_a2e274(unsigned long a0, unsigned int a1, unsigned int a2, unsigned int a3, unsigned long long a4, unsigned long a5, unsigned int a6)
{
    unsigned int v24;  // x0
    long long *v25;  // x19
    unsigned int v34;  // x0
    unsigned int v35;  // x1
    long long *v36;  // x28
    unsigned int v37;  // x0
    st_a2e274_0 *v38;  // x27
    unsigned int v39;  // x0
    unsigned int v40;  // x0
    unsigned int v41;  // x0
    unsigned int v42;  // x0
    unsigned int v43;  // x0
    char *v26;  // x21
    unsigned int idx;  // x24
    unsigned int v45;  // x0
    long long v46;  // x1
    unsigned int v47;  // x0
    st_a2e274_2 *v48;  // x25
    unsigned int v49;  // x0
    void* v50;  // x22
    long long v51;  // x23
    unsigned int v52;  // x0
    long long v53;  // x20
    unsigned int v27;  // x0
    unsigned int v54;  // x0
    long long v55;  // x1
    long long v56;  // x19
    long long v57;  // x1
    unsigned int index;  // x21
    unsigned int v29;  // x0
    unsigned int v30;  // x0
    unsigned int v31;  // x0
    st_a2e274_1 *v32;  // x9
    unsigned int v33;  // x28
    unsigned int v0;  // [bp-0x178], Other Possible Types: unsigned long long
    unsigned int v1;  // [bp-0x170]
    unsigned int v2;  // [bp-0x168]
    unsigned long v3;  // [bp-0x160]
    unsigned long long v4;  // [bp-0x158]
    unsigned long long v5;  // [bp-0x150]
    unsigned int v6;  // [bp-0x148]
    unsigned long long v7;  // [bp-0x140]
    unsigned long v8;  // [bp-0x130], Other Possible Types: unsigned int
    unsigned int v9;  // [bp-0x128]
    uint128_t v10;  // [bp-0x120], Other Possible Types: unsigned int, unsigned long long
    uint128_t v11;  // [bp-0x110], Other Possible Types: unsigned int, unsigned long long
    unsigned int v12;  // [bp-0x100], Other Possible Types: unsigned long long
    unsigned int v13;  // [bp-0xf0]
    uint128_t v14;  // [bp-0xe0], Other Possible Types: unsigned int
    unsigned int v15;  // [bp-0xd0], Other Possible Types: unsigned long long
    unsigned int v16;  // [bp-0xc0]
    unsigned int v17;  // [bp-0xb0]
    unsigned int v18;  // [bp-0xa0]
    unsigned int v19;  // [bp-0x90]
    unsigned int v20;  // [bp-0x80]
    unsigned long v21;  // [bp-0x70]
    char *v22;  // [bp-0x10]
    char v23;  // [bp+0x0]

    v22 = &v23;
    v21 = *(long long *)&g_10002b0;
    v20 = 0;
    v18 = 0;
    v19 = 0;
    v16 = 0;
    v17 = 0;
    v14 = 0;
    v15 = 0;
    v13 = 0;
    v24 = sub_a6820c(a5, 20);
    if (!v24)
    {
        sub_a368c8();
        v57 = 839;
        goto LABEL_a2e4dc;
    }
    v25 = (long long *)v24;
    if (a2)
    {
        v26 = &v15 + 2;
        sub_a71618("data-structure", a2, 0);
        v13 = v8;
        v14 = v10;
        v15 = v11;
        if (a6)
            goto LABEL_a2e324;
    }
    else
    {
        v26 = &v13;
        if (a6)
        {
LABEL_a2e324:
            sub_a71618("properties", a6, 0);
            *(uint128_t *)v26 = v8;
            *(uint128_t *)&v26[16] = v10;
            *(unsigned long long *)&v26[32] = v11;
        }
    }
    v3 = a1;
    v4 = a2;
    v5 = a3;
    v6 = a4;
    v7 = a6;
    if (!sub_a7c17c(*v25))
    {
        sub_a368c8();
        sub_a369bc("crypto/encode_decode/decoder_pkey.c", 857, "OSSL_DECODER_CTX_new_for_pkey");
        sub_a36abc(60, 0x8000f, 0);
        if (*(long long *)&g_10002b0 == v21)
            return 0;
        ___stack_chk_fail();
    }
    v27 = sub_a66b6c(v25[1], &v3);
    if (v27)
    {
        index = *(long long *)(v27 + 40);
        if (!index)
        {
            sub_a7c1b4(*v25);
            if (*(long long *)&g_10002b0 == v21)
                return 0;
            ___stack_chk_fail();
        }
        goto LABEL_a2e380;
    }
    v29 = sub_a2d8a0(sub_a7c1b4(*v25));
    if (!v29)
    {
        sub_a368c8();
        v57 = 873;
LABEL_a2e4dc:
        sub_a369bc("crypto/encode_decode/decoder_pkey.c", v57, "OSSL_DECODER_CTX_new_for_pkey");
        sub_a36abc(60, 0x8003c, 0);
        if (*(long long *)&g_10002b0 == v21)
            return 0;
        ___stack_chk_fail();
    }
    index = v29;
    if (sub_a2c604() && sub_a2c62c(index, a2) && sub_a2c5dc(index, a4))
    {
        v12 = 0;
        v10 = 0;
        v11 = 0;
        v8 = 0;
        v2 = sub_a6bffc(56, "crypto/encode_decode/decoder_pkey.c", 461);
        if (!v2)
        {
            sub_aa6fd0();
        }
        else if (!a6 || !(v30 = sub_a6d9b4(a6, "crypto/encode_decode/decoder_pkey.c", 464), *(unsigned long long *)(v2 + 8) = v30, !v30))
        {
            v31 = sub_ad61b4();
            if (v31)
            {
                v32 = (st_a2e274_1 *)v2;
                *(unsigned long long *)&v32[1].padding_8[4] = 0;
                v32->field_0 = a5;
                v32->field_10 = *(int *)(index + 16);
                v0 = v31;
                *(unsigned long long *)&v32->field_18 = v31;
                if (a6)
                    v33 = sub_aa6be0(a5, a6, 1);
                else
                    v33 = 0;
                v34 = sub_aa5178(a5, 0);
                if (!v34 || (v35 = *(long long *)v34, !v35))
                {
                    v35 = v33;
                }
                else if (v33)
                {
                    v1 = sub_aa6fe0(v33);
                    sub_aa6fd0(v33);
                    v35 = v1;
                    v33 = v35;
                    if (!v35)
                        goto LABEL_a2e7c4;
                }
                v8 = a5;
                v9 = index;
                *(unsigned int *)((char *)&v11 + 8) = v35;
                v12 = v0;
                v10 = a3;
                sub_a558e8(a5, &g_a2eb30, &v8);
                v1 = v33;
                if (*(char *)((void*)&v11 + 4) || (sub_a2d804(a5, &g_a2ec1c, &v8), *(char *)((void*)&v11 + 4)))
                    goto LABEL_a2e81c;
                if (sub_a2c0c0(index))
                {
                    if (!sub_a2cf94(index, &g_a2edc0) || !sub_a2cfbc(index, v2) || !sub_a2cfe4(index, &g_a2efd4))
                        goto LABEL_a2e81c;
                    sub_aa6fd0(v1);
LABEL_a2e88c:
                    if (sub_a2cb00(index, a5, a6) && (!a6 || sub_a2d8b4(index, &v13)))
                    {
                        v37 = sub_a6bffc(48, "crypto/encode_decode/decoder_pkey.c", 906);
                        if (!v37)
                        {
                            sub_a2d974(index);
                            if (*(long long *)&g_10002b0 == v21)
                                return 0;
                            ___stack_chk_fail();
                        }
                        v38 = (st_a2e274_0 *)v37;
                        if (a1 && !(v39 = sub_a6d9b4(a1, "crypto/encode_decode/decoder_pkey.c", 913), *(unsigned long long *)&v38->field_0 = v39, v39) || a2 && !(v40 = sub_a6d9b4(a2, "crypto/encode_decode/decoder_pkey.c", 918), *(unsigned long long *)&v38->field_8 = v40, v40) || a3 && !(v41 = sub_a6d9b4(a3, "crypto/encode_decode/decoder_pkey.c", 923), *(unsigned long long *)&v38->field_10 = v41, v41) || a6 && (v42 = sub_a6d9b4(a6, "crypto/encode_decode/decoder_pkey.c", 928), *(unsigned long long *)&v38->field_20 = v42, !v42))
                        {
LABEL_a2eb10:
                            sub_a2e160(v38);
                            sub_a2d974(index);
                            if (*(long long *)&g_10002b0 == v21)
                                return 0;
                            ___stack_chk_fail();
                        }
                        v38->field_18 = a4;
                        *(unsigned long long *)&v38->field_28 = index;
                        if (sub_a7c198(*v25))
                        {
                            v43 = sub_a66b6c(v25[1], &v3);
                            if (v43)
                            {
                                sub_a2e160(v38);
                                index = *(long long *)(v43 + 40);
                                if (!index)
                                {
                                    sub_a7c1b4(*v25);
                                    if (*(long long *)&g_10002b0 == v21)
                                        return 0;
                                    ___stack_chk_fail();
                                }
                            }
                            else
                            {
                                sub_a66794(v25[1], v38);
                                if (sub_a66e38(v25[1]))
                                {
                                    v56 = 945;
LABEL_a2eae0:
                                    sub_a368c8();
                                    sub_a369bc("crypto/encode_decode/decoder_pkey.c", v56, "OSSL_DECODER_CTX_new_for_pkey");
                                    sub_a36abc(60, 0x8000f, 0);
                                    index = 0;
                                    goto LABEL_a2eb10;
                                }
                            }
                        }
                        else
                        {
                            v56 = 937;
                            goto LABEL_a2eae0;
                        }
LABEL_a2e380:
                        idx = sub_a2d8a0();
                        if (idx)
                        {
                            if (sub_a2c604(idx, a1) && sub_a2c62c(idx, a2))
                            {
                                *(int *)(idx + 16) = *(int *)(index + 16);
                                if (*(long long *)(index + 24) && (v45 = sub_ad606c(*(long long *)(index + 24), &g_a2c970, &g_a2c910), *(unsigned long long *)(idx + 24) = v45, !v45))
                                {
                                    sub_a368c8();
                                    v46 = 604;
                                }
                                else if (sub_a2cf94(idx, sub_a2d00c(index)))
                                {
                                    v47 = sub_a2d018(index);
                                    if (v47)
                                    {
                                        v48 = (st_a2e274_2 *)v47;
                                        v49 = sub_a6bffc(56, "crypto/encode_decode/decoder_pkey.c", 617);
                                        if (v49)
                                        {
                                            v50 = (void*)v49;
                                            v51 = 524348;
                                            if (v48->padding_8 && (v52 = sub_a6d9b4(v48->padding_8, "crypto/encode_decode/decoder_pkey.c", 623), *(unsigned long long *)&v50[8] = v52, !v52))
                                            {
                                                v51 = 524303;
                                                v53 = 625;
                                            }
                                            else if (!*(long long *)((char *)&v48[1].field_0 + 4) || !(v54 = sub_ad606c(*(long long *)((char *)&v48[1].field_0 + 4), &g_a2f040, &g_a55830), *(unsigned long long *)&v50[24] = v54, !v54))
                                            {
                                                *(unsigned long *)&v50[40] = a0;
                                                *(unsigned long long *)v50 = v48->field_0;
                                                *(unsigned int *)&v50[16] = v48->field_10;
                                                *(unsigned long long *)&v50[48] = idx;
                                                if (sub_a2cfbc(idx, v50))
                                                    goto LABEL_a2e490;
                                                v53 = 646;
                                            }
                                            else
                                            {
                                                v51 = 524294;
                                                v53 = 636;
                                            }
                                            sub_a368c8();
                                            sub_a369bc("crypto/encode_decode/decoder_pkey.c", v53, "ossl_decoder_ctx_for_pkey_dup");
                                            sub_a36abc(60, v51, 0);
                                            sub_ad6958((long long)v50[24], &g_a55830);
                                            sub_a6c2e4((long long)v50[8], "crypto/encode_decode/decoder_pkey.c", 210);
                                            sub_a6c2e4((long long)v50[32], "crypto/encode_decode/decoder_pkey.c", 211);
                                            sub_a6c2e4(v50, "crypto/encode_decode/decoder_pkey.c", 212);
LABEL_a2e640:
                                            sub_a2d974(idx);
                                            sub_a7c1b4(*v25);
                                            if (*(long long *)&g_10002b0 == v21)
                                                return 0;
                                            ___stack_chk_fail();
                                        }
                                        else
                                        {
                                            sub_a368c8();
                                            sub_a369bc("crypto/encode_decode/decoder_pkey.c", 619, "ossl_decoder_ctx_for_pkey_dup");
                                            v55 = 524303;
                                            goto LABEL_a2e638;
                                        }
                                        goto LABEL_a2e638;
                                    }
                                    else
                                    {
LABEL_a2e490:
                                        if (!sub_a2cfe4(idx, sub_a2d024(index)))
                                        {
                                            sub_a368c8();
                                            v46 = 654;
                                        }
                                        else
                                        {
                                            sub_a7c1b4(*v25);
                                            if (*(long long *)&g_10002b0 == v21)
                                                return idx;
                                            ___stack_chk_fail();
                                        }
                                    }
                                }
                                else
                                {
                                    sub_a368c8();
                                    v46 = 611;
                                }
                            }
                            else
                            {
                                sub_a368c8();
                                v46 = 593;
                            }
                            sub_a369bc("crypto/encode_decode/decoder_pkey.c", v46, "ossl_decoder_ctx_for_pkey_dup");
                            v55 = 524348;
LABEL_a2e638:
                            sub_a36abc(60, v55, 0);
                            goto LABEL_a2e640;
                        }
                        else
                        {
                            sub_a368c8();
                            sub_a369bc("crypto/encode_decode/decoder_pkey.c", 587, "ossl_decoder_ctx_for_pkey_dup");
                            sub_a36abc(60, 0x8003c, 0);
                            sub_a7c1b4(*v25);
                            if (*(long long *)&g_10002b0 == v21)
                                return idx;
                            ___stack_chk_fail();
                        }
                    }
                }
                else
                {
                    v0 = 0;
LABEL_a2e824:
                    v36 = (long long *)v2;
                    sub_ad6958(v36[3], &g_a55830);
                    sub_a6c2e4(v36[1], "crypto/encode_decode/decoder_pkey.c", 210);
                    sub_a6c2e4(v36[4], "crypto/encode_decode/decoder_pkey.c", 211);
                    sub_a6c2e4(v36, "crypto/encode_decode/decoder_pkey.c", 212);
                    sub_aa6fd0(v1);
                    if (!(v0 & 1))
                        goto LABEL_a2e88c;
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/encode_decode/decoder_pkey.c", 470, "ossl_decoder_ctx_setup_for_pkey");
                sub_a36abc(60, 0x8000f, 0);
                v1 = 0;
                goto LABEL_a2e81c;
            }
        }
        else
        {
LABEL_a2e7c4:
            v1 = 0;
LABEL_a2e81c:
            v0 = 1;
            goto LABEL_a2e824;
        }
    }
    sub_a368c8();
    sub_a369bc("crypto/encode_decode/decoder_pkey.c", 901, "OSSL_DECODER_CTX_new_for_pkey");
    sub_a36abc(60, 0x8003c, 0);
    sub_a2d974(index);
    if (*(long long *)&g_10002b0 == v21)
        return 0;
    ___stack_chk_fail();
}
