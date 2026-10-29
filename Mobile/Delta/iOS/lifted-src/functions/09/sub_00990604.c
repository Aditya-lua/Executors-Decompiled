/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x990604..0x990748 (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_990604_0 {
    void* field_0;
    unsigned long long field_8;
} st_990604_0;

typedef struct st_990604_1 {
    unsigned short field_0;
    unsigned short field_2;
    unsigned int field_4;
    uint128_t field_8;
    uint128_t field_18;
    char field_28;
} st_990604_1;


double sub_990604(st_990604_0 *a0, st_990604_1 *a1)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    void* v19;  // x8
    unsigned long long v20;  // x9
    unsigned long long v21;  // x22
    unsigned long long v22;  // x20
    unsigned long long v23;  // x0
    void* v24;  // x8
    unsigned long long v25;  // x9
    unsigned long v26;  // cc_dep1
    unsigned long v27;  // cc_dep2
    unsigned long long v28;  // 4129
    unsigned long long v11;  // x22
    unsigned long long v29;  // 4110
    unsigned long long v30;  // 4102
    unsigned long long v31;  // 4110
    unsigned long long v32;  // 4102
    unsigned long v33;  // x22
    unsigned long long n;  // x19
    unsigned long long v35;  // x10
    unsigned long v36;  // x23
    uint128_t *v37;  // x20
    unsigned int v38;  // w8
    unsigned long long v12;  // x21
    uint128_t v39;  // q0
    unsigned int v40;  // w9
    unsigned long v41;  // d0
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    unsigned long long v16;  // x20
    unsigned long long v17;  // x0
    unsigned long long v18;  // x9
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (!a0->field_8)
        return v41;
    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    v16 = 1 << ((char)(*(char *)a0->field_0) >> 6 & 63);
    if (a0->field_8 >= v16)
    {
        v17 = sub_a7b0d8(a0->field_0);
        v18 = a0->field_8;
        v19 = a0->field_0 + v16;
        v20 = v18 - v16;
        a0->field_0 = v19;
        a0->field_8 = v20;
        if (v18 == v16 || (v21 = 1 << ((char)(*(char *)v19) >> 6 & 63), v20 < v21))
            goto LABEL_9906fc;
        v22 = v17;
        v23 = sub_a7b0d8(v19);
        v24 = a0->field_0 + v21;
        v25 = a0->field_8 - v21;
        a0->field_0 = v24;
        a0->field_8 = v25;
        v26 = v25;
        v27 = v23;
        if (v25 < v23)
            goto LABEL_9906fc;
        a0->field_0 = v24 + v23;
        a0->field_8 = v25 - v23;
        v28 = arm64g_calculate_condition(0x22, v23 - 62, 21, 0);
        if (v28 & 1)
        {
            v29 = arm64g_calculate_condition(36, v26, v27, 0);
            v30 = arm64g_calculate_condition(20, (v29 & 1 ? v22 : 0), (v29 & 1 ? 13 : 0), 0);
            goto LABEL_9906fc;
        }
        else
        {
            v31 = arm64g_calculate_condition(36, v26, v27, 0);
            v32 = arm64g_calculate_condition(16, (v31 & 1 ? v22 : 0), (v31 & 1 ? 13 : 0), 0);
            if (v32 & 1 || (a1->field_4 = *(int *)v24, v33 = (short)v24[4], *(int128_t *)&(&a1->field_4)[1] = (int128_t)v24[6], n = (char)v24[24], 20 < n || (v35 = v23 - 25, v23 - 25 < n || (v36 = (short)v24[22], v37 = v24 + 25, _memcpy((char *)&a1->field_18 + 9, v37, n), 16 > v23 - 25 - n))))
                goto LABEL_9906fc;
            v38 = (((((v33 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v33 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v33 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v33 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
            v39 = *(int128_t *)((char *)v37 + n);
            v40 = (((((v36 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v36 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v36 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v36 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
            *(uint128_t *)((char *)&a1->field_8 + 8) = v39;
            a1->field_0 = v38 >> 16;
            a1->field_2 = v40 >> 16;
            *((char *)&a1->field_18 + 8) = n;
        }
    }
    else
    {
LABEL_9906fc:
    }
    return (unsigned long long)v39;
}
