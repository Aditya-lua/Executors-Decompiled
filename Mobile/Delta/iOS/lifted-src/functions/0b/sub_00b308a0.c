/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb308a0..0xb30dc8 (1320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b308a0_0 {
    char padding_0[8];
    char field_8;
    char padding_9[23];
    struct st_b308a0_1 *field_20;
    struct st_b308a0_1 *field_28;
    struct st_b308a0_1 *field_30;
    unsigned long long field_38;
    struct st_b308a0_1 *field_40;
    unsigned int field_48;
} st_b308a0_0;

typedef struct st_b308a0_1 {
    char field_0;
} st_b308a0_1;

extern char _NSHomeDirectory;

char * sub_b308a0(st_b308a0_0 *a0, unsigned long long a1, unsigned long long a2, long long a3)
{
    long long v15;  // x20
    char *v16;  // x22
    char *v25;  // x19
    char *j;  // x20
    char *v27;  // x0
    char *v28;  // x26
    char *v29;  // x25
    char *v30;  // x8
    char *i;  // x8
    char *v32;  // x24
    char *v33;  // x9
    long long v34;  // x22
    unsigned long long v17;  // x24
    char *v35;  // x19
    char *v36;  // x23
    char *v37;  // x19
    char *v38;  // x19
    char *v39;  // x8
    char *v40;  // x8
    char v41;  // x9
    char *v42;  // x11
    char *m;  // x8
    char *v44;  // x9
    char *v18;  // w27
    char *v45;  // w10
    char *n;  // x11
    char *v47;  // x11
    unsigned int v48;  // w10
    long long v50;  // x1
    char *v19;  // w0
    long long v20;  // x20
    long long v21;  // x21
    unsigned long long v22;  // x28
    char *n;  // x27
    char *v24;  // x21
    unsigned long long v0;  // [bp-0xc8]
    char *v1;  // [bp-0xbc]
    unsigned long long iter;  // [bp-0xb8]
    char *k;  // [bp-0xb0], Other Possible Types: unsigned long long
    char *v4;  // [bp-0xa8], Other Possible Types: unsigned int
    char *v5;  // [bp-0xa0]
    char *v6;  // [bp-0x98]
    unsigned long long v7;  // [bp-0x90]
    long long v8;  // [bp-0x88]
    char *v9;  // [bp-0x80]
    char *v10;  // [bp-0x78]
    char *v11;  // [bp-0x70]
    char *v12;  // [bp-0x68]
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    if (!sub_a2f9e0() || !sub_b30dd4(a0, a3))
        return 0;
    if (a0->field_20)
    {
        if (a0->field_30)
        {
            v15 = sub_954340(&a0->field_8);
            v16 = a0->field_28;
            v11 = a0->field_20;
            v17 = a0->field_38;
            v12 = sub_a3f728(v15);
            if (v12)
            {
                v18 = (char *)(unsigned int)sub_a50a7c(v15);
                v8 = v15;
                v19 = (char *)(unsigned int)sub_a50ac8(v15);
                v20 = 218;
                v21 = 69;
                if (v19 < 1 || v18 < 1)
                    goto LABEL_b30ce0;
                v4 = a0->field_48;
                v6 = a0->field_40;
                v7 = a1;
                v22 = v19;
                v1 = v18;
                n = v18;
                v10 = sub_a6bf4c(n, "providers/implementations/kdfs/pkcs12kdf.c", 74);
                v24 = sub_a6bf4c(v22, "providers/implementations/kdfs/pkcs12kdf.c", 75);
                v9 = sub_a6bf4c(n + 1, "providers/implementations/kdfs/pkcs12kdf.c", 76);
                k = &n[v17] - 1;
                v25 = n * k / n;
                if (!v16)
                    j = 0;
                else
                    j = n * (v16 + n - 1) / n;
                v5 = j + v25;
                v27 = sub_a6bf4c();
                v28 = 0;
                if (v10 && v24 && v9)
                {
                    iter = a2;
                    v29 = v27;
                    if (v27)
                    {
                        v0 = k - v25;
                        _memset(v10, v4, n);
                        v30 = v29;
                        if (k != v0)
                        {
                            i = 0;
                            do
                            {
                                *(char *)(v29 + i) = *(char *)(a0->field_30 + &i[-1 * v17 * i / v17]);
                                i += 1;
                            } while (i < v25);
                            v30 = v29 + i;
                        }
                        v32 = v9;
                        if (j)
                        {
                            v33 = 0;
                            do
                            {
                                *(char *)(v30 + v33) = *(char *)(v11 + &v33[-1 * v16 * v33 / v16]);
                                v33 += 1;
                            } while (j != v33);
                        }
                        v34 = v12;
                        v35 = v5;
                        if (sub_a3fe04(v34, v8, 0))
                        {
                            v11 = v6 - 1;
                            k = n & 0x7ffffffe;
                            v4 = v29 - 1;
                            v36 = v10;
                            while (1)
                            {
                                if (!sub_a3fe10(v34, v36, n) || !sub_a3fe10(v34, v29, v35) || !sub_a3ff7c(v34, v24, 0))
                                {
LABEL_b30c68:
                                    v28 = 0;
                                    break;
                                }
                                v37 = v11;
                                if (v6 >= 2)
                                {
                                    do
                                    {
                                        v38 = v37;
                                        if (!sub_a3fe04(v34, v8, 0) || !sub_a3fe10(v34, v24, v22) || !sub_a3ff7c(v34, v24, 0))
                                            goto LABEL_b30c68;
                                    } while ((v37 = v38 - 1, v38 != 1));
                                }
                                _memcpy();
                                iter -= v22;
                                if (iter <= v22)
                                {
                                    v28 = 1;
                                    break;
                                }
                                if (2 > v1)
                                {
                                    v39 = 0;
                                    v35 = v5;
                                }
                                else
                                {
                                    v40 = 0;
                                    v35 = v5;
                                    do
                                    {
                                        v41 = *(char *)(v24 + &v40[1 + -1 * v22 * (v40 + 1) / v22]);
                                        v42 = v32 + v40;
                                        *v42 = *(char *)(v24 + &v40[-1 * v22 * v40 / v22]);
                                        v42[1] = v41;
                                        v40 += 2;
                                    } while (k != v40);
                                    v39 = k;
                                    if (k == n)
                                        goto LABEL_b30c04;
                                }
                                do
                                {
                                    *(char *)(v32 + v39) = *(char *)(v24 + &v39[-1 * v22 * v39 / v22]);
                                    v39 += 1;
                                } while (n != v39);
LABEL_b30c04:
                                if (v35)
                                {
                                    m = 0;
                                    v44 = v4;
                                    do
                                    {
                                        v45 = (char *)1;
                                        n = n;
                                        do
                                        {
                                            v47 = n;
                                            v48 = (unsigned int)&v45[*(char *)(v44 + v47) + *(char *)(v32 - 1 + v47)];
                                            *(char *)(v44 + v47) = v48;
                                            v45 = (v48 * &_NSHomeDirectory | v48 >> 8) & 0xff0000ff & 0xff;
                                            n = v47 - 1;
                                        } while (n);
                                        m += n;
                                        v44 += n;
                                    } while (m < v35);
                                }
                                v7 += v22;
                                iter = iter;
                                if (!sub_a3fe04(v34, v8, 0))
                                    goto LABEL_b30c68;
                            }
                        }
                        else
                        {
                            v28 = 0;
                            v36 = v10;
                        }
                    }
                    else
                    {
                        v34 = v12;
                        v32 = v9;
                        v36 = v10;
                    }
                }
                else
                {
                    v34 = v12;
                    v32 = v9;
                    v36 = v10;
                    v29 = v27;
                }
            }
            else
            {
                v20 = 524294;
                v21 = 63;
LABEL_b30ce0:
                sub_a368c8();
                sub_a369bc("providers/implementations/kdfs/pkcs12kdf.c", v21, "pkcs12kdf_derive");
                sub_a36abc(57, v20, 0);
                v24 = 0;
                v29 = 0;
                v36 = 0;
                v28 = 0;
                v32 = 0;
                v34 = v12;
            }
            sub_a6c2e4(v24, "providers/implementations/kdfs/pkcs12kdf.c", 129);
            sub_a6c2e4(v32, "providers/implementations/kdfs/pkcs12kdf.c", 130);
            sub_a6c2e4(v36, "providers/implementations/kdfs/pkcs12kdf.c", 131);
            sub_a6c2e4(v29, "providers/implementations/kdfs/pkcs12kdf.c", 132);
            sub_a3f73c(v34);
            return v28;
        }
        sub_a368c8();
        sub_a369bc("providers/implementations/kdfs/pkcs12kdf.c", 233, "kdf_pkcs12_derive");
        v50 = 131;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/kdfs/pkcs12kdf.c", 228, "kdf_pkcs12_derive");
        v50 = 130;
    }
    sub_a36abc(57, v50, 0);
    return 0;
    return 0;
}
