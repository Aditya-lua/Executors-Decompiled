/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd8578..0xbd8948 (976 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bd8578_1 {
    char padding_0[24];
    unsigned int field_18;
} st_bd8578_1;

typedef struct st_bd8578_3 {
    char padding_0[28];
    unsigned int field_1c;
} st_bd8578_3;

typedef struct st_bd8578_2 {
    char padding_0[32];
    unsigned int field_20;
} st_bd8578_2;

typedef struct st_bd8578_4 {
    char padding_0[36];
    unsigned int field_24;
} st_bd8578_4;

typedef struct st_bd8578_0 {
    char padding_0[32];
    unsigned long long field_20;
    unsigned long long field_28;
    char padding_30[8];
    unsigned long long field_38;
    unsigned long long field_40;
    unsigned long long field_48;
    unsigned long long field_50;
    unsigned int field_58;
    unsigned int field_5c;
} st_bd8578_0;


double sub_bd8578(void* a0, st_bd8578_0 *a1, unsigned int a2)
{
    unsigned long v6;  // x11
    unsigned long v7;  // x8
    unsigned long v16;  // x8
    unsigned long long v17;  // x19
    void* v18;  // x9
    unsigned long v19;  // x11
    unsigned long v20;  // x13
    unsigned long v21;  // x15
    unsigned int v22;  // w10
    st_bd8578_1 *v23;  // x14
    unsigned long v24;  // x13
    st_bd8578_2 *v25;  // x14
    st_bd8578_0 *v8;  // x20
    unsigned long v26;  // x11
    st_bd8578_3 *v27;  // x12
    unsigned long v28;  // x11
    st_bd8578_4 *v29;  // x12
    unsigned long long v30;  // x24
    unsigned long v31;  // x23
    unsigned long long v32;  // 4122
    unsigned long v33;  // x27
    unsigned long v34;  // x19
    unsigned long long v35;  // 4122
    void* v9;  // x25
    unsigned long long v36;  // x28
    unsigned long j;  // x26
    unsigned int v38;  // w8
    unsigned long long v39;  // x15
    void* v40;  // x9
    unsigned long long v41;  // 4118
    unsigned long v42;  // x11
    unsigned long v43;  // x13
    unsigned int v44;  // w10
    st_bd8578_1 *v45;  // x14
    unsigned long v10;  // x8
    unsigned long v46;  // x13
    st_bd8578_2 *v47;  // x14
    unsigned long v48;  // x11
    st_bd8578_3 *v49;  // x12
    unsigned long v50;  // x11
    st_bd8578_4 *v51;  // x12
    st_bd8578_0 *v52;  // x8
    unsigned long long v53;  // x24
    unsigned long v54;  // x23
    unsigned long long v55;  // 4131
    uint128_t v11;  // q0
    unsigned long v56;  // x0
    unsigned long long v57;  // 4139
    unsigned long v12;  // x27
    unsigned long long v13;  // 4143
    unsigned long long v14;  // x28
    unsigned long i;  // x26
    unsigned long v0;  // [bp-0x98]
    unsigned long v1;  // [bp-0x90]
    uint192_t v2;  // [bp-0x88]
    uint128_t v3;  // [bp-0x70]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = a1->field_28;
    v7 = a2;
    if (v6 > v7)
    {
        v8 = a1;
        v1 = a1->field_20;
        v9 = a1->field_20 + v7 * 32;
        *(unsigned long *)a0 = 0x8000000000000000;
        v10 = *(long long *)v9;
        v3 = (int128_t)v9[8];
        v11 = *(int128_t *)a0;
        *(uint128_t *)v9 = v11;
        *(long long *)&v9[16] = (long long)a0[16];
        if (v10 != 0x8000000000000000)
        {
            v0 = v6;
            v2 = CONCAT(v3, v10);
            v12 = (int)v9[24];
            v13 = arm64g_calculate_condition(0x11, v12 & 0xffffffff, 1, 0);
            if (v13 & 1)
            {
                v14 = v8->field_38;
                i = v8->field_40;
                v16 = v8->field_5c;
                v17 = v8->field_50;
                do
                {
                    if (i <= v12 || (v18 = v14 + 48 * v12, *(long long *)v18 == 0x8000000000000000))
                    {
                        v12 = v16;
                    }
                    else
                    {
                        v19 = (long long)v18[40];
                        v20 = v19 & 0xffffffff;
                        v21 = v0;
                        if (v21 > v20)
                        {
                            v22 = (int)v18[36];
                            v23 = v1 + v20 * 32;
                            if (v23->field_18 == v12)
                            {
                                v23->field_18 = (int)v18[32];
                            }
                            else
                            {
                                while (i > v24)
                                {
                                    v25 = v14 + 48 * v24;
                                    if (v25->field_20 == v12)
                                    {
                                        v25->field_20 = (int)v18[32];
                                        break;
                                    }
                                }
                            }
                            v26 = v19 >> 32;
                            if (v21 > v26)
                            {
                                v27 = v1 + v26 * 32;
                                if (v27->field_1c == v12)
                                {
                                    v27->field_1c = v22;
                                }
                                else
                                {
                                    while (i > v28)
                                    {
                                        v29 = v14 + 48 * v28;
                                        if (v29->field_24 == v12)
                                        {
                                            v29->field_24 = v22;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        *(unsigned int *)&v18[32] = v16;
                        *(unsigned long long *)&v18[36] = 0xffffffffffffffff;
                        *(unsigned int *)&v18[44] = 0xffffffff;
                        v8->field_5c = v12;
                        v17 -= 1;
                        v8->field_50 = v17;
                        v30 = *(long long *)v18;
                        v31 = (long long)v18[8];
                        *(unsigned long long *)v18 = 0x8000000000000000;
                        if (v30 != 0x8000000000000000)
                        {
                            sub_b9f1a4(v31);
                            if (v30)
                                _free(v31);
                        }
                    }
                } while ((v16 = v12, v12 = (int)v9[24], v32 = arm64g_calculate_condition(1, v12 & 0xffffffff, 1, 0), !(v32 & 1)));
            }
            v33 = (int)v9[28];
            v34 = v0;
            v35 = arm64g_calculate_condition(0x11, v33 & 0xffffffff, 1, 0);
            if (v35 & 1)
            {
                v36 = v8->field_38;
                j = v8->field_40;
                v38 = v8->field_5c;
                v39 = v8->field_50;
                while (1)
                {
                    if (j <= v33 || !(v40 = v36 + 48 * v33, *(long long *)v40 != 0x8000000000000000))
                    {
                        v33 = (int)v9[28];
                        v41 = arm64g_calculate_condition(1, v33 & 0xffffffff, 1, 0);
                        if (v41 & 1)
                            break;
                    }
                    else
                    {
                        v42 = (long long)v40[40];
                        v43 = v42 & 0xffffffff;
                        if (v34 > v43)
                        {
                            v44 = (int)v40[36];
                            v45 = v1 + v43 * 32;
                            if (v45->field_18 == v33)
                            {
                                v45->field_18 = (int)v40[32];
                            }
                            else
                            {
                                while (j > v46)
                                {
                                    v47 = v36 + 48 * v46;
                                    if (v47->field_20 == v33)
                                    {
                                        v47->field_20 = (int)v40[32];
                                        break;
                                    }
                                }
                            }
                            v48 = v42 >> 32;
                            if (v34 > v48)
                            {
                                v49 = v1 + v48 * 32;
                                if (v49->field_1c == v33)
                                {
                                    v49->field_1c = v44;
                                }
                                else
                                {
                                    while (j > v50)
                                    {
                                        v51 = v36 + 48 * v50;
                                        if (v51->field_24 == v33)
                                        {
                                            v51->field_24 = v44;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        *(unsigned int *)&v40[32] = v38;
                        *(unsigned long *)&v40[36] = 0xffffffffffffffff;
                        *(unsigned int *)&v40[44] = 0xffffffff;
                        v8->field_5c = v33;
                        v39 -= 1;
                        v52 = v8;
                        v52->field_50 = v39;
                        v53 = *(long long *)v40;
                        v54 = (long long)v40[8];
                        *(unsigned long long *)v40 = 0x8000000000000000;
                        if (v53 != 0x8000000000000000)
                        {
                            sub_b9f1a4(v54);
                            if (v53)
                                _free(v54);
                        }
                        v8 = v52;
                        v38 = v33;
                        v33 = (int)v9[28];
                        v55 = arm64g_calculate_condition(0x11, v33 & 0xffffffff, 1, 0);
                        if (!(v55 & 1))
                            break;
                    }
                }
            }
            v56 = v8->field_58;
            *(unsigned int *)&v9[24] = v56;
            *(unsigned int *)&v9[28] = 0xffffffff;
            v57 = arm64g_calculate_condition(1, v56 & 0xffffffff, 1, 0);
            if (!(v57 & 1))
            {
                if (v34 > v56)
                {
                    *(unsigned int *)(v1 + v56 * 32 + 28) = a2;
                }
                else
                {
                    sub_c73c94();
                    __debugbreak();
                }
            }
            v8->field_58 = a2;
            v8->field_48 = v8->field_48 - 1;
            v11 = *(uint128_t *)&v2;
            *(uint128_t *)a0 = v11;
            *(unsigned long long *)&a0[16] = *(unsigned long long *)((void*)&v2 + 16);
        }
    }
    else
    {
        *(unsigned long *)a0 = 0x8000000000000000;
    }
    return *(unsigned long long *)&v11;
}
