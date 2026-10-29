/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa96340..0xa963b0 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_a96340(uint128_t *a0, uint128_t *a1)
{
    uint128_t v0;  // q17
    uint128_t v1;  // q3
    uint128_t v12;  // q0
    uint128_t v14;  // 4137
    uint128_t v15;  // q0
    uint128_t v16;  // q0
    uint128_t v2;  // 4107
    uint128_t v3;  // q0
    uint128_t v4;  // 4112
    uint128_t v5;  // q2
    uint128_t v6;  // 4113
    uint128_t v8;  // q1
    uint128_t v9;  // 4129

    v0 = __dirty_unsupported_Iop_Reverse8sIn64_x2(*a0);
    v1 = __dirty_unsupported_Iop_SliceV128(v0, v0, 8);
    v2 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)*a1, (unsigned long long)v1);
    v3 = v2;
    v4 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)(*a1 >> 64), (unsigned long long)(v1 >> 64));
    v5 = v4;
    v6 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)a1[1], (unsigned long long)v1 ^ (unsigned long long)v0);
    v8 = v5 ^ v3 ^ __dirty_unsupported_Iop_SliceV128(v5, v3, 8) ^ v6;
    v9 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v3, 0xc200000000000000);
    v12 = v9 ^ _INSERT(v8, 8, (unsigned long long)v3);
    v14 = __dirty_arm64g_dirtyhelper_PMULLQ(/* unsupported instruction */, (unsigned long long)v12, 0xc200000000000000);
    v15 = __dirty_unsupported_Iop_Reverse8sIn64_x2(_INSERT(v5, 0, *(double *)&*(unsigned long long *)((void*)&v8 + 8)) ^ __dirty_unsupported_Iop_SliceV128(v12, v12, 8) ^ v14);
    v16 = __dirty_unsupported_Iop_SliceV128(v15, v15, 8);
    *a0 = v16;
    return *(unsigned long long *)&v16;
}
