/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad606c..0xad61b4 (328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad606c_0 {
    struct st_ad606c_0 *field_0;
    char field_1;
    char padding_2[6];
    struct st_ad606c_0 *field_8;
    struct st_ad606c_0 *field_10;
    struct st_ad606c_0 *field_14;
    struct st_ad606c_0 *field_18;
} st_ad606c_0;


st_ad606c_0 * sub_ad606c(st_ad606c_0 *a0, unsigned long long *a1, unsigned long a2)
{
    st_ad606c_0 *v2;  // x19
    uint128_t v3;  // q1
    st_ad606c_0 *v4;  // w8
    st_ad606c_0 *v5;  // x0
    st_ad606c_0 *v6;  // x24
    st_ad606c_0 *v7;  // x25
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bf4c(32, "crypto/stack/stack.c", 90);
    if (!v2)
        return v2;
    if (a0)
    {
        v3 = *(int128_t *)&a0->field_8;
        *(int128_t *)&v2->field_0 = *(int128_t *)&a0->field_0;
        *(uint128_t *)&v2->field_8 = v3;
        v4 = (st_ad606c_0 *)(int)a0->field_0;
        if (v4)
        {
            if (4 >= v4)
                v4 = (st_ad606c_0 *)4;
            *(unsigned int *)((char *)&v2->field_8 + 4) = (unsigned int)v4;
            v5 = sub_a6bffc();
            *(st_ad606c_0 **)&v2->field_1 = v5;
            if (!v5)
            {
                sub_a6c2e4(v5, "crypto/stack/stack.c", 448);
                sub_a6c2e4(v2, "crypto/stack/stack.c", 449);
                return 0;
            }
            v6 = (int)v2->field_0;
            if ((int)(unsigned int)v6 < 1)
                return v2;
            v7 = 0;
            while (1)
            {
                if (*(long long *)(*(long long *)&a0->field_1 + v7 * 8))
                    a1();
                v7 = (char *)&v7->field_0 + 1;
                if (v6 <= v7)
                    return v2;
            }
        }
    }
    else
    {
        *(unsigned int *)&v2->field_0 = 0;
        *(unsigned int *)&v2->field_8 = 0;
        v2->field_10 = 0;
    }
    *(unsigned long long *)&v2->field_1 = 0;
    *(unsigned int *)((char *)&v2->field_8 + 4) = 0;
    return v2;
}
