/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5b7c4..0xa5b948 (388 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5b7c4_0 {
    unsigned long long field_0;
    char padding_8[168];
    struct st_a5b7c4_0 *field_b0;
} st_a5b7c4_0;

extern char g_10002b0;

st_a5b7c4_0 * sub_a5b7c4(st_a5b7c4_0 **a0, st_a5b7c4_0 **a1)
{
    st_a5b7c4_0 *v11;  // x0
    st_a5b7c4_0 *v13;  // x0
    unsigned long long v14;  // 4110
    st_a5b7c4_0 *v15;  // x21
    st_a5b7c4_0 *v16;  // x1
    st_a5b7c4_0 *v17;  // x2
    uint128_t v0;  // [bp-0xb0]
    uint128_t v1;  // [bp-0xa0]
    unsigned long long v2;  // [bp-0x90]
    char v3;  // [bp-0x88]
    st_a5b7c4_0 *v4;  // [bp-0x68]
    uint128_t v5;  // [bp-0x60]
    uint128_t v6;  // [bp-0x50]
    unsigned long long v7;  // [bp-0x40]
    unsigned long v8;  // [bp-0x38]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v8 = *(long long *)&g_10002b0;
    v11 = a0;
    if (v11)
    {
        if (a0[12])
        {
            sub_a71bbc(sub_a71670("encoded-pub-key", 0, 0), 0, 0);
            v5 = v0;
            v6 = v1;
            v7 = v2;
            if (!sub_a5bfbc(a0, &v3) || !sub_a6fc18(&v3) || (v13 = v4, v14 = arm64g_calculate_condition(2, v13, 1, 0), v14 & 1))
                goto LABEL_a5b914;
            *a1 = 0;
            v15 = v13;
            v11 = sub_a6bf4c(v13, "crypto/evp/p_lib.c", 1474);
            if (v11)
            {
                v16 = v11;
                v17 = v15;
                sub_a71bbc(sub_a71670("encoded-pub-key", v16, v17), v16, v17);
                v5 = v0;
                v6 = v1;
                v7 = v2;
                if (sub_a5bfbc(a0, &v3) && sub_a6fc18(&v3))
                {
                    *a1 = v16;
                    v11 = v15;
                }
                else
                {
                    sub_a6c2e4(v16, "crypto/evp/p_lib.c", 1481);
LABEL_a5b914:
                    v11 = 0;
                }
            }
        }
        else
        {
            if (a0[1] && a0[1]->field_b0)
                a0[1]->field_b0();
            goto LABEL_a5b914;
        }
    }
    if (*(long long *)&g_10002b0 == v8)
        return v11;
    ___stack_chk_fail();
}
