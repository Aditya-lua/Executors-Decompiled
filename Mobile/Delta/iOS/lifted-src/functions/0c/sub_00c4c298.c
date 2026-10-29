/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc4c298..0xc4c6d8 (1088 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c4c298_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
} st_c4c298_0;

typedef struct st_c4c298_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    void* field_10;
    void* field_18;
} st_c4c298_1;

typedef struct st_c4c298_2 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
} st_c4c298_2;

extern long long g_efd140;
extern long long g_efd2c8;
extern long long g_efd2e0;

double sub_c4c298(void* a0, void* a1, void* a2)
{
    void* v26;  // x25
    unsigned long long v27;  // x22
    unsigned long long v35;  // x16
    unsigned long long v36;  // x14
    unsigned long v37;  // x28
    unsigned long long v38;  // x15
    unsigned long long v39;  // x10
    st_c4c298_0 *v40;  // x9
    uint128_t v41;  // q1
    unsigned long long idx;  // x23
    unsigned long long v28;  // x21
    unsigned long long *v44;  // x8
    unsigned long long v45;  // x26
    unsigned long long v46;  // x15
    unsigned long long v47;  // x27
    unsigned long long v48;  // x10
    unsigned long long v49;  // x9
    unsigned long long v50;  // x11
    unsigned long long v51;  // x25
    unsigned long long *v52;  // x12
    unsigned long long v53;  // 4102
    unsigned long long *v29;  // x11
    st_c4c298_2 *v54;  // x9
    unsigned long long v55;  // x22
    unsigned long long v56;  // x24
    unsigned long long v57;  // x9
    unsigned long long v58;  // x12
    unsigned long long v59;  // x13
    unsigned long long v60;  // x17
    st_c4c298_1 *v30;  // x8
    unsigned long v31;  // x27
    unsigned long v32;  // x26
    unsigned long v33;  // x24
    void* v34;  // x0
    long long v0;  // [bp-0x168]
    unsigned long long v1;  // [bp-0x160]
    st_c4c298_0 *v2;  // [bp-0x158]
    unsigned long long v3;  // [bp-0x150]
    unsigned int v4;  // [bp-0x144]
    unsigned long long v5;  // [bp-0x140]
    st_c4c298_1 *v6;  // [bp-0x138], Other Possible Types: unsigned long long
    unsigned long long *v7;  // [bp-0x130]
    unsigned long v8;  // [bp-0x128]
    uint128_t v9;  // [bp-0x120]
    uint128_t v10;  // [bp-0x118]
    uint128_t v11;  // [bp-0x110]
    uint128_t v12;  // [bp-0x108]
    uint128_t v13;  // [bp-0x100]
    uint128_t v14;  // [bp-0xf8]
    uint768_t v15;  // [bp-0xf0]
    uint128_t v16;  // [bp-0xe8]
    uint128_t v17;  // [bp-0xd8]
    uint128_t v18;  // [bp-0xc8], Other Possible Types: unsigned long long
    unsigned long v19;  // [bp-0xb8]
    unsigned long long v20;  // [bp-0x88]
    unsigned long long *v21;  // [bp-0x80]
    unsigned long long v22;  // [bp-0x78]
    char v23;  // [bp-0x70]
    char *v24;  // [bp-0x10]
    char v25;  // [bp+0x0]

    v24 = &v25;
    if (!*(long long *)a1)
    {
        v26 = (long long)a2[72];
        v27 = (long long)a2[32];
        v28 = (long long)a2[40];
        v29 = (long long)a2[16];
        v30 = (long long)a2[24];
        v7 = v29;
        v8 = *(long long *)a2;
        v5 = (long long)a2[8];
        v6 = v30;
        v31 = (long long)a2[48];
        v32 = (long long)a2[56];
        v33 = (char)a2[80];
        v34 = a0;
        do
        {
            v37 = (int)a1[16];
            v38 = (long long)a1[24];
            v39 = (long long)a1[32];
            if ((unsigned int)v37 == 3)
            {
                *(unsigned int *)&v10 = 5;
                *(unsigned int *)((char *)&v10 + 4) = v35;
                *(unsigned int *)((char *)&v10 + 8) = v38;
                *(unsigned int *)((char *)&v10 + 12) = v38 >> 32;
                v12 = CONCAT(v60, v39);
                v14 = CONCAT(v39, v36);
                v16 = CONCAT(v29, v34);
                v17 = CONCAT(v58, v29);
                v18 = v59;
                *(uint128_t *)&a0[32] = v14;
                *(uint128_t *)&a0[48] = v16;
                *(uint128_t *)&a0[64] = v17;
                *(unsigned long long *)&a0[80] = v18;
                *(uint128_t *)a0 = v10;
                *(uint128_t *)&a0[16] = v12;
                *(char *)&a0[184] = 2;
                return *(unsigned long long *)&v10;
            }
            v40 = (long long)a1[8];
            v35 = (int)a1[20];
            v36 = (long long)a1[40];
            if (v40)
            {
                v1 = v39;
                v2 = v40;
                v3 = v36;
                v4 = v35;
                v6 = v38;
                idx = 0;
                v44 = 8;
                v20 = 0;
                v21 = 8;
                v22 = 0;
                v0 = &g_efd2c8;
                v45 = v40->field_10;
                v46 = v40[1].field_0;
                v47 = v40->field_8;
                while (1)
                {
                    if (v46 != 1)
                    {
                        if (!v46)
                            break;
                        v48 = 0;
                        v49 = v46;
                        do
                        {
                            v50 = v49 >> 1;
                            v51 = v50 + v48;
                            v52 = v45 + v51 * 32;
                            if (idx < v52[2])
                            {
                                v51 = v48;
                            }
                            else
                            {
                                v53 = arm64g_calculate_condition(52, v52[2], idx, 0);
                                if (!(v53 & 1))
                                {
                                    if (v8 < *v52)
                                        v51 = v48;
                                }
                            }
                        } while ((v49 -= v50, v48 = v51, v49 > 1));
                    }
                    else
                    {
                        v51 = 0;
                    }
                    v54 = v45 + v51 * 32;
                    if (v54->padding_10 != idx || v8 < v54->field_0 || v54->field_8 <= v8)
                        break;
                    v55 = v46;
                    if (v46 <= v51)
                    {
                        sub_c73c94(v51, v55, v0);
                        __debugbreak();
                    }
                    v56 = v54->field_18;
                    if (v47 <= v56)
                    {
                        v0 = &g_efd2e0;
                        sub_c73c94(v56, v47, v0);
                        __debugbreak();
                    }
                    if (idx == v20)
                    {
                        sub_c73880(&v20);
                        v44 = v21;
                    }
                    v44[idx] = v40->field_0 + 48 * v56;
                    idx += 1;
                    v22 = idx;
                    v57 = v51 + 1;
                    v46 = v55 - v57;
                    v45 += v57 * 32;
                }
                v29 = v21;
                v30 = v6;
                *(unsigned int *)&v10 = v37;
                *(unsigned int *)((char *)&v10 + 4) = v4;
                *(unsigned int *)((char *)&v10 + 8) = (unsigned int)v30;
                *(unsigned int *)((char *)&v10 + 12) = v30 >> 32;
                v12 = CONCAT(v3, v1);
                v14 = CONCAT(*v7 + 16, v5);
                v16 = CONCAT(v29, v2);
                v17 = CONCAT(v20, v29);
                v18 = &v29[idx];
                *(uint128_t *)&a0[32] = v14;
                *(uint128_t *)&a0[48] = v16;
                *(uint128_t *)&a0[64] = v17;
                *(unsigned long long *)&a0[80] = v18;
                *(uint128_t *)a0 = v10;
                *(uint128_t *)&a0[16] = v12;
                *(char *)&a0[184] = 2;
                return *(unsigned long long *)&v10;
            }
            if ((unsigned int)v37 != 2)
            {
                *(unsigned int *)&v10 = 4;
                *(unsigned int *)((char *)&v10 + 4) = v35;
                *(unsigned int *)((char *)&v10 + 8) = v37;
                *(unsigned int *)((char *)&v10 + 12) = v35;
                v12 = CONCAT(v39, v38);
                v14 = CONCAT(v39, v36);
                v16 = CONCAT(v29, v34);
                v17 = CONCAT(v58, v29);
                v18 = v59;
                *(uint128_t *)&a0[32] = v14;
                *(uint128_t *)&a0[48] = v16;
                *(uint128_t *)&a0[64] = v17;
                *(unsigned long long *)&a0[80] = v18;
                *(uint128_t *)a0 = v10;
                *(uint128_t *)&a0[16] = v12;
                *(char *)&a0[184] = 2;
                return *(unsigned long long *)&v10;
            }
            if (v33 & 1)
            {
                *(unsigned int *)&v10 = 3;
                *(unsigned int *)((char *)&v10 + 4) = v35;
                *(unsigned int *)((char *)&v10 + 8) = (unsigned int)v30;
                *(unsigned int *)((char *)&v10 + 12) = (unsigned int)v40;
                v12 = CONCAT(v60, v38);
                v14 = CONCAT(v39, v36);
                v16 = CONCAT(v29, v34);
                v17 = CONCAT(v58, v29);
                v18 = v59;
                *(uint128_t *)&a0[32] = v14;
                *(uint128_t *)&a0[48] = v16;
                *(uint128_t *)&a0[64] = v17;
                *(unsigned long long *)&a0[80] = v18;
                *(uint128_t *)a0 = v10;
                *(uint128_t *)&a0[16] = v12;
                *(char *)&a0[184] = 2;
                return *(unsigned long long *)&v10;
            }
            if (v31 == v32)
            {
                *(unsigned int *)&v10 = 3;
                *(unsigned int *)((char *)&v10 + 4) = v35;
                *(unsigned int *)((char *)&v10 + 8) = (unsigned int)v30;
                *(unsigned int *)((char *)&v10 + 12) = (unsigned int)v40;
                v12 = CONCAT(v60, v38);
                v14 = CONCAT(v39, v36);
                v16 = CONCAT(v29, v34);
                v17 = CONCAT(v58, v29);
                v18 = v59;
                *(uint128_t *)&a0[32] = v14;
                *(uint128_t *)&a0[48] = v16;
                *(uint128_t *)&a0[64] = v17;
                *(unsigned long long *)&a0[80] = v18;
                *(uint128_t *)a0 = v10;
                *(uint128_t *)&a0[16] = v12;
                *(char *)&a0[184] = 2;
                return *(unsigned long long *)&v10;
            }
            v30 = v31;
            while (1)
            {
                v31 = v30 + 1;
                v33 = v30->field_18 >= v26;
                if (v26 <= v30->field_18)
                    break;
                v40 = v30->field_8;
                if (v30->field_8 <= v27 || (v40 = v30->field_0, v28 <= v40))
                {
                    v30 = v31;
                    if (v31 == v32)
                    {
                        *(unsigned int *)&v10 = 3;
                        *(unsigned int *)((char *)&v10 + 4) = v35;
                        *(unsigned int *)((char *)&v10 + 8) = (unsigned int)v30;
                        *(unsigned int *)((char *)&v10 + 12) = (unsigned int)v40;
                        v12 = CONCAT(v60, v38);
                        v14 = CONCAT(v39, v36);
                        v16 = CONCAT(v29, v34);
                        v17 = CONCAT(v58, v29);
                        v18 = v59;
                        *(uint128_t *)&a0[32] = v14;
                        *(uint128_t *)&a0[48] = v16;
                        *(uint128_t *)&a0[64] = v17;
                        *(unsigned long long *)&a0[80] = v18;
                        *(uint128_t *)a0 = v10;
                        *(uint128_t *)&a0[16] = v12;
                        *(char *)&a0[184] = 2;
                        return *(unsigned long long *)&v10;
                    }
                }
                else
                {
                    *(unsigned long *)&a2[48] = v31;
                    v34 = v30->field_10;
                    if (v6->field_18 <= v34)
                    {
                        sub_c73c94(v34, v6->field_18, &g_efd140);
                        __debugbreak();
                    }
                    v39 = 560;
                    v20 = v6->field_10 + 560 * v34;
                    v40 = &v23;
                    goto LABEL_c4c41c;
                }
            }
            v30 = 0;
            *(unsigned long *)&a2[48] = v31;
            *(char *)&a2[80] = 1;
            v40 = &v20;
LABEL_c4c41c:
            v40->field_0 = v30;
            if (!v20)
            {
                *(unsigned int *)&v10 = 3;
                *(unsigned int *)((char *)&v10 + 4) = v35;
                *(unsigned int *)((char *)&v10 + 8) = (unsigned int)v30;
                *(unsigned int *)((char *)&v10 + 12) = (unsigned int)v40;
                v12 = CONCAT(v60, v38);
                v14 = CONCAT(v39, v36);
                v16 = CONCAT(v29, v34);
                v17 = CONCAT(v58, v29);
                v18 = v59;
                *(uint128_t *)&a0[32] = v14;
                *(uint128_t *)&a0[48] = v16;
                *(uint128_t *)&a0[64] = v17;
                *(unsigned long long *)&a0[80] = v18;
                *(uint128_t *)a0 = v10;
                *(uint128_t *)&a0[16] = v12;
                *(char *)&a0[184] = 2;
                return *(unsigned long long *)&v10;
            }
            v34 = sub_c4bed0(&v10);
            *(uint128_t *)&a1[64] = v17;
            *(uint128_t *)&a1[80] = v18;
            *(unsigned long *)&a1[96] = v19;
            *(uint128_t *)a1 = v10;
            *(uint128_t *)&a1[16] = v12;
            *(uint128_t *)&a1[32] = v14;
            *(uint128_t *)&a1[48] = v16;
            v30 = *(long long *)a1;
        } while (!*(long long *)a1);
    }
    v41 = (int128_t)a1[16];
    *(int128_t *)a0 = *(int128_t *)a1;
    *(uint128_t *)&a0[16] = v41;
    v9 = (int128_t)a1[48];
    v11 = (int128_t)a1[64];
    v13 = (int128_t)a1[80];
    v15 = _INSERT(CONCAT(v14, 0), 0, (long long)a1[96]);
    *(int128_t *)((char *)&v15 + 56) = (int128_t)a2[48];
    *(int128_t *)((char *)&v15 + 40) = (int128_t)a2[32];
    *(int128_t *)((char *)&v15 + 72) = (int128_t)a2[64];
    *(long long *)((char *)&v15 + 88) = (long long)a2[80];
    *(int128_t *)((char *)&v15 + 8) = *(int128_t *)a2;
    *(int128_t *)((char *)&v15 + 24) = (int128_t)a2[16];
    *(int128_t *)&a0[32] = (int128_t)a1[32];
    *(uint128_t *)&a0[48] = v9;
    *(uint128_t *)&a0[96] = *(uint128_t *)&v15;
    *(uint128_t *)&a0[112] = *(uint128_t *)((void*)&v15 + 16);
    *(uint128_t *)&a0[64] = v11;
    *(uint128_t *)&a0[80] = v13;
    *(uint128_t *)&a0[160] = *(uint128_t *)((void*)&v15 + 64);
    *(uint128_t *)&a0[176] = *(uint128_t *)((void*)&v15 + 80);
    *(uint128_t *)&a0[128] = *(uint128_t *)((void*)&v15 + 32);
    *(uint128_t *)&a0[144] = *(uint128_t *)((void*)&v15 + 48);
    return *(unsigned long long *)&*(uint128_t *)((void*)&v15 + 48);
}
