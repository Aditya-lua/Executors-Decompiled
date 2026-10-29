/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa607a0..0xa60850 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a607a0_0 {
    char padding_0[1];
    char field_1;
    char padding_2[22];
    long long field_18;
    long long field_20;
    long long field_28;
} st_a607a0_0;

extern st_a607a0_0 g_e9f8a0;

st_a607a0_0 * sub_a607a0(long long a0, st_a607a0_0 *a1, long long a2)
{
    st_a607a0_0 *v2;  // x23
    unsigned long long v3;  // x25
    st_a607a0_0 *v4;  // x22
    unsigned long long v5;  // x25
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = 0;
    v3 = 14;
    v4 = &g_e9f8a0.padding_0[0];
    while (1)
    {
        v5 = v3;
        if (!sub_9e5528(a0, v4->field_18) && !sub_9e5528(a2, v4->field_28))
        {
            if (!a1)
            {
                return &g_e9f8a0.padding_0[0] + 0x30 * v2;
            }
            else if (!sub_9e5528(a1, v4->field_20))
            {
                return v4;
            }
        }
        v2 = &v2->field_1;
        v4 += 1;
        v3 = v5 - 1;
        if (v5 == 1)
            return 0;
    }
}
