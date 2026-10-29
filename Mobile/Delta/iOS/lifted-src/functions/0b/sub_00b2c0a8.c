/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2c0a8..0xb2c3e0 (824 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b2c0a8(unsigned int a0, unsigned int a1, unsigned int a2, unsigned int a3)
{
    unsigned int v16;  // w19
    unsigned int v17;  // w26
    unsigned long long v26;  // 4112
    unsigned long long v27;  // 4112
    unsigned long long v28;  // 4102
    unsigned long long v29;  // 4112
    unsigned long long v30;  // 4102
    __m128i v31;  // q0
    unsigned int v33;  // w8
    unsigned int v34;  // w25
    unsigned long v35;  // x8
    unsigned long long v18;  // x0
    unsigned long v36;  // x27
    unsigned int v37;  // w8
    unsigned int v38;  // w8
    unsigned int v39;  // w9
    unsigned long v40;  // x22
    unsigned int v41;  // w24
    unsigned int v42;  // w24
    unsigned long v43;  // x20
    unsigned long v44;  // x28
    unsigned long long *v45;  // x8
    unsigned long v19;  // x20
    unsigned int v46;  // w8
    unsigned long long v47;  // x8
    unsigned long v48;  // x10
    unsigned long v49;  // x8
    unsigned long long v50;  // x0
    unsigned long v20;  // cc_dep1
    unsigned long v21;  // 4112
    unsigned long v22;  // cc_op
    unsigned long v23;  // cc_dep1
    unsigned long long v24;  // 4112
    unsigned long v25;  // 4112
    unsigned int v0;  // [bp-0xc8c]
    unsigned int v1;  // [bp-0xc88]
    unsigned long v2;  // [bp-0xc80]
    unsigned int v3;  // [bp-0xc74]
    unsigned int v4;  // [bp-0xc70]
    unsigned int v5;  // [bp-0xc6c]
    char v6;  // [bp-0xc68]
    char v7;  // [bp-0x868], Other Possible Types: unsigned long
    unsigned long v8;  // [bp-0x860]
    unsigned long v9;  // [bp-0x858]
    uint128_t v10;  // [bp-0x850]
    unsigned long v11;  // [bp-0x840]
    char v12;  // [bp-0x838], Other Possible Types: unsigned int, unsigned long long
    unsigned long long v13;  // [bp-0x468]
    char *v14;  // [bp-0x10]
    char v15;  // [bp+0x0]

    v14 = &v15;
    v16 = a3;
    v17 = a1;
    v18 = _bzero(&v7, 0x400);
    if (!a0)
        return v18;
    v19 = *(int *)(a0 + 100);
    v20 = v19 & 0xffffffff;
    if ((unsigned int)v19 != 1)
    {
        if ((unsigned int)v19 == 2)
        {
            v21 = arm64g_calculate_condition(3, v20, 1, 0);
            v22 = 3;
            v23 = (v21 & 1 ? v17 : 0);
            v24 = arm64g_calculate_condition(3, v23, 0, 0);
            if (!(v24 & 1))
                goto LABEL_b2c0fe;
LABEL_b2c0fd:
            v27 = arm64g_calculate_condition(v22, v23, 0, 0);
            v28 = arm64g_calculate_condition(131, (v27 & 1 ? v16 : 0x20000000), v27 & 1, 0);
            if (v28 & 1)
                goto LABEL_b2c150;
        }
        else
        {
            v25 = arm64g_calculate_condition(3, v20, 1, 0);
            v22 = 0;
            v23 = (v25 & 1 ? v17 : 0);
            v26 = arm64g_calculate_condition(0, v23, 0, 0);
            if (v26 & 1)
                goto LABEL_b2c0fd;
LABEL_b2c0fe:
            v29 = arm64g_calculate_condition(v22, v23, 0, 0);
            v30 = arm64g_calculate_condition(128, (v29 & 1 ? v16 : 0x20000000), v29 & 1, 0);
            if (v30 & 1)
                goto LABEL_b2c150;
        }
    }
    _bzero(&v6, 0x400);
    v18 = _bzero(&v12, 976);
    v7 = v17;
    v8 = a2;
    v9 = v16;
    v31 = *(unsigned long long *)&*(double *)(a0 + 112);
    v10 = __dirty_unsupported_Iop_SliceV128(_mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v31), 32), _mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), v31), 32), 8);
    v11 = v19;
LABEL_b2c150:
    v33 = v17 | v16;
    v5 = !v33;
    if (!v33)
    {
        if (1 >= (unsigned int)v19 - 1)
        {
            v1 = 1;
            v12 = 1;
            sub_b2c3e0(&v6, &v7, &v13, 0);
            v18 = sub_b2c3e0(&v6, &v13, &v13, 0);
        }
        else
        {
            v1 = 0;
        }
        v34 = 2;
    }
    else
    {
        v1 = 0;
        v34 = 0;
    }
    if ((unsigned int)*(int *)(a0 + 120) <= v34)
        return v18;
    v35 = *(int *)(a0 + 124);
    v36 = v34 + a2 * (unsigned int)v35 + v16 * *(int *)(a0 + 120);
    if (!((unsigned int)v36 - (unsigned int)v35 * (unsigned int)(v36 / v35)))
        v37 = (unsigned int)v35 - 1;
    else
        v37 = 0xffffffff;
    v38 = v37 + (unsigned int)v36;
    if (2 <= v16)
        v39 = 0;
    else
        v39 = !v17;
    v0 = v39;
    v40 = a2;
    v3 = v16 + 1;
    v4 = v17 != 0;
    v41 = v34 - 1;
    v2 = v40;
    do
    {
        v42 = v41;
        v43 = *(int *)(a0 + 124);
        if ((unsigned int)v36 - (unsigned int)v43 * (unsigned int)(v36 / v43) == 1)
            v44 = (unsigned int)v36 - 1;
        else
            v44 = v38;
        if (*(int *)(a0 + 100) == 1 || *(int *)(a0 + 100) == 2 && v0)
        {
            v46 = v42 + 1;
            if (!(v46 & 127))
            {
                v1 += 1;
                v12 = v1;
                sub_b2c3e0(&v6, &v7, &v13, 0);
                sub_b2c3e0(&v6, &v13, &v13, 0);
            }
            v45 = &(&v13)[v46 & 127];
            v40 = v2;
        }
        else
        {
            v45 = *(long long *)(a0 + 104) + v44 * 0x400;
        }
        v47 = *v45 >> 32;
        v48 = *(int *)(a0 + 84);
        v49 = (unsigned int)v47 - (unsigned int)v48 * (unsigned int)(v47 / v48);
        if (v5)
            v49 = v40;
        v50 = sub_b2c3e0();
        v36 = (unsigned int)v36 + 1;
        v38 = (unsigned int)v44 + 1;
        v41 = v42 + 1;
    } while ((unsigned int)*(int *)(a0 + 120) > v42 + 2);
    return v50;
}
