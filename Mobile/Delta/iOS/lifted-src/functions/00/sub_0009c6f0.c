/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c6f0..0x9cbdc (1260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c6f0_1 {
    char padding_0[8];
    unsigned long long *field_8;
    char padding_10[12];
    unsigned int field_1c;
    char padding_20[8];
    unsigned int field_28;
    unsigned int field_2c;
    char padding_30[4];
    unsigned int field_34;
    unsigned long long field_38;
    unsigned int field_40;
    char padding_44[28];
    unsigned long long field_60;
    unsigned int field_68;
    char padding_6c[4];
    unsigned long long field_70;
    char padding_78[136];
    unsigned int field_100;
    char padding_104[8];
    unsigned int field_10c;
} st_9c6f0_1;

typedef struct st_9c6f0_2 {
    struct st_9c6f0_3 *field_0;
} st_9c6f0_2;

typedef struct st_9c6f0_3 {
    struct st_9c6f0_2 *field_0;
} st_9c6f0_3;

typedef struct st_9c6f0_0 {
    char field_0;
} st_9c6f0_0;

extern char g_10002b0;

unsigned long long sub_9c6f0(st_9c6f0_1 *a0, unsigned long long *a1, unsigned long a2, unsigned long long *a3)
{
    unsigned long v16;  // x12
    unsigned long v17;  // x11
    unsigned long v23;  // cc_ndep
    unsigned long long v24;  // 4112
    unsigned long long v25;  // 4108
    unsigned long v26;  // cc_op
    unsigned long v27;  // cc_dep1
    unsigned long v28;  // cc_dep2
    unsigned long long v29;  // 4112
    unsigned long long v30;  // 4108
    char v18;  // x15
    unsigned long long *v19;  // x23
    unsigned int v31;  // w13
    unsigned long long v32;  // x17
    unsigned int v33;  // w14
    unsigned int *v34;  // x16
    unsigned long v35;  // x3
    unsigned long long *v36;  // x4
    unsigned long v37;  // x1
    unsigned long v38;  // x2
    unsigned long long v39;  // 4120
    unsigned long long *v20;  // x8
    unsigned long j;  // x3
    unsigned long long idx;  // x7
    unsigned long v42;  // x22
    unsigned long long v43;  // x6
    char *v44;  // x6
    unsigned int v45;  // w24
    unsigned long long v46;  // x25
    unsigned long long index;  // x24
    unsigned long long v48;  // x4
    unsigned long long v49;  // x5
    unsigned int v21;  // w9
    unsigned int v50;  // w6
    unsigned int v51;  // w6
    unsigned long long k;  // w4
    unsigned long v53;  // x24
    unsigned long long v54;  // w4
    char v56;  // x5
    unsigned long long i;  // x3
    unsigned long long idx1;  // x28
    unsigned long long v59;  // x27
    unsigned int v22;  // w13
    char *v60;  // x27
    unsigned int v61;  // w10
    unsigned long long v62;  // x13
    unsigned long long idx2;  // x10
    unsigned long long v64;  // x13
    unsigned long v65;  // x10
    unsigned int *v66;  // x12
    void* v67;  // x11
    unsigned long long v68;  // x17
    __m128i v69;  // q0
    __m128i v70;  // q1
    unsigned long long v72;  // x10
    unsigned long long v73;  // x24
    unsigned long long v74;  // x16
    unsigned long long v75;  // w10
    unsigned long long v76;  // 4128
    unsigned long long v77;  // 4130
    unsigned long long v78;  // x1
    unsigned int v79;  // w1
    unsigned long long v80;  // w1
    unsigned long long v81;  // x1
    unsigned long long v82;  // x16
    unsigned int v83;  // w9
    unsigned long long v84;  // x10
    unsigned long long v85;  // x9
    unsigned int v86;  // w10
    st_9c6f0_3 **v87;  // x27
    unsigned long long v88;  // x22
    unsigned long long v89;  // x24
    unsigned long v90;  // x28
    unsigned long long v91;  // x0
    unsigned int v0;  // [bp-0x1bc]
    st_9c6f0_0 **v1;  // [bp-0x1b8], Other Possible Types: char
    st_9c6f0_0 *v2;  // [bp-0x1b0]
    st_9c6f0_0 **v3;  // [bp-0x1a8], Other Possible Types: char
    st_9c6f0_0 *v4;  // [bp-0x1a0]
    st_9c6f0_0 **v5;  // [bp-0x198], Other Possible Types: char
    st_9c6f0_0 *v6;  // [bp-0x190]
    char *v7;  // [bp-0x188], Other Possible Types: st_9c6f0_0 *
    st_9c6f0_0 **v8;  // [bp-0x180]
    st_9c6f0_3 **v9;  // [bp-0x178]
    st_9c6f0_3 **v10;  // [bp-0x170]
    st_9c6f0_3 **v11;  // [bp-0x170], Other Possible Types: unsigned long
    st_9c6f0_3 **v12;  // [bp-0x170]
    unsigned long v13;  // [bp-0x70]
    char *v14;  // [bp-0x10]
    char v15;  // [bp+0x0]

    v14 = &v15;
    v13 = *(long long *)&g_10002b0;
    v2 = &v1;
    v1 = &v2;
    v16 = a0->field_70;
    v17 = a0->field_38;
    v18 = a0->field_34;
    v19 = a0->field_8;
    v20 = a1 - v19;
    v21 = 1 << ((char)a0->field_100 & 31);
    v22 = a0->field_1c;
    if (v21 < (unsigned int)(unsigned long long *)((char *)v20 - a0->field_1c))
    {
        v24 = arm64g_calculate_condition(v26 | 128, v27, v28, v23);
        v25 = arm64g_calculate_condition(3, (v24 & 1 ? a0->field_28 : 0), 0, 0);
        if (!(v25 & 1))
            goto LABEL_9c782;
LABEL_9c781:
        v22 = (unsigned int)(unsigned long long *)((char *)v20 - v21);
    }
    else
    {
        v29 = arm64g_calculate_condition(v26 | 128, v27, v28, v23);
        v30 = arm64g_calculate_condition(0, (v29 & 1 ? a0->field_28 : 0), 0, 0);
        if (v30 & 1)
            goto LABEL_9c781;
LABEL_9c782:
    }
    v31 = a0->field_10c;
    if (a0->field_10c >= 4)
        v31 = 4;
    v32 = a0->field_60;
    if (a0[1].field_1c)
    {
        v33 = (0xcf1bbcdcbb000000 * *a1 ^ v32) >> ((char)(56 - v18) & 63);
        a0->field_2c = (unsigned int)v20;
    }
    else
    {
        v0 = v31;
        v34 = &a0->field_40;
        v4 = &v3;
        v3 = &v4;
        v35 = a0->field_2c;
        if (385 > (unsigned int)(unsigned long long *)((char *)v20 - v35))
        {
            v36 = v19;
            v37 = v17;
            v38 = v16;
            v6 = &v5;
            v5 = &v6;
            if ((unsigned int)v20 > (unsigned int)v35)
                goto LABEL_9c80c;
        }
        else
        {
            v37 = v17;
            v38 = v16;
            v39 = arm64g_calculate_condition(129, v35 & 0xffffffff, 97, 0);
            if (!(v39 & 1))
            {
                j = v35;
                do
                {
                    idx = j & 7;
                    v42 = v34[idx];
                    v34[idx] = (0xcf1bbcdcbb000000 * *(long long *)((char *)v19 + j + 8) ^ a0->field_60) >> ((char)(56 - v18) & 63);
                    v43 = v42 >> 4 & 0xffffff0;
                    v44 = v17 + v43;
                    v45 = *v44 - 1;
                    if (!(v45 & 15))
                        v46 = 15;
                    else
                        v46 = 0;
                    index = v46 + (v45 & 15);
                    *v44 = index;
                    v44[index] = v42;
                    *(unsigned int *)(v16 + v43 * 4 + index * 4) = j;
                    j += 1;
                } while (v35 + 96 != j);
                v38 = a0->field_70;
                v37 = a0->field_38;
            }
            v35 = (unsigned int)v20 - 32;
            v48 = (char *)a1 + 1;
            v8 = &v7;
            v7 = &v8;
            v49 = (char *)v19 + v35;
            v50 = v48 - v49;
            if (8 <= v50 + 1)
                v51 = 8;
            else
                v51 = v50 + 1;
            if (v48 < v49)
                k = 0;
            else
                k = v51;
            if (k + (unsigned int)v35 > (unsigned int)v35)
            {
                v11 = v10;
                v53 = v35;
                do
                {
                    v54 = k;
                    v9 = &v11;
                    v11 = &v9;
                    v34[v53 & 7] = (0xcf1bbcdcbb000000 * *(long long *)((char *)v19 + v53) ^ a0->field_60) >> ((char)(56 - a0->field_34) & 63);
                    v53 += 1;
                    k = v54 - 1;
                } while (k);
            }
            v36 = a0->field_8;
            v6 = &v5;
            v5 = &v6;
            if ((unsigned int)v35 < (unsigned int)v20)
            {
LABEL_9c80c:
                v56 = 56 - a0->field_34;
                i = v35 & 0xffffffff;
                v11 = v10;
                do
                {
                    v7 = &v8;
                    v8 = &v7;
                    v9 = &v11;
                    v12 = &v9;
                    idx1 = i & 7;
                    x30 = v34[idx1];
                    v34[idx1] = (0xcf1bbcdcbb000000 * *(long long *)((char *)v36 + i + 8) ^ a0->field_60) >> (v56 & 63);
                    v59 = (unsigned int)(x30) >> 4 & 0xffffff0;
                    v60 = v37 + v59;
                    v9 = &v12;
                    v11 = &v9;
                    v61 = *v60 - 1;
                    if (!(v61 & 15))
                        v62 = 15;
                    else
                        v62 = 0;
                    idx2 = v62 + (v61 & 15);
                    *v60 = idx2;
                    v60[idx2] = x30;
                    *(unsigned int *)(v38 + v59 * 4 + idx2 * 4) = i;
                    i += 1;
                } while (i < (v20 & 0xffffffff));
            }
        }
        a0->field_2c = (unsigned int)v20;
        v64 = v20 & 7;
        v33 = v34[v64];
        v34[v64] = (0xcf1bbcdcbb000000 * *(long long *)((char *)v19 + (v20 & 0xffffffff) + 8) ^ v32) >> ((char)(56 - v18) & 63);
        v31 = v0;
    }
    a0->field_68 = a0->field_68 + v33;
    v65 = v33 >> 4 & 0xffffff0;
    v66 = v16 + v65 * 4;
    v67 = v17 + v65;
    v68 = *(char *)v67 * 4;
    v69 = *(int128_t *)v67;
    v70 = (__m128i)(CONCAT(v33 & 0xff | (v33 & 0xff) * 0x100 | (v33 & 0xff | (v33 & 0xff) * 0x100) * 0x10000 | (v33 & 0xff | (v33 & 0xff) * 0x100 | (v33 & 0xff | (v33 & 0xff) * 0x100) * 0x10000) * 0x100000000, v33 & 0xff | (v33 & 0xff) * 0x100 | (v33 & 0xff | (v33 & 0xff) * 0x100) * 0x10000 | (v33 & 0xff | (v33 & 0xff) * 0x100 | (v33 & 0xff | (v33 & 0xff) * 0x100) * 0x10000) * 0x100000000));
    v72 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(_mm_cmpeq_epi8(v69, v70), 4), _mm_srli_epi16(_mm_cmpeq_epi8(v69, v70), 4)));
    if (v68 & 63)
        v72 = v72 << (char)(64 - (v68 & 63)) | v72 >> ((char)v68 & 63);
    v73 = 0;
    v74 = v72 & 0x8888888888888888;
    if (v72 & 0x8888888888888888)
    {
        v75 = 1 << ((char)v31 & 31);
        do
        {
            v76 = ((((((v74 & 0xaaaaaaaaaaaaaaaa) >> 1 | v74 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v74 & 0xaaaaaaaaaaaaaaaa) >> 1 | v74 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v74 & 0xaaaaaaaaaaaaaaaa) >> 1 | v74 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v74 & 0xaaaaaaaaaaaaaaaa) >> 1 | v74 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v77 = (((((((v74 & 0xaaaaaaaaaaaaaaaa) >> 1 | v74 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v74 & 0xaaaaaaaaaaaaaaaa) >> 1 | v74 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v74 & 0xaaaaaaaaaaaaaaaa) >> 1 | v74 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v74 & 0xaaaaaaaaaaaaaaaa) >> 1 | v74 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v78 = ((((v77 | v76) & 0xffff0000ffff0000) >> 16 | (v77 | v76) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v77 | v76) & 0xffff0000ffff0000) >> 16 | (v77 | v76) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v78)
                v79 = 64;
            else
                v79 = Clz(v78);
            v80 = __ROL__(v79 + ((unsigned int)v68 & 252), 30) & 0xc000000f & 15;
            if (!v80)
                continue;
            if (v66[v80] < v22)
                break;
            *(unsigned int *)((char *)&v11 + 4 * v73) = v66[v80];
            v73 += 1;
            v75 -= 1;
        } while ((v81 = v74 - 1, v82 = v81 & v74, v81 & v74 && (v74 &= v81, v75)));
    }
    v83 = (char)_mm_extract_epi8(v69, 0) - 1;
    if (!(v83 & 15))
        v84 = 15;
    else
        v84 = 0;
    v85 = v84 + (v83 & 15);
    *(char *)v67 = v85;
    *((char *)v67 + v85) = v33;
    v86 = a0->field_2c;
    a0->field_2c = v86 + 1;
    v66[v85] = v86;
    if (v73)
    {
        v87 = &v11;
        v88 = 3;
        do
        {
            v89 = v73;
            v90 = *(int *)v87;
            v87 = (char *)v87 + 4;
            if (*(int *)((char *)v19 + v90 + v88 - 3) == *(int *)((char *)a1 + v88 - 3) && !(v91 = sub_7cdfc(a1), v91 <= v88 || (*a3 = (unsigned int)v20 + 3 - v90, v88 = v91, (char *)a1 + v91 != a2)))
                break;
        } while ((v73 = v89 - 1, v89 != 1));
    }
    else
    {
        v88 = 3;
    }
    if (*(long long *)&g_10002b0 == v13)
        return v88;
    ___stack_chk_fail();
}
