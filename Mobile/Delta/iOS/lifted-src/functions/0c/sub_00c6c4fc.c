/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc6c4fc..0xc6c9ec (1264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c6c4fc_0 {
    void* field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_c6c4fc_0;

extern long long g_efbad0;

unsigned long long sub_c6c4fc(st_c6c4fc_0 *a0)
{
    unsigned long v2;  // x21
    unsigned long long v3;  // x9
    unsigned long long v12;  // 4112
    unsigned long long v13;  // x8
    unsigned long long v14;  // x8
    unsigned long long v15;  // x8
    unsigned long long v16;  // 4115
    st_c6c4fc_0 *v17;  // x24
    unsigned long long ptr;  // x0
    unsigned long long v19;  // x9
    st_c6c4fc_0 *v20;  // x8
    void* v21;  // x11
    unsigned long long v4;  // 4145
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
    uint128_t *v52;  // x15
    uint128_t v53;  // q1
    void* v54;  // x15
    void* iter;  // x10
    unsigned long long v56;  // x9
    uint128_t v57;  // q1
    unsigned long long v60;  // x8
    unsigned long long v61;  // x8
    unsigned long long v8;  // x11
    void* v62;  // x11
    unsigned long long v63;  // x14
    unsigned long long v64;  // x13
    unsigned long long v65;  // x15
    unsigned long v66;  // d0
    unsigned long long l;  // x1
    unsigned long long v68;  // x16
    unsigned long long v69;  // x17
    unsigned long long v71;  // 4128
    unsigned long long v9;  // x23
    unsigned long long v72;  // 4130
    unsigned long long v73;  // x17
    unsigned long long v74;  // x17
    unsigned long long v75;  // x16
    unsigned long v77;  // x16
    unsigned long long v78;  // 4137
    unsigned long long v79;  // 4139
    unsigned long long v80;  // x16
    unsigned long long v81;  // x16
    unsigned long long v10;  // x22
    void* v82;  // x15
    unsigned int v83;  // w17
    char v84;  // x14
    unsigned long v85;  // x13
    unsigned long v86;  // x13
    unsigned long v87;  // x13
    unsigned long v88;  // x13
    char v89;  // x11
    unsigned long long v90;  // x12
    uint128_t v91;  // q1
    void* v11;  // x19
    void* v92;  // x9
    unsigned long long v93;  // x10
    unsigned long long v94;  // x8
    unsigned long long v95;  // 4118
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_18;
    v3 = v2 + 1;
    v4 = arm64g_calculate_condition(0x22, v2, 1, 0);
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
                v10 = v9 * 32;
                v5 = v9 + 8;
                v11 = v5 + v10;
                v12 = arm64g_calculate_condition(50, v5, v10, 0);
                if (v12 & 1)
                {
LABEL_c6c808:
                    if (0x7ffffffffffffff8 >= v11)
                    {
                        v17 = a0;
                        ptr = _malloc(v11);
                        if (ptr)
                        {
                            v11 = ptr + v10;
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
                                    v34 = 5871781006564002453 * (*(long long *)((char *)v21 + -32 * v33 - 32) + 8);
                                    v35 = v10 & v34;
                                    v36 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(long long *)((char *)v11 + v35)));
                                    k = __double_as_longlong(v36);
                                    if (!k)
                                    {
                                        v38 = 8;
                                        do
                                        {
                                            v35 = v35 + v38 & v10;
                                            k = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)(unsigned long long)*(long long *)((char *)v11 + v35)));
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
                                    if (*((char *)v11 + v44) >= 0)
                                    {
                                        v46 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v11));
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
                                    *((char *)v11 + v44) = v51;
                                    *((char *)v11 + (v44 - 8 & v10) + 8) = v51;
                                    v52 = v21 + ~v33 * 32;
                                    v53 = v52[1];
                                    v54 = v11 + ~v44 * 32;
                                    *(uint128_t *)v54 = *v52;
                                    *(uint128_t *)&v54[16] = v53;
                                    j -= 1;
                                } while (j);
                                goto LABEL_c6c98c;
                            }
                            goto LABEL_c6c988;
                        }
                        else
                        {
                            a0 = sub_c6ba70(8, v11);
                        }
LABEL_c6c9d0:
                        _memmove(v11 + 8, v11, v5 + 1);
