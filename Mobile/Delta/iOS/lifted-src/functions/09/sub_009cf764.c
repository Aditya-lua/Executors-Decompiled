/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cf764..0x9cf830 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9cf764_0 {
    struct st_9cf764_0 *field_0;
    struct st_9cf764_0 *field_8;
} st_9cf764_0;

extern long long g_e8ac98;

st_9cf764_0 * sub_9cf764(unsigned long a0, unsigned long long a1, long long a2)
{
    st_9cf764_0 *v2;  // x0
    st_9cf764_0 *v3;  // x21
    st_9cf764_0 *v4;  // x0
    st_9cf764_0 *v5;  // x22
    unsigned long long v6;  // 4116
    st_9cf764_0 *v7;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a99624();
    if (!v2)
        return v2;
    v3 = v2;
    v4 = sub_9cde20(&g_e8ac98);
    if (v4)
    {
        v5 = v4;
        v6 = arm64g_calculate_condition(1, a1 & 0xffffffff, 1, 0);
        if (v6 & 1)
        {
            sub_9c3580(v4->field_0);
            v5->field_0 = v3;
            sub_9cf1fc(v5->field_8);
            v5->field_8 = 0;
            return v5;
        }
        if (v4->field_8 || !(v7 = sub_9cf1f0(), v4 = v5, v5->field_8 = v7, !v7))
        {
            sub_9c3580(v4->field_0);
            v5->field_0 = v3;
            if (!(unsigned int)a1)
                return v5;
            sub_9c536c(v5->field_8, a1, a2);
            return v5;
        }
        v4->field_0 = 0;
    }
    sub_9cd960();
    return 0;
}
