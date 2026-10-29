/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb8c520..0xb8c798 (632 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_b8c520(uint128_t *a0, unsigned long a1, unsigned long a2)
{
    unsigned long long v14;  // x0
    unsigned long long v15;  // x8
    unsigned long long v24;  // 4110
    unsigned long long v25;  // 4102
    unsigned long long v26;  // x0
    unsigned long long ptr;  // x0
    unsigned long long idx;  // x21
    unsigned long long v29;  // x0
    unsigned long v30;  // cc_op
    unsigned long v31;  // cc_dep1
    unsigned long v32;  // cc_dep2
    unsigned long v33;  // cc_ndep
    unsigned long long v16;  // x9
    unsigned long long v34;  // 4110
    unsigned long long v35;  // 4102
    unsigned long long v36;  // 4110
    unsigned long long v37;  // 4102
    unsigned long long v17;  // x8
    unsigned long v38;  // d0
    unsigned long v39;  // d0
    unsigned long v40;  // d0
    unsigned long v41;  // d0
    unsigned long v18;  // cc_dep1
    unsigned long long v19;  // x9
    unsigned long v20;  // x22
    unsigned long long v21;  // x21
    unsigned long long v22;  // 4110
    unsigned long long v23;  // 4102
    uint128_t v0;  // [bp-0xf8]
    uint128_t v1;  // [bp-0xe8]
    uint128_t v2;  // [bp-0xd8]
    uint128_t v3;  // [bp-0xc8]
    uint128_t v4;  // [bp-0xb8]
    uint128_t v5;  // [bp-0xa8]
    unsigned long long v6;  // [bp-0x98]
    uint128_t v7;  // [bp-0x90]
    uint128_t v8;  // [bp-0x80]
    uint128_t v9;  // [bp-0x70]
    uint128_t v10;  // [bp-0x60]
    uint128_t v11;  // [bp-0x50]
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    *(unsigned long long *)&v0 = 0;
    *(unsigned long long *)&v2 = 0;
    v4 = CONCAT(a1 + 24 * a2, a1);
    v14 = sub_b763f0(&v0);
    if (v14)
    {
        if (!*(unsigned long long *)&v0)
            v15 = 0;
        else
            v15 = *(unsigned long long *)((void*)&v1 + 8) - *(unsigned long long *)((void*)&v0 + 8) >> 3;
        v16 = *(unsigned long long *)((void*)&v3 + 8) - *(unsigned long long *)((void*)&v2 + 8) >> 3;
        if (!(unsigned long long)v2)
            v16 = 0;
        v17 = v16 + v15;
        v18 = v17;
        v19 = 3;
        if (3 < v17)
            v19 = v17;
        v20 = v19 + 1;
        v21 = v20 * 8;
        if (v17 <= 0x1ffffffffffffffe)
        {
            v22 = arm64g_calculate_condition(148, v18, 3, 0);
            v23 = arm64g_calculate_condition(148, (v22 & 1 ? v21 : 0x20000000), (v22 & 1 ? 0x7ffffffffffffff8 : 0), 0);
            if (v23 & 1)
                goto LABEL_b8c610;
LABEL_b8c5b8:
            v26 = 0;
        }
        else
        {
            v24 = arm64g_calculate_condition(148, v18, 3, 0);
            v25 = arm64g_calculate_condition(144, (v24 & 1 ? v21 : 0x20000000), (v24 & 1 ? 0x7ffffffffffffff8 : 0), 0);
            if (!(v25 & 1))
                goto LABEL_b8c5b8;
LABEL_b8c610:
            if (v21)
            {
                ptr = _malloc(v21);
                if (ptr)
                    goto LABEL_b8c638;
                else
                    v26 = 8;
            }
            else
            {
                v20 = 0;
                ptr = 8;
LABEL_b8c638:
                *(unsigned long long *)ptr = v14;
                v5 = CONCAT(ptr, v20);
                v6 = 1;
                v9 = v2;
                v10 = v3;
                v11 = v4;
                idx = 1;
                v7 = v0;
                v8 = v1;
                while (1)
                {
                    v29 = sub_b763f0(&v7);
                    if (!v29)
                        break;
                    if (idx == *(unsigned long long *)&v5)
                    {
                        sub_c6c0cc();
                        ptr = *(unsigned long long *)((void*)&v5 + 8);
                    }
                    *(unsigned long long *)(ptr + idx * 8) = v29;
                    idx += 1;
                    v6 = idx;
                }
                if (*(unsigned long long *)&v7)
                {
                    v34 = arm64g_calculate_condition(v30 | 16, v31, v32, v33);
                    v35 = arm64g_calculate_condition(4, (v34 & 1 ? (unsigned long long)v8 : 0x40000000), 0, 0);
                    if (!(v35 & 1))
                        goto LABEL_b8c700;
                }
                else
                {
                    v36 = arm64g_calculate_condition(v30 | 16, v31, v32, v33);
                    v37 = arm64g_calculate_condition(0, (v36 & 1 ? (unsigned long long)v8 : 0x40000000), 0, 0);
                    if (!(v37 & 1))
                    {
LABEL_b8c700:
                        _free(*(unsigned long long *)&v7);
                    }
                }
                if ((unsigned long long)v9 && (unsigned long long)v10)
                    _free();
                *a0 = v5;
                *(unsigned long long *)&a0[1] = v6;
                return v38;
            }
        }
        sub_c6b970(v26, v21);
        __debugbreak();
    }
    else
    {
        *(unsigned long long *)a0 = 0;
        *(unsigned long long *)((char *)a0 + 8) = 8;
        *(unsigned long long *)&a0[1] = 0;
        if (*(unsigned long long *)&v0 && (unsigned long long)v1)
            _free();
        if (!(unsigned long long)v2)
        {
            return v41;
        }
        else if ((unsigned long long)v3)
        {
            _free();
            return v39;
        }
        else
        {
            return v40;
        }
    }
}
