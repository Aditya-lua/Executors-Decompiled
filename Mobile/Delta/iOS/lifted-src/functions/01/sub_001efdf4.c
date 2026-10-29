/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1efdf4..0x1f04ec (1784 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1efdf4_1 {
    char padding_0[20];
    unsigned int field_14;
} st_1efdf4_1;

typedef struct st_1efdf4_4 {
    char padding_0[20];
    unsigned int field_14;
    char padding_18[8];
    unsigned long long field_20;
} st_1efdf4_4;

typedef struct st_1efdf4_5 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8[4];
    char field_c;
    char padding_d[11];
    unsigned long long field_18;
} st_1efdf4_5;

typedef struct st_1efdf4_3 {
    uint128_t field_0;
    unsigned int field_10[4];
    char field_14;
    char padding_15[3];
    char field_18;
    char padding_19[7];
    unsigned long long field_20;
    char padding_28[20];
    unsigned int field_3c;
    char padding_40[8];
    unsigned long long field_48;
} st_1efdf4_3;

typedef struct st_1efdf4_2 {
    struct st_1efdf4_1 *field_0;
    unsigned long long field_8;
    char padding_10[8];
    char field_18;
    char padding_19[47];
    unsigned long long field_48;
    char padding_50[16];
    unsigned long long field_60;
} st_1efdf4_2;

typedef struct st_1efdf4_0 {
    char field_0;
} st_1efdf4_0;


