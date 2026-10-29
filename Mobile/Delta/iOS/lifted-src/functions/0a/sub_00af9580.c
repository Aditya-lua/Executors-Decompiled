/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf9580..0xaf961c (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af9580_0 {
    struct st_af9580_0 *field_0;
    long long field_8;
} st_af9580_0;

extern long long g_eba490;

st_af9580_0 * sub_af9580(unsigned long a0, long long a1, long long a2)
{
    st_af9580_0 *v2;  // x0
    st_af9580_0 *v3;  // x0
    st_af9580_0 *v4;  // x21
    st_af9580_0 *v5;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a99624();
    if (!v2)
        return v2;
    v3 = sub_9cde20(&g_eba490);
    if (!v3)
        return v3;
    v4 = v3;
    v3->field_0 = v2;
    v5 = sub_9cf1f0();
    if (v5 && sub_ad68a0(v4->field_8, v5))
    {
        sub_9c536c(v5, a1, a2);
        return v4;
    }
    sub_9cd960(v4, &g_eba490);
    sub_9cf1fc(v5);
    return 0;
}
