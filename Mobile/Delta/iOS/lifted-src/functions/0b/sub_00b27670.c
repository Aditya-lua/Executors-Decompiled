/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb27670..0xb27a78 (1032 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b27670_3 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[4];
    unsigned long long field_10;
} st_b27670_3;

typedef struct st_b27670_0 {
    unsigned long long field_0;
    unsigned int field_8;
    char padding_c[52];
    void* field_40;
    void* field_48;
} st_b27670_0;

typedef struct st_b27670_1 {
    char padding_0[8];
    long long field_8;
} st_b27670_1;

typedef struct st_b27670_2 {
    struct st_b27670_1 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_b27670_2;

extern st_b27670_2 g_ee1d60;

void* sub_b27670(long long a0, void* a1, long long a2)
{
    st_b27670_0 *v5;  // x19
    uint128_t *v6;  // x25
    unsigned long v12;  // cc_ndep
    unsigned long long v13;  // 4110
    unsigned long long v14;  // 4102
    unsigned long v15;  // cc_op
    unsigned long v16;  // cc_dep1
    unsigned long v17;  // cc_dep2
    unsigned long long v18;  // 4110
    unsigned long long v19;  // 4102
    void* v7;  // x0
    void* v20;  // x26
    st_b27670_3 *v21;  // x26
    void* v22;  // x8
    void* v8;  // w8
    unsigned long v23;  // x8
    unsigned long v24;  // x8
    long long v9;  // x0
    unsigned long v25;  // x24
    unsigned long v26;  // x27
    void* v27;  // x20
    void* v28;  // w8
    void* iter;  // x27
    unsigned long v30;  // x8
    void* v31;  // x27
    long long v32;  // x1
    unsigned long v33;  // x8
    void* v10;  // x0
    void* v35;  // x27
    void* v36;  // x9
    unsigned long v37;  // x8
    unsigned long v38;  // x8
    uint128_t v40;  // q1
    void* v41;  // x9
    unsigned long v42;  // x8
    unsigned long v43;  // x8
    long long v44;  // x0
    void* v11;  // x28
    unsigned long v0;  // [bp-0x80]
    unsigned long v1;  // [bp-0x70]
    void* v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = sub_c4c40();
    v6 = sub_a7f878(a0);
    v7 = sub_a8002c(a0);
    v8 = (void*)(v5->field_8 - 1457);
    if (2 < v8)
    {
        return 0;
    }
    else if (v7)
    {
        v9 = sub_b5b138(a2, "ml-dsa.output_formats", 0);
        v10 = sub_b26e60(v5->field_0, *(long long *)(*(long long *)((char *)&g_ee1d60.field_0 + 0x8 * v8) + 8), "output", v9);
        if (!v10)
            return 0;
        v11 = *(long long *)v10;
        if (v11)
        {
            v13 = arm64g_calculate_condition(v15 | 16, v16, v17, v12);
            v14 = arm64g_calculate_condition(4, (v13 & 1 ? v6 : 0), 0, 0);
            if (v14 & 1)
                goto LABEL_b2777c;
LABEL_b2771c:
            if (!v11 || !(v20 = v11, v21 = v20 + 40, ((long long)v20[40] | 32) == 32))
                goto LABEL_b27820;
            v22 = (long long)v11[64];
            if ((long long)v11[64])
                goto LABEL_b277a0;
        }
        else
        {
            v18 = arm64g_calculate_condition(v15 | 16, v16, v17, v12);
            v19 = arm64g_calculate_condition(0, (v18 & 1 ? v6 : 0), 0, 0);
            if (!(v19 & 1))
                goto LABEL_b2771c;
LABEL_b2777c:
            v23 = v10 + 16;
            while (1)
            {
                v24 = v23;
                if (!(long long)v11[40])
                    break;
                v11 = *(long long *)v24;
                v23 = v24 + 16;
                if (!*(long long *)v24)
                    goto LABEL_b27820;
            }
            v21 = v11 + 40;
            v22 = (long long)v11[64];
            if ((long long)v11[64])
            {
LABEL_b277a0:
                if (v22 != v5->field_40)
                    goto LABEL_b27820;
            }
        }
        if (!(long long)v11[80] || (long long)v11[80] == v5->field_48)
        {
            v25 = (long long)v11[8];
            if (!a1)
            {
                v27 = 0;
                goto LABEL_b278b4;
            }
            v2 = v10;
            v26 = (int)v25;
            v27 = sub_a6bf4c(v26, "providers/implementations/encode_decode/ml_dsa_codecs.c", 341);
            if (!v27)
            {
                sub_a6c2e4(v2, "providers/implementations/encode_decode/ml_dsa_codecs.c", 403);
                sub_a6c2e4(v27, "providers/implementations/encode_decode/ml_dsa_codecs.c", 405);
                return 0;
            }
            v1 = v26;
            iter = v27;
            switch (v28)
            {
            case 0:
                v30 = (int)v11[20];
                v31 = v27;
                *(unsigned int *)v31 = (((((v30 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v30 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v30 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v30 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                iter = v31 + 4;
                goto LABEL_b278e8;
            case 2:
                v33 = (short)v11[20];
                v35 = v27;
                *(unsigned short *)v35 = (((((v33 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v33 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v33 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v33 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
                iter = v35 + 2;
            case 4:
LABEL_b278e8:
                if (v21->padding_0)
                {
                    v36 = iter + 2;
                    v37 = (long long)v11[32];
                    if (v36 == v27 + v37)
                    {
                        v38 = (short)v11[24];
                        *(unsigned short *)iter = (((((v38 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v38 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v38 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v38 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
                        v37 = (long long)v11[32];
                        iter = v36;
                    }
                    if (iter != v27 + v37)
                    {
                        sub_a368c8();
                        v32 = 367;
                        break;
                    }
                    else
                    {
                        v40 = v6[1];
                        *(uint128_t *)iter = *v6;
                        *(uint128_t *)&iter[16] = v40;
                        iter += 32;
                        goto LABEL_b27968;
                    }
                }
                else
                {
LABEL_b27968:
                    v10 = v2;
                    if ((long long)v11[64])
                    {
                        v41 = iter + 4;
                        v42 = (long long)v11[56];
                        if (v41 == v27 + v42)
                        {
                            v43 = (int)v11[48];
                            *(unsigned int *)iter = (((((v43 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v43 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v43 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v43 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                            v42 = (long long)v11[56];
                            iter = v41;
                        }
                        if (iter != v27 + v42)
                        {
                            sub_a368c8();
                            v32 = 378;
                            break;
                        }
                        else
                        {
                            _memcpy(iter, v7, v5->field_40);
                            iter += v5->field_40;
                            v10 = v2;
                            goto LABEL_b279e0;
                        }
                    }
                    else
                    {
LABEL_b279e0:
                        if (!(long long)v11[80])
                        {
LABEL_b27a60:
                            if (iter != v27 + v1)
                            {
                                sub_a6c2e4(v10, "providers/implementations/encode_decode/ml_dsa_codecs.c", 403);
                                sub_a6c2e4(v27, "providers/implementations/encode_decode/ml_dsa_codecs.c", 405);
                                return 0;
                            }
                            *(void* *)a1 = v27;
LABEL_b278b4:
                            sub_a6c2e4();
                            if ((unsigned int)v25)
                                return v25;
                            sub_a6c2e4(v27, "providers/implementations/encode_decode/ml_dsa_codecs.c", 405);
                            return 0;
                        }
                        else if (iter != v27 + (long long)v11[72])
                        {
                            sub_a368c8();
                            v32 = 389;
                            break;
                        }
                        else
                        {
                            v44 = sub_a01e1c(a0);
                            _memcpy(iter, v44, v5->field_48);
                            iter += v5->field_48;
                            v10 = v2;
                            goto LABEL_b27a60;
                        }
                    }
                }
            default:
                sub_a368c8();
                v32 = 354;
                break;
            }
            sub_a369bc("providers/implementations/encode_decode/ml_dsa_codecs.c", v32, "ossl_ml_dsa_i2d_prvkey");
            v0 = v5->field_0;
            sub_a36abc(57, 0xc0103, "error encoding %s private key");
            sub_a6c2e4(v2, "providers/implementations/encode_decode/ml_dsa_codecs.c", 403);
            sub_a6c2e4(v27, "providers/implementations/encode_decode/ml_dsa_codecs.c", 405);
            return 0;
        }
LABEL_b27820:
        sub_a368c8();
        sub_a369bc("providers/implementations/encode_decode/ml_dsa_codecs.c", 329, "ossl_ml_dsa_i2d_prvkey");
        v0 = v5->field_0;
        sub_a36abc(57, 245, "no matching enabled %s private key output formats");
        sub_a6c2e4(v10, "providers/implementations/encode_decode/ml_dsa_codecs.c", 403);
        sub_a6c2e4(0, "providers/implementations/encode_decode/ml_dsa_codecs.c", 405);
        return 0;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/encode_decode/ml_dsa_codecs.c", 307, "ossl_ml_dsa_i2d_prvkey");
        v0 = v5->field_0;
        sub_a36abc(57, 0xdd, "no %s private key data available");
        return 0;
    }
}
