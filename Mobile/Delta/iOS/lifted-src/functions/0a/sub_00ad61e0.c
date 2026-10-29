/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad61e0..0xad6270 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad61e0_0 {
    char padding_0[8];
    long long field_8;
    char padding_10[8];
    unsigned long long field_18;
} st_ad61e0_0;


st_ad61e0_0 * sub_ad61e0(unsigned long a0, int a1)
{
    st_ad61e0_0 *v2;  // x0
    st_ad61e0_0 *v3;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(32, "crypto/stack/stack.c", 229);
    if (!v2)
        return v2;
    v2->field_18 = a0;
    if (a1 < 1)
        return v2;
    v3 = v2;
    if (!sub_ad62a8())
    {
        sub_a6c2e4(v3->field_8, "crypto/stack/stack.c", 448);
        sub_a6c2e4(v3, "crypto/stack/stack.c", 449);
        return 0;
    }
    return v3;
}
