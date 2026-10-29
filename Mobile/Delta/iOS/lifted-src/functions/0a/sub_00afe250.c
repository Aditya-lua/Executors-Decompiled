/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafe250..0xafe4cc (636 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_afe250_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[4];
    struct st_afe250_0 *field_10;
} st_afe250_0;

typedef struct st_afe250_1 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
} st_afe250_1;

extern char g_10002b0;

st_afe250_0 * sub_afe250(long long a0, st_afe250_0 *a1, st_afe250_0 *a2, st_afe250_0 *a3, st_afe250_0 *a4, st_afe250_0 *a5, st_afe250_0 *a6, long long a7)
{
    st_afe250_0 *v8;  // x22
    st_afe250_0 *v9;  // x24
    st_afe250_0 *v10;  // x0
    st_afe250_0 *v11;  // x0
    st_afe250_0 *v12;  // x0
    st_afe250_0 *v13;  // x0
    st_afe250_1 *iter;  // x25
    uint128_t v0;  // [bp-0x180]
    uint128_t v1;  // [bp-0x170]
    unsigned long v2;  // [bp-0x160]
    char v3;  // [bp-0x158]
    unsigned long v5;  // [bp-0x68]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v8 = a4;
    v9 = a2;
    v5 = *(long long *)&g_10002b0;
    if (a1)
    {
        if (a3)
        {
            if (!v9)
                goto LABEL_afe2f0;
            goto LABEL_afe2a4;
        }
        else
        {
            v10 = sub_a6fbc4(a1, "digest");
            if (v10)
            {
                if (v10->field_8 != 4)
                {
                    if (*(long long *)&g_10002b0 == v5)
                        return 0;
                    ___stack_chk_fail();
                }
                a3 = v10->field_10;
                if (!v9)
                    goto LABEL_afe2f0;
LABEL_afe2a4:
                if (!v8)
                    goto LABEL_afe334;
            }
            else
            {
                a3 = 0;
                if (v9)
                    goto LABEL_afe2a4;
LABEL_afe2f0:
                v11 = sub_a6fbc4(a1, "cipher");
                if (!v11)
                {
                    v9 = 0;
                }
                else if (v11->field_8 == 4)
                {
                    v9 = v11->field_10;
                }
                else
                {
                    if (*(long long *)&g_10002b0 == v5)
                        return 0;
                    ___stack_chk_fail();
                }
                if (!v8)
                {
LABEL_afe334:
                    v12 = sub_a6fbc4(a1, "engine");
                    if (!v12)
                    {
                        v8 = 0;
                    }
                    else if (v12->field_8 == 4)
                    {
                        v8 = v12->field_10;
                    }
                    else
                    {
                        if (*(long long *)&g_10002b0 == v5)
                            return 0;
                        ___stack_chk_fail();
                    }
                }
            }
        }
    }
    iter = &v3;
    if (a3)
    {
        iter = &v3 + 40;
        sub_a71618("digest", a3, 0);
    }
    if (v9)
    {
        sub_a71618("cipher", v9, 0);
        iter->field_0 = v0;
        iter->field_10 = v1;
        iter->field_20 = v2;
        iter += 1;
    }
    if (a5)
    {
        sub_a71618("properties", a5, 0);
        iter->field_20 = v2;
        iter->field_0 = v0;
        iter->field_10 = v1;
        iter += 1;
    }
    if (v8)
    {
        sub_a71618("engine", v8, 0);
        iter->field_20 = v2;
        iter->field_0 = v0;
        iter->field_10 = v1;
        iter += 1;
    }
    if (a6)
    {
        sub_a71670("key", a6, a7);
        iter->field_20 = v2;
        iter->field_0 = v0;
        iter->field_10 = v1;
        iter += 1;
    }
    sub_a71bbc();
    iter->field_20 = v2;
    iter->field_0 = v0;
    iter->field_10 = v1;
    v13 = sub_a58410(a0, &v3);
    if (*(long long *)&g_10002b0 == v5)
        return v13;
    ___stack_chk_fail();
}
