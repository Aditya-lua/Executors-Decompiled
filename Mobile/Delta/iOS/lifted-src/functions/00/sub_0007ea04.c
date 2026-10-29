/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7ea04..0x7ec18 (532 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7ea04_1 {
    char padding_0[976];
    char field_3d0;
    char padding_3d1[2247];
    unsigned long long field_c98;
    char padding_ca0[768];
    uint128_t field_fa0;
    uint128_t field_fb0;
    uint128_t field_fc0;
    uint128_t field_fd0;
    uint128_t field_fe0;
    uint128_t field_ff0;
} st_7ea04_1;

typedef struct st_7ea04_0 {
    char field_0;
} st_7ea04_0;


unsigned long long sub_7ea04(st_7ea04_1 *a0, long long a1, long long a2, long long a3, long long a4, long long a5, unsigned long a6)
{
    long long v11;  // x20
    long long v12;  // x21
    long long v21;  // x23
    long long v22;  // x27
    unsigned long long v23;  // x0
    long long v24;  // x19
    st_7ea04_1 *v25;  // x20
    long long v26;  // w8
    long long v27;  // x20
    unsigned long long v28;  // x0
    unsigned long long v29;  // 4106
    uint128_t v30;  // q1
    long long v13;  // x22
    uint128_t v31;  // q0
    unsigned long idx;  // x8
    long long v14;  // x0
    uint128_t *v15;  // x26
    uint128_t *v16;  // x28
    long long v17;  // x27
    unsigned long v18;  // x25
    long long v19;  // x23
    long long v20;  // x24
    long long v0;  // [bp-0xb0]
    long long v1;  // [bp-0xa0]
    long long v2;  // [bp-0x98]
    st_7ea04_0 **v3;  // [bp-0x90], Other Possible Types: char
    st_7ea04_0 *v4;  // [bp-0x88]
    unsigned long v5;  // [bp-0x80]
    unsigned int v6;  // [bp-0x78]
    unsigned long v7;  // [bp-0x70]
    unsigned int v8;  // [bp-0x68]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v11 = a3;
    v12 = a2;
    v13 = a1;
    v4 = &v3;
    v3 = &v4;
    v14 = sub_804fc();
    v7 = *(long long *)(a0->field_c98 + 5616);
    v8 = *(int *)(a0->field_c98 + 5624);
    v5 = *(long long *)(a0->field_c98 + 5616);
    v6 = *(int *)(a0->field_c98 + 5624);
    memset(&a0->field_ff0, 0, 80);
    if (v14)
    {
        v0 = v14;
        v15 = &a0->field_ff0;
        v16 = &a0->field_fa0;
        sub_7fc60(v16, &a0->field_3d0, 0, *(int *)&a0[1].padding_0[64]);
        v2 = 0;
        v17 = 0;
        v18 = &a0[1].padding_0[0x44];
        v19 = 1040;
        v20 = v0;
        while (1)
        {
            v21 = v19;
            v22 = v17;
            v1 = v11;
            v23 = sub_7e414(v16);
            v24 = sub_81cf0(v16) + v23;
            v2 += v24;
            if (v20)
            {
                v25 = a0;
                sub_7fc60(v15, &v25->field_3d0, *(int *)(v18 - 4), *(int *)v18);
                v26 = 0;
            }
            else
            {
                v24 = v24 + a4 - v2;
                v26 = a5;
                v25 = a0;
            }
            v27 = v1;
            v28 = sub_81f38(v25, v16, &v7, &v5, v13, v12, v27, v24, CONCAT(1, v26));
            v29 = arm64g_calculate_condition(130, v28, 120, 0);
            if (v29 & 1)
                break;
            v30 = v15[3];
            v16[2] = v15[2];
            v16[3] = v30;
            v16[4] = v15[4];
            v17 = v28 + v22;
            v12 -= v28;
            v31 = v15[1];
            *v16 = *v15;
            v16[1] = v31;
            v13 += v28;
            v11 = v27 + v24;
            v20 -= 1;
            v19 = v21 + 1;
            v18 += 4;
            if ((unsigned long long)(v21 - 1039) > (unsigned long long)v0)
            {
                idx = a0->field_c98;
                *(unsigned long *)(idx + 5616) = v7;
                *(unsigned int *)(idx + 5624) = v8;
                return v28 + v22;
            }
        }
    }
    else
    {
        v28 = sub_81f38(a0, &a0->field_3d0, &v7, &v5, v13, v12, v11, a4, a5);
    }
    return v28;
}
