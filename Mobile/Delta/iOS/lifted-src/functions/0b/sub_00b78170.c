/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb78170..0xb782ec (380 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b78170_2 {
    uint128_t field_0;
    unsigned long long field_10;
} st_b78170_2;

typedef struct st_b78170_0 {
    char padding_0[8];
    struct st_b78170_1 *field_8;
    unsigned long long field_10;
} st_b78170_0;

typedef struct st_b78170_1 {
    unsigned long long field_0;
} st_b78170_1;


double sub_b78170(st_b78170_2 *a0, st_b78170_0 *a1)
{
    unsigned long long i;  // x23
    unsigned long long v17;  // x19
    unsigned long v20;  // cc_dep2
    unsigned long v21;  // cc_ndep
    unsigned long long v22;  // 4110
    unsigned long long v23;  // 4102
    unsigned long v24;  // cc_op
    unsigned long v25;  // cc_dep1
    st_b78170_2 *v26;  // x20
    unsigned long long *v27;  // x22
    unsigned long long ptr;  // x0
    uint128_t *iter;  // x21
    unsigned long long v30;  // x24
    unsigned long long *v31;  // x28
    unsigned long long *v32;  // x28
    long long v33;  // x0
    unsigned long long v34;  // x24
    long long v35;  // x0
    unsigned long long v18;  // 4110
    unsigned long long v19;  // 4102
    uint128_t v0;  // [bp-0x148]
    unsigned long long v1;  // [bp-0x138]
    char v2;  // [bp-0x130]
    uint128_t v3;  // [bp-0x120]
    uint128_t v4;  // [bp-0x110]
    uint128_t v5;  // [bp-0x100]
    uint128_t v6;  // [bp-0xf0]
    uint128_t v7;  // [bp-0xe0]
    uint128_t v8;  // [bp-0xd0]
    uint128_t v9;  // [bp-0xc0]
    uint128_t v10;  // [bp-0xb0]
    uint128_t v11;  // [bp-0xa0]
    uint128_t v12;  // [bp-0x90]
    uint128_t v13;  // [bp-0x80]
    char *v14;  // [bp-0x10]
    char v15;  // [bp+0x0]

    v14 = &v15;
    i = a1->field_10;
    v17 = i * 128;
    if (i <= 0x1ffffffffffffff)
    {
        v18 = arm64g_calculate_condition(v24, v25, v20, v21);
        v19 = arm64g_calculate_condition(148, (v18 & 1 ? v17 : 0x20000000), (v18 & 1 ? 0x7ffffffffffffff8 : 0), 0);
        if (!(v19 & 1))
            goto LABEL_b781ac;
    }
    else
    {
        v22 = arm64g_calculate_condition(v24, v25, v20, v21);
        v23 = arm64g_calculate_condition(144, (v22 & 1 ? v17 : 0x20000000), (v22 & 1 ? 0x7ffffffffffffff8 : 0), 0);
        if (!(v23 & 1))
        {
LABEL_b781ac:
            a1 = v17;
            a0 = sub_c6b970(0, a1);
        }
    }
    v26 = a0;
    if (v17)
    {
        v27 = a1->field_8;
        ptr = _malloc(v17);
        if (!ptr)
        {
            v33 = sub_c6b970(8, v17);
            v1 = v34;
            sub_b783f8(&v0);
            v35 = sub_c73e0c(__Unwind_Resume(v33));
            sub_c73e0c(v35);
        }
        iter = ptr;
        v0 = CONCAT(ptr, i);
        if (i)
        {
            v30 = 0;
            do
            {
                if (!v17)
                    break;
                v31 = v27;
                v32 = v31 + 16;
                if (*v31 == 12)
                {
                    *(unsigned long long *)&v2 = 12;
                }
                else
                {
                    sub_b77b5c(&v10, v27);
                    v2 = v10;
                    v3 = v11;
                    v4 = v12;
                    v5 = v13;
                }
                sub_b77b5c(&v6, v27 + 8);
                v30 += 1;
                iter[4] = v6;
                iter[5] = v7;
                iter[6] = v8;
                iter[7] = v9;
                *iter = v2;
                iter[1] = v3;
                v17 -= 128;
                iter[2] = v4;
                iter[3] = v5;
                iter += 8;
                v27 = v32;
            } while (i != v30);
        }
    }
    else
    {
        v0 = CONCAT(8, 0);
    }
    v26->field_0 = v0;
    v26->field_10 = i;
    return *(unsigned long long *)&v0;
}
