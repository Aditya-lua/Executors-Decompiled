/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc764bc..0xc76834 (888 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c764bc_1 {
    uint128_t field_0;
    unsigned long long field_10;
} st_c764bc_1;

typedef struct st_c764bc_0 {
    void* field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_c764bc_0;

extern long long g_efbad0;

unsigned long long sub_c764bc(st_c764bc_0 *a0, unsigned long a1)
{
    unsigned long v4;  // x21
    unsigned long long v5;  // x8
    void* v14;  // x19
    unsigned long long v15;  // 4116
    st_c764bc_0 *v16;  // x24
    unsigned long long ptr;  // x0
    unsigned long long v18;  // x9
    st_c764bc_0 *v19;  // x8
    void* v20;  // x11
    unsigned long v21;  // d0
    unsigned long long v22;  // x15
    void* v23;  // x13
    unsigned long long v6;  // 4159
    unsigned long i;  // x14
    void* v25;  // x13
    unsigned long v27;  // x15
    unsigned long long v28;  // 4128
    unsigned long long v29;  // 4130
    unsigned long long v30;  // x16
    unsigned long long v31;  // x16
    unsigned long long v32;  // x16
    void* v33;  // x0
    unsigned long long v7;  // x9
    void* v34;  // x17
    unsigned long iter;  // x0
    unsigned long long v36;  // x1
    void* v37;  // x17
    void* v38;  // x17
    unsigned long long v39;  // x17
    unsigned long long v40;  // x0
    unsigned long v41;  // d0
    unsigned long long k;  // x2
    unsigned long long v43;  // x1
    unsigned long long v8;  // x10
    unsigned long long v45;  // 4128
    unsigned long long v46;  // 4130
    unsigned long long v47;  // x1
    unsigned long long v48;  // x1
    unsigned long long v49;  // x0
    unsigned long v51;  // x0
    unsigned long long v52;  // 4137
    unsigned long long v53;  // 4139
    unsigned long long v9;  // x23
    unsigned long long v54;  // x0
    unsigned long long v55;  // x0
    char v56;  // x17
    st_c764bc_1 *v57;  // x16
    uint128_t v58;  // q0
    void* v59;  // x17
    void* v60;  // x9
    unsigned long long v61;  // x10
    unsigned long long v62;  // x8
    unsigned long long v63;  // 4119
    unsigned long long v10;  // x8
    unsigned long long v11;  // x8
    unsigned long long v12;  // x22
    unsigned long long v13;  // x20
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
            goto LABEL_c765b0;
        }
        if (v5 <= 0x1fffffffffffffff)
        {
            v10 = v5 * 8 / 7 - 1;
            if (!v10)
                v11 = 64;
            else
                v11 = (char)Clz(v10);
            v9 = (0xffffffffffffffff >> (v11 & 63)) + 1;
LABEL_c765b0:
            if (v9 * 24 <= 0xffffffffffffffff && !(v12 = v9 * 24, v13 = v9 + 8, v14 = v12 + v13, v15 = arm64g_calculate_condition(0x22, v12, v13, 0), v15 & 1 || 0x7ffffffffffffff8 < v14))
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
                    goto LABEL_c767e8;
                v18 = 0;
                v19 = v16;
                v20 = v16->field_0;
                v21 = __dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), *(unsigned long long *)&*(double *)v20));
                v22 = __double_as_longlong(v21) & 0x8080808080808080;
                v23 = v20;
                i = v4;
                do
                {
                    v25 = v23;
                    if (!v22)
                    {
                        do
                        {
                            v25 = v23 + 8;
                            v27 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)__double_as_longlong((double)v23[8])));
                            v18 += 8;
                            v22 = v27 & 0x8080808080808080;
                            v23 = v25;
                        } while (!(v27 & 0x8080808080808080));
                    }
                    v23 = v25;
                    v28 = ((((((v22 & 0xaaaaaaaaaaaaaaaa) >> 1 | v22 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v22 & 0xaaaaaaaaaaaaaaaa) >> 1 | v22 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v22 & 0xaaaaaaaaaaaaaaaa) >> 1 | v22 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v22 & 0xaaaaaaaaaaaaaaaa) >> 1 | v22 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v29 = (((((((v22 & 0xaaaaaaaaaaaaaaaa) >> 1 | v22 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v22 & 0xaaaaaaaaaaaaaaaa) >> 1 | v22 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v22 & 0xaaaaaaaaaaaaaaaa) >> 1 | v22 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v22 & 0xaaaaaaaaaaaaaaaa) >> 1 | v22 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v30 = ((((v29 | v28) & 0xffff0000ffff0000) >> 16 | (v29 | v28) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v29 | v28) & 0xffff0000ffff0000) >> 16 | (v29 | v28) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v30)
                        v31 = 64;
                    else
                        v31 = Clz(v30);
                    v32 = v18 + (v31 >> 3);
                    v33 = v20 + -(24 * v32);
                    v34 = *(long long *)((char *)v33 - 16);
                    iter = *(long long *)((char *)v33 - 8);
                    if (iter >= 8)
                    {
                        v36 = 0;
                        do
                        {
                            v37 = v34 + 8;
                            v36 = 5871781006564002453 * (*(long long *)v34 ^ __ROL__(v36, 5));
                            iter -= 8;
                            v34 = v37;
                        } while (7 < iter);
                        v34 = v37;
                        if (3 < iter)
                            goto LABEL_c76760;
                        goto LABEL_c766b8;
                    }
                    else
                    {
                        v36 = 0;
                        v37 = v34;
                        if (iter <= 3)
                        {
LABEL_c766b8:
                            v38 = v34;
                            if (1 < iter)
                                goto LABEL_c76778;
                            goto LABEL_c766c0;
                        }
                        else
                        {
LABEL_c76760:
                            v34 = v37 + 4;
                            v36 = 5871781006564002453 * (*(int *)v37 ^ __ROL__(v36, 5));
                            iter -= 4;
                            v38 = v34;
                            if (iter <= 1)
                            {
LABEL_c766c0:
                                if (!iter)
                                    continue;
                                goto LABEL_c766c4;
                            }
                            else
                            {
LABEL_c76778:
                                v34 = v38 + 2;
                                v36 = 5871781006564002453 * (*(short *)v38 ^ __ROL__(v36, 5));
                                if (iter == 2)
                                    continue;
LABEL_c766c4:
                                v36 = 5871781006564002453 * (*(char *)v34 ^ __ROL__(v36, 5));
                            }
                        }
                    }
                    v39 = 5871781006564002453 * (__ROL__(v36, 5) ^ 0xff);
                    v40 = v12 & v39;
                    v41 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(long long *)((char *)v14 + v40)));
                    k = __double_as_longlong(v41);
                    if (!k)
                    {
                        v43 = 8;
                        do
                        {
                            v40 = v40 + v43 & v12;
                            k = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)(unsigned long long)*(long long *)((char *)v14 + v40)));
                            v43 += 8;
                        } while (!k);
                    }
                    v45 = ((((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v46 = (((((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v47 = ((((v46 | v45) & 0xffff0000ffff0000) >> 16 | (v46 | v45) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v46 | v45) & 0xffff0000ffff0000) >> 16 | (v46 | v45) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v47)
                        v48 = 64;
                    else
                        v48 = Clz(v47);
                    v49 = v40 + (v48 >> 3) & v12;
                    if (*((char *)v14 + v49) >= 0)
                    {
                        v51 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v14));
                        v52 = ((((((v51 & 0xaaaaaaaaaaaaaaaa) >> 1 | v51 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v51 & 0xaaaaaaaaaaaaaaaa) >> 1 | v51 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v51 & 0xaaaaaaaaaaaaaaaa) >> 1 | v51 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v51 & 0xaaaaaaaaaaaaaaaa) >> 1 | v51 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                        v53 = (((((((v51 & 0xaaaaaaaaaaaaaaaa) >> 1 | v51 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v51 & 0xaaaaaaaaaaaaaaaa) >> 1 | v51 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v51 & 0xaaaaaaaaaaaaaaaa) >> 1 | v51 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v51 & 0xaaaaaaaaaaaaaaaa) >> 1 | v51 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                        v54 = ((((v53 | v52) & 0xffff0000ffff0000) >> 16 | (v53 | v52) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v53 | v52) & 0xffff0000ffff0000) >> 16 | (v53 | v52) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                        if (!v54)
                            v55 = 64;
                        else
                            v55 = Clz(v54);
                        v49 = v55 >> 3;
                    }
                    v22 &= v22 - 1;
                    v56 = v39 >> 57;
                    *((char *)v14 + v49) = v56;
                    *((char *)v14 + (v49 - 8 & v12) + 8) = v56;
                    v57 = v20 + 24 * ~v32;
                    v58 = v57->field_0;
                    v59 = v14 + 24 * ~v49;
                    *(unsigned long long *)&v59[16] = v57->field_10;
                    *(uint128_t *)v59 = v58;
                    i -= 1;
                } while (i);
                goto LABEL_c767ec;
            }
        }
    }
    sub_c73b38("Hash table capacity overflow", 57, &g_efbad0);
LABEL_c767e8:
    v19 = v16;
LABEL_c767ec:
    v60 = v19->field_0;
    v61 = v19->field_8;
    v19->field_0 = v14;
    v19->field_8 = v12;
    v19->field_10 = v9 - v4;
    v19->field_18 = v4;
    if (!v61)
        return 9223372036854775809;
    v62 = 31 + 24 * v61 & 0xfffffffffffffff8;
    v63 = arm64g_calculate_condition(2, v61 + v62, 9, 0);
    if (!(v63 & 1))
    {
        _free(v60 - v62);
        return 9223372036854775809;
    }
    return 9223372036854775809;
}
