/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb93d28..0xb93fe4 (700 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b93d28_0 {
    struct st_b93d28_0 *field_0;
} st_b93d28_0;


double sub_b93d28(st_b93d28_0 **a0, unsigned long long *a1)
{
    st_b93d28_0 **v24;  // x10
    st_b93d28_0 **v25;  // x8
    st_b93d28_0 **v34;  // x21
    st_b93d28_0 **v35;  // x20
    st_b93d28_0 **v36;  // x0
    unsigned long long v37;  // 4114
    st_b93d28_0 **v38;  // x9
    unsigned long v39;  // cc_op
    unsigned long v40;  // cc_dep1
    unsigned long v41;  // cc_dep2
    unsigned long v42;  // cc_ndep
    unsigned long long v43;  // 4110
    st_b93d28_0 **v26;  // x9
    unsigned long long v44;  // 4102
    unsigned long long v45;  // 4110
    unsigned long long v46;  // 4102
    st_b93d28_0 **v27;  // x0
    unsigned long v47;  // d0
    unsigned long v48;  // d0
    unsigned long v49;  // d0
    unsigned long v50;  // d0
    st_b93d28_0 **v28;  // x0
    st_b93d28_0 **v29;  // x8
    unsigned long long v30;  // 4113
    st_b93d28_0 **v31;  // x23
    unsigned long long v32;  // x22
    st_b93d28_0 **ptr;  // x0
    uint128_t v0;  // [bp-0x180]
    st_b93d28_0 **v1;  // [bp-0x170]
    uint128_t v2;  // [bp-0x160]
    uint128_t v3;  // [bp-0x150]
    uint128_t v4;  // [bp-0x140]
    uint128_t v5;  // [bp-0x130]
    uint128_t v6;  // [bp-0x120]
    uint128_t v7;  // [bp-0x110]
    st_b93d28_0 **v8;  // [bp-0x100]
    uint128_t v9;  // [bp-0xf8]
    st_b93d28_0 **v10;  // [bp-0xe8]
    uint128_t v11;  // [bp-0xe0], Other Possible Types: char
    st_b93d28_0 **v12;  // [bp-0xd8]
    st_b93d28_0 **v13;  // [bp-0xd0]
    uint128_t v14;  // [bp-0xc0]
    uint128_t v15;  // [bp-0xb0]
    uint128_t v16;  // [bp-0xa0]
    uint128_t v17;  // [bp-0x90]
    uint128_t v18;  // [bp-0x80]
    uint128_t v19;  // [bp-0x70]
    st_b93d28_0 **v20;  // [bp-0x60]
    unsigned long v21;  // [bp-0x58]
    char *v22;  // [bp-0x10]
    char v23;  // [bp+0x0]

    v22 = &v23;
    if (*a1 == 12)
    {
        v24 = 0;
        v25 = 0;
        v26 = 8;
    }
    else
    {
        sub_bcc71c(&v11, a1);
        v25 = (st_b93d28_0 **)v11;
        v26 = v12;
        v24 = v13;
    }
    v0 = CONCAT(a1 + 11, 1);
    v1 = (st_b93d28_0 **)1;
    *(unsigned long long *)((char *)&v3 + 8) = 0;
    *(unsigned long long *)((char *)&v5 + 8) = a1[9];
    v6 = CONCAT(v26, a1[9] + a1[10] * 64);
    v7 = CONCAT(v25, v26);
    v8 = (char *)v26 + 0x8 * v24;
    v27 = sub_b74df4(&v0);
    if (v27)
    {
        sub_b735dc(&v11, &v0);
        v28 = 0;
        v29 = v11 + 1;
        v30 = arm64g_calculate_condition(50, v11, 1, 0);
        if (!(v30 & 1))
            v29 = 0xffffffffffffffff;
        if (4 < v29)
            v31 = v29;
        else
            v31 = 4;
        v32 = v31 * 8;
        if (v29 <= 0x1fffffffffffffff && 0x7ffffffffffffff8 >= v32)
        {
            ptr = _malloc(v32);
            if (ptr)
            {
                v34 = ptr;
                *ptr = v27;
                v9 = CONCAT(ptr, v31);
                v35 = 1;
                v10 = 1;
                v18 = v6;
                v19 = v7;
                v20 = v8;
                v14 = v2;
                v15 = v3;
                v16 = v4;
                v17 = v5;
                v11 = v0;
                v13 = v1;
                while (1)
                {
                    v36 = sub_b74df4(&v11);
                    if (!v36)
                        break;
                    if (v35 == *(unsigned long long *)&v9)
                    {
                        sub_b735dc(&v21, &v11);
                        v37 = arm64g_calculate_condition(50, v21, 1, 0);
                        sub_c6c0cc();
                        v34 = *(unsigned long long *)((void*)&v9 + 8);
                    }
                    *(st_b93d28_0 ***)((char *)v34 + 0x8 * v35) = v36;
                    v35 = (char *)v35 + 1;
                    v10 = v35;
                }
                v38 = v13;
                if (*(unsigned long long *)&v11 != 2)
                {
                    v43 = arm64g_calculate_condition(v39 | 16, v40, v41, v42);
                    v44 = arm64g_calculate_condition(4, (v43 & 1 ? v38 : 0x40000000), 0, 0);
                    if (!(v44 & 1))
                        goto LABEL_b93f20;
                }
                else
                {
                    v45 = arm64g_calculate_condition(v39 | 16, v40, v41, v42);
                    v46 = arm64g_calculate_condition(0, (v45 & 1 ? v38 : 0x40000000), 0, 0);
                    if (!(v46 & 1))
                    {
LABEL_b93f20:
                        if (*(unsigned long long *)((void*)&v13 + 8) && *(unsigned long long *)((void*)&v14 + 8))
                            _free();
                        if (*(unsigned long long *)((void*)&v15 + 8) && *(unsigned long long *)((void*)&v16 + 8))
                            _free();
                    }
                }
                if (*(unsigned long long *)((void*)&v18 + 8) && *(unsigned long long *)((void*)&v19 + 8))
                    _free();
                *(uint128_t *)a0 = v9;
                a0[2] = v10;
                return v47;
            }
            v28 = 8;
        }
        sub_c6b970(v28, v32);
        __debugbreak();
    }
    else
    {
        *a0 = 0;
        a0[1] = 8;
        a0[2] = 0;
        if (*(unsigned long long *)&v0 != 2 && (unsigned long long)v1)
        {
            if (*(unsigned long long *)((void*)&v1 + 8) && *(unsigned long long *)((void*)&v2 + 8))
                _free();
            if (*(unsigned long long *)((void*)&v3 + 8) && *(unsigned long long *)((void*)&v4 + 8))
                _free();
        }
        if (!*(unsigned long long *)((void*)&v6 + 8))
        {
            return v50;
        }
        else if (*(unsigned long long *)((void*)&v7 + 8))
        {
            _free();
            return v48;
        }
        else
        {
            return v49;
        }
    }
}
