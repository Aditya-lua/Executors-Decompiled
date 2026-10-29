/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x43ba0..0x4451c (2428 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_43ba0_11 {
    char padding_0[488];
    unsigned long long field_1e8;
    char padding_1f0[32];
    unsigned long long field_210;
    char padding_218[24];
    unsigned long long field_230;
    char padding_238[16];
    unsigned long long field_248;
    char padding_250[736];
    unsigned long long field_530;
    unsigned long long field_538;
    char field_540;
    char padding_541[3];
    unsigned int field_544;
    char padding_548[48];
    unsigned long long field_578;
    unsigned long long field_580;
    char padding_588[88];
    void* field_5e0;
} st_43ba0_11;

typedef struct st_43ba0_9 {
    uint128_t field_0;
} st_43ba0_9;

typedef struct st_43ba0_1 {
    char padding_0[32];
    struct st_43ba0_2 *field_20;
} st_43ba0_1;

typedef struct st_43ba0_14 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
} st_43ba0_14;

typedef struct st_43ba0_7 {
    char padding_0[16];
    uint128_t field_10;
    uint128_t field_20;
    unsigned long long field_30;
} st_43ba0_7;

typedef struct st_43ba0_6 {
    char padding_0[8];
    uint128_t field_8;
    uint128_t field_18;
    unsigned long long field_28;
} st_43ba0_6;

typedef struct st_43ba0_5 {
    char padding_0[56];
    struct st_43ba0_2 *field_38;
    unsigned int field_40;
} st_43ba0_5;

typedef struct st_43ba0_2 {
    long long field_0;
} st_43ba0_2;

typedef struct st_43ba0_13 {
    unsigned long long field_0;
    char padding_8[736];
    unsigned long long field_2e8;
    unsigned long long field_2f0;
    char field_2f8;
    char padding_2f9[3];
    unsigned int field_2fc;
    char padding_300[48];
    unsigned long long field_330;
    unsigned long long field_338;
    char padding_340[88];
    void* field_398;
} st_43ba0_13;

typedef struct st_43ba0_12 {
    unsigned long long field_0;
    char padding_8[16];
    unsigned long long field_18;
    char padding_20[736];
    unsigned long long field_300;
    unsigned long long field_308;
    char field_310;
    char padding_311[3];
    unsigned int field_314;
    char padding_318[48];
    unsigned long long field_348;
    unsigned long long field_350;
    char padding_358[88];
    void* field_3b0;
} st_43ba0_12;

typedef struct st_43ba0_4 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[24];
    long long field_28;
    char padding_30[16];
    long long field_40;
    char padding_48[736];
    long long field_328;
    long long field_330;
    char field_338;
    char padding_339[3];
    unsigned int field_33c;
    char padding_340[48];
    unsigned long long field_370;
    unsigned long long field_378;
    char padding_380[88];
    void* field_3d8;
} st_43ba0_4;

typedef struct st_43ba0_3 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[32];
    unsigned long long field_30;
    char padding_38[24];
    long long field_50;
    char padding_58[16];
    long long field_68;
    char padding_70[736];
    long long field_350;
    long long field_358;
    char field_360;
    char padding_361[3];
    unsigned int field_364;
    char padding_368[48];
    unsigned long long field_398;
    unsigned long long field_3a0;
    char padding_3a8[88];
    void* field_400;
} st_43ba0_3;

typedef struct st_43ba0_0 {
    char field_0;
} st_43ba0_0;

typedef struct st_43ba0_15 {
    char padding_0[8];
    unsigned int field_8;
} st_43ba0_15;

extern unsigned long long g_e670e8;
extern unsigned long long g_e670f8;
extern unsigned int g_f00b60;
extern unsigned int g_f00b70;

