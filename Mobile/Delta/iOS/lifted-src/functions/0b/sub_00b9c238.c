/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb9c238..0xb9c50c (724 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b9c238_5 {
    char *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    struct st_b9c238_2 *field_18;
    struct st_b9c238_2 *field_20;
    struct st_b9c238_1 *field_28;
    unsigned long long field_30;
    struct st_b9c238_2 *field_38;
    unsigned long long field_40;
    char padding_48[16];
    unsigned long long field_58;
    struct st_b9c238_2 *field_60;
    struct st_b9c238_1 *field_68;
    char padding_70[8];
    struct st_b9c238_2 *field_78;
} st_b9c238_5;

typedef struct st_b9c238_2 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_b9c238_2;

typedef struct st_b9c238_0 {
    unsigned long long field_0;
    char padding_8[16];
    unsigned long long field_18;
    char *field_20;
    struct st_b9c238_1 *field_28;
    char padding_30[8];
    struct st_b9c238_2 *field_38;
    struct st_b9c238_2 *field_40;
    unsigned long long field_48;
    unsigned long long field_50;
    struct st_b9c238_2 *field_58;
    struct st_b9c238_2 *field_60;
    struct st_b9c238_1 *field_68;
    unsigned long long field_70;
    struct st_b9c238_2 *field_78;
    unsigned long long field_80;
    char padding_88[16];
    unsigned long long field_98;
    struct st_b9c238_2 *field_a0;
    struct st_b9c238_1 *field_a8;
    char padding_b0[8];
    struct st_b9c238_2 *field_b8;
} st_b9c238_0;

typedef struct st_b9c238_3 {
    char *field_0;
    uint128_t field_8;
    unsigned long long field_18;
} st_b9c238_3;

typedef struct st_b9c238_4 {
    unsigned long long field_0;
    char padding_8[16];
    unsigned long long field_18;
    char *field_20;
    struct st_b9c238_1 *field_28;
    char padding_30[8];
    struct st_b9c238_2 *field_38;
} st_b9c238_4;

typedef struct st_b9c238_1 {
    unsigned long long field_0;
} st_b9c238_1;


double sub_b9c238(st_b9c238_3 *a0, st_b9c238_0 *a1)
{
    st_b9c238_5 *v6;  // x21
    char *j;  // x23
    unsigned long long v16;  // x11
    void* v17;  // x8
    char *v18;  // x9
    char *v19;  // x8
    unsigned long v20;  // x9
    char *k;  // x10
    unsigned long long *v22;  // x11
    unsigned long long *v23;  // x11
    unsigned long long v25;  // 4131
    char *v8;  // x8
    unsigned long long v26;  // 4133
    char *v27;  // x12
    unsigned long long v28;  // x12
    void* v29;  // x9
    char *v30;  // x24
    char *v31;  // x25
    unsigned long long v32;  // 4102
    unsigned long long v33;  // x8
    unsigned long v34;  // x8
    unsigned long v35;  // cc_dep1
    char *i;  // x9
    unsigned long v36;  // x26
    unsigned long v37;  // x27
    unsigned long long v38;  // 4114
    unsigned long long v39;  // 4114
    char *v40;  // x19
    unsigned long v41;  // d0
    uint128_t v42;  // q0
    st_b9c238_3 *v43;  // x10
    st_b9c238_4 *v44;  // x21
    char *v45;  // x8
    unsigned long long *v10;  // x10
    unsigned long long v46;  // x9
    char *l;  // x10
    unsigned long long *v48;  // x11
    unsigned long long *v49;  // x11
    unsigned long long v51;  // 4131
    unsigned long long v52;  // 4133
    char *v53;  // x12
    unsigned long long v54;  // x12
    void* v55;  // x9
    unsigned long long *v11;  // x10
    char *v56;  // x20
    st_b9c238_3 *v57;  // x9
    unsigned long long v13;  // 4131
    unsigned long long v14;  // 4133
    char *v15;  // x11
    uint128_t v0;  // [bp-0xa0]
    unsigned long v1;  // [bp-0x90]
    uint128_t v2;  // [bp-0x80]
    unsigned long v3;  // [bp-0x70]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = &a1->field_40;
    if (a1->field_40 == 0x8000000000000001)
        goto LABEL_b9c304;
    j = a1->field_78;
    if (!j)
        goto LABEL_b9c2f4;
    while (1)
    {
        v8 = a1->field_58;
        i = a1->field_60;
        if (!i)
        {
            v10 = a1->field_68;
            do
            {
                v11 = v10 + 1;
                v8 -= 384;
                i = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v10)) & 0x8080808080808080;
                v10 = v11;
            } while (!i);
            a1->field_68 = v11;
            a1->field_58 = v8;
        }
        v13 = ((((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
        v14 = (((((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
        v15 = ((((v14 | v13) & 0xffff0000ffff0000) >> 16 | (v14 | v13) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v14 | v13) & 0xffff0000ffff0000) >> 16 | (v14 | v13) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
        if (!v15)
            v16 = 64;
        else
            v16 = Clz(v15);
        a1->field_60 = i - 1 & i;
        v17 = &v8[(unsigned int)-(v16 >> 3) * 48];
        a1->field_78 = j - 1;
        v18 = *(long long *)((char *)v17 - 32);
        if (v18)
            break;
        do
        {
LABEL_b9c2f4:
            sub_b99bd4(v6);
            v6->field_0 = 0x8000000000000001;
LABEL_b9c304:
            if (a1->field_0 == 9223372036854775809 || !(v19 = a1->field_38, v19))
            {
LABEL_b9c418:
                v44 = &a1->field_80;
                if (a1->field_80 == 9223372036854775809)
                {
                    a0->field_0 = 0;
                    return (unsigned long long)v42;
                }
                v45 = a1->field_b8;
                if (v45)
                {
                    v46 = a1->field_98;
                    l = a1->field_a0;
                    if (!l)
                    {
                        v48 = a1->field_a8;
                        do
                        {
                            v49 = v48 + 1;
                            v46 -= 384;
                            l = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v48)) & 0x8080808080808080;
                            v48 = v49;
                        } while (!l);
                        a1->field_a8 = v49;
                        a1->field_98 = v46;
                    }
                    v51 = ((((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v52 = (((((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v53 = ((((v52 | v51) & 0xffff0000ffff0000) >> 16 | (v52 | v51) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v52 | v51) & 0xffff0000ffff0000) >> 16 | (v52 | v51) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v53)
                        v54 = 64;
                    else
                        v54 = Clz(v53);
                    a1->field_a0 = l - 1 & l;
                    v55 = v46 + (unsigned int)-(v54 >> 3) * 48;
                    a1->field_b8 = v45 - 1;
                    v56 = *(long long *)((char *)v55 - 32);
                    v2 = *(int128_t *)((char *)v55 - 24);
                    v3 = *(long long *)((char *)v55 - 8);
                    if (v56)
                    {
                        v0 = v2;
                        v1 = v3;
                        v57 = a0;
                        v57->field_0 = v56;
                        *(uint128_t *)&(&v57->field_0)[1] = v0;
                        *(unsigned long *)((char *)&v57->field_8 + 8) = v1;
                        return (unsigned long long)v0;
                    }
                }
                else
                {
                    v56 = 0;
                }
                sub_b99bd4(v44);
                v44->field_0 = 9223372036854775809;
                v57 = a0;
                v57->field_0 = v56;
                *(uint128_t *)&(&v57->field_0)[1] = v0;
                *(unsigned long *)((char *)&v57->field_8 + 8) = v1;
                return (unsigned long long)v0;
            }
            v20 = a1->field_18;
            k = a1->field_20;
            if (!k)
            {
                v22 = a1->field_28;
                do
                {
                    v23 = v22 + 1;
                    v20 -= 320;
                    k = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v22)) & 0x8080808080808080;
                    v22 = v23;
                } while (!k);
                a1->field_28 = v23;
                a1->field_18 = v20;
            }
            v25 = ((((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v26 = (((((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v27 = ((((v26 | v25) & 0xffff0000ffff0000) >> 16 | (v26 | v25) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v26 | v25) & 0xffff0000ffff0000) >> 16 | (v26 | v25) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v27)
                v28 = 64;
            else
                v28 = Clz(v27);
            a1->field_20 = k - 1 & k;
            v29 = v20 + (unsigned int)-(v28 >> 3) * 40;
            a1->field_38 = v19 - 1;
            if (!*(long long *)((char *)v29 - 40))
                goto LABEL_b9c418;
            v30 = *(long long *)((char *)v29 - 32);
            v31 = *(long long *)((char *)v29 - 24);
            j = *(long long *)((char *)v29 - 8);
            do
            {
                /* unsupported instruction */;
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            v32 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
            if (!(v32 & 1))
            {
                /* unsupported instruction */;
                sub_b86a90();
            }
            if (!v30)
                goto LABEL_b9c418;
            v33 = v31 * 48;
            v34 = &v30[-1 * v33] - 48;
            v35 = v31;
            if (!v31)
            {
                v36 = v34;
                v37 = v34;
                v38 = arm64g_calculate_condition(4, v35, 0, 0);
                if (!(v38 & 1))
                    goto LABEL_b9c3ce;
                goto LABEL_b9c3cd;
            }
            else
            {
                v36 = &v31[v33 + 57];
                v37 = v34;
                v39 = arm64g_calculate_condition(4, v35, 0, 0);
                if (v39 & 1)
                {
LABEL_b9c3cd:
                    v40 = 0;
                    continue;
                }
                else
                {
LABEL_b9c3ce:
                    v40 = 8;
                }
            }
            v41 = __dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), *(unsigned long long *)&*(double *)v30));
            if (v6->field_0 != 9223372036854775809)
                sub_b99bd4(v6);
            a1->field_40 = v40;
            a1->field_48 = v36;
            a1->field_50 = v37;
            a1->field_58 = v30;
            a1->field_60 = __double_as_longlong(v41) & 0x8080808080808080;
            a1->field_68 = v30 + 8;
            a1->field_70 = v30 + v31 + 1;
            a1->field_78 = j;
        } while (!j);
    }
    v42 = *(int128_t *)((char *)v17 - 24);
    v43 = a0;
    *(long long *)((char *)&v43->field_8 + 8) = *(long long *)((char *)v17 - 8);
    *(uint128_t *)&(&v43->field_0)[1] = v42;
    v43->field_0 = v18;
    return (unsigned long long)v42;
}
