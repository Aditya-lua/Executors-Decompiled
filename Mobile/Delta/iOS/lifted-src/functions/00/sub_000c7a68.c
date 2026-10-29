/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc7a68..0xc8c64 (4604 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c7a68_9 {
    char padding_0[3688];
    uint128_t field_e68;
    uint128_t field_e78;
    uint128_t field_e88;
    uint128_t field_e98;
    char padding_ea8[65472];
    uint128_t field_10e68;
    uint128_t field_10e78;
    uint128_t field_10e88;
    uint128_t field_10e98;
} st_c7a68_9;

typedef struct st_c7a68_4 {
    struct st_c7a68_7 *field_0;
} st_c7a68_4;

typedef struct st_c7a68_7 {
    struct st_c7a68_4 *field_0;
} st_c7a68_7;

typedef struct st_c7a68_0 {
    char padding_0[4];
    unsigned int field_4;
} st_c7a68_0;

typedef struct st_c7a68_1 {
    struct st_c7a68_0 *field_0;
    struct st_c7a68_0 *field_8;
    struct st_c7a68_0 *field_10;
    char padding_18[26660];
    char field_683c;
    char padding_683d[3687];
    uint128_t field_76a4;
    uint128_t field_76b4;
    uint128_t field_76c4;
    uint128_t field_76d4;
    char padding_76e4[16];
    char field_76f4;
    char padding_76f5[65455];
    uint128_t field_176a4;
    uint128_t field_176b4;
    uint128_t field_176c4;
    uint128_t field_176d4;
} st_c7a68_1;

typedef struct st_c7a68_3 {
    char field_0;
} st_c7a68_3;

typedef struct st_c7a68_8 {
    int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_c7a68_8;

extern st_c7a68_8 g_cc1908;
extern unsigned long long g_cc1988;

void* sub_c7a68(st_c7a68_1 *a0, void* a1, long long a2, long long a3, long long a4, void* a5)
{
    void* iter;  // x26
    st_c7a68_9 *v37;  // x22
    unsigned long long *iter1;  // x8
    unsigned long long *v47;  // x12
    void* v48;  // x5
    uint128_t *v49;  // x3
    unsigned long v50;  // x9
    unsigned long long v51;  // x9
    unsigned long v52;  // x13
    unsigned int v53;  // w10
    unsigned long long *v54;  // x11
    unsigned long long v222;  // x20
    unsigned long long v223;  // x20
    void* v224;  // x8
    unsigned long v55;  // x9
    long long v38;  // x9
    unsigned long long v56;  // x9
    unsigned long v57;  // x12
    unsigned int v58;  // w10
    unsigned long long *v59;  // x9
    unsigned long v60;  // x12
    unsigned long long v61;  // x9
    unsigned long long *v62;  // x8
    unsigned int v63;  // w9
    uint128_t *v39;  // x1
    uint128_t *v40;  // x10
    void* v41;  // w27
    unsigned long long v42;  // 4106
    unsigned long v43;  // x8
    unsigned long long v44;  // x9
    unsigned int v45;  // w11
    st_c7a68_9 *v2;  // [bp-0x170]
    long long v3;  // [bp-0x168]
    void* v4;  // [bp-0x160]
    void* v5;  // [bp-0x158]
    unsigned long long v6;  // [bp-0x150]
    unsigned long long v7;  // [bp-0x148]
    uint128_t *v8;  // [bp-0x140]
    void* *v9;  // [bp-0x138]
    st_c7a68_3 **v10;  // [bp-0x130], Other Possible Types: char
    st_c7a68_3 *v11;  // [bp-0x128]
    unsigned long long v12;  // [bp-0x120]
    unsigned int v13;  // [bp-0x118]
    unsigned long long *v14;  // [bp-0x110]
    unsigned long long *v15;  // [bp-0x108]
    unsigned long long *v16;  // [bp-0x100]
    unsigned long long v17;  // [bp-0xf8]
    unsigned long v18;  // [bp-0xf0]
    unsigned long long v19;  // [bp-0xe8]
    unsigned long v20;  // [bp-0xe0]
    unsigned long long v21;  // [bp-0xd8]
    unsigned long v22;  // [bp-0xd0]
    __m128i v23;  // [bp-0xc8]
    void* v24;  // [bp-0xb8]
    uint128_t *v25;  // [bp-0xb0]
    st_c7a68_7 **v30;  // [bp-0x88]
    st_c7a68_7 **v33;  // [bp-0x70]
    char *v34;  // [bp-0x10]
    char v35;  // [bp+0x0]

    v34 = &v35;
    iter = a1;
    v37 = &a0->field_683c;
    v11 = &v10;
    v10 = &v11;
    v38 = a1 + (a2 & ~(a2 >> 63));
    v39 = *(long long *)&a0->padding_683d[3435];
    v25 = v39;
    v40 = *(long long *)&a0->padding_683d[3675];
    if (!a5)
    {
        v4 = iter;
        if (*(int *)&v37->padding_0[3684] == 2)
        {
            v222 = v40 - v39;
            if (v38 - iter < v222)
                goto LABEL_c84f0;
            if (iter)
            {
                _memmove(iter);
                iter += v222;
            }
            v39 = (a0->padding_683d)[1];
            v25 = v39;
            v40 = &a0->padding_76f5[0xffa3];
            *(unsigned int *)&v37->padding_0[3684] = 0;
        }
        v223 = v40 - v39;
        if (v223 <= v38 - iter)
        {
            if (iter)
            {
                _memcpy(iter);
                v224 = iter + v223;
            }
            else
            {
                v224 = 0;
            }
            return v224 - v4;
        }
LABEL_c84f0:
        return 0xffffffffffffffba;
    }
    v41 = a5;
    v3 = v38;
    v7 = *(long long *)&a0->padding_683d[3219];
    v8 = v40;
    v5 = *(long long *)&a0->padding_683d[3211];
    v6 = *(long long *)&a0->padding_683d[3227];
    *(unsigned int *)&v37->padding_0[3320] = 1;
    v23 = _mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), *(unsigned long long *)&*(double *)&v37->padding_0[0]), 32);
    v24 = *(int *)&v37->padding_0[8];
    v42 = arm64g_calculate_condition(130, sub_c6a78(&v12, a3, a4), 120, 0);
    if (v42 & 1)
        return 0xffffffffffffffec;
    v43 = a0->field_0->field_4;
    v44 = v12;
    v45 = v13 + (unsigned int)v43;
    v17 = v44 >> ((char)-v45 & 63) & (&g_cc1908.field_0)[v43];
    v30 = &v33;
    v33 = &v30;
    if (65 > v45)
    {
        iter1 = v14;
        if (v16 > iter1)
        {
            v47 = v15;
            v48 = v5;
            v49 = v8;
            if (iter1 == v47)
                goto LABEL_c7c18;
            v50 = v45 >> 3;
            if ((char *)iter1 - v50 < v47)
                v51 = iter1 - v47 & 0xffffffff;
            else
                v51 = v50 & 0xffffffff;
            iter1 = (char *)iter1 - v51;
            v14 = iter1;
            v45 -= (unsigned int)v51 * 8;
        }
        else
        {
            iter1 = (char *)iter1 - (v45 >> 3);
            v14 = iter1;
            v45 &= 7;
        }
        v13 = v45;
        v44 = *iter1;
        v12 = v44;
        v48 = v5;
        v49 = v8;
    }
    else
    {
        iter1 = &g_cc1988;
        v14 = &g_cc1988;
        v49 = v8;
        v48 = v5;
    }
