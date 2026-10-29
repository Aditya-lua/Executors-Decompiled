/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbdb3d8..0xbdb640 (616 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bdb3d8_1 {
    struct st_bdb3d8_0 *field_0;
    struct st_bdb3d8_0 *field_8;
    char padding_10[8];
    struct st_bdb3d8_0 *field_18;
} st_bdb3d8_1;

typedef struct st_bdb3d8_2 {
    long long field_0;
    double *field_8;
    char padding_10[16];
    unsigned long long field_20;
} st_bdb3d8_2;

typedef struct st_bdb3d8_0 {
    unsigned long long field_0;
    uint128_t field_8;
    uint128_t field_18;
} st_bdb3d8_0;


void sub_bdb3d8(unsigned long long *a0, st_bdb3d8_1 *a1)
{
    unsigned long long v22;  // x28
    unsigned long long v23;  // x27
    unsigned long long v32;  // x30
    unsigned long long v33;  // x14
    st_bdb3d8_0 *v34;  // x8
    unsigned long long v35;  // x15
    unsigned long long v36;  // x13
    st_bdb3d8_0 *i;  // x26
    unsigned long long iter;  // x10
    uint128_t v39;  // q0
    uint128_t v40;  // q1
    st_bdb3d8_0 *v41;  // x26
    unsigned long long v24;  // x26
    unsigned long long j;  // x27
    st_bdb3d8_2 *v43;  // x25
    unsigned long long v44;  // 4102
    unsigned long long v45;  // x20
    unsigned long k;  // x24
    double *v47;  // x21
    unsigned long long *v48;  // x22
    unsigned long long l;  // x19
    unsigned long long *v51;  // x22
    unsigned long long v25;  // x25
    unsigned long long v53;  // 4131
    unsigned long long v54;  // 4133
    unsigned long long v55;  // x9
    unsigned long long v56;  // x9
    unsigned long long v57;  // 4102
    unsigned long long v58;  // x8
    unsigned long long v59;  // 4112
    unsigned long long v60;  // x20
    unsigned long long v61;  // x22
    unsigned long long v26;  // x24
    unsigned long long ptr;  // x0
    unsigned long long v27;  // x23
    unsigned long long v28;  // x22
    unsigned long long v29;  // x21
    unsigned long long v30;  // x20
    unsigned long long v31;  // x19
    unsigned long long v0;  // [bp-0xd0]
    unsigned long long v1;  // [bp-0xc8]
    unsigned long long v2;  // [bp-0xb8]
    unsigned long long v3;  // [bp-0xb0]
    unsigned long long v4;  // [bp-0xa8]
    st_bdb3d8_1 *v5;  // [bp-0xa0]
    unsigned long long v6;  // [bp-0x98]
    unsigned long long v7;  // [bp-0x90]
    unsigned long long v8;  // [bp-0x88]
    unsigned long long v9;  // [bp-0x60]
    unsigned long long v10;  // [bp-0x58]
    unsigned long long v11;  // [bp-0x50]
    unsigned long long v12;  // [bp-0x48]
    unsigned long long v13;  // [bp-0x40]
    unsigned long long v14;  // [bp-0x38]
    unsigned long long v15;  // [bp-0x30]
    unsigned long long v16;  // [bp-0x28]
    unsigned long long v17;  // [bp-0x20]
    unsigned long long v18;  // [bp-0x18]
    char *v19;  // [bp-0x10]
    unsigned long long v20;  // [bp-0x8]
    char v21;  // [bp+0x0]

    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = v25;
    v13 = v26;
    v14 = v27;
    v15 = v28;
    v16 = v29;
    v17 = v30;
    v18 = v31;
    v19 = &v21;
    v20 = v32;
    v33 = (unsigned long long)a1->padding_10;
    v34 = a1->field_18;
    v35 = v33 * 48;
    v36 = a1->field_0;
    i = a1->field_8;
    v4 = v35 / 40;
    v0 = v35;
    iter = v36;
    if (i != v34)
    {
        do
        {
            v39 = *(int128_t *)((char *)&i->field_8 + 8);
            v40 = *(int128_t *)&(&i->field_0)[1];
            v41 = i + 1;
            *(unsigned long long *)iter = i->field_0;
            *(uint128_t *)(iter + 8) = v40;
            *(uint128_t *)(iter + 24) = v39;
            iter += 40;
            i = v41;
        } while (i != v34);
        a1->field_8 = v41;
        i = v41;
    }
    j = 0;
    v2 = v33;
    v3 = v36;
    v6 = v36;
    v7 = 14757395258967641293 * (iter - v36 >> 3);
    v1 = v7;
    v8 = v33;
    a1->field_0 = 8;
    a1->field_8 = 8;
    *(unsigned long long *)a1->padding_10 = 0;
    a1->field_18 = 8;
    v5 = a1;
    while (j != (v34 - i >> 4) * 12297829382473034411)
    {
        v43 = &i[j];
        j += 1;
        do
        {
            /* unsupported instruction */;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v44 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
        if (!(v44 & 1))
        {
            /* unsupported instruction */;
            sub_b86a90(v43->field_0);
        }
        v45 = *(long long *)&v43->padding_10[0];
        if (v45)
        {
            k = v43->field_20;
            if (v43->field_20)
            {
                v47 = v43->field_8;
                v48 = v43->field_8 + 1;
                l = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*v43->field_8)) & 0x8080808080808080;
                do
                {
                    v51 = v48;
                    if (!l)
                    {
                        do
                        {
                            v51 = v48 + 1;
                            v47 = (char *)v47 - 64;
                            l = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v48)) & 0x8080808080808080;
                            v48 = v51;
                        } while (!l);
                    }
                    v48 = v51;
                    v53 = ((((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v54 = (((((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v55 = ((((v54 | v53) & 0xffff0000ffff0000) >> 16 | (v54 | v53) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v54 | v53) & 0xffff0000ffff0000) >> 16 | (v54 | v53) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v55)
                        v56 = 64;
                    else
                        v56 = Clz(v55);
                    l &= l - 1;
                    k -= 1;
                    do
                    {
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                    } while (/* unsupported instruction */ ^ 1);
                    v57 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                    if (!(v57 & 1))
                    {
                        /* unsupported instruction */;
                        sub_b86a90(*(long long *)((char *)v47 - (v56 & 120) - 8));
                    }
                } while (k);
            }
            v58 = v45 * 8;
            v59 = arm64g_calculate_condition(2, v58 + v45, 0x11, 0);
            if (!(v59 & 1))
                _free((char *)v43->field_8 - v58 - 8);
        }
    }
    if (v2)
    {
        v60 = v4;
        v61 = v60 * 40;
        ptr = v3;
        if (v0 != v61)
        {
            if (39 >= v0)
            {
                if (v0)
                    _free();
                ptr = 8;
            }
            else
            {
                ptr = _realloc();
                if (!ptr)
                {
                    sub_c6ba70(8, v61);
                    __debugbreak();
                }
            }
        }
    }
    else
    {
        v60 = v4;
        ptr = v3;
    }
    *a0 = v60;
    a0[1] = ptr;
    a0[2] = v1;
    sub_be5c74();
    return;
}
