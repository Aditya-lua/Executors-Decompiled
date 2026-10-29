/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9dc10..0x9e414 (2052 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9dc10_3 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned int field_18;
} st_9dc10_3;

typedef struct st_9dc10_4 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[8];
    unsigned int field_18;
    char padding_1c[220];
    struct st_9dc10_3 *field_f8;
    char padding_100[16];
    void* field_110;
    char padding_118[20];
    unsigned int field_12c;
} st_9dc10_4;

typedef struct st_9dc10_2 {
    unsigned long long field_0;
    struct st_9dc10_1 *field_8;
    char padding_10[8];
    uint128_t *field_18;
    char padding_20[40];
    unsigned int field_48;
    unsigned int field_4c;
} st_9dc10_2;

typedef struct st_9dc10_1 {
    unsigned int field_0;
    char padding_4[2];
    unsigned short field_6;
} st_9dc10_1;

typedef struct st_9dc10_0 {
    char field_0;
} st_9dc10_0;


char * sub_9dc10(st_9dc10_4 *a0, st_9dc10_2 *a1, unsigned int *a2, void* a3, unsigned long a4)
{
    void* v19;  // x25
    char *v20;  // x23
    unsigned long long v29;  // 4388
    void* k;  // x27
    st_9dc10_4 *v31;  // x26
    void* v32;  // x20
    unsigned long v33;  // x8
    unsigned int *v34;  // x9
    unsigned long long v35;  // 4212
    unsigned long long v36;  // x21
    void* v37;  // w8
    void* v38;  // x0
    unsigned long long v21;  // x19
    void* node;  // x24
    void* v40;  // x8
    void* v41;  // x21
    unsigned long v42;  // x20
    void* v43;  // x24
    void* v44;  // x21
    unsigned long v45;  // x20
    unsigned long long v46;  // x8
    unsigned int *v47;  // x9
    unsigned long long v48;  // 4216
    unsigned long v22;  // x12
    void* v49;  // x0
    unsigned long long v50;  // 4106
    void* v51;  // x8
    void* v52;  // w9
    unsigned long long v53;  // x8
    unsigned int *v54;  // x9
    unsigned long long v55;  // 4212
    void* v56;  // x0
    unsigned long long v57;  // 4106
    void* v58;  // x8
    void* v23;  // w8
    void* v59;  // w9
    st_9dc10_2 *v60;  // x24
    unsigned int v61;  // w10
    char *v62;  // x8
    unsigned long long v63;  // x9
    unsigned long v64;  // x11
    void* v65;  // x10
    char *v66;  // x9
    char *v67;  // x9
    void* v68;  // x11
    unsigned long v24;  // x22
    unsigned long v69;  // x20
    unsigned long v70;  // x21
    void* v71;  // x22
    uint128_t *v72;  // x9
    uint128_t *iter;  // x9
    uint128_t *v74;  // x10
    uint128_t *v75;  // x10
    st_9dc10_1 *v76;  // x8
    unsigned long long v77;  // x9
    void* v78;  // x9
    unsigned long v25;  // x28
    unsigned int v79;  // w10
    st_9dc10_4 *v80;  // x9
    unsigned long long v81;  // x8
    unsigned int v82;  // w12
    unsigned long long v83;  // 4190
    unsigned int *v84;  // x9
    void* v85;  // x25
    st_9dc10_1 *v86;  // x8
    void* v87;  // x9
    unsigned long long v88;  // x10
    st_9dc10_3 *v26;  // x8
    unsigned long v27;  // x14
    unsigned long v28;  // x13
    char *v0;  // [bp-0xf8]
    unsigned long long v1;  // [bp-0xe8]
    void* v2;  // [bp-0xe0]
    unsigned long v3;  // [bp-0xd8]
    char *v4;  // [bp-0xd0]
    char *v5;  // [bp-0xc8]
    unsigned int v6;  // [bp-0xbc]
    unsigned long v7;  // [bp-0xb8]
    st_9dc10_4 *v8;  // [bp-0xb0]
    void* v9;  // [bp-0xa4]
    void* i;  // [bp-0xa0]
    unsigned long v11;  // [bp-0x98]
    st_9dc10_0 **v12;  // [bp-0x90], Other Possible Types: char
    st_9dc10_0 *v13;  // [bp-0x88]
    unsigned long v14;  // [bp-0x80]
    st_9dc10_0 **v15;  // [bp-0x78]
    st_9dc10_0 *v16;  // [bp-0x70]
    char *v17;  // [bp-0x10]
    char v18;  // [bp+0x0]

    v17 = &v18;
    v19 = a3;
    v13 = &v12;
    v12 = &v13;
    v20 = a3 + a4;
    v21 = a0->field_8;
    v22 = a0->field_18;
    v23 = (void*)((unsigned int)(int)a0->field_110 < 6 ? (int)a0->field_110 : 6);
    v9 = (4 < v23 ? v23 : 4);
    v24 = *a2;
    v25 = a2[1];
    v26 = a0->field_f8;
    v27 = v26->field_0;
    v28 = v26->field_8;
    v4 = v21 + v22;
    v0 = v28 + v26->field_18;
    v29 = arm64g_calculate_condition(0x11, v19 - v4 - v0 & 0xffffffff, v27 & 0xffffffff, 0);
    k = (v29 & 1 ? a3 : a3 + 1);
    a0->field_12c = 0;
    i = v20 - 8;
    if (i > k)
    {
        v31 = a0;
        v6 = (unsigned int)v22 + (unsigned int)(v28 - v27);
        v1 = v28 - v6;
        v2 = v20 - 32;
        v3 = v27;
        v11 = v22;
        v7 = v28;
        v8 = a0;
        v5 = v20;
        do
        {
            v32 = k + 1;
            v33 = (unsigned int)(k - v21 - v24) + 1;
            v34 = ((unsigned int)v33 < (unsigned int)v22 ? v28 + v33 - v6 : v21 + v33);
            v35 = arm64g_calculate_condition(129, v33 - v22 & 0xffffffff, 4, 0);
            if (!(v35 & 1) && *v34 == *(int *)v32)
                v36 = sub_84f30(k + 5, v34 + 1, v20, ((unsigned int)v33 < (unsigned int)v22 ? v3 : v20), v4) + 4;
            else
                v36 = 0;
            v14 = 0x3b9ac9ff;
            v16 = &v15;
            v15 = &v16;
            v37 = v9;
            if (v37 != 6)
            {
                if (v37 == 5)
                {
                    v38 = sub_a440c();
                    node = (v36 < v38 ? v38 : v36);
                    if (node >= 4)
                        goto LABEL_9ddfc;
                    goto LABEL_9dce8;
                }
                v38 = sub_a494c();
                node = (v36 < v38 ? v38 : v36);
                if (node < 4)
                    goto LABEL_9dce8;
LABEL_9ddfc:
                v41 = (v36 < v38 ? k : v32);
                v42 = (v36 < v38 ? v14 : 1);
                v43 = node;
                v44 = v41;
                v45 = v42;
                if (k < i)
                {
                    do
                    {
                        v41 = k + 1;
                        v46 = v41 - v21 - v24;
                        v47 = ((unsigned int)v46 < (unsigned int)v11 ? v7 + v46 - v6 : v21 + v46);
                        v48 = arm64g_calculate_condition(129, v46 - v11 & 0xffffffff, 4, 0);
                        if (!(v48 & 1) && *v47 == *(int *)v41)
                        {
                            v49 = sub_84f30(k + 5, v47 + 1);
                            v50 = arm64g_calculate_condition(130, v49, 5, 0);
                            if (!(v50 & 1))
                            {
                                v51 = v49 + 4;
                                v52 = v9;
                                if ((int)((unsigned int)v51 * 3) > (int)((unsigned int)v43 * 3 + (unsigned int)(!((v45 & 0xffffffff) * 0x100000000) ? 32 : Clz((v45 & 0xffffffff) * 0x100000000)) - 30))
                                {
                                    v43 = v51;
                                    v45 = 1;
                                    v44 = v41;
                                    v52 = v9;
                                    goto LABEL_9dfc0;
                                }
                            }
                        }
                        v52 = v9;
LABEL_9dfc0:
                        v14 = 0x3b9ac9ff;
                        v16 = &v15;
                        v15 = &v16;
                        if (v52 == 6)
                        {
                            node = sub_aea10(v8, v41);
                            if (4 > node)
                                goto LABEL_9e058;
                        }
                        else if (v52 == 5)
                        {
                            node = sub_a440c(v8, v41);
                            if (4 > node)
                                goto LABEL_9e058;
                        }
                        else
                        {
                            node = sub_a494c(v8, v41);
                            if (node < 4)
                                goto LABEL_9e058;
                        }
                        v42 = v14;
                        if ((int)((unsigned int)(!((v45 & 0xffffffff) * 0x100000000) ? 32 : Clz((v45 & 0xffffffff) * 0x100000000)) + (unsigned int)v43 * 4 - 27) < (int)((unsigned int)(!((v42 & 0xffffffff) * 0x100000000) ? 32 : Clz((v42 & 0xffffffff) * 0x100000000)) + (unsigned int)node * 4 - 31))
                            continue;
LABEL_9e058:
                        if (i <= v41)
                        {
LABEL_9e170:
                            node = v43;
                            v42 = v45;
                            v41 = v44;
                            v60 = a1;
                            if (3 >= v45)
                                goto LABEL_9e188;
                            goto LABEL_9de30;
                        }
                        v41 = k + 2;
                        v53 = v41 - v21 - v24;
                        v54 = ((unsigned int)v53 < (unsigned int)v11 ? v7 + v53 - v6 : v21 + v53);
                        v55 = arm64g_calculate_condition(145, v53 - v11 & 0xffffffff, 4, 0);
                        if (v55 & 1 && *v54 == *(int *)v41)
                        {
                            v56 = sub_84f30(k + 6, v54 + 1);
                            v57 = arm64g_calculate_condition(130, v56, 5, 0);
                            if (!(v57 & 1))
                            {
                                v58 = v56 + 4;
                                v59 = v9;
                                if ((int)((unsigned int)v58 * 4) > (int)((unsigned int)(!((v45 & 0xffffffff) * 0x100000000) ? 32 : Clz((v45 & 0xffffffff) * 0x100000000)) + (unsigned int)v43 * 4 - 30))
                                {
                                    v43 = v58;
                                    v45 = 1;
                                    v44 = v41;
                                    v59 = v9;
                                    goto LABEL_9e114;
                                }
                            }
                        }
                        v59 = v9;
LABEL_9e114:
                        v14 = 0x3b9ac9ff;
                        v16 = &v15;
                        v15 = &v16;
                        if (v59 == 6)
                        {
                            node = sub_aea10(v8, v41);
                            if (node < 4)
                                goto LABEL_9e170;
                        }
                        else if (v59 == 5)
                        {
                            node = sub_a440c(v8, v41);
                            if (4 > node)
                                goto LABEL_9e170;
                        }
                        else
                        {
                            node = sub_a494c(v8, v41);
                            if (4 > node)
                                goto LABEL_9e170;
                        }
                        v42 = v14;
                        if ((int)((unsigned int)(!((v42 & 0xffffffff) * 0x100000000) ? 32 : Clz((v42 & 0xffffffff) * 0x100000000)) + (unsigned int)node * 4 - 31) <= (int)((unsigned int)(!((v45 & 0xffffffff) * 0x100000000) ? 32 : Clz((v45 & 0xffffffff) * 0x100000000)) + (unsigned int)v43 * 4 - 24))
                            goto LABEL_9e170;
                        v44 = v41;
                        v45 = v42;
                        v43 = node;
                        k = v41;
                    } while (i > v41);
                }
                v60 = a1;
                if (v42 > 3)
                {
LABEL_9de30:
                    v61 = (unsigned int)(v41 - (v42 + v21)) + 3;
                    v62 = (v61 < (unsigned int)v11 ? v0 : v4);
                    v63 = (v61 < (unsigned int)v11 ? v1 : v21);
                    if (v41 > v19)
                    {
                        v64 = v61;
                        if (v63 + v64 > v62)
                        {
                            v65 = v41 - 1;
                            v66 = v63 + v64 - 1;
                            do
                            {
                                v67 = v66;
                                if (*(char *)v65 != *v67)
                                {
                                    v41 = v65 + 1;
                                    goto LABEL_9e198;
                                }
                            } while ((node += 1, v68 = v65 - 1, v65 > v19 && (v65 = v68, v66 = v67 - 1, v62 < v67)));
                            v41 = v68 + 1;
                        }
                    }
LABEL_9e198:
                    v69 = (unsigned int)v42 - 3;
                }
                else
                {
LABEL_9e188:
                    v69 = v24;
                    v24 = v25;
                }
                v70 = v24;
                v71 = v41 - v19;
                v16 = &v15;
                v15 = &v16;
                if (v41 > v2)
                {
                    sub_82208(v60->field_18, v19, v41);
                    v60 = a1;
                    goto LABEL_9e1e0;
                }
                else
                {
                    *v60->field_18 = *(int128_t *)v19;
                    v72 = v60->field_18;
                    if (v71 > 16)
                    {
                        v72[1] = (int128_t)v19[16];
                        if (v71 >= 33)
                        {
                            iter = v72 + 2;
                            v74 = v19 + 48;
                            do
                            {
                                *iter = *(int128_t *)((char *)v74 - 16);
                                v75 = v74 + 2;
                                iter[1] = *v74;
                                iter += 2;
                                v74 = v75;
                            } while (iter < v72 + v71);
                        }
LABEL_9e1e0:
                        v60->field_18 = v60->field_18 + v71;
                        v76 = v60->field_8;
                        if (v71 >= 0x10000)
                        {
                            v77 = (char *)v76 - v60->field_0;
                            v60->field_48 = 1;
                            v60->field_4c = v77 >> 3;
                            goto LABEL_9e26c;
                        }
                    }
                    else
                    {
                        v60->field_18 = v72 + v71;
                        v76 = v60->field_8;
LABEL_9e26c:
                        *(unsigned short *)v76->padding_4 = (unsigned short)v71;
                        v76->field_0 = v42;
                        v78 = node - 3;
                        if (0x10000 <= v78)
                        {
                            v79 = (char *)v76 - v60->field_0 >> 3;
                            v60->field_48 = 2;
                            v60->field_4c = v79;
                        }
                        v76->field_6 = (unsigned short)v78;
                        v60->field_8 = &v76[1];
                        v80 = v8;
                        v20 = v5;
                        if (v80->field_12c)
                            v80->field_12c = 0;
                        k = v41 + node;
                        if (k > i)
                        {
                            v19 = k;
                            v24 = v69;
                            v25 = v70;
                            v31 = v8;
                        }
                        else
                        {
                            do
                            {
                                v25 = v69;
                                v69 = v70;
                                v81 = k - v21 - v70;
                                v82 = v11;
                                v83 = arm64g_calculate_condition(129, v81 - v82 & 0xffffffff, 4, 0);
                                if (v83 & 1 || (v84 = ((unsigned int)v81 < v82 ? v1 : v21) + v81, *v84 != *(int *)k))
                                {
                                    v19 = k;
                                    v24 = v25;
                                    v25 = v69;
                                    v31 = v8;
                                    break;
                                }
                                v85 = sub_84f30(k + 4, v84 + 1, v20, ((unsigned int)v81 < v82 ? v3 : v20), v4);
                                v16 = &v15;
                                v15 = &v16;
                                if (k > v2)
                                    sub_82208(v60->field_18, k, k, v2);
                                else
                                    *v60->field_18 = *(int128_t *)k;
                                v86 = v60->field_8;
                                *(unsigned short *)v86->padding_4 = 0;
                                v86->field_0 = 1;
                                v87 = v85 + 1;
                                if (0x10000 <= v87)
                                {
                                    v88 = (char *)v86 - v60->field_0;
                                    v60->field_48 = 2;
                                    v60->field_4c = v88 >> 3;
                                }
                                v86->field_6 = (unsigned short)v87;
                                k += v85 + 4;
                                v60->field_8 = &v86[1];
                                v70 = v25;
                                v19 = k;
                                v24 = v69;
                                v31 = v8;
                            } while (k <= i);
                        }
                    }
                }
            }
            else
            {
                v38 = sub_aea10(v31, k, v20, &v14);
                node = (v36 < v38 ? v38 : v36);
                if (4 <= node)
                    goto LABEL_9ddfc;
LABEL_9dce8:
                v40 = k - v19;
                k = k + (v40 >> 8) + 1;
                v31->field_12c = v40 > 0x7ff;
                continue;
            }
            v22 = v11;
            v28 = v7;
        } while (i > k);
        a2 = a2;
    }
    *a2 = v24;
    a2[1] = v25;
    return v20 - v19;
}
