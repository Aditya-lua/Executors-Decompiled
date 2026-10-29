/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa04b70..0xa04c64 (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a04b70_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
    unsigned long long field_38;
} st_a04b70_0;


st_a04b70_0 * sub_a04b70(st_a04b70_0 *a0, void* a1, unsigned int a2)
{
    unsigned long v0;  // x9
    unsigned long v1;  // x8
    unsigned long v10;  // x14
    unsigned long long v11;  // x13
    unsigned long long v12;  // x12
    unsigned long long v13;  // 4125
    unsigned long long v14;  // x14
    unsigned long long v15;  // x17
    unsigned long v16;  // x15
    unsigned long long v17;  // x12
    unsigned long long v18;  // 4133
    unsigned long long v19;  // x2
    unsigned long v2;  // x10
    unsigned long v20;  // x17
    unsigned long long v21;  // x14
    unsigned long long v22;  // 4127
    unsigned long long v23;  // x15
    unsigned long long v24;  // x2
    unsigned long v25;  // x16
    unsigned long long v26;  // x15
    unsigned long long v27;  // x16
    unsigned long v28;  // x9
    unsigned long long v29;  // x17
    unsigned long long v3;  // x12
    unsigned long long v30;  // 4151
    unsigned long long v31;  // x9
    unsigned long long v32;  // 4111
    unsigned long long v33;  // x9
    unsigned long long v34;  // x10
    unsigned long long v35;  // x8
    unsigned long long v4;  // x13
    unsigned long long v5;  // x15
    unsigned long v6;  // x11
    unsigned long long v7;  // x11
    unsigned long long v8;  // 4170
    unsigned long long v9;  // x15

    v0 = a2;
    v1 = v0 * *(long long *)a1;
    v2 = v0 * (long long)a1[32];
    v3 = (*(long long *)a1 * v0 >> 64) * 0x100 | v1 >> 56;
    v4 = ((long long)a1[32] * v0 >> 64) * 0x100 | v2 >> 56;
    v5 = (long long)a1[8] * v0 >> 64;
    v6 = v0 * (long long)a1[8];
    v7 = v6 + v3;
    v8 = arm64g_calculate_condition(50, v6, v3, 0);
    if (!(v8 & 1))
        v5 += 1;
    v9 = (long long)a1[40] * v0 >> 64;
    v10 = v0 * (long long)a1[40];
    v11 = v10 + v4;
    v12 = v5 * 0x100 | v7 >> 56;
    v13 = arm64g_calculate_condition(50, v10, v4, 0);
    if (!(v13 & 1))
        v9 += 1;
    v14 = v9 * 0x100 | v11 >> 56;
    v15 = (long long)a1[16] * v0 >> 64;
    v16 = v0 * (long long)a1[16];
    v17 = v16 + v12;
    v18 = arm64g_calculate_condition(50, v16, v12, 0);
    if (!(v18 & 1))
        v15 += 1;
    v19 = (long long)a1[48] * v0 >> 64;
    v20 = v0 * (long long)a1[48];
    v21 = v20 + v14;
    v22 = arm64g_calculate_condition(50, v20, v14, 0);
    if (!(v22 & 1))
        v19 += 1;
    v23 = v15 * 0x100 | v17 >> 56;
    v24 = (long long)a1[24] * v0 >> 64;
    v25 = v0 * (long long)a1[24];
    v26 = v25 + v23;
    v27 = (long long)a1[56] * v0 >> 64;
    v28 = v0 * (long long)a1[56];
    v29 = v19 * 0x100 | v21 >> 56;
    v30 = arm64g_calculate_condition(50, v25, v23, 0);
    if (!(v30 & 1))
        v24 += 1;
    v31 = v28 + v29;
    v32 = arm64g_calculate_condition(50, v28, v29, 0);
    if (!(v32 & 1))
        v27 += 1;
    a0->field_10 = v17 & 0xffffffffffffff;
    a0->field_18 = v26 & 0xffffffffffffff;
    a0->field_30 = v21 & 0xffffffffffffff;
    a0->field_38 = v31 & 0xffffffffffffff;
    v33 = v27 * 0x100 | v31 >> 56;
    v34 = (v24 * 0x100 | v26 >> 56) + v33 + (v2 & 0xffffffffffffff);
    a0->field_20 = v34 & 0xffffffffffffff;
    a0->field_28 = (v11 & 0xffffffffffffff) + (v34 >> 56);
    v35 = v33 + (v1 & 0xffffffffffffff);
    a0->field_0 = v35 & 0xffffffffffffff;
    a0->field_8 = (v7 & 0xffffffffffffff) + (v35 >> 56);
    return a0;
}
