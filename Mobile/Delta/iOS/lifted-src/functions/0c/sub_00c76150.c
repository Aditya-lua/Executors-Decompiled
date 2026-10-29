/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc76150..0xc764bc (876 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c76150_0 {
    void* field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_c76150_0;

extern long long g_efbad0;

unsigned long long sub_c76150(st_c76150_0 *a0, unsigned long a1)
{
    unsigned long v4;  // x21
    unsigned long long v5;  // x8
    unsigned long long v14;  // x8
    unsigned long long v15;  // x8
    unsigned long long v16;  // x8
    unsigned long long v17;  // x20
    unsigned long long v18;  // 4115
    st_c76150_0 *v19;  // x24
    unsigned long long ptr;  // x0
    unsigned long long v21;  // x9
    st_c76150_0 *v22;  // x8
    void* v23;  // x11
    unsigned long long v6;  // 4159
    unsigned long v24;  // d0
    unsigned long long v25;  // x14
    void* v26;  // x12
    unsigned long i;  // x13
    void* v28;  // x12
    unsigned long v30;  // x14
    unsigned long long v31;  // 4128
    unsigned long long v32;  // 4130
    unsigned long long v33;  // x15
    unsigned long long v7;  // x9
    unsigned long long v34;  // x15
    unsigned long long v35;  // x15
    void* v36;  // x17
    void* v37;  // x16
    unsigned long iter;  // x17
    unsigned long long v39;  // x0
    void* v40;  // x16
    void* v41;  // x16
    unsigned long long v42;  // x16
    unsigned long long v43;  // x17
    unsigned long long v8;  // x10
    unsigned long v44;  // d0
    unsigned long long k;  // x1
    unsigned long long v46;  // x0
    unsigned long long v48;  // 4128
    unsigned long long v49;  // 4130
    unsigned long long v50;  // x0
    unsigned long long v51;  // x0
    unsigned long long v52;  // x17
    unsigned long long v9;  // x23
    unsigned long v54;  // x17
    unsigned long long v55;  // 4137
    unsigned long long v56;  // 4139
    unsigned long long v57;  // x17
    unsigned long long v58;  // x17
    char v59;  // x16
    uint128_t *v60;  // x15
    uint128_t v61;  // q1
    void* v62;  // x15
    void* v63;  // x9
    unsigned long long v10;  // x22
    unsigned long long v64;  // x10
    unsigned long long v65;  // x8
    unsigned long long v66;  // 4118
    unsigned long long v11;  // x20
    void* v12;  // x19
    unsigned long long v13;  // 4112
    unsigned long v0;  // [bp-0x50]
    char *v1;  // [bp-0x48]
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
            sub_c2b25c();
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
            v10 = v9 * 32;
            v11 = v9 + 8;
            v12 = v11 + v10;
            v13 = arm64g_calculate_condition(50, v11, v10, 0);
            if (v13 & 1)
                goto LABEL_c76270;
        }
        else if (v5 <= 0x1fffffffffffffff)
        {
            v14 = v5 * 8 / 7 - 1;
            if (!v14)
                v15 = 64;
            else
                v15 = (char)Clz(v14);
            v16 = 0xffffffffffffffff >> (v15 & 63);
            if (0x7fffffffffffffe >= v16)
            {
                v9 = v16 + 1;
                v10 = v9 * 32;
                v17 = v9 + 8;
                v12 = v17 + v10;
                v18 = arm64g_calculate_condition(0x22, v17, v10, 0);
                if (!(v18 & 1))
                {
LABEL_c76270:
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
                            v26 = v23;
                            i = v4;
                            do
                            {
                                v28 = v26;
                                if (!v25)
                                {
                                    do
                                    {
                                        v28 = v26 + 8;
                                        v30 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)__double_as_longlong((double)v26[8])));
                                        v21 += 8;
                                        v25 = v30 & 0x8080808080808080;
                                        v26 = v28;
                                    } while (!(v30 & 0x8080808080808080));
                                }
                                v26 = v28;
                                v31 = ((((((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                v32 = (((((((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v25 & 0xaaaaaaaaaaaaaaaa) >> 1 | v25 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                v33 = ((((v32 | v31) & 0xffff0000ffff0000) >> 16 | (v32 | v31) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v32 | v31) & 0xffff0000ffff0000) >> 16 | (v32 | v31) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                if (!v33)
                                    v34 = 64;
                                else
                                    v34 = Clz(v33);
                                v35 = v21 + (v34 >> 3);
                                v36 = v23 - v35 * 32;
                                v37 = *(long long *)((char *)v36 - 24);
                                iter = *(long long *)((char *)v36 - 16);
                                if (iter >= 8)
                                {
                                    v39 = 0;
                                    do
                                    {
                                        v40 = v37 + 8;
                                        v39 = 5871781006564002453 * (*(long long *)v37 ^ __ROL__(v39, 5));
                                        iter -= 8;
                                        v37 = v40;
                                    } while (7 < iter);
                                    v37 = v40;
                                    if (3 < iter)
                                        goto LABEL_c763ec;
                                    goto LABEL_c7634c;
                                }
                                else
                                {
                                    v39 = 0;
                                    v40 = v37;
                                    if (iter <= 3)
                                    {
LABEL_c7634c:
                                        v41 = v37;
                                        if (1 < iter)
                                            goto LABEL_c76404;
                                        goto LABEL_c76354;
                                    }
                                    else
                                    {
LABEL_c763ec:
                                        v37 = v40 + 4;
                                        v39 = 5871781006564002453 * (*(int *)v40 ^ __ROL__(v39, 5));
                                        iter -= 4;
                                        v41 = v37;
                                        if (iter <= 1)
                                        {
LABEL_c76354:
                                            if (!iter)
                                                continue;
                                            goto LABEL_c76358;
                                        }
                                        else
                                        {
LABEL_c76404:
                                            v37 = v41 + 2;
                                            v39 = 5871781006564002453 * (*(short *)v41 ^ __ROL__(v39, 5));
                                            if (iter == 2)
                                                continue;
LABEL_c76358:
                                            v39 = 5871781006564002453 * (*(char *)v37 ^ __ROL__(v39, 5));
                                        }
                                    }
                                }
                                v42 = 5871781006564002453 * (__ROL__(v39, 5) ^ 0xff);
                                v43 = v10 & v42;
                                v44 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(long long *)((char *)v12 + v43)));
                                k = __double_as_longlong(v44);
                                if (!k)
                                {
                                    v46 = 8;
                                    do
                                    {
                                        v43 = v43 + v46 & v10;
                                        k = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)(unsigned long long)*(long long *)((char *)v12 + v43)));
                                        v46 += 8;
                                    } while (!k);
                                }
                                v48 = ((((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                v49 = (((((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                v50 = ((((v49 | v48) & 0xffff0000ffff0000) >> 16 | (v49 | v48) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v49 | v48) & 0xffff0000ffff0000) >> 16 | (v49 | v48) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                if (!v50)
                                    v51 = 64;
                                else
                                    v51 = Clz(v50);
                                v52 = v43 + (v51 >> 3) & v10;
                                if (*((char *)v12 + v52) >= 0)
                                {
                                    v54 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v12));
                                    v55 = ((((((v54 & 0xaaaaaaaaaaaaaaaa) >> 1 | v54 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v54 & 0xaaaaaaaaaaaaaaaa) >> 1 | v54 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v54 & 0xaaaaaaaaaaaaaaaa) >> 1 | v54 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v54 & 0xaaaaaaaaaaaaaaaa) >> 1 | v54 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                    v56 = (((((((v54 & 0xaaaaaaaaaaaaaaaa) >> 1 | v54 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v54 & 0xaaaaaaaaaaaaaaaa) >> 1 | v54 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v54 & 0xaaaaaaaaaaaaaaaa) >> 1 | v54 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v54 & 0xaaaaaaaaaaaaaaaa) >> 1 | v54 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                    v57 = ((((v56 | v55) & 0xffff0000ffff0000) >> 16 | (v56 | v55) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v56 | v55) & 0xffff0000ffff0000) >> 16 | (v56 | v55) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                    if (!v57)
                                        v58 = 64;
                                    else
                                        v58 = Clz(v57);
                                    v52 = v58 >> 3;
                                }
                                v25 &= v25 - 1;
                                v59 = v42 >> 57;
                                *((char *)v12 + v52) = v59;
                                *((char *)v12 + (v52 - 8 & v10) + 8) = v59;
                                v60 = v23 + ~v35 * 32;
                                v61 = v60[1];
                                v62 = v12 + ~v52 * 32;
                                *(uint128_t *)v62 = *v60;
                                *(uint128_t *)&v62[16] = v61;
                                i -= 1;
                            } while (i);
                            goto LABEL_c76478;
                        }
                        goto LABEL_c76474;
                    }
                }
            }
        }
    }
    sub_c73b38("Hash table capacity overflow", 57, &g_efbad0);
LABEL_c76474:
    v22 = v19;
LABEL_c76478:
    v63 = v22->field_0;
    v64 = v22->field_8;
    v22->field_0 = v12;
    v22->field_8 = v10;
    v22->field_10 = v9 - v4;
    v22->field_18 = v4;
    if (!v64)
        return 9223372036854775809;
    v65 = v64 * 32 + 39 & 0xffffffffffffffe0;
    v66 = arm64g_calculate_condition(2, v64 + v65, 9, 0);
    if (!(v66 & 1))
    {
        _free(v63 - v65);
        return 9223372036854775809;
    }
    return 9223372036854775809;
}
