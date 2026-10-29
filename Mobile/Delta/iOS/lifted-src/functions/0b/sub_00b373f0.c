/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb373f0..0xb3785c (1132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b373f0_2 {
    char padding_0[8];
    struct st_b373f0_0 *field_8;
} st_b373f0_2;

typedef struct st_b373f0_0 {
    long long field_0;
    long long field_8;
    void* field_10;
    void* field_18;
    long long field_20;
    long long field_28;
    struct st_b373f0_1 *field_30;
} st_b373f0_0;

typedef struct st_b373f0_1 {
    long long field_0;
} st_b373f0_1;


unsigned long long * sub_b373f0(st_b373f0_2 *a0, long long *a1, long long *a2, long long *a3, long long *a4)
{
    st_b373f0_0 *v7;  // x20
    void* v8;  // x10
    void* v18;  // x8
    void* v9;  // x8
    unsigned long long v10;  // x11
    unsigned long long v11;  // x9
    long long *v12;  // x2
    unsigned long v13;  // x22
    long long v14;  // x1
    long long *v15;  // x19
    unsigned int v16;  // w22
    unsigned long v0;  // [bp-0x80]
    unsigned long long v1;  // [bp-0x78], Other Possible Types: unsigned long
    unsigned long long v2;  // [bp-0x68]
    unsigned long v3;  // [bp-0x60]
    long long *v4;  // [bp-0x58]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v7 = a0->field_8;
    v4 = 0;
    if ((int)v7->field_30)
    {
        v8 = v7->field_10;
        v9 = v7->field_18;
        v10 = (long long)v9[16] + (long long)v8[40];
        v11 = (long long)v9[32] + 32;
        if (!a1)
        {
            if (a2 || a4)
            {
                if (a2)
                    *a2 = v10;
                if (!a4)
                    return 1;
                *a4 = v11;
                return 1;
            }
            else
            {
                return 0;
            }
        }
        if (a3)
        {
            if (!a2)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/kem/mlx_kem.c", 142, "mlx_kem_encapsulate");
                v12 = "null ciphertext input/output length pointer";
                goto LABEL_b3758c;
            }
            if (v10 > (unsigned long long)*a2)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/kem/mlx_kem.c", 146, "mlx_kem_encapsulate");
                v12 = "ciphertext buffer too small";
                goto LABEL_b37554;
            }
            else
            {
                v13 = (int)v9[40];
                *a2 = v10;
                if (a4)
                {
                    if (v11 > (unsigned long long)*a4)
                    {
                        sub_a368c8();
                        sub_a369bc("providers/implementations/kem/mlx_kem.c", 158, "mlx_kem_encapsulate");
                        v12 = "shared-secret buffer too small";
                    }
                    else
                    {
                        *a4 = v11;
                        v2 = 32;
                        v3 = (long long)v8[40];
                        v15 = sub_a5d5a8(v7->field_0, v7->field_20, v7->field_8);
                        if (v15 && (int)sub_a54180(v15, 0) >= 1 && (int)sub_a54190(v15, (char *)a1 + v13 * (long long)v9[16], &v3, (char *)a3 + v13 * (long long)v9[32], &v2) >= 1)
                        {
                            if (v3 != (long long)v7->field_10[40])
                            {
                                sub_a368c8();
                                sub_a369bc("providers/implementations/kem/mlx_kem.c", 176, "mlx_kem_encapsulate");
                                v0 = *(long long *)v7->field_10;
                                v1 = v3;
                                goto LABEL_b377c0;
                            }
                            if (v2 != 32)
                            {
                                sub_a368c8();
                                sub_a369bc("providers/implementations/kem/mlx_kem.c", 182, "mlx_kem_encapsulate");
                                v18 = v7->field_10;
                                goto LABEL_b377ac;
                            }
                            sub_a5d6b0(v15);
                            v3 = (long long)v7->field_18[16];
                            v15 = sub_a5d5a8(v7->field_0, v7->field_28, v7->field_8);
                            if (v15 && (int)sub_a5ca90(v15) >= 1 && (int)sub_a5cde8(v15, &v4) >= 1 && (v16 = 1 - v13, (int)sub_a5b948(v4, "encoded-pub-key", (char *)a1 + v16 * (long long)v7->field_10[40], v3, &v3) >= 1))
                            {
                                if (v3 == (long long)v7->field_18[16])
                                {
                                    sub_a5d6b0(v15);
                                    v2 = (long long)v7->field_18[32];
                                    v15 = sub_a5d5a8(v7->field_0, v4, v7->field_8);
                                    if (v15 && (int)sub_a52b8c(v15) >= 1 && (int)sub_a532b8(v15, v7->field_28) >= 1 && (int)sub_a532c0(v15, &a3[4 * v16], &v2) >= 1)
                                    {
                                        if (v2 == (long long)v7->field_18[32])
                                        {
                                            sub_a5a4c8(v4);
                                            sub_a5d6b0(v15);
                                            return 1;
                                        }
                                        sub_a368c8();
                                        sub_a369bc("providers/implementations/kem/mlx_kem.c", 231, "mlx_kem_encapsulate");
                                        v18 = v7->field_18;
LABEL_b377ac:
                                        v0 = *(long long *)v18;
                                        v1 = v2;
LABEL_b377c0:
                                        sub_a36abc(57, 0xc0103);
                                    }
                                }
                                else
                                {
                                    sub_a368c8();
                                    sub_a369bc("providers/implementations/kem/mlx_kem.c", 214, "mlx_kem_encapsulate");
                                    v0 = *(long long *)v7->field_18;
                                    v1 = v3;
                                    goto LABEL_b377c0;
                                }
                            }
                        }
                        sub_a66ec0(a3, (long long)v7->field_18[32] + 32);
                        sub_a5a4c8(v4);
                        sub_a5d6b0(v15);
                        return 0;
                    }
LABEL_b37554:
                    v14 = 106;
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("providers/implementations/kem/mlx_kem.c", 154, "mlx_kem_encapsulate");
                    v12 = "null shared secret input/output length pointer";
LABEL_b3758c:
                    v14 = 247;
                }
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/kem/mlx_kem.c", 0x88, "mlx_kem_encapsulate");
            v12 = "null shared-secret output buffer";
            v14 = 248;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/kem/mlx_kem.c", 120, "mlx_kem_encapsulate");
        v14 = 128;
        v12 = 0;
    }
    sub_a36abc(57, v14, v12);
    return 0;
}
