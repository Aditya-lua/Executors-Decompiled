/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa82420..0xa82b08 (1768 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a82420_1 {
    char padding_0[8];
    struct st_a82420_0 *field_8;
    long long field_10;
    long long field_18;
    char field_20;
    char padding_21[31];
    char field_40;
    char padding_41[127];
    uint128_t *field_c0;
    char *field_c8;
} st_a82420_1;

typedef struct st_a82420_0 {
    char padding_0[12];
    unsigned int field_c;
    unsigned int field_10;
    unsigned int field_14;
    unsigned int field_18;
    char padding_1c[4];
    unsigned long long field_20;
    unsigned long long field_28;
    char padding_30[4];
    unsigned int field_34;
} st_a82420_0;

extern char g_7fe001;
extern char g_10002b0;

char * sub_a82420(st_a82420_1 *a0, char *a1, char *a2, long long a3, long long a4, unsigned long long n, char *a6, long long a7)
{
    long long n1;  // x27
    unsigned long long v39;  // 4104
    unsigned long long v40;  // 4110
    unsigned long long v41;  // 4104
    char *v42;  // x8
    st_a82420_0 *v43;  // x24
    unsigned long v44;  // x20
    unsigned long long v45;  // x8
    unsigned long v46;  // x28
    unsigned long long v47;  // x23
    char *v48;  // x26
    unsigned long long v31;  // x20
    unsigned long v49;  // x21
    unsigned long v50;  // x27
    unsigned long long v51;  // x8
    char *j;  // x27
    unsigned long long v53;  // x8
    char *v54;  // x26
    char *v55;  // x22
    long long v56;  // x22
    char *v57;  // x8
    char *v58;  // x9
    long long v32;  // x26
    uint128_t *v59;  // x10
    uint128_t *v60;  // x12
    uint128_t *v61;  // x13
    long long iter;  // x14
    uint128_t *v63;  // x10
    char *i1;  // x15
    unsigned long long i2;  // x17
    uint128_t *iter1;  // x15
    uint128_t *node;  // x16
    unsigned long long v68;  // x17
    char *v33;  // x21
    __m128i v69;  // q1
    char *i;  // x20
    long long v72;  // x19
    char *v73;  // x20
    long long v74;  // x19
    char *v75;  // x27
    char *k;  // x9
    char *v77;  // w19
    long long v78;  // x27
    unsigned long v34;  // cc_op
    unsigned long v79;  // x10
    char *i3;  // x12
    unsigned int v81;  // w13
    int v82;  // w14
    unsigned int v83;  // w13
    int v84;  // w14
    char *v85;  // x20
    char *l;  // x21
    char *m;  // x9
    unsigned long v88;  // x10
    unsigned long v35;  // cc_dep1
    char *i4;  // x12
    unsigned int v90;  // w13
    char *v91;  // x20
    char *n;  // x21
    char *v93;  // x20
    char *i0;  // x21
    char *i5;  // x22
    char *v96;  // x19
    unsigned long v36;  // cc_dep2
    unsigned long v37;  // cc_ndep
    unsigned long long v38;  // 4110
    char *v0;  // [bp-0x5e0]
    unsigned long long v1;  // [bp-0x5d8]
    char *v2;  // [bp-0x5d0]
    unsigned long long v3;  // [bp-0x5c8]
    char *v4;  // [bp-0x5c0]
    char *v5;  // [bp-0x5b8]
    unsigned long v6;  // [bp-0x5b0]
    char *v7;  // [bp-0x5a8]
    char *v8;  // [bp-0x5a0]
    char *v9;  // [bp-0x598]
    long long v10;  // [bp-0x590]
    unsigned long v11;  // [bp-0x588]
    char *v12;  // [bp-0x580]
    unsigned long long v13;  // [bp-0x578]
    char *v14;  // [bp-0x570]
    char *v15;  // [bp-0x568]
    unsigned long long v16;  // [bp-0x560]
    unsigned long v17;  // [bp-0x558]
    char *v18;  // [bp-0x550]
    char *v19;  // [bp-0x548]
    char *v20;  // [bp-0x540]
    char *v21;  // [bp-0x538]
    char v22;  // [bp-0x530]
    char v23;  // [bp-0x130]
    char v24;  // [bp-0xf0]
    char v25;  // [bp-0xb0]
    unsigned long v26;  // [bp-0x70]
    char *v27;  // [bp-0x10]
    char v28;  // [bp+0x0], Other Possible Types: long long

    v27 = &v28;
    n1 = a3;
    v26 = *(long long *)&g_10002b0;
    if (sub_a01e1c())
    {
        if (a1)
        {
            v9 = a2;
            v10 = n1;
            v5 = 0;
            v7 = a2;
            goto LABEL_a82520;
        }
        else if (!a6)
        {
            v33 = a2;
            if (a2)
                goto LABEL_a82504;
        }
        else if (0xff >= n)
        {
            v31 = n + 2;
            v32 = v31 + n1;
            if (1025 > (unsigned long long)v32)
            {
                v33 = &v22;
LABEL_a824d8:
                *v33 = 0;
                v33[1] = n;
                _memcpy(v33 + 2, a4, n);
                _memcpy(&v33[v31], a2, n1);
                n1 = v32;
LABEL_a82504:
                v9 = v33;
                v10 = n1;
                v7 = a2;
                if (v33 != &v22)
                {
                    v38 = arm64g_calculate_condition(v34 | 16, v35, v36, v37);
                    v39 = arm64g_calculate_condition(20, (v38 & 1 ? v33 : 0x40000000), (v38 & 1 ? a2 : 0), 0);
                    if (!(v39 & 1))
                        goto LABEL_a8251a;
LABEL_a82519:
                    v42 = v33;
                }
                else
                {
                    v40 = arm64g_calculate_condition(v34 | 16, v35, v36, v37);
                    v41 = arm64g_calculate_condition(16, (v40 & 1 ? v33 : 0x40000000), (v40 & 1 ? a2 : 0), 0);
                    if (v41 & 1)
                        goto LABEL_a82519;
LABEL_a8251a:
                    v42 = 0;
                }
                v5 = v42;
LABEL_a82520:
                v43 = a0->field_8;
                v44 = v43->field_20;
                v45 = v43->field_28;
                v46 = v43->field_18;
                v47 = v45 + v44;
                v48 = v45 & 0xffffffff;
                v49 = v44 * v45;
                v50 = v43->field_10;
                if ((unsigned int)v46 == 0x17400)
                    v51 = 192;
                else
                    v51 = 128;
                v6 = v44 * v51;
                v8 = sub_a6bf4c();
                if (v8)
                {
                    v4 = sub_a3f728();
                    if (v4)
                    {
                        v2 = &v8[v6];
                        v3 = (long long)(v50 * 0x100000000) >> 63 & 0xffffffffc0000000 | __ROL__(v50, 62) & 0xc00000003fffffff & 0x3fffffff;
                        j = v44 & 0xffffffff;
                        v20 = j;
                        v21 = v48;
                        v18 = j;
                        v19 = v2 + 0x400;
                        v53 = &v19[0x400 * v49];
                        v1 = j * 0x400;
                        v11 = v53 + v1;
                        v12 = v48;
                        v13 = v53;
                        v14 = j;
                        v15 = &v23;
                        v16 = v3;
                        v17 = v53 + v47 * 0x400;
                        if (!sub_a7f318(&v11, a7, v28, a0->field_8))
                            goto LABEL_a8272c;
                        v54 = v4;
                        if (!sub_a80ff8(v54, a0->field_10, &a0->field_20, &v19))
                        {
LABEL_a827a8:
                            v78 = v10;
                            goto LABEL_a827b0;
                        }
                        else if (a1)
                        {
                            v55 = v9;
                            if (v10 == 64)
                                goto LABEL_a82624;
                            goto LABEL_a827a8;
                        }
                        else
                        {
                            if (!sub_a3f7f0(v54, a0->field_18, 0) || !sub_a3fe10(v54, &a0->field_40, 64) || !sub_a3fe10(v54, v9, v10) || (v55 = &v25, !sub_a403bc(v54, &v25, 64)))
                                goto LABEL_a827a8;
LABEL_a82624:
                            if (!sub_a815c8(v2, &v23, v3, v54, a0->field_18, v43->field_c))
                                goto LABEL_a827a8;
                            v0 = v55;
                            v56 = v17 + v1;
                            sub_a80d70(v2);
                            v57 = a0->field_c8;
                            if (v57)
                            {
                                v58 = 0;
                                v59 = a0->field_c0;
                                v60 = v59 + 1;
                                v61 = &v8[0x400 * v47 + 0x400 * v49 + v6 + v1 + 1040];
                                iter = v56;
                                v63 = v59;
                                do
                                {
                                    if (32 > v8 + 0x400 * &j[v49 + v47] + v6 - v59 + 0x400)
                                    {
                                        i1 = 0;
                                        do
                                        {
                                            *(unsigned int *)&i1[iter] = *(int *)(v63 + i1) * 0x2000;
                                            i1 += 4;
                                        } while (i1 != 0x400);
                                    }
                                    else
                                    {
                                        i2 = 0x100;
                                        iter1 = v61;
                                        node = v60;
                                        do
                                        {
                                            v68 = i2;
                                            v69 = *node;
                                            *(uint128_t *)((char *)iter1 - 16) = _mm_slli_epi32(*(int128_t *)((char *)node - 16), 13);
                                            *iter1 = _mm_slli_epi32(v69, 13);
                                            node += 2;
                                            iter1 += 2;
                                            i2 = v68 - 8;
                                        } while (i2);
                                    }
                                } while ((v58 += 1, v60 += 64, v61 += 64, iter += 0x400, v63 += 64, v58 != v57));
                            }
                            if (j)
                            {
                                i = j;
                                v72 = v56;
                                do
                                {
                                    v73 = i;
                                    sub_a80d70(v72);
                                    v72 += 0x400;
                                    i = v73 - 1;
                                } while (i);
                                v74 = v56;
                                do
                                {
                                    v75 = j;
                                    sub_a80d10(v74, v2, v74);
                                    v74 += 0x400;
                                    j = v75 - 1;
                                } while (j);
                            }
                            if (v12)
                            {
                                k = 0;
                                v77 = (char *)0;
                                v78 = v10;
                                v79 = v11;
                                do
                                {
                                    i3 = 0;
                                    do
                                    {
                                        v81 = *(int *)&i3[v79];
                                        v82 = (int)((unsigned int)(0x3ff000 - v81) | v81) >> 31;
                                        v83 = ~v82 & v81 | v82 & (unsigned int)&(&g_7fe001)[-1 * v81];
                                        v84 = (long long)((&v77[-1 * v83] ^ v83 | v83 ^ v77) ^ v77) >> 31;
                                        v77 = ~v84 & v77 | v83 & v84;
                                        i3 += 4;
                                    } while (i3 != 0x400);
                                    k += 1;
                                    v79 += 0x400;
                                } while (k != v12);
                                v85 = 0;
                                l = 0;
                                do
                                {
                                    sub_a80d70(&v85[v11]);
                                    l += 1;
                                    v85 += 0x400;
                                } while (l < v12);
                            }
                            else
                            {
                                v77 = (char *)0;
                                v78 = v10;
                            }
                            sub_a80bf4(&v19, &v11, &v17);
                            if (v18)
                            {
                                m = 0;
                                v88 = v17;
                                do
                                {
                                    i4 = 0;
                                    do
                                    {
                                        v90 = (unsigned int)&(&g_7fe001)[*(int *)&i4[v88] + -1 * *(int *)&i4[v56]];
                                        *(unsigned int *)&i4[v88] = ~((int)(v90 + 0xff801fff & ~v90) >> 31) & v90 + 0xff801fff | (int)(v90 + 0xff801fff & ~v90) >> 31 & v90;
                                        i4 += 4;
                                    } while (i4 != 0x400);
                                    m += 1;
                                    v56 += 0x400;
                                    v88 += 0x400;
                                } while (m != v18);
                                v91 = 0;
                                n = 0;
                                do
                                {
                                    sub_a80e88(&v91[v17]);
                                    n += 1;
                                    v91 += 0x400;
                                } while (n < v18);
                                if (v18)
                                {
                                    v93 = 0;
                                    i0 = 0;
                                    do
                                    {
                                        i5 = 0;
                                        do
                                        {
                                            *(unsigned int *)(&v93[v17] + i5) = sub_a80b50(*(int *)(&v93[v13] + i5), *(int *)(&v93[v17] + i5), v46);
                                            i5 += 4;
                                        } while (i5 != 0x400);
                                        i0 += 1;
                                        v93 += 0x400;
                                    } while (i0 < v18);
                                }
                            }
                            sub_a7f6b0(&v17, v46, v8, v6);
                            v54 = v4;
                            if (!sub_a3f7f0(v54, a0->field_18, 0))
                            {
                                v96 = 0;
LABEL_a827b0:
                            }
                            else if (sub_a3fe10(v54, v0, 64) && sub_a3fe10(v54, v8, v6) && sub_a3fe10(v54, 0, 0) && sub_a403bc(v54, &v24, v3) && v43->field_14 - v43->field_34 > v77)
                            {
                                v96 = !_memcmp(&v24, v15, v3);
                            }
                            else
                            {
                                v96 = 0;
                            }
                        }
                    }
                    else
                    {
LABEL_a8272c:
                        v96 = 0;
                        v78 = v10;
                        v54 = v4;
                    }
                    sub_a6c2e4(v8, "crypto/ml_dsa/ml_dsa_sign.c", 299);
                    sub_a3f73c(v54);
                    if (v9 == v7)
                    {
                        if (*(long long *)&g_10002b0 == v26)
                            return v96;
                        ___stack_chk_fail();
                    }
                    goto LABEL_a827dc;
                }
                else
                {
                    v96 = 0;
                    v78 = v10;
                    if (v9 != v7)
                    {
LABEL_a827dc:
                        if (v9 != &v22)
                        {
                            sub_a6c4e8(v5, v78, "crypto/ml_dsa/ml_dsa_sign.c", 437);
                            if (*(long long *)&g_10002b0 == v26)
                                return v96;
                            ___stack_chk_fail();
                        }
                        else
                        {
                            sub_a66ec0(&v22, 0x400);
                        }
                    }
                }
                goto LABEL_a82810;
            }
            else
            {
                v33 = sub_a6bf4c(v32, "crypto/ml_dsa/ml_dsa_sign.c", 348);
                if (v33)
                    goto LABEL_a824d8;
            }
        }
    }
    v96 = 0;
LABEL_a82810:
    if (*(long long *)&g_10002b0 == v26)
        return v96;
    ___stack_chk_fail();
}
