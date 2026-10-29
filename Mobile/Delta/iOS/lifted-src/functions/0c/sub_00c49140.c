/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc49140..0xc494f0 (944 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c49140_4 {
    unsigned long long field_0;
    void* field_8;
    unsigned long long field_10;
    void* field_18;
} st_c49140_4;

typedef struct st_c49140_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    void* field_10;
    unsigned long long field_18;
} st_c49140_1;

typedef struct st_c49140_3 {
    char padding_0[8];
    unsigned long long field_8;
    void* field_10;
    unsigned long long field_18;
    void* field_20;
} st_c49140_3;

typedef struct st_c49140_0 {
    char padding_0[464];
    char field_1d0;
    char padding_1d1[7];
    unsigned long long field_1d8;
    void* field_1e0;
    unsigned long long field_1e8;
    void* field_1f0;
} st_c49140_0;

typedef struct st_c49140_2 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    unsigned long long field_50;
} st_c49140_2;

extern long long g_efd140;
extern long long g_efd3d0;

double sub_c49140(st_c49140_2 *a0, st_c49140_0 *a1, unsigned long a2)
{
    unsigned long long v50;  // x9
    void* v51;  // x8
    unsigned long long v60;  // x11
    st_c49140_1 *v61;  // x10
    unsigned long long v62;  // x11
    unsigned long long v63;  // x11
    st_c49140_1 *v64;  // x27
    void* v65;  // x0
    void* v66;  // x8
    void* v67;  // x28
    void* v68;  // x21
    unsigned long long v69;  // 4102
    void* v52;  // x10
    void* v70;  // x24
    void* v71;  // x26
    unsigned int v72;  // w8
    void* v73;  // x8
    unsigned long v74;  // x9
    void* v75;  // x10
    long long v76;  // x3
    long long v77;  // x0
    void* v53;  // x11
    void* v54;  // x11
    unsigned long long v55;  // x12
    void* v56;  // x13
    unsigned long long v57;  // 4106
    void* v58;  // x0
    unsigned long v59;  // x24
    void* v0;  // [bp-0x380]
    uint128_t v1;  // [bp-0x370]
    uint128_t v2;  // [bp-0x360]
    uint128_t v3;  // [bp-0x350]
    uint128_t v4;  // [bp-0x340]
    uint128_t v5;  // [bp-0x330]
    uint128_t v6;  // [bp-0x320]
    uint128_t v7;  // [bp-0x310]
    uint128_t v8;  // [bp-0x300]
    uint128_t v9;  // [bp-0x2f0]
    uint128_t v10;  // [bp-0x2e0]
    uint128_t v11;  // [bp-0x2d0]
    uint128_t v12;  // [bp-0x2c0]
    uint128_t v13;  // [bp-0x2b0]
    uint128_t v14;  // [bp-0x2a0]
    uint128_t v15;  // [bp-0x290]
    uint128_t v16;  // [bp-0x280]
    uint128_t v17;  // [bp-0x270]
    uint768_t v18;  // [bp-0x260]
    uint128_t v19;  // [bp-0x1f8], Other Possible Types: void*, char
    uint128_t v20;  // [bp-0x1e8]
    uint128_t v21;  // [bp-0x1d8]
    uint128_t v22;  // [bp-0x1c8]
    uint128_t v23;  // [bp-0x1b8]
    uint128_t v24;  // [bp-0x1a8]
    uint128_t v25;  // [bp-0x198]
    uint128_t v26;  // [bp-0x188]
    uint128_t v27;  // [bp-0x178]
    uint128_t v28;  // [bp-0x168]
    uint128_t v29;  // [bp-0x158]
    uint128_t v30;  // [bp-0x148]
    void* v31;  // [bp-0x138], Other Possible Types: unsigned long
    void* v32;  // [bp-0x130]
    st_c49140_3 *v33;  // [bp-0x128]
    st_c49140_4 *v34;  // [bp-0x120]
    unsigned long v35;  // [bp-0x118]
    unsigned long v36;  // [bp-0x110]
    st_c49140_1 *v37;  // [bp-0x108]
    unsigned long long v38;  // [bp-0x100]
    unsigned long v39;  // [bp-0xf8]
    unsigned long v40;  // [bp-0xf0]
    void* v41;  // [bp-0xe8]
    uint128_t v42;  // [bp-0xd0]
    uint128_t v43;  // [bp-0xc0]
    uint128_t v44;  // [bp-0xb0]
    uint128_t v45;  // [bp-0xa0]
    uint128_t v46;  // [bp-0x90]
    unsigned long v47;  // [bp-0x80]
    char *v48;  // [bp-0x10]
    char v49;  // [bp+0x0]

    v48 = &v49;
    v50 = a1->field_1d8;
    v51 = a1->field_1e0;
    v52 = v51;
    v53 = v51;
    if (v52)
    {
        if (v51 == 1)
        {
            v52 = 0;
        }
        else
        {
            v52 = 0;
            v54 = v51;
            do
            {
                v55 = v54 >> 1;
                v56 = v55 + v52;
                if (a2 >= (unsigned long long)*(long long *)(v50 + v56 * 32 + 8))
                    v52 = v56;
            } while ((v54 -= v55, 1 < v54));
        }
        if (*(long long *)(v50 + v52 * 32 + 8) == a2)
        {
            v53 = 1;
        }
        else
        {
            v53 = 0;
            v57 = arm64g_calculate_condition(36, *(long long *)(v50 + v52 * 32 + 8), a2, 0);
            if (!(v57 & 1))
                v52 += 1;
        }
    }
    v58 = v53 + v52;
    if (v51 < v58)
    {
        v76 = &g_efd3d0;
        v65 = sub_c73bb0(v58, v51, v51, &g_efd3d0);
        v66 = v51;
LABEL_c494ac:
        v77 = sub_c73c94(v65, v66, &g_efd140, v76);
        if (*(char *)((void*)&v11 + 8) == 2 && 2 >= v0 && *(unsigned long long *)((void*)&v4 + 8))
            _free(*(unsigned long long *)((void*)&v3 + 8));
        __Unwind_Resume(v77);
    }
    if (v58 != v51)
    {
        v59 = a2 + 1;
        v60 = v58 * 32;
        v61 = v50 + v60;
        v62 = v51 * 32 - v60;
        while (1)
        {
            v63 = v62;
            v64 = v61 + 1;
            if (v59 <= v61->field_18)
                break;
            if (v61->field_8 <= a2 || v59 <= v61->field_0)
            {
                v62 = v63 - 32;
                v61 = v64;
                if (v63 == 32)
                    goto LABEL_c491e4;
            }
            else
            {
                v65 = v61->field_10;
                v66 = a1->field_1f0;
                if (a1->field_1f0 > v65)
                {
                    v67 = (void*)0;
                    v19 = (void*)_INSERT(CONCAT(v19, 0), 0, a1->field_1e8 + 560 * v65);
                    v0 = (void*)_INSERT(CONCAT(v0, 0), 0, v61);
                    v68 = v19;
                    if (v68)
                        goto LABEL_c492d8;
                    goto LABEL_c491e4;
                }
                goto LABEL_c494ac;
            }
        }
        v67 = (void*)1;
        v19 = (void*)_INSERT(CONCAT(v19, 0), 0, 0);
        v68 = v19;
        if (v68)
        {
LABEL_c492d8:
            sub_c4bed0(&v19, v68);
            v31 = a2;
            v32 = v68;
            v33 = &a1->field_1d0;
            v34 = &a1->field_1d8;
            v35 = a2;
            v36 = v59;
            v37 = v64;
            v38 = v50 + v51 * 32;
            v39 = a2;
            v40 = v59;
            v41 = v67;
            sub_c4c298(&v0, &v19, &v31);
            if (*(char *)((void*)&v11 + 8) != 2)
            {
                do
                {
                    v12 = (uint128_t)v0;
                    v13 = v1;
                    *(uint128_t *)((char *)&v18 + 48) = v9;
                    *(uint128_t *)((char *)&v18 + 64) = v10;
                    *(uint128_t *)((char *)&v18 + 80) = v11;
                    v17 = v5;
                    *(uint128_t *)&v18 = v6;
                    *(uint128_t *)((char *)&v18 + 16) = v7;
                    *(uint128_t *)((char *)&v18 + 32) = v8;
                    v16 = v4;
                    v14 = v2;
                    v15 = v3;
                    do
                    {
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                    } while (/* unsupported instruction */ ^ 1);
                    v69 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                    if (!(v69 & 1))
                    {
                        /* unsupported instruction */;
                        sub_c4c6d8(&v12);
                    }
                    v70 = (unsigned long long)v15;
                    v71 = (unsigned long long)v16;
                    v72 = (char)v71[536];
                    if (v72 != 83)
                    {
                        if (v72 != 82)
                            goto LABEL_c493f8;
                        goto LABEL_c493b8;
                    }
                    else
                    {
                        sub_c78464(v71 + 536);
                        if ((char)v71[536] == 82)
                        {
LABEL_c493b8:
                            v73 = (long long)v71[544];
                            if (v73)
                            {
                                v74 = (long long)v73[448] + 16;
                                v75 = (void*)2;
                                v70 = v73;
                            }
                            else
                            {
                                v75 = (void*)0;
                                v74 = *(long long *)*(unsigned long long *)((void*)&v15 + 8) + 16;
                            }
                        }
                        else
                        {
LABEL_c493f8:
                            v74 = (long long)v71[536];
                            v70 = (long long)v71[544];
                            v75 = (void*)3;
                        }
                    }
                    *(void* *)&v19 = v75;
                    (&v19)[1] = v74;
                    *(void* *)&v20 = v70;
                    sub_c4c7a4(&v32, &v17, &v19);
                    v31 = 0;
                    v44 = *(uint128_t *)((void*)&v18 + 40);
                    v45 = *(uint128_t *)((void*)&v18 + 56);
                    v46 = *(uint128_t *)((void*)&v18 + 72);
                    v47 = *(unsigned long long *)((void*)&v18 + 88);
                    v42 = *(uint128_t *)((void*)&v18 + 8);
                    v43 = *(uint128_t *)((void*)&v18 + 24);
                    sub_c4c298(&v19, &v31, &v42);
                    v8 = v27;
                    v9 = v28;
                    v10 = v29;
                    v11 = v30;
                    v4 = v23;
                    v5 = v24;
                    v6 = v25;
                    v7 = v26;
                    v0 = v19;
                    v1 = v20;
                    v2 = v21;
                    v3 = v22;
                } while (*(char *)((void*)&v11 + 8) != 2);
            }
            goto LABEL_c491ec;
        }
    }
LABEL_c491e4:
    *(unsigned int *)&v0 = 3;
LABEL_c491ec:
    a0->field_20 = v2;
    a0->field_30 = v3;
    a0->field_40 = v4;
    a0->field_50 = *(unsigned long long *)&v5;
    a0->field_0 = (uint128_t)v0;
    a0->field_10 = v1;
    return (unsigned long long)v0;
}
