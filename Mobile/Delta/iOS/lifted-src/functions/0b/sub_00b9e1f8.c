/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb9e1f8..0xb9e2f0 (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b9e1f8_1 {
    uint128_t field_0;
    unsigned long long field_10;
} st_b9e1f8_1;

typedef struct st_b9e1f8_0 {
    char padding_0[8];
    long long field_8;
    unsigned long long field_10;
} st_b9e1f8_0;


double sub_b9e1f8(st_b9e1f8_1 *a0, st_b9e1f8_0 *a1)
{
    unsigned long long i;  // x23
    unsigned long long v9;  // x20
    unsigned long v12;  // cc_dep2
    unsigned long v13;  // cc_ndep
    unsigned long long v14;  // 4110
    unsigned long long v15;  // 4102
    unsigned long v16;  // cc_op
    unsigned long v17;  // cc_dep1
    st_b9e1f8_1 *v18;  // x19
    long long v19;  // x21
    unsigned long long ptr;  // x0
    uint128_t *iter;  // x22
    unsigned long long v22;  // x24
    long long v23;  // x0
    unsigned long long v24;  // x24
    long long v25;  // x0
    unsigned long long v10;  // 4110
    unsigned long long v11;  // 4102
    uint128_t v0;  // [bp-0x98]
    unsigned long long v1;  // [bp-0x88]
    uint128_t v2;  // [bp-0x80]
    uint128_t v3;  // [bp-0x70]
    uint128_t v4;  // [bp-0x60]
    uint128_t v5;  // [bp-0x50]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    i = a1->field_10;
    v9 = i * 64;
    if (i <= 0x3ffffffffffffff)
    {
        v10 = arm64g_calculate_condition(v16, v17, v12, v13);
        v11 = arm64g_calculate_condition(148, (v10 & 1 ? v9 : 0x20000000), (v10 & 1 ? 0x7ffffffffffffff8 : 0), 0);
        if (!(v11 & 1))
            goto LABEL_b9e22c;
    }
    else
    {
        v14 = arm64g_calculate_condition(v16, v17, v12, v13);
        v15 = arm64g_calculate_condition(144, (v14 & 1 ? v9 : 0x20000000), (v14 & 1 ? 0x7ffffffffffffff8 : 0), 0);
        if (!(v15 & 1))
        {
LABEL_b9e22c:
            a1 = v9;
            a0 = sub_c6b970(0, a1);
        }
    }
    v18 = a0;
    if (v9)
    {
        v19 = a1->field_8;
        ptr = _malloc(v9);
        if (!ptr)
        {
            v23 = sub_c6b970(8, v9);
            v1 = v24;
            sub_b9b774(&v0);
            v25 = __Unwind_Resume(v23);
            sub_c73e0c(v25);
        }
        iter = ptr;
        v0 = CONCAT(ptr, i);
        if (i)
        {
            v22 = 0;
            do
            {
                if (!v9)
                    break;
                sub_b9e2f0(&v2, v19);
                v22 += 1;
                v19 += 64;
                *iter = v2;
                iter[1] = v3;
                iter[2] = v4;
                iter[3] = v5;
                v9 -= 64;
                iter += 4;
            } while (i != v22);
        }
    }
    else
    {
        v0 = CONCAT(8, 0);
    }
    v18->field_0 = v0;
    v18->field_10 = i;
    return *(unsigned long long *)&v0;
}
