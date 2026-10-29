/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc6e2f4..0xc6e7ac (1208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c6e2f4_0 {
    void* field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_c6e2f4_0;

extern long long g_efbad0;

unsigned long long sub_c6e2f4(st_c6e2f4_0 *a0, unsigned long a1)
{
    unsigned long v2;  // x21
    unsigned long long v3;  // x9
    unsigned long long v12;  // 4112
    unsigned long long v13;  // x8
    unsigned long long v14;  // x8
    unsigned long long v15;  // x8
    unsigned long long v16;  // 4115
    st_c6e2f4_0 *v17;  // x24
    unsigned long long ptr;  // x0
    unsigned long long v19;  // x9
    st_c6e2f4_0 *v20;  // x8
    void* v21;  // x11
    unsigned long long v4;  // 4146
    unsigned long v22;  // d0
    unsigned long long v23;  // x14
    void* v24;  // x12
    unsigned long j;  // x13
    void* v26;  // x12
    unsigned long v28;  // x14
    unsigned long long v29;  // 4128
    unsigned long long v30;  // 4130
    unsigned long long v31;  // x15
    unsigned long long v5;  // x20
    unsigned long long v32;  // x15
    unsigned long long v33;  // x15
    unsigned long long v34;  // x16
    unsigned long long v35;  // x17
    unsigned long v36;  // d0
    unsigned long long k;  // x1
    unsigned long long v38;  // x0
    unsigned long long v40;  // 4128
    unsigned long long v41;  // 4130
    unsigned long long v6;  // x8
    unsigned long long v42;  // x0
    unsigned long long v43;  // x0
    unsigned long long v44;  // x17
    unsigned long v46;  // x17
    unsigned long long v47;  // 4137
    unsigned long long v48;  // 4139
    unsigned long long v49;  // x17
    unsigned long long v50;  // x17
    char v51;  // x16
    unsigned long long i;  // x10
    void* iter;  // x10
    unsigned long long v53;  // x9
    uint128_t v54;  // q1
    unsigned long long v57;  // x8
    unsigned long long v58;  // x8
    unsigned long long index;  // x12
    void* v60;  // x11
    unsigned long long v61;  // x15
    unsigned long long v8;  // x11
    unsigned long long v62;  // x14
    unsigned long long v63;  // x16
    unsigned long v64;  // d0
    unsigned long long l;  // x2
    unsigned long long v66;  // x17
    unsigned long long v67;  // x1
    unsigned long long v69;  // 4128
    unsigned long long v70;  // 4130
    unsigned long long v71;  // x1
    unsigned long long v9;  // x23
    unsigned long long v72;  // x1
    unsigned long long v73;  // x17
    unsigned long v75;  // x17
    unsigned long long v76;  // 4137
    unsigned long long v77;  // 4139
    unsigned long long v78;  // x17
    unsigned long long v79;  // x17
    unsigned long long idx;  // x16
    unsigned int v81;  // w1
    unsigned long long v10;  // x22
    char v82;  // x15
    void* v83;  // x14
    unsigned long v84;  // x14
    char v85;  // x12
    unsigned long long v86;  // x13
    void* v87;  // x9
    unsigned long long v88;  // x10
    unsigned long long v89;  // x8
    unsigned long long v90;  // 4118
    void* ptr1;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_18;
    v3 = v2 + a1;
    v4 = arm64g_calculate_condition(0x22, v2, a1, 0);
    if (!(v4 & 1))
    {
        v5 = a0->field_8;
        v6 = v5 + 1;
        i = v6 >> 3;
        v8 = i * 7;
        if (v5 < 8)
            v8 = v5;
        if (v3 > v8 >> 1)
        {
            if (v8 + 1 > v3)
                v3 = v8 + 1;
            if (15 > v3)
            {
                if (v3 < 4)
                    v9 = 4;
                else
                    v9 = (v3 & 8) + 8;
                v10 = v9 * 8;
                v5 = v9 + 8;
                ptr1 = v5 + v10;
                v12 = arm64g_calculate_condition(50, v5, v10, 0);
                if (v12 & 1)
                {
LABEL_c6e5d0:
                    if (0x7ffffffffffffff8 >= ptr1)
                    {
                        v17 = a0;
                        ptr = _malloc(ptr1);
                        if (ptr)
                        {
                            ptr1 = ptr + v10;
                            v10 = v9 - 1;
                            if (v9 < 9)
                                v9 = v10;
                            else
                                v9 = (v9 >> 3) * 7;
                            _memset();
                            if (v2)
                            {
                                v19 = 0;
                                v20 = v17;
                                v21 = v17->field_0;
                                v22 = __dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), *(unsigned long long *)&*(double *)v21));
                                v23 = __double_as_longlong(v22) & 0x8080808080808080;
                                v24 = v21;
                                j = v2;
                                do
                                {
                                    if (!v23)
                                    {
                                        do
                                        {
                                            v26 = v24 + 8;
                                            v28 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)__double_as_longlong((double)v24[8])));
                                            v19 += 8;
                                            v23 = v28 & 0x8080808080808080;
                                        } while (!(v28 & 0x8080808080808080));
                                    }
                                    v29 = ((((((v23 & 0xaaaaaaaaaaaaaaaa) >> 1 | v23 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v23 & 0xaaaaaaaaaaaaaaaa) >> 1 | v23 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v23 & 0xaaaaaaaaaaaaaaaa) >> 1 | v23 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v23 & 0xaaaaaaaaaaaaaaaa) >> 1 | v23 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                    v30 = (((((((v23 & 0xaaaaaaaaaaaaaaaa) >> 1 | v23 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v23 & 0xaaaaaaaaaaaaaaaa) >> 1 | v23 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v23 & 0xaaaaaaaaaaaaaaaa) >> 1 | v23 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v23 & 0xaaaaaaaaaaaaaaaa) >> 1 | v23 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                    v31 = ((((v30 | v29) & 0xffff0000ffff0000) >> 16 | (v30 | v29) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v30 | v29) & 0xffff0000ffff0000) >> 16 | (v30 | v29) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                    if (!v31)
                                        v32 = 64;
                                    else
                                        v32 = Clz(v31);
                                    v33 = v19 + (v32 >> 3);
                                    v34 = 5871781006564002453 * (*(long long *)((char *)v21 + -8 * v33 - 8) + 8);
                                    v35 = v10 & v34;
                                    v36 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(long long *)((char *)ptr1 + v35)));
                                    k = __double_as_longlong(v36);
                                    if (!k)
                                    {
                                        v38 = 8;
                                        do
                                        {
                                            v35 = v35 + v38 & v10;
                                            k = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)(unsigned long long)*(long long *)((char *)ptr1 + v35)));
                                            v38 += 8;
                                        } while (!k);
                                    }
                                    v40 = ((((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                    v41 = (((((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                    v42 = ((((v41 | v40) & 0xffff0000ffff0000) >> 16 | (v41 | v40) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v41 | v40) & 0xffff0000ffff0000) >> 16 | (v41 | v40) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                    if (!v42)
                                        v43 = 64;
                                    else
                                        v43 = Clz(v42);
                                    v44 = v35 + (v43 >> 3) & v10;
                                    if (*((char *)ptr1 + v44) >= 0)
                                    {
                                        v46 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)ptr1));
                                        v47 = ((((((v46 & 0xaaaaaaaaaaaaaaaa) >> 1 | v46 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v46 & 0xaaaaaaaaaaaaaaaa) >> 1 | v46 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v46 & 0xaaaaaaaaaaaaaaaa) >> 1 | v46 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v46 & 0xaaaaaaaaaaaaaaaa) >> 1 | v46 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                        v48 = (((((((v46 & 0xaaaaaaaaaaaaaaaa) >> 1 | v46 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v46 & 0xaaaaaaaaaaaaaaaa) >> 1 | v46 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v46 & 0xaaaaaaaaaaaaaaaa) >> 1 | v46 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v46 & 0xaaaaaaaaaaaaaaaa) >> 1 | v46 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                        v49 = ((((v48 | v47) & 0xffff0000ffff0000) >> 16 | (v48 | v47) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v48 | v47) & 0xffff0000ffff0000) >> 16 | (v48 | v47) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                        if (!v49)
                                            v50 = 64;
                                        else
                                            v50 = Clz(v49);
                                        v44 = v50 >> 3;
                                    }
                                    v23 &= v23 - 1;
                                    v51 = v34 >> 57;
                                    *((char *)ptr1 + v44) = v51;
                                    *((char *)ptr1 + (v44 - 8 & v10) + 8) = v51;
                                    *(long long *)((char *)ptr1 + 8 * ~v44) = *(long long *)((char *)v21 + 8 * ~v33);
                                    j -= 1;
                                } while (j);
                                goto LABEL_c6e74c;
                            }
                            goto LABEL_c6e748;
                        }
                        else
                        {
                            a0 = sub_c6ba70(8, ptr1);
                        }
LABEL_c6e790:
                        _memmove(ptr1 + 8, ptr1, v5 + 1);
LABEL_c6e3b4:
                        v57 = 0;
                        do
                        {
                            v58 = v57;
                            if (*((char *)ptr1 + v58) == 128)
                            {
                                index = ~v58;
                                v60 = ptr1;
                                while (1)
                                {
                                    v61 = 5871781006564002453 * (*(long long *)((char *)v60 + 8 * -v58 - 8) + 8);
                                    v62 = a0->field_8;
                                    v63 = v62 & v61;
                                    v64 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(long long *)((char *)v60 + v63)));
                                    l = __double_as_longlong(v64);
                                    if (l)
                                    {
                                        v66 = v62 & v61;
                                    }
                                    else
                                    {
                                        v67 = 8;
                                        v66 = v62 & v61;
                                        do
                                        {
                                            v66 = v66 + v67 & v62;
                                            l = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)(unsigned long long)*(long long *)((char *)v60 + v66)));
                                            v67 += 8;
                                        } while (!l);
                                    }
                                    v69 = ((((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                    v70 = (((((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                    v71 = ((((v70 | v69) & 0xffff0000ffff0000) >> 16 | (v70 | v69) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v70 | v69) & 0xffff0000ffff0000) >> 16 | (v70 | v69) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                    if (!v71)
                                        v72 = 64;
                                    else
                                        v72 = Clz(v71);
                                    v73 = v66 + (v72 >> 3) & v62;
                                    if (*((char *)v60 + v73) < 0)
                                    {
                                        if (((v73 - v63 ^ v58 - v63) & v62) < 8)
                                            goto LABEL_c6e4c8;
                                    }
                                    else
                                    {
                                        v75 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v60));
                                        v76 = ((((((v75 & 0xaaaaaaaaaaaaaaaa) >> 1 | v75 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v75 & 0xaaaaaaaaaaaaaaaa) >> 1 | v75 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v75 & 0xaaaaaaaaaaaaaaaa) >> 1 | v75 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v75 & 0xaaaaaaaaaaaaaaaa) >> 1 | v75 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                        v77 = (((((((v75 & 0xaaaaaaaaaaaaaaaa) >> 1 | v75 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v75 & 0xaaaaaaaaaaaaaaaa) >> 1 | v75 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v75 & 0xaaaaaaaaaaaaaaaa) >> 1 | v75 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v75 & 0xaaaaaaaaaaaaaaaa) >> 1 | v75 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                        v78 = ((((v77 | v76) & 0xffff0000ffff0000) >> 16 | (v77 | v76) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v77 | v76) & 0xffff0000ffff0000) >> 16 | (v77 | v76) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                        if (!v78)
                                            v79 = 64;
                                        else
                                            v79 = Clz(v78);
                                        v73 = v79 >> 3;
                                        if (8 > ((v73 - v63 ^ v58 - v63) & v62))
                                        {
LABEL_c6e4c8:
                                            v85 = v61 >> 57;
                                            *((char *)v60 + v58) = v85;
                                            ptr1 = a0->field_0;
                                            *((char *)ptr1 + (v62 & v58 - 8) + 8) = v85;
                                            break;
                                        }
                                    }
                                    idx = ~v73;
                                    v81 = *((char *)v60 + v73);
                                    v82 = v61 >> 57;
                                    *((char *)v60 + v73) = v82;
                                    v83 = a0->field_0;
                                    *((char *)v83 + (v73 - 8 & v62) + 8) = v82;
                                    if (v81 != 0xff)
                                    {
                                        v84 = *(long long *)((char *)ptr1 + 8 * index);
                                        *(long long *)((char *)ptr1 + 8 * index) = *(long long *)((char *)v60 + 8 * idx);
                                        *(unsigned long *)((char *)v60 + 8 * idx) = v84;
                                        v60 = a0->field_0;
                                    }
                                    else
                                    {
                                        v86 = a0->field_8 & v58 - 8;
                                        *((char *)v83 + v58) = 0xff;
                                        *((char *)v83 + v86 + 8) = 0xff;
                                        *(long long *)((char *)v60 + 8 * idx) = *(long long *)((char *)ptr1 + 8 * index);
                                        ptr1 = v83;
                                        break;
                                    }
                                }
                            }
                        } while ((v57 = v58 + 1, v58 != v5));
                        v6 = a0->field_8;
                        if (v6 >= 8)
                        {
                            a0->field_10 = (v6 + 1 >> 3) * 7 - a0->field_18;
                            return 9223372036854775809;
                        }
                        a0->field_10 = v6 - a0->field_18;
                        return 9223372036854775809;
                    }
                }
            }
            else if (v3 <= 0x1fffffffffffffff)
            {
                v13 = v3 * 8 / 7 - 1;
                if (!v13)
                    v14 = 64;
                else
                    v14 = (char)Clz(v13);
                v15 = 0xffffffffffffffff >> (v14 & 63);
                if (0x1ffffffffffffffe >= v15)
                {
                    v9 = v15 + 1;
                    v10 = v9 * 8;
                    v5 = v9 + 8;
                    ptr1 = v5 + v10;
                    v16 = arm64g_calculate_condition(0x22, v5, v10, 0);
                    if (!(v16 & 1))
                        goto LABEL_c6e5d0;
                }
            }
        }
        else
        {
            if (!v6)
            {
                a0->field_10 = v6 - a0->field_18;
                return 9223372036854775809;
            }
            ptr1 = a0->field_0;
            if (v6 & 7)
                i += 1;
            iter = ptr1;
            do
            {
                v53 = i;
                v54 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(unsigned long long *)&*(double *)iter));
                *(unsigned long long *)iter = __dirty_unsupported_Iop_ZeroHI64ofV128(v54 | 0x8080808080808080);
                iter += 8;
                i = v53 - 1;
            } while (i);
            if (v6 >= 8)
            {
                *(long long *)((char *)ptr1 + v6) = *(long long *)ptr1;
                goto LABEL_c6e3b4;
            }
            goto LABEL_c6e790;
        }
    }
    sub_c73b38("Hash table capacity overflow", 57, &g_efbad0);
LABEL_c6e748:
    v20 = v17;
LABEL_c6e74c:
    v87 = v20->field_0;
    v88 = v20->field_8;
    v20->field_0 = ptr1;
    v20->field_8 = v10;
    v20->field_10 = v9 - v2;
    v20->field_18 = v2;
    if (!v88)
        return 9223372036854775809;
    v89 = v88 * 8 + 15 & 0xfffffffffffffff8;
    v90 = arm64g_calculate_condition(2, v88 + v89, 9, 0);
    if (!(v90 & 1))
    {
        _free(v87 - v89);
        return 9223372036854775809;
    }
    return 9223372036854775809;
}
