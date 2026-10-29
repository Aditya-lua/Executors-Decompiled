/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa08f10..0xa096fc (2028 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_a08f10(uint128_t *a0, long long a1)
{
    unsigned int v20;  // w21
    unsigned long long v30;  // x13
    unsigned long long v31;  // x16
    unsigned long long v32;  // x9
    unsigned long long v33;  // x15
    unsigned long long v34;  // x13
    unsigned long long v35;  // x14
    unsigned long long v36;  // x16
    unsigned long long v37;  // x12
    unsigned long long v38;  // x10
    unsigned long long v39;  // x15
    unsigned long long v22;  // 4113
    uint128_t v40;  // q0
    unsigned long v42;  // d0
    unsigned long v43;  // x8
    unsigned int v23;  // w21
    unsigned long long v25;  // 4113
    unsigned long long v26;  // x8
    unsigned long long v27;  // x10
    unsigned long long v28;  // x11
    unsigned long long v29;  // x12
    char v0;  // [bp-0x140]
    char v1;  // [bp-0x100]
    uint128_t v2;  // [bp-0xf0]
    uint128_t v3;  // [bp-0xe0]
    uint128_t v4;  // [bp-0xd0]
    unsigned long long v5;  // [bp-0xc0]
    unsigned long long v6;  // [bp-0xb8]
    unsigned long long v7;  // [bp-0xb0]
    unsigned long long v8;  // [bp-0xa8]
    unsigned long v9;  // [bp-0xa0]
    unsigned long long v10;  // [bp-0x98]
    unsigned long long v11;  // [bp-0x90]
    unsigned long long v12;  // [bp-0x88]
    uint128_t v13;  // [bp-0x80], Other Possible Types: char
    uint128_t v14;  // [bp-0x70]
    uint128_t v15;  // [bp-0x60]
    uint128_t v16;  // [bp-0x50]
    unsigned long v17;  // [bp-0x38]
    char *v18;  // [bp-0x10]
    char v19;  // [bp+0x0]

    v18 = &v19;
    v17 = *(long long *)&g_10002b0;
    sub_a04c64(&v1);
    sub_a04850(&v0, a1, &v1);
    sub_a04c64(&v1, &v0);
    sub_a04850(&v0, a1, &v1);
    sub_a04c64(&v1, &v0);
    sub_a04c64(&v13, &v1);
    sub_a04c64(&v1, &v13);
    sub_a04850(&v5, &v0, &v1);
    sub_a04c64(&v1, &v5);
    sub_a04c64(&v13, &v1);
    sub_a04c64(&v1, &v13);
    sub_a04850(&v5, &v0, &v1);
    sub_a04c64(&v0, &v5);
    sub_a04c64(&v13, &v0);
    sub_a04c64(&v0, &v13);
    sub_a04c64(&v13, &v0);
    sub_a04c64(&v0, &v13);
    sub_a04c64(&v13, &v0);
    sub_a04c64(&v0, &v13);
    sub_a04c64(&v13, &v0);
    sub_a04c64(&v0, &v13);
    sub_a04850(&v1, &v5, &v0);
    sub_a04c64(&v5, &v1);
    sub_a04850(&v0, a1, &v5);
    sub_a04c64(&v13, &v0);
    sub_a04c64(&v5, &v13);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04850(&v0, &v1, &v5);
    sub_a04c64(&v5, &v0);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04850(&v1, &v0, &v5);
    sub_a04c64(&v5, &v1);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04c64(&v13, &v5);
    sub_a04c64(&v5, &v13);
    sub_a04850(&v1, &v0, &v5);
    sub_a04c64(&v5, &v1);
    v20 = 0xffffff92;
    do
    {
        sub_a04c64(&v13, &v5);
        sub_a04c64(&v5, &v13);
        v22 = arm64g_calculate_condition(0x11, v20, 2, 0);
        v20 += 2;
    } while (v22 & 1);
    sub_a04850(&v0, &v1, &v5);
    sub_a04c64(&v5, &v0);
    sub_a04850(&v1, a1, &v5);
    sub_a04c64(&v5, &v1);
    v23 = 0xffffff22;
    do
    {
        sub_a04c64(&v13, &v5);
        sub_a04c64(&v5, &v13);
        v25 = arm64g_calculate_condition(0x11, v23, 2, 0);
        v23 += 2;
    } while (v25 & 1);
    sub_a04850(&v1, &v0, &v5);
    sub_a04c64(&v0, &v1);
    sub_a04850(&v5, &v0, a1);
    v26 = v5 + 0x1fffffffffffffd;
    v27 = v6 + 0x1fffffffffffffe;
    v28 = v7 + 0x1fffffffffffffe;
    v29 = v8 + 0x1fffffffffffffe;
    v30 = v12 + 0x1fffffffffffffe;
    v31 = v10 + 0x1fffffffffffffe;
    v32 = v11 + 0x1fffffffffffffe;
    v33 = (v30 & 0xffffffffffffff) + (v32 >> 56);
    v34 = v30 >> 56;
    v35 = v9 + 0x1fffffffffffffc + v34;
    v36 = (v31 & 0xffffffffffffff) + (v35 >> 56);
    v37 = (v29 & 0xffffffffffffff) + (v28 >> 56);
    v38 = (v27 & 0xffffffffffffff) + (v26 >> 56);
    *a0 = v1;
    a0[1] = v2;
    a0[2] = v3;
    a0[3] = v4;
    v39 = v33 >> 56;
    v16 = CONCAT((v33 & 0xffffffffffffff) + ((v32 & 0xffffffffffffff) + (v31 >> 56) >> 56), ((v32 & 0xffffffffffffff) + (v31 >> 56) & 0xffffffffffffff) + (v36 >> 56));
    v15 = CONCAT((v36 & 0xffffffffffffff) + ((v35 & 0xffffffffffffff) + (v29 >> 56) + v39 >> 56), ((v35 & 0xffffffffffffff) + (v29 >> 56) + v39 & 0xffffffffffffff) + (v37 >> 56));
    v14 = CONCAT((v37 & 0xffffffffffffff) + ((v28 & 0xffffffffffffff) + (v27 >> 56) >> 56), ((v28 & 0xffffffffffffff) + (v27 >> 56) & 0xffffffffffffff) + (v38 >> 56));
    v13 = CONCAT((v38 & 0xffffffffffffff) + (v34 + (v26 & 0xffffffffffffff) >> 56), (v34 + (v26 & 0xffffffffffffff) & 0xffffffffffffff) + v39);
    sub_a085fc(&v13);
    if (*(long long *)&g_10002b0 == v17)
    {
        v40 = v13 | v15 | v14 | v16;
        v42 = __dirty_unsupported_Iop_ZeroHI64ofV128(v40 | __dirty_unsupported_Iop_SliceV128(v40, v40, 8));
        v43 = __double_as_longlong(v42);
        return (long long)(v43 - 1 & ~v43) >> 63;
    }
    ___stack_chk_fail();
}
