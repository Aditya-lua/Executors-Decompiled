/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbfdb7c..0xbfdd64 (488 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bfdb7c_0 {
    uint128_t field_0;
    unsigned long long field_10;
} st_bfdb7c_0;

typedef struct st_bfdb7c_2 {
    unsigned long long field_0;
    struct st_bfdb7c_1 *field_8;
    unsigned long long field_10;
    struct st_bfdb7c_1 *field_18;
    long long field_20;
} st_bfdb7c_2;

typedef struct st_bfdb7c_1 {
    long long field_0;
    unsigned int field_8;
} st_bfdb7c_1;


double sub_bfdb7c(st_bfdb7c_0 *a0, st_bfdb7c_2 *a1)
{
    st_bfdb7c_1 *i;  // x23
    st_bfdb7c_1 *v15;  // x24
    unsigned long v20;  // cc_op
    unsigned long v21;  // cc_dep1
    unsigned long v22;  // cc_dep2
    unsigned long v23;  // cc_ndep
    unsigned long long v24;  // 4110
    unsigned long long v25;  // 4102
    unsigned long long v16;  // x19
    unsigned long long v26;  // x0
    unsigned long long ptr;  // x0
    unsigned long long v28;  // x8
    unsigned long long v17;  // x1
    unsigned long long v29;  // x26
    long long v30;  // x21
    unsigned long iter;  // x25
    unsigned long v32;  // x22
    unsigned long long v33;  // x8
    unsigned long long v18;  // 4110
    unsigned long long v19;  // 4102
    unsigned long v0;  // [bp-0x130]
    unsigned long v1;  // [bp-0x120]
    uint128_t v2;  // [bp-0x118]
    unsigned long long v3;  // [bp-0x108]
    uint256_t v4;  // [bp-0x100]
    uint128_t v5;  // [bp-0xe0]
    uint128_t v6;  // [bp-0xd0]
    uint128_t v7;  // [bp-0xc0]
    uint128_t v8;  // [bp-0xb0]
    uint128_t v9;  // [bp-0xa0]
    uint128_t v10;  // [bp-0x90]
    uint128_t v11;  // [bp-0x80]
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    i = a1->field_8;
    v15 = a1->field_18;
    v16 = v15 - i;
    v17 = v16 * 8;
    if (v16 <= 0x1ffffffffffffff0)
    {
        v18 = arm64g_calculate_condition(v20 | 144, v21, v22, v23);
        v19 = arm64g_calculate_condition(148, (v18 & 1 ? v17 : 0x20000000), (v18 & 1 ? 0x7ffffffffffffff8 : 0), 0);
        if (v19 & 1)
            goto LABEL_bfdbd0;
LABEL_bfdbc4:
        v26 = 0;
    }
    else
    {
        v24 = arm64g_calculate_condition(v20 | 144, v21, v22, v23);
        v25 = arm64g_calculate_condition(144, (v24 & 1 ? v17 : 0x20000000), (v24 & 1 ? 0x7ffffffffffffff8 : 0), 0);
        if (!(v25 & 1))
            goto LABEL_bfdbc4;
LABEL_bfdbd0:
        if (v17)
        {
            ptr = _malloc(v17);
            if (ptr)
            {
                v28 = v16 >> 4;
                goto LABEL_bfdbf8;
            }
            else
            {
                v26 = 8;
            }
        }
        else
        {
            v28 = 0;
            ptr = 8;
LABEL_bfdbf8:
            v2 = CONCAT(ptr, v28);
            v3 = 0;
            v0 = a1->field_0;
            v1 = a1->field_10;
            if (i != v15)
            {
                v29 = 0;
                v30 = a1->field_20;
                iter = ptr + 80;
                do
                {
                    v32 = i->field_8;
                    sub_bfaa34((char *)&v7 + 8, v30, i->field_0);
                    *(unsigned long long *)&v7 = 6;
                    if (v32 >> 31 & 1)
                    {
                        v33 = 0x8000000000000000;
                    }
                    else
                    {
                        sub_bfaa34(&v4, v30, v32);
                        v33 = *(unsigned long long *)&v4;
                        v11 = *(uint128_t *)((void*)&v4 + 8);
                    }
                    v4 = CONCAT(v8, v7);
                    *(uint128_t *)(iter - 80) = v7;
                    *(uint128_t *)(iter - 64) = v8;
                    *(uint128_t *)(iter - 48) = v9;
                    *(uint128_t *)(iter - 32) = v10;
                    *(unsigned long long *)(iter - 16) = 6;
                    *(unsigned long long *)(iter - 8) = v33;
                    *(uint128_t *)iter = v11;
                    iter += 128;
                    v29 += 1;
                    i = (char *)&i[1].field_0 + 4;
                    v5 = v9;
                    v6 = v10;
                } while (i != v15);
            }
            else
            {
                v29 = 0;
            }
            v3 = v29;
            if (v1)
                _free(v0);
            a0->field_0 = v2;
            a0->field_10 = v3;
            return *(unsigned long long *)&v2;
        }
    }
    sub_c6b970(v26);
    __debugbreak();
}
