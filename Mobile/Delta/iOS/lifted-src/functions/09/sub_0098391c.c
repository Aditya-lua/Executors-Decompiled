/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98391c..0x9842b4 (2456 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98391c_11 {
    char padding_0[124];
    unsigned long long field_7c;
} st_98391c_11;

typedef struct st_98391c_4 {
    char padding_0[8];
    unsigned long long field_8;
} st_98391c_4;

typedef struct st_98391c_9 {
    char padding_0[216];
    unsigned long long field_d8;
    unsigned long long field_e0;
    uint128_t field_e8;
} st_98391c_9;

typedef struct st_98391c_3 {
    struct st_98391c_4 *field_0;
    struct st_98391c_5 *field_8;
    unsigned long long field_10;
    char padding_18[8];
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
    uint128_t field_38;
    uint128_t field_48;
    uint128_t field_58;
    uint128_t field_68;
    uint128_t field_78;
    char field_88[28];
    char field_94;
    char padding_95[15];
    uint128_t field_a4;
    uint128_t field_b4;
    uint128_t field_c4;
    uint128_t field_d4;
    uint128_t field_e4;
    char field_f4[28];
    char field_100;
    char padding_101[15];
    unsigned long long field_110;
    char field_118;
} st_98391c_3;

typedef struct st_98391c_10 {
    struct st_98391c_6 *field_0;
    struct st_98391c_0 *field_8;
    char padding_10[112];
    unsigned long long field_80;
    char padding_88[216];
    unsigned long long field_160;
    unsigned long long field_168;
    uint128_t field_170;
} st_98391c_10;

typedef struct st_98391c_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    struct st_98391c_2 *field_30;
    uint128_t field_38;
    struct st_98391c_6 *field_48;
    struct st_98391c_0 *field_50;
    char padding_58[24];
    char field_70;
    char padding_71[87];
    unsigned long long field_c8;
    char field_d0;
    char padding_d1[107];
    char field_13c;
    char padding_13d[107];
    unsigned long long field_1a8;
    unsigned long long field_1b0;
    uint128_t field_1b8;
} st_98391c_1;

typedef struct st_98391c_8 {
    char padding_0[72];
    struct st_98391c_6 *field_48;
} st_98391c_8;

typedef struct st_98391c_0 {
    char padding_0[72];
    unsigned long long field_48;
} st_98391c_0;

typedef struct st_98391c_5 {
    unsigned long long field_0;
} st_98391c_5;

typedef struct st_98391c_6 {
    char padding_0[80];
    unsigned long long field_50;
} st_98391c_6;

typedef struct st_98391c_2 {
    char padding_0[16];
    long long field_10;
    long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    struct st_98391c_3 *field_30;
    unsigned long long field_38;
    unsigned long long field_40;
    unsigned long long field_48;
    struct st_98391c_5 *field_50;
    unsigned long long field_58;
    void* field_60;
    struct st_98391c_0 *field_68;
    unsigned long long field_70;
    struct st_98391c_1 *field_78;
    struct st_98391c_0 *field_80;
    unsigned long long field_88;
    long long field_90;
    char padding_98[16];
    char field_a8;
    char padding_a9[831];
    unsigned long long field_3e8;
    char padding_3f0[16];
    struct st_98391c_5 *field_400;
    char padding_408[32];
    struct st_98391c_5 *field_428;
} st_98391c_2;

typedef struct st_98391c_7 {
    char padding_0[112];
    unsigned int field_70;
} st_98391c_7;

extern unsigned long long g_d28518[4];
extern char g_10002b0;

