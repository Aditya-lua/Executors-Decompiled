/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa963b0..0xa96510 (352 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_a963b0(uint128_t *a0, uint128_t *a1, uint128_t *a2, unsigned long long a3)
{
    unsigned long long v0;  // x3
    unsigned long long v1;  // x12
    unsigned long long v10;  // 4125
    uint128_t *v11;  // x2
    uint128_t v12;  // q17
    uint128_t v13;  // q7
    uint128_t v14;  // q3
    uint128_t v15;  // 4108
    unsigned long long v16;  // d17
    uint128_t v17;  // 4113
    uint128_t v18;  // q18
    unsigned long long v19;  // x3
    uint128_t v2;  // q21
    unsigned long v20;  // cc_dep1
    uint128_t v21;  // 4103
    uint128_t v22;  // 4096
    uint128_t v23;  // 4101
    uint128_t v24;  // q0
    uint128_t v25;  // 4106
    uint128_t *v26;  // x2
    uint128_t v27;  // q2
    unsigned long long v28;  // 4139
    uint128_t v29;  // q17
    uint128_t v3;  // q20
    uint128_t v31;  // q1
    uint128_t v32;  // 4120
    uint128_t v33;  // q17
    uint128_t v34;  // q2
    uint128_t v36;  // q7
    uint128_t v38;  // q0
    uint128_t v39;  // q18
    uint128_t *v4;  // x1
    uint128_t v40;  // 4140
    uint128_t v41;  // q0
    unsigned long long v42;  // 4190
    unsigned long long v43;  // 4118
    uint128_t v45;  // q3
    uint128_t v46;  // 4107
    uint128_t v47;  // q0
    uint128_t v48;  // 4112
    uint128_t v49;  // q2
    uint128_t v5;  // q0
    uint128_t v50;  // 4113
    uint128_t v52;  // q1
    uint128_t v53;  // 4129
    uint128_t v56;  // q0
    uint128_t v58;  // 4137
    uint128_t v59;  // q0
    uint128_t *v6;  // x2
    uint128_t v60;  // q0
    uint128_t v7;  // q16
    uint128_t v8;  // q0
    uint128_t v9;  // q3

    if (64 <= a3)
        goto LABEL_0xa96510;
    v0 = a3 - 32;
    v1 = 16;
    v2 = a1[1];
    v3 = *a1;
    v4 = a1 + 2;
    if (a3 == 32)
        v1 = 0;
    v5 = __dirty_unsupported_Iop_SliceV128(*a0, *a0, 8);
    v6 = a2 + 1;
    v7 = __dirty_unsupported_Iop_Reverse8sIn64_x2(*a2);
    v8 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v5);
    v9 = __dirty_unsupported_Iop_SliceV128(v7, v7, 8);
    v10 = arm64g_calculate_condition(52, a3, 32, 0);
    if (!(v10 & 1))
    {
        v11 = (char *)v6 + v1;
        v12 = __dirty_unsupported_Iop_Reverse8sIn64_x2(*v6);
        v13 = __dirty_unsupported_Iop_SliceV128(v12, v12, 8);
        v14 = v8 ^ v9;
        v15 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v3, (unsigned long long)v13);
        v16 = (unsigned long long)v13 ^ (unsigned long long)v12;
        v17 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v3 >> 64), (unsigned long long)(v13 >> 64));
        do
        {
            v18 = __dirty_unsupported_Iop_SliceV128(v14, v14, 8);
            v19 = v0 - 32;
            v20 = v0;
            v21 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)*v4, (unsigned long long)v14);
            if (v0 < 32)
                v1 = 0;
            v22 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v2, v16);
            v23 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(*v4 >> 64), (unsigned long long)(v14 >> 64));
            v24 = v15 ^ v21;
            v25 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v2 >> 64), (unsigned long long)((v14 ^ v18) >> 64));
            v26 = (char *)v11 + v1;
            v27 = v17 ^ v23;
            v28 = arm64g_calculate_condition(4, v20, 32, 0);
            if (v28 & 1)
                v1 = 0;
            v29 = __dirty_unsupported_Iop_SliceV128(v27, v24, 8);
            v7 = __dirty_unsupported_Iop_Reverse8sIn64_x2(*v11);
            v31 = v27 ^ v24 ^ v29 ^ v22 ^ v25;
            v32 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v24, 0xc200000000000000);
            v33 = __dirty_unsupported_Iop_Reverse8sIn64_x2(*v26);
            v34 = _INSERT(v27, 0, *(double *)&*(unsigned long long *)((void*)&v31 + 8));
            v36 = __dirty_unsupported_Iop_SliceV128(v33, v33, 8);
            v38 = v32 ^ _INSERT(v31, 8, (unsigned long long)v24);
            v15 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v3, (unsigned long long)v36);
            v39 = __dirty_unsupported_Iop_SliceV128(v38, v38, 8);
            v40 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v38, 0xc200000000000000);
            v41 = v40;
            v16 = (unsigned long long)v36 ^ (unsigned long long)v33;
            v14 = v41 ^ v39 ^ v34 ^ __dirty_unsupported_Iop_SliceV128(v7, v7, 8);
            v17 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v3 >> 64), (unsigned long long)(v36 >> 64));
            v42 = arm64g_calculate_condition(36, v20, 32, 0);
            v0 = v19;
            v11 = (char *)v26 + v1;
        } while (v42 & 1);
        v9 = __dirty_unsupported_Iop_SliceV128(v7, v7, 8);
        v8 = v39 ^ v34 ^ v41;
        v43 = arm64g_calculate_condition(2, v19, 32, 0);
        if (v43 & 1)
        {
            v59 = __dirty_unsupported_Iop_Reverse8sIn64_x2(v8);
            v60 = __dirty_unsupported_Iop_SliceV128(v59, v59, 8);
            *a0 = v60;
            return *(unsigned long long *)&v60;
        }
    }
    v45 = v8 ^ v9;
    v46 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v3, (unsigned long long)v45);
    v47 = v46;
    v48 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(v3 >> 64), (unsigned long long)(v45 >> 64));
    v49 = v48;
    v50 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v2, (unsigned long long)v45 ^ (unsigned long long)__dirty_unsupported_Iop_SliceV128(v8, v8, 8) ^ (unsigned long long)v7);
    v52 = v49 ^ v47 ^ __dirty_unsupported_Iop_SliceV128(v49, v47, 8) ^ v50;
    v53 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v47, 0xc200000000000000);
    v56 = v53 ^ _INSERT(v52, 8, (unsigned long long)v47);
    v58 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v56, 0xc200000000000000);
    v59 = __dirty_unsupported_Iop_Reverse8sIn64_x2(_INSERT(v49, 0, *(double *)&*(unsigned long long *)((void*)&v52 + 8)) ^ __dirty_unsupported_Iop_SliceV128(v56, v56, 8) ^ v58);
    v60 = __dirty_unsupported_Iop_SliceV128(v59, v59, 8);
    *a0 = v60;
    return *(unsigned long long *)&v60;
}