LABEL_c7c18:
    v18 = a0->field_0 + 1;
    v52 = a0->field_10->field_4;
    v53 = (unsigned int)v52 + v45;
    v19 = v44 >> ((char)-v53 & 63) & (&g_cc1908.field_0)[v52];
    v30 = &v33;
    v33 = &v30;
    if (65 > v53)
    {
        if (v16 > iter1)
        {
            v54 = v15;
            if (iter1 == v54)
                goto LABEL_c7cb8;
            v55 = v53 >> 3;
            if ((char *)iter1 - v55 < v54)
                v56 = iter1 - v54 & 0xffffffff;
            else
                v56 = v55 & 0xffffffff;
            iter1 = (char *)iter1 - v56;
            v14 = iter1;
            v53 -= (unsigned int)v56 * 8;
        }
        else
        {
            iter1 = (char *)iter1 - (v53 >> 3);
            v14 = iter1;
            v53 &= 7;
        }
        v13 = v53;
        v44 = *iter1;
        v12 = v44;
    }
    else
    {
        iter1 = &g_cc1988;
        v14 = &g_cc1988;
    }
LABEL_c7cb8:
    v9 = &v23;
    v20 = a0->field_10 + 1;
    v57 = a0->field_8->field_4;
    v58 = (unsigned int)v57 + v53;
    v13 = v58;
    v21 = v44 >> ((char)-v58 & 63) & (&g_cc1908.field_0)[v57];
    v30 = &v33;
    v33 = &v30;
    v2 = v37;
    if (65 > v58)
    {
        if (v16 > iter1)
        {
            v59 = v15;
            if (iter1 == v59)
                goto LABEL_c7d68;
            v60 = v58 >> 3;
            if ((char *)iter1 - v60 < v59)
                v61 = iter1 - v59 & 0xffffffff;
            else
                v61 = v60 & 0xffffffff;
            v62 = (char *)iter1 - v61;
            v14 = v62;
            v63 = v58 - (unsigned int)v61 * 8;
        }
        else
        {
            v62 = (char *)iter1 - (v58 >> 3);
            v14 = v62;
            v63 = v58 & 7;
        }
        v13 = v63;
        v12 = *v62;
    }
    else
    {
        v14 = &g_cc1988;
    }
LABEL_c7d68:
    v22 = a0->field_8 + 1;
    v4 = iter;
}
