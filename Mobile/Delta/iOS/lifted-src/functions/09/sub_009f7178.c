/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f7178..0x9f7234 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f7178_0 {
    char padding_0[24];
    unsigned long long field_18;
    unsigned long long field_20;
    struct st_9f7178_0 *field_28;
} st_9f7178_0;


st_9f7178_0 * sub_9f7178(unsigned long a0, st_9f7178_0 *a1)
{
    st_9f7178_0 *v2;  // x19
    st_9f7178_0 *v3;  // x0
    unsigned long long v4;  // x0
    unsigned long long v5;  // x8
    unsigned long long v6;  // 4116
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(48, "crypto/ct/ct_policy.c", 31);
    if (!v2)
        return v2;
    v2->field_20 = a0;
    if (a1)
    {
        v3 = sub_a6d9b4(a1, "crypto/ct/ct_policy.c", 39);
        v2->field_28 = v3;
        if (!v3)
        {
            sub_a6c2e4(v2, "crypto/ct/ct_policy.c", 41);
            return 0;
        }
    }
    v4 = sub_a7c2c0();
    v5 = v4 + 300000000000;
    v6 = arm64g_calculate_condition(50, v4, 300000000000, 0);
    if (!(v6 & 1))
        v5 = 0xffffffffffffffff;
    v2->field_18 = v5 / 1000000;
    return v2;
}
