/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac6e70..0xac7878 (2568 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_eb4120;

unsigned long long sub_ac6e70(long long a0, long long a1, void* a2, unsigned long long a3, unsigned long a4, unsigned long long *a5)
{
    unsigned long v24;  // x19
    long long v25;  // x21
    unsigned long long v34;  // x22
    unsigned long long v35;  // x25
    unsigned long long v36;  // x22
    unsigned long long v37;  // x25
    unsigned long long v38;  // x0
    unsigned long long v39;  // x0
    long long v40;  // x23
    unsigned long long v41;  // x8
    unsigned long long v42;  // x24
    unsigned long long v43;  // x23
    long long v26;  // x20
    unsigned long long v44;  // x10
    unsigned long long v45;  // w8
    unsigned long long v46;  // q0
    unsigned long long v47;  // q1
    unsigned long long i;  // x8
    uint128_t *node;  // x9
    unsigned long long v50;  // x8
    uint128_t v52;  // q0
    long long v27;  // x0
    unsigned long v54;  // d0
    unsigned long long v55;  // x8
    uint128_t v56;  // q0
    double *v57;  // x8
    unsigned long long v58;  // x9
    double *v59;  // x8
    unsigned long long v61;  // 4114
    unsigned long long v62;  // x8
    unsigned long long j;  // x9
    unsigned long long v28;  // x28
    char *v64;  // x10
    unsigned long long v65;  // x9
    char *v66;  // x10
    long long v68;  // x1
    long long v69;  // x1
    unsigned long long v70;  // x20
    unsigned long long v71;  // x8
    unsigned long long v72;  // x23
    void* v73;  // x21
    long long v29;  // x0
    uint128_t *iter;  // x9
    uint128_t *iter1;  // x10
    unsigned long long k;  // x11
    unsigned long long v77;  // x11
    uint128_t v78;  // q1
    uint128_t v79;  // q3
    unsigned long long v81;  // x11
    void* v82;  // x9
    unsigned long long *iter2;  // x10
    unsigned int v30;  // w0
    unsigned long long v84;  // x11
    void* v85;  // x9
    unsigned long v86;  // d0
    unsigned long long v88;  // 4121
    unsigned long long l;  // x9
    char *v90;  // x10
    void* v91;  // x8
    unsigned long long v92;  // x9
    void* v93;  // x8
    unsigned int v31;  // w9
    unsigned long long v95;  // x0
    unsigned long long v96;  // x0
    unsigned long long v97;  // x21
    unsigned long long v98;  // x0
    long long v99;  // x1
    unsigned long long v100;  // x0
    unsigned long long v101;  // x23
    long long v102;  // x1
    unsigned long long v103;  // x24
    unsigned long long v32;  // 4125
    unsigned long long v104;  // x21
    long long v105;  // x1
    long long v106;  // x1
    unsigned long v33;  // x23
    unsigned long long v0;  // [bp-0x130]
    uint128_t *v1;  // [bp-0x128]
    unsigned long long v2;  // [bp-0x120]
    unsigned long long v3;  // [bp-0x118]
    unsigned long long v4;  // [bp-0x110]
    unsigned long long v5;  // [bp-0x108]
    unsigned long long v6;  // [bp-0x100]
    unsigned long long v7;  // [bp-0xf8]
    long long v8;  // [bp-0xf0]
    unsigned long v9;  // [bp-0xe8]
    long long v10;  // [bp-0xe0]
    unsigned long long v11;  // [bp-0xd8]
    long long v12;  // [bp-0xd0]
    long long v13;  // [bp-0xc0]
    unsigned long long v14;  // [bp-0xb8]
    unsigned long long v15;  // [bp-0xb0]
    long long v16;  // [bp-0x98]
    unsigned long v17;  // [bp-0x90]
    long long v18;  // [bp-0x88]
    unsigned long long v19;  // [bp-0x80]
    unsigned long long v20;  // [bp-0x78]
    unsigned long v21;  // [bp-0x70]
    char *v22;  // [bp-0x10]
    char v23;  // [bp+0x0]

    v22 = &v23;
    v21 = a4;
    v24 = sub_a3f728();
    v25 = sub_9ffdd0(a0);
    v26 = sub_c4ba8(v25);
    v27 = sub_975ff4(a0);
    v28 = sub_a50ac8(a1);
    v16 = sub_a19700(a0);
    v29 = sub_a19708(a0);
    v19 = 0;
    v20 = 0;
    if (!v24 || (int)v28 <= 0)
    {
        sub_a368c8();
        v106 = 141;
        goto LABEL_ac6f64;
    }
    else if (sub_975ffc(v25))
    {
        v30 = sub_9e46a8();
        v31 = v30 + 14;
        v32 = arm64g_calculate_condition(177, v30, 7, 0);
        if (v32 & 1)
            v33 = v31;
        else
            v33 = v30 + 7;
        if (14 >= v31)
            goto LABEL_ac6f30;
        v13 = v29;
        v34 = sub_a1a56c(v25);
        v35 = sub_a1a56c(v25);
        v15 = v34;
        if (v15 && v35)
        {
            v14 = v35;
            v36 = sub_9dddcc(v16);
            if (!v36)
            {
                sub_a368c8();
                v105 = 159;
                goto LABEL_ac7204;
            }
            sub_9de064(v36);
            v10 = sub_9de208(v36);
            v9 = sub_9de208(v36);
            v12 = sub_9de208(v36);
            v8 = sub_9de208(v36);
            v11 = sub_9de208(v36);
            if (v11)
            {
                v5 = (long long)(v33 * 0x100000000) >> 63 & 0xffffffffe0000000 | __ROL__(v33, 61) & 0xe00000001fffffff & 0x1fffffff;
                v7 = v5 * 2;
                v37 = sub_a6bffc(v7, "crypto/sm2/sm2_crypt.c", 175);
                v38 = sub_a6bffc(v28 & 0xffffffff, "crypto/sm2/sm2_crypt.c", 176);
                if (v37)
                {
                    v4 = v38;
                    if (v38)
                    {
                        _bzero(a4, *a5);
                        v39 = sub_a6bffc(a3, "crypto/sm2/sm2_crypt.c", 183);
                        v6 = v39;
                        if (v39)
                        {
                            v40 = v10;
                            if (sub_9e93c8(v40, v26, 0, v36))
                            {
                                v41 = a3;
                                v0 = v41 & 24;
                                v42 = v41 & 0xfffffffffffffff8;
                                v1 = v6 + 16;
                                v2 = v41 & 0xffffffffffffffe0;
                                v3 = -v42;
                            }
                            else
                            {
LABEL_ac7464:
                                sub_a368c8();
                                v69 = 189;
                                goto LABEL_ac74c8;
                            }
                            while (1)
                            {
                                if (!sub_a1b804(v25, v15, v40, 0, 0, v36) || !sub_a1b3cc(v25, v15, v9, v8, v36) || !sub_a1b804(v25, v14, 0, v27, v40, v36) || !sub_a1b3cc(v25, v14, v12, v11, v36))
                                {
                                    sub_a368c8();
                                    sub_a369bc("crypto/sm2/sm2_crypt.c", 197, "ossl_sm2_encrypt");
                                    v68 = 524304;
                                    goto LABEL_ac74d8;
                                }
                                v43 = v5;
                                if (sub_9e5174(v12, v37, v43) >> 31 & 1 || sub_9e5174(v11, v37 + v43, v43) >> 31 & 1)
                                {
                                    sub_a368c8();
                                    v69 = 203;
LABEL_ac74c8:
                                    sub_a369bc("crypto/sm2/sm2_crypt.c", v69, "ossl_sm2_encrypt");
                                    v68 = 786691;
                                    goto LABEL_ac74d8;
                                }
                                if (!sub_a1e7f4(v6, a3, v37, v7, 0, 0, a1, v16, v13))
                                {
                                    sub_a368c8();
                                    sub_a369bc("crypto/sm2/sm2_crypt.c", 210, "ossl_sm2_encrypt");
                                    v68 = 524294;
LABEL_ac74d8:
                                    sub_a36abc(53, v68, 0);
                                    v39 = 0;
                                    v101 = 0;
                                    goto LABEL_ac74e8;
                                }
                                if (a3)
                                    break;
LABEL_ac7240:
                                _bzero(v37, v7);
                                v40 = v10;
                                if (!sub_9e93c8(v40, v26, 0, v36))
                                    goto LABEL_ac7464;
                            }
                            if (8 > a3)
                            {
                                v44 = 0;
                                v45 = 0;
                            }
                            else
                            {
                                if (32 > a3)
                                {
                                    v45 = 0;
                                    v44 = 0;
                                    goto LABEL_ac73c4;
                                }
                                v46 = 0;
                                v44 = v2;
                                v47 = 0;
                                i = v44;
                                node = v1;
                                do
                                {
                                    v50 = i;
                                    v46 |= *(int128_t *)((char *)node - 16);
                                    v47 |= *node;
                                    node += 2;
                                    i = v50 - 32;
                                } while (i);
                                v52 = v47 | v46;
                                v54 = __dirty_unsupported_Iop_ZeroHI64ofV128(v52 | __dirty_unsupported_Iop_SliceV128(v52, v52, 8));
                                v55 = __double_as_longlong(v54) | __double_as_longlong(v54) >> 32 | (__double_as_longlong(v54) | __double_as_longlong(v54) >> 32) >> 16;
                                v45 = (unsigned int)v55 | (unsigned int)(v55 >> 8);
                                if (v44 == a3)
                                    goto LABEL_ac7238;
                                if (v0)
                                {
LABEL_ac73c4:
                                    v56 = (char)v45;
                                    v57 = v6 + v44;
                                    v58 = v3 + v44;
                                    do
                                    {
                                        v59 = v57 + 1;
                                        v56 = __dirty_unsupported_Iop_ZeroHI64ofV128(*(unsigned long long *)&*v57 | v56);
                                        v61 = arm64g_calculate_condition(18, v58, 8, 0);
                                        v57 = v59;
                                        v58 += 8;
                                    } while (v61 & 1);
                                    v62 = *(unsigned long long *)&*(unsigned long long *)(void*)&v56 | *(unsigned long long *)&*(unsigned long long *)(void*)&v56 >> 32 | (*(unsigned long long *)&*(unsigned long long *)(void*)&v56 | *(unsigned long long *)&*(unsigned long long *)(void*)&v56 >> 32) >> 16;
                                    v45 = (unsigned int)v62 | (unsigned int)(v62 >> 8);
                                    v44 = v42;
                                    if (v44 == a3)
                                        goto LABEL_ac7238;
                                }
                            }
                            j = a3 - v44;
                            v64 = v6 + v44;
                            do
                            {
                                v65 = j;
                                v66 = v64 + 1;
                                v45 |= *v64;
                                j = v65 - 1;
                                v64 = v66;
                            } while (j);
LABEL_ac7238:
                            if (!(v45 & 0xff))
                                goto LABEL_ac7240;
                            v70 = a3;
                            if (8 > v70)
                            {
                                v71 = 0;
                                v38 = v4;
                                v72 = v5;
                                v73 = a2;
                            }
                            else
                            {
                                v73 = a2;
                                if (32 > v70)
                                {
                                    v71 = 0;
                                    v38 = v4;
                                    v72 = v5;
                                    goto LABEL_ac75a8;
                                }
                                v71 = v70 & 0xffffffffffffffe0;
                                iter = v73 + 16;
                                iter1 = v6 + 16;
                                k = v71;
                                do
                                {
                                    v77 = k;
                                    v78 = *iter;
                                    v79 = *iter1;
                                    *(int128_t *)((char *)iter1 - 16) = *(int128_t *)((char *)iter - 16) ^ *(int128_t *)((char *)iter1 - 16);
                                    *iter1 = v78 ^ v79;
                                    iter += 2;
                                    iter1 += 2;
                                    k = v77 - 32;
                                } while (k);
                                v38 = v4;
                                v72 = v5;
                                if (v71 == v70)
                                    goto LABEL_ac7608;
                                if (v70 & 24)
                                {
LABEL_ac75a8:
                                    v81 = v71;
                                    v71 = v70 & 0xfffffffffffffff8;
                                    v82 = v73 + v81;
                                    iter2 = v6 + v81;
                                    v84 = v81 - v71;
                                    do
                                    {
                                        v85 = v82 + 8;
                                        v86 = __dirty_unsupported_Iop_ZeroHI64ofV128(*(unsigned long long *)&*(double *)v82 ^ *(unsigned long long *)&*(double *)iter2);
                                        *iter2 = v86;
                                        iter2 += 1;
                                        v88 = arm64g_calculate_condition(18, v84, 8, 0);
                                        v82 = v85;
                                        v84 += 8;
                                    } while (v88 & 1);
                                    if (v71 == v70)
                                        goto LABEL_ac7608;
                                }
                            }
                            l = v70 - v71;
                            v90 = v6 + v71;
                            v91 = v73 + v71;
                            do
                            {
                                v92 = l;
                                v93 = v91 + 1;
                                *v90 = *v90 ^ *(char *)v91;
                                v90 += 1;
                                v91 = v93;
                                l = v92 - 1;
                            } while (l);
LABEL_ac7608:
                            v95 = sub_a40ca8(v16, sub_a50a58(a1), v13);
                            if (v95)
                            {
                                v39 = v95;
                                if (!sub_a3fd98(v24, v39) || !sub_a3fe10(v24, v37, v72) || !sub_a3fe10(v24, v73, v70) || !sub_a3fe10(v24, v37 + v72, v72) || !sub_a3ff18(v24, v38, 0))
                                {
                                    sub_a368c8();
                                    sub_a369bc("crypto/sm2/sm2_crypt.c", 232, "ossl_sm2_encrypt");
                                    sub_a36abc(53, 0x80006, 0);
                                    goto LABEL_ac77a0;
                                }
                                v17 = v9;
                                v18 = v8;
                                v96 = sub_9cf0ec();
                                v97 = v96;
                                v19 = v96;
                                v20 = sub_9cf0ec(v96);
                                if (v97 && v20)
                                {
                                    if (sub_9c026c(v97, v4, v28) && sub_9c026c(v20, v6, a3))
                                    {
                                        v98 = sub_9ccc7c(&v17, 0, &g_eb4120);
                                        if (v98 >> 31 & 1)
                                        {
                                            sub_a368c8();
                                            v102 = 254;
                                        }
                                        else if ((v98 & 0xffffffff) > *a5)
                                        {
                                            sub_a368c8();
                                            sub_a369bc("crypto/sm2/sm2_crypt.c", 259, "ossl_sm2_encrypt");
                                            v99 = 107;
                                            goto LABEL_ac7800;
                                        }
                                        else
                                        {
                                            v100 = sub_9ccc7c(&v17, &v21, &g_eb4120);
                                            if (!(v100 >> 31 & 1))
                                            {
                                                *a5 = v100 & 0xffffffff;
                                                v101 = 1;
LABEL_ac780c:
LABEL_ac74e8:
                                                v103 = v14;
                                                v104 = v15;
                                                v38 = v4;
                                                goto LABEL_ac74f0;
                                            }
                                            else
                                            {
                                                sub_a368c8();
                                                v102 = 265;
                                            }
                                        }
                                    }
                                    else
                                    {
                                        sub_a368c8();
                                        v102 = 247;
                                    }
                                    sub_a369bc("crypto/sm2/sm2_crypt.c", v102, "ossl_sm2_encrypt");
                                    v99 = 786691;
                                }
                                else
                                {
                                    sub_a368c8();
                                    sub_a369bc("crypto/sm2/sm2_crypt.c", 242, "ossl_sm2_encrypt");
                                    v99 = 524301;
                                }
LABEL_ac7800:
                                sub_a36abc(53, v99, 0);
                                v101 = 0;
                                goto LABEL_ac780c;
                            }
                            else
                            {
                                sub_a368c8();
                                sub_a369bc("crypto/sm2/sm2_crypt.c", 224, "ossl_sm2_encrypt");
                                sub_a36abc(53, 0xc0103, 0);
                                v39 = 0;
                                v101 = 0;
LABEL_ac77a0:
                                v103 = v14;
                                v104 = v15;
                            }
LABEL_ac74f0:
                        }
                        else
                        {
                            v6 = 0;
                            v101 = 0;
LABEL_ac7458:
                            v103 = v14;
                            v104 = v15;
                            v38 = v4;
                        }
                    }
                    else
                    {
                        v39 = 0;
                        goto LABEL_ac7458;
                    }
                }
                else
                {
                    v6 = 0;
                    v101 = 0;
                    v39 = 0;
LABEL_ac7230:
                    v103 = v14;
                    v104 = v15;
                }
            }
            else
            {
                sub_a368c8();
                v105 = 171;
LABEL_ac7204:
                sub_a369bc("crypto/sm2/sm2_crypt.c", v105, "ossl_sm2_encrypt");
                sub_a36abc(53, 0x80003, 0);
                v37 = 0;
                v38 = 0;
                goto LABEL_ac7230;
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/sm2/sm2_crypt.c", 154, "ossl_sm2_encrypt");
            sub_a36abc(53, 0x80010, 0);
            v6 = 0;
            v38 = 0;
            v36 = 0;
            v39 = 0;
            v101 = 0;
            v104 = v15;
            v103 = v35;
            v37 = 0;
        }
    }
    else
    {
LABEL_ac6f30:
        sub_a368c8();
        v106 = 147;
LABEL_ac6f64:
        sub_a369bc("crypto/sm2/sm2_crypt.c", v106, "ossl_sm2_encrypt");
        sub_a36abc(53, 0xc0103, 0);
        v104 = 0;
        v103 = 0;
        v6 = 0;
        v37 = 0;
        v38 = 0;
        v36 = 0;
        v39 = 0;
        v101 = 0;
    }
    sub_a3f52c(v39);
    sub_9cf0f4(v20);
    sub_9cf0f4(v19);
    sub_a6c2e4(v6, "crypto/sm2/sm2_crypt.c", 276);
    sub_a6c2e4(v37, "crypto/sm2/sm2_crypt.c", 277);
    sub_a6c2e4(v38, "crypto/sm2/sm2_crypt.c", 278);
    sub_a3f73c(v24);
    sub_9de17c(v36);
    sub_9dded4(v36);
    sub_a1a254(v104);
    sub_a1a254(v103);
    return v101;
}
