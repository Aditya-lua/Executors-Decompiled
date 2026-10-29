/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb27d50..0xb28164 (1044 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b27d50_0 {
    struct st_b27d50_0 *field_0;
    struct st_b27d50_0 *field_8;
    int field_10;
    unsigned int field_14;
    struct st_b27d50_0 *field_18;
    unsigned long long field_20;
    struct st_b27d50_0 *field_28;
    unsigned int field_30;
    char padding_34[4];
    unsigned long long field_38;
    struct st_b27d50_0 *field_40;
    unsigned long long field_48;
    struct st_b27d50_0 *field_50;
    char padding_58[88];
    struct st_b27d50_0 *field_b0;
} st_b27d50_0;

typedef struct st_b27d50_1 {
    char padding_0[8];
    long long field_8;
} st_b27d50_1;

typedef struct st_b27d50_2 {
    struct st_b27d50_1 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_b27d50_2;

extern st_b27d50_2 g_ee23d8;

st_b27d50_0 * sub_b27d50(unsigned long a0, int a1, unsigned long long a2, long long a3, long long a4)
{
    st_b27d50_0 *v8;  // x0
    unsigned int v9;  // w8
    st_b27d50_0 *v18;  // x20
    st_b27d50_0 *v19;  // x25
    unsigned int *v20;  // x9
    unsigned int *v21;  // x10
    unsigned long v22;  // x11
    unsigned int v23;  // w11
    unsigned long long v24;  // x12
    unsigned long long v25;  // x12
    unsigned long v26;  // x13
    st_b27d50_0 *v27;  // x12
    st_b27d50_0 *v10;  // x24
    st_b27d50_0 *v28;  // x11
    void* iter;  // x10
    void* v30;  // x13
    void* v31;  // x14
    unsigned long v32;  // x10
    unsigned int v33;  // w10
    void* v34;  // x12
    void* v35;  // x13
    unsigned long v36;  // x10
    long long v37;  // x2
    st_b27d50_0 *v11;  // x0
    long long v38;  // x0
    long long v39;  // x1
    st_b27d50_0 *v40;  // x0
    st_b27d50_0 *v41;  // x21
    st_b27d50_0 *v12;  // x19
    long long v13;  // x0
    st_b27d50_0 *v14;  // x0
    st_b27d50_0 *v15;  // x23
    unsigned long long v16;  // 4118
    st_b27d50_0 *v17;  // x8
    st_b27d50_0 *v0;  // [bp-0x80]
    char v1;  // [bp-0x70]
    char v2;  // [bp-0x6c]
    st_b27d50_0 *v3;  // [bp-0x68]
    unsigned int *v4;  // [bp-0x60]
    unsigned long v5;  // [bp-0x58]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = a0;
    v3 = 0;
    v8 = sub_a82b74(a2);
    if (!v8)
        return v8;
    v9 = (unsigned int)a2 - 1454;
    if (2 < v9)
        return 0;
    v10 = v8;
    v11 = sub_9ca7fc(0, &v5, a1);
    if (!v11)
        return v11;
    v12 = v11;
    if (sub_9ca8cc(0, &v4, &v2, &v3, v12) && sub_a99eac(v3->field_0) == (unsigned int)a2)
    {
        v13 = sub_b5b138(a3, "ml-kem.input_formats", 0);
        v14 = sub_b26e60(v10->field_0, (&g_ee23d8.field_0)[v9]->field_8, "input", v13);
        if (!v14)
            goto LABEL_b27e88;
        v15 = v14;
        sub_9cf830(0, &v1, 0, v3);
        v16 = arm64g_calculate_condition(1, v1, 1, 0);
        if (!(v16 & 1))
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/encode_decode/ml_kem_codecs.c", 312, "ossl_ml_kem_d2i_PKCS8");
            v0 = v10->field_0;
            sub_a36abc(57, 249, "unexpected parameters with a PKCS#8 %s private key");
LABEL_b27ee4:
            v18 = 0;
            goto LABEL_b27ee8;
        }
        v17 = v2;
        if (4 > (int)(unsigned int)v17)
            goto LABEL_b27ee4;
        v19 = v15->field_0;
        if (v15->field_0)
        {
            v20 = v4;
            v21 = v20;
            v22 = *v21;
            v23 = (((((v22 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v22 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v22 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v22 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
            v24 = 16;
            while (1)
            {
                v25 = v24;
                if (v19->field_8 == v17 && (v26 = v19->field_10, (unsigned int)v26 == 4 || v23 >> ((char)v26 * 8 & 31) == v19->field_14))
                    break;
                v19 = *(long long *)((char *)v15 + v25);
                v24 = v25 + 16;
                if (!*(long long *)((char *)v15 + v25))
                    goto LABEL_b27fb0;
            }
            if ((v19->field_28 | 64) != 64 || (v27 = v19->field_40, v27 && v27 != v10->field_8) || (v28 = v19->field_50, v28 && v28 != v10->field_18))
                goto LABEL_b27fb0;
            iter = (char *)v21 - v26 + 1;
            if (v19->field_28)
            {
                v30 = iter + 2;
                v31 = (char *)v20 + v19->field_20;
                if (v30 == v31)
                {
                    v32 = *(short *)iter;
                    v33 = (((((v32 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v32 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v32 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v32 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                    iter = v30;
                    if ((short)v19->field_18 != v33 >> 16)
                        goto LABEL_b27e88;
                }
                else if (iter != v31)
                {
                    goto LABEL_b27e88;
                }
                iter += 64;
            }
            if (v27)
            {
                v34 = iter + 4;
                v35 = (char *)v20 + v19->field_38;
                if (v34 == v35)
                {
                    v36 = *(int *)iter;
                    iter = v34;
                    if ((unsigned int)((((((v36 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v36 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v36 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v36 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) != v19->field_30)
                        goto LABEL_b27e88;
                }
                else if (iter != v35)
                {
                    goto LABEL_b27e88;
                }
                iter += v10->field_8;
            }
            if (v28)
            {
                if (iter != (char *)v20 + v19->field_48)
                    goto LABEL_b27e88;
                iter += v10->field_18;
            }
            if (iter != v20 + v17)
                goto LABEL_b27e88;
            v18 = sub_b3e860(a3, a4, a2);
            if (v18)
            {
                if (v19->field_28 && !sub_a83270((char *)v4 + v19->field_20, 64, v18))
                {
                    sub_a368c8();
                    sub_a369bc("providers/implementations/encode_decode/ml_kem_codecs.c", 381, "ossl_ml_kem_d2i_PKCS8");
                    v0 = v10->field_0;
                    v37 = "error storing %s private key seed";
                    v38 = 60;
                    v39 = 786691;
                    goto LABEL_b2815c;
                }
                if (v19->field_40)
                {
                    v40 = sub_a6bf4c(v19->field_40, "providers/implementations/encode_decode/ml_kem_codecs.c", 388);
                    v18->field_b0 = v40;
                    if (v40)
                    {
                        _memcpy();
                        goto LABEL_b280e4;
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("providers/implementations/encode_decode/ml_kem_codecs.c", 389, "ossl_ml_kem_d2i_PKCS8");
                        v0 = v10->field_0;
                        v37 = "error parsing %s private key";
                        v38 = 57;
                        v39 = 158;
LABEL_b2815c:
                        sub_a36abc(v38, v39, v37);
                    }
                }
                else
                {
LABEL_b280e4:
                    v41 = v18;
                    goto LABEL_b27eec;
                }
            }
LABEL_b27ee8:
            v41 = 0;
LABEL_b27eec:
        }
        else
        {
LABEL_b27fb0:
            sub_a368c8();
            sub_a369bc("providers/implementations/encode_decode/ml_kem_codecs.c", 335, "ossl_ml_kem_d2i_PKCS8");
            v0 = v10->field_0;
            sub_a36abc(57, 246, "no matching enabled %s private key input formats");
LABEL_b27e88:
            v18 = 0;
            v41 = 0;
        }
    }
    else
    {
        goto LABEL_b27e88;
    }
    sub_a6c2e4();
    sub_9ca820(v12);
    if (v41)
        return v41;
    sub_a82d30(v18);
    return 0;
}
