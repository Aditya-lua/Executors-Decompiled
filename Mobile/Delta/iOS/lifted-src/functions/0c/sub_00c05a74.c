/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc05a74..0xc06014 (1440 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c05a74_2 {
    long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
} st_c05a74_2;

typedef struct st_c05a74_0 {
    void* field_0;
    unsigned long long field_8;
    void* field_10;
    struct st_c05a74_1 *field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
    uint128_t field_38;
} st_c05a74_0;

typedef struct st_c05a74_1 {
    unsigned long long field_0;
} st_c05a74_1;


void* sub_c05a74(void* a0, st_c05a74_0 **a1, unsigned long a2)
{
    st_c05a74_0 *v13;  // x21
    unsigned long v14;  // cc_op
    unsigned long long v24;  // 4131
    unsigned long long v25;  // 4133
    unsigned long long v26;  // x12
    unsigned long long v27;  // x12
    long long v28;  // x20
    unsigned long long v29;  // x8
    __m128i v30;  // q0
    __m128i v31;  // q1
    __m128i v32;  // q0
    unsigned long v15;  // cc_dep1
    unsigned long v33;  // x9
    unsigned long v34;  // x11
    unsigned long long v35;  // x10
    unsigned long v36;  // x11
    unsigned long long v37;  // x13
    unsigned long long v38;  // x14
    unsigned long v39;  // x12
    unsigned long long v40;  // x10
    unsigned long v41;  // x10
    unsigned long v42;  // x11
    unsigned long v16;  // cc_dep2
    unsigned long long v43;  // x9
    unsigned long long v44;  // x12
    unsigned long v45;  // x10
    unsigned long v46;  // x11
    unsigned long long v47;  // x12
    unsigned long long v48;  // x9
    unsigned long v49;  // x10
    unsigned long v50;  // x11
    unsigned long long v51;  // x9
    unsigned long long v52;  // x12
    unsigned long v17;  // cc_ndep
    unsigned long v53;  // x10
    unsigned long v54;  // x11
    unsigned long long v55;  // x12
    unsigned long long v56;  // x9
    unsigned long v57;  // x10
    unsigned long v58;  // x11
    unsigned long long v59;  // x9
    unsigned long long v60;  // x12
    unsigned long v61;  // x10
    unsigned long v62;  // x11
    unsigned long long v18;  // x8
    unsigned long long v63;  // x12
    unsigned long long v64;  // x9
    unsigned long v65;  // x9
    unsigned long long v66;  // x22
    void* v67;  // x1
    unsigned long long *v68;  // x23
    unsigned long v69;  // x24
    unsigned long long v70;  // x28
    unsigned long long v71;  // x10
    unsigned long long v72;  // x10
    unsigned long v19;  // x9
    unsigned long v73;  // x11
    unsigned long long v74;  // x12
    unsigned long long v75;  // x12
    unsigned long long v76;  // x12
    unsigned long long v77;  // 4128
    unsigned long long v78;  // 4130
    unsigned long long v79;  // x13
    unsigned long long v80;  // x13
    long long *v81;  // x13
    unsigned long long v82;  // x13
    unsigned long long i;  // x10
    long long v83;  // x22
    unsigned long long v84;  // 4102
    unsigned long long v85;  // 4102
    unsigned long long v86;  // x8
    unsigned long long v87;  // x9
    unsigned long long v88;  // x10
    unsigned long long v89;  // 4128
    unsigned long long v90;  // 4130
    unsigned long long v91;  // x9
    unsigned long long v92;  // x9
    unsigned long long v21;  // x11
    unsigned long v93;  // x25
    unsigned long v94;  // x8
    unsigned long long v95;  // x8
    unsigned long long v96;  // 4135
    unsigned long long v97;  // 4137
    unsigned long long v98;  // x8
    unsigned long long v99;  // x8
    void* v100;  // x23
    void* v101;  // x24
    void* v102;  // x23
    unsigned long v22;  // x11
    st_c05a74_2 *v103;  // x8
    unsigned long long v104;  // 4110
    unsigned long long v105;  // 4102
    unsigned long long v106;  // 4110
    unsigned long long v107;  // 4102
    unsigned long long v108;  // 4102
    unsigned long long v109;  // x0
    void* v0;  // [bp-0xe8]
    char v1[16];  // [bp-0xe0]
    char v2[16];  // [bp-0xd0]
    uint128_t v3;  // [bp-0xc0]
    uint128_t v4;  // [bp-0xb0]
    unsigned long v5;  // [bp-0xa8]
    uint128_t v6;  // [bp-0xa0]
    unsigned long v7;  // [bp-0x98]
    uint128_t v8;  // [bp-0x90]
    char v9;  // [bp-0x78]
    unsigned long long v10;  // [bp-0x70]
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]

    v11 = &v12;
    v3 = *(int128_t *)a0;
    v4 = (int128_t)a0[16];
    v6 = (int128_t)a0[32];
    v8 = (int128_t)a0[48];
    v13 = *a1;
    strncpy(&v2, "uespemosarenegyl", 16);
    strncpy(&v1, "modnarodsetybdet", 16);
LABEL_c05af8:
    v18 = *(unsigned long long *)((void*)&v8 + 8);
    if (v18)
    {
        v19 = *(unsigned long long *)((void*)&v4 + 8);
        i = *(unsigned long long *)&v6;
        if (!i)
        {
            v21 = *(unsigned long long *)((void*)&v6 + 8);
            do
            {
                v22 = v21 + 8;
                v19 -= 64;
                i = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v21)) & 0x8080808080808080;
                v21 = v22;
            } while (!i);
            v7 = v22;
            v5 = v19;
        }
        v24 = ((((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
        v25 = (((((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
        v26 = ((((v25 | v24) & 0xffff0000ffff0000) >> 16 | (v25 | v24) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v25 | v24) & 0xffff0000ffff0000) >> 16 | (v25 | v24) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
        if (!v26)
            v27 = 64;
        else
            v27 = Clz(v26);
        *(unsigned long long *)&v6 = i - 1 & i;
        *(unsigned long long *)((char *)&v8 + 8) = v18 - 1;
        v28 = *(long long *)(v19 - (v27 & 120) - 8);
        do
        {
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        if ((long long)/* unsupported instruction */ >= 0)
        {
            v29 = 0;
            v30 = *(int128_t *)&(&v13->field_30)[1];
            v31 = _mm_xor_si128(v2, _mm_unpacklo_epi64(v30, v30));
            v32 = _mm_xor_si128(v1, _mm_unpackhi_epi64(v30, v30));
            v33 = v28 + 8;
            v34 = _mm_extract_epi64(v32, 1) ^ v33;
            v35 = v34 + _mm_extract_epi64(v31, 1);
            v36 = v35 ^ __ROL__(v34, 16);
            v37 = _mm_cvtsi128_si64(v31) + _mm_cvtsi128_si64(v32);
            v38 = __ROL__(v37, 32) + v36;
            v39 = v37 ^ __ROL__(_mm_cvtsi128_si64(v32), 13);
            v40 = v39 + v35;
            v41 = v40 ^ __ROL__(v39, 0x11);
            v42 = v38 ^ __ROL__(v36, 21) ^ 0x800000000000000;
            v43 = v41 + (v38 ^ v33);
            v44 = v42 + __ROL__(v40, 32);
            v45 = v43 ^ __ROL__(v41, 13);
            v46 = v44 ^ __ROL__(v42, 16);
            v47 = v44 + v45;
            v48 = v46 + __ROL__(v43, 32);
            v49 = v47 ^ __ROL__(v45, 0x11);
            v50 = v48 ^ __ROL__(v46, 21);
            v51 = (v48 ^ 0x800000000000000) + v49;
            v52 = v50 + (__ROL__(v47, 32) ^ 0xff);
            v53 = v51 ^ __ROL__(v49, 13);
            v54 = v52 ^ __ROL__(v50, 16);
            v55 = v53 + v52;
            v56 = v54 + __ROL__(v51, 32);
            v57 = v55 ^ __ROL__(v53, 0x11);
            v58 = v56 ^ __ROL__(v54, 21);
            v59 = v57 + v56;
            v60 = v58 + __ROL__(v55, 32);
            v61 = v59 ^ __ROL__(v57, 13);
            v62 = v60 ^ __ROL__(v58, 16);
            v63 = v61 + v60;
            v64 = v62 + __ROL__(v59, 32);
            v65 = (v63 ^ __ROL__(v61, 0x11)) + v64 ^ __ROL__(v63 ^ __ROL__(v61, 0x11), 13);
            v66 = __ROL__((v64 ^ __ROL__(v62, 21)) + __ROL__(v63, 32) ^ __ROL__(v64 ^ __ROL__(v62, 21), 16), 21) ^ __ROL__(v65, 0x11) ^ __ROL__(v65 + (v64 ^ __ROL__(v62, 21)) + __ROL__(v63, 32), 32) ^ v65 + (v64 ^ __ROL__(v62, 21)) + __ROL__(v63, 32);
            v67 = v13->field_10;
            v68 = v13->field_18;
            v69 = v13->field_20;
            v70 = v66 >> 57;
            v71 = v66;
            while (1)
            {
                v72 = v71 & v69;
                v73 = *(long long *)((char *)v68 + v72);
                v74 = (v73 ^ 0x101010101010101 * v70) + 0xfefefefefefefeff & ~(v73 ^ 0x101010101010101 * v70);
                v75 = v74 & 0x8080808080808080;
                if (v74 & 0x8080808080808080)
                    break;
LABEL_c05cdc:
                if (!(v73 & v73 * 2 & 0x8080808080808080))
                {
                    v29 += 8;
                    v71 = v72 + v29;
                }
                else
                {
                    v86 = v69 & v66;
                    v87 = *(long long *)((char *)v68 + v86) & 0x8080808080808080;
                    if (!(*(long long *)((char *)v68 + v86) & 0x8080808080808080))
                    {
                        v88 = 8;
                        do
                        {
                            v86 = v86 + v88 & v69;
                            v88 += 8;
                            v87 = *(long long *)((char *)v68 + v86) & 0x8080808080808080;
                        } while (!(*(long long *)((char *)v68 + v86) & 0x8080808080808080));
                    }
                    v89 = ((((((v87 & 0xaaaaaaaaaaaaaaaa) >> 1 | v87 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v87 & 0xaaaaaaaaaaaaaaaa) >> 1 | v87 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v87 & 0xaaaaaaaaaaaaaaaa) >> 1 | v87 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v87 & 0xaaaaaaaaaaaaaaaa) >> 1 | v87 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v90 = (((((((v87 & 0xaaaaaaaaaaaaaaaa) >> 1 | v87 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v87 & 0xaaaaaaaaaaaaaaaa) >> 1 | v87 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v87 & 0xaaaaaaaaaaaaaaaa) >> 1 | v87 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v87 & 0xaaaaaaaaaaaaaaaa) >> 1 | v87 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v91 = ((((v90 | v89) & 0xffff0000ffff0000) >> 16 | (v90 | v89) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v90 | v89) & 0xffff0000ffff0000) >> 16 | (v90 | v89) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v91)
                        v92 = 64;
                    else
                        v92 = Clz(v91);
                    a0 = v86 + (v92 >> 3) & v69;
                    v93 = *(char *)(v68 + a0);
                    if (v93 >> 31 & 1)
                    {
                        v94 = v13->field_28;
                        if (v94)
                            goto LABEL_c05d90;
                    }
                    else
                    {
                        v95 = *v68 & 0x8080808080808080;
                        v96 = ((((((v95 & 0xaaaaaaaaaaaaaaaa) >> 1 | v95 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v95 & 0xaaaaaaaaaaaaaaaa) >> 1 | v95 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v95 & 0xaaaaaaaaaaaaaaaa) >> 1 | v95 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v95 & 0xaaaaaaaaaaaaaaaa) >> 1 | v95 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                        v97 = (((((((v95 & 0xaaaaaaaaaaaaaaaa) >> 1 | v95 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v95 & 0xaaaaaaaaaaaaaaaa) >> 1 | v95 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v95 & 0xaaaaaaaaaaaaaaaa) >> 1 | v95 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v95 & 0xaaaaaaaaaaaaaaaa) >> 1 | v95 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                        v98 = ((((v97 | v96) & 0xffff0000ffff0000) >> 16 | (v97 | v96) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v97 | v96) & 0xffff0000ffff0000) >> 16 | (v97 | v96) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                        if (!v98)
                            v99 = 64;
                        else
                            v99 = Clz(v98);
                        a0 = v99 >> 3;
                        v93 = *(char *)(v68 + a0);
                        v94 = v13->field_28;
                        if (v94)
                            goto LABEL_c05d90;
                    }
                    if (v93 & 1)
                    {
                        v0 = v67;
                        sub_c72e14(&v13->field_18, 1);
                        v68 = v13->field_18;
                        v69 = v13->field_20;
                        a0 = sub_bd72f8(v68, v69, v66);
                        v94 = v13->field_28;
                        v67 = v0;
                    }
LABEL_c05d90:
                    v13->field_28 = v94 - (v93 & 1);
                    *(char *)(v68 + a0) = v70;
                    *((char *)v13->field_18 + (v69 & a0 - 8) + 8) = v70;
                    v13->field_30 = v13->field_30 + 1;
                    *(void* *)((char *)v13->field_18 + -0x8 * a0 - 8) = v67;
                    v100 = v13->field_0;
                    v101 = v13->field_10;
                    if (v67 == v100)
                    {
                        v102 = v13->field_28 + v13->field_30;
                        if (v67 - v101 >= v102 - v101)
                        {
                            v14 = 4;
                            v15 = v101;
                            v16 = v67;
                            v17 = 0;
                            if (v101 != v67)
                                goto LABEL_c05ae0;
                            goto LABEL_c05ad8;
                        }
                        if (v102 >= v101)
                        {
                            a0 = sub_c6c158(&v9);
                            if (v9 != 1)
                            {
                                v13->field_0 = v102;
                                v13->field_8 = v10;
                                v101 = v13->field_10;
                                v14 = 4;
                                v15 = v101;
                                v16 = v102;
                                v17 = 0;
                                if (v101 != v102)
                                    goto LABEL_c05ae0;
LABEL_c05ad8:
                                a0 = sub_c6c3c4(v13);
LABEL_c05ae0:
                                v103 = v13->field_8 + 24 * v101;
                                v103->field_0 = v28;
                                v103->field_8 = a2;
                                v103->field_10 = v66;
                                v13->field_10 = v101 + 1;
                                goto LABEL_c05af8;
                            }
                            else
                            {
                                v109 = v10;
                            }
                        }
                        else
                        {
                            v109 = 0;
                        }
                        sub_c6b970(v109);
                        __debugbreak();
                    }
                    else
                    {
                        v14 = 4;
                        v15 = v101;
                        v16 = v100;
                        v17 = 0;
                        if (v101 != v100)
                            goto LABEL_c05ae0;
                        goto LABEL_c05ad8;
                    }
                }
            }
            while (1)
            {
                v76 = v75;
                v77 = ((((((v76 & 0xaaaaaaaaaaaaaaaa) >> 1 | v76 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v76 & 0xaaaaaaaaaaaaaaaa) >> 1 | v76 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v76 & 0xaaaaaaaaaaaaaaaa) >> 1 | v76 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v76 & 0xaaaaaaaaaaaaaaaa) >> 1 | v76 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                v78 = (((((((v76 & 0xaaaaaaaaaaaaaaaa) >> 1 | v76 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v76 & 0xaaaaaaaaaaaaaaaa) >> 1 | v76 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v76 & 0xaaaaaaaaaaaaaaaa) >> 1 | v76 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v76 & 0xaaaaaaaaaaaaaaaa) >> 1 | v76 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                v79 = ((((v78 | v77) & 0xffff0000ffff0000) >> 16 | (v78 | v77) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v78 | v77) & 0xffff0000ffff0000) >> 16 | (v78 | v77) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                if (!v79)
                    v80 = 64;
                else
                    v80 = Clz(v79);
                a0 = *(long long *)((char *)&v68[-1 * (v72 + (v80 >> 3) & v69)] - 8);
                if (v67 <= a0)
                    break;
                v81 = v13->field_8 + 24 * a0;
                if (v28 != *v81)
                {
                    v82 = v76 - 1;
                    v75 = v82 & v76;
                    if (!(v82 & v76))
                        goto LABEL_c05cdc;
                }
                else
                {
                    v83 = v81[1];
                    v81[1] = a2;
                    do
                    {
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                    } while (/* unsupported instruction */ ^ 1);
                    v84 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                    if (!(v84 & 1))
                    {
                        /* unsupported instruction */;
                        a0 = sub_b86a90(v28);
                    }
                    do
                    {
                        /* unsupported instruction */;
                        v14 = 4;
                        v15 = /* unsupported instruction */;
                        v16 = 1;
                        v17 = 0;
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                    } while (/* unsupported instruction */ ^ 1);
                    v85 = arm64g_calculate_condition(20, v15, 1, 0);
                    if (!(v85 & 1))
                    {
                        /* unsupported instruction */;
                        a0 = sub_b86a90(v83);
                        goto LABEL_c05af8;
                    }
                }
            }
        }
        else
        {
            a0 = sub_c769bc();
        }
        sub_c73c94(a0);
        __debugbreak();
    }
    if (*(unsigned long long *)&v3)
    {
        v104 = arm64g_calculate_condition(v14 | 16, v15, v16, v17);
        v105 = arm64g_calculate_condition(4, (v104 & 1 ? *(unsigned long long *)((void*)&v3 + 8) : 0x40000000), 0, 0);
        if (!(v105 & 1))
            goto LABEL_c05ec0;
    }
    else
    {
        v106 = arm64g_calculate_condition(v14 | 16, v15, v16, v17);
        v107 = arm64g_calculate_condition(0, (v106 & 1 ? *(unsigned long long *)((void*)&v3 + 8) : 0x40000000), 0, 0);
        if (!(v107 & 1))
        {
LABEL_c05ec0:
            a0 = _free(*(unsigned long long *)&v4);
        }
    }
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    v108 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
    if (v108 & 1)
        return a0;
    /* unsupported instruction */;
    return sub_b86a90();
}
