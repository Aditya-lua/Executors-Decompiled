/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9dfcdc..0x9e0514 (2104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9dfcdc_0 {
    unsigned long long field_0;
    uint128_t field_8;
    uint128_t field_18;
} st_9dfcdc_0;

typedef struct st_9dfcdc_2 {
    unsigned long long field_0;
} st_9dfcdc_2;

typedef struct st_9dfcdc_1 {
    struct st_9dfcdc_0 *field_0;
    unsigned int field_8;
} st_9dfcdc_1;

extern char g_10002b0;
extern unsigned int g_fffffffffffffffc;

unsigned long long sub_9dfcdc(long long a0, unsigned long long a1, st_9dfcdc_2 **a2, st_9dfcdc_1 *a3, long long a4, unsigned long long a5)
{
    unsigned long long v20;  // x20
    unsigned long long v21;  // x28
    unsigned int v30;  // w9
    unsigned long long v31;  // x8
    unsigned long long v32;  // x24
    unsigned long long v33;  // x11
    unsigned long v34;  // x8
    st_9dfcdc_0 *v35;  // x9
    unsigned long long v36;  // w22
    unsigned long long v37;  // w27
    unsigned long long v38;  // x11
    unsigned long long v39;  // x12
    unsigned long v22;  // x26
    unsigned long long v40;  // x10
    uint128_t *iter;  // x13
    uint128_t *iter1;  // x14
    unsigned long long n;  // x15
    unsigned long long v44;  // x15
    uint128_t v45;  // q1
    unsigned long long v47;  // x11
    unsigned long long *iter2;  // x8
    unsigned long long *v49;  // x9
    unsigned long long v23;  // w27
    unsigned long long i;  // x10
    unsigned long long v51;  // x10
    unsigned long long *v52;  // x9
    unsigned long long v54;  // w8
    unsigned long long j;  // x8
    unsigned long long v56;  // x24
    unsigned long long *v57;  // x9
    unsigned long long *v58;  // x11
    unsigned long long v59;  // x8
    unsigned long long v24;  // x21
    unsigned long long *v60;  // x9
    unsigned long long k;  // x8
    unsigned long long *v63;  // x10
    unsigned long long *v64;  // x9
    unsigned long long v65;  // x8
    unsigned long long *v66;  // x9
    unsigned long long v68;  // w8
    unsigned long long l;  // x8
    unsigned long v25;  // cc_dep1
    unsigned long long v70;  // x13
    unsigned long long *v71;  // x10
    unsigned long long *v72;  // x9
    unsigned long long v73;  // x8
    unsigned long long *v74;  // x9
    unsigned long long v76;  // x9
    unsigned long long v77;  // x22
    unsigned long long *v78;  // x28
    unsigned long long m;  // x21
    unsigned long long v26;  // w11
    unsigned long long v80;  // w8
    unsigned long long i0;  // x8
    unsigned long long *v82;  // x9
    unsigned long long *node;  // x10
    unsigned long long v84;  // x8
    unsigned long long *v85;  // x9
    unsigned long long v87;  // x22
    unsigned long long v88;  // w28
    unsigned long long v89;  // x9
    unsigned long long v27;  // 4108
    unsigned long long v90;  // x24
    unsigned long v91;  // x10
    unsigned long long v92;  // x22
    unsigned int v93;  // w9
    unsigned long long v94;  // 4112
    unsigned long long v95;  // w10
    unsigned long long v96;  // x9
    unsigned long long v97;  // w13
    unsigned long long v98;  // x27
    unsigned long long v99;  // w10
    unsigned long long v28;  // 4108
    unsigned long long v29;  // x24
    unsigned long long v0;  // [bp-0xe0]
    unsigned long long v1;  // [bp-0xd8]
    unsigned long long v2;  // [bp-0xcc]
    unsigned long long v3;  // [bp-0xc8]
    unsigned long long v4;  // [bp-0xc0]
    unsigned long long v5;  // [bp-0xb8]
    unsigned long long v6;  // [bp-0xb0]
    unsigned long long v7;  // [bp-0xa8]
    unsigned long long v8;  // [bp-0xa0]
    unsigned long long *v9;  // [bp-0x98]
    unsigned long long v10;  // [bp-0x90]
    unsigned long long v11;  // [bp-0x8c]
    double v12;  // [bp-0x88]
    unsigned long long *v13;  // [bp-0x80]
    unsigned long long v14;  // [bp-0x78]
    unsigned long long v15;  // [bp-0x74]
    double v16;  // [bp-0x70]
    unsigned long v17;  // [bp-0x68]
    char *v18;  // [bp-0x10]
    char v19;  // [bp+0x0]

    v18 = &v19;
    v20 = a5;
    v21 = a1;
    v17 = *(long long *)&g_10002b0;
    if (!sub_9e5c70(a3))
    {
        sub_a368c8();
        sub_a369bc("crypto/bn/bn_exp.c", 622, "bn_mod_exp_mont_fixed_top");
        sub_a36abc(3, 0x66, 0);
        v87 = 0;
        goto LABEL_9e044c;
    }
    v22 = a3->field_8;
    if ((int)v22 < 0x100000)
    {
        v23 = (int)a2[1];
        if (v23)
        {
            sub_9de064(a4);
            v24 = v20;
            if (v24 || !(v24 = sub_9e6c04(), !v24 || !sub_9e6cc0(v24, a3, a4)))
            {
                if (!*(int *)(v21 + 16) && sub_9e53a8(v21, a3) >> 31 & 1 || (v21 = sub_9de208(a4), v21 && sub_9e5dac()))
                {
                    v25 = v23;
                    if (v23 == 1)
                    {
                        v26 = 3;
                        v27 = arm64g_calculate_condition(195, v25, 1, 0);
                        if (!(v27 & 1))
                            goto LABEL_9dfe32;
LABEL_9dfe31:
                        v26 = 4;
                    }
                    else
                    {
                        v26 = 1;
                        v28 = arm64g_calculate_condition(195, v25, 1, 0);
                        if (v28 & 1)
                            goto LABEL_9dfe31;
LABEL_9dfe32:
                    }
                    if (4 < v23)
                        v26 = 5;
                    if (14 < v23)
                        v29 = 6;
                    else
                        v29 = v26;
                    v30 = (unsigned int)v22 * 2;
                    v4 = 1 << ((char)v29 & 31);
                    if ((int)v4 >= (int)v30)
                        v30 = v4;
                    v7 = (v30 + ((unsigned int)v22 << ((char)v29 & 31))) * 8;
                    if (0xbff >= (int)v7)
                        16777880();
                    v31 = sub_a6bf4c((unsigned int)v7 + 64, "crypto/bn/bn_exp.c", 730);
                    v3 = v31;
                    if (!v31)
                    {
                        v87 = 0;
                        v3 = 0;
                        v6 = 0;
                        goto LABEL_9e0408;
                    }
                    v2 = v23;
                    v8 = v24;
                    v0 = v31 & 63;
                    v1 = v31;
                    v32 = (v31 & 0xffffffffffffffc0) + 64;
                    _bzero(v32, (int)v7);
                    v33 = (int)v22 * 8;
                    v5 = v29;
                    v6 = v32;
                    v34 = v33 << ((char)v5 & 63);
                    v13 = v6 + v34;
                    v9 = (char *)v13 + v33;
                    v10 = 0;
                    v11 = (unsigned int)v22;
                    v14 = 0;
                    v15 = (unsigned int)v22;
                    v12 = 4.243991582e-314;
                    v16 = 4.243991582e-314;
                    v35 = a3->field_0;
                    if (*(long long *)((char *)v35 + v33 - 8) >= 0)
                    {
                        v24 = v8;
                        v36 = (unsigned int)v5;
                        v37 = v2;
                        if (sub_9e6bf4(&v13, sub_9e4624(), v24, a4))
                            goto LABEL_9e0088;
                        goto LABEL_9e03fc;
                    }
                    else
                    {
                        *v13 = -v35->field_0;
                        v24 = v8;
                        v36 = (unsigned int)v5;
                        v37 = v2;
                        if ((int)v22 >= 2)
                        {
                            if ((unsigned int)v22 < 9 || 32 > v34 + v1 - v0 - (char *)v35 + 64)
                            {
                                v40 = 1;
                            }
                            else
                            {
                                v38 = v22 - 1;
                                v39 = v38 & &g_fffffffffffffffc;
                                v40 = v39 | 1;
                                iter = (char *)&v35->field_8 + 8;
                                iter1 = v34 - v0 + v1 + 88;
                                n = v39;
                                do
                                {
                                    v44 = n;
                                    v45 = *iter;
                                    *(int128_t *)((char *)iter1 - 16) = ~*(int128_t *)((char *)iter - 16);
                                    *iter1 = ~v45;
                                    iter += 2;
                                    iter1 += 2;
                                    n = v44 - 4;
                                } while (n);
                                if (v38 == v39)
                                    goto LABEL_9e0084;
                            }
                            v47 = v40 * 8;
                            iter2 = v34 + v47 - v0 + v1 + 64;
                            v49 = (char *)v35 + v47;
                            i = v22 - v40;
                            do
                            {
                                v51 = i;
                                v52 = v49 + 1;
                                *iter2 = ~*v49;
                                iter2 += 1;
                                v49 = v52;
                                i = v51 - 1;
                            } while (i);
                        }
LABEL_9e0084:
                        v14 = (unsigned int)v22;
LABEL_9e0088:
                        if (!sub_9e6bf4(&v9, v21, v24, a4))
                            goto LABEL_9e03fc;
                        v54 = v14;
                        if (v54 < (int)v22)
                            j = v54;
                        else
                            j = v22 & 0xffffffff;
                        v56 = v0;
                        if ((int)j >= 1)
                        {
                            v57 = v13;
                            v58 = v6;
                            do
                            {
                                v59 = j;
                                v60 = v57 + 1;
                                *v58 = *v57;
                                v58 = (char *)v58 + ((v4 * 8 | v4 >> 61) & 0x7fffffff8 & 0x7ffffffff);
                                j = v59 - 1;
                                v57 = v60;
                            } while (j);
                        }
                        if (v10 < (int)v22)
                            k = v10;
                        else
                            k = v22 & 0xffffffff;
                        if ((int)k >= 1)
                        {
                            v63 = v1 - v56 + 72;
                            v64 = v9;
                            do
                            {
                                v65 = k;
                                v66 = v64 + 1;
                                *v63 = *v64;
                                v63 = (char *)v63 + ((v4 * 8 | v4 >> 61) & 0x7fffffff8 & 0x7ffffffff);
                                k = v65 - 1;
                                v64 = v66;
                            } while (k);
                        }
                        if (v36 >= 2)
                        {
                            v24 = v8;
                            if (sub_9e671c(&v13, &v9, &v9, v24, a4))
                            {
                                v68 = v14;
                                if (v68 < (int)v22)
                                    l = v68;
                                else
                                    l = v22 & 0xffffffff;
                                v70 = v1;
                                if ((int)l >= 1)
                                {
                                    v71 = v70 - v56 + 80;
                                    v72 = v13;
                                    do
                                    {
                                        v73 = l;
                                        v74 = v72 + 1;
                                        *v71 = *v72;
                                        v71 = (char *)v71 + ((v4 * 8 | v4 >> 61) & 0x7fffffff8 & 0x7ffffffff);
                                        l = v73 - 1;
                                        v72 = v74;
                                    } while (l);
                                }
                                v76 = v4;
                                if (4 < (unsigned int)v76)
                                    v77 = v76 & 0xffffffff;
                                else
                                    v77 = 4;
                                v78 = v70 - v56 + 88;
                                m = 3;
                                do
                                {
                                    if (!sub_9e671c(&v13, &v9, &v13, v8, a4))
                                    {
                                        v24 = v8;
                                        goto LABEL_9e0498;
                                    }
                                    v80 = v14;
                                    if (v80 < (int)v22)
                                        i0 = v80;
                                    else
                                        i0 = v22 & 0xffffffff;
                                    if ((int)i0 >= 1)
                                    {
                                        v82 = v13;
                                        node = v78;
                                        do
                                        {
                                            v84 = i0;
                                            v85 = v82 + 1;
                                            *node = *v82;
                                            node = (char *)node + ((v76 * 8 | v76 >> 61) & 0x7fffffff8 & 0x7ffffffff);
                                            i0 = v84 - 1;
                                            v82 = v85;
                                        } while (i0);
                                    }
                                    m += 1;
                                    v78 += 1;
                                } while (m != v77);
                                goto LABEL_9e0204;
                            }
                            else
                            {
                                v87 = 0;
LABEL_9e0498:
                                v88 = (unsigned int)v7;
                            }
                        }
                        else
                        {
LABEL_9e0204:
                            v89 = v37 * 64;
                            v90 = v5;
                            v91 = (unsigned int)v89 - 1 - (unsigned int)v90 * (unsigned int)(((unsigned int)v89 - 1) / v90) + 1;
                            v92 = v89 - v91;
                            if ((int)v89 < (int)v91)
                                v93 = (unsigned int)v92 + 63;
                            else
                                v93 = v92;
                            v94 = arm64g_calculate_condition(177, v92 & 0xffffffff, 63, 0);
                            if (!(v94 & 1))
                            {
                                v95 = (int)(v93) >> 6;
                                v88 = (unsigned int)v7;
                                if ((int)a2[1] > v95)
                                {
                                    v96 = *(long long *)&(*a2)[v95];
                                    v97 = (unsigned int)(v92 - (v93 & 0xffffffc0));
                                    v98 = v6;
                                    if (v97)
                                    {
                                        v96 >>= (char)v97 & 63;
                                        v99 = v95 + 1;
                                        v98 = v6;
                                        if ((int)a2[1] > v99)
                                        {
                                            v96 |= *(long long *)&(*a2)[v99] << ((char)-v97 & 63);
                                            v98 = v6;
                                        }
                                    }
                                }
                                else
                                {
                                    v96 = 0;
                                    v98 = v6;
                                }
                            }
                            else
                            {
                                v96 = 0;
                                v88 = (unsigned int)v7;
                                v98 = v6;
                            }
                            if (sub_9e0578(&v13, v22, v98, (unsigned int)v96 & ~(0xffffffff << ((char)v91 & 31)), v90))
                            {
                                do
                                {
                                    if ((int)v92 <= 0)
                                    {
                                        v87 = sub_9e6b70(a0, &v13, v8, a4) != 0;
                                        v24 = v8;
                                        goto LABEL_9e0400;
                                    }
                                } while ((v24 = v8, ...));
LABEL_9e03fc:
                                v87 = 0;
LABEL_9e0400:
LABEL_9e0408:
                                v88 = (unsigned int)v7;
                            }
                            else
                            {
                                v87 = 0;
                                v6 = v98;
                                v24 = v8;
                            }
                        }
                    }
                }
                else
                {
                    v87 = 0;
                    v3 = 0;
                    v88 = 0;
                    v6 = 0;
                }
                if (v20)
                    goto LABEL_9e0418;
            }
            else
            {
                v6 = 0;
                v88 = 0;
                v3 = 0;
                v87 = 0;
            }
            sub_9e6c64(v24);
LABEL_9e0418:
            if (v6)
            {
                sub_a66ec0(v6, v88);
                sub_a6c2e4(v3, "crypto/bn/bn_exp.c", 1140);
            }
            sub_9de17c(a4);
            goto LABEL_9e044c;
        }
        else if (sub_9e5b58(a3, 1))
        {
            sub_9e5b4c(a0);
            v87 = 1;
LABEL_9e044c:
            if (*(long long *)&g_10002b0 == v17)
                return v87;
        }
    }
    ___stack_chk_fail();
}
