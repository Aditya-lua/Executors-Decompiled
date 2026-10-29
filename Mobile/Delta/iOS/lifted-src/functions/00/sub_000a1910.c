/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1910..0xa2048 (1848 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1910_6 {
    unsigned int field_0;
    char field_4;
    char padding_5[7];
    unsigned int field_c;
} st_a1910_6;

typedef struct st_a1910_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[96];
    unsigned long long field_70;
    char padding_78[8];
    unsigned long long field_80;
    char padding_88[128];
    unsigned int field_108;
} st_a1910_1;

typedef struct st_a1910_2 {
    struct st_a1910_5 *field_0;
} st_a1910_2;

typedef struct st_a1910_5 {
    struct st_a1910_2 *field_0;
} st_a1910_5;

typedef struct st_a1910_0 {
    char field_0;
} st_a1910_0;

extern char g_10002b0;

unsigned int sub_a1910(void* a0, unsigned int *a1, long long a2, unsigned long long *a3)
{
    unsigned int v26;  // x13
    unsigned long v27;  // x11
    unsigned long v34;  // cc_dep2
    unsigned int *v110;  // x9
    unsigned int v112;  // w20
    unsigned long v113;  // x26
    unsigned int *v114;  // x8
    unsigned int v115;  // x8
    unsigned long long v116;  // 4120
    unsigned long long k;  // x1
    unsigned long long idx;  // x5
    unsigned long v119;  // x6
    unsigned long v35;  // cc_ndep
    unsigned long long v120;  // x4
    char *v121;  // x4
    unsigned int v122;  // w7
    unsigned int v123;  // x19
    unsigned long long idx1;  // x7
    unsigned long v125;  // x2
    unsigned long v126;  // x3
    unsigned int v127;  // w4
    unsigned int v128;  // w4
    unsigned int l;  // w2
    unsigned long long v36;  // 4112
    unsigned long long iter;  // x7
    unsigned int v131;  // w2
    unsigned long long v37;  // 4108
    unsigned long v38;  // cc_op
    unsigned long v39;  // cc_dep1
    unsigned long long v40;  // 4112
    unsigned long long v41;  // 4108
    unsigned long long *v28;  // x10
    unsigned int v29;  // w12
    unsigned int v42;  // w8
    unsigned long long i;  // x1
    char v44;  // x8
    unsigned long v45;  // x14
    unsigned int v46;  // x24
    unsigned int v47;  // w15
    unsigned long v48;  // x8
    unsigned long long v49;  // 4175
    unsigned int *v30;  // x25
    unsigned int v50;  // w16
    unsigned int v51;  // w12
    unsigned int *v52;  // x15
    unsigned int v53;  // x23
    unsigned int *v54;  // x2
    unsigned long long *v55;  // x16
    unsigned long v56;  // x17
    char v57;  // x3
    unsigned long long idx2;  // x23
    unsigned long v59;  // x26
    unsigned int *v31;  // x23
    unsigned long long v60;  // x22
    char *v61;  // x22
    unsigned int v62;  // w27
    unsigned int v63;  // x28
    unsigned long long v64;  // x27
    unsigned long long v65;  // x14
    unsigned long v66;  // x13
    unsigned int *v67;  // x11
    void* v68;  // x10
    __m128i v69;  // q0
    unsigned int v32;  // w8
    __m128i v70;  // q1
    unsigned long v72;  // x13
    unsigned long v73;  // x14
    unsigned int index;  // x19
    unsigned long v75;  // x14
    unsigned long long v76;  // 4128
    unsigned long long v77;  // 4130
    unsigned int v78;  // x17
    unsigned int v79;  // w17
    unsigned int v33;  // w9
    unsigned int v80;  // w17
    unsigned long v81;  // x17
    unsigned long v82;  // x17
    unsigned int v83;  // w9
    unsigned long long v84;  // x9
    unsigned int v85;  // w8
    st_a1910_5 **v86;  // x28
    unsigned int v87;  // x19
    unsigned long v88;  // x27
    unsigned int v89;  // x0
    st_a1910_1 *v90;  // x9
    unsigned long v91;  // x22
    unsigned long v92;  // x28
    st_a1910_6 *v93;  // x26
    unsigned int *v94;  // x19
    unsigned int v95;  // w8
    unsigned int v96;  // w9
    unsigned long long v97;  // 4234
    unsigned int v98;  // x24
    unsigned long v99;  // x20
    unsigned int *v100;  // x8
    unsigned int v101;  // x27
    unsigned int v102;  // w8
    unsigned int v103;  // w9
    unsigned long v104;  // x26
    unsigned int v105;  // w8
    unsigned int v106;  // w9
    unsigned long long j;  // x8
    unsigned int *v108;  // x9
    unsigned long v109;  // x8
    unsigned long long v0;  // [bp-0x200]
    unsigned int v1;  // [bp-0x1f4]
    unsigned long long *v2;  // [bp-0x1f0]
    unsigned int v3;  // [bp-0x1e4]
    unsigned int *v4;  // [bp-0x1e0]
    unsigned int v5;  // [bp-0x1d8]
    st_a1910_1 *v6;  // [bp-0x1d8]
    unsigned long v7;  // [bp-0x1c8]
    st_a1910_0 **v8;  // [bp-0x1b8], Other Possible Types: char
    st_a1910_0 *v9;  // [bp-0x1b0]
    st_a1910_0 **v10;  // [bp-0x1a8], Other Possible Types: char
    st_a1910_0 *v11;  // [bp-0x1a0]
    st_a1910_0 **v13;  // [bp-0x198]
    st_a1910_0 *v14;  // [bp-0x190]
    char *v15;  // [bp-0x188]
    char *v16;  // [bp-0x188]
    st_a1910_0 **v17;  // [bp-0x180]
    st_a1910_5 **v18;  // [bp-0x178]
    st_a1910_5 **v19;  // [bp-0x178]
    st_a1910_5 **v20;  // [bp-0x170]
    st_a1910_5 **v21;  // [bp-0x170], Other Possible Types: unsigned long
    st_a1910_5 **v22;  // [bp-0x170]
    unsigned long long v23;  // [bp-0x70]
    char *v24;  // [bp-0x10]
    char v25;  // [bp+0x0]

    v24 = &v25;
    v23 = *(long long *)&g_10002b0;
    v26 = 2654435761;
    v9 = &v8;
    v8 = &v9;
    v27 = (long long)a0[112];
    v28 = (long long)a0[56];
    v29 = (int)a0[52];
    v30 = (long long)a0[8];
    v31 = a1 - v30;
    v32 = 1 << ((char)(int)a0[0x100] & 31);
    v7 = (int)a0[24];
    v33 = (int)a0[28];
    if (v32 < (unsigned int)(unsigned int *)((char *)v31 - (int)a0[28]))
    {
        v36 = arm64g_calculate_condition(v38 | 128, v39, v34, v35);
        v37 = arm64g_calculate_condition(3, (v36 & 1 ? (int)a0[40] : 0), 0, 0);
        if (!(v37 & 1))
            goto LABEL_a19a6;
LABEL_a19a5:
        v33 = (unsigned int)(unsigned int *)((char *)v31 - v32);
    }
    else
    {
        v40 = arm64g_calculate_condition(v38 | 128, v39, v34, v35);
        v41 = arm64g_calculate_condition(0, (v40 & 1 ? (int)a0[40] : 0), 0, 0);
        if (v41 & 1)
            goto LABEL_a19a5;
LABEL_a19a6:
    }
    v42 = (int)a0[268];
    i = v42 - 4;
    if (v42 < 4)
        v44 = v42;
    else
        v44 = 4;
    v45 = (long long)a0[96];
    v46 = 1 << (v44 & 31);
    v47 = 2654435761 * *a1;
    v48 = v47 >> ((char)(0x22 - *(int *)((long long)a0[248] + 264)) & 31);
    v4 = v31;
    v6 = (long long)a0[248];
    v49 = arm64g_calculate_condition(131, v42, 4, 0);
    if (v49 & 1)
        v50 = 1 << ((char)i & 31);
    else
        v50 = 0;
    v3 = v50;
    if ((int)a0[300])
    {
        v51 = (v47 ^ (unsigned int)v45) >> ((char)(24 - v29) & 31);
        *(unsigned int *)&a0[44] = (unsigned int)v31;
    }
    else
    {
        v52 = a0 + 64;
        v11 = &v10;
        v10 = &v11;
        i = (int)a0[44];
        v21 = v20;
        v53 = (unsigned int)v31;
        if (385 <= (unsigned int)(v53 - i))
            goto LABEL_a1ee4;
        v54 = v30;
        v55 = v28;
        v56 = v27;
        v14 = &v13;
        v13 = &v14;
        if ((unsigned int)v31 > (unsigned int)i)
            goto LABEL_a1a60;
        goto LABEL_a1b10;
    }
    while (1)
    {
        *(unsigned int *)&a0[104] = (int)a0[104] + v51;
        v66 = v51 >> 4 & 0xffffff0;
        v67 = v27 + v66 * 4;
        v68 = (char *)v28 + v66;
        v52 = *(char *)v68 * 4;
        v69 = *(int128_t *)v68;
        v70 = (__m128i)(CONCAT(v51 & 0xff | (v51 & 0xff) * 0x100 | (v51 & 0xff | (v51 & 0xff) * 0x100) * 0x10000 | (v51 & 0xff | (v51 & 0xff) * 0x100 | (v51 & 0xff | (v51 & 0xff) * 0x100) * 0x10000) * 0x100000000, v51 & 0xff | (v51 & 0xff) * 0x100 | (v51 & 0xff | (v51 & 0xff) * 0x100) * 0x10000 | (v51 & 0xff | (v51 & 0xff) * 0x100 | (v51 & 0xff | (v51 & 0xff) * 0x100) * 0x10000) * 0x100000000));
        v72 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(_mm_cmpeq_epi8(v69, v70), 4), _mm_srli_epi16(_mm_cmpeq_epi8(v69, v70), 4)));
        if (!(v52 & 0x3f))
            v73 = v72;
        else
            v73 = v72 << (char)(64 - (v52 & 63)) | v72 >> ((char)v52 & 63);
        index = 0;
        v75 = v73 & 0x8888888888888888;
        v45 = v75;
        if (v73 & 0x8888888888888888)
        {
            v52 = (unsigned int)v52 & 252;
            do
            {
                v76 = ((((((v75 & 0xaaaaaaaaaaaaaaaa) >> 1 | v75 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v75 & 0xaaaaaaaaaaaaaaaa) >> 1 | v75 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v75 & 0xaaaaaaaaaaaaaaaa) >> 1 | v75 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v75 & 0xaaaaaaaaaaaaaaaa) >> 1 | v75 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                v77 = (((((((v75 & 0xaaaaaaaaaaaaaaaa) >> 1 | v75 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v75 & 0xaaaaaaaaaaaaaaaa) >> 1 | v75 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v75 & 0xaaaaaaaaaaaaaaaa) >> 1 | v75 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v75 & 0xaaaaaaaaaaaaaaaa) >> 1 | v75 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                v78 = ((((v77 | v76) & 0xffff0000ffff0000) >> 16 | (v77 | v76) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v77 | v76) & 0xffff0000ffff0000) >> 16 | (v77 | v76) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                if (!v78)
                    v79 = 64;
                else
                    v79 = Clz(v78);
                v80 = __ROL__(v79 + (unsigned int)v52, 30) & 0xc000000f & 15;
                if (!v80)
                    continue;
                v81 = v67[v80];
                v45 = v75;
                if ((unsigned int)v81 < v33)
                    break;
                i = (char *)v30 + v81;
                *(unsigned int *)((char *)&v21 + 4 * index) = v81;
                index += 1;
                v46 -= 1;
            } while ((v82 = v75 - 1, v45 = v82 & v75, v82 & v75 && (v75 = v45, v46)));
        }
        v83 = (char)_mm_extract_epi8(v69, 0) - 1;
        if (!(v83 & 15))
            v26 = 15;
        else
            v26 = 0;
        v84 = v26 + (v83 & 15);
        *(char *)v68 = v84;
        *((char *)v68 + v84) = v51;
        v85 = (int)a0[44];
        *(unsigned int *)&a0[44] = v85 + 1;
        v67[v84] = v85;
        if (index)
        {
            v86 = &v21;
            v53 = 3;
            do
            {
                v87 = index;
                v88 = *(int *)v86;
                v86 = (char *)v86 + 4;
                i = (char *)v30 + v88;
                if (*(int *)(i + v53 - 3) == *(int *)((char *)a1 + v53 - 3) && !(v89 = sub_7cdfc(a1), v89 <= v53 || (*a3 = (unsigned int)v31 + 3 - v88, v53 = v89, (char *)a1 + v89 != a2)))
                    break;
            } while ((index = v87 - 1, v87 != 1));
        }
        else
        {
            v53 = 3;
        }
        v21 = &v19;
        v18 = &v21;
        v90 = v6;
        v91 = v90->field_0;
        v92 = v90->field_8;
        v93 = v90->field_70 + ((v48 * 4 | v48 >> 62) & 0x3fffffffc & 0x3ffffffff) * 4;
        v28 = v93->field_c;
        v94 = v90->field_80 + (v28 >> 8) * 4;
        v27 = v91 - v92 - v7;
        v95 = v3;
        v96 = v46 + v95;
        v97 = arm64g_calculate_condition(1, v46 & 0xffffffff, v95, 0);
        if (!(v97 & 1))
        {
            v2 = v28;
            v1 = v96;
            if (v96 < 3)
                v46 = v96;
            else
                v46 = 3;
            v3 = v27;
            v5 = (unsigned int)v4 + (unsigned int)v27 + 3;
            v0 = v46;
            do
            {
                v98 = v46;
                v99 = v93->field_0;
                v93 = &v93->field_4;
                if ((unsigned int)v99)
                {
                    v100 = v92 + v99;
                    v28 = *a1;
                    if (*v100 == (unsigned int)v28 && (i = v100 + 1, v101 = sub_84f30(a1 + 1, i, a2, v91, (char *)v30 + v7) + 4, v101 > v53 && (*a3 = v5 - v99, v53 = v101, (char *)a1 + v101 == a2)))
                        goto LABEL_a1e64;
                    else
                        goto LABEL_a1d34;
                }
                else
                {
                    v101 = v53;
                    goto LABEL_a1e64;
                }
LABEL_a1d34:
            } while ((v46 = v98 - 1, v98 != 1));
            v27 = v3;
            v28 = v2;
            v51 = v0;
            v102 = (unsigned int)v28 & 0xff;
            v103 = v1 - v51;
            if (v103 < v102)
                v104 = v103;
            else
                v104 = v102;
            if (!(unsigned int)v104)
                goto LABEL_a1ec4;
            goto LABEL_a1dbc;
        }
        else
        {
            v51 = 0;
            v105 = (unsigned int)v28 & 0xff;
            v106 = v96 - 0;
            if (v106 < v105)
                v104 = v106;
            else
                v104 = v105;
            if ((unsigned int)v104)
            {
LABEL_a1dbc:
                j = (v104 * 4 | v104 >> 62) & 0x3fffffffc & 0x3ffffffff;
                v108 = v94;
                do
                {
                    v109 = j;
                    v110 = v108 + 1;
                    v28 = v92 + *v108;
                    j = v109 - 4;
                    v108 = v110;
                } while (j);
                v112 = *a1;
                v98 = (unsigned int)(a1 + 1);
                v5 = (unsigned int)v4 + (unsigned int)v27 + 3;
                v101 = v53;
                do
                {
                    v113 = v104;
                    v53 = *v94;
                    v94 += 1;
                    v114 = v92 + v53;
                    if (*v114 == v112 && !(i = v114 + 1, v115 = sub_84f30(v98, i, a2, v91, (char *)v30 + v7) + 4, v115 <= v101 || (v28 = a3, *v28 = v5 - v53, v101 = v115, (char *)a1 + v101 != a2)))
                        break;
                } while ((v104 = (unsigned int)v113 - 1, (unsigned int)v113 != 1));
LABEL_a1e64:
                v48 = v23;
                v33 = *(long long *)&g_10002b0;
                v46 = v98;
                if (*(long long *)&g_10002b0 == v48)
                    return v101;
                goto LABEL_a1ee0;
            }
            else
            {
LABEL_a1ec4:
                v48 = v23;
                v33 = *(long long *)&g_10002b0;
                if (*(long long *)&g_10002b0 == v48)
                    return v53;
LABEL_a1ee0:
                a0 = ___stack_chk_fail();
                v29 = v51;
LABEL_a1ee4:
                v55 = v28;
                v56 = v27;
                v116 = arm64g_calculate_condition(129, i & 0xffffffff, 97, 0);
                if (!(v116 & 1))
                {
                    k = i;
                    do
                    {
                        idx = k & 7;
                        v119 = v52[idx];
                        v52[idx] = (v26 * *(int *)((char *)v30 + k + 8) ^ (int)a0[96]) >> ((char)(24 - v29) & 31);
                        v120 = v119 >> 4 & 0xffffff0;
                        v121 = (char *)v28 + v120;
                        v122 = *v121 - 1;
                        if (!(v122 & 15))
                            v123 = 15;
                        else
                            v123 = 0;
                        idx1 = v123 + (v122 & 15);
                        *v121 = idx1;
                        v121[idx1] = v119;
                        *(unsigned int *)(v27 + v120 * 4 + idx1 * 4) = k;
                        k += 1;
                    } while (i + 96 != k);
                    v56 = (long long)a0[112];
                    v55 = (long long)a0[56];
                    v53 = (unsigned int)v4;
                }
                i = v53 - 32;
                v125 = (char *)a1 + 1;
                v17 = &v15;
                v16 = &v17;
                v126 = (char *)v30 + i;
                v127 = v125 - v126;
                if (8 <= v127 + 1)
                    v128 = 8;
                else
                    v128 = v127 + 1;
                if (v125 < v126)
                    l = 0;
                else
                    l = v128;
                if (l + (unsigned int)i > (unsigned int)i)
                {
                    iter = i;
                    do
                    {
                        v131 = l;
                        v18 = &v21;
                        v21 = &v18;
                        v52[iter & 7] = (v26 * *(int *)((char *)v30 + iter) ^ (int)a0[96]) >> ((char)(24 - (int)a0[52]) & 31);
                        iter += 1;
                        l = v131 - 1;
                    } while (l);
                }
                v54 = (long long)a0[8];
                v14 = &v13;
                v13 = &v14;
                if ((unsigned int)i < v53)
                {
LABEL_a1a60:
                    v57 = 24 - (int)a0[52];
                    i &= 0xffffffff;
                    v21 = v20;
                    do
                    {
                        v15 = &v17;
                        v17 = &v15;
                        v18 = &v21;
                        v22 = &v18;
                        idx2 = i & 7;
                        v59 = v52[idx2];
                        v52[idx2] = (v26 * *(int *)((char *)v54 + i + 8) ^ (int)a0[96]) >> (v57 & 31);
                        v60 = v59 >> 4 & 0xffffff0;
                        v61 = (char *)v55 + v60;
                        v19 = &v22;
                        v21 = &v19;
                        v62 = *v61 - 1;
                        if (!(v62 & 15))
                            v63 = 15;
                        else
                            v63 = 0;
                        v64 = v63 + (v62 & 15);
                        *v61 = v64;
                        v61[v64] = v59;
                        *(unsigned int *)(v56 + v60 * 4 + v64 * 4) = i;
                        i += 1;
                    } while (i < (v4 & 0xffffffff));
                }
LABEL_a1b10:
                v31 = v4;
                *(unsigned int *)&a0[44] = (unsigned int)v31;
                v65 = v31 & 7;
                v51 = v52[v65];
                v52[v65] = (v26 * *(int *)((char *)v30 + (v31 & 0xffffffff) + 8) ^ (unsigned int)v45) >> ((char)(24 - v29) & 31);
            }
        }
    }
}
