/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb98e3c..0xb98fd0 (404 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b98e3c_0 {
    double *field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
} st_b98e3c_0;


void sub_b98e3c(st_b98e3c_0 *a0)
{
    unsigned long long v14;  // x28
    unsigned long long v15;  // x27
    unsigned long long v24;  // x30
    unsigned long i;  // x21
    double *v26;  // x22
    unsigned long long *v27;  // x23
    unsigned long j;  // x25
    unsigned long long *v30;  // x23
    unsigned long long v32;  // 4128
    unsigned long long v33;  // 4130
    unsigned long long v16;  // x26
    unsigned long v34;  // x8
    unsigned long long v35;  // x8
    void* v36;  // x26
    unsigned long long v37;  // x27
    unsigned long k;  // x28
    double *v39;  // x19
    unsigned long long *v40;  // x20
    unsigned long l;  // x24
    unsigned long long *v43;  // x20
    unsigned long long v17;  // x25
    unsigned long long v45;  // 4131
    unsigned long long v46;  // 4133
    unsigned long v47;  // x9
    unsigned long long v48;  // x9
    unsigned long long v49;  // 4102
    unsigned long long v50;  // x8
    unsigned long long v51;  // 4112
    unsigned long long v52;  // 4175
    unsigned long long v18;  // x24
    unsigned long long v19;  // x23
    unsigned long long v20;  // x22
    unsigned long long v21;  // x21
    unsigned long long v22;  // x20
    unsigned long long v23;  // x19
    unsigned long long v0;  // [bp-0x70]
    unsigned long long v1;  // [bp-0x60]
    unsigned long long v2;  // [bp-0x58]
    unsigned long long v3;  // [bp-0x50]
    unsigned long long v4;  // [bp-0x48]
    unsigned long long v5;  // [bp-0x40]
    unsigned long long v6;  // [bp-0x38]
    unsigned long long v7;  // [bp-0x30]
    unsigned long long v8;  // [bp-0x28]
    unsigned long long v9;  // [bp-0x20]
    unsigned long long v10;  // [bp-0x18]
    char *v11;  // [bp-0x10]
    unsigned long long v12;  // [bp-0x8]
    char v13;  // [bp+0x0]

    if (!a0->field_8)
        return;
    v1 = v14;
    v2 = v15;
    v3 = v16;
    v4 = v17;
    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = &v13;
    v12 = v24;
    v0 = a0->field_8;
    i = a0->field_18;
    if (a0->field_18)
    {
        v26 = a0->field_0;
        v27 = a0->field_0 + 1;
        j = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*a0->field_0)) & 0x8080808080808080;
        do
        {
            v30 = v27;
            if (!j)
            {
                do
                {
                    v30 = v27 + 1;
                    v26 = (char *)v26 - 384;
                    j = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v27)) & 0x8080808080808080;
                    v27 = v30;
                } while (!j);
            }
            v27 = v30;
            v32 = ((((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v33 = (((((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v34 = ((((v33 | v32) & 0xffff0000ffff0000) >> 16 | (v33 | v32) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v33 | v32) & 0xffff0000ffff0000) >> 16 | (v33 | v32) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v34)
                v35 = 64;
            else
                v35 = Clz(v34);
            v36 = (char *)v26 + (unsigned int)-(v35 >> 3) * 48;
            v37 = *(long long *)((char *)v36 - 24);
            if (v37)
            {
                k = *(long long *)((char *)v36 - 8);
                if (*(long long *)((char *)v36 - 8))
                {
                    v39 = *(long long *)((char *)v36 - 32);
                    v40 = *(long long *)((char *)v36 - 32) + 8;
                    l = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)*(long long *)((char *)v36 - 32))) & 0x8080808080808080;
                    do
                    {
                        v43 = v40;
                        if (!l)
                        {
                            do
                            {
                                v43 = v40 + 1;
                                v39 = (char *)v39 - 64;
                                l = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v40)) & 0x8080808080808080;
                                v40 = v43;
                            } while (!l);
                        }
                        v40 = v43;
                        v45 = ((((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                        v46 = (((((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                        v47 = ((((v46 | v45) & 0xffff0000ffff0000) >> 16 | (v46 | v45) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v46 | v45) & 0xffff0000ffff0000) >> 16 | (v46 | v45) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                        if (!v47)
                            v48 = 64;
                        else
                            v48 = Clz(v47);
                        l &= l - 1;
                        k -= 1;
                        do
                        {
                            /* unsupported instruction */;
                            /* unsupported instruction */;
                            /* unsupported instruction */;
                        } while (/* unsupported instruction */ ^ 1);
                        v49 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                        if (!(v49 & 1))
                        {
                            /* unsupported instruction */;
                            sub_b86a90(*(long long *)((char *)v39 - (v48 & 120) - 8));
                        }
                    } while (k);
                }
                v50 = v37 * 8;
                v51 = arm64g_calculate_condition(2, v50 + v37, 0x11, 0);
                if (!(v51 & 1))
                    _free(*(long long *)((char *)v36 - 32) - v50 - 8);
            }
            j &= j - 1;
            i -= 1;
        } while (i);
    }
    v52 = arm64g_calculate_condition(2, v0 * 49, 57, 0);
    if (v52 & 1)
        return;
    _free();
    return;
}
