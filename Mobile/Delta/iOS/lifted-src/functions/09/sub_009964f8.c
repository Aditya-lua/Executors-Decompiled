/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9964f8..0x996e50 (2392 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9964f8_0 {
    char padding_0[8];
    char field_8;
    unsigned short field_9;
    unsigned short field_b;
} st_9964f8_0;

typedef struct st_9964f8_2 {
    char field_0;
} st_9964f8_2;

extern char g_10002b0;

unsigned long long sub_9964f8(void* a0, void* a1, unsigned long long a2, unsigned int a3, unsigned long long a4, long long a5)
{
    unsigned long long v21;  // x27
    unsigned long long v22;  // x25
    unsigned long v31;  // cc_op
    unsigned long long v121;  // x24
    unsigned int v122;  // w0
    void* v123;  // x0
    long long v124;  // x2
    unsigned long v32;  // cc_dep2
    unsigned long v33;  // cc_ndep
    unsigned long long v34;  // cc_dep1
    long long v36;  // x1
    unsigned long long v37;  // w24
    unsigned long long idx;  // x20
    unsigned long v39;  // x9
    unsigned long v40;  // x28
    unsigned long long v23;  // x23
    unsigned long v41;  // 4112
    unsigned long v42;  // cc_op
    unsigned long v43;  // cc_dep1
    unsigned long v44;  // cc_dep2
    unsigned long v45;  // 4112
    unsigned long long v46;  // 4114
    unsigned long v47;  // 4110
    unsigned long v48;  // cc_op
    unsigned long v49;  // cc_dep1
    unsigned long v50;  // 4110
    unsigned int v24;  // w8
    unsigned long long v51;  // 4111
    void* v52;  // x23
    unsigned long long i;  // x9
    unsigned long long v54;  // x8
    unsigned long long v55;  // x10
    unsigned long long v56;  // x8
    unsigned long v57;  // x8
    unsigned long v58;  // x10
    unsigned long long v59;  // x11
    unsigned long long v60;  // x0
    st_9964f8_2 **v25;  // x20
    st_9964f8_0 *v61;  // x3
    unsigned long v62;  // x8
    unsigned long v64;  // x8
    unsigned long long v66;  // w0
    unsigned long v67;  // x9
    unsigned long long v68;  // x22
    unsigned long long v69;  // x27
    unsigned long long v70;  // x21
    unsigned long long v26;  // x21
    void* v71;  // x23
    unsigned long long v72;  // x8
    st_9964f8_2 **v73;  // x9
    unsigned long long *node;  // x10
    unsigned long long j;  // x11
    unsigned long long v76;  // x11
    unsigned long v77;  // x13
    unsigned long long k;  // x8
    unsigned long long v27;  // x21
    unsigned long long v81;  // x10
    unsigned long long *iter;  // x9
    unsigned long long *v83;  // x10
    unsigned long long v84;  // x8
    unsigned long long v87;  // x8
    st_9964f8_2 **v88;  // x9
    unsigned long long *iter1;  // x10
    unsigned long long l;  // x11
    long long v28;  // x1
    unsigned long long v91;  // x11
    unsigned long v92;  // x13
    unsigned long long m;  // x8
    unsigned long long v96;  // x10
    unsigned long long *iter2;  // x9
    unsigned long long *v98;  // x10
    unsigned long long v99;  // x8
    unsigned long long v29;  // x21
    unsigned int v102;  // w8
    char *v103;  // x9
    unsigned long v104;  // x10
    unsigned long long v105;  // x1
    unsigned long long v107;  // x28
    long long v108;  // x8
    unsigned long v109;  // x23
    st_9964f8_2 **v110;  // x20
    unsigned long long v30;  // w0
    unsigned long long v111;  // x26
    __m128i v112;  // q0
    unsigned int v113;  // w8
    unsigned long v114;  // x8
    char *v115;  // x10
    unsigned long v116;  // x9
    unsigned long long v117;  // x28
    unsigned long long v118;  // x8
    unsigned long long v119;  // 4107
    unsigned long long v120;  // 4107
    unsigned long long v0;  // [bp-0x4d8]
    unsigned long long v1;  // [bp-0x4d0]
    unsigned long v2;  // [bp-0x4b8]
    __m128i v3;  // [bp-0x4b0], Other Possible Types: void*
    unsigned long long v4;  // [bp-0x4a0]
    long long v5;  // [bp-0x498], Other Possible Types: unsigned int
    uint128_t v6;  // [bp-0x490]
    uint128_t v7;  // [bp-0x480]
    unsigned long long v8;  // [bp-0x470]
    char v9;  // [bp-0x464]
    char v10;  // [bp-0x460]
    uint128_t v11;  // [bp-0x438]
    uint128_t v12;  // [bp-0x428]
    unsigned long long v13;  // [bp-0x418]
    void* v14;  // [bp-0x410]
    char v16;  // [bp-0x310]
    unsigned long long v17;  // [bp-0x170]
    unsigned long v18;  // [bp-0x70]
    char *v19;  // [bp-0x10]
    char v20;  // [bp+0x0]

    v19 = &v20;
    v5 = a3;
    v18 = *(long long *)&g_10002b0;
    if (!a2)
    {
        sub_a368c8();
        v28 = 0xbb;
        goto LABEL_9965b8;
    }
    v21 = a2;
    if (!sub_a2d030((long long)a0[4152]) || !(sub_a50c70((long long)a0[4152]) >> 31 & 1))
    {
        v22 = (long long)a0[4128];
        if (!v22)
        {
            sub_c64ee4(a0);
            goto LABEL_99689c;
        }
        v23 = sub_a2d030(v22);
        if (v5)
        {
            v24 = (int)a0[20];
            if (65276 >= (int)v24)
            {
                if (v24 - 770 < 2 || v24 == 0x100)
                    goto LABEL_9965e8;
            }
            else
            {
                if (v24 == 0xfeff || v24 == 65277)
                {
LABEL_9965e8:
                    if (sub_a4fdf4(v23) == 2 && (int)sub_a50728(v23) >= 2)
                    {
                        v25 = a1 + 40;
                        v26 = v21;
                        do
                        {
                            v27 = v26;
                            if (*(long long *)((char *)v25 - 8) != *v25)
                            {
                                sub_a368c8();
                                v28 = 219;
                                goto LABEL_9965b8;
                            }
                            else if ((int)sub_aa8658(*(long long *)a0) <= 0)
                            {
                                sub_a368c8();
                                v28 = 224;
                                goto LABEL_9965b8;
                            }
                        } while ((v25 += 9, v26 = v27 - 1, v27 != 1));
                    }
                }
            }
        }
        if (v23)
        {
            v29 = sub_9ffdd8(v23);
            v30 = (unsigned int)sub_a5062c(sub_a2d030(v22));
            if (v30)
            {
                v31 = 4;
                v32 = 1;
                v33 = 0;
                v34 = v21;
                if (v34 != 1 && !(sub_a2cf88(sub_a2d030(v22)) >> 23 & 1))
                {
                    sub_a368c8();
                    v36 = 252;
                    goto LABEL_996698;
                }
                v3 = (__m128i)a1;
                v4 = v21;
                v1 = v23;
                v37 = 0;
                idx = 0;
                v39 = v30;
                v40 = a0 + 4098;
                v2 = v39;
                if (v5)
                {
                    v41 = arm64g_calculate_condition(v31 | 16, v34, v32, v33);
                    v42 = 3;
                    v43 = (v41 & 1 ? v39 & 0xffffffff : 0x40000000);
                    v44 = v41 & 1;
                }
                else
                {
                    v45 = arm64g_calculate_condition(v31 | 16, v34, v32, v33);
                    v42 = 0;
                    v43 = (v45 & 1 ? v39 & 0xffffffff : 0x40000000);
                    v44 = v45 & 1;
                }
                v0 = v29;
                v46 = arm64g_calculate_condition(v42 | 16, v43, v44, 0);
                if (v46 & 1)
                {
                    v47 = arm64g_calculate_condition(v42 | 16, v43, v44, 0);
                    v48 = 4;
                    v49 = (v47 & 1 ? v29 : 0);
                }
                else
                {
                    v50 = arm64g_calculate_condition(v42 | 16, v43, v44, 0);
                    v48 = 0;
                    v49 = (v50 & 1 ? v29 : 0);
                }
                v51 = arm64g_calculate_condition(v48, v49, 0, 0);
            }
            else
            {
                sub_a368c8();
                sub_a369bc("ssl/record/methods/tls1_meth.c", 240, "tls1_cipher");
                v123 = a0;
                v124 = 186;
                goto LABEL_996894;
            }
        }
        else
        {
            sub_c64eb0(a0);
            goto LABEL_99689c;
        }
        while (1)
        {
            v52 = (void*)(v3 + 72 * idx);
            (&v17)[idx] = (long long)v52[8];
            if (!(sub_a2cf88(sub_a2d030(v22)) >> 21 & 1))
            {
                if (v51 & 1)
                {
                    i = (&v17)[idx];
                    v54 = v2 + -i + v2 * i / v2;
                    if (0x101 > v54)
                    {
                        v55 = i + v54;
                        if (v55 > i)
                        {
                            do
                            {
                                *(char *)((long long)v52[40] + i) = (unsigned int)v54 - 1;
                                i += 1;
                                v55 = (&v17)[idx] + v54;
                            } while (i < v55);
                        }
                        (&v17)[idx] = v55;
                        *(unsigned long long *)&v52[8] = (long long)v52[8] + v54;
                        goto LABEL_9967a4;
                    }
                    else
                    {
                        sub_a368c8();
                        v28 = 306;
                        goto LABEL_9965b8;
                    }
                }
                else
                {
LABEL_9967a4:
                    if (!v5)
                    {
                        v56 = (&v17)[idx];
                        goto LABEL_996854;
                    }
                    goto LABEL_996710;
                }
                goto LABEL_9965b8;
            }
            if ((int)a0[16])
            {
                v57 = (short)a0[48];
                v58 = *(short *)(v40 + 4);
                v59 = *(int *)v40 * 0x10000;
                *(unsigned long *)&(&v16)[13 * idx] = (v59 | v58 * 0x1000000000000) & 0xffffffffffff0000 | ((v59 | v58 * 0x1000000000000) & 0xffffffffffff00ff | (v57 * 0x100 | v57 >> 56) & 0xff00) & 0xffff | v57 >> 8;
            }
            else
            {
                *(long long *)&(&v16)[13 * idx] = (long long)a0[0x1000];
                v60 = sub_999d2c(a0);
                if (!(unsigned int)v60)
                {
                    if (*(long long *)&g_10002b0 == v18)
                        return v60;
                    ___stack_chk_fail();
                }
            }
            v61 = &(&v16)[13 * idx];
            v61->field_8 = (int)v52[4];
            v62 = (short)a0[20];
            *(unsigned short *)&(&v61->field_8)[1] = (((((v62 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v62 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v62 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v62 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
            v64 = (short)v52[8];
            *(unsigned short *)((char *)&v61->field_9 + 1) = (((((v64 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v64 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v64 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v64 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
            v66 = (unsigned int)sub_a4d5dc(v22, 22, 13, v61);
            if (v66 > 0)
            {
                v37 = v66;
                v56 = (&v17)[idx];
                if (v5)
                {
                    v67 = v37;
                    (&v17)[idx] = v56 + v67;
                    *(unsigned long *)&v52[8] = (long long)v52[8] + v67;
                    goto LABEL_996710;
                }
LABEL_996854:
                if (!v56 || v56 - v2 * v56 / v2)
                    break;
LABEL_996710:
                idx += 1;
                if (idx == v4)
                {
                    v68 = v4;
                    v69 = v1;
                    v70 = a4;
                    v71 = (void*)v3;
                    if (v68 == 1)
                    {
LABEL_9968ec:
                        if ((int)a0[16] || !(int)a0[4280])
                        {
LABEL_9968f4:
                            if (!v0)
                            {
                                v107 = sub_a50654(v22, (long long)v71[32], (long long)v71[40], v17);
                                if (!(sub_a2cf88(sub_a2d030(v22)) >> 20 & 1))
                                {
                                    v108 = a5;
                                    v109 = v2;
                                    if (v5 || !(unsigned int)v107)
                                    {
                                        if (*(long long *)&g_10002b0 == v18)
                                            return (unsigned int)v107 != 0;
                                        ___stack_chk_fail();
                                    }
                                }
                                else
                                {
                                    v108 = a5;
                                    v109 = v2;
                                    if (v5 || v107 >> 31 & 1)
                                    {
                                        if (*(long long *)&g_10002b0 == v18)
                                            return ~(unsigned int)v107 >> 31;
                                        ___stack_chk_fail();
                                    }
                                }
                                if (v37)
                                    v108 = v37;
                                v5 = v108;
                                v110 = (st_9964f8_2 **)(v3 + 32);
                                v3 = _mm_set1_epi64x(8);
                                v111 = a4;
                                while (1)
                                {
                                    if (sub_a4fdf4(v69) == 6)
                                    {
                                        v112 = _mm_add_epi64(*(int128_t *)v110, v3);
                                        goto LABEL_996be4;
                                    }
                                    else
                                    {
                                        if (sub_a4fdf4(v69) == 7)
                                        {
                                            v112 = _mm_add_epi64(*(int128_t *)v110, _mm_set1_epi64x(8));
LABEL_996be4:
                                            *(__m128i *)v110 = v112;
                                            *(long long *)((char *)v110 - 24) = *(long long *)((char *)v110 - 24) - 8;
                                            goto LABEL_996bf4;
                                        }
                                        else
                                        {
                                            if ((unsigned int)v109 != 1)
                                            {
                                                v113 = (int)a0[20];
                                                if (65276 >= (int)v113)
                                                {
                                                    if (v113 - 770 < 2 || v113 == 0x100)
                                                        goto LABEL_996cb8;
                                                }
                                                else
                                                {
                                                    if (v113 == 0xfeff || v113 == 65277)
                                                    {
LABEL_996cb8:
                                                        v114 = *(long long *)((char *)v110 - 24);
                                                        if ((unsigned long long)*(long long *)((char *)v110 - 24) < v109)
                                                            break;
                                                        v115 = &(v110[1])[v109];
                                                        *v110 = &(*v110)[v109];
                                                        v110[1] = v115;
                                                        v116 = *(long long *)((char *)v110 - 16);
                                                        *(unsigned long *)((char *)v110 - 24) = v114 - v109;
                                                        *(unsigned long *)((char *)v110 - 16) = v116 - v109;
                                                    }
                                                }
                                            }
LABEL_996bf4:
                                            if (!a4)
                                            {
                                                v117 = 0;
                                                v118 = v111 + 8;
                                                v119 = arm64g_calculate_condition(4, a4, 0, 0);
                                                if (!(v119 & 1))
                                                    goto LABEL_996c16;
                                                goto LABEL_996c15;
                                            }
                                            else
                                            {
                                                v117 = v111;
                                                v118 = v111 + 8;
                                                v120 = arm64g_calculate_condition(4, a4, 0, 0);
                                                if (v120 & 1)
                                                {
LABEL_996c15:
                                                    v121 = 0;
                                                    goto LABEL_996c18;
                                                }
                                                else
                                                {
LABEL_996c16:
                                                    v121 = v118;
LABEL_996c18:
                                                    v122 = sub_a2cf88();
                                                    v109 = v2;
                                                    v60 = sub_b5ee0c((char *)v110 - 24, *(long long *)((char *)v110 - 16), *v110, v117, v121, v109, v5, __ROL__(v122, 11) & 0xfffff801 & 1, *(long long *)a0);
                                                    if (!(unsigned int)v60)
                                                    {
                                                        if (*(long long *)&g_10002b0 == v18)
                                                            return v60;
                                                        ___stack_chk_fail();
                                                    }
                                                    else
                                                    {
                                                        v110 += 9;
                                                        v111 += 16;
                                                        v4 -= 1;
                                                        v69 = v1;
                                                        if (v4 == 1)
                                                        {
                                                            if (*(long long *)&g_10002b0 == v18)
                                                                return 1;
                                                            ___stack_chk_fail();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            else if (v68 == 1)
                            {
                                if (!sub_a4c6a0(v22, (long long)v71[32], &v9, (long long)v71[40], v17))
                                    break;
                                *(long long *)&v71[8] = v9;
                                if (v5)
                                {
                                    if (*(long long *)&g_10002b0 == v18)
                                        return 1;
                                    ___stack_chk_fail();
                                }
                                if (sub_a4fdf4(v69) == 6 || sub_a4fdf4(v69) == 7)
                                {
                                    *(__m128i *)&v71[32] = _mm_add_epi64((int128_t)v71[32], _mm_set1_epi64x(8));
                                }
                                else if ((unsigned int)v2 != 1)
                                {
                                    v102 = (int)a0[20];
                                    if (65276 >= (int)v102)
                                    {
                                        if (v102 - 770 < 2 || v102 == 0x100)
                                            goto LABEL_996e1c;
                                    }
                                    else
                                    {
                                        if (v102 == 0xfeff || v102 == 65277)
                                        {
LABEL_996e1c:
                                            v103 = (long long)v71[40];
                                            v104 = v2;
                                            *(unsigned long *)&v71[32] = (long long)v71[32] + v104;
                                            *(char **)&v71[40] = &v103[v104];
                                            *(unsigned long *)&v71[16] = (long long)v71[16] - v104;
                                        }
                                    }
                                }
                                if (!v70)
                                {
                                    if (*(long long *)&g_10002b0 == v18)
                                        return 1;
                                    ___stack_chk_fail();
                                }
                                else
                                {
                                    *(unsigned int *)(v70 + 8) = 0;
                                    v105 = v70;
                                    sub_a71bbc(sub_a718b8("tls-mac", v105, a5), v105, a5);
                                    v11 = v6;
                                    v12 = v7;
                                    v13 = v8;
                                    if (sub_a4dd70(v22, &v10))
                                    {
                                        if (*(long long *)&g_10002b0 == v18)
                                            return 1;
                                        ___stack_chk_fail();
                                    }
                                    else
                                    {
                                        sub_a368c8();
                                        v28 = 417;
                                        goto LABEL_9965b8;
                                    }
                                }
                            }
                            else
                            {
                                sub_a368c8();
                                v28 = 375;
                                goto LABEL_9965b8;
                            }
                        }
                        else
                        {
                            if (0 < (int)sub_a4d5dc(v22, 42))
                                goto LABEL_9968f4;
                            sub_a368c8();
                            v28 = 365;
                            goto LABEL_9965b8;
                        }
                    }
                    else
                    {
                        v72 = v68 & 0xfffffffffffffffe;
                        v73 = v71 + 104;
                        node = &v14 + 1;
                        j = v72;
                        do
                        {
                            v76 = j;
                            v77 = *v73;
                            *(long long *)((char *)node - 8) = *(long long *)((char *)v73 - 72);
                            *node = v77;
                            node += 2;
                            v73 += 18;
                            j = v76 - 2;
                        } while (j);
                        k = v68 - v72;
                        if (v68 != v72)
                        {
                            v81 = v68 >> 1;
                            iter = &(&v14)[2 * v81];
                            v83 = v71 + 144 * v81 + 32;
                            do
                            {
                                v84 = k;
                                *iter = *v83;
                                iter += 1;
                                k = v84 - 1;
                                v83 += 9;
                            } while (k);
                        }
                        if ((int)sub_a4d5dc(v22, 0x22, v68, &v14) >= 1)
                        {
                            v87 = v68 & 0xfffffffffffffffe;
                            v88 = v71 + 112;
                            iter1 = &v14 + 1;
                            l = v87;
                            do
                            {
                                v91 = l;
                                v92 = *v88;
                                *(long long *)((char *)iter1 - 8) = *(long long *)((char *)v88 - 72);
                                *iter1 = v92;
                                iter1 += 2;
                                v88 += 18;
                                l = v91 - 2;
                            } while (l);
                            m = v68 - v87;
                            if (v68 != v87)
                            {
                                v96 = v68 >> 1;
                                iter2 = &(&v14)[2 * v96];
                                v98 = v71 + 144 * v96 + 40;
                                do
                                {
                                    v99 = m;
                                    *iter2 = *v98;
                                    iter2 += 1;
                                    m = v99 - 1;
                                    v98 += 9;
                                } while (m);
                            }
                            if ((int)sub_a4d5dc(v22, 35, v68, &v14) >= 1 && 0 < (int)sub_a4d5dc(v22, 36, v68, &v17))
                                goto LABEL_9968ec;
                            sub_a368c8();
                            v36 = 345;
                        }
                        else
                        {
                            sub_a368c8();
                            v36 = 332;
                        }
LABEL_996698:
                        sub_a369bc("ssl/record/methods/tls1_meth.c", v36, "tls1_cipher");
                        v123 = a0;
                        v124 = 406;
LABEL_996894:
                        sub_996e84(v123, 80, v124, 0);
                        break;
                    }
                    goto LABEL_9965b8;
                }
            }
            else
            {
                sub_a368c8();
                v28 = 288;
LABEL_9965b8:
                sub_a369bc("ssl/record/methods/tls1_meth.c", v28, "tls1_cipher");
                v123 = a0;
                v124 = 786691;
                goto LABEL_996894;
            }
        }
    }
    else
    {
        sub_c64e7c(a0);
    }
LABEL_99689c:
    if (*(long long *)&g_10002b0 == v18)
        return 0;
    ___stack_chk_fail();
}
