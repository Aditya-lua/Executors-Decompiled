/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5ba7c..0xb5bfac (1328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5ba7c_0 {
    char padding_0[8];
    struct st_b5ba7c_1 *field_8;
} st_b5ba7c_0;

typedef struct st_b5ba7c_2 {
    char padding_0[16];
    char field_10;
    char padding_11[79];
    char field_60;
    char padding_61[11];
    char field_6c;
    char padding_6d[59];
    struct st_b5ba7c_0 *field_a8;
} st_b5ba7c_2;

typedef struct st_b5ba7c_3 {
    char padding_0[12];
    char field_c;
    char padding_d[59];
    struct st_b5ba7c_0 *field_48;
} st_b5ba7c_3;

typedef struct st_b5ba7c_1 {
    unsigned long long field_0;
} st_b5ba7c_1;


unsigned long long sub_b5ba7c(st_b5ba7c_2 *a0, unsigned long long a1, unsigned long long *a2, unsigned long long a3, unsigned long long a4, unsigned long long a5)
{
    unsigned long v4;  // x9
    long long v5;  // x1
    uint128_t *iter;  // x9
    unsigned long long i;  // x10
    unsigned long long v16;  // x10
    unsigned long long j;  // x10
    st_b5ba7c_3 *v19;  // x20
    unsigned long long v20;  // x21
    st_b5ba7c_2 *v21;  // x0
    st_b5ba7c_2 *v22;  // x0
    long long v23;  // x1
    unsigned long long v6;  // x19
    unsigned long long v24;  // x22
    unsigned long long v25;  // x21
    unsigned long long v26;  // x0
    unsigned long long v27;  // x0
    unsigned long long v7;  // x20
    unsigned long long v8;  // x22
    long long v9;  // x1
    unsigned long long v10;  // x21
    unsigned long long k;  // x9
    unsigned long long v12;  // x8
    uint128_t v13;  // q0
    unsigned long long v0;  // [bp-0x70]
    unsigned long v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = a5;
    v1 = a4;
    v4 = a0->field_6c;
    if (!(v4 >> 3 & 1))
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/ciphers/ciphercommon.c", 280, "ossl_cipher_generic_block_update");
        v5 = 114;
    }
    else
    {
        v6 = *(long long *)&a0->padding_11[71];
        if (*(int *)&a0->padding_6d[3])
        {
            if (!a4 || a4 != a1 || a3 < a5 || !(v4 & 1))
            {
                sub_a368c8();
                v9 = 295;
            }
            else if (!(v4 >> 1 & 1))
            {
                v7 = a5;
                goto LABEL_b5bafc;
            }
            else
            {
                v8 = v6 + -a5 + v6 * a5 / v6;
                v7 = v8 + a5;
                if (v7 > a3)
                {
                    sub_a368c8();
                    v9 = 308;
                }
                else if (v8 >= 0x101)
                {
                    sub_a368c8();
                    v9 = 313;
                }
                else
                {
                    v10 = v8 - 1;
                    if (*(int *)&a0->padding_6d[3] == 0x300)
                    {
                        if (v8 >= 2)
                            _bzero(a1 + a5, v10);
                        *(char *)(a1 + a5 + v8 - 1) = v10;
                    }
                    else if (v7 > a5)
                    {
                        if (8 > v8)
                        {
                            k = a5;
                        }
                        else if (32 > v8)
                        {
                            v12 = 0;
LABEL_b5bf60:
                            j = v8 & 504;
                            k = j + a5;
                            do
                            {
                                *(unsigned long long *)(a1 + a5 + v12) = v10 & 0xff | (v10 & 0xff) * 0x100 | (v10 & 0xff | (v10 & 0xff) * 0x100) * 0x10000 | (v10 & 0xff | (v10 & 0xff) * 0x100 | (v10 & 0xff | (v10 & 0xff) * 0x100) * 0x10000) * 0x100000000;
                                v12 += 8;
                            } while (j != v12);
                            if (v8 == j)
                                goto LABEL_b5bafc;
                        }
                        else
                        {
                            v12 = v8 & 480;
                            v13 = CONCAT(v10 & 0xff | (v10 & 0xff) * 0x100 | (v10 & 0xff | (v10 & 0xff) * 0x100) * 0x10000 | (v10 & 0xff | (v10 & 0xff) * 0x100 | (v10 & 0xff | (v10 & 0xff) * 0x100) * 0x10000) * 0x100000000, v10 & 0xff | (v10 & 0xff) * 0x100 | (v10 & 0xff | (v10 & 0xff) * 0x100) * 0x10000 | (v10 & 0xff | (v10 & 0xff) * 0x100 | (v10 & 0xff | (v10 & 0xff) * 0x100) * 0x10000) * 0x100000000);
                            iter = a5 + a1 + 16;
                            i = v12;
                            do
                            {
                                v16 = i;
                                *(uint128_t *)((char *)iter - 16) = v13;
                                *iter = v13;
                                iter += 2;
                                i = v16 - 32;
                            } while (i);
                            if (v8 == v12)
                                goto LABEL_b5bafc;
                            if (v8 & 24)
                                goto LABEL_b5bf60;
                            k = v12 + a5;
                        }
                        do
                        {
                            *(char *)(a1 + k) = v10;
                            k += 1;
                        } while (k < v7);
                    }
LABEL_b5bafc:
                    if (!(v7 - v6 * v7 / v6))
                        a0->field_a8->field_8();
                    sub_a368c8();
                    v9 = 330;
                }
            }
            sub_a369bc("providers/implementations/ciphers/ciphercommon.c", v9, "ossl_cipher_generic_block_update");
            v5 = 0x66;
        }
        else
        {
            v19 = &a0->field_60;
            if (*(long long *)&a0->field_60)
            {
                v20 = sub_b5c62c(&a0->field_10, v19, v6, &v1, &v0);
                v21 = a0;
                v22 = v21;
                if (*(long long *)&a0->field_60 == v6)
                    goto LABEL_b5bc14;
LABEL_b5bc2c:
                v24 = 0;
                if (v20)
                {
                    v25 = v20;
                    if ((v22->field_6c & 3) == 1)
                    {
                        v25 = v20;
                        if (v25 == v0)
                        {
                            v25 = v20 - v6;
                            if (v20 < v6)
                            {
                                sub_c6b6b0();
                                return 0;
                            }
                        }
                    }
                    v24 = v25;
                    if (v24 > a3)
                    {
                        sub_a368c8();
                        v23 = 393;
                        goto LABEL_b5bce8;
                    }
                    else
                    {
                        if (v25)
                            v22->field_a8->field_8();
                        goto LABEL_b5bdf4;
                    }
                }
                else
                {
LABEL_b5bdf4:
                    if (v0)
                    {
                        v26 = sub_b5c6b4(&v22->field_10, v19, v6, &v1, &v0);
                        if (!(unsigned int)v26)
                            return v26;
                        v27 = !v0;
                    }
                    else
                    {
                        v27 = 1;
                    }
                    *a2 = v24;
                    return v27;
                }
            }
            else
            {
                v20 = -v6 & a5;
                v21 = a0;
                v22 = a0;
                if (0 != v6)
                    goto LABEL_b5bc2c;
LABEL_b5bc14:
                if ((v21->field_6c & 3) == 1 && !(v22 = v21, v0))
                    goto LABEL_b5bc2c;
                if (v6 <= a3)
                    v21->field_a8->field_8();
                sub_a368c8();
                v23 = 372;
LABEL_b5bce8:
                sub_a369bc("providers/implementations/ciphers/ciphercommon.c", v23, "ossl_cipher_generic_block_update");
                v5 = 106;
            }
        }
    }
    sub_a36abc(57, v5, 0);
    return 0;
}
