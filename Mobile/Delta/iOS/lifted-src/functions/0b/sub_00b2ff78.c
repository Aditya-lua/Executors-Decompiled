/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2ff78..0xb30398 (1056 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2ff78_0 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    char field_30;
    char padding_31[23];
    unsigned int field_48;
} st_b2ff78_0;

extern char g_10002b0;

unsigned long long sub_b2ff78(st_b2ff78_0 *a0, void* a1, unsigned long long a2, long long a3)
{
    unsigned long long v16;  // x20
    void* iter;  // x21
    long long v26;  // x19
    unsigned long long v27;  // x23
    unsigned long v28;  // x25
    unsigned long long v29;  // x28
    unsigned long long v30;  // x20
    unsigned long long v31;  // x26
    unsigned long long v32;  // x28
    unsigned long long v33;  // x25
    unsigned long long v34;  // x10
    unsigned long long v35;  // x11
    unsigned long long v18;  // x0
    unsigned long long i;  // x8
    uint128_t *iter1;  // x9
    uint128_t *node;  // x10
    unsigned long long v39;  // x8
    uint128_t v40;  // q1
    uint128_t v41;  // q3
    double *v43;  // x8
    void* iter2;  // x9
    unsigned long long v45;  // x10
    long long v19;  // x0
    double *v46;  // x8
    unsigned long v47;  // d0
    unsigned long long v49;  // 4121
    unsigned long long j;  // x8
    void* v51;  // x9
    char *v52;  // x10
    unsigned long long v53;  // x8
    char *v54;  // x10
    unsigned long long v20;  // x22
    unsigned int v21;  // w28
    unsigned long long v22;  // x27
    unsigned long long v23;  // w0
    unsigned long v24;  // x24
    unsigned long long v25;  // x1
    unsigned long long v0;  // [bp-0x100]
    uint128_t *v1;  // [bp-0xf8]
    uint128_t *v2;  // [bp-0xf0]
    unsigned long v3;  // [bp-0xe8]
    unsigned long long v4;  // [bp-0xe0]
    unsigned long long v5;  // [bp-0xd8]
    unsigned long n;  // [bp-0xd0]
    unsigned long long v7;  // [bp-0xc8]
    unsigned long long v8;  // [bp-0xc0]
    unsigned long long v9;  // [bp-0xb8]
    unsigned int v10;  // [bp-0xb4]
    char v11;  // [bp-0xb0]
    unsigned long v13;  // [bp-0x70]
    char *v14;  // [bp-0x10]
    char v15;  // [bp+0x0]

    v14 = &v15;
    v16 = a2;
    iter = a1;
    v13 = *(long long *)&g_10002b0;
    v18 = sub_a2f9e0();
    if ((unsigned int)v18)
    {
        v18 = sub_b303a4(a0, a3);
        if ((unsigned int)v18)
        {
            if (!a0->field_8)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/kdfs/pbkdf2.c", 0xee, "kdf_pbkdf2_derive");
                v25 = 130;
                goto LABEL_b300ec;
            }
            if (a0->field_18)
            {
                v19 = sub_954340(&a0->field_30);
                v20 = a0->field_18;
                v21 = a0->field_20;
                v22 = a0->field_28;
                v23 = (unsigned int)sub_a50ac8(v19);
                if (v23 < 1)
                    goto LABEL_b300f4;
                v24 = v23;
                if (v16 / v24 >= 0xffffffff)
                {
                    sub_a368c8();
                    sub_a369bc("providers/implementations/kdfs/pbkdf2.c", 398, "pbkdf2_derive");
                    v25 = 105;
                    goto LABEL_b300ec;
                }
                if (a0->field_48)
                {
                    if (112 > v16 * 8)
                    {
                        v25 = 171;
                    }
                    else if (16 > (int)v21)
                    {
                        v25 = 112;
                    }
                    else
                    {
                        if (999 < v22)
                            goto LABEL_b30130;
                        v25 = 123;
                    }
                    sub_a368c8();
                    sub_a369bc("providers/implementations/kdfs/pbkdf2.c", 412, "pbkdf2_derive");
LABEL_b300ec:
                    sub_a36abc(57, v25, 0);
LABEL_b300f4:
                    v18 = 0;
                }
                else
                {
LABEL_b30130:
                    v9 = v23;
                    v18 = sub_a64420();
                    if (v18)
                    {
                        v26 = v18;
                        if (sub_a64000())
                        {
                            v27 = sub_a64420();
                            if (v27)
                            {
                                if ((unsigned int)v16)
                                {
                                    v28 = v21;
                                    v2 = &v11 + 16;
                                    v3 = v28;
                                    v29 = 1;
                                    do
                                    {
                                        v30 = v16;
                                        if ((int)v30 < v9)
                                            v31 = v30 & 0xffffffff;
                                        else
                                            v31 = v9;
                                        v10 = (((((v29 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v29 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v29 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v29 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                                        if (!sub_a64530() || !sub_a6432c(v27, v20, v28) || !sub_a6432c(v27, &v10, 4) || !sub_a64344(v27, &v11, 0))
                                            goto LABEL_b30370;
                                        n = (int)v31;
                                        v7 = v29;
                                        _memcpy(iter, &v11, n);
                                        if (v22 < 2)
                                            continue;
                                        if (1 < (int)v31)
                                            v32 = v31 & 0xffffffff;
                                        else
                                            v32 = 1;
                                        v8 = v32 & 0x7fffffe0;
                                        v0 = v32 & 24;
                                        v1 = iter + 16;
                                        v5 = v32 & 0x7ffffff8;
                                        v4 = -v5;
                                        v33 = 1;
                                        do
                                        {
                                            if (!sub_a64530(v27, v26) || !sub_a6432c(v27, &v11, v24) || !sub_a64344(v27, &v11, 0))
                                                goto LABEL_b30370;
                                            if ((int)v30 < 1)
                                                continue;
                                            if (8 > (int)v31)
                                            {
                                                v34 = 0;
                                            }
                                            else
                                            {
                                                if (32 > (int)v31)
                                                {
                                                    v35 = 0;
                                                }
                                                else
                                                {
                                                    i = v8;
                                                    iter1 = v1;
                                                    node = v2;
                                                    do
                                                    {
                                                        v39 = i;
                                                        v40 = *node;
                                                        v41 = *iter1;
                                                        *(int128_t *)((char *)iter1 - 16) = *(int128_t *)((char *)node - 16) ^ *(int128_t *)((char *)iter1 - 16);
                                                        *iter1 = v40 ^ v41;
                                                        node += 2;
                                                        iter1 += 2;
                                                        i = v39 - 32;
                                                    } while (i);
                                                    if (v8 == v32)
                                                        continue;
                                                    v34 = v8;
                                                    v35 = v34;
                                                    if (!v0)
                                                        goto LABEL_b30344;
                                                }
                                                v43 = &(&v11)[v35];
                                                iter2 = iter + v35;
                                                v45 = v4 + v35;
                                                do
                                                {
                                                    v46 = v43 + 1;
                                                    v47 = __dirty_unsupported_Iop_ZeroHI64ofV128(*(unsigned long long *)&*v43 ^ *(unsigned long long *)&*(double *)iter2);
                                                    *(unsigned long *)iter2 = v47;
                                                    iter2 += 8;
                                                    v49 = arm64g_calculate_condition(18, v45, 8, 0);
                                                    v43 = v46;
                                                    v45 += 8;
                                                } while (v49 & 1);
                                                v34 = v5;
                                                if (v5 == v32)
                                                    continue;
                                            }
LABEL_b30344:
                                            j = v32 - v34;
                                            v51 = iter + v34;
                                            v52 = &(&v11)[v34];
                                            do
                                            {
                                                v53 = j;
                                                v54 = v52 + 1;
                                                *(char *)v51 = *(char *)v51 ^ *v52;
                                                v51 += 1;
                                                j = v53 - 1;
                                                v52 = v54;
                                            } while (j);
                                        } while ((v33 += 1, v33 != v22));
                                    } while ((v29 = v7 + 1, iter += n, v16 = v30 - v31, v28 = v3, (unsigned int)v30 != (unsigned int)v31));
                                }
                                v18 = 1;
                            }
                            else
                            {
LABEL_b30370:
                                v18 = 0;
                            }
                        }
                        else
                        {
                            v18 = 0;
                            v27 = 0;
                        }
                        sub_a644c4(v27);
                        sub_a644c4(v26);
                    }
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/kdfs/pbkdf2.c", 243, "kdf_pbkdf2_derive");
                v25 = 131;
                goto LABEL_b300ec;
            }
        }
    }
    if (*(long long *)&g_10002b0 == v13)
        return v18;
    ___stack_chk_fail();
}