LABEL_c6c5bc:
                        v60 = 0;
                        do
                        {
                            v61 = v60;
                            if (*((char *)v11 + v61) == 128)
                            {
                                v62 = v11 + ~v61 * 32;
                                while (1)
                                {
                                    v63 = 5871781006564002453 * (*(long long *)((char *)v11 + 32 * -v61 - 32) + 8);
                                    v64 = a0->field_8;
                                    v65 = v64 & v63;
                                    v66 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(long long *)((char *)v11 + v65)));
                                    l = __double_as_longlong(v66);
                                    if (l)
                                    {
                                        v68 = v64 & v63;
                                    }
                                    else
                                    {
                                        v69 = 8;
                                        v68 = v64 & v63;
                                        do
                                        {
                                            v68 = v68 + v69 & v64;
                                            l = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)(unsigned long long)*(long long *)((char *)v11 + v68)));
                                            v69 += 8;
                                        } while (!l);
                                    }
                                    v71 = ((((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                    v72 = (((((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                    v73 = ((((v72 | v71) & 0xffff0000ffff0000) >> 16 | (v72 | v71) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v72 | v71) & 0xffff0000ffff0000) >> 16 | (v72 | v71) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                    if (!v73)
                                        v74 = 64;
                                    else
                                        v74 = Clz(v73);
                                    v75 = v68 + (v74 >> 3) & v64;
                                    if (*((char *)v11 + v75) < 0)
                                    {
                                        if (((v75 - v65 ^ v61 - v65) & v64) < 8)
                                            goto LABEL_c6c704;
                                    }
                                    else
                                    {
                                        v77 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v11));
                                        v78 = ((((((v77 & 0xaaaaaaaaaaaaaaaa) >> 1 | v77 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v77 & 0xaaaaaaaaaaaaaaaa) >> 1 | v77 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v77 & 0xaaaaaaaaaaaaaaaa) >> 1 | v77 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v77 & 0xaaaaaaaaaaaaaaaa) >> 1 | v77 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                        v79 = (((((((v77 & 0xaaaaaaaaaaaaaaaa) >> 1 | v77 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v77 & 0xaaaaaaaaaaaaaaaa) >> 1 | v77 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v77 & 0xaaaaaaaaaaaaaaaa) >> 1 | v77 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v77 & 0xaaaaaaaaaaaaaaaa) >> 1 | v77 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                        v80 = ((((v79 | v78) & 0xffff0000ffff0000) >> 16 | (v79 | v78) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v79 | v78) & 0xffff0000ffff0000) >> 16 | (v79 | v78) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                        if (!v80)
                                            v81 = 64;
                                        else
                                            v81 = Clz(v80);
                                        v75 = v81 >> 3;
                                        if (8 > ((v75 - v65 ^ v61 - v65) & v64))
                                        {
LABEL_c6c704:
                                            v89 = v63 >> 57;
                                            *((char *)v11 + v61) = v89;
                                            v11 = a0->field_0;
                                            *((char *)v11 + (v64 & v61 - 8) + 8) = v89;
                                            break;
                                        }
                                    }
                                    v82 = v11 + ~v75 * 32;
                                    v83 = *((char *)v11 + v75);
                                    v84 = v63 >> 57;
                                    *((char *)v11 + v75) = v84;
                                    v11 = a0->field_0;
                                    *((char *)v11 + (v75 - 8 & v64) + 8) = v84;
                                    if (v83 != 0xff)
                                    {
                                        v85 = *(long long *)v62;
                                        *(long long *)v62 = *(long long *)v82;
                                        *(unsigned long *)v82 = v85;
                                        v86 = (long long)v62[8];
                                        *(long long *)&v62[8] = (long long)v82[8];
                                        *(unsigned long *)&v82[8] = v86;
                                        v87 = (long long)v62[16];
                                        *(long long *)&v62[16] = (long long)v82[16];
                                        *(unsigned long *)&v82[16] = v87;
                                        v88 = (long long)v62[24];
                                        *(long long *)&v62[24] = (long long)v82[24];
                                        *(unsigned long *)&v82[24] = v88;
                                        v11 = a0->field_0;
                                    }
                                    else
                                    {
                                        v90 = a0->field_8 & v61 - 8;
                                        *((char *)v11 + v61) = 0xff;
                                        *((char *)v11 + v90 + 8) = 0xff;
                                        v91 = (int128_t)v62[16];
                                        *(int128_t *)v82 = *(int128_t *)v62;
                                        *(uint128_t *)&v82[16] = v91;
                                        break;
                                    }
                                }
                            }
                        } while ((v60 = v61 + 1, v61 != v5));
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
                if (0x7fffffffffffffe >= v15)
                {
                    v9 = v15 + 1;
                    v10 = v9 * 32;
                    v5 = v9 + 8;
                    v11 = v5 + v10;
                    v16 = arm64g_calculate_condition(0x22, v5, v10, 0);
                    if (!(v16 & 1))
                        goto LABEL_c6c808;
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
            v11 = a0->field_0;
            if (v6 & 7)
                i += 1;
            iter = v11;
            do
            {
                v56 = i;
                v57 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), *(unsigned long long *)&*(double *)iter));
                *(unsigned long long *)iter = __dirty_unsupported_Iop_ZeroHI64ofV128(v57 | 0x8080808080808080);
                iter += 8;
                i = v56 - 1;
            } while (i);
            if (v6 >= 8)
            {
                *(long long *)((char *)v11 + v6) = *(long long *)v11;
                goto LABEL_c6c5bc;
            }
            goto LABEL_c6c9d0;
        }
    }
    sub_c73b38("Hash table capacity overflow", 57, &g_efbad0);
LABEL_c6c988:
    v20 = v17;
LABEL_c6c98c:
    v92 = v20->field_0;
    v93 = v20->field_8;
    v20->field_0 = v11;
    v20->field_8 = v10;
    v20->field_10 = v9 - v2;
    v20->field_18 = v2;
    if (!v93)
        return 9223372036854775809;
    v94 = v93 * 32 + 39 & 0xffffffffffffffe0;
    v95 = arm64g_calculate_condition(2, v93 + v94, 9, 0);
    if (!(v95 & 1))
    {
        _free(v92 - v94);
        return 9223372036854775809;
    }
    return 9223372036854775809;
}
