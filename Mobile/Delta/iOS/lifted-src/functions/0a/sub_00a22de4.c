/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa22de4..0xa23bcc (3560 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a22de4_3 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    char field_60;
    char padding_61[31];
    uint128_t field_80;
    uint128_t field_90;
} st_a22de4_3;

typedef struct st_a22de4_2 {
    char padding_0[16];
    long long field_10;
    char padding_18[136];
    struct st_a22de4_0 *field_a0;
} st_a22de4_2;

typedef struct st_a22de4_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_a22de4_0;

typedef struct st_a22de4_7 {
    char padding_0[30];
    char field_1e;
} st_a22de4_7;

typedef struct st_a22de4_6 {
    char padding_0[31];
    char field_1f;
} st_a22de4_6;

typedef struct st_a22de4_4 {
    char padding_0[16];
    long long field_10;
    long long field_18;
    long long field_20;
} st_a22de4_4;

typedef struct st_a22de4_1 {
    char padding_0[16];
    long long field_10;
    long long field_18;
    long long field_20;
    unsigned int field_28;
} st_a22de4_1;

typedef struct st_a22de4_5 {
    char field_0;
    unsigned int field_1;
    char field_5;
    char field_6;
    char field_7;
} st_a22de4_5;

extern unsigned int g_d49000;
extern long long g_d6e170;
extern char g_10002b0;

