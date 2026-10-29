/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb86fc8..0xb872e4 (796 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b86fc8_6 {
    unsigned short field_0;
    char field_2;
} st_b86fc8_6;

typedef struct st_b86fc8_2 {
    struct st_b86fc8_3 *field_0;
    char field_8;
    char padding_9[7];
    struct st_b86fc8_3 *field_10;
    struct st_b86fc8_3 *field_18;
    struct st_b86fc8_3 *field_20;
} st_b86fc8_2;

typedef struct st_b86fc8_0 {
    struct st_b86fc8_1 *field_0;
    unsigned long long field_8;
    char padding_10[16];
    unsigned long long field_20;
    char field_28;
} st_b86fc8_0;

typedef struct st_b86fc8_1 {
    unsigned long long field_0;
} st_b86fc8_1;

typedef struct st_b86fc8_5 {
    unsigned long long field_0;
    char field_8;
} st_b86fc8_5;

typedef struct st_b86fc8_3 {
    char field_0;
} st_b86fc8_3;

extern unsigned long long g_b7a7fc;
extern unsigned long long g_bef1c8;
extern long long g_cb8bd0;

unsigned long long sub_b86fc8(st_b86fc8_0 *a0, unsigned long long a1, st_b86fc8_2 **a2)
{
    st_b86fc8_2 *v10;  // x22
    unsigned long long ptr;  // x0
    __m128i v20;  // q0
    unsigned long long v21;  // x13
    __m128i v22;  // q2
    unsigned long v24;  // x14
    unsigned long long v25;  // x14
    __m128i v26;  // q2
    unsigned long v29;  // x14
    char *v12;  // x21
    unsigned long long v30;  // x14
    unsigned long long v31;  // 4128
    unsigned long long v32;  // 4130
    unsigned long long v33;  // x15
    unsigned long long v34;  // x15
    unsigned long long v35;  // x15
    char *v36;  // x8
    st_b86fc8_6 *v37;  // x9
    st_b86fc8_2 *v38;  // x21
    st_b86fc8_3 **v39;  // x21
    st_b86fc8_2 **v13;  // x23
    unsigned long long ptr1;  // x0
    char *v15;  // x8
    unsigned long long v16;  // x9
    unsigned long long v17;  // x13
    unsigned long long *v18;  // x12
    unsigned long long v19;  // x11
    uint128_t v0;  // [bp-0x90]
    char *v1;  // [bp-0x80]
    char v2;  // [bp-0x78]
    char *v3;  // [bp-0x68]
    char *v4;  // [bp-0x60], Other Possible Types: uint128_t
    unsigned long long v5;  // [bp-0x58]
    char *v6;  // [bp-0x50], Other Possible Types: st_b86fc8_5 *
    unsigned long long v7;  // [bp-0x48]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v10 = *a2;
    /* unsupported instruction */;
    /* unsupported instruction */;
    if (!/* unsupported instruction */)
    {
        /* unsupported instruction */;
        if (/* unsupported instruction */ ^ 1)
            goto LABEL_b8723c;
        ptr = a0;
        if (!(*(char *)(ptr + 40) & 1))
            goto LABEL_b87008;
    }
    else
    {
        /* unsupported instruction */;
LABEL_b8723c:
        ptr = sub_c7573c(&v10->field_8);
        a1 = a1;
        a2 = a2;
        if (!(a0->field_28 & 1))
        {
LABEL_b87008:
            if (v10->field_10 != 0x8000000000000000)
                goto LABEL_b871fc;
        }
    }
    /* unsupported instruction */;
    if (v10->field_0 == 1)
    {
        ptr = _malloc(1);
        if (ptr)
            v12 = ptr;
        else
            v12 = 1;
        if (!ptr)
        {
            sub_c6b970(1, v12);
            __debugbreak();
        }
        *v12 = 95;
        if (v10->field_10 >= 1)
            ptr = _free(v10->field_18);
        v10->field_10 = 1;
        v10->field_18 = v12;
        v10->field_20 = 1;
    }
    else
    {
        v13 = a2;
        ptr1 = _malloc(1);
        if (ptr1)
            v12 = ptr1;
        else
            v12 = 1;
        if (!ptr1)
        {
            sub_c6b970(1, v12);
            __debugbreak();
        }
        *v12 = a1;
        v15 = 1;
        v4 = CONCAT(v12, 1);
        v6 = 1;
        if (*(long long *)&a0->padding_10[8])
        {
            v16 = 0;
            v17 = 5871781006564002453 * &*v13->field_8;
            v18 = a0->field_0;
            v19 = a0->field_8;
            v20 = v17 >> 57 & 0xff | (v17 >> 57 & 0xff) * 0x100 | (v17 >> 57 & 0xff | (v17 >> 57 & 0xff) * 0x100) * 0x10000 | (v17 >> 57 & 0xff | (v17 >> 57 & 0xff) * 0x100 | (v17 >> 57 & 0xff | (v17 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
            v15 = 1;
            v21 = v17 & v19;
            v22 = *(long long *)((char *)v18 + v21);
            v24 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v22, v20));
            v25 = v24 & 0x8080808080808080;
            if (!(v24 & 0x8080808080808080))
                goto LABEL_b87110;
            while (1)
            {
                do
                {
                    v30 = v25;
                    v31 = ((((((v30 & 0xaaaaaaaaaaaaaaaa) >> 1 | v30 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v30 & 0xaaaaaaaaaaaaaaaa) >> 1 | v30 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v30 & 0xaaaaaaaaaaaaaaaa) >> 1 | v30 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v30 & 0xaaaaaaaaaaaaaaaa) >> 1 | v30 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v32 = (((((((v30 & 0xaaaaaaaaaaaaaaaa) >> 1 | v30 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v30 & 0xaaaaaaaaaaaaaaaa) >> 1 | v30 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v30 & 0xaaaaaaaaaaaaaaaa) >> 1 | v30 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v30 & 0xaaaaaaaaaaaaaaaa) >> 1 | v30 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v33 = ((((v32 | v31) & 0xffff0000ffff0000) >> 16 | (v32 | v31) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v32 | v31) & 0xffff0000ffff0000) >> 16 | (v32 | v31) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v33)
                        v34 = 64;
                    else
                        v34 = Clz(v33);
                    if (*v13 == *(long long *)((char *)&v18[-1 * (v21 + (v34 >> 3) & v19)] - 8))
                    {
                        sub_c6c0cc(&v4, 1, 3, 1, 1);
                        v36 = v6;
                        v37 = &v36[*(unsigned long long *)((void*)&v4 + 8)];
                        v37->field_0 = 30047;
                        v37->field_2 = 95;
                        v15 = v36 + 3;
                        goto LABEL_b87178;
                    }
                } while ((v35 = v30 - 1, v25 = v35 & v30, v35 & v30));
                do
                {
LABEL_b87110:
                    v26 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v22, _mm_set1_epi8(-1)));
                    if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v26, v26), _mm_unpacklo_epi64(v26, v26)))))))))) & 1)
                        goto LABEL_b87178;
                    v16 += 8;
                    v21 = v21 + v16 & v19;
                    v22 = *(long long *)((char *)v18 + v21);
                    v29 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v22, v20));
                    v25 = v29 & 0x8080808080808080;
                } while (!(v29 & 0x8080808080808080));
            }
        }
LABEL_b87178:
        v0 = v4;
        v1 = v15;
        v4 = &v0;
        v5 = &g_b7a7fc;
        v6 = &a0->field_20;
        v7 = &g_bef1c8;
        ptr = sub_b71ea8(&v2, &g_cb8bd0, &v4);
        v38 = v10;
        v39 = &v38->field_10;
        if (v38->field_10 >= 1)
            ptr = _free(v10->field_18);
        *(uint128_t *)v39 = v2;
        v39[2] = v3;
        v6->field_0 = v6->field_0 + 1;
        if (*(unsigned long long *)&v0)
            ptr = _free(*(unsigned long long *)((void*)&v0 + 8));
    }
    while (1)
    {
LABEL_b871fc:
        /* unsupported instruction */;
        if (/* unsupported instruction */ != 1)
        {
            /* unsupported instruction */;
            return sub_c75418(&v10->field_8);
        }
        /* unsupported instruction */;
        /* unsupported instruction */;
        if (!(/* unsupported instruction */ ^ 1))
            return ptr;
    }
}
