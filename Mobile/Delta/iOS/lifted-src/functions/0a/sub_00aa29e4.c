/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa29e4..0xaa30c0 (1756 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

void* sub_aa29e4(void* a0, void* a1)
{
    void* v10;  // x20
    long long v11;  // x22
    void* v20;  // x19
    long long v21;  // x1
    long long v22;  // x1
    void* v23;  // x23
    void* v24;  // x24
    void* v25;  // x22
    unsigned int v26;  // w0
    unsigned int v27;  // w28
    long long v29;  // x2
    long long v12;  // x24
    void* v30;  // x23
    void* v31;  // x0
    unsigned long v32;  // x24
    void* v33;  // x25
    long long *v34;  // x0
    void* v35;  // x0
    long long v36;  // x0
    void* v37;  // x0
    void* v38;  // x27
    void* v39;  // x26
    long long v13;  // x0
    void* v40;  // x0
    unsigned int v41;  // w0
    void* v42;  // x0
    long long v43;  // x1
    int v14;  // w0
    void* v15;  // x28
    void* v16;  // x27
    void* *v17;  // x8
    void* v18;  // x9
    void* v19;  // x26
    void* v0;  // [bp-0xe0]
    void* v1;  // [bp-0xd8]
    long long v2;  // [bp-0xd0]
    void* v3;  // [bp-0xc8]
    unsigned long v4;  // [bp-0xc0]
    char v5;  // [bp-0xb8]
    char v6;  // [bp-0xa8]
    unsigned long v7;  // [bp-0x68]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v7 = *(long long *)&g_10002b0;
    v3 = 0;
    if (!a0)
    {
        sub_a368c8();
        sub_a369bc("crypto/pkcs7/pk7_doit.c", 243, "PKCS7_dataInit");
        v43 = 143;
        goto LABEL_aa2ad4;
    }
    v10 = a1;
    v11 = sub_aa3fb0();
    v12 = sub_a2d030(v11);
    v13 = sub_9f2aec(v11);
    if (!(long long)a0[32])
    {
        sub_a368c8();
        sub_a369bc("crypto/pkcs7/pk7_doit.c", 261, "PKCS7_dataInit");
        v43 = 122;
LABEL_aa2ad4:
        sub_a36abc(33, v43, 0);
        goto LABEL_aa2f28;
    }
    v14 = sub_a99eac((long long)a0[24]);
    *(unsigned int *)&a0[16] = 0;
    if (v14 > 22)
    {
        if (v14 != 23)
        {
            if (v14 != 24)
            {
                if (v14 != 25)
                    goto LABEL_aa2e54;
                v15 = 0;
                v16 = *(long long *)((long long)a0[32] + 8);
                v17 = (long long)a0[32] + 16;
                goto LABEL_aa2b00;
            }
            v18 = (long long)a0[32];
            v19 = *(long long *)((long long)v18[40] + 24);
            if (v19)
            {
                v16 = 0;
                v0 = (long long)v18[48];
                v1 = 0;
                v15 = (long long)v18[8];
                v20 = *(long long *)((long long)v18[40] + 8);
            }
            else
            {
                sub_a368c8();
                v21 = 279;
LABEL_aa2eec:
                sub_a369bc("crypto/pkcs7/pk7_doit.c", v21, "PKCS7_dataInit");
                v22 = 116;
LABEL_aa2ef8:
                sub_a36abc(33, v22, 0);
                goto LABEL_aa2f08;
            }
        }
        else
        {
            v19 = *(long long *)(*(long long *)((long long)a0[32] + 16) + 24);
            if (v19)
            {
                v15 = 0;
                v16 = 0;
                v0 = *(long long *)((long long)a0[32] + 8);
                v1 = 0;
                v20 = *(long long *)(*(long long *)((long long)a0[32] + 16) + 8);
            }
            else
            {
                sub_a368c8();
                v21 = 288;
                goto LABEL_aa2eec;
            }
        }
    }
    else
    {
        if (v14 != 21)
        {
            if (v14 == 22)
            {
                v16 = 0;
                v15 = *(long long *)((long long)a0[32] + 8);
                v17 = (long long)a0[32] + 40;
            }
            else
            {
LABEL_aa2e54:
                sub_a368c8();
                sub_a369bc("crypto/pkcs7/pk7_doit.c", 299, "PKCS7_dataInit");
                v22 = 112;
                goto LABEL_aa2ef8;
            }
LABEL_aa2b00:
            v0 = 0;
            v1 = sub_aa30c0(*v17);
            v19 = 0;
            v20 = 0;
        }
        else
        {
            v19 = 0;
            v15 = 0;
            v0 = 0;
            v1 = 0;
            v20 = 0;
            v16 = 0;
        }
    }
    if ((int)sub_ad69e4(v15) >= 1)
    {
        v23 = 0;
        do
        {
            if (!sub_aa3208(&v3, sub_ad69f8(v15, v23), v11))
                goto LABEL_aa2e44;
        } while ((v23 = (unsigned int)v23 + 1, (int)(unsigned int)v23 < (int)sub_ad69e4(v15)));
    }
    if (!v16 || sub_aa3208(&v3, v16, v11))
    {
        if (v19)
        {
            v25 = sub_9d3c1c(sub_a394b4());
            if (v25)
            {
                sub_9d46fc(v25, 129, 0, &v2);
                v26 = sub_9e4290(v19);
                v27 = sub_a50728(v19);
                *(unsigned long long *)v20 = sub_a99624(sub_a501f8(v19));
                if ((int)v27 >= 1 && (int)sub_aa8658(v12, &v5, v27, 0) < 1)
                    goto LABEL_aa2eac;
                sub_a36c8c();
                v29 = v13;
                v24 = sub_a4e104(v12, sub_a509dc(v19), v29);
                sub_a36cd4(v24, sub_a509dc(v19), v29);
                if ((int)sub_a4c694() >= 1)
                {
                    sub_a4bbe4(v24);
                    if ((int)sub_a4ddd4(v2, &v6) < 1 || (int)sub_a4c694(v2, 0, 0, &v6, &v5, 1) < 1)
                        goto LABEL_aa2eac;
                    v30 = v0;
                    if ((int)v27 < 1)
                    {
LABEL_aa2d10:
                        v32 = v26;
                        if ((int)sub_ad69e4(v30) >= 1)
                        {
                            v33 = 0;
                            do
                            {
                                v34 = sub_ad69f8(v30, v33);
                                v35 = sub_af1e94(v34[4]);
                                if (!v35)
                                {
LABEL_aa2fa8:
                                    v24 = 0;
                                    goto LABEL_aa2f0c;
                                }
                                v36 = sub_a2d030(v34[5]);
                                v37 = sub_a5d5a8(v36, v35, sub_9f2aec(v34[5]));
                                if (!v37)
                                    goto LABEL_aa2fa8;
                                v38 = v37;
                                if ((int)sub_a37848() >= 1 && (int)sub_a37d3c(v38, 0, &v4, &v6, v32) >= 1)
                                {
                                    v39 = sub_a6bf4c(v4, "crypto/pkcs7/pk7_doit.c", 0xaa);
                                    if (!v39 || (int)sub_a37d3c(v38, v39, &v4, &v6, v32) < 1)
                                        goto LABEL_aa2f8c;
                                }
                                else
                                {
                                    v39 = 0;
LABEL_aa2f8c:
                                    sub_a5d6b0(v38);
                                    sub_a6c2e4(v39, "crypto/pkcs7/pk7_doit.c", 184);
                                    goto LABEL_aa2fa8;
                                }
                                sub_9c79a0(v34[3], v39, (unsigned int)v4);
                                sub_a5d6b0(v38);
                                sub_a6c2e4(0, "crypto/pkcs7/pk7_doit.c", 184);
                                v33 = (unsigned int)v33 + 1;
                                v30 = v0;
                            } while ((int)(unsigned int)v33 < (int)sub_ad69e4(v30));
                        }
                        sub_a66ec0(&v6, v32);
                        if (v3)
                        {
                            sub_9d4ec8(v3, v25);
                            goto LABEL_aa2fb8;
                        }
                        else
                        {
                            v3 = v25;
                            goto LABEL_aa2fb8;
                        }
                    }
                    if (!(long long)v20[8] && (v31 = sub_9cf1f0(), *(void* *)&v20[8] = v31, !v31))
                        goto LABEL_aa2eac;
                    if ((int)sub_a4f864(v2) > 0)
                        goto LABEL_aa2d10;
                    sub_9cf1fc((long long)v20[8]);
                    v24 = 0;
                    *(unsigned long long *)&v20[8] = 0;
                    goto LABEL_aa2f0c;
                }
                else
                {
                    goto LABEL_aa2f0c;
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/pkcs7/pk7_doit.c", 317, "PKCS7_dataInit");
                sub_a36abc(33, 0x80020, 0);
LABEL_aa2eac:
                v24 = 0;
                goto LABEL_aa2f0c;
            }
        }
LABEL_aa2fb8:
        if (v10)
        {
LABEL_aa2fc4:
            if (v3)
            {
                sub_9d4ec8(v3, v10);
                v10 = v3;
            }
            sub_9cf0f4();
        }
        else
        {
            if (sub_a99eac((long long)a0[24]) == 22 && sub_aa3e38(a0, 2, 0, 0))
            {
                v10 = sub_9d3c1c(sub_9d8f0c());
                if (v10)
                    goto LABEL_aa2fc4;
                v24 = 0;
LABEL_aa2f08:
                v25 = 0;
            }
            else
            {
                if (v1 && *(int *)v1 >= 1)
                {
                    v40 = sub_9d3c1c(sub_9d8844());
                    if (v40)
                    {
                        v10 = v40;
                        sub_9d46fc();
                        v41 = sub_9d3fec(v10, (long long)v1[8], *(int *)v1);
                        if (v41 == *(int *)v1)
                            goto LABEL_aa30a4;
                        sub_9d5018(v10);
                        goto LABEL_aa30ac;
                    }
                }
                v42 = sub_9d3c1c(sub_9d8844());
                if (v42)
                {
                    v10 = v42;
                    sub_9d46fc();
LABEL_aa30a4:
                    goto LABEL_aa2fc4;
                }
                else
                {
LABEL_aa30ac:
                    v24 = 0;
                    v25 = 0;
                }
            }
LABEL_aa2f0c:
            sub_9cf0f4();
            sub_a4bbe4(v24);
            sub_9d5018(v3);
            sub_9d5018(v25);
LABEL_aa2f28:
            v10 = 0;
        }
    }
    else
    {
LABEL_aa2e44:
        v24 = 0;
        v25 = 0;
        goto LABEL_aa2f0c;
    }
    if (*(long long *)&g_10002b0 == v7)
        return v10;
    ___stack_chk_fail();
}
