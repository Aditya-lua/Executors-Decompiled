/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb9bff4..0xb9c238 (580 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b9bff4_1 {
    char padding_0[15];
    uint128_t field_f;
} st_b9bff4_1;

typedef struct st_b9bff4_0 {
    uint128_t field_0;
    char field_1;
    char padding_2[14];
    uint128_t field_10;
} st_b9bff4_0;


double sub_b9bff4(st_b9bff4_0 **a0, void* a1)
{
    st_b9bff4_0 *v20;  // x11
    st_b9bff4_0 *v21;  // x9
    unsigned long long v30;  // 4110
    unsigned long long v31;  // 4102
    st_b9bff4_0 *v32;  // x0
    st_b9bff4_0 *ptr;  // x0
    unsigned long long v34;  // x21
    unsigned long long v35;  // x22
    unsigned long long v36;  // x20
    st_b9bff4_0 *v37;  // x10
    unsigned long long v38;  // x9
    unsigned long long v39;  // 4110
    unsigned long long v22;  // 4110
    unsigned long long v40;  // x8
    unsigned long long v41;  // 4109
    uint128_t *v42;  // x8
    unsigned long long v43;  // d0
    st_b9bff4_1 *v23;  // x8
    unsigned long long v24;  // 4109
    unsigned long v25;  // cc_dep1
    st_b9bff4_1 *v26;  // x24
    unsigned long long v27;  // x22
    unsigned long long v28;  // 4110
    unsigned long long v29;  // 4102
    uint128_t v0;  // [bp-0x168]
    unsigned long long v1;  // [bp-0x158]
    char v2;  // [bp-0x150]
    uint128_t v3;  // [bp-0x140]
    uint128_t v4;  // [bp-0x130]
    uint128_t v5;  // [bp-0x120]
    uint128_t v6;  // [bp-0x110]
    uint128_t v7;  // [bp-0x100]
    uint128_t v8;  // [bp-0xf0]
    uint128_t v9;  // [bp-0xe0]
    uint128_t v10;  // [bp-0xd0]
    uint128_t v11;  // [bp-0xc0]
    uint128_t v12;  // [bp-0xb0]
    uint128_t v13;  // [bp-0xa0]
    uint128_t v14;  // [bp-0x90]
    uint128_t v15;  // [bp-0x80]
    uint128_t v16;  // [bp-0x70]
    uint128_t v17;  // [bp-0x60]
    char *v18;  // [bp-0x10]
    char v19;  // [bp+0x0]

    v18 = &v19;
    sub_b9c238(&v2);
    if (!*(unsigned long long *)&v2)
    {
        *a0 = 0;
        a0[1] = 8;
        a0[2] = 0;
        sub_b9c50c();
        return v43;
    }
    v20 = (long long)a1[184];
    if ((long long)a1[128] == 9223372036854775809)
        v20 = 0;
    v21 = a1[120] + (char *)v20;
    v22 = arm64g_calculate_condition(50, (long long)a1[120], v20, 0);
    if (!(v22 & 1))
        v21 = 0xffffffffffffffff;
    if ((long long)a1[64] != 9223372036854775809)
        v20 = v21;
    v23 = (char *)&v20->field_0 + 1;
    v24 = arm64g_calculate_condition(50, v20, 1, 0);
    if (!(v24 & 1))
        v23 = 0xffffffffffffffff;
    v25 = v23;
    if (4 < v23)
        v26 = v23;
    else
        v26 = 4;
    v27 = v26 * 32;
    if (v23 <= 0x7ffffffffffffff)
    {
        v28 = arm64g_calculate_condition(4, v25, 4, 0);
        v29 = arm64g_calculate_condition(148, (v28 & 1 ? v27 : 0x20000000), (v28 & 1 ? 0x7ffffffffffffff8 : 0), 0);
        if (v29 & 1)
            goto LABEL_b9c0b8;
LABEL_b9c07c:
        v32 = 0;
    }
    else
    {
        v30 = arm64g_calculate_condition(4, v25, 4, 0);
        v31 = arm64g_calculate_condition(144, (v30 & 1 ? v27 : 0x20000000), (v30 & 1 ? 0x7ffffffffffffff8 : 0), 0);
        if (!(v31 & 1))
            goto LABEL_b9c07c;
LABEL_b9c0b8:
        ptr = _malloc(v27);
        if (ptr)
        {
            v34 = ptr;
            ptr->field_0 = v2;
            *(uint128_t *)&ptr->field_1 = v3;
            v13 = (int128_t)a1[144];
            v14 = (int128_t)a1[160];
            v15 = (int128_t)a1[176];
            v9 = (int128_t)a1[80];
            v10 = (int128_t)a1[96];
            v0 = CONCAT(ptr, v26);
            v35 = 1;
            v1 = 1;
            v11 = (int128_t)a1[112];
            v12 = (int128_t)a1[128];
            v4 = *(int128_t *)a1;
            v5 = (int128_t)a1[16];
            v36 = 32;
            v6 = (int128_t)a1[32];
            v7 = (int128_t)a1[48];
            v8 = (int128_t)a1[64];
            while (1)
            {
                sub_b9c238(&v16, &v4);
                if (!*(unsigned long long *)&v16)
                    break;
                if (v35 == *(unsigned long long *)&v0)
                {
                    if (*(unsigned long long *)&v12 == 9223372036854775809)
                        v37 = 0;
                    else
                        v37 = *(unsigned long long *)((void*)&v15 + 8);
                    v38 = *(unsigned long long *)((void*)&v11 + 8) + (char *)v37;
                    v39 = arm64g_calculate_condition(50, *(unsigned long long *)((void*)&v11 + 8), v37, 0);
                    if (!(v39 & 1))
                        v38 = 0xffffffffffffffff;
                    if (*(unsigned long long *)&v8 == 9223372036854775809)
                        v40 = v37;
                    else
                        v40 = v38;
                    v41 = arm64g_calculate_condition(50, v40, 1, 0);
                    sub_c736c8();
                    v34 = *(unsigned long long *)((void*)&v0 + 8);
                }
                v42 = v34 + v36;
                *v42 = v16;
                v42[1] = v17;
                v35 += 1;
                v1 = v35;
                v36 += 32;
            }
            sub_b9c50c(&v4);
            *(uint128_t *)a0 = v0;
            a0[2] = v1;
            return *(unsigned long long *)&v0;
        }
        v32 = 8;
    }
    sub_c6b970(v32, v27);
    __debugbreak();
}