long long sub_1efdf4(st_1efdf4_2 *a0)
{
    unsigned long long v29;  // x25
    unsigned long long v30;  // x27
    unsigned long long v39;  // x9
    st_1efdf4_1 *v40;  // x8
    unsigned long v41;  // x25
    unsigned long v42;  // x25
    unsigned int *v43;  // x8
    long long v44;  // x0
    unsigned int v45;  // w0
    unsigned long long v46;  // x8
    unsigned long long v47;  // x0
    unsigned long long v48;  // 4117
    void* v31;  // x26
    void* v49;  // x8
    unsigned long v50;  // x8
    unsigned long long v51;  // w9
    unsigned long v52;  // x8
    unsigned long long v53;  // x0
    unsigned long long v54;  // 4139
    unsigned long long v55;  // x8
    unsigned long long v56;  // 4130
    unsigned long long v57;  // 4131
    void* v58;  // x10
    unsigned int v32;  // x21
    void* v59;  // x25
    st_1efdf4_3 *v60;  // x22
    unsigned long v61;  // x10
    unsigned long long v62;  // x11
    unsigned long long v63;  // x9
    void* v64;  // x12
    unsigned long long v65;  // x8
    unsigned long long v66;  // x9
    void* v67;  // x8
    uint128_t v68;  // q0
    unsigned long long v33;  // x28
    uint128_t v69;  // q1
    st_1efdf4_4 *v70;  // x8
    unsigned long v71;  // x13
    unsigned long long v72;  // x14
    unsigned long long v73;  // x12
    unsigned long long v74;  // x9
    unsigned int *v75;  // x8
    void* v76;  // x9
    void* v77;  // x8
    void* v78;  // x8
    st_1efdf4_1 *v34;  // x23
    void* v35;  // x20
    void* v36;  // x24
    st_1efdf4_5 *v37;  // x24
    void* v38;  // x22
    unsigned long v0;  // [bp-0x198]
    uint128_t v1;  // [bp-0x190]
    unsigned long v2;  // [bp-0x178]
    unsigned long long v3;  // [bp-0x170]
    unsigned long long v4;  // [bp-0x160]
    unsigned long v5;  // [bp-0x158]
    unsigned long long v6;  // [bp-0x150]
    unsigned long long v7;  // [bp-0x148]
    long long v8;  // [bp-0x140]
    void* v9;  // [bp-0x138]
    st_1efdf4_0 **v10;  // [bp-0x130], Other Possible Types: char
    st_1efdf4_0 *v11;  // [bp-0x128]
    uint128_t v12;  // [bp-0x120]
    uint192_t v13;  // [bp-0x110]
    unsigned long long idx;  // [bp-0xf0]
    unsigned long long v15;  // [bp-0xe8]
    unsigned long long v16;  // [bp-0xe0]
    unsigned long long v17;  // [bp-0xd8]
    unsigned long long v18;  // [bp-0xd0]
    unsigned long long v19;  // [bp-0xc8]
    unsigned long long v20;  // [bp-0xc0]
    unsigned long long v21;  // [bp-0xb8]
    unsigned long long v22;  // [bp-0xb0]
    unsigned long long v23;  // [bp-0xa8]
    unsigned long long v24;  // [bp-0xa0]
    unsigned long long v25;  // [bp-0x98]
    char v26;  // [bp-0x90]
    char *v27;  // [bp-0x10]
    char v28;  // [bp+0x0]

    v27 = &v28;
    v11 = &v10;
    v10 = &v11;
    v23 = 0;
    v24 = 0;
    v25 = 0;
    v20 = 0;
    v21 = 0;
    v22 = 0;
    v17 = 0;
    v18 = 0;
    v19 = 0;
    idx = 0;
    v15 = 0;
    v16 = 0;
    if (a0->field_8 >= 2)
    {
        v0 = a0->field_8;
        v29 = 1 - v0;
        v30 = 0xffffffffffffffff;
        v3 = 1;
        v1 = 0x10000000100000001;
        v31 = 40;
        v32 = 2;
        v33 = 1;
        v7 = v29;
        do
        {
            v34 = a0->field_0;
            v35 = v34 + v31;
            if ((*(int *)v35 | 2) != 2 || !(v36 = v35, v37 = v36 + 8, (int)v36[8] != (int)v35[12]))
                continue;
            v38 = v34 + v31;
            v39 = (long long)v38[24];
            if ((long long)v38[24] >= 0)
            {
                if (!sub_1f328c(v37))
                    continue;
                v40 = a0->field_0;
                v39 = 0xffffffffffffffff;
            }
            else
            {
                v40 = v34;
            }
            v6 = v39;
            v41 = v39 + v32 - 1;
            v9 = (char *)v40 + 40 * v41;
            v4 = sub_1eca64(v9);
            v5 = v41;
            v8 = v41 + v4;
            *(long long *)((char *)&v13 + 16) = (long long)v35[32];
            v12 = *(int128_t *)v35;
            *(int128_t *)&v13 = (int128_t)v35[16];
            v42 = (int)v38[4];
            if (*(int *)v38)
            {
                v43 = a0->field_60 + v42 * 8;
                sub_1eee04(&v20, a0->field_48 + *v43 * 8, v43[1]);
                v29 = v7;
                if (!v21)
                    goto LABEL_1f008c;
            }
            else
            {
                sub_1fb5d8(&v20, 1);
                *(unsigned long long *)v20 = v42 | v42 * 0x100000000;
                if (*(char *)(v34 + v31 + 20) & 1)
                    sub_1f0f04(&v20);
            }
            v15 = 0;
            v18 = 0;
            v44 = sub_1ecbe0(&v26, a0->field_8);
            sub_1f2330(v44, a0->field_8);
            v45 = sub_1f4dd0(a0, &v17, v8, &v26, 0, 1);
            sub_1eccac(&v26);
            if ((int)v9[16])
                v46 = 0;
            else
                v46 = v45;
            if (!v18)
            {
                v29 = v7;
                if (v46 & 1)
                    continue;
LABEL_1f008c:
                v58 = v9;
                if (*(int *)v58 != 4)
                    goto LABEL_1f03c4;
                goto LABEL_1f009c;
            }
            v29 = v7;
            if (v46 & 1)
                continue;
            sub_1f10ac(&v20, &v23, &v17);
            if (!v24)
                goto LABEL_1f008c;
            if (*(int *)v35 != 2 || !v21)
                continue;
            v47 = sub_1ee8d4(&v20);
            *(unsigned int *)&v38[4] = v47;
            v48 = arm64g_calculate_condition(1, v47 & 0xffffffff, 1, 0);
            if (!(v48 & 1))
            {
                if (v47 >> 21 & 1)
                {
                    *(unsigned int *)&v38[4] = (unsigned int)v47 & 0xffdfffff;
                    *(unsigned int *)(v34 + v31 + 20) = 1;
                    a0->field_0->field_14 = a0->field_0->field_14 | 1;
                }
                *(unsigned int *)v35 = 0;
            }
            else
            {
                *(unsigned int *)&v38[4] = sub_1ef050(&a0->field_18, &v20);
            }
            v49 = v34 + v31;
            *(unsigned int *)&v49[20] = (int)v49[20] | 20;
            *(unsigned long long *)&v49[32] = v30 + a0->field_8;
            sub_1ec7e8(&idx, 2);
            *(double *)idx = 8.9123823222e-313;
            *(uint128_t *)(idx + 24) = v3;
            *(uint128_t *)(idx + 8) = v1;
            v50 = (long long)v9[8];
            v51 = (int)v9[16];
            *(unsigned int *)(idx + 16) = v51;
            *(unsigned long *)(idx + 8) = v50;
            v52 = v32 + v4 + v6 - a0->field_8 - 1;
            *(unsigned long *)(idx + 32) = v52;
            if (!v51)
            {
                *(unsigned long *)(idx + 24) = v52;
                *(unsigned long long *)(idx + 32) = 1;
            }
            v53 = sub_1ee8d4(&v23);
            *(unsigned int *)(idx + 40) = 2;
            *(unsigned int *)(idx + 44) = v53;
            *(uint128_t *)(idx + 48) = v1;
            *(uint128_t *)(idx + 64) = v3;
            v54 = arm64g_calculate_condition(1, v53 & 0xffffffff, 1, 0);
            if (!(v54 & 1))
            {
                if (v53 >> 21 & 1)
                {
                    *(unsigned int *)(idx + 44) = (unsigned int)v53 & 0xffdfffff;
                    *(unsigned int *)(idx + 60) = 1;
                    a0->field_0->field_14 = a0->field_0->field_14 | 1;
                }
                *(unsigned int *)(idx + 40) = 0;
                v55 = v33;
                v56 = arm64g_calculate_condition(1, (int)v9[12], 1, 0);
                if (v56 & 1)
                    goto LABEL_1f0394;
            }
            else
            {
                *(unsigned int *)(idx + 44) = sub_1ef050(&a0->field_18, &v23);
                v55 = v33;
                v57 = arm64g_calculate_condition(0x11, (int)v9[12], 1, 0);
                if (!(v57 & 1))
                    goto LABEL_1f0394;
            }
            v55 = v32 + (long long)v38[24] - 1;
LABEL_1f0394:
            *(unsigned long long *)(idx + 64) = v55 + ~a0->field_8;
            *(unsigned int *)(idx + 60) = *(int *)(idx + 60) | 8;
            v29 = v7;
            v58 = v9;
            if (*(int *)v58 == 4)
            {
LABEL_1f009c:
                if ((int)v58[8])
                {
                    v4 = v15;
                    v2 = a0->field_8;
                    v59 = (char *)a0->field_0 + 40 * v6 + 40 * v32;
                    v60 = v59 - 120;
                    if (4 >= (unsigned int)(int)v58[8])
                    {
                        *(unsigned long long *)((char *)&v13 + 8) = v3;
                        *(unsigned long long *)((char *)&v12 + 8) = 4294967297;
                        *(unsigned int *)&v13 = 1;
                        sub_1f0e7c(&idx, v4 + (int)v9[8], &v12);
                        *(unsigned int *)((char *)&v13 + 4) = *(unsigned int *)((void*)&v13 + 4) | 4;
                        v61 = v2;
                        v62 = v4;
                        v63 = v6;
                        *(unsigned long long *)((char *)&v13 + 8) = v30 + v62 + v61 - v63 + 2;
                        v64 = v9;
                        v65 = v32 + v63 - v62 - v61 - (int)v64[8];
                        v66 = v65 - 1;
                        *(unsigned long long *)&v60->field_10[2] = v65;
                        *(unsigned long long *)&v60->field_14 = v66;
                        v60->field_10[1] = v60->field_10[1] | 8;
                        v67 = idx + 40 * v15;
                        v68 = v60->field_0;
                        v69 = (uint128_t)v60->field_10;
                        *(unsigned long long *)((char *)v67 - 8) = v66;
                        *(uint128_t *)((char *)v67 - 24) = v69;
                        *(uint128_t *)((char *)v67 - 40) = v68;
                        *(unsigned long long *)&v60->field_14 = *(unsigned long long *)((void*)&v13 + 16);
                        v60->field_0 = v12;
                        *(uint128_t *)v60->field_10 = *(uint128_t *)&v13;
                        v58 = v64;
                        *(int *)&v58[12] = (int)v58[12] - (int)v58[8];
                        v29 = v7;
                    }
                    else
                    {
                        sub_1f76f0(&idx, a0, v5, 4);
                        v70 = v59 - 80;
                        v71 = v2;
                        v72 = v4;
                        v73 = v6;
                        v74 = v30 + v72 + v71 - v73;
                        *(unsigned long long *)&v60->field_10[2] = v74 + 2;
                        v70->field_14 = v70->field_14 | 52;
                        v70->field_20 = v74 + 1;
                        v75 = idx + 40 * v15;
                        v76 = 32;
                        if (!*(int *)((char *)v75 - 144))
                            v76 = 24;
                        *(unsigned long *)(v75 + v76 - 160) = v32 + v73 - v72 - v71 - 1;
                        *(int *)((char *)v75 - 148) = *(int *)((char *)v75 - 152);
                        *(unsigned int *)((char *)&v13 + 4) = *(unsigned int *)((void*)&v13 + 4) | 8;
                        *(unsigned int *)((char *)&v12 + 12) = *(unsigned int *)((void*)&v12 + 8);
                        v77 = idx + 40 * v15;
                        *(uint128_t *)((char *)v77 - 24) = *(uint128_t *)&v13;
                        *(unsigned long long *)((char *)v77 - 8) = *(unsigned long long *)((void*)&v13 + 16);
                        *(uint128_t *)((char *)v77 - 40) = v12;
                        v29 = v7;
                        v58 = v9;
                    }
                }
                *(int *)&v58[8] = (int)v58[12];
                *(unsigned int *)&v35[12] = (int)v35[12] - v37->field_0;
                v37->field_0 = 0;
                v78 = v34 + v31;
                if ((long long)v78[32])
                    goto LABEL_1efea0;
                goto LABEL_1f03e8;
            }
            else
            {
LABEL_1f03c4:
                *(uint128_t *)&v58[24] = v3;
                *(unsigned int *)&v58[4] = 120;
                if ((long long)v38[24] >= 0)
                {
                    v78 = v34 + v31;
                    if ((long long)v78[32])
                        goto LABEL_1efea0;
                }
                else
                {
                    *(unsigned long long *)&v38[24] = 0;
                    v78 = v34 + v31;
                    if ((long long)v78[32])
                        goto LABEL_1efea0;
                }
LABEL_1f03e8:
                *(long long *)&v78[32] = v8 - (v32 - 1);
LABEL_1efea0:
                sub_1ecb68(a0, &idx);
            }
            v33 += 1;
            v32 += 1;
            v30 -= 1;
            v31 += 40;
        } while (v29 + v32 != 2);
        if (v0 != a0->field_8)
            sub_1f84e0(a0, a0);
    }
    sub_1eccac(&idx);
    sub_1eccac(&v17);
    sub_1eccac(&v20);
    return sub_1eccac(&v23);
}