unsigned long long sub_98391c(st_98391c_2 *a0, unsigned long long *a1)
{
    unsigned long v17;  // x8
    st_98391c_3 *v18;  // x21
    unsigned long long v27;  // x22
    unsigned long long v28;  // w28
    unsigned int v29;  // w27
    unsigned int v30;  // w2
    unsigned long long v31;  // w28
    unsigned long long v32;  // x27
    unsigned long long v33;  // w0
    unsigned long v34;  // x8
    unsigned long long v35;  // x0
    st_98391c_6 *v36;  // x28
    unsigned long v19;  // x19
    unsigned long v37;  // x8
    char v38;  // x9
    unsigned long long v39;  // x9
    unsigned long long v40;  // x28
    unsigned long long v41;  // x0
    long long v42;  // x24
    st_98391c_7 *v43;  // x19
    unsigned long long idx;  // x8
    unsigned int v45;  // w9
    char v46;  // x9
    unsigned long long iter;  // x26
    unsigned long long idx1;  // x9
    uint128_t v48;  // q0
    uint128_t v49;  // q2
    uint128_t v50;  // q0
    uint128_t v51;  // q1
    uint128_t v52;  // q2
    st_98391c_11 *v53;  // x9
    uint128_t v54;  // q0
    uint128_t v55;  // q1
    uint128_t v56;  // q3
    void* v21;  // x24
    uint128_t v57;  // q0
    uint128_t v58;  // q2
    unsigned long long v59;  // x9
    st_98391c_8 *v60;  // x10
    st_98391c_6 *v61;  // x11
    st_98391c_6 **v62;  // x10
    st_98391c_0 *v63;  // x9
    unsigned long long v64;  // x10
    unsigned long long v65;  // x9
    unsigned long long v66;  // x0
    unsigned long long v22;  // 4106
    unsigned long long index;  // x23
    unsigned long v68;  // x24
    unsigned long n;  // x19
    uint128_t v70;  // q0
    uint128_t v71;  // q1
    uint128_t v72;  // q2
    uint128_t v73;  // q1
    uint128_t v74;  // q2
    unsigned long idx2;  // x8
    uint128_t v76;  // q0
    unsigned long long v23;  // x0
    uint128_t v77;  // q1
    uint128_t v78;  // q2
    uint128_t v79;  // q0
    uint128_t v80;  // q2
    unsigned long long v81;  // x8
    st_98391c_8 *v82;  // x9
    st_98391c_6 *v83;  // x10
    st_98391c_6 **v84;  // x9
    st_98391c_0 *v85;  // x8
    unsigned long long v86;  // x10
    unsigned long long v24;  // x25
    unsigned long long v87;  // x8
    unsigned long long *v88;  // x9
    st_98391c_4 *v89;  // x10
    unsigned long long v90;  // w9
    unsigned long long *v91;  // x8
    st_98391c_1 *v92;  // x19
    st_98391c_1 *v93;  // x9
    st_98391c_6 *v94;  // x10
    st_98391c_10 *v95;  // x9
    st_98391c_0 *v96;  // x11
    st_98391c_0 *v25;  // x8
    unsigned long v97;  // x10
    unsigned long v98;  // x9
    st_98391c_9 *v99;  // x22
    unsigned long long v100;  // x8
    unsigned long long v101;  // x8
    unsigned long long v26;  // x8
    long long v0;  // [bp-0x150], Other Possible Types: unsigned long
    unsigned int v1;  // [bp-0x138], Other Possible Types: unsigned long
    st_98391c_6 *v2;  // [bp-0x130], Other Possible Types: unsigned long
    unsigned long long n1;  // [bp-0x128]
    unsigned long long *v4;  // [bp-0x120]
    unsigned long v5;  // [bp-0x110]
    unsigned long long v6;  // [bp-0x104]
    uint128_t v7;  // [bp-0x100]
    uint128_t v8;  // [bp-0xf0]
    unsigned long v9;  // [bp-0xd8]
    char v10;  // [bp-0xd0]
    uint128_t v11;  // [bp-0xb0]
    unsigned long long v12;  // [bp-0x98]
    uint168_t v13;  // [bp-0x90]
    unsigned long v14;  // [bp-0x70]
    char *v15;  // [bp-0x10]
    char v16;  // [bp+0x0]

    v15 = &v16;
    v14 = *(long long *)&g_10002b0;
    v17 = a0->field_88;
    if (!v17)
    {
        v18 = a0->field_30;
        if (v18)
        {
            v4 = &a0->field_90;
            v7 = 0xff;
            do
            {
                v19 = v18->field_10;
                *(uint128_t *)&v13 = v7;
                *(unsigned long long *)((char *)&v13 + 13) = 0;
                a0->field_3e8 = a0->field_3e8 + v19;
                if ((long long)v19 >= 0 && !(v8 = CONCAT(v19, &v18->field_f4[16]), !v19))
                {
                    iter = 0;
                    v6 = 0;
                    v5 = v19;
                    while (v19 >= 7 && 63 >= iter)
                    {
                        v12 = 0;
                        v11 = v8;
                        v9 = 0xffffffffffffffff;
                        v21 = a0->field_60;
                        if (!v21)
                        {
                            v22 = arm64g_calculate_condition(130, v19, 458, 0);
                            if (v22 & 1 || (v23 = sub_a6bf4c(v19 + 456, "ssl/quic/quic_record_rx.c", 588), !v23))
                            {
                                v24 = 1 << ((char)iter & 63);
                                goto LABEL_983a88;
                            }
                            else
                            {
                                v21 = v23;
                                memset(v23 + 72, 0, 24);
                                *(unsigned long *)(v23 + 96) = v19;
                                *(unsigned long long *)(v23 + 104) = 0;
                                v25 = a0->field_68;
                                if (v25)
                                    v25->field_48 = v21;
                                *(unsigned long long *)&v21[72] = 0;
                                *(st_98391c_0 **)&v21[80] = v25;
                                a0->field_68 = v21;
                                if (!a0->field_60)
                                    a0->field_60 = v21;
                                a0->field_70 = a0->field_70 + 1;
                            }
                        }
                        v24 = 1 << ((char)iter & 63);
                        v26 = v18->field_28;
                        v8 = v8;
                        if (!sub_990cb4(&v8, a0->field_18, !(v26 & v24), 0, v21 + 112, &v10, 0))
                        {
LABEL_983a88:
                            v18->field_20 = v18->field_20 | v24;
                            v8 = (unsigned long long)v8 + *(unsigned long long *)((void*)&v8 + 8);
                            goto LABEL_983aa0;
                        }
                        else
                        {
                            if (!iter)
                            {
                                *(int128_t *)&v13 = (int128_t)v21[120];
                                *(long long *)((char *)&v13 + 13) = (long long)v21[133];
                            }
                            v27 = v8;
                            if (...)
                            {
LABEL_983d58:
                                if (v27)
                                {
                                    v18->field_20 = v18->field_20 | v24;
                                    v86 = v27 - (unsigned long long)v8;
                                    if (*(unsigned long long *)((void*)&v8 + 8) >= v86)
                                    {
                                        v8 = CONCAT(*(unsigned long long *)((void*)&v8 + 8) - v86, (unsigned long long)v8 + v86);
                                        goto LABEL_983aa0;
                                    }
                                }
                                goto LABEL_983a88;
                            }
                            if (v29 == 4)
                            {
                                v66 = sub_c620c8(&a0->field_60, v21, (long long)v21[184]);
                                v8 = v8;
                                if (!v66)
                                    goto LABEL_983d58;
                                index = v66;
                                v68 = v66 + 456;
                                n = *(long long *)(v66 + 184);
                                _memcpy(v68, *(long long *)(v66 + 192), n);
                                v18->field_20 = v18->field_20 | v24;
                                *(unsigned long *)(index + 192) = v68;
                                *(unsigned long *)(index + 200) = 0xffffffffffffffff;
                                *(unsigned long *)(index + 88) = n;
                                *(unsigned long *)(index + 432) = v5;
                                *(unsigned long long *)(index + 440) = 0;
                                v70 = *(int128_t *)((char *)&v18->field_58 + 8);
                                v71 = *(int128_t *)((char *)&v18->field_68 + 8);
                                v72 = *(int128_t *)((char *)&v18->field_78 + 8);
                                *(int128_t *)(index + 300) = *(int128_t *)&v18->field_88[4];
                                *(uint128_t *)(index + 272) = v71;
                                *(uint128_t *)(index + 288) = v72;
                                *(uint128_t *)(index + 0x100) = v70;
                                v73 = *(int128_t *)&(&v18->field_30)[1];
                                v74 = *(int128_t *)((char *)&v18->field_48 + 8);
                                *(int128_t *)(index + 224) = *(int128_t *)((char *)&v18->field_38 + 8);
                                *(uint128_t *)(index + 240) = v74;
                                *(uint128_t *)(index + 208) = v73;
                                idx2 = index + 316;
                                v76 = *(int128_t *)((char *)&v18->field_c4 + 4);
                                v77 = *(int128_t *)((char *)&v18->field_d4 + 4);
                                v78 = *(int128_t *)((char *)&v18->field_b4 + 4);
                                *(uint128_t *)(idx2 + 92) = v18->field_e4;
                                *(uint128_t *)(idx2 + 64) = v76;
                                *(uint128_t *)(idx2 + 80) = v77;
                                *(uint128_t *)(idx2 + 48) = v78;
                                v79 = *(int128_t *)&v18->field_88[20];
                                v80 = *(int128_t *)((char *)&v18->field_a4 + 4);
                                *(int128_t *)(idx2 + 16) = *(int128_t *)&v18->padding_95[7];
                                *(uint128_t *)(idx2 + 32) = v80;
                                *(uint128_t *)idx2 = v79;
                                *(long long *)(index + 424) = *(long long *)&v18->field_f4[0];
                                *(unsigned long long *)(index + 448) = v18->field_30;
                                if (a0->field_60 == index)
                                    a0->field_60 = *(long long *)(index + 72);
                                v81 = *(long long *)(index + 80);
                                if (a0->field_68 == index)
                                    a0->field_68 = v81;
                                v82 = index;
                                v83 = v82->field_48;
                                v84 = &v82->field_48;
                                if (v81)
                                    *(st_98391c_6 **)(v81 + 72) = v83;
                                if (v83)
                                    v83->field_50 = v81;
                                a0->field_70 = a0->field_70 - 1;
                                *v84 = 0;
                                v84[1] = 0;
                                v85 = a0->field_80;
                                if (v85)
                                    v85->field_48 = index;
                                *(unsigned long long *)(index + 72) = 0;
                                *(st_98391c_0 **)(index + 80) = v85;
                                a0->field_80 = index;
                                if (!a0->field_78)
                                {
                                    a0->field_78 = index;
                                    goto LABEL_983ec0;
                                }
                            }
                            switch (v28)
                            {
                            case 2:
                                v31 = 0;
                                v32 = 1;
                                break;
                            case 5:
                                v32 = 3;
                                v31 = 1;
                                break;
                            case 3:
                                v31 = 0;
                                v32 = 2;
                                break;
                            default:
                                v31 = 0;
                                v32 = 0;
                                break;
                            }
                            v33 = (unsigned int)sub_984644(&a0->field_a8, v32);
                            if (!v33)
                            {
LABEL_983c70:
                                v19 = *(unsigned long long *)((void*)&v8 + 8);
                                v64 = v27 - (unsigned long long)v8;
                                v65 = v19 - v64;
                                if (v19 >= v64)
                                {
                                    v8 = CONCAT(v65, (unsigned long long)v8 + v64);
                                    v19 = v65;
                                }
                                v6 = 1;
                                iter += 1;
                                if (!v19)
                                    break;
                                else
                                    continue;
                            }
                            v8 = v8;
                            if (v33 != 1)
                                goto LABEL_983d58;
                            if (v31 && !a0->padding_408[25])
                                goto LABEL_983c70;
                            if ((char)v21[112] == 1)
                            {
                                v34 = (long long)v21[168];
                                n1 = (long long)v21[176];
                                if (n1)
                                {
                                    v2 = (long long)v21[168];
                                    v35 = sub_c620c8(&a0->field_60, v21, n1);
                                    v8 = v8;
                                    if (!v35)
                                        goto LABEL_983d58;
                                    v21 = v35;
                                    v1 = v35 + 456;
                                    _memcpy(v1, v2, n1);
                                    v34 = v1;
                                }
                                *(unsigned long *)&v21[168] = v34;
                            }
                            else
                            {
                                n1 = 0;
                            }
                            v8 = v11;
                            v36 = sub_c624f0(&a0->field_a8, v32, 1);
                            if (!(v26 & v24) && (!sub_99093c(v36, &v10) || !(v18->field_28 = v18->field_28 | v24, sub_990cb4(&v8, a0->field_18, 0, 0, v21 + 112, 0, 0) == 1)))
                                goto LABEL_983d58;
                            v37 = (int)v21[112];
                            v38 = (unsigned int)v37 - 2;
                            if (3 >= v38)
                                v39 = g_d28518[v38];
                            else
                                v39 = 0;
                            if (!sub_991444(v21 + 162, (v37 * 0x40000000000000 | v37 >> 10) & 0xffc000000000000f & 15, v4[v39], v21 + 200))
                                goto LABEL_983d58;
                            v2 = v36;
                            v1 = v32;
                            if (a0->field_428)
                                a0->field_428();
                            v40 = n1;
                            v41 = sub_c620c8(&a0->field_60, v21, (long long)v21[184] + v40);
                            if (!v41)
                                goto LABEL_983a88;
                            v42 = v41 + v40 + 456;
                            v43 = v41;
                            *((char *)&v0 + 4) = (char)(__ROL__(*(int *)(v41 + 112), 23)) & 1;
                            *(unsigned int *)&v0 = v1;
                            if (!sub_c62240(a0, v42, *(long long *)(v41 + 192), *(long long *)(v41 + 184), &v12, v8, (long long)v21[192] - (unsigned long long)v8, *(long long *)(v41 + 200), v0, &v9))
                                goto LABEL_983d58;
                            idx = v43;
                            v45 = v43->field_70;
                            if (a0->field_400)
                                a0->field_400();
                            if ((char)v45 == 5 && (v2->field_50 & 1) != ((v45 * 0x800000 | v45 >> 9) & 0xff800001 & 1))
                            {
                                sub_9845f4(a0, *(long long *)(idx + 200));
                                idx = v43;
                            }
                            v18->field_20 = v18->field_20 | v24;
                            *(unsigned long long *)(idx + 184) = v12;
                            *(long long *)(idx + 192) = v42;
                            *(unsigned long long *)(idx + 88) = v12;
                            *(unsigned long *)(idx + 432) = v5;
                            *(unsigned long *)(idx + 440) = v9;
                            v46 = *(char *)(idx + 112) - 2;
                            if (3 >= v46)
                                idx1 = g_d28518[v46];
                            else
                                idx1 = 0;
                            if ((unsigned long long)*(long long *)(idx + 200) > v4[idx1])
                                v4[idx1] = *(long long *)(idx + 200);
                            v48 = *(int128_t *)&(&v18->field_30)[1];
                            v49 = *(int128_t *)((char *)&v18->field_48 + 8);
                            *(int128_t *)(idx + 224) = *(int128_t *)((char *)&v18->field_38 + 8);
                            *(uint128_t *)(idx + 240) = v49;
                            *(uint128_t *)(idx + 208) = v48;
                            v50 = *(int128_t *)((char *)&v18->field_58 + 8);
                            v51 = *(int128_t *)((char *)&v18->field_68 + 8);
                            v52 = *(int128_t *)((char *)&v18->field_78 + 8);
                            *(int128_t *)(idx + 300) = *(int128_t *)&v18->field_88[4];
                            *(uint128_t *)(idx + 272) = v51;
                            *(uint128_t *)(idx + 288) = v52;
                            *(uint128_t *)(idx + 0x100) = v50;
                            v53 = idx + 316;
                            v54 = *(int128_t *)((char *)&v18->field_c4 + 4);
                            v55 = *(int128_t *)((char *)&v18->field_d4 + 4);
                            v56 = *(int128_t *)((char *)&v18->field_b4 + 4);
                            *(uint128_t *)&v53->padding_0[92] = v18->field_e4;
                            *(uint128_t *)&v53->padding_0[64] = v54;
                            *(uint128_t *)&v53->padding_0[80] = v55;
                            *(uint128_t *)&v53->padding_0[48] = v56;
                            v57 = *(int128_t *)&v18->field_88[20];
                            v58 = *(int128_t *)((char *)&v18->field_a4 + 4);
                            *(int128_t *)&v53->padding_0[16] = *(int128_t *)&v18->padding_95[7];
                            *(uint128_t *)&v53->padding_0[32] = v58;
                            *(uint128_t *)&v53->padding_0[0] = v57;
                            *(long long *)(idx + 424) = *(long long *)&v18->field_f4[0];
                            *(unsigned long long *)(idx + 448) = v18->field_30;
                            if (a0->field_60 == idx)
                                a0->field_60 = *(long long *)(idx + 72);
                            v59 = *(long long *)(idx + 80);
                            if (a0->field_68 == idx)
                                a0->field_68 = v59;
                            v60 = idx;
                            v61 = v60->field_48;
                            v62 = &v60->field_48;
                            if (v59)
                                *(st_98391c_6 **)(v59 + 72) = v61;
                            if (v61)
                                v61->field_50 = v59;
                            a0->field_70 = a0->field_70 - 1;
                            *v62 = 0;
                            v62[1] = 0;
                            v63 = a0->field_80;
                            if (v63)
                                v63->field_48 = idx;
                            *(unsigned long long *)(idx + 72) = 0;
                            *(st_98391c_0 **)(idx + 80) = v63;
                            a0->field_80 = idx;
                            if (!a0->field_78)
                                a0->field_78 = idx;
LABEL_983ec0:
                            a0->field_88 = a0->field_88 + 1;
LABEL_983aa0:
                            iter += 1;
                            if (!*(unsigned long long *)((void*)&v8 + 8))
                                break;
                        }
                    }
                    v87 = !v6;
                    if (a0->field_30 != v18)
                        goto LABEL_9841b0;
                }
                else
                {
                    v87 = 1;
                }
                a0->field_30 = v18->field_0;
LABEL_9841b0:
                v88 = v18->field_8;
                if (a0->field_38 != v18)
                {
                    v89 = v18->field_0;
                    if (!v88)
                        goto LABEL_9841cc;
                }
                else
                {
                    a0->field_38 = v88;
                    v89 = v18->field_0;
                    if (!v88)
                        goto LABEL_9841cc;
                }
                *v88 = v89;
LABEL_9841cc:
                if (v89)
                    v89->field_8 = v88;
                a0->field_40 = a0->field_40 - 1;
                v18->field_0 = 0;
                v18->field_8 = 0;
                v90 = v18->field_f4[8];
                if (v87 & 1)
                {
                    if (v90)
                    {
                        v18->field_f4[8] = 0;
                        a0->field_28 = a0->field_28 - 1;
                        goto LABEL_983a34;
                    }
                }
                else
                {
                    if (!v90 && a0->field_20 <= a0->field_28)
                    {
LABEL_983a34:
                        sub_97b768(a0->field_10, v18);
                    }
                    else
                    {
                        v91 = a0->field_50;
                        if (v91)
                            *v91 = v18;
                        v18->field_0 = 0;
                        v18->field_8 = v91;
                        a0->field_50 = v18;
                        if (!a0->field_48)
                            a0->field_48 = v18;
                        a0->field_58 = a0->field_58 + 1;
                        if (!v90)
                        {
                            v18->field_f4[8] = 1;
                            a0->field_28 = a0->field_28 + 1;
                        }
                    }
                }
            } while ((v18 = a0->field_30, a0->field_30));
            v17 = a0->field_88;
            if (!a0->field_88)
            {
                if (*(long long *)&g_10002b0 == v14)
                    return 0;
                ___stack_chk_fail();
            }
        }
        else
        {
            if (*(long long *)&g_10002b0 == v14)
                return v18;
            ___stack_chk_fail();
        }
    }
    v92 = a0->field_78;
    if (v92)
    {
        v93 = v92;
        v94 = *(long long *)((char *)&v93->field_38 + 8);
        v95 = (char *)&v93->field_38 + 8;
        a0->field_78 = v94;
        v96 = v92->field_48;
        if (a0->field_80 == v92)
            a0->field_80 = v96;
        if (v96)
            v96->field_48 = v94;
        if (v94)
            v94->field_50 = v96;
        a0->field_88 = v17 - 1;
        v95->field_0 = 0;
        v95->field_8 = 0;
        v92->field_0 = &v92->padding_58[16];
        v97 = *(long long *)&v92->padding_13d[99];
        v98 = v92->field_1a8;
        v92->field_20 = *(long long *)&v92->padding_71[79];
        v92->field_28 = v97;
        v92->field_18 = v98;
        v99 = &v92->field_c8;
        *(unsigned long long *)&v92->padding_58[8] = 1;
        if (!sub_717b8(v99))
            v100 = 0;
        else
            v100 = v99;
        v92->field_8 = v100;
        if (!sub_717b8())
            v101 = 0;
        else
            v101 = &v92->padding_d1[99];
        v92->field_10 = v101;
        *(int128_t *)&(&v92->field_30)[1] = *(int128_t *)&v92->field_1b0;
        v92->field_30 = a0;
        *a1 = v92;
        if (*(long long *)&g_10002b0 == v14)
            return 1;
        ___stack_chk_fail();
    }
    else
    {
        if (*(long long *)&g_10002b0 == v14)
            return 0;
        ___stack_chk_fail();
    }
}
