/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb834e4..0xb83648 (356 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b834e4_1 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    uint128_t field_60;
    uint128_t field_70;
    uint128_t field_80;
    uint128_t field_90;
    uint128_t field_a0;
    uint128_t field_b0;
    unsigned long long field_c0;
    struct st_b834e4_0 *field_c8;
} st_b834e4_1;

typedef struct st_b834e4_2 {
    uint128_t field_0;
    unsigned long long field_10;
} st_b834e4_2;

typedef struct st_b834e4_0 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
} st_b834e4_0;


double sub_b834e4(st_b834e4_1 *a0, uint128_t *a1, uint128_t *a2, uint128_t *a3, unsigned long a4, st_b834e4_2 *a5)
{
    st_b834e4_0 *ptr;  // x0
    uint128_t v17;  // q1
    uint128_t v18;  // q1
    uint128_t v19;  // q1
    uint128_t v20;  // q1
    uint128_t v21;  // q0
    uint128_t v22;  // q1
    uint128_t v23;  // q3
    uint128_t v0;  // [bp-0x160]
    uint128_t v1;  // [bp-0x150]
    uint128_t v2;  // [bp-0x140]
    uint128_t v3;  // [bp-0x130]
    uint128_t v4;  // [bp-0x120]
    uint128_t v5;  // [bp-0x110]
    uint128_t v6;  // [bp-0x100]
    uint128_t v7;  // [bp-0xf0]
    uint128_t v8;  // [bp-0xe0]
    uint128_t v9;  // [bp-0xd0]
    uint128_t v10;  // [bp-0xc0]
    uint128_t v11;  // [bp-0xb0]
    uint248_t v12;  // [bp-0x97]
    uint320_t v13;  // [bp-0x78]
    char *v14;  // [bp-0x10]
    char v15;  // [bp+0x0]

    v14 = &v15;
    v0 = *a1;
    v1 = a1[1];
    v2 = a1[2];
    v3 = a1[3];
    v4 = *a2;
    v5 = a2[1];
    v6 = a2[2];
    v7 = a2[3];
    v8 = *a3;
    v9 = a3[1];
    v10 = a3[2];
    v11 = a3[3];
    *(uint128_t *)((char *)&v12 + 7) = a5->field_0;
    *(unsigned long long *)((char *)&v12 + 23) = a5->field_10;
    *(unsigned long long *)&v13 = 1;
    *((char *)&v13 + 8) = 0;
    *(uint128_t *)((char *)&v13 + 9) = *(uint128_t *)&v12;
    *(uint128_t *)((char *)&v13 + 24) = *(uint128_t *)((void*)&v12 + 15);
    ptr = _malloc(40);
    if (ptr)
    {
        ptr->field_0 = *(uint128_t *)&v13;
        ptr->field_10 = *(uint128_t *)((void*)&v13 + 16);
        ptr->field_20 = *(unsigned long long *)((void*)&v13 + 32);
        v17 = a1[1];
        a0->field_0 = *a1;
        a0->field_10 = v17;
        v18 = a1[3];
        a0->field_20 = a1[2];
        a0->field_30 = v18;
        v19 = a2[1];
        a0->field_40 = *a2;
        a0->field_50 = v19;
        v20 = a2[3];
        a0->field_60 = a2[2];
        a0->field_70 = v20;
        v21 = *a3;
        v22 = a3[1];
        v23 = a3[3];
        a0->field_a0 = a3[2];
        a0->field_b0 = v23;
        a0->field_80 = v21;
        a0->field_90 = v22;
        a0->field_c0 = a4;
        a0->field_c8 = ptr;
        return *(unsigned long long *)&v21;
    }
    sub_c6ba70(8, 40);
    __debugbreak();
}
