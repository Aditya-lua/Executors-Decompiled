/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb378d4..0xb37c04 (816 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b378d4_4 {
    char padding_0[8];
    struct st_b378d4_2 *field_8;
} st_b378d4_4;

typedef struct st_b378d4_1 {
    unsigned long long field_0;
    char padding_8[8];
    long long field_10;
    char padding_18[8];
    unsigned long long field_20;
    int field_28;
} st_b378d4_1;

typedef struct st_b378d4_0 {
    unsigned long long field_0;
    char padding_8[32];
    long long field_28;
} st_b378d4_0;

typedef struct st_b378d4_2 {
    long long field_0;
    long long field_8;
    struct st_b378d4_0 *field_10;
    struct st_b378d4_1 *field_18;
    long long field_20;
    long long field_28;
    struct st_b378d4_3 *field_30;
} st_b378d4_2;

typedef struct st_b378d4_3 {
    long long field_0;
} st_b378d4_3;


unsigned long long * sub_b378d4(st_b378d4_4 *a0, long long *a1, long long *a2, unsigned long a3, unsigned long long a4)
{
    st_b378d4_2 *v5;  // x23
    st_b378d4_1 *v6;  // x8
    long long *v15;  // x21
    unsigned int v16;  // w24
    long long v7;  // x10
    st_b378d4_0 *v8;  // x9
    long long v9;  // x11
    long long v10;  // x12
    unsigned long v11;  // x24
    long long *v12;  // x2
    long long v13;  // x1
    long long *v14;  // x20
    unsigned long long v0;  // [bp-0x70], Other Possible Types: unsigned long
    unsigned long v1;  // [bp-0x68]
    unsigned long v2;  // [bp-0x58]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a0->field_8;
    if ((unsigned int)(int)v5->field_30 > 1)
    {
        v6 = v5->field_18;
        v7 = v6->field_20 + 32;
        if (!a1)
        {
            if (!a2)
                return 0;
            *a2 = v7;
            return 1;
        }
        v8 = v5->field_10;
        v9 = v8->field_28;
        v10 = v6->field_10;
        v11 = v6->field_28;
        if (!a2)
        {
LABEL_b379c0:
            if (v10 + v9 == a4)
            {
                v2 = 32;
                v14 = sub_a5d5a8(v5->field_0, v5->field_20, v5->field_8);
                if (v14 && (int)sub_a54248(v14, 0) >= 1 && (int)sub_a54258(v14, (char *)a1 + v11 * v6->field_20, &v2, a3 + v11 * v6->field_10, v8->field_28) >= 1)
                {
                    if (v2 == 32)
                    {
                        sub_a5d6b0(v14);
                        v2 = v5->field_18->field_20;
                        v14 = sub_a5d5a8(v5->field_0, v5->field_28, v5->field_8);
                        if (v14)
                        {
                            v15 = sub_a5ba1c();
                            if (v15 && (int)sub_a59d8c(v15, v5->field_28) >= 1)
                            {
                                v16 = 1 - v11;
                                if ((int)sub_a5b680(v15, a3 + v16 * v5->field_10->field_28, v5->field_18->field_10) >= 1 && (int)sub_a52b8c(v14) >= 1 && (int)sub_a532b8(v14, v15) >= 1 && (int)sub_a532c0(v14, &a1[4 * v16], &v2) >= 1)
                                {
                                    if (v2 == v5->field_18->field_20)
                                    {
                                        sub_a5d6b0(v14);
                                        sub_a5a4c8(v15);
                                        return 1;
                                    }
                                    sub_a368c8();
                                    sub_a369bc("providers/implementations/kem/mlx_kem.c", 323, "mlx_kem_decapsulate");
                                    v0 = v5->field_18->field_0;
                                    v1 = v2;
                                    sub_a36abc(57, 0xc0103, "unexpected %s shared secret output size: %lu");
                                    goto LABEL_b37b8c;
                                }
                            }
                            goto LABEL_b37b8c;
                        }
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("providers/implementations/kem/mlx_kem.c", 301, "mlx_kem_decapsulate");
                        v0 = v5->field_10->field_0;
                        v1 = v2;
                        sub_a36abc(57, 0xc0103, "unexpected %s shared secret output size: %lu");
                    }
                }
                v15 = 0;
LABEL_b37b8c:
                sub_a66ec0(a1, v5->field_18->field_20 + 32);
                sub_a5d6b0(v14);
                sub_a5a4c8(v15);
                return 0;
            }
            sub_a368c8();
            sub_a369bc("providers/implementations/kem/mlx_kem.c", 284, "mlx_kem_decapsulate");
            v0 = a4;
            v12 = "wrong decapsulation input ciphertext size: %lu";
            v13 = 251;
        }
        else if ((unsigned long long)v7 > (unsigned long long)*a2)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/kem/mlx_kem.c", 277, "mlx_kem_decapsulate");
            v12 = "shared-secret buffer too small";
            v13 = 106;
        }
        else
        {
            *a2 = v7;
            goto LABEL_b379c0;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/kem/mlx_kem.c", 262, "mlx_kem_decapsulate");
        v13 = 128;
        v12 = 0;
    }
    sub_a36abc(57, v13, v12);
    return 0;
}
