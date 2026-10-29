/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc6d288..0xc6d67c (1012 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c6d288_0 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_c6d288_0;

typedef struct st_c6d288_1 {
    void* field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_c6d288_1;

typedef struct st_c6d288_2 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    unsigned long long field_30;
} st_c6d288_2;

extern long long g_efbad0;

unsigned long long sub_c6d288(st_c6d288_1 *a0, unsigned long long *a1)
{
    unsigned long v4;  // x21
    unsigned long long v5;  // x8
    void* v14;  // x19
    unsigned long long v15;  // 4116
    st_c6d288_1 *v16;  // x25
    unsigned long long ptr;  // x0
    unsigned long long v18;  // x9
    st_c6d288_1 *v19;  // x8
    void* v20;  // x10
    unsigned long v21;  // d0
    unsigned long long v22;  // x13
    unsigned long v23;  // x11
    unsigned long long v6;  // 4167
    unsigned long v24;  // x15
    unsigned long long v25;  // x12
    unsigned long long v26;  // x16
    unsigned long v27;  // x15
    void* v28;  // x0
    unsigned long i;  // x1
    void* v30;  // x0
    unsigned long v32;  // x13
    unsigned long long v33;  // 4128
    unsigned long long v7;  // x9
    unsigned long long v34;  // 4130
    unsigned long long v35;  // x2
    unsigned long long v36;  // x2
    unsigned long long v37;  // x2
    unsigned long long v38;  // x3
    unsigned long v39;  // x4
    unsigned long long v40;  // x5
    unsigned long v41;  // x4
    unsigned long long v42;  // x5
    unsigned long long v43;  // x6
    unsigned long long v8;  // x10
    unsigned long v44;  // x7
    unsigned long v45;  // x4
    unsigned long long v46;  // x3
    unsigned long long v47;  // x5
    unsigned long v48;  // x6
    unsigned long v49;  // x4
    unsigned long long v50;  // x5
    unsigned long long v51;  // x3
    unsigned long v52;  // x6
    unsigned long v53;  // x4
    unsigned long long v9;  // x23
    unsigned long long v54;  // x3
    unsigned long long v55;  // x5
    unsigned long v56;  // x6
    unsigned long v57;  // x4
    unsigned long long v58;  // x5
    unsigned long long v59;  // x3
    unsigned long v60;  // x3
    unsigned long long v61;  // x3
    unsigned long long v62;  // x4
    unsigned long v63;  // d0
    unsigned long long v10;  // x8
    unsigned long long j;  // x6
    unsigned long long v65;  // x5
    unsigned long long v67;  // 4128
    unsigned long long v68;  // 4130
    unsigned long long v69;  // x5
    unsigned long long v70;  // x5
    unsigned long long v71;  // x4
    unsigned long v73;  // x4
    unsigned long long v11;  // x8
    unsigned long long v74;  // 4137
    unsigned long long v75;  // 4139
    unsigned long long v76;  // x4
    unsigned long long v77;  // x4
    char v78;  // x3
    st_c6d288_2 *v79;  // x2
    void* v80;  // x3
    uint128_t v81;  // q0
    uint128_t v82;  // q1
    uint128_t v83;  // q2
    unsigned long long v12;  // x22
    void* v84;  // x9
    unsigned long long v85;  // x10
    unsigned long long v86;  // x8
    unsigned long long v87;  // 4119
    unsigned long long v13;  // x20
    unsigned long long *v0;  // [bp-0x60]
    st_c6d288_0 **v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = a1;
    v1 = &v0;
    v4 = a0->field_18;
    v5 = v4 + 1;
    v6 = arm64g_calculate_condition(0x22, v4, 1, 0);
    if (!(v6 & 1))
    {
        v7 = a0->field_8;
        v8 = (v7 + 1 >> 3) * 7;
        if (v7 >= 8)
            v7 = v8;
        if (v5 <= v7 >> 1)
        {
            sub_b85e90();
            return 9223372036854775809;
        }
        if (v7 + 1 > v5)
            v5 = v7 + 1;
        if (15 > v5)
        {
            if (v5 < 4)
                v9 = 4;
            else
                v9 = (v5 & 8) + 8;
            goto LABEL_c6d384;
        }
        if (v5 <= 0x1fffffffffffffff)
        {
            v10 = v5 * 8 / 7 - 1;
            if (!v10)
                v11 = 64;
            else
                v11 = (char)Clz(v10);
            v9 = (0xffffffffffffffff >> (v11 & 63)) + 1;
LABEL_c6d384:
            if (v9 * 56 <= 0xffffffffffffffff && !(v12 = v9 * 56, v13 = v9 + 8, v14 = v12 + v13, v15 = arm64g_calculate_condition(0x22, v12, v13, 0), v15 & 1 || 0x7ffffffffffffff8 < v14))
            {
                v16 = a0;
                ptr = _malloc(v14);
                if (!ptr)
                    sub_c6ba70(8, v14);
                v14 = ptr + v12;
                v12 = v9 - 1;
                if (v9 < 9)
                    v9 = v12;
                else
                    v9 = (v9 >> 3) * 7;
                _memset();
                if (!v4)
                    goto LABEL_c6d630;
                v18 = 0;
                v19 = v16;
                v20 = v16->field_0;
                v21 = __dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), *(unsigned long long *)&*(double *)v20));
                v22 = __double_as_longlong(v21) & 0x8080808080808080;
                v23 = *a1;
                v24 = a1[1] ^ 7237128888997146477;
                v25 = a1[1] ^ 8387220255154660723;
                v26 = v24 + (v23 ^ 8317987319222330741);
                v27 = v26 ^ __ROL__(v24, 13);
                v28 = v20;
                i = v4;
                do
                {
                    v30 = v28;
                    if (!v22)
                    {
                        do
                        {
                            v30 = v28 + 8;
                            v32 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)__double_as_longlong((double)v28[8])));
                            v18 += 8;
                            v22 = v32 & 0x8080808080808080;
                            v28 = v30;
                        } while (!(v32 & 0x8080808080808080));
                    }
                    v28 = v30;
                    v33 = ((((((v22 & 0xaaaaaaaaaaaaaaaa) >> 1 | v22 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v22 & 0xaaaaaaaaaaaaaaaa) >> 1 | v22 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v22 & 0xaaaaaaaaaaaaaaaa) >> 1 | v22 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v22 & 0xaaaaaaaaaaaaaaaa) >> 1 | v22 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v34 = (((((((v22 & 0xaaaaaaaaaaaaaaaa) >> 1 | v22 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v22 & 0xaaaaaaaaaaaaaaaa) >> 1 | v22 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v22 & 0xaaaaaaaaaaaaaaaa) >> 1 | v22 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v22 & 0xaaaaaaaaaaaaaaaa) >> 1 | v22 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v35 = ((((v34 | v33) & 0xffff0000ffff0000) >> 16 | (v34 | v33) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v34 | v33) & 0xffff0000ffff0000) >> 16 | (v34 | v33) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v35)
                        v36 = 64;
                    else
                        v36 = Clz(v35);
                    v37 = v18 + (v36 >> 3);
                    v38 = *(int *)((char *)v20 + -(56 * v37) - 56) | 0x400000000000000;
                    v39 = v38 ^ v25;
                    v40 = v39 + (v23 ^ 7816392313619706465);
                    v41 = v40 ^ __ROL__(v39, 16);
                    v42 = v40 + v27;
                    v43 = v41 + __ROL__(v26, 32);
                    v44 = v42 ^ __ROL__(v27, 0x11);
                    v45 = v43 ^ __ROL__(v41, 21);
                    v46 = (v43 ^ v38) + v44;
                    v47 = v45 + (__ROL__(v42, 32) ^ 0xff);
                    v48 = v46 ^ __ROL__(v44, 13);
                    v49 = v47 ^ __ROL__(v45, 16);
                    v50 = v48 + v47;
                    v51 = v49 + __ROL__(v46, 32);
                    v52 = v50 ^ __ROL__(v48, 0x11);
                    v53 = v51 ^ __ROL__(v49, 21);
                    v54 = v52 + v51;
                    v55 = v53 + __ROL__(v50, 32);
                    v56 = v54 ^ __ROL__(v52, 13);
                    v57 = v55 ^ __ROL__(v53, 16);
                    v58 = v56 + v55;
                    v59 = v57 + __ROL__(v54, 32);
                    v60 = (v58 ^ __ROL__(v56, 0x11)) + v59 ^ __ROL__(v58 ^ __ROL__(v56, 0x11), 13);
                    v61 = __ROL__((v59 ^ __ROL__(v57, 21)) + __ROL__(v58, 32) ^ __ROL__(v59 ^ __ROL__(v57, 21), 16), 21) ^ __ROL__(v60, 0x11) ^ __ROL__(v60 + (v59 ^ __ROL__(v57, 21)) + __ROL__(v58, 32), 32) ^ v60 + (v59 ^ __ROL__(v57, 21)) + __ROL__(v58, 32);
                    v62 = v12 & v61;
                    v63 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(long long *)((char *)v14 + v62)));
                    j = __double_as_longlong(v63);
                    if (!j)
                    {
                        v65 = 8;
                        do
                        {
                            v62 = v62 + v65 & v12;
                            j = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)(unsigned long long)*(long long *)((char *)v14 + v62)));
                            v65 += 8;
                        } while (!j);
                    }
                    v67 = ((((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v68 = (((((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v69 = ((((v68 | v67) & 0xffff0000ffff0000) >> 16 | (v68 | v67) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v68 | v67) & 0xffff0000ffff0000) >> 16 | (v68 | v67) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v69)
                        v70 = 64;
                    else
                        v70 = Clz(v69);
                    v71 = v62 + (v70 >> 3) & v12;
                    if (*((char *)v14 + v71) >= 0)
                    {
                        v73 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v14));
                        v74 = ((((((v73 & 0xaaaaaaaaaaaaaaaa) >> 1 | v73 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v73 & 0xaaaaaaaaaaaaaaaa) >> 1 | v73 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v73 & 0xaaaaaaaaaaaaaaaa) >> 1 | v73 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v73 & 0xaaaaaaaaaaaaaaaa) >> 1 | v73 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                        v75 = (((((((v73 & 0xaaaaaaaaaaaaaaaa) >> 1 | v73 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v73 & 0xaaaaaaaaaaaaaaaa) >> 1 | v73 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v73 & 0xaaaaaaaaaaaaaaaa) >> 1 | v73 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v73 & 0xaaaaaaaaaaaaaaaa) >> 1 | v73 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                        v76 = ((((v75 | v74) & 0xffff0000ffff0000) >> 16 | (v75 | v74) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v75 | v74) & 0xffff0000ffff0000) >> 16 | (v75 | v74) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                        if (!v76)
                            v77 = 64;
                        else
                            v77 = Clz(v76);
                        v71 = v77 >> 3;
                    }
                    v22 &= v22 - 1;
                    v78 = v61 >> 57;
                    *((char *)v14 + v71) = v78;
                    *((char *)v14 + (v71 - 8 & v12) + 8) = v78;
                    v79 = v20 + 56 * ~v37;
                    v80 = v14 + 56 * ~v71;
                    v81 = v79->field_0;
                    v82 = v79->field_10;
                    v83 = v79->field_20;
                    *(unsigned long long *)&v80[48] = v79->field_30;
                    *(uint128_t *)&v80[16] = v82;
                    *(uint128_t *)&v80[32] = v83;
                    *(uint128_t *)v80 = v81;
                    i -= 1;
                } while (i);
                goto LABEL_c6d634;
            }
        }
    }
    sub_c73b38("Hash table capacity overflow", 57, &g_efbad0);
LABEL_c6d630:
    v19 = v16;
LABEL_c6d634:
    v84 = v19->field_0;
    v85 = v19->field_8;
    v19->field_0 = v14;
    v19->field_8 = v12;
    v19->field_10 = v9 - v4;
    v19->field_18 = v4;
    if (!v85)
        return 9223372036854775809;
    v86 = 63 + 56 * v85 & 0xfffffffffffffff8;
    v87 = arm64g_calculate_condition(2, v85 + v86, 9, 0);
    if (!(v87 & 1))
    {
        _free(v84 - v86);
        return 9223372036854775809;
    }
    return 9223372036854775809;
}
