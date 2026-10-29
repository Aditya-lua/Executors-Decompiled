/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x986fc..0x98fc0 (2244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_986fc_1 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned int field_18;
    unsigned int field_1c;
    char padding_20[8];
    unsigned int field_28;
    char padding_2c[212];
    unsigned int field_100;
    char padding_104[12];
    void* field_110;
} st_986fc_1;

typedef struct st_986fc_3 {
    unsigned long long field_0;
    struct st_986fc_2 *field_8;
    char padding_10[8];
    uint128_t *field_18;
    char padding_20[44];
    unsigned int field_4c;
} st_986fc_3;

typedef struct st_986fc_4 {
    struct st_986fc_5 *field_0;
} st_986fc_4;

typedef struct st_986fc_5 {
    struct st_986fc_4 *field_0;
} st_986fc_5;

typedef struct st_986fc_2 {
    char padding_0[6];
    unsigned short field_6;
} st_986fc_2;

typedef struct st_986fc_0 {
    char field_0;
} st_986fc_0;


char * sub_986fc(st_986fc_1 *a0, st_986fc_3 *a1, unsigned int *a2, void* a3, unsigned long a4)
{
    void* v20;  // x25
    char *v21;  // x28
    void* k;  // x27
    unsigned int v31;  // w14
    void* v32;  // x20
    unsigned long v33;  // x13
    void* v34;  // x21
    unsigned long v35;  // x10
    unsigned int v36;  // w11
    unsigned int v37;  // w15
    unsigned long long v38;  // 4323
    unsigned long long v39;  // x8
    unsigned long long v22;  // x26
    unsigned int v40;  // w10
    unsigned long long v41;  // 4358
    unsigned int *v42;  // x9
    unsigned long long v43;  // x24
    void* v44;  // w8
    unsigned long long v45;  // x0
    void* node;  // x19
    void* v47;  // x8
    unsigned long v48;  // x8
    void* v49;  // x20
    unsigned long v23;  // x20
    unsigned long long v50;  // x25
    unsigned long long v51;  // x25
    void* v52;  // x20
    void* v53;  // x19
    unsigned long v54;  // x24
    unsigned int v55;  // w10
    unsigned int v56;  // w12
    unsigned long long v57;  // 4308
    unsigned long long v58;  // x8
    unsigned int v59;  // w10
    unsigned long v24;  // x9
    unsigned long long v60;  // 4343
    unsigned int *v61;  // x9
    void* v62;  // x0
    unsigned long long v63;  // 4106
    void* v64;  // x8
    void* v65;  // w8
    unsigned int v66;  // w10
    unsigned int v67;  // w12
    unsigned long long v68;  // 4308
    unsigned long long v69;  // x8
    void* v25;  // x13
    unsigned int v70;  // w10
    unsigned long long v71;  // 4343
    unsigned int *v72;  // x9
    void* v73;  // x0
    unsigned long long v74;  // 4106
    void* v75;  // x8
    void* v76;  // w8
    st_986fc_3 *v77;  // x24
    unsigned int v78;  // w10
    unsigned long long v79;  // x9
    char v26;  // x8
    void* v80;  // x8
    void* v81;  // x1
    unsigned long v82;  // x10
    void* v83;  // x9
    void* v84;  // x10
    void* v85;  // x9
    void* v86;  // x11
    unsigned long v87;  // x19
    void* v88;  // x20
    uint128_t *v89;  // x9
    void* v27;  // w10
    uint128_t *iter;  // x9
    uint128_t *v91;  // x10
    uint128_t *v92;  // x10
    st_986fc_2 *v93;  // x8
    void* v94;  // x9
    unsigned long long v95;  // x9
    unsigned int v96;  // w10
    unsigned long v97;  // x15
    unsigned long v98;  // x13
    void* v99;  // x10
    unsigned long v28;  // x23
    unsigned int v100;  // w11
    unsigned int v101;  // w14
    unsigned long long v102;  // 4316
    unsigned long long v103;  // x8
    unsigned int v104;  // w10
    unsigned long long v105;  // 4351
    unsigned int *v106;  // x9
    void* v107;  // x25
    st_986fc_2 *v108;  // x8
    void* v109;  // x9
    unsigned long v29;  // x16
    unsigned long long v110;  // x10
    void* v0;  // [bp-0xf8]
    void* v1;  // [bp-0xe8]
    unsigned int v2;  // [bp-0xdc]
    void* v3;  // [bp-0xd8]
    unsigned long long v4;  // [bp-0xd0]
    unsigned long long v5;  // [bp-0xc8]
    void* v6;  // [bp-0xc0]
    char *v7;  // [bp-0xb8]
    unsigned long v8;  // [bp-0xb0]
    void* v9;  // [bp-0xa8]
    unsigned int v10;  // [bp-0xa4]
    unsigned long v11;  // [bp-0xa0]
    void* i;  // [bp-0x98]
    st_986fc_0 **v13;  // [bp-0x90], Other Possible Types: char
    st_986fc_0 *v14;  // [bp-0x88]
    unsigned long v15;  // [bp-0x80], Other Possible Types: unsigned long long
    st_986fc_5 **v16;  // [bp-0x78]
    st_986fc_5 **v17;  // [bp-0x70]
    char *v18;  // [bp-0x10]
    char v19;  // [bp+0x0]

    v18 = &v19;
    v20 = a3;
    v14 = &v13;
    v13 = &v14;
    v21 = a3 + a4;
    v22 = a0->field_10;
    v23 = a0->field_18;
    v24 = a0->field_1c;
    v11 = a0->field_8;
    i = v21 - 8;
    v25 = a0->field_8 + v23;
    v26 = a0->field_100;
    v27 = (void*)((unsigned int)(int)a0->field_110 < 6 ? (int)a0->field_110 : 6);
    v9 = (4 < v27 ? v27 : 4);
    v28 = *a2;
    v29 = a2[1];
    *(unsigned int *)((char *)&a0[1].field_10 + 4) = 0;
    v6 = v25;
    k = (v6 != a3 ? a3 : a3 + 1);
    if (i > k)
    {
        v4 = v22;
        v5 = v22 + v23;
        v0 = v22 + v24;
        v10 = 1 << (v26 & 31);
        v3 = v21 - 32;
        v7 = v21;
        v8 = v23;
        do
        {
            v31 = v23;
            v32 = k + 1;
            v33 = v11;
            v34 = k - v33;
            v35 = (unsigned int)v34 + 1;
            v36 = v35 - a0->field_1c;
            v37 = v10;
            v38 = arm64g_calculate_condition((v37 < v36 ? 3 : 0), (v37 < v36 ? a0->field_28 : 0), 0, 0);
            v39 = v35 - v28;
            v40 = v35 - (v38 & 1 ? (unsigned int)(v35 - v37) : a0->field_1c);
            v41 = arm64g_calculate_condition((unsigned int)v28 <= v40 | 128, ((unsigned int)v28 <= v40 ? v39 - v31 & 0xffffffff : 0x20000000), ((unsigned int)v28 <= v40 ? 4 : 0), 0);
            if (!(v41 & 1) && !(v42 = ((unsigned int)v39 < v31 ? v22 : v33) + v39, *(int *)v32 != *v42))
                v43 = sub_84f30(k + 5, v42 + 1, v21, ((unsigned int)v39 < (unsigned int)v8 ? v5 : v21), v6) + 4;
            else
                v43 = 0;
            v15 = 0x3b9ac9ff;
            v17 = &v16;
            v16 = &v17;
            v44 = v9;
            v2 = v29;
            if (v44 != 6)
            {
                if (v44 == 5)
                {
                    v45 = sub_b12d4();
                    node = (v43 < v45 ? v45 : v43);
                    if (node >= 4)
                        goto LABEL_98910;
                    goto LABEL_987bc;
                }
                v45 = sub_95248();
                node = (v43 < v45 ? v45 : v43);
                if (node < 4)
                    goto LABEL_987bc;
LABEL_98910:
                v1 = v20;
                v49 = (v43 < v45 ? k : v32);
                v50 = (v43 < v45 ? v15 : 1);
                v51 = v50;
                v52 = v49;
                v53 = node;
                if (k < i)
                {
                    do
                    {
                        v49 = k + 1;
                        v54 = (unsigned int)v34 + 1;
                        if (v51)
                        {
                            v55 = v54 - a0->field_1c;
                            v56 = v10;
                            v57 = arm64g_calculate_condition((v56 < v55 ? 3 : 0), (v56 < v55 ? a0->field_28 : 0), 0, 0);
                            v58 = v54 - v28;
                            v59 = v54 - (v57 & 1 ? (unsigned int)(v54 - v56) : a0->field_1c);
                            v60 = arm64g_calculate_condition((unsigned int)v28 <= v59 | 128, ((unsigned int)v28 <= v59 ? v58 - v8 & 0xffffffff : 0x20000000), ((unsigned int)v28 <= v59 ? 4 : 0), 0);
                            if (!(v60 & 1))
                            {
                                v61 = ((unsigned int)v58 < (unsigned int)v8 ? v4 : v11) + v58;
                                if (*(int *)v49 == *v61)
                                {
                                    v62 = sub_84f30(k + 5, v61 + 1);
                                    v63 = arm64g_calculate_condition(130, v62, 5, 0);
                                    if (!(v63 & 1))
                                    {
                                        v64 = v62 + 4;
                                        if ((int)((unsigned int)v64 * 3) > (int)((unsigned int)v53 * 3 + (unsigned int)(!((v51 & 0xffffffff) * 0x100000000) ? 32 : Clz((v51 & 0xffffffff) * 0x100000000)) - 30))
                                        {
                                            v53 = v64;
                                            v51 = 1;
                                            v52 = v49;
                                        }
                                    }
                                }
                            }
                        }
                        v15 = 0x3b9ac9ff;
                        v17 = &v16;
                        v16 = &v17;
                        v65 = v9;
                        if (v65 == 6)
                        {
                            node = sub_b0998(a0, v49);
                            if (4 > node)
                                goto LABEL_98b80;
                        }
                        else if (v65 == 5)
                        {
                            node = sub_b12d4();
                            if (4 > node)
                                goto LABEL_98b80;
                        }
                        else
                        {
                            node = sub_95248();
                            if (node < 4)
                                goto LABEL_98b80;
                        }
                        v50 = v15;
                        if ((int)((unsigned int)(!((v50 & 0xffffffff) * 0x100000000) ? 32 : Clz((v50 & 0xffffffff) * 0x100000000)) + (unsigned int)node * 4 - 31) > (int)((unsigned int)(!((v51 & 0xffffffff) * 0x100000000) ? 32 : Clz((v51 & 0xffffffff) * 0x100000000)) + (unsigned int)v53 * 4 - 27))
                        {
                            v34 = v54;
                            continue;
                        }
LABEL_98b80:
                        if (i > v49)
                        {
                            v49 = k + 2;
                            v34 = (unsigned int)v34 + 2;
                            if (v51)
                            {
                                v66 = (unsigned int)(v34 - a0->field_1c);
                                v67 = v10;
                                v68 = arm64g_calculate_condition((v67 < v66 ? 3 : 0), (v67 < v66 ? a0->field_28 : 0), 0, 0);
                                v69 = v34 - v28;
                                v70 = (unsigned int)(v34 - (v68 & 1 ? (unsigned int)(v34 - v67) : a0->field_1c));
                                v71 = arm64g_calculate_condition((unsigned int)v28 <= v70 | 128, ((unsigned int)v28 <= v70 ? v69 - v8 & 0xffffffff : 0x20000000), ((unsigned int)v28 <= v70 ? 4 : 0), 0);
                                if (!(v71 & 1))
                                {
                                    v72 = ((unsigned int)v69 < (unsigned int)v8 ? v4 : v11) + v69;
                                    if (*(int *)v49 == *v72)
                                    {
                                        v73 = sub_84f30(k + 6, v72 + 1);
                                        v74 = arm64g_calculate_condition(130, v73, 5, 0);
                                        if (!(v74 & 1))
                                        {
                                            v75 = v73 + 4;
                                            if ((int)((unsigned int)v75 * 4) > (int)((unsigned int)(!((v51 & 0xffffffff) * 0x100000000) ? 32 : Clz((v51 & 0xffffffff) * 0x100000000)) + (unsigned int)v53 * 4 - 30))
                                            {
                                                v53 = v75;
                                                v51 = 1;
                                                v52 = v49;
                                            }
                                        }
                                    }
                                }
                            }
                            v15 = 0x3b9ac9ff;
                            v17 = &v16;
                            v16 = &v17;
                            v76 = v9;
                            if (v76 == 6)
                            {
                                node = sub_b0998(a0, v49);
                                if (node < 4)
                                    goto LABEL_98cb8;
                            }
                            else if (v76 == 5)
                            {
                                node = sub_b12d4();
                                if (4 > node)
                                    goto LABEL_98cb8;
                            }
                            else
                            {
                                node = sub_95248();
                                if (4 > node)
                                    goto LABEL_98cb8;
                            }
                            v50 = v15;
                            if ((int)((unsigned int)(!((v50 & 0xffffffff) * 0x100000000) ? 32 : Clz((v50 & 0xffffffff) * 0x100000000)) + (unsigned int)node * 4 - 31) <= (int)((unsigned int)(!((v51 & 0xffffffff) * 0x100000000) ? 32 : Clz((v51 & 0xffffffff) * 0x100000000)) + (unsigned int)v53 * 4 - 24))
                                goto LABEL_98cb8;
                        }
                        else
                        {
LABEL_98cb8:
                            node = v53;
                            v50 = v51;
                            v49 = v52;
                            v77 = a1;
                            if (3 >= v51)
                                goto LABEL_98cd0;
                            goto LABEL_98948;
                        }
                        v52 = v49;
                        v51 = v50;
                        v53 = node;
                        k = v49;
                    } while (i > v49);
                }
                v77 = a1;
                if (v50 > 3)
                {
LABEL_98948:
                    v78 = (unsigned int)(v49 - (v50 + v11)) + 3;
                    v79 = (v78 < (unsigned int)v8 ? v4 : v11);
                    v80 = (v78 < (unsigned int)v8 ? v0 : v6);
                    v81 = v1;
                    if (v49 > v81)
                    {
                        v82 = v78;
                        if (v79 + v82 > v80)
                        {
                            v83 = v79 + v82 - 1;
                            v84 = v49 - 1;
                            do
                            {
                                v85 = v83;
                                if (*(char *)v84 != *(char *)v85)
                                {
                                    v49 = v84 + 1;
                                    goto LABEL_98ce4;
                                }
                            } while ((node += 1, v86 = v84 - 1, v84 > v81 && (v84 = v86, v83 = v85 - 1, v80 < v85)));
                            v49 = v86 + 1;
                        }
                    }
LABEL_98ce4:
                    v87 = (unsigned int)v50 - 3;
                }
                else
                {
LABEL_98cd0:
                    v87 = v28;
                    v28 = v2;
                    v81 = v1;
                }
                v88 = v49 - v81;
                v17 = &v16;
                v16 = &v17;
                if (v49 > v3)
                {
                    sub_82208(v77->field_18);
                }
                else
                {
                    *v77->field_18 = *(int128_t *)v81;
                    v89 = v77->field_18;
                    if (v88 > 16)
                    {
                        v89[1] = (int128_t)v81[16];
                        if (v88 >= 33)
                        {
                            iter = v89 + 2;
                            v91 = v81 + 48;
                            do
                            {
                                *iter = *(int128_t *)((char *)v91 - 16);
                                v92 = v91 + 2;
                                iter[1] = *v91;
                                iter += 2;
                                v91 = v92;
                            } while (iter < v89 + v88);
                        }
                    }
                    else
                    {
                        v77->field_18 = v89 + v88;
                        v93 = v77->field_8;
                        *(unsigned short *)&v93->padding_0[4] = (unsigned short)v88;
                        *(unsigned int *)&v93->padding_0[0] = v50;
                        v94 = node - 3;
                        if (v94 >= 0x10000)
                            goto LABEL_98f38;
LABEL_98d50:
                        v93->field_6 = (unsigned short)v94;
                        v77->field_8 = &v93[1];
                        v21 = v7;
                        v23 = v8;
                        if (!*(int *)((char *)&a0[1].field_10 + 4))
                            goto LABEL_98d6c;
                        goto LABEL_98d68;
                    }
                }
                v77->field_18 = v77->field_18 + v88;
                v93 = v77->field_8;
                if (0x10000 > v88)
                {
                    *(unsigned short *)&v93->padding_0[4] = (unsigned short)v88;
                    *(unsigned int *)&v93->padding_0[0] = v50;
                    v94 = node - 3;
                    if (0x10000 <= v94)
                        goto LABEL_98f38;
                    goto LABEL_98d50;
                }
                v95 = &v93->padding_0[-1 * v77->field_0];
                *(unsigned int *)&v77->padding_20[40] = 1;
                v77->field_4c = v95 >> 3;
                *(unsigned short *)&v93->padding_0[4] = (unsigned short)v88;
                *(unsigned int *)&v93->padding_0[0] = v50;
                v94 = node - 3;
                if (v94 < 0x10000)
                    goto LABEL_98d50;
LABEL_98f38:
                v96 = &v93->padding_0[-1 * v77->field_0] >> 3;
                *(unsigned int *)&v77->padding_20[40] = 2;
                v77->field_4c = v96;
                v93->field_6 = (unsigned short)v94;
                v77->field_8 = &v93[1];
                v21 = v7;
                v23 = v8;
                if (!*(int *)((char *)&a0[1].field_10 + 4))
                    goto LABEL_98d6c;
LABEL_98d68:
                *(unsigned int *)((char *)&a0[1].field_10 + 4) = 0;
LABEL_98d6c:
                k = v49 + node;
                if (k > i)
                {
                    v20 = k;
                    v48 = v87;
                    v29 = v28;
                    v22 = v4;
                }
                else
                {
                    v22 = v4;
                    do
                    {
                        v97 = v87;
                        v87 = v28;
                        v98 = v11;
                        v99 = k - v98;
                        v100 = (unsigned int)(v99 - a0->field_1c);
                        v101 = v10;
                        v102 = arm64g_calculate_condition((v101 < v100 ? 3 : 0), (v101 < v100 ? a0->field_28 : 0), 0, 0);
                        v103 = v99 - v28;
                        v104 = (unsigned int)(v99 - (v102 & 1 ? (unsigned int)(v99 - v101) : a0->field_1c));
                        v105 = arm64g_calculate_condition((unsigned int)v28 <= v104 | 128, ((unsigned int)v28 <= v104 ? v103 - v23 & 0xffffffff : 0x20000000), ((unsigned int)v28 <= v104 ? 4 : 0), 0);
                        if (v105 & 1 || (v106 = ((unsigned int)v103 < (unsigned int)v23 ? v22 : v98) + v103, *(int *)k != *v106))
                        {
                            v20 = k;
                            v48 = v97;
                            v29 = v87;
                            break;
                        }
                        v107 = sub_84f30(k + 4, v106 + 1, v21, ((unsigned int)v103 < (unsigned int)v23 ? v5 : v21), v6);
                        v17 = &v16;
                        v16 = &v17;
                        if (k > v3)
                            sub_82208(v77->field_18, k, k, v3);
                        else
                            *v77->field_18 = *(int128_t *)k;
                        v108 = v77->field_8;
                        *(unsigned short *)&v108->padding_0[4] = 0;
                        *(unsigned int *)&v108->padding_0[0] = 1;
                        v109 = v107 + 1;
                        v29 = v97;
                        if (0x10000 <= v109)
                        {
                            v110 = &v108->padding_0[-1 * v77->field_0];
                            *(unsigned int *)&v77->padding_20[40] = 2;
                            v77->field_4c = v110 >> 3;
                        }
                        v108->field_6 = (unsigned short)v109;
                        k += v107 + 4;
                        v77->field_8 = &v108[1];
                        v28 = v29;
                        v20 = k;
                        v48 = v87;
                    } while (k <= i);
                }
            }
            else
            {
                v45 = sub_b0998(a0, k, v21, &v15);
                node = (v43 < v45 ? v45 : v43);
                if (4 <= node)
                    goto LABEL_98910;
LABEL_987bc:
                v47 = k - v20;
                k = k + (v47 >> 8) + 1;
                *(unsigned int *)((char *)&a0[1].field_10 + 4) = v47 > 0x8ff;
                v48 = v28;
                v23 = v8;
                v29 = v2;
                continue;
            }
            v28 = v48;
        } while (i > k);
    }
    else
    {
        v48 = v28;
    }
    *a2 = v48;
    a2[1] = v29;
    return v21 - v20;
}
