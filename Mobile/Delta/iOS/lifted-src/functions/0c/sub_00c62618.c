/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc62618..0xc63164 (2892 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c62618_2 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
} st_c62618_2;

typedef struct st_c62618_3 {
    struct st_c62618_3 *field_0;
    struct st_c62618_3 *field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_c62618_3;

typedef struct st_c62618_1 {
    struct st_c62618_0 *field_0;
    struct st_c62618_2 *field_8;
    char padding_10[24];
    unsigned long long field_28;
    unsigned int field_30;
} st_c62618_1;

typedef struct st_c62618_8 {
    struct st_c62618_3 *field_0;
    unsigned long long field_8;
    char padding_10[16];
    struct st_c62618_5 *field_20;
    struct st_c62618_5 *field_28;
    char padding_30[8];
    struct st_c62618_5 *field_38;
} st_c62618_8;

typedef struct st_c62618_0 {
    unsigned int field_0;
    char padding_4[4];
    char field_8;
    char padding_9[41];
    char field_32;
    char padding_33[21];
    unsigned int field_48;
} st_c62618_0;

typedef struct st_c62618_5 {
    unsigned long long field_0;
} st_c62618_5;

typedef struct st_c62618_7 {
    uint128_t field_0;
    char padding_10[8];
    struct st_c62618_3 *field_18;
    unsigned long long field_20;
    char padding_28[16];
    struct st_c62618_5 *field_38;
    struct st_c62618_5 *field_40;
    char padding_48[8];
    struct st_c62618_5 *field_50;
} st_c62618_7;

typedef struct st_c62618_4 {
    unsigned long long field_0;
    char padding_8[8];
    char field_10;
    char padding_11[839];
    struct st_c62618_5 *field_358;
    char padding_360[8];
    unsigned long long field_368;
    struct st_c62618_3 *field_370;
    struct st_c62618_3 *field_378;
    unsigned long long field_380;
    struct st_c62618_3 *field_388;
    struct st_c62618_3 *field_390;
    uint128_t field_398;
    char padding_3a8[8];
    struct st_c62618_3 *field_3b0;
    unsigned long long field_3b8;
    char padding_3c0[16];
    struct st_c62618_5 *field_3d0;
    struct st_c62618_5 *field_3d8;
    char padding_3e0[8];
    struct st_c62618_5 *field_3e8;
} st_c62618_4;

typedef struct st_c62618_6 {
    char padding_0[88];
    unsigned long long field_58;
    char padding_60[4];
    unsigned int field_64;
} st_c62618_6;

extern unsigned int g_d28580[4];
extern char g_10002b0;

unsigned int sub_c62618(st_c62618_4 *a0, st_c62618_1 *a1)
{
    char v21;  // x9
    st_c62618_8 *v22;  // x23
    st_c62618_3 *v31;  // x9
    unsigned int v121;  // w8
    unsigned int v122;  // w10
    unsigned long v123;  // 4112
    unsigned long v124;  // cc_op
    unsigned long v125;  // cc_dep1
    unsigned long v126;  // cc_dep2
    unsigned long long v127;  // 4112
    unsigned long v128;  // 4112
    unsigned long long v129;  // 4112
    unsigned long long v130;  // 4112
    st_c62618_3 *v32;  // x10
    unsigned long long v131;  // 4102
    unsigned long long v132;  // 4112
    unsigned long long v133;  // 4102
    st_c62618_3 *v134;  // x9
    unsigned long v135;  // x8
    st_c62618_3 *v136;  // x10
    st_c62618_3 *v138;  // x8
    unsigned long long v33;  // x9
    st_c62618_3 *v34;  // x8
    st_c62618_3 *v35;  // x25
    unsigned long v36;  // x21
    st_c62618_3 *v37;  // x10
    st_c62618_3 *v38;  // x9
    st_c62618_3 *v39;  // x8
    unsigned long long v40;  // 4106
    st_c62618_3 *v23;  // x21
    unsigned int ptr;  // x0
    st_c62618_3 *v42;  // x9
    unsigned long long v43;  // 4106
    st_c62618_3 *v44;  // x24
    st_c62618_0 *v45;  // x25
    unsigned long long *v46;  // x21
    unsigned int v47;  // x23
    unsigned int v48;  // w26
    unsigned int v49;  // x0
    unsigned long long v50;  // x8
    unsigned int v24;  // x22
    unsigned long v51;  // x22
    unsigned long long v52;  // x27
    unsigned int v53;  // w8
    unsigned int v54;  // x21
    unsigned int v55;  // x8
    unsigned int v56;  // x9
    unsigned int v57;  // x10
    unsigned long long *v58;  // x11
    unsigned long long i;  // x12
    unsigned long long v60;  // x12
    unsigned int v25;  // x22
    unsigned long long j;  // x9
    unsigned long long *v64;  // x8
    unsigned int v65;  // x9
    unsigned int v68;  // x0
    unsigned int v69;  // w0
    unsigned int v70;  // w21
    st_c62618_3 *v26;  // x9
    unsigned long v71;  // x8
    unsigned long v72;  // x27
    unsigned long v73;  // x21
    unsigned long v74;  // x10
    unsigned long long v75;  // x26
    unsigned int v76;  // x0
    st_c62618_6 *v77;  // x25
    unsigned long v78;  // x0
    unsigned int v79;  // x21
    unsigned int v80;  // w0
    unsigned long v27;  // x8
    uint128_t v81;  // q0
    unsigned long long *v85;  // x8
    unsigned long long v86;  // d0
    uint128_t v87;  // q2
    unsigned long long v88;  // d1
    uint128_t v90;  // q2
    st_c62618_3 *v28;  // x10
    uint128_t v91;  // q2
    uint128_t v92;  // q2
    uint128_t v93;  // q2
    uint128_t v94;  // q2
    uint128_t v95;  // q2
    unsigned long v96;  // d0
    unsigned int v97;  // x26
    unsigned int v98;  // x27
    unsigned int v99;  // x21
    unsigned int v100;  // x9
    st_c62618_3 *v29;  // x8
    long long v101;  // x25
    unsigned int v102;  // x8
    unsigned int v103;  // x9
    st_c62618_6 *v104;  // x25
    unsigned int *iter;  // x8
    long long v106;  // x21
    long long v107;  // x25
    unsigned long long v108;  // 4112
    st_c62618_3 *v109;  // x8
    unsigned long v110;  // x9
    unsigned int v30;  // x28
    st_c62618_3 *v111;  // x10
    unsigned long long v112;  // x8
    st_c62618_3 *v113;  // x9
    unsigned int k;  // x22
    unsigned int v115;  // x8
    unsigned int v116;  // x26
    long long n;  // x25
    unsigned int v118;  // x9
    unsigned int *node;  // x8
    unsigned long v120;  // cc_dep1
    unsigned long long *v0;  // [bp-0x168], Other Possible Types: unsigned long
    unsigned long v1;  // [bp-0x160]
    st_c62618_6 *v2;  // [bp-0x158], Other Possible Types: unsigned long long *
    uint128_t v3;  // [bp-0x150]
    uint128_t v4;  // [bp-0x140]
    uint128_t v5;  // [bp-0x130]
    unsigned int v6;  // [bp-0x114]
    st_c62618_7 *v7;  // [bp-0x110]
    unsigned long long *v8;  // [bp-0x108]
    unsigned int v9;  // [bp-0xfc]
    st_c62618_8 *v10;  // [bp-0xf8]
    unsigned int v11;  // [bp-0xf0]
    unsigned long long *v12;  // [bp-0xe8]
    st_c62618_0 *v13;  // [bp-0xe0]
    char v14;  // [bp-0xd8]
    unsigned int v15;  // [bp-0xb8]
    unsigned int v16;  // [bp-0xac]
    unsigned long long v17;  // [bp-0xa8]
    unsigned long v18;  // [bp-0x70]
    char *v19;  // [bp-0x10]
    char v20;  // [bp+0x0]

    v19 = &v20;
    v18 = *(long long *)&g_10002b0;
    if (a1->field_0)
    {
        v21 = a1->field_0->field_0 - 1;
        if (5 <= v21 || !(23 >> (v21 & 31) & 1))
        {
            if ((a1->field_0->field_0 & 253) != 4)
            {
                if (*(long long *)&g_10002b0 == v18)
                    return 0;
                ___stack_chk_fail();
            }
            v22 = a0->padding_3a8;
            v31 = (st_c62618_3 *)a0->padding_3a8;
            v6 = a1->field_30;
            if (v31)
            {
                v27 = v31->field_10;
                if (v27)
                {
                    v32 = a0->field_390;
                    if (v32)
                        v32->field_0 = v31;
                    sub_9858b0();
                    if (!v32)
                        a0->field_388 = v31;
                    sub_985894();
                    v9 = 4;
                    goto LABEL_c6271c;
                }
                else
                {
                    v34 = a0->field_378;
                    if (v34)
                        v34->field_0 = v31;
                    sub_9858c0();
                    if (!v34)
                        a0->field_370 = v31;
                    v9 = 4;
                    goto LABEL_c62754;
                }
            }
            else
            {
                v30 = 1;
                v9 = 4;
                goto LABEL_c62770;
            }
            goto LABEL_c62770;
        }
        v9 = g_d28580[v21];
        if (sub_984644(&a0->field_10, v9) != 1)
        {
            if (*(long long *)&g_10002b0 == v18)
                return 0;
            ___stack_chk_fail();
        }
        v22 = a0->padding_3a8;
        v23 = (st_c62618_3 *)a0->padding_3a8;
        v6 = a1->field_30;
        if (v23 && v23->field_10)
        {
            v24 = *(long long *)&a1->padding_10[8];
            if (!sub_717b8(v23 + 1))
            {
                if (!v24 || !sub_717b8(v24))
                    goto LABEL_c6309c;
LABEL_c63090:
                if (!sub_9858d0(v23 + 1))
                {
LABEL_c6309c:
                    v25 = *(long long *)&a1->padding_10[16];
                    if (sub_717b8((char *)&v22->field_0[4].field_8 + 4))
                    {
                        if (v25)
                            goto LABEL_c63100;
                    }
                    else
                    {
                        if (!v25 || !sub_717b8(v25))
                            goto LABEL_c63158;
LABEL_c63100:
                        if (!sub_9858d0((char *)&v22->field_0[4].field_8 + 4))
                        {
LABEL_c63158:
                            v30 = 0;
LABEL_c62770:
                            v7 = &(&a0->field_390)[1];
                            v35 = (st_c62618_3 *)a0->padding_3a8;
                            v5 = 0xfffffffffffffff0ffffffffffffffe8;
                            v4 = 0xffffffffffffffd0ffffffffffffffc8;
                            v3 = 0xffffffffffffffe0ffffffffffffffd8;
                            v10 = v22;
                            while (1)
                            {
                                v36 = a0->field_368;
                                if (!v35)
                                    break;
                                if (v36 > v35->field_18)
                                {
                                    v43 = arm64g_calculate_condition(130, v36, 250, 0);
                                    if (v43 & 1 || v35->field_8 || v35->field_0)
                                    {
                                        if (*(long long *)&g_10002b0 == v18)
                                            return 0;
                                        ___stack_chk_fail();
                                    }
                                    ptr = sub_a6c1b4(v35, v36 + 248, "ssl/quic/quic_record_tx.c", 285);
                                    if (!ptr)
                                    {
                                        if (*(long long *)&g_10002b0 == v18)
                                            return ptr;
                                        ___stack_chk_fail();
                                    }
                                    v44 = (st_c62618_3 *)ptr;
                                    if (v22->field_0 == v35)
                                        v22->field_0 = v44;
                                    v44->field_18 = v36;
                                    if (v30 & 1)
                                        goto LABEL_c62860;
                                }
                                else
                                {
                                    v44 = v35;
                                    if (v30 & 1)
                                    {
LABEL_c62860:
                                        if (*(long long *)&a1->padding_10[8])
                                        {
                                            ptr = sub_9d34b4(v44 + 1);
                                            if (!ptr)
                                            {
                                                if (*(long long *)&g_10002b0 == v18)
                                                    return ptr;
                                                ___stack_chk_fail();
                                            }
                                        }
                                        else
                                        {
                                            sub_9d353c(v44 + 1);
                                        }
                                        if (*(long long *)&a1->padding_10[16])
                                        {
                                            ptr = sub_9d34b4((char *)&v44[4].field_8 + 4);
                                            if (!ptr)
                                            {
                                                if (*(long long *)&g_10002b0 == v18)
                                                    return ptr;
                                                ___stack_chk_fail();
                                            }
                                        }
                                        else
                                        {
                                            sub_9d353c((char *)&v44[4].field_8 + 4);
                                        }
                                    }
                                }
                                v45 = a1->field_0;
                                if (*(long long *)&a0->padding_3c0[8])
                                    (*(long long *)&a0->padding_3c0[8])();
                                v46 = &a1->field_8->field_0;
                                v47 = *(long long *)&a1->padding_10[0];
                                v12 = v46;
                                v13 = v45;
                                v11 = v47;
                                v48 = v45->field_0 & 253;
                                if (v48 == 4)
                                {
                                    v49 = 0;
                                    v50 = 7;
                                    goto LABEL_c62910;
                                }
                                else
                                {
                                    v49 = sub_985870();
                                    if (v49)
                                    {
                                        v50 = 21;
LABEL_c62910:
                                        v51 = v44->field_10;
                                        v52 = v44->field_18 - v51;
                                        if (v50 > v52)
                                        {
LABEL_c62920:
                                            v70 = 0xfffffffe;
                                            goto LABEL_c62bec;
                                        }
                                        v53 = v45->field_0;
                                        if ((char)v53 == 5)
                                            v45->field_0 = v53 & 0xfffffd05 & 0xfffffc00 | (v53 & 0xfffffd05 & 0xfffffdff | __ROL__(*(int *)(v49 + 80), 9) & 0x200) & 0x3ff;
                                        if (!v47)
                                        {
LABEL_c62be8:
                                            v70 = 0xffffffff;
LABEL_c62bec:
                                            v22 = v10;
                                            goto LABEL_c62bf0;
                                        }
                                        v8 = v46;
                                        if (v47 == 1)
                                        {
                                            v54 = 0;
                                            v55 = 0;
                                        }
                                        else
                                        {
                                            v56 = 0;
                                            v57 = 0;
                                            v55 = v47 & 0xfffffffffffffffe;
                                            v58 = v46 + 3;
                                            i = v55;
                                            do
                                            {
                                                v60 = i;
                                                v56 += *(long long *)((char *)v58 - 16);
                                                v57 += *v58;
                                                v58 += 4;
                                                i = v60 - 2;
                                            } while (i);
                                            v54 = v57 + v56;
                                            if (v47 == v55)
                                                goto LABEL_c629c0;
                                        }
                                        j = v47 - v55;
                                        v64 = &v8[2 * v55 + 1];
                                        do
                                        {
                                            v65 = j;
                                            v54 += *v64;
                                            v64 += 2;
                                            j = v65 - 1;
                                        } while (j);
LABEL_c629c0:
                                        if (!v54)
                                            goto LABEL_c62be8;
                                        if (v48 != 4)
                                        {
                                            v68 = sub_985870();
                                            if (v68)
                                                v54 += sub_985d88(*(int *)(v68 + 96)) & 0xffffffff;
                                            else
                                                v54 = 0;
                                        }
                                        *(unsigned long long *)&v45->field_48 = v54;
                                        *(unsigned long long *)v45[1].padding_4 = 0;
                                        v69 = sub_991254(v45->field_8, v45);
                                        if (!v69)
                                            goto LABEL_c62be8;
                                        if (v52 >= v54 + v69)
                                        {
                                            v71 = v45->field_0;
                                            if (((unsigned int)v71 & 253) != 4 && !sub_991508(a1->field_28, &v45->field_32, (v71 * 0x40000000000000 | v71 >> 10) & 0xffc000000000000f & 15) || (v72 = &v44[7].field_18, v15 = 0, v73 = v44->field_10, !sub_c68800(&v17, v72 + v73, v44->field_18 - v73, 0)))
                                                goto LABEL_c62be8;
                                            if (!sub_c639ec(&v17, v45->field_8, v45, &v14) || !sub_c68eb8(&v17, &v15))
                                            {
                                                sub_a6eaf8(&v17);
                                                goto LABEL_c62be8;
                                            }
                                            sub_a6eaf8(&v17);
                                            if (a0->padding_3e0)
                                                a0->padding_3e0();
                                            v74 = v44->field_10 + v15;
                                            v44->field_10 = v74;
                                            if (v48 == 4)
                                            {
                                                k = 0;
                                                v115 = 0;
                                                v2 = v8 + 3;
                                                do
                                                {
                                                    v116 = v8[1 + 2 * k];
                                                    n = v116 - v115;
                                                    if (v116 == v115)
                                                    {
                                                        v118 = k + 1;
                                                        if (v118 != v47)
                                                        {
                                                            node = &v2[2 * k];
                                                            do
                                                            {
                                                                v116 = *(long long *)node;
                                                                node += 4;
                                                                if (v116)
                                                                {
                                                                    v115 = 0;
                                                                    n = v116;
                                                                    k = v118;
                                                                    goto LABEL_c62b9c;
                                                                }
                                                            } while ((v118 += 1, v47 != v118));
                                                        }
                                                    }
LABEL_c62b9c:
                                                    _memcpy(v72 + v74, v8[2 * k] + v115, n);
                                                    v74 = v44->field_10 + n;
                                                    v44->field_10 = v74;
                                                    v115 = v116;
                                                } while (k < v47);
                                            }
                                            else
                                            {
                                                v0 = v73;
                                                v1 = v74;
                                                v75 = a1->field_28;
                                                v15 = 0;
                                                v16 = 0;
                                                v76 = sub_985870();
                                                if (!v76)
                                                {
                                                    v107 = 495;
                                                    goto LABEL_c62fac;
                                                }
                                                v77 = (st_c62618_6 *)v76;
                                                v78 = sub_985e00(*(int *)(v76 + 96));
                                                if (v78 <= (unsigned long long)*(long long *)(v76 + 88))
                                                {
                                                    v106 = 395;
                                                    v107 = 504;
                                                    v22 = v10;
                                                    goto LABEL_c62f40;
                                                }
                                                v2 = v77;
                                                v79 = *(long long *)&v77->padding_0[48];
                                                if (!v79)
                                                {
                                                    v107 = 515;
                                                    goto LABEL_c62fac;
                                                }
                                                v80 = sub_a4fbf0(v79);
                                                if ((int)v80 < 8)
                                                {
                                                    v107 = 522;
LABEL_c62fac:
                                                    v22 = v10;
                                                    v106 = 786691;
LABEL_c62f40:
                                                    sub_a368c8();
                                                    sub_a369bc("ssl/quic/quic_record_tx.c", v107, "qtx_encrypt_into_txe");
                                                    sub_a36abc(20, v106, 0);
LABEL_c62f6c:
                                                    v70 = 0xffffffff;
LABEL_c62bf0:
                                                    v44->field_10 = v51;
                                                    goto LABEL_c62bf4;
                                                }
                                                ___memcpy_chk(&v17, &v2[1].padding_0[2], v80, 16);
                                                v81 = CONCAT(v75, v75);
                                                v85 = (char *)&v17 + v80;
                                                v86 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_NarrowUn64to32x2(__dirty_unsupported_Iop_Sh64Ux2(v81, v3)));
                                                v87 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_NarrowUn64to32x2(__dirty_unsupported_Iop_Sh64Ux2(v81, v4)));
                                                v88 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_NarrowUn64to32x2(__dirty_unsupported_Iop_Sh64Ux2(v81, v5)));
                                                v90 = _INSERT(_INSERT(v87, 1, *(unsigned int *)((void*)&v87 + 4)), 2, v86);
                                                v91 = _INSERT(v90, 3, *(unsigned int *)((void*)&v86 + 4));
                                                v92 = _INSERT(v91, 4, v88);
                                                v93 = _INSERT(v92, 5, *(unsigned int *)((void*)&v88 + 4));
                                                v94 = _INSERT(v93, 6, (char)v75 * 0 | (char)(v75 >> 8));
                                                v95 = _INSERT(v94, 7, v75);
                                                v96 = __dirty_unsupported_Iop_ZeroHI64ofV128(v95 ^ *(unsigned long long *)&*(double *)((char *)v85 - 8));
                                                *(unsigned long *)((char *)v85 - 8) = v96;
                                                if (sub_a4c694(v79, 0, 0, 0, &v17, 1) != 1)
                                                {
                                                    v107 = 532;
                                                    goto LABEL_c62f34;
                                                }
                                                if (sub_a4c6a0(v79, 0, &v15, v72 + v0, v1 - v0) == 1)
                                                {
                                                    v97 = v79;
                                                    v1 = v72;
                                                    v98 = 0;
                                                    v99 = 0;
                                                    v0 = v8 + 3;
                                                }
                                                else
                                                {
                                                    v107 = 538;
                                                    goto LABEL_c62f34;
                                                }
                                                while (1)
                                                {
                                                    v100 = v8[1 + 2 * v99];
                                                    v101 = v100 - v98;
                                                    if (v100 != v98)
                                                    {
                                                        v102 = v98;
                                                        v98 = v100;
LABEL_c62e34:
                                                        if (sub_a4c6a0(v97, v1 + v44->field_10, &v15, v8[2 * v99] + v102, v101) != 1)
                                                        {
                                                            v107 = 554;
LABEL_c62f34:
                                                            v22 = v10;
                                                            v106 = 524294;
                                                            goto LABEL_c62f40;
                                                        }
                                                        v44->field_10 = v44->field_10 + v101;
                                                        v104 = v2;
                                                        if (v99 >= v47)
                                                            goto LABEL_c62e80;
                                                    }
                                                    else
                                                    {
                                                        v103 = v99 + 1;
                                                        v104 = v2;
                                                        if (v103 != v47)
                                                        {
                                                            iter = &v0[2 * v99];
                                                            do
                                                            {
                                                                v98 = *(long long *)iter;
                                                                iter += 4;
                                                                if (v98)
                                                                {
                                                                    v102 = 0;
                                                                    v101 = v98;
                                                                    v99 = v103;
                                                                    goto LABEL_c62e34;
                                                                }
                                                            } while ((v103 += 1, v104 = v2, v47 != v103));
                                                        }
LABEL_c62e80:
                                                        v22 = v10;
                                                        v106 = 524294;
                                                        if (sub_a4ca14(v97, 0, &v16) != 1)
                                                        {
                                                            v107 = 569;
                                                            goto LABEL_c62f40;
                                                        }
                                                        if (sub_a4d5dc(v97, 16, v104->field_64, v1 + v44->field_10) == 1)
                                                        {
                                                            v44->field_10 = v44->field_10 + v104->field_64;
                                                            if (!sub_990bf4(v104, &v14))
                                                                goto LABEL_c62f6c;
                                                            v104->field_58 = v104->field_58 + 1;
                                                            break;
                                                        }
                                                        else
                                                        {
                                                            v107 = 576;
                                                            goto LABEL_c62f40;
                                                        }
                                                    }
                                                }
                                            }
                                            if (!a0->field_358)
                                                return sub_c62f0c();
                                            a0->field_358();
                                        }
                                        goto LABEL_c62920;
                                    }
                                    else
                                    {
                                        v70 = 0;
                                        v22 = v10;
LABEL_c62bf4:
                                        if (a0->field_3d0)
                                            a0->field_3d0();
                                        v108 = arm64g_calculate_condition(0x11, v70, 2, 0);
                                        if (v108 & 1)
                                            goto LABEL_c62fbc;
                                        if (!(v30 & 1))
                                        {
                                            v35 = 0;
                                            v109 = v22->field_0;
                                            v30 = 1;
                                            if (v109)
                                            {
                                                v110 = v109->field_10;
                                                if (v110)
                                                {
                                                    v111 = a0->field_390;
                                                    if (v111)
                                                        v111->field_0 = v109;
                                                    v109->field_0 = 0;
                                                    v109->field_8 = v111;
                                                    a0->field_390 = v109;
                                                    if (!a0->field_388)
                                                        a0->field_388 = v109;
                                                    *(__m128i *)&v7->field_0 = _mm_add_epi64(v7->field_0, _mm_set1_epi64x(1));
                                                    v112 = 936;
                                                }
                                                else
                                                {
                                                    v113 = a0->field_378;
                                                    if (v113)
                                                        v113->field_0 = v109;
                                                    v109->field_0 = 0;
                                                    v109->field_8 = v113;
                                                    a0->field_378 = v109;
                                                    if (!a0->field_370)
                                                        a0->field_370 = v109;
                                                    v112 = 896;
                                                    v110 = 1;
                                                }
                                                v35 = 0;
                                                *(unsigned long *)((char *)a0 + v112) = *(long long *)((char *)a0 + v112) + v110;
                                                sub_985880();
                                            }
                                        }
                                        else
                                        {
                                            if (*(long long *)&g_10002b0 == v18)
                                                return 0;
                                            ___stack_chk_fail();
                                        }
                                    }
                                }
                            }
                            v35 = a0->field_370;
                            if (v35)
                            {
                                v37 = a0->field_378;
                                v38 = v35->field_0;
                                v39 = v35->field_8;
                                a0->field_370 = v38;
                                if (v37 == v35)
                                    goto LABEL_c62a4c;
                                if (v39)
                                    goto LABEL_c627cc;
                            }
                            else
                            {
                                v40 = arm64g_calculate_condition(130, v36, 250, 0);
                                if (!(v40 & 1))
                                {
                                    ptr = sub_a6bf4c(v36 + 248, "ssl/quic/quic_record_tx.c", 224);
                                    if (ptr)
                                    {
                                        v35 = (st_c62618_3 *)ptr;
                                        memset(ptr, 0, 24);
                                        *(unsigned long *)(ptr + 24) = v36;
                                        v39 = a0->field_378;
                                        if (v39)
                                            v39->field_0 = v35;
                                        v35->field_0 = 0;
                                        v35->field_8 = v39;
                                        v42 = a0->field_370;
                                        a0->field_380 = a0->field_380 + 1;
                                        if (v42 && v42 != v35)
                                        {
                                            v38 = 0;
                                        }
                                        else
                                        {
                                            v38 = 0;
                                            a0->field_370 = 0;
                                        }
                                    }
                                    else
                                    {
                                        if (*(long long *)&g_10002b0 == v18)
                                            return ptr;
                                        ___stack_chk_fail();
                                    }
                                }
                                else
                                {
                                    if (*(long long *)&g_10002b0 == v18)
                                        return 0;
                                    ___stack_chk_fail();
                                }
LABEL_c62a4c:
                                a0->field_378 = v39;
                                if (v39)
                                {
LABEL_c627cc:
                                    v39->field_0 = v38;
                                }
                            }
                            if (v38)
                                v38->field_8 = v39;
                            a0->field_380 = a0->field_380 - 1;
                            v35->field_0 = 0;
                            v35->field_8 = 0;
                            *(st_c62618_3 **)a0->padding_3a8 = v35;
                            a0->field_3b0 = 0;
                            v35->field_10 = 0;
                            v36 = a0->field_368;
LABEL_c62fbc:
                            v120 = v70;
                            if (v70 == 1)
                            {
                                a0->field_3b0 = (char *)&a0->field_3b0->field_0 + 1;
                                v121 = a1->field_0->field_0 & 253;
                                v122 = v6 & 1;
                                if ((char)a1->field_0->field_0 != 5)
                                {
                                    v123 = arm64g_calculate_condition(19, v120, 1, 0);
                                    v124 = 3;
                                    v125 = (v123 & 1 ? v121 : 0x40000000);
                                    v126 = (v123 & 1 ? 4 : 0);
                                    v127 = arm64g_calculate_condition(19, v125, v126, 0);
                                    if (!(v127 & 1))
                                        goto LABEL_c62ff6;
LABEL_c62ff5:
                                    v130 = arm64g_calculate_condition(v124 | 16, v125, v126, 0);
                                    v131 = arm64g_calculate_condition(19, (v130 & 1 ? v122 : 0x40000000), 0, 0);
                                    if (v131 & 1)
                                    {
                                        if (*(long long *)&g_10002b0 == v18)
                                            return 1;
                                        ___stack_chk_fail();
                                    }
                                }
                                else
                                {
                                    v128 = arm64g_calculate_condition(19, v120, 1, 0);
                                    v124 = 0;
                                    v125 = (v128 & 1 ? v121 : 0x40000000);
                                    v126 = (v128 & 1 ? 4 : 0);
                                    v129 = arm64g_calculate_condition(16, v125, v126, 0);
                                    if (v129 & 1)
                                        goto LABEL_c62ff5;
LABEL_c62ff6:
                                    v132 = arm64g_calculate_condition(v124 | 16, v125, v126, 0);
                                    v133 = arm64g_calculate_condition(16, (v132 & 1 ? v122 : 0x40000000), 0, 0);
                                    if (v133 & 1)
                                    {
                                        if (*(long long *)&g_10002b0 == v18)
                                            return 1;
                                        ___stack_chk_fail();
                                    }
                                }
                                v134 = v22->field_0;
                                if (v134)
                                {
                                    v135 = v134->field_10;
                                    if (v135)
                                    {
                                        v136 = a0->field_390;
                                        if (v136)
                                            v136->field_0 = v134;
                                        sub_9858b0();
                                        if (!v136)
                                            a0->field_388 = v134;
                                        *(__m128i *)&v7->field_0 = _mm_add_epi64(v7->field_0, _mm_set1_epi64x(1));
                                        *(unsigned long *)((char *)&a0->field_398 + 8) = *(long long *)((char *)&a0->field_398 + 8) + v135;
                                        sub_985880();
                                        if (*(long long *)&g_10002b0 == v18)
                                            return 1;
                                        ___stack_chk_fail();
                                    }
                                    else
                                    {
                                        v138 = a0->field_378;
                                        if (v138)
                                            v138->field_0 = v134;
                                        sub_9858c0();
                                        if (!v138)
                                            a0->field_370 = v134;
                                        a0->field_380 = a0->field_380 + 1;
                                        sub_985880();
                                        if (*(long long *)&g_10002b0 == v18)
                                            return 1;
                                        ___stack_chk_fail();
                                    }
                                }
                                else
                                {
                                    if (*(long long *)&g_10002b0 == v18)
                                        return 1;
                                    ___stack_chk_fail();
                                }
                            }
                            else
                            {
                                if (*(long long *)&g_10002b0 == v18)
                                    return 0;
                                ___stack_chk_fail();
                            }
                        }
                    }
                }
            }
            else if (v24)
            {
                goto LABEL_c63090;
            }
            v26 = v22->field_0;
            if (v26)
            {
                v27 = v26->field_10;
                if (v27)
                {
                    v28 = a0->field_390;
                    if (v28)
                        v28->field_0 = v26;
                    sub_9858b0();
                    if (!v28)
                        a0->field_388 = v26;
                    sub_985894();
LABEL_c6271c:
                    v33 = 936;
                    goto LABEL_c6275c;
                }
                else
                {
                    v29 = a0->field_378;
                    if (v29)
                        v29->field_0 = v26;
                    sub_9858c0();
                    if (!v29)
                        a0->field_370 = v26;
LABEL_c62754:
                    v27 = 1;
                    v33 = 896;
LABEL_c6275c:
                    *(unsigned long *)((char *)a0 + v33) = *(long long *)((char *)a0 + v33) + v27;
                    sub_985880();
                }
            }
            goto LABEL_c6276c;
        }
        else
        {
LABEL_c6276c:
            v30 = 1;
            goto LABEL_c62770;
        }
    }
    else
    {
        if (*(long long *)&g_10002b0 == v18)
            return 0;
        ___stack_chk_fail();
    }
}
