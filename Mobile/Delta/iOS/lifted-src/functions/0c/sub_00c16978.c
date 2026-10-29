/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc16978..0xc16ff8 (1664 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c16978_1 {
    char padding_0[8];
    struct st_c16978_0 *field_8;
} st_c16978_1;

typedef struct st_c16978_0 {
    char padding_0[16];
    unsigned long long field_10;
    char padding_18[56];
    unsigned int field_50;
    char padding_54[12];
    unsigned int field_60;
    char padding_64[4];
    unsigned int field_68;
    char padding_6c[124];
    unsigned int field_e8;
} st_c16978_0;

typedef struct st_c16978_2 {
    void* field_0;
    unsigned long long field_8;
    uint128_t field_10;
} st_c16978_2;


st_c16978_1 * sub_c16978(st_c16978_1 *dst, st_c16978_2 *a1)
{
    st_c16978_0 *iter;  // x23
    st_c16978_0 *v6;  // x24
    unsigned long node;  // x9
    void* v15;  // x8
    void* v16;  // x8
    unsigned int v18;  // x26
    unsigned int iter1;  // x10
    unsigned long long v20;  // x8
    void* v21;  // x22
    unsigned long v22;  // x27
    char v23;  // x28
    __m128i v24;  // q8
    unsigned long long v25;  // x24
    __m128i v26;  // q9
    unsigned long v28;  // x8
    unsigned long long v29;  // x25
    unsigned int v31;  // x8
    unsigned long long v32;  // 4128
    unsigned long long v33;  // 4130
    unsigned int ptr;  // x21
    unsigned int v34;  // x8
    unsigned long long v35;  // x8
    uint128_t v36;  // q0
    unsigned long v39;  // x8
    unsigned long long v40;  // x25
    unsigned long long v41;  // 4128
    unsigned long long v42;  // 4130
    unsigned int v43;  // x8
    unsigned int v8;  // x8
    unsigned long long v44;  // x8
    long long *v45;  // x8
    unsigned long long v46;  // x8
    unsigned long v47;  // x8
    unsigned long v49;  // x8
    unsigned long long v50;  // 4137
    unsigned long long v51;  // 4139
    unsigned int v52;  // x8
    unsigned long long v53;  // x8
    unsigned int v9;  // x20
    __m128i v54;  // q1
    unsigned int *v55;  // x8
    unsigned int v56;  // x21
    long long v57;  // x19
    unsigned long v10;  // x20
    unsigned int ptr1;  // x0
    unsigned int v12;  // x22
    void* v13;  // x8
    unsigned long long v0;  // [bp-0x88]
    st_c16978_0 *v2;  // [bp-0x78]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    if (!dst[1].padding_0)
        return dst;
    iter = dst->field_8;
    v6 = (char *)dst->field_8 + 264 * dst[1].padding_0;
    v2 = v6;
    while (1)
    {
        if (11 < (unsigned long long)*(long long *)&iter->padding_18[0])
            v8 = *(long long *)&iter->padding_18[0] - 12;
        else
            v8 = 9;
        if (7 >= v8)
        {
            switch (v8)
            {
            case 4:
                v56 = *(long long *)&iter->field_60;
                /* unsupported instruction */;
                /* unsupported instruction */;
                if (!/* unsupported instruction */)
                {
                    /* unsupported instruction */;
                    if (!(/* unsupported instruction */ ^ 1))
                        goto LABEL_c16acc;
                }
                else
                {
                    /* unsupported instruction */;
                }
                sub_c7573c(v56 + 8);
LABEL_c16acc:
                sub_c16978(v56 + 16, a1);
                while (1)
                {
                    /* unsupported instruction */;
                    if (/* unsupported instruction */ != 1)
                        break;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                    if (!(/* unsupported instruction */ ^ 1))
                    {
                        ptr = *(long long *)&iter->field_68;
                        v9 = ptr + 8;
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                        if (/* unsupported instruction */)
                            goto LABEL_c16e90;
                        goto LABEL_c16afc;
                    }
                }
                /* unsupported instruction */;
                sub_c75418(v56 + 8);
                ptr = *(long long *)&iter->field_68;
                v9 = ptr + 8;
                /* unsupported instruction */;
                /* unsupported instruction */;
                if (!/* unsupported instruction */)
                {
LABEL_c16afc:
                    /* unsupported instruction */;
                    if (!(/* unsupported instruction */ ^ 1))
                        goto LABEL_c16b04;
                    goto LABEL_c16e94;
                }
                else
                {
LABEL_c16e90:
                    /* unsupported instruction */;
LABEL_c16e94:
                    sub_c7573c(ptr + 8);
                }
LABEL_c16b04:
                dst = sub_c16978(ptr + 16, a1);
                while (1)
                {
                    /* unsupported instruction */;
                    if (/* unsupported instruction */ != 1)
                        break;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                    if (!(/* unsupported instruction */ ^ 1))
                        goto LABEL_c169e8;
                }
            case 5:
                v10 = iter->field_10;
                if (!v10)
                {
                    v12 = 0;
                    ptr = 1;
                    goto LABEL_c16c50;
                }
                ptr1 = _malloc(v10);
                if (!ptr1)
                {
                    v57 = sub_c6b970(1, v10);
                    if (v10)
                    {
                        _free(ptr);
                        v57 = __Unwind_Resume(v57);
                        do
                        {
                            /* unsupported instruction */;
                            if (/* unsupported instruction */ != 1)
                            {
                                /* unsupported instruction */;
                                sub_c75418(v10);
                                break;
                            }
                        } while ((/* unsupported instruction */, /* unsupported instruction */, /* unsupported instruction */ ^ 1));
                    }
                    while (1)
                    {
                        __Unwind_Resume(v57);
                        /* unsupported instruction */;
                        sub_c75418(v10);
                    }
                }
                ptr = ptr1;
                dst = _memcpy();
                if (v10 >= 8)
                {
                    v12 = 0;
                    v13 = (void*)ptr;
                    node = v10;
                    do
                    {
                        v15 = v13 + 8;
                        v12 = 5871781006564002453 * (*(long long *)v13 ^ __ROL__(v12, 5));
                        node -= 8;
                        v13 = v15;
                    } while (7 < node);
                    v16 = v15;
                    if (3 < node)
                        goto LABEL_c16c18;
                }
                else
                {
                    v12 = 0;
                    node = v10;
                    v15 = (void*)ptr;
                    v16 = v15;
                    if (v10 > 3)
                    {
LABEL_c16c18:
                        v15 = v16 + 4;
                        v12 = 5871781006564002453 * (*(int *)v16 ^ __ROL__(v12, 5));
                        node -= 4;
                        if (node > 1)
                        {
LABEL_c16c30:
                            v12 = 5871781006564002453 * (*(short *)v15 ^ __ROL__(v12, 5));
                            v15 += 2;
                            if (node == 2)
                                goto LABEL_c16c50;
LABEL_c16c44:
                            v12 = 5871781006564002453 * (*(char *)v15 ^ __ROL__(v12, 5));
                            goto LABEL_c16c50;
                        }
LABEL_c16bb4:
                        if (!node)
                            goto LABEL_c16c50;
                        else
                            goto LABEL_c16c44;
                        goto LABEL_c16c44;
                    }
                }
                if (1 < node)
                    goto LABEL_c16c30;
                goto LABEL_c16bb4;
            case 7:
                ptr = *(long long *)&iter->field_60;
                v9 = ptr + 8;
                /* unsupported instruction */;
                /* unsupported instruction */;
                if (!/* unsupported instruction */)
                {
                    /* unsupported instruction */;
                    if (!(/* unsupported instruction */ ^ 1))
                        goto LABEL_c16a3c;
                }
                else
                {
                    /* unsupported instruction */;
                }
                sub_c7573c(ptr + 8);
LABEL_c16a3c:
                dst = sub_c16978(ptr + 16, a1);
                while (1)
                {
                    /* unsupported instruction */;
                    if (/* unsupported instruction */ != 1)
                        break;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                    if (!(/* unsupported instruction */ ^ 1))
                        goto LABEL_c169e8;
                }
            default:
LABEL_c169e8:
                iter = &iter[1].padding_18[4];
                if (iter == v6)
                    return dst;
                continue;
            }
            goto LABEL_c16e14;
        }
        switch (v8)
        {
        case 8:
            ptr = *(long long *)&iter->field_60;
            v9 = ptr + 8;
            /* unsupported instruction */;
            /* unsupported instruction */;
            if (!/* unsupported instruction */)
            {
                /* unsupported instruction */;
                if (!(/* unsupported instruction */ ^ 1))
                    goto LABEL_c16b40;
            }
            else
            {
                /* unsupported instruction */;
            }
            sub_c7573c(ptr + 8);
LABEL_c16b40:
            dst = sub_c16978(ptr + 16, a1);
            while (1)
            {
                /* unsupported instruction */;
                if (/* unsupported instruction */ != 1)
                    break;
                /* unsupported instruction */;
                /* unsupported instruction */;
                if (!(/* unsupported instruction */ ^ 1))
                    goto LABEL_c169e8;
            }
            goto LABEL_c16e14;
        case 11:
            ptr = *(long long *)&iter->field_e8;
            v9 = ptr + 8;
            /* unsupported instruction */;
            /* unsupported instruction */;
            if (!/* unsupported instruction */)
            {
                /* unsupported instruction */;
                if (!(/* unsupported instruction */ ^ 1))
                    goto LABEL_c16bd4;
            }
            else
            {
                /* unsupported instruction */;
            }
            sub_c7573c(ptr + 8);
LABEL_c16bd4:
            dst = sub_c16978(ptr + 16, a1);
            while (1)
            {
                /* unsupported instruction */;
                if (/* unsupported instruction */ != 1)
                    break;
                /* unsupported instruction */;
                /* unsupported instruction */;
                if (!(/* unsupported instruction */ ^ 1))
                    goto LABEL_c169e8;
            }
LABEL_c16e14:
            /* unsupported instruction */;
            dst = sub_c75418(v9);
            goto LABEL_c169e8;
        case 14:
            ptr = *(long long *)&iter->field_50;
            v9 = ptr + 8;
            /* unsupported instruction */;
            /* unsupported instruction */;
            if (!/* unsupported instruction */)
            {
                /* unsupported instruction */;
                if (!(/* unsupported instruction */ ^ 1))
                    goto LABEL_c16a90;
            }
            else
            {
                /* unsupported instruction */;
            }
            sub_c7573c(ptr + 8);
LABEL_c16a90:
            dst = sub_c16978(ptr + 16, a1);
            while (1)
            {
                /* unsupported instruction */;
                if (/* unsupported instruction */ != 1)
                    break;
                /* unsupported instruction */;
                /* unsupported instruction */;
                if (!(/* unsupported instruction */ ^ 1))
                    goto LABEL_c169e8;
            }
            goto LABEL_c16e14;
        default:
LABEL_c169e8:
            iter = &iter[1].padding_18[4];
            if (iter == v6)
                return dst;
            continue;
        }
    }
LABEL_c16c50:
    if (!(long long)a1->field_10)
        dst = sub_c764bc(a1, a1 + 1);
    v18 = 0;
    iter1 = 0;
    v20 = 5871781006564002453 * (__ROL__(v12, 5) ^ 0xff);
    v21 = a1->field_0;
    v22 = a1->field_8;
    v23 = v20 >> 57;
    v24 = v23 | v23 * 0x100 | (v23 | v23 * 0x100) * 0x10000 | (v23 | v23 * 0x100 | (v23 | v23 * 0x100) * 0x10000) * 0x100000000;
    v25 = v20 & v22;
    v26 = *(long long *)((char *)v21 + v25);
    v28 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v26, v24));
    v29 = v28 & 0x8080808080808080;
    if (!(v28 & 0x8080808080808080))
        goto LABEL_c16ce0;
    while (1)
    {
        do
        {
            v40 = v29;
            v41 = ((((((v40 & 0xaaaaaaaaaaaaaaaa) >> 1 | v40 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v40 & 0xaaaaaaaaaaaaaaaa) >> 1 | v40 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v40 & 0xaaaaaaaaaaaaaaaa) >> 1 | v40 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v40 & 0xaaaaaaaaaaaaaaaa) >> 1 | v40 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v42 = (((((((v40 & 0xaaaaaaaaaaaaaaaa) >> 1 | v40 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v40 & 0xaaaaaaaaaaaaaaaa) >> 1 | v40 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v40 & 0xaaaaaaaaaaaaaaaa) >> 1 | v40 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v40 & 0xaaaaaaaaaaaaaaaa) >> 1 | v40 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v43 = ((((v42 | v41) & 0xffff0000ffff0000) >> 16 | (v42 | v41) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v42 | v41) & 0xffff0000ffff0000) >> 16 | (v42 | v41) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v43)
                v44 = 64;
            else
                v44 = Clz(v43);
            v45 = v21 + -(24 * (v25 + (v44 >> 3) & v22));
            if (v10 == *(long long *)((char *)v45 - 8))
            {
                dst = _memcmp(ptr, *(long long *)((char *)v45 - 16), v10);
                if (!(unsigned int)dst)
                {
                    v6 = v2;
                    if (!v10)
                        goto LABEL_c169e8;
                    dst = _free(ptr);
                    v6 = v2;
                    goto LABEL_c169e8;
                }
            }
            v46 = v40 - 1;
            v29 = v46 & v40;
        } while (v46 & v40);
        do
        {
LABEL_c16ce0:
            if (v18 != 1)
            {
                v31 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), v26));
                if (v31)
                {
                    v32 = ((((((v31 & 0xaaaaaaaaaaaaaaaa) >> 1 | v31 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v31 & 0xaaaaaaaaaaaaaaaa) >> 1 | v31 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v31 & 0xaaaaaaaaaaaaaaaa) >> 1 | v31 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v31 & 0xaaaaaaaaaaaaaaaa) >> 1 | v31 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v33 = (((((((v31 & 0xaaaaaaaaaaaaaaaa) >> 1 | v31 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v31 & 0xaaaaaaaaaaaaaaaa) >> 1 | v31 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v31 & 0xaaaaaaaaaaaaaaaa) >> 1 | v31 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v31 & 0xaaaaaaaaaaaaaaaa) >> 1 | v31 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v34 = ((((v33 | v32) & 0xffff0000ffff0000) >> 16 | (v33 | v32) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v33 | v32) & 0xffff0000ffff0000) >> 16 | (v33 | v32) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v34)
                        v35 = 64;
                    else
                        v35 = Clz(v34);
                    v0 = v25 + (v35 >> 3) & v22;
                }
                else
                {
                    v18 = 0;
                    continue;
                }
            }
            v36 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v26, _mm_set1_epi8(-1)));
            if (!((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v36, v36), _mm_unpacklo_epi64(v36, v36)))))))))) & 1))
            {
                v18 = 1;
            }
            else
            {
                v47 = *((char *)v21 + v0);
                if (!(v47 >> 31 & 1))
                {
                    v49 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v21));
                    v50 = ((((((v49 & 0xaaaaaaaaaaaaaaaa) >> 1 | v49 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v49 & 0xaaaaaaaaaaaaaaaa) >> 1 | v49 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v49 & 0xaaaaaaaaaaaaaaaa) >> 1 | v49 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v49 & 0xaaaaaaaaaaaaaaaa) >> 1 | v49 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v51 = (((((((v49 & 0xaaaaaaaaaaaaaaaa) >> 1 | v49 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v49 & 0xaaaaaaaaaaaaaaaa) >> 1 | v49 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v49 & 0xaaaaaaaaaaaaaaaa) >> 1 | v49 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v49 & 0xaaaaaaaaaaaaaaaa) >> 1 | v49 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v52 = ((((v51 | v50) & 0xffff0000ffff0000) >> 16 | (v51 | v50) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v51 | v50) & 0xffff0000ffff0000) >> 16 | (v51 | v50) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v52)
                        v53 = 64;
                    else
                        v53 = Clz(v52);
                    v0 = v53 >> 3;
                    v47 = *((char *)v21 + v0);
                }
                *((char *)v21 + v0) = v23;
                *((char *)v21 + (v22 & v0 - 8) + 8) = v23;
                v54 = (__m128i)_INSERT(CONCAT(0xffffffffffffffff, 0xffffffffffffffff), 0, __longlong_as_double(v47 & 1));
                *(__m128i *)&a1->field_10 = _mm_sub_epi64(a1->field_10, v54);
                v55 = v21 + -(24 * v0);
                *(unsigned long *)((char *)v55 - 24) = v10;
                *(unsigned long long *)((char *)v55 - 16) = ptr;
                *(unsigned long *)((char *)v55 - 8) = v10;
                v6 = v2;
                goto LABEL_c169e8;
            }
            iter1 += 8;
            v25 = iter1 + v25 & v22;
            v26 = *(long long *)((char *)v21 + v25);
            v39 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v26, v24));
            v29 = v39 & 0x8080808080808080;
        } while (!(v39 & 0x8080808080808080));
    }
}
