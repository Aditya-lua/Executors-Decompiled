/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab30ec..0xab386c (1920 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned int sub_ab30ec(char *a0, unsigned long long a1, unsigned long a2, unsigned long long a3, unsigned long long a4, long long a5, int a6, unsigned long long a7)
{
    unsigned long long v14;  // x19
    unsigned long long v15;  // x20
    unsigned long long iter;  // x28
    uint128_t *iter1;  // x19
    unsigned long long v115;  // x23
    uint128_t *v116;  // x25
    uint128_t v117;  // q3
    uint128_t v118;  // q5
    unsigned long long v120;  // x23
    unsigned long long v121;  // x25
    void* iter2;  // x22
    uint128_t v123;  // q2
    char *v25;  // x10
    uint128_t v124;  // q3
    unsigned long long v127;  // 4133
    char *v128;  // x12
    unsigned int v129;  // w8
    unsigned long long v130;  // x10
    char *v131;  // x12
    unsigned long long v26;  // w9
    uint128_t *v27;  // x11
    uint128_t *v28;  // x12
    unsigned long long v29;  // x22
    uint128_t *v30;  // x23
    uint128_t *v31;  // x25
    unsigned long v32;  // x11
    char v33;  // x13
    unsigned long long v16;  // w8
    unsigned int v34;  // w21
    unsigned long long v35;  // x19
    unsigned int v36;  // w20
    unsigned long long v37;  // w23
    unsigned long long v38;  // w8
    unsigned long long v39;  // x8
    unsigned long long v40;  // x3
    uint128_t *node;  // x9
    unsigned long long j;  // x10
    unsigned long long v43;  // x10
    unsigned int v17;  // w0
    uint128_t v44;  // q1
    uint128_t v45;  // q3
    unsigned long long v47;  // x11
    double *v48;  // x9
    unsigned long long *v49;  // x10
    unsigned long long v50;  // x11
    double *v51;  // x9
    unsigned long v52;  // d0
    unsigned long long v18;  // x28
    unsigned long long v54;  // 4121
    char *v55;  // x9
    unsigned long v56;  // x10
    unsigned long long k;  // x8
    unsigned long long v58;  // x8
    unsigned long long v60;  // x12
    unsigned long long v61;  // x8
    uint128_t *v62;  // x9
    unsigned long long l;  // x10
    unsigned long long v19;  // x25
    unsigned long long v64;  // x10
    uint128_t v65;  // q1
    uint128_t v66;  // q3
    unsigned long long v68;  // x11
    unsigned long long v69;  // x9
    unsigned long long *v70;  // x10
    unsigned long long v71;  // x11
    unsigned long v72;  // d0
    unsigned long long v20;  // x21
    unsigned long long v74;  // 4126
    char *v75;  // x9
    unsigned long long v76;  // x10
    unsigned long long m;  // x8
    unsigned long long v78;  // x8
    unsigned int v80;  // w0
    unsigned int v81;  // w9
    unsigned long long v82;  // w8
    unsigned long long v83;  // w10
    unsigned long long v21;  // x22
    unsigned long long v84;  // w11
    char *v85;  // x12
    unsigned long long v86;  // x27
    unsigned long long n;  // w13
    unsigned int v88;  // w14
    int v89;  // w15
    unsigned long long v90;  // w11
    unsigned long long v91;  // w12
    unsigned long long v92;  // w13
    int v93;  // w10
    unsigned long long v22;  // x0
    unsigned long long i0;  // x10
    unsigned long v95;  // x15
    void* v96;  // x16
    unsigned long v97;  // x17
    uint128_t *v98;  // x0
    unsigned long long v99;  // w1
    unsigned int v100;  // w5
    unsigned long long v101;  // w4
    char v102;  // x3
    unsigned long v103;  // x6
    unsigned long long i;  // w8
    unsigned long v104;  // x5
    unsigned long v105;  // x7
    unsigned long long v106;  // x7
    unsigned long i2;  // x19
    unsigned long v108;  // x19
    unsigned long long v110;  // x22
    uint128_t v111;  // q0
    uint128_t v112;  // q1
    unsigned long long i1;  // x23
    unsigned int v0;  // [bp-0x134]
    unsigned long long v1;  // [bp-0x130]
    unsigned long long v2;  // [bp-0x12c]
    unsigned long long v3;  // [bp-0x128]
    unsigned long long v4;  // [bp-0x120]
    char *v5;  // [bp-0x118]
    unsigned long long v6;  // [bp-0x100]
    unsigned long long v7;  // [bp-0xf4]
    char v8;  // [bp-0xf0]
    char v9;  // [bp-0xb0]
    unsigned long v11;  // [bp-0x70]
    char *v12;  // [bp-0x10]
    unsigned long long v13;  // [bp+0x0]

    v12 = &v13;
    v14 = a3;
    v15 = v13;
    v11 = *(long long *)&g_10002b0;
    if (!a7)
        a7 = sub_a5609c();
    if (!v15)
        v15 = a7;
    v16 = (unsigned int)sub_a50ac8();
    v17 = 0xffffffff;
    if (a1 >= 1 && (int)v14 >= 1 && v16 >= 1)
    {
        if ((int)a4 < (int)v14 || v16 * 2 + 2 > (int)a4)
        {
            sub_a368c8();
            sub_a369bc("crypto/rsa/rsa_oaep.c", 222, "RSA_padding_check_PKCS1_OAEP_mgf1");
            sub_a36abc(4, 121, 0);
            v17 = 0xffffffff;
        }
        else
        {
            v5 = a0;
            v7 = v16;
            v18 = ~v16;
            v19 = v18 + a4;
            v20 = sub_a6bf4c(v19, "crypto/rsa/rsa_oaep.c", 227);
            v21 = a4 & 0xffffffff;
            if (v20 && !(v22 = sub_a6bf4c(v21, "crypto/rsa/rsa_oaep.c", 231), !v22))
            {
                v3 = v20;
                v4 = v21;
                v1 = (unsigned int)v18;
                v6 = v19;
                i = 0;
                iter = v22 + v21;
                v25 = a2 + (v14 & 0xffffffff);
                v26 = v7;
                v27 = v21 + v26 + v22 + 16;
                v28 = iter + 16;
                do
                {
                    v29 = iter;
                    v30 = v27;
                    v31 = v28;
                    v32 = (unsigned int)v14 != 0;
                    v25 = &v25[-1 * v32];
                    if ((unsigned int)v14)
                        v33 = *v25;
                    else
                        v33 = 0;
                    v14 -= v32;
                    *(char *)(iter - 1) = v33;
                    iter -= 1;
                    i += 1;
                    v27 = (char *)v30 - 1;
                    v28 = (char *)v31 - 1;
                } while (i != (unsigned int)a4);
                v34 = v33 - 1;
                v2 = (int)(v34) >> 31;
                v35 = v26;
                if (sub_ab2f14(&v9, v35, v29 + v35, v6, v15))
                {
                    v36 = 0xffffffff;
                    v19 = v6;
                    v20 = v3;
                    v21 = v4;
                    v37 = v2;
                }
                else
                {
                    v0 = v34;
                    v38 = v7;
                    if (8 > v38)
                    {
                        v39 = 0;
                        v19 = v6;
                        v40 = v35;
                        v20 = v3;
                    }
                    else
                    {
                        v40 = v35;
                        v20 = v3;
                        if (32 > v38)
                        {
                            v39 = 0;
                            v19 = v6;
LABEL_ab33e0:
                            v47 = v39;
                            v39 = v40 & 0x7ffffff8;
                            v48 = v29 + v47;
                            v49 = &(&v9)[v47];
                            v50 = v47 - v39;
                            do
                            {
                                v51 = v48 + 1;
                                v52 = __dirty_unsupported_Iop_ZeroHI64ofV128(*(unsigned long long *)&*v48 ^ *(unsigned long long *)&*(double *)v49);
                                *v49 = v52;
                                v49 += 1;
                                v54 = arm64g_calculate_condition(18, v50, 8, 0);
                                v48 = v51;
                                v50 += 8;
                            } while (v54 & 1);
                            if (v39 == v40)
                                goto LABEL_ab3444;
                        }
                        else
                        {
                            v39 = v40 & 0x7fffffe0;
                            node = &v9 + 16;
                            j = v39;
                            do
                            {
                                v43 = j;
                                v44 = *v31;
                                v45 = *node;
                                *(int128_t *)((char *)node - 16) = *(int128_t *)((char *)v31 - 16) ^ *(int128_t *)((char *)node - 16);
                                *node = v44 ^ v45;
                                v31 += 2;
                                node += 2;
                                j = v43 - 32;
                            } while (j);
                            v19 = v6;
                            if (v39 == v40)
                                goto LABEL_ab3444;
                            if (v40 & 24)
                                goto LABEL_ab33e0;
                        }
                    }
                    v55 = &(&v9)[v39];
                    v56 = v39 + 1;
                    k = v40 - v39;
                    do
                    {
                        v58 = k;
                        *v55 = *v55 ^ *(char *)(iter + v56);
                        v55 += 1;
                        v56 += 1;
                        k = v58 - 1;
                    } while (k);
LABEL_ab3444:
                    if (sub_ab2f14(v20, v19, &v9))
                    {
                        v36 = 0xffffffff;
                        v21 = v4;
                        v37 = v2;
                    }
                    else
                    {
                        v21 = v4;
                        if ((int)v19 >= 1)
                        {
                            v60 = v40;
                            if (8 > (unsigned int)v19)
                            {
                                v61 = 0;
                            }
                            else if (32 > (unsigned int)v19)
                            {
                                v61 = 0;
LABEL_ab34e0:
                                v68 = v61;
                                v61 = v19 & 0x7ffffff8;
                                v69 = v68 + v60 + 1;
                                v70 = v20 + v68;
                                v71 = v68 - v61;
                                do
                                {
                                    v72 = __dirty_unsupported_Iop_ZeroHI64ofV128(*(long long *)(iter + v69) ^ *(unsigned long long *)&*(double *)v70);
                                    *v70 = v72;
                                    v70 += 1;
                                    v69 += 8;
                                    v74 = arm64g_calculate_condition(18, v71, 8, 0);
                                    v71 += 8;
                                } while (v74 & 1);
                                if (v61 == v19)
                                    goto LABEL_ab3548;
                            }
                            else
                            {
                                v61 = v19 & 0x7fffffe0;
                                v62 = v20 + 16;
                                l = v61;
                                do
                                {
                                    v64 = l;
                                    v65 = *v30;
                                    v66 = *v62;
                                    *(int128_t *)((char *)v62 - 16) = *(int128_t *)((char *)v30 - 16) ^ *(int128_t *)((char *)v62 - 16);
                                    *v62 = v65 ^ v66;
                                    v30 += 2;
                                    v62 += 2;
                                    l = v64 - 32;
                                } while (l);
                                if (v61 == v19)
                                    goto LABEL_ab3548;
                                if (v19 & 24)
                                    goto LABEL_ab34e0;
                            }
                            v75 = v20 + v61;
                            v76 = v61 + v60 + 1;
                            m = v19 - v61;
                            do
                            {
                                v78 = m;
                                *v75 = *v75 ^ *(char *)(iter + v76);
                                v75 += 1;
                                v76 += 1;
                                m = v78 - 1;
                            } while (m);
                        }
LABEL_ab3548:
                        if (sub_a40abc(a5, a6, &v8, 0, a7, 0))
                        {
                            v80 = sub_a66f20(v20, &v8, v35);
                            v81 = (int)(v80 - 1 & ~v80 & v0) >> 31;
                            v82 = v7;
                            if ((int)v19 > v82)
                            {
                                v83 = 0;
                                v84 = 0;
                                v85 = v20 + v35;
                                v86 = v35;
                                n = v82;
                                do
                                {
                                    v88 = *v85;
                                    v85 += 1;
                                    v89 = (int)((v88 ^ 1) - 1) >> 31;
                                    v84 = ~(v89 & ~v83) & v84 | v89 & ~v83 & n;
                                    v83 |= v89;
                                    v81 &= v83 | (int)(v88 - 1) >> 31;
                                    n += 1;
                                } while (n < (int)v19);
                                v90 = ~v84;
                            }
                            else
                            {
                                v83 = 0;
                                v90 = 0xffffffff;
                                v86 = v35;
                            }
                            v36 = (unsigned int)v19 + v90;
                            if (((a1 - v36 ^ v36 | v36 ^ a1) ^ a1) < 0)
                                v91 = 0;
                            else
                                v91 = v83;
                            v92 = (unsigned int)v19 + v1;
                            v93 = (long long)(v92 - a1 & (unsigned int)(v82 - v19)) >> 31;
                            i0 = ~v93 & a1 | v93 & v92;
                            if (v92 > 1)
                            {
                                v95 = v82 + 1;
                                v96 = v20 + v95;
                                v97 = v95 + 1;
                                v98 = v96 + 16;
                                v99 = 1;
                                do
                                {
                                    v100 = v19 - v99;
                                    if ((int)v100 <= (int)v95)
                                        continue;
                                    if ((v99 & v92 - v36) - 1 < 0)
                                        v101 = 0;
                                    else
                                        v101 = 0xff;
                                    v102 = ~v101;
                                    v103 = v99;
                                    v104 = v100;
                                    if ((long long)v97 < (long long)v104)
                                        v105 = v104;
                                    else
                                        v105 = v97;
                                    v106 = v105 - v95;
                                    i2 = v95;
                                    if (v106 >= 8)
                                    {
                                        if ((long long)v97 < (long long)v104)
                                            v108 = v104;
                                        else
                                            v108 = v97;
                                        if (v20 + v108 + v103 > v96 && (i2 = v95, v96 + v103 < v20 + v108))
                                            goto LABEL_ab37a8;
                                        if (32 > v106)
                                        {
                                            v110 = 0;
                                        }
                                        else
                                        {
                                            v110 = v106 & 0xffffffffffffffe0;
                                            v111 = CONCAT(v101 & 0xff | (v101 & 0xff) * 0x100 | (v101 & 0xff | (v101 & 0xff) * 0x100) * 0x10000 | (v101 & 0xff | (v101 & 0xff) * 0x100 | (v101 & 0xff | (v101 & 0xff) * 0x100) * 0x10000) * 0x100000000, v101 & 0xff | (v101 & 0xff) * 0x100 | (v101 & 0xff | (v101 & 0xff) * 0x100) * 0x10000 | (v101 & 0xff | (v101 & 0xff) * 0x100 | (v101 & 0xff | (v101 & 0xff) * 0x100) * 0x10000) * 0x100000000);
                                            v112 = CONCAT(v102 | v102 * 0x100 | (v102 | v102 * 0x100) * 0x10000 | (v102 | v102 * 0x100 | (v102 | v102 * 0x100) * 0x10000) * 0x100000000, v102 | v102 * 0x100 | (v102 | v102 * 0x100) * 0x10000 | (v102 | v102 * 0x100 | (v102 | v102 * 0x100) * 0x10000) * 0x100000000);
                                            i1 = v110;
                                            iter1 = v98;
                                            do
                                            {
                                                v115 = i1;
                                                v116 = (char *)iter1 + v103;
                                                v117 = v111 & *v116;
                                                v118 = v112 & *iter1;
                                                *(uint128_t *)((char *)iter1 - 16) = v112 & *(int128_t *)((char *)iter1 - 16) | v111 & *(int128_t *)((char *)v116 - 16);
                                                *iter1 = v118 | v117;
                                                iter1 += 2;
                                                i1 = v115 - 32;
                                            } while (i1);
                                            v19 = v6;
                                            if (v106 == v110)
                                                continue;
                                            if (!(v106 & 24))
                                            {
                                                i2 = v110 + v95;
                                                goto LABEL_ab37a8;
                                            }
                                        }
                                        v120 = v106 & 0xfffffffffffffff8;
                                        i2 = v120 + v95;
                                        v121 = v110 - v120;
                                        iter2 = v96 + v110;
                                        do
                                        {
                                            v123 = __dirty_unsupported_Iop_ZeroHI64ofV128((v101 & 0xff | (v101 & 0xff) * 0x100 | (v101 & 0xff | (v101 & 0xff) * 0x100) * 0x10000 | (v101 & 0xff | (v101 & 0xff) * 0x100 | (v101 & 0xff | (v101 & 0xff) * 0x100) * 0x10000) * 0x100000000) & *(long long *)((char *)iter2 + v103));
                                            v124 = __dirty_unsupported_Iop_ZeroHI64ofV128((v102 | v102 * 0x100 | (v102 | v102 * 0x100) * 0x10000 | (v102 | v102 * 0x100 | (v102 | v102 * 0x100) * 0x10000) * 0x100000000) & *(unsigned long long *)&*(double *)iter2);
                                            *(unsigned long long *)iter2 = __dirty_unsupported_Iop_ZeroHI64ofV128(v124 | v123);
                                            iter2 += 8;
                                            v127 = arm64g_calculate_condition(18, v121, 8, 0);
                                            v121 += 8;
                                        } while (v127 & 1);
                                        v19 = v6;
                                        if (v106 == v120)
                                            continue;
                                        goto LABEL_ab37a8;
                                    }
                                    else
                                    {
LABEL_ab37a8:
                                        do
                                        {
                                            *(char *)(v20 + i2) = v102 & *(char *)(v20 + i2) | (char)v101 & *(char *)(v20 + v103 + i2);
                                            i2 += 1;
                                        } while ((long long)i2 < (long long)v104);
                                    }
                                } while ((v99 *= 2, v92 > v99));
                            }
                            v37 = v91 & v81;
                            if ((int)i0 >= 1)
                            {
                                v128 = v20 + v86 + 1;
                                v129 = (unsigned int)(v82 - v90 - a4) + 1;
                                do
                                {
                                    v130 = i0;
                                    v131 = v128 + 1;
                                    *v5 = (char)~(v37 & 0xff & (int)(v129 | v36) >> 31) & *v5 | (char)v37 & (char)((int)(v129 | v36) >> 31) & *v128;
                                    v5 += 1;
                                    v129 += 1;
                                    i0 = v130 - 1;
                                    v128 = v131;
                                } while (i0);
                            }
                            sub_a368c8();
                            sub_a369bc("crypto/rsa/rsa_oaep.c", 332, "RSA_padding_check_PKCS1_OAEP_mgf1");
                            sub_a36abc(4, 121, 0);
                            sub_a366d8(v37 & 1);
                            v21 = v4;
                        }
                        else
                        {
                            v36 = 0xffffffff;
                            v37 = v2;
                        }
                    }
                }
            }
            else
            {
                v37 = 0;
                iter = 0;
                v36 = 0xffffffff;
            }
            sub_a66ec0(&v9, 64);
            sub_a6c4e8(v20, v19, "crypto/rsa/rsa_oaep.c", 337);
            sub_a6c4e8(iter, v21, "crypto/rsa/rsa_oaep.c", 338);
            v17 = ~v37 | v37 & v36;
        }
    }
    if (*(long long *)&g_10002b0 == v11)
        return v17;
    ___stack_chk_fail();
}