unsigned int sub_a22de4(st_a22de4_2 *a0, st_a22de4_1 *a1, unsigned int a2, unsigned long long a3, st_a22de4_4 **a4, unsigned int *a5, long long a6)
{
    unsigned int v28;  // x20
    long long v29;  // x21
    unsigned long v38;  // x8
    uint128_t v128;  // q0
    uint128_t v129;  // q2
    long long v130;  // x25
    char *v131;  // x19
    unsigned int l;  // x21
    unsigned int v133;  // x21
    char *v134;  // x19
    unsigned int v135;  // w8
    unsigned int v136;  // w8
    unsigned int v137;  // w8
    uint128_t v39;  // q0
    unsigned int v138;  // w9
    unsigned long v139;  // x20
    uint128_t v140;  // q0
    uint128_t v141;  // q3
    uint128_t v142;  // q0
    uint128_t v143;  // q2
    uint128_t *v144;  // x0
    uint128_t v145;  // q0
    unsigned long v147;  // d0
    unsigned int v148;  // w8
    unsigned long long v42;  // d0
    uint128_t v43;  // q1
    void* v44;  // x11
    uint128_t v46;  // q1
    uint128_t v47;  // q1
    st_a22de4_1 *v30;  // x28
    unsigned int v48;  // s1
    unsigned int v49;  // w8
    unsigned int v50;  // w8
    unsigned int v51;  // w8
    unsigned int v52;  // w9
    unsigned long v53;  // x19
    uint128_t v54;  // q0
    uint128_t v55;  // q3
    uint128_t v56;  // q1
    uint128_t v57;  // q0
    unsigned long long v31;  // x27
    uint128_t v58;  // q2
    unsigned long v60;  // d2
    unsigned long long v61;  // x8
    unsigned long v62;  // x20
    unsigned long long v63;  // x19
    unsigned int v64;  // w8
    unsigned int v65;  // w8
    unsigned int v66;  // w8
    unsigned int v67;  // w9
    st_a22de4_0 *v32;  // x19
    unsigned long v68;  // x26
    uint128_t v69;  // q0
    uint128_t v70;  // q3
    unsigned long long v72;  // 4109
    unsigned int v73;  // x26
    unsigned int v74;  // x25
    unsigned int v75;  // x19
    unsigned long long v76;  // x23
    unsigned int v77;  // x0
    unsigned long long v33;  // x25
    unsigned int v78;  // x23
    long long v79;  // x27
    unsigned long long n;  // x21
    uint128_t *v81;  // x27
    unsigned int *v82;  // x25
    unsigned int v83;  // x24
    unsigned int v84;  // x28
    unsigned int v85;  // x0
    unsigned int v86;  // w22
    unsigned int idx;  // x22
    unsigned int v34;  // x0
    unsigned long long v88;  // x8
    st_a22de4_3 *v89;  // x23
    unsigned long long v90;  // x26
    unsigned int v91;  // x20
    unsigned int v92;  // x0
    unsigned int m;  // x25
    st_a22de4_4 **v94;  // x19
    unsigned long v95;  // x8
    uint128_t v96;  // q0
    long long *v35;  // x27
    uint128_t v99;  // q1
    unsigned long long v100;  // d0
    st_a22de4_5 *v102;  // x10
    uint128_t v103;  // q1
    uint128_t v104;  // q1
    unsigned int v105;  // s0
    long long v106;  // x20
    long long v107;  // x19
    unsigned long v36;  // x23
    long long v108;  // x20
    st_a22de4_6 *v109;  // x19
    unsigned int v110;  // w8
    uint128_t v111;  // q1
    uint128_t v112;  // q1
    uint128_t v113;  // q1
    long long k;  // w25
    unsigned long long v115;  // x26
    unsigned int v116;  // x8
    unsigned long long n;  // x22
    unsigned int i;  // x26
    long long v118;  // x20
    void* v119;  // x19
    unsigned int v120;  // x22
    unsigned int v121;  // w8
    unsigned int v122;  // w8
    unsigned int v123;  // w8
    unsigned int v124;  // w9
    unsigned long v125;  // x21
    uint128_t v126;  // q0
    uint128_t v127;  // q3
    unsigned long long v0;  // [bp-0x1d8]
    unsigned int v1;  // [bp-0x1d0]
    unsigned int v2;  // [bp-0x1c8]
    unsigned int v3;  // [bp-0x1c0]
    long long v4;  // [bp-0x1b8]
    unsigned int v5;  // [bp-0x1b0]
    unsigned int v6;  // [bp-0x1a4]
    st_a22de4_1 *v7;  // [bp-0x1a0]
    st_a22de4_4 **v8;  // [bp-0x198]
    unsigned int *ptr;  // [bp-0x190], Other Possible Types: long long
    unsigned int v10;  // [bp-0x188], Other Possible Types: unsigned long long
    st_a22de4_7 *v11;  // [bp-0x180], Other Possible Types: uint128_t
    unsigned long v12;  // [bp-0x170], Other Possible Types: uint128_t
    uint384_t v13;  // [bp-0x160]
    uint128_t v14;  // [bp-0x130], Other Possible Types: unsigned int
    unsigned int v15;  // [bp-0x120]
    uint128_t v16;  // [bp-0x110], Other Possible Types: unsigned int
    uint384_t v17;  // [bp-0x100]
    uint384_t v18;  // [bp-0xe0]
    uint128_t v19;  // [bp-0xd0]
    uint128_t v20;  // [bp-0xc0]
    uint128_t v21;  // [bp-0xb0]
    unsigned int v22;  // [bp-0x90]
    unsigned int v23;  // [bp-0x80]
    unsigned int v24;  // [bp-0x70]
    unsigned long v25;  // [bp-0x68]
    char *v26;  // [bp-0x10]
    char v27;  // [bp+0x0]

    v26 = &v27;
    v25 = *(long long *)&g_10002b0;
    v24 = 0;
    v22 = 0;
    v23 = 0;
    if (a3 >= 0xfffffff)
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ecp_nistz256.c", 955, "ecp_nistz256_points_mul");
        sub_a36abc(16, 0x80106, 0);
        v28 = 0;
    }
    else
    {
        v29 = a6;
        v30 = a1;
        v8 = a4;
        ptr = a5;
        v10 = a3;
        v15 = 0;
        v16 = 0;
        *(uint128_t *)((char *)&v13 + 32) = 0;
        v14 = 0;
        *(uint128_t *)&v13 = 0;
        *(uint128_t *)((char *)&v13 + 16) = 0;
        sub_9de064(a6);
        v31 = a2 != 0;
        if (a2)
        {
            v28 = sub_c4c40(a0);
            if (v28)
            {
                v32 = a0->field_a0;
                if (v32)
                {
                    v33 = v31;
                    v34 = sub_a1a56c(a0);
                    if (v34)
                    {
                        v35 = (long long *)v34;
                        sub_a22430(&v13, v32->field_10, 1);
                        if (sub_9e4320(v35[2], &v13, 4) && sub_9e4320(v35[3], (char *)&v13 + 32, 4) && sub_9e4320(v35[4], &g_d6e170, 4))
                        {
                            *(unsigned int *)&v35[5] = 1;
                            if (sub_a1afd8(a0, v28, v35, v29))
                            {
                                sub_a1a254(v35);
                                v31 = v33;
                                goto LABEL_a22f50;
                            }
                            else
                            {
                                v36 = v32->field_10;
                                sub_a1a254(v35);
                                v31 = v33;
                                if (v36)
                                    goto LABEL_a22f64;
                                goto LABEL_a22f50;
                            }
                        }
                        else
                        {
                            sub_a1a254(v35);
                        }
                    }
                    goto LABEL_a230a4;
                }
                else
                {
LABEL_a22f50:
                    if (sub_a248a0(v28))
                    {
                        v36 = &g_d49000;
LABEL_a22f64:
                        if (0x100 < (int)sub_9e46a8(a2) || !(v28 = a2, !sub_9e5c94(a2)))
                        {
                            v28 = sub_9de208(v29);
                            if (!v28)
                                goto LABEL_a23090;
                            if (sub_9e5dac(v28, a2, a0->field_10, v29))
                                goto LABEL_a22fac;
                            sub_a368c8();
                            sub_a369bc("crypto/ec/ecp_nistz256.c", 1013, "ecp_nistz256_points_mul");
                            sub_a36abc(16, 0x80003, 0);
                        }
                        else
                        {
LABEL_a22fac:
                            if ((int)sub_9e4290(v28) >= 1)
                            {
                                i = 0;
                                v12 = 0xfffffffffffffff0fffffffffffffff8;
                                v11 = 0xffffffffffffffe0ffffffffffffffe8;
                                do
                                {
                                    v38 = *(long long *)(sub_954340(v28) + i);
                                    v39 = CONCAT(v38, v38);
                                    v42 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_NarrowUn64to32x2(__dirty_unsupported_Iop_Sh64Ux2(v39, v11)));
                                    v43 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_NarrowUn64to32x2(__dirty_unsupported_Iop_Sh64Ux2(v39, v12)));
                                    v44 = (char *)&v22 + i;
                                    v46 = _INSERT(_INSERT(v43, 2, *(unsigned int *)((void*)&v43 + 4)), 4, v42);
                                    *(char *)v44 = v38;
                                    v47 = _INSERT(v46, 6, *(unsigned int *)((void*)&v42 + 4));
                                    v48 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_NarrowUn16to8x8(v47));
                                    *(char *)&v44[5] = v38 >> 40;
                                    *(char *)&v44[6] = v38 >> 48;
                                    *(char *)&v44[7] = v38 >> 56;
                                    i += 8;
                                    *(unsigned int *)&v44[1] = v48;
                                } while (i < sub_9e4290(v28) * 8);
                                if (i - 8 > 24)
                                    goto LABEL_a23190;
                            }
                            else
                            {
                                i = 0;
                            }
                            _bzero((char *)&v22 + (i & 0xffffffff), 33 - i);
LABEL_a23190:
                            v49 = (char)v22 * 2;
                            v50 = __ROL__(v49, 25) & 4261412865 & 1;
                            v51 = -v50;
                            v52 = v50 - 1 & v49 & 254 | (v49 & 254 ^ 0xff) & v51;
                            v53 = v51 & 1;
                            sub_a22430(&v13, v36, v52 - (v52 >> 1));
                            sub_a20fd0(&v15, (char *)&v13 + 32);
                            v54 = CONCAT(-v53, -v53);
                            v55 = CONCAT(v53 - 1, v53 - 1);
                            v56 = v15 & v54 ^ v55 & *(uint128_t *)((void*)&v13 + 32);
                            v57 = v16 & v54 ^ v14 & v55;
                            v58 = v56 | v57 | *(uint128_t *)&v13 | *(uint128_t *)((void*)&v13 + 16);
                            v60 = __dirty_unsupported_Iop_ZeroHI64ofV128(v58 | __dirty_unsupported_Iop_SliceV128(v58, v58, 8));
                            v61 = ((__double_as_longlong(v60) - 1 & ~__double_as_longlong(v60)) >> 63) - 1;
                            *(uint128_t *)((char *)&v13 + 32) = v56;
                            v14 = v57;
                            v15 = CONCAT(v61, v61) & 0xffffffff000000000000000000000001;
                            v16 = CONCAT(v61 & 0xfffffffe, v61);
                            v62 = v36 + 0x1000;
                            v63 = 0xffffffffffffff04;
                            v18 = v17;
                            do
                            {
                                v64 = (unsigned short)(*(short *)((char *)&v22 + ((unsigned int)v63 + 258 >> 3))) >> ((char)v63 + 2 & 7 & 31);
                                v65 = __ROL__(v64, 25) & 4261412865 & 1;
                                v66 = -v65;
                                v67 = v65 - 1 & v64 & 0xff | (v64 & 0xff ^ 0xff) & v66;
                                v68 = v66 & 1;
                                sub_a22430(&v17, v62, v67 - (v67 >> 1));
                                sub_a20fd0(&v20, &v18);
                                v69 = CONCAT(-v68, -v68);
                                v70 = CONCAT(v68 - 1, v68 - 1);
                                v18 = v20 & v69 ^ v70 & v18;
                                v19 = v21 & v69 ^ v19 & v70;
                                sub_a21a00(&v13, &v13, &v17);
                                v62 += 0x1000;
                                v72 = arm64g_calculate_condition(18, v63, 7, 0);
                                v63 += 7;
                            } while (v72 & 1);
                            goto LABEL_a2330c;
                        }
LABEL_a230a4:
                        v73 = 0;
                        goto LABEL_a230a8;
                    }
                    else
                    {
                        v74 = v10;
                        v75 = v74 + 1;
                        v76 = v75 * 8;
                        v73 = sub_a6bf4c(v76, "crypto/ec/ecp_nistz256.c", 1101);
                        if (v73 && !(v77 = sub_a6bf4c(v76, "crypto/ec/ecp_nistz256.c", 1105), !v77))
                        {
                            v79 = v77;
                            n = v74 * 8;
                            _memcpy(v73, ptr, n);
                            *(unsigned long long *)(v73 + n) = a2;
                            _memcpy(v79, v8, n);
                            v6 = 0;
                            *(unsigned long long *)(v79 + n) = v28;
                            v78 = v79;
                            v81 = &v13;
                            v82 = (unsigned int *)v73;
                            v8 = (st_a22de4_4 **)v78;
                            goto LABEL_a23334;
                        }
LABEL_a230a8:
                        v78 = 0;
                        v28 = 0;
                    }
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/ec/ecp_nistz256.c", 965, "ecp_nistz256_points_mul");
                sub_a36abc(16, 113, 0);
LABEL_a23090:
                v73 = 0;
                v78 = 0;
            }
        }
        else
        {
LABEL_a2330c:
            v75 = v10;
            if (v75)
            {
                v6 = v31;
                v73 = 0;
                v78 = 0;
                if (a2)
                    v81 = &v17;
                else
                    v81 = &v13;
                v82 = ptr;
LABEL_a23334:
                v7 = v30;
                if ((v75 * 16 | 6) > 22369621)
                {
                    v83 = 0;
                    v84 = 0;
                    v85 = 0;
                    v86 = 0;
                }
                else
                {
                    v85 = sub_a6bf4c(544 + 0x600 * v75, "crypto/ec/ecp_nistz256.c", 625);
                    if (v85)
                    {
                        v3 = v85;
                        v5 = sub_a6bf4c(v75 * 33, "crypto/ec/ecp_nistz256.c", 626);
                        if (v5)
                        {
                            v84 = sub_a6bf4c(v75 * 8, "crypto/ec/ecp_nistz256.c", 627);
                            if (v84)
                            {
                                v1 = v78;
                                v2 = v73;
                                idx = 0;
                                v88 = v3;
                                v0 = v88 & 63;
                                v4 = (v88 & 0xffffffffffffffc0) + 64;
                                v89 = v4 + 0x600 * v75;
                                v12 = 0xfffffffffffffff0fffffffffffffff8;
                                v11 = 0xffffffffffffffe0ffffffffffffffe8;
                                v90 = v5;
                                ptr = v82;
                                v10 = v75;
                                do
                                {
                                    if (0x100 < (int)sub_9e46a8(*(long long *)&v82[2 * idx]) || sub_9e5c94(*(long long *)&v82[2 * idx]))
                                    {
                                        v92 = sub_9de208(v29);
                                        if (!v92)
                                            goto LABEL_a23a2c;
                                        v91 = v92;
                                        if (!sub_9e5dac())
                                        {
                                            v108 = 643;
                                            v107 = 524291;
LABEL_a23a00:
                                            sub_a368c8();
                                            sub_a369bc("crypto/ec/ecp_nistz256.c", v108, "ecp_nistz256_windowed_mul");
                                            sub_a36abc(16, v107, 0);
LABEL_a23a2c:
                                            v73 = v2;
                                            v85 = v3;
                                            v78 = v1;
                                            goto LABEL_a23a38;
                                        }
                                    }
                                    else
                                    {
                                        v91 = *(long long *)&v82[2 * idx];
                                    }
                                    *(unsigned long long *)(v84 + idx * 8) = v91;
                                    if ((int)sub_9e4290(v91) >= 1)
                                    {
                                        m = 0;
                                        v94 = v8;
                                        do
                                        {
                                            v95 = *(long long *)(sub_954340(v91) + m);
                                            v96 = CONCAT(v95, v95);
                                            v99 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_NarrowUn64to32x2(__dirty_unsupported_Iop_Sh64Ux2(v96, v12)));
                                            v100 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_NarrowUn64to32x2(__dirty_unsupported_Iop_Sh64Ux2(v96, v11)));
                                            v102 = v90 + m;
                                            v103 = _INSERT(_INSERT(v99, 2, *(unsigned int *)((void*)&v99 + 4)), 4, v100);
                                            v104 = _INSERT(v103, 6, *(unsigned int *)((void*)&v100 + 4));
                                            v102->field_0 = v95;
                                            *((char *)&v102->field_1 + 1) = v95 >> 40;
                                            *((char *)&v102->field_1 + 2) = v95 >> 48;
                                            v105 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_NarrowUn16to8x8(v104));
                                            *((char *)&v102->field_1 + 3) = v95 >> 56;
                                            m += 8;
                                            v91 = *(long long *)(v84 + idx * 8);
                                            *(unsigned int *)&(&v102->field_0)[1] = v105;
                                        } while (m < sub_9e4290(v91) * 8);
                                        if (m - 8 > 24)
                                            goto LABEL_a23520;
                                    }
                                    else
                                    {
                                        m = 0;
                                        v94 = v8;
                                    }
                                    _bzero(v5 + idx * 33 + (m & 0xffffffff), 33 - m);
LABEL_a23520:
                                    if (!sub_9e42c8(v89, v94[idx]->field_10, 4) || !sub_9e42c8(v89 | 32, v94[idx]->field_18, 4) || !sub_9e42c8(&v89->field_40, v94[idx]->field_20, 4))
                                    {
                                        v107 = 146;
                                        v108 = 671;
                                        goto LABEL_a23a00;
                                    }
                                    v106 = v4 + 0x600 * idx;
                                    sub_a221d0(v106, v89, 1);
                                    sub_a214c0(&v89->field_60, v89);
                                    sub_a221d0(v106, &v89->field_60, 2);
                                    sub_a216a0(&v89[1].field_20, &v89->field_60, v89);
                                    sub_a221d0(v106, &v89[1].field_20, 3);
                                    sub_a214c0(&v89->field_60, &v89->field_60);
                                    sub_a221d0(v106, &v89->field_60, 4);
                                    sub_a214c0(&v89[1].field_20, &v89[1].field_20);
                                    sub_a221d0(v106, &v89[1].field_20, 6);
                                    sub_a216a0(&v89[1].field_80, &v89->field_60, v89);
                                    sub_a221d0(v106, &v89[1].field_80, 5);
                                    sub_a216a0(&v89[2].field_40, &v89[1].field_20, v89);
                                    sub_a221d0(v106, &v89[2].field_40, 7);
                                    sub_a214c0(&v89->field_60, &v89->field_60);
                                    sub_a221d0(v106, &v89->field_60, 8);
                                    sub_a214c0(&v89[1].field_20, &v89[1].field_20);
                                    sub_a221d0(v106, &v89[1].field_20, 12);
                                    sub_a214c0(&v89[1].field_80, &v89[1].field_80);
                                    sub_a221d0(v106, &v89[1].field_80, 10);
                                    sub_a214c0(&v89[2].field_40, &v89[2].field_40);
                                    sub_a221d0(v106, &v89[2].field_40, 14);
                                    sub_a216a0(&v89[1].field_20, &v89[1].field_20, v89);
                                    sub_a221d0(v106, &v89[1].field_20, 13);
                                    sub_a216a0(&v89[1].field_80, &v89[1].field_80, v89);
                                    sub_a221d0(v106, &v89[1].field_80, 11);
                                    sub_a216a0(&v89[2].field_40, &v89[2].field_40, v89);
                                    sub_a221d0(v106, &v89[2].field_40, 15);
                                    sub_a216a0(&v89[1].field_20, &v89->field_60, v89);
                                    sub_a221d0(v106, &v89[1].field_20, 9);
                                    sub_a214c0(&v89->field_60, &v89->field_60);
                                    sub_a221d0(v106, &v89->field_60, 16);
                                    idx += 1;
                                    v90 += 33;
                                    v82 = ptr;
                                } while (idx != v10);
                                ptr = v29;
                                v109 = (st_a22de4_6 *)v5;
                                v110 = v109->field_1f;
                                sub_a222a0(v89, v4, (v110 >> 6) - (v110 >> 7));
                                v111 = v89->field_30;
                                v81[2] = v89->field_20;
                                v81[3] = v111;
                                v112 = v89->field_50;
                                v81[4] = v89->field_40;
                                v81[5] = v112;
                                v113 = v89->field_10;
                                v12 = v3 - v0 + 64;
                                v11 = &v109->padding_0[1];
                                k = 0xff;
                                v115 = 254;
                                *v81 = v89->field_0;
                                v81[1] = v113;
                                do
                                {
                                    v116 = k == 0xff;
                                    n = v10 - v116;
                                    if (v10 > v116)
                                    {
                                        v118 = v12 + v116 * 0x600;
                                        v119 = &v11->padding_0[(v115 >> 3) + (v116 | v116 * 32)];
                                        do
                                        {
                                            v120 = n;
                                            v121 = (unsigned short)(*(short *)((char *)v119 - 1)) >> ((char)(k - 1) & 7 & 31);
                                            v122 = __ROL__(v121, 27) & 4160749569 & 1;
                                            v123 = -v122;
                                            v124 = v122 - 1 & v121 & 63 | (v121 & 63 ^ 63) & v123;
                                            v125 = v123 & 1;
                                            sub_a222a0(v89, v118, v124 - (v124 >> 1));
                                            sub_a20fd0(&v89->field_80, v89 | 32);
                                            v126 = CONCAT(-v125, -v125);
                                            v127 = CONCAT(v125 - 1, v125 - 1);
                                            v128 = v89->field_90 & v126;
                                            v129 = v89->field_30 & v127;
                                            v89->field_20 = v89->field_80 & v126 ^ v127 & v89->field_20;
                                            v89->field_30 = v128 ^ v129;
                                            sub_a216a0(v81, v81, v89);
                                            v118 += 0x600;
                                            v119 += 33;
                                            n = v120 - 1;
                                        } while (n);
                                    }
                                    k -= 5;
                                    sub_a214c0(v81, v81);
                                    sub_a214c0(v81, v81);
                                    sub_a214c0(v81, v81);
                                    sub_a214c0(v81, v81);
                                    sub_a214c0(v81, v81);
                                    v115 -= 5;
                                } while (k > 4);
                                v130 = v4;
                                v83 = v5;
                                v131 = (char *)v83;
                                l = v10;
                                do
                                {
                                    v133 = l;
                                    v134 = v131 + 33;
                                    v135 = *v131 * 2;
                                    v136 = __ROL__(v135, 27) & 4160749569 & 1;
                                    v137 = -v136;
                                    v138 = v136 - 1 & v135 & 62 | (v135 & 62 ^ 63) & v137;
                                    v139 = v137 & 1;
                                    sub_a222a0(v89, v130, v138 - (v138 >> 1));
                                    sub_a20fd0(&v89->field_80, v89 | 32);
                                    v140 = CONCAT(-v139, -v139);
                                    v141 = CONCAT(v139 - 1, v139 - 1);
                                    v142 = v89->field_90 & v140;
                                    v143 = v89->field_30 & v141;
                                    v89->field_20 = v89->field_80 & v140 ^ v141 & v89->field_20;
                                    v89->field_30 = v142 ^ v143;
                                    sub_a216a0(v81, v81, v89);
                                    v130 += 0x600;
                                    v86 = 1;
                                    l = v133 - 1;
                                    v131 = v134;
                                } while (l);
                                v73 = v2;
                                v85 = v3;
                                v29 = ptr;
                                v78 = v1;
                            }
                            else
                            {
                                v85 = v3;
                                v86 = 0;
LABEL_a23a38:
                                v83 = v5;
                            }
                        }
                        else
                        {
                            v83 = 0;
                            v84 = 0;
                            v86 = 0;
                            v85 = v3;
                        }
                    }
                    else
                    {
                        v83 = 0;
                        v84 = 0;
                        v86 = 0;
                    }
                }
                sub_a6c2e4(v85, "crypto/ec/ecp_nistz256.c", 769);
                sub_a6c2e4(v83, "crypto/ec/ecp_nistz256.c", 770);
                sub_a6c2e4(v84, "crypto/ec/ecp_nistz256.c", 0x303);
                if ((v6 & v86) == 1)
                {
                    sub_a216a0(&v13, &v13, v81);
                    v30 = v7;
                    goto LABEL_a23aa0;
                }
                else
                {
                    v30 = v7;
                    if (!v86)
                        goto LABEL_a23b44;
                    goto LABEL_a23aa0;
                }
            }
            else
            {
                v78 = 0;
                v73 = 0;
LABEL_a23aa0:
                if (sub_9e4320(v30->field_10, &v13, 4) && sub_9e4320(v30->field_18, (char *)&v13 + 32, 4) && sub_9e4320(v30->field_20, &v15, 4))
                {
                    v144 = sub_954340(v30->field_20);
                    if (sub_9e4290(v30->field_20) == 4)
                    {
                        v145 = 0xffffffff000000000000000000000001 ^ *v144 | 0xfffffffeffffffffffffffff ^ v144[1];
                        v147 = __dirty_unsupported_Iop_ZeroHI64ofV128(v145 | __dirty_unsupported_Iop_SliceV128(v145, v145, 8));
                        v148 = (__double_as_longlong(v147) - 1 & ~__double_as_longlong(v147)) >> 63;
                    }
                    else
                    {
                        v148 = 0;
                    }
                    v30->field_28 = v148;
                    v28 = 1;
                }
                else
                {
LABEL_a23b44:
                    v28 = 0;
                }
            }
        }
        sub_9de17c(v29);
        sub_a6c2e4(v78, "crypto/ec/ecp_nistz256.c", 1141);
        sub_a6c2e4(v73, "crypto/ec/ecp_nistz256.c", 1142);
    }
    if (*(long long *)&g_10002b0 == v25)
        return v28;
    ___stack_chk_fail();
}
