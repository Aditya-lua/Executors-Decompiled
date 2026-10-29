/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb50be4..0xb51140 (1372 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b50be4_0 {
    char padding_0[16];
    long long field_10;
    char padding_18[8];
    long long field_20;
    char padding_28[8];
    unsigned int field_30;
    char padding_34[52];
    unsigned int field_68;
    char padding_6c[12];
    unsigned int field_78;
    char padding_7c[52];
    unsigned int field_b0;
    unsigned int field_b4;
} st_b50be4_0;

typedef struct st_b50be4_1 {
    char padding_0[8];
    unsigned long long field_8;
} st_b50be4_1;

typedef struct st_b50be4_2 {
    struct st_b50be4_1 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_b50be4_2;

extern st_b50be4_2 g_ef2ab0;
extern char g_10002b0;

unsigned int sub_b50be4(st_b50be4_0 *a0, long long a1)
{
    unsigned int v9;  // x0
    unsigned int v10;  // x0
    unsigned int v19;  // w22
    unsigned int v20;  // w0
    unsigned int v21;  // w23
    int v22;  // w0
    unsigned int v23;  // w8
    unsigned int v24;  // w8
    unsigned int v25;  // w9
    unsigned int v26;  // x22
    unsigned int v27;  // x0
    unsigned int v28;  // w8
    unsigned int v11;  // w0
    unsigned int v29;  // x0
    unsigned long v30;  // x9
    unsigned long long v31;  // 4118
    unsigned int v32;  // w0
    long long v12;  // x2
    long long v13;  // x1
    long long v14;  // x1
    unsigned long v15;  // x22
    unsigned long long v16;  // 4118
    unsigned long long v17;  // 4112
    long long v18;  // x1
    unsigned long v0;  // [bp-0x130]
    unsigned long v1;  // [bp-0x128]
    long long v2;  // [bp-0x120]
    char v3;  // [bp-0x114]
    char v4;  // [bp-0x100]
    char v5;  // [bp-0xc8]
    unsigned long v6;  // [bp-0x48]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    v9 = (unsigned int)a0;
    if (v9)
    {
        v10 = sub_a6fbc4(a1, "algorithm-id");
        if (v10)
        {
            if (sub_c688bc(&v4, &v5, 128))
            {
                if (a0->field_68 != 6)
                {
                    if (a0->field_68 != 1)
                    {
                        sub_a368c8();
                        sub_a369bc("providers/implementations/signature/rsa_sig.c", 356, "rsa_generate_signature_aid");
                        v0 = a0->field_68;
                        goto LABEL_b50db8;
                    }
                    v11 = sub_afd0bc(&v4, 0xffffffff, a0->field_30);
                    if ((int)v11 > 0)
                        goto LABEL_b50c70;
                    sub_a368c8();
                    v12 = "rsa_generate_signature_aid";
                    if (v11)
                    {
                        sub_a369bc("providers/implementations/signature/rsa_sig.c", 335, "rsa_generate_signature_aid");
                        v0 = a0->field_30;
LABEL_b50db8:
                        v14 = 524556;
                        goto LABEL_b510fc;
                    }
                    else
                    {
                        v13 = 332;
                        goto LABEL_b51070;
                    }
                    goto LABEL_b51070;
                }
                v15 = a0->field_b0;
                v16 = arm64g_calculate_condition(1, v15 & 0xffffffff, 4, 0);
                if (!(v16 & 1))
                {
                    v17 = arm64g_calculate_condition(0x11, v15 & 0xffffffff, 1, 0);
                    if (v17 & 1 || !(v15 = sub_a50ac8(a0->field_20), (int)v15 <= 0))
                    {
                        if (1 < (unsigned int)v15 + 3)
                            goto LABEL_b50f2c;
                        v19 = 0xffffffff;
                        goto LABEL_b50ecc;
                    }
                    else
                    {
                        sub_a368c8();
                        v18 = 269;
                        goto LABEL_b510ec;
                    }
                    goto LABEL_b510ec;
                }
                v19 = sub_a50ac8(a0->field_20);
                if ((int)v19 > 0)
                {
LABEL_b50ecc:
                    v20 = sub_a50ac8(a0->field_20);
                    if ((int)v20 <= 0)
                    {
                        sub_a368c8();
                        v18 = 283;
                        goto LABEL_b510ec;
                    }
                    v21 = v20;
                    v22 = sub_aafbcc(a0->field_10);
                    if (v22 < 3 || v22 - 2 < (int)v21)
                    {
                        sub_a368c8();
                        sub_a369bc("providers/implementations/signature/rsa_sig.c", 287, "rsa_pss_compute_saltlen");
                        v14 = 158;
                        goto LABEL_b510f8;
                    }
                    if ((sub_aafbc4(a0->field_10) & 7) == 1)
                        v23 = 0xfffffffd;
                    else
                        v23 = 0xfffffffe;
                    v24 = v23 + v22 - v21;
                    if ((int)v24 < (int)v19)
                        v25 = v24;
                    else
                        v25 = v19;
                    if ((int)v19 < 0)
                        v15 = v24;
                    else
                        v15 = v25;
LABEL_b50f2c:
                    if (!(v15 >> 31 & 1))
                    {
                        if ((int)a0->field_b4 > (int)v15)
                        {
                            sub_a368c8();
                            sub_a369bc("providers/implementations/signature/rsa_sig.c", 300, "rsa_pss_compute_saltlen");
                            v0 = a0->field_b4;
                            v1 = v15;
                            v14 = 172;
                            goto LABEL_b510fc;
                        }
                        if (sub_ab8bf4(&v3) && sub_ab8c68(&v3, a0->field_30) && sub_ab8c78(&v3, a0->field_78) && sub_ab8c88(&v3, v15) && sub_b5af9c(&v4, 0xffffffff, 0x1000, &v3))
                        {
LABEL_b50c70:
                            if (!sub_a6eaf8(&v4))
                                goto LABEL_b51100;
                            sub_c68eb8(&v4, &v2);
                            v26 = sub_a6e990(&v4);
                            sub_a6ed4c(&v4);
                            if (v26 && sub_a715c0(v10, v26, v2))
                                goto LABEL_b50cb4;
                            goto LABEL_b51108;
                        }
                        else
                        {
                            sub_a368c8();
                            v12 = "rsa_generate_signature_aid";
                            v13 = 351;
LABEL_b51070:
                            sub_a369bc("providers/implementations/signature/rsa_sig.c", v13, v12);
                            v14 = 786691;
                            goto LABEL_b510f8;
                        }
                    }
                    else
                    {
                        sub_a368c8();
                        v12 = "rsa_pss_compute_saltlen";
                        v13 = 297;
                        goto LABEL_b51070;
                    }
                }
                else
                {
                    sub_a368c8();
                    v18 = 275;
LABEL_b510ec:
                    sub_a369bc("providers/implementations/signature/rsa_sig.c", v18, "rsa_pss_compute_saltlen");
                    v14 = 122;
LABEL_b510f8:
LABEL_b510fc:
                    sub_a36abc(57, v14);
LABEL_b51100:
                    sub_a6ed4c(&v4);
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/signature/rsa_sig.c", 320, "rsa_generate_signature_aid");
                sub_a36abc(57, 0x8000f, 0);
                goto LABEL_b51108;
            }
        }
LABEL_b50cb4:
        v27 = sub_a6fbc4(a1, "pad-mode");
        if (v27)
        {
            if (*(int *)(v27 + 8) == 1)
            {
                v9 = sub_a6fe3c();
                if (!v9)
                {
                    if (*(long long *)&g_10002b0 == v6)
                        return v9;
                    ___stack_chk_fail();
                }
                goto LABEL_b50e08;
            }
            else if (*(int *)(v27 + 8) == 4)
            {
                v28 = a0->field_68 - 1;
                if (6 > v28 && 53 >> ((char)v28 & 31) & 1 && (&g_ef2ab0.field_0)[v28]->field_8)
                {
                    v9 = sub_a71468();
                    if (!v9)
                    {
                        if (*(long long *)&g_10002b0 == v6)
                            return v9;
                        ___stack_chk_fail();
                    }
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("providers/implementations/signature/rsa_sig.c", 1453, "rsa_get_ctx_params");
                    sub_a36abc(57, 0xc0103, 0);
                }
                goto LABEL_b50e08;
            }
LABEL_b51108:
            v9 = 0;
        }
        else
        {
LABEL_b50e08:
            if ((!sub_a6fbc4(a1, "digest") || (v9 = sub_a71468(), v9)) && (!sub_a6fbc4(a1, "mgf1-digest") || !(v9 = sub_a71468(), !v9)))
            {
                v29 = sub_a6fbc4(a1, "saltlen");
                if (!v29)
                {
LABEL_b510b0:
                    v9 = 1;
                }
                else if (*(int *)(v29 + 8) == 4)
                {
                    v30 = a0->field_b0;
                    v31 = arm64g_calculate_condition(145, v30 & 0xffffffff, 5, 0);
                    if (!(v31 & 1))
                    {
                        v9 = sub_a71468();
                        if (v9)
                            goto LABEL_b510b0;
                    }
                    else
                    {
                        v0 = v30;
                        v32 = sub_9d5b44(*(long long *)(v29 + 16), *(long long *)(v29 + 24), "%d");
                        if ((int)v32 < 1)
                            goto LABEL_b51108;
                        *(unsigned long long *)(v29 + 32) = v32;
                        goto LABEL_b510b0;
                    }
                }
                else if (!(*(int *)(v29 + 8) == 1) || (v9 = sub_a6fe3c(), v9))
                {
                    goto LABEL_b510b0;
                }
            }
        }
    }
    if (*(long long *)&g_10002b0 == v6)
        return v9;
    ___stack_chk_fail();
}
