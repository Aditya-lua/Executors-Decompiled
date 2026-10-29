/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc6df10..0xc6e2f4 (996 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c6df10_0 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_c6df10_0;

typedef struct st_c6df10_1 {
    void* field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_c6df10_1;

extern long long g_efbad0;

unsigned long long sub_c6df10(st_c6df10_1 *a0, unsigned long long *a1)
{
    unsigned long v4;  // x21
    unsigned long long v5;  // x8
    unsigned long long v14;  // x8
    unsigned long long v15;  // x8
    unsigned long long v16;  // x8
    unsigned long long v17;  // x20
    unsigned long long v18;  // 4121
    st_c6df10_1 *v19;  // x25
    unsigned long long ptr;  // x0
    unsigned long long v21;  // x9
    st_c6df10_1 *v22;  // x8
    void* v23;  // x10
    unsigned long long v6;  // 4167
    unsigned long v24;  // d0
    unsigned long long v25;  // x12
    unsigned long v26;  // x15
    unsigned long long v27;  // x17
    unsigned long v28;  // x11
    unsigned long v29;  // x13
    unsigned long long v30;  // x14
    void* v31;  // x17
    unsigned long i;  // x0
    void* v33;  // x17
    unsigned long long v7;  // x9
    unsigned long v35;  // x12
    unsigned long long v36;  // 4128
    unsigned long long v37;  // 4130
    unsigned long long v38;  // x1
    unsigned long long v39;  // x1
    unsigned long long v40;  // x1
    unsigned long long v41;  // x2
    unsigned long v42;  // x3
    unsigned long long v43;  // x4
    unsigned long long v8;  // x10
    unsigned long v44;  // x3
    unsigned long long v45;  // x4
    unsigned long long v46;  // x5
    unsigned long v47;  // x6
    unsigned long v48;  // x3
    unsigned long long v49;  // x2
    unsigned long long v50;  // x4
    unsigned long v51;  // x5
    unsigned long v52;  // x3
    unsigned long long v53;  // x4
    unsigned long long v9;  // x23
    unsigned long long v54;  // x2
    unsigned long v55;  // x5
    unsigned long v56;  // x3
    unsigned long long v57;  // x2
    unsigned long long v58;  // x4
    unsigned long v59;  // x5
    unsigned long v60;  // x3
    unsigned long long v61;  // x4
    unsigned long long v62;  // x2
    unsigned long v63;  // x2
    unsigned long long v10;  // x22
    unsigned long long v64;  // x2
    unsigned long long v65;  // x3
    unsigned long v66;  // d0
    unsigned long long j;  // x5
    unsigned long long v68;  // x4
    unsigned long long v70;  // 4128
    unsigned long long v71;  // 4130
    unsigned long long v72;  // x4
    unsigned long long v73;  // x4
    unsigned long long v11;  // x20
    unsigned long long v74;  // x3
    unsigned long v76;  // x3
    unsigned long long v77;  // 4137
    unsigned long long v78;  // 4139
    unsigned long long v79;  // x3
    unsigned long long v80;  // x3
    char v81;  // x2
    void* v82;  // x9
    unsigned long long v83;  // x10
    void* v12;  // x19
    unsigned long long v84;  // x8
    unsigned long long v85;  // 4118
    unsigned long long v13;  // 4118
    unsigned long long *v0;  // [bp-0x60]
    st_c6df10_0 **v1;  // [bp-0x58]
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
            v10 = v9 * 4 + 7 & 0xfffffffffffffff8;
            v11 = v9 + 8;
            v12 = v10 + v11;
            v13 = arm64g_calculate_condition(50, v10, v11, 0);
            if (v13 & 1)
                goto LABEL_c6e044;
        }
        else if (v5 <= 0x1fffffffffffffff)
        {
            v14 = v5 * 8 / 7 - 1;
            if (!v14)
                v15 = 64;
            else
                v15 = (char)Clz(v14);
            v16 = 0xffffffffffffffff >> (v15 & 63);
            if (0x3ffffffffffffffe >= v16)
            {
                v9 = v16 + 1;
                v10 = v9 * 4 + 7 & 0xfffffffffffffff8;
                v17 = v9 + 8;
                v12 = v10 + v17;
                v18 = arm64g_calculate_condition(0x22, v10, v17, 0);
                if (!(v18 & 1))
                {
LABEL_c6e044:
                    if (0x7ffffffffffffff8 >= v12)
                    {
                        v19 = a0;
                        ptr = _malloc(v12);
                        if (!ptr)
                            sub_c6ba70(8, v12);
                        v12 = ptr + v10;
                        v10 = v9 - 1;
                        if (v9 < 9)
                            v9 = v10;
                        else
                            v9 = (v9 >> 3) * 7;
                        _memset();
                        if (v4)
                        {
                            v21 = 0;
                            v22 = v19;
                            v23 = v19->field_0;
                            v24 = __dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), *(unsigned long long *)&*(double *)v23));
                            v25 = __double_as_longlong(v24) & 0x8080808080808080;
                            v26 = a1[1] ^ 7237128888997146477;
                            v27 = v26 + (*a1 ^ 8317987319222330741);
                            v28 = v27 ^ __ROL__(v26, 13);
                            v29 = *a1 ^ 7816392313619706465;
                            v30 = a1[1] ^ 8387220255154660723;
                            v31 = v23;
                            i = v4;
                            do
                            {
                                v33 = v31;
                                if (!v25)
                                {
                                    do
                                    {
                                        v33 = v31 + 8;
                                        v35 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)__double_as_longlong((double)v31[8])));
                                        v21 += 8;
                                        v25 = v35 & 0x8080808080808080;
                                        v31 = v33;
                                    } while (!(v35 & 0x8080808080808080));
                                }
                                v31 = v33;
                                v36 = ((((((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                v37 = (((((((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                v38 = ((((v37 | v36) & 0xffff0000ffff0000) >> 16 | (v37 | v36) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v37 | v36) & 0xffff0000ffff0000) >> 16 | (v37 | v36) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                if (!v38)
                                    v39 = 64;
                                else
                                    v39 = Clz(v38);
                                v40 = v21 + (v39 >> 3);
                                v41 = *(int *)((char *)v23 + -4 * v40 - 4) | 0x400000000000000;
                                v42 = v41 ^ v30;
                                v43 = v42 + v29;
                                v44 = v43 ^ __ROL__(v42, 16);
                                v45 = v43 + v28;
                                v46 = v44 + __ROL__(v27, 32);
                                v47 = v45 ^ __ROL__(v28, 0x11);
                                v48 = v46 ^ __ROL__(v44, 21);
                                v49 = (v46 ^ v41) + v47;
                                v50 = v48 + (__ROL__(v45, 32) ^ 0xff);
                                v51 = v49 ^ __ROL__(v47, 13);
                                v52 = v50 ^ __ROL__(v48, 16);
                                v53 = v51 + v50;
                                v54 = v52 + __ROL__(v49, 32);
                                v55 = v53 ^ __ROL__(v51, 0x11);
                                v56 = v54 ^ __ROL__(v52, 21);
                                v57 = v55 + v54;
                                v58 = v56 + __ROL__(v53, 32);
                                v59 = v57 ^ __ROL__(v55, 13);
                                v60 = v58 ^ __ROL__(v56, 16);
                                v61 = v59 + v58;
                                v62 = v60 + __ROL__(v57, 32);
                                v63 = (v61 ^ __ROL__(v59, 0x11)) + v62 ^ __ROL__(v61 ^ __ROL__(v59, 0x11), 13);
                                v64 = __ROL__((v62 ^ __ROL__(v60, 21)) + __ROL__(v61, 32) ^ __ROL__(v62 ^ __ROL__(v60, 21), 16), 21) ^ __ROL__(v63, 0x11) ^ __ROL__(v63 + (v62 ^ __ROL__(v60, 21)) + __ROL__(v61, 32), 32) ^ v63 + (v62 ^ __ROL__(v60, 21)) + __ROL__(v61, 32);
                                v65 = v10 & v64;
                                v66 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(long long *)((char *)v12 + v65)));
                                j = __double_as_longlong(v66);
                                if (!j)
                                {
                                    v68 = 8;
                                    do
                                    {
                                        v65 = v65 + v68 & v10;
                                        j = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)(unsigned long long)*(long long *)((char *)v12 + v65)));
                                        v68 += 8;
                                    } while (!j);
                                }
                                v70 = ((((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                v71 = (((((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                v72 = ((((v71 | v70) & 0xffff0000ffff0000) >> 16 | (v71 | v70) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v71 | v70) & 0xffff0000ffff0000) >> 16 | (v71 | v70) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                if (!v72)
                                    v73 = 64;
                                else
                                    v73 = Clz(v72);
                                v74 = v65 + (v73 >> 3) & v10;
                                if (*((char *)v12 + v74) >= 0)
                                {
                                    v76 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v12));
                                    v77 = ((((((v76 & 0xaaaaaaaaaaaaaaaa) >> 1 | v76 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v76 & 0xaaaaaaaaaaaaaaaa) >> 1 | v76 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v76 & 0xaaaaaaaaaaaaaaaa) >> 1 | v76 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v76 & 0xaaaaaaaaaaaaaaaa) >> 1 | v76 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                    v78 = (((((((v76 & 0xaaaaaaaaaaaaaaaa) >> 1 | v76 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v76 & 0xaaaaaaaaaaaaaaaa) >> 1 | v76 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v76 & 0xaaaaaaaaaaaaaaaa) >> 1 | v76 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v76 & 0xaaaaaaaaaaaaaaaa) >> 1 | v76 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                    v79 = ((((v78 | v77) & 0xffff0000ffff0000) >> 16 | (v78 | v77) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v78 | v77) & 0xffff0000ffff0000) >> 16 | (v78 | v77) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                    if (!v79)
                                        v80 = 64;
                                    else
                                        v80 = Clz(v79);
                                    v74 = v80 >> 3;
                                }
                                v25 &= v25 - 1;
                                v81 = v64 >> 57;
                                *((char *)v12 + v74) = v81;
                                *((char *)v12 + (v74 - 8 & v10) + 8) = v81;
                                *(int *)((char *)v12 + 4 * ~v74) = *(int *)((char *)v23 + 4 * ~v40);
                                i -= 1;
                            } while (i);
                            goto LABEL_c6e2b0;
                        }
                        goto LABEL_c6e2ac;
                    }
                }
            }
        }
    }
    sub_c73b38("Hash table capacity overflow", 57, &g_efbad0);
LABEL_c6e2ac:
    v22 = v19;
LABEL_c6e2b0:
    v82 = v22->field_0;
    v83 = v22->field_8;
    v22->field_0 = v12;
    v22->field_8 = v10;
    v22->field_10 = v9 - v4;
    v22->field_18 = v4;
    if (!v83)
        return 9223372036854775809;
    v84 = v83 * 4 + 11 & 0xfffffffffffffff8;
    v85 = arm64g_calculate_condition(2, v83 + v84, 9, 0);
    if (!(v85 & 1))
    {
        _free(v82 - v84);
        return 9223372036854775809;
    }
    return 9223372036854775809;
}