unsigned long long sub_43ba0(void* a0, st_43ba0_5 *a1, void* a2, char a3, unsigned long long a4)
{
    unsigned long long i;  // x27
    unsigned long long idx;  // x28
    unsigned long long v38;  // 4102
    unsigned long long v39;  // x0
    unsigned long long v40;  // x24
    unsigned int v41;  // w0
    st_43ba0_6 *v42;  // x0
    unsigned long long v43;  // x25
    unsigned long long v44;  // x24
    unsigned long long v45;  // x0
    unsigned long long v46;  // x8
    unsigned long long v47;  // x24
    unsigned long long v30;  // x1
    unsigned int v48;  // w0
    unsigned long v49;  // x26
    unsigned long long v50;  // x24
    unsigned int v51;  // w0
    unsigned long long v52;  // x26
    unsigned long long v53;  // x24
    st_43ba0_7 *v54;  // x25
    st_43ba0_14 *v55;  // x25
    st_43ba0_6 *v56;  // x0
    uint128_t v57;  // q0
    unsigned long long idx1;  // x23
    uint128_t v58;  // q1
    unsigned long long v59;  // x0
    st_43ba0_3 *v60;  // x24
    st_43ba0_11 *v61;  // x1
    st_43ba0_15 *v62;  // x0
    st_43ba0_12 *v63;  // x27
    st_43ba0_13 *v64;  // x25
    st_43ba0_1 *v65;  // x8
    unsigned long long *v66;  // x28
    void* v67;  // x27
    unsigned long long v32;  // x8
    unsigned long v68;  // x0
    unsigned long long j;  // x23
    long long v70;  // x0
    char *v71;  // x1
    unsigned long long idx2;  // x21
    unsigned long long v73;  // x0
    unsigned long long v74;  // x0
    st_43ba0_4 *v75;  // x20
    unsigned long long v76;  // x0
    unsigned long v33;  // cc_dep1
    unsigned long v34;  // cc_dep2
    unsigned long long v35;  // 4110
    unsigned long long v36;  // 4102
    unsigned long long v37;  // 4110
    long long v0;  // [bp-0x130]
    st_43ba0_12 *v1;  // [bp-0x128], Other Possible Types: unsigned long
    st_43ba0_13 *v2;  // [bp-0x120], Other Possible Types: unsigned long
    unsigned int v3;  // [bp-0x118]
    st_43ba0_0 **v4;  // [bp-0x110], Other Possible Types: char
    st_43ba0_0 *v5;  // [bp-0x108]
    st_43ba0_0 **v6;  // [bp-0x100], Other Possible Types: uint128_t, char
    st_43ba0_0 *v7;  // [bp-0xe8], Other Possible Types: st_43ba0_3 *, st_43ba0_4 *, unsigned long long *
    unsigned long v8;  // [bp-0xe0]
    unsigned long long *v9;  // [bp-0xd8], Other Possible Types: void*, st_43ba0_9 **, unsigned long
    char *index;  // [bp-0xd0], Other Possible Types: st_43ba0_11 *, long long, char
    uint128_t v11;  // [bp-0xc8], Other Possible Types: char, unsigned int, unsigned long long
    unsigned long long v12;  // [bp-0xc4]
    unsigned long long v13;  // [bp-0xc0]
    uint128_t v14;  // [bp-0xb8], Other Possible Types: unsigned long long
    unsigned long long v15;  // [bp-0xb4]
    unsigned long long v16;  // [bp-0xb0]
    unsigned long v17;  // [bp-0xa8], Other Possible Types: unsigned long long
    unsigned long long v18;  // [bp-0xa4]
    unsigned long long v19;  // [bp-0xa0], Other Possible Types: unsigned int
    unsigned long long v20;  // [bp-0x98]
    unsigned long long v21;  // [bp-0x90]
    unsigned long v22;  // [bp-0x88]
    unsigned long long v23;  // [bp-0x80]
    unsigned long long v24;  // [bp-0x78]
    unsigned long long v25;  // [bp-0x70]
    char *v26;  // [bp-0x10]
    char v27;  // [bp+0x0]

    v26 = &v27;
    v5 = &v4;
    v4 = &v5;
    v3 = (int)a0[1532];
    v23 = 0;
    v24 = 0;
    v25 = 0;
    sub_3bba4(&v23, (long long)a2[96]);
    v1 = (long long)a0[1584];
    v2 = (long long)a0[1592];
    i = (long long)a2[96];
    if (i)
    {
        idx = 0;
        do
        {
            v30 = 0;
            idx1 = idx;
            v22 = *(long long *)((long long)a2[88] + idx * 8);
            v32 = *(long long *)&a1->field_40;
            v33 = idx;
            v34 = v32;
            if (v32 > idx)
                v30 = *(long long *)&a1->field_38[idx1];
            v21 = v30;
            idx = idx1 + 1;
            if (idx == v32)
            {
                v35 = arm64g_calculate_condition(4, v33, v34, 0);
                v36 = arm64g_calculate_condition(148, (v35 & 1 ? i : 0), (v35 & 1 ? v32 : 0), 0);
                if (v36 & 1)
                    goto LABEL_43cb0;
            }
            else
            {
                v37 = arm64g_calculate_condition(4, v33, v34, 0);
                v38 = arm64g_calculate_condition(144, (v37 & 1 ? i : 0), (v37 & 1 ? v32 : 0), 0);
                if (v38 & 1)
                    goto LABEL_43cb0;
            }
            if (sub_4489c(a0))
            {
                v49 = (int)a2[96] - a1->field_40 + 1;
                v50 = sub_3b87c(a0, v21, v49);
                v51 = sub_2b4f8(*(long long *)a0);
                if (v21 && *(int *)(v21 + 8) == g_f00b70)
                {
                    sub_3d4b0(a0);
                }
                else if (v21 && *(int *)(v21 + 8) == g_f00b60)
                {
                    v7 = &v6;
                    v6 = &v7;
                    sub_395b0(a0);
                    sub_2ad10(*(long long *)a0, 63, v50, (unsigned int)v49 + 1 & 0xff, 0);
                }
                i = (long long)a2[96];
                if ((unsigned long long)(long long)a2[96] > idx1)
                {
                    v52 = 0;
                    do
                    {
                        v9 = *(long long *)((long long)a2[88] + idx1 * 8);
                        index = (char)v50 + (char)v52;
                        v11 = 0;
                        v14 = 0;
                        v17 = 0;
                        v19 = v51;
                        v20 = 0;
                        sub_43a30(&v23, &v9);
                        idx1 += 1;
                        i = (long long)a2[96];
                        v52 += 1;
                    } while (idx1 < (unsigned long long)(long long)a2[96]);
                }
            }
LABEL_43cb0:
            v39 = sub_34930(a0 + 224, &v22);
            if (v39 && *(char *)(v39 + 16) == 1)
            {
                v40 = sub_3b87c(a0, v21, 1);
                v41 = sub_2b4f8(*(long long *)a0);
                if (v21)
                    sub_47e48(a0);
                else
                    sub_2ad10(*(long long *)a0, 2, v40, 0, 0);
                v9 = v22;
                index = v40;
                v11 = 0;
                v14 = 0;
                v17 = 0;
                v19 = v41;
                v20 = 0;
                sub_43a30(&v23, &v9);
                continue;
            }
            if (!v21)
            {
                v9 = v22;
                index = 0xff;
                v11 = 1;
                v20 = 0;
                v12 = 0;
                v15 = 0;
                v18 = 0;
                sub_43a30(&v23, &v9);
            }
            v42 = sub_3a7e0(a0 + 264, &v21);
            if (v42 && *(int *)&(v42->padding_0)[1])
            {
                v9 = v22;
                index = 0xff;
                v11 = *(int128_t *)(v42->padding_0)[1];
                v14 = *(int128_t *)((char *)&v42->field_8 + 8);
                v17 = *(long long *)((char *)&v42->field_18 + 8);
                v19 = 0;
                v20 = 0;
                sub_43a30(&v23, &v9);
                continue;
            }
            v43 = sub_47588(v21);
            if (v43)
            {
                v44 = sub_34930(a0 + 224, v43 + 32);
                v45 = sub_42480(a0, v43);
                if (v45 >> 31 & 1)
                    goto LABEL_43da0;
                if (v44)
                {
                    if (*(char *)(v44 + 16) & 1)
                        goto LABEL_43da0;
                    v9 = v22;
                    index = v45;
                    v11 = 0;
                    v14 = 0;
                    v17 = 0;
                    v19 = 0xffffffff;
                    v46 = *(long long *)(v44 + 8);
                }
                else
                {
                    v46 = 0;
                    v9 = v22;
                    index = v45;
                    v11 = 0;
                    v14 = 0;
                    v17 = 0;
                    v19 = 0xffffffff;
                }
                v20 = v46;
                sub_43a30(&v23, &v9);
            }
            else
            {
LABEL_43da0:
                v47 = sub_3b87c(a0, v21, 1);
                v48 = sub_2b4f8(*(long long *)a0);
                sub_47e48(a0, v21, v47, 1);
                v9 = v22;
                index = v47;
                v11 = 0;
                v14 = 0;
                v17 = 0;
                v19 = v48;
                v20 = v21;
                sub_43a30(&v23, &v9);
            }
        } while ((i = (long long)a2[96], i > idx));
    }
    for (; i < (unsigned long long)*(long long *)&a1->field_40; i += 1)
    {
        sub_4716c(a0, *(long long *)&a1->field_38[i]);
    }
    v53 = v23;
    if (v53 != v24)
    {
        do
        {
            v54 = v53;
            v55 = &v54->field_10;
            if ((int)v54->field_10)
            {
                sub_460d4(a0 + 304, v53);
                v56 = sub_436f8(a0 + 304, v53);
                v57 = v55->field_0;
                v58 = v55->field_10;
                *(unsigned long long *)((char *)&v56->field_18 + 8) = v55->field_20;
                *(uint128_t *)((char *)&v56->field_8 + 8) = v58;
                *(uint128_t *)(v56->padding_0)[1] = v57;
            }
            else
            {
                sub_3f5c4(a0, *(long long *)v53, *(char *)(v53 + 8), *(int *)(v53 + 56));
                if (*(long long *)(v53 + 64))
                {
                    v59 = sub_34930(a0 + 224, v53);
                    if (v59)
                        *(long long *)(v59 + 8) = *(long long *)(v53 + 64);
                }
            }
        } while ((v53 += 72, v53 != v24));
    }
    v9 = a2;
    index = (long long)(v2 - v1) >> 3;
    v11 = a3;
    v14 = 0;
    v16 = 0;
    v13 = 0;
    sub_3ef2c(a0 + 1680, &v9);
    v7 = &v13;
    sub_10344(&v7);
    v60 = a0 + 664;
    v61 = a0 + 184;
    sub_372bc(v60, v61, a0 + 224, a0 + 8, (long long)a2[144], (long long)a0[1512]);
    if ((long long)a0[680])
    {
        v9 = sub_39ab8(v60);
        index = v61;
        v7 = v60;
        v8 = (long long)a0[672];
        if (sub_290b8(&v9, &v7))
        {
            do
            {
                v6 = *(int128_t *)((char *)*v9 + 0x10 * index);
                sub_36400(a0 + 424, &v6);
                v62 = sub_12484(a0 + 424, &v6);
                if (*(unsigned int *)((void*)&v6 + 8) != v62->field_8)
                {
                    sub_36400(a0 + 704, &v6);
                    *(unsigned int *)(sub_12484(a0 + 704, &v6) + 8) = v62->field_8;
                    v62->field_8 = *(unsigned int *)((void*)&v6 + 8);
                }
            } while ((sub_3ec0c(&v9), sub_290b8(&v9, &v7) & 1));
        }
        sub_42214(v60, 32);
    }
    v63 = a0 + 744;
    sub_c84c(v63, (long long)a0[744]);
    v64 = a0 + 0x300;
    sub_c84c(v64, (long long)a0[0x300]);
    sub_4c624(a0 + 264, a0 + 224, a0 + 304, (long long)a0[1520], (char)a0[1528], (int)a0[48] == 1, (long long)a0[88], (long long)a2[144], (long long)a0[1512], a0 + 344, v63, v64);
    v65 = (long long)a2[144];
    if (*(long long *)&v65[1].padding_0[0])
    {
        v0 = index;
        v1 = v63;
        v2 = v64;
        v66 = &g_e670f8;
        sub_38924(a0, *(long long *)v65->field_20);
        if (sub_3e65c(a0 + 264, *(long long *)v65->field_20))
        {
            v67 = (long long)a0[1688];
            if (*(long long *)((char *)v67 - 24) != *(long long *)((char *)v67 - 16))
            {
                v68 = sub_2bc4c(*(long long *)a0);
                if (*(long long *)(*(long long *)((char *)v67 - 16) - 8) == v68 - 1)
                {
                    sub_31820(*(long long *)a0, 23);
                    sub_c84c(v67 - 24, *(long long *)((char *)v67 - 16) - 8);
                    goto *((void *)(g_e670e8));
                }
            }
            v66 = &g_e670e8;
        }
        goto *((void *)(*v66));
    }
    else
    {
        if (a4)
        {
            j = 0;
            do
            {
                sub_2ad10(*(long long *)a0, 2, (unsigned int)j + a3 & 0xff, 0, 0);
                j += 1;
            } while (a4 != j);
        }
        sub_3b76c(a0, index);
        sub_46278(a0, index);
        v70 = sub_2bc4c(*(long long *)a0);
        sub_3a26c(a0, a1, (long long)a0[1688] - 24, v70);
        v71 = (long long)a0[1688] - 48;
        sub_39a5c(a0 + 1680, v71);
        if ((long long)a2[96])
        {
            idx2 = 0;
            do
            {
                v9 = *(long long *)((long long)a2[88] + idx2 * 8);
                v73 = sub_3a7e0(a0 + 304, &v9);
                if (v73)
                    *(unsigned int *)(v73 + 8) = 0;
                v71 = &v9;
                v74 = sub_34930(a0 + 224, &v9);
                if (v74)
                    *(unsigned long long *)(v74 + 8) = 0;
                idx2 += 1;
            } while (idx2 < (unsigned long long)(long long)a2[96]);
        }
        if ((long long)a0[720])
        {
            v75 = a0 + 704;
            v9 = sub_39ab8(v75);
            index = v71;
            v7 = v75;
            v8 = (long long)a0[712];
            if (sub_290b8(&v9, &v7))
            {
                do
                {
                    v6 = *(int128_t *)((char *)*v9 + 0x10 * index);
                    sub_36400(a0 + 424, &v6);
                    *(unsigned int *)(sub_12484(a0 + 424, &v6) + 8) = *(unsigned int *)((void*)&v6 + 8);
                    sub_3ec0c(&v9);
                } while (sub_290b8(&v9, &v7) & 1);
            }
            sub_42214(v7, 32);
        }
        sub_4db50(a0 + 264, v63);
        sub_4dc7c(a0 + 304, v64);
        v9 = &v23;
        v76 = sub_402a0(&v9);
        *(unsigned int *)&a0[1532] = v3;
        return v76;
    }
}
