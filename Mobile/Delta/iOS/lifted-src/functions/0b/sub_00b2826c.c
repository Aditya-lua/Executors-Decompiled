/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2826c..0xb2867c (1040 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2826c_4 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[4];
    unsigned long long field_10;
} st_b2826c_4;

typedef struct st_b2826c_0 {
    unsigned long long field_0;
    void* field_8;
    char padding_10[8];
    void* field_18;
    char padding_20[32];
    unsigned int field_40;
} st_b2826c_0;

typedef struct st_b2826c_1 {
    struct st_b2826c_0 *field_0;
    char padding_8[72];
    void* field_50;
    char padding_58[8];
    void* field_60;
} st_b2826c_1;

typedef struct st_b2826c_2 {
    char padding_0[8];
    long long field_8;
} st_b2826c_2;

typedef struct st_b2826c_3 {
    struct st_b2826c_2 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_b2826c_3;

extern st_b2826c_3 g_ee23d8;

void* sub_b2826c(st_b2826c_1 *a0, void* a1, long long a2)
{
    st_b2826c_0 *v3;  // x24
    void* v4;  // w8
    void* v13;  // x9
    unsigned long v14;  // x21
    unsigned long v15;  // x22
    void* v16;  // x19
    void* v17;  // w9
    void* iter;  // x23
    void* v19;  // x8
    unsigned long v20;  // x9
    void* v21;  // x23
    long long v22;  // x1
    long long v5;  // x0
    unsigned long v23;  // x9
    void* v25;  // x23
    void* v26;  // x9
    unsigned long v27;  // x8
    unsigned long v28;  // x8
    void* v30;  // x9
    unsigned long v31;  // x8
    unsigned long v32;  // x8
    void* v6;  // x0
    void* v7;  // x27
    unsigned long long v8;  // x10
    void* v9;  // x11
    unsigned long long v10;  // x10
    void* v11;  // x28
    st_b2826c_4 *v12;  // x28
    unsigned long v0;  // [bp-0x70]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a0->field_0;
    v4 = (void*)(v3->field_40 - 1454);
    if (2 < v4)
        return 0;
    if (a0->field_50)
    {
        v5 = sub_b5b138(a2, "ml-kem.output_formats", 0);
        v6 = sub_b26e60(v3->field_0, *(long long *)(*(long long *)((char *)&g_ee23d8.field_0 + 0x8 * v4) + 8), "output", v5);
        if (v6)
        {
            v7 = *(long long *)v6;
            if (v7)
            {
                v8 = 16;
                v9 = v7;
                while (1)
                {
                    v10 = v8;
                    if (a0->field_60)
                    {
                        v11 = v7;
                        v12 = v11 + 40;
                        if (((long long)v11[40] | 64) != 64)
                            break;
                        v13 = (long long)v7[64];
                        if (!(long long)v7[64])
                            goto LABEL_b2839c;
                        goto LABEL_b28390;
                    }
                    else if ((long long)v9[40])
                    {
                        v9 = *(long long *)((char *)v6 + v10);
                        v8 = v10 + 16;
                        if (!*(long long *)((char *)v6 + v10))
                            break;
                    }
                    else
                    {
                        v12 = v9 + 40;
                        v7 = v9;
                        v13 = (long long)v7[64];
                        if (!(long long)v7[64])
                            goto LABEL_b2839c;
LABEL_b28390:
                        if (v13 != v3->field_8)
                            break;
LABEL_b2839c:
                        if (!(long long)v7[80] || (long long)v7[80] == v3->field_18)
                        {
                            v14 = (long long)v7[8];
                            if (!a1)
                            {
                                v16 = 0;
                                goto LABEL_b284a4;
                            }
                            v15 = (int)v14;
                            v16 = sub_a6bf4c(v15, "providers/implementations/encode_decode/ml_kem_codecs.c", 486);
                            if (!v16)
                                goto LABEL_b28454;
                            v17 = (void*)(int)v7[16];
                            iter = v16;
                            v19 = a1;
                            switch (v17)
                            {
                            case 0:
                                v20 = (int)v7[20];
                                v21 = v16;
                                *(unsigned int *)v21 = (((((v20 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v20 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v20 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v20 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                                iter = v21 + 4;
                                goto LABEL_b284d8;
                            case 2:
                                v23 = (short)v7[20];
                                v25 = v16;
                                *(unsigned short *)v25 = (((((v23 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v23 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v23 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v23 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
                                iter = v25 + 2;
                            case 4:
LABEL_b284d8:
                                if (v12->padding_0)
                                {
                                    v26 = iter + 2;
                                    v27 = (long long)v7[32];
                                    if (v26 == v16 + v27)
                                    {
                                        v28 = (short)v7[24];
                                        *(unsigned short *)iter = (((((v28 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v28 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v28 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v28 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
                                        v27 = (long long)v7[32];
                                        iter = v26;
                                    }
                                    if (iter != v16 + v27 || !sub_a83238(iter, 64, a0))
                                    {
                                        sub_a368c8();
                                        v22 = 0x202;
                                        goto LABEL_b28618;
                                    }
                                    else
                                    {
                                        v19 = a1;
                                        iter += 64;
                                    }
                                }
                                if ((long long)v7[64])
                                {
                                    v30 = iter + 4;
                                    v31 = (long long)v7[56];
                                    if (v30 == v16 + v31)
                                    {
                                        v32 = (int)v7[48];
                                        *(unsigned int *)iter = (((((v32 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v32 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v32 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v32 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                                        v31 = (long long)v7[56];
                                        iter = v30;
                                    }
                                    if (iter != v16 + v31 || !sub_a830a4(iter, v3->field_8, a0))
                                    {
                                        sub_a368c8();
                                        v22 = 526;
                                        goto LABEL_b28618;
                                    }
                                    else
                                    {
                                        v19 = a1;
                                        iter += v3->field_8;
                                    }
                                }
                                if (!(long long)v7[80])
                                {
LABEL_b28668:
                                    if (iter != v16 + v15)
                                        break;
                                    *(void* *)v19 = v16;
LABEL_b284a4:
                                    sub_a6c2e4();
                                    if ((unsigned int)v14)
                                        return v14;
                                    goto LABEL_b28464;
                                }
                                else if (iter != v16 + (long long)v7[72] || !sub_a82fdc(iter, v3->field_18, a0))
                                {
                                    sub_a368c8();
                                    v22 = 538;
                                }
                                else
                                {
                                    v19 = a1;
                                    iter += v3->field_18;
                                    goto LABEL_b28668;
                                }
LABEL_b28618:
                                sub_a369bc("providers/implementations/encode_decode/ml_kem_codecs.c", v22, "ossl_ml_kem_i2d_prvkey");
                                v0 = v3->field_0;
                                sub_a36abc(57, 0xc0103, "error encoding %s private key");
                                v6 = v6;
                                break;
                            default:
                                sub_a368c8();
                                v22 = 499;
                                goto LABEL_b28618;
                            }
                            goto LABEL_b28454;
                        }
                        break;
                    }
                }
            }
            sub_a368c8();
            sub_a369bc("providers/implementations/encode_decode/ml_kem_codecs.c", 474, "ossl_ml_kem_i2d_prvkey");
            v0 = v3->field_0;
            sub_a36abc(57, 246, "no matching enabled %s private key output formats");
            v16 = 0;
LABEL_b28454:
            sub_a6c2e4(v6, "providers/implementations/encode_decode/ml_kem_codecs.c", 552);
LABEL_b28464:
            sub_a6c2e4(v16, "providers/implementations/encode_decode/ml_kem_codecs.c", 554);
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/encode_decode/ml_kem_codecs.c", 452, "ossl_ml_kem_i2d_prvkey");
        v0 = a0->field_0->field_0;
        sub_a36abc(57, 0xdd, "no %s private key data available");
    }
    return 0;
}
