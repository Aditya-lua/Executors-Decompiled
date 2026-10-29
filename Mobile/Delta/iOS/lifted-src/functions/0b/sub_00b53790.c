/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb53790..0xb53860 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b53790_0 {
    char padding_0[8];
    long long field_8;
    char padding_10[264];
    char field_118;
    char padding_119[47];
    unsigned long long field_148;
    struct st_b53790_0 *field_150;
    unsigned long long field_158;
} st_b53790_0;


st_b53790_0 * sub_b53790(long long a0, unsigned long a1, st_b53790_0 *a2)
{
    st_b53790_0 *v2;  // x19
    st_b53790_0 *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(616, "providers/implementations/signature/slh_dsa_sig.c", 75);
    if (!v2)
        return v2;
    v2->field_148 = sub_9f2aec(a0);
    if (!a2 || !(v3 = sub_a6d9b4(a2, "providers/implementations/signature/slh_dsa_sig.c", 80), v2->field_150 = v3, !v3))
    {
        v2->field_158 = a1;
        *(unsigned int *)&v2->padding_119[39] = 1;
        return v2;
    }
    sub_ac3738(v2->field_8);
    sub_a6c2e4(0, "providers/implementations/signature/slh_dsa_sig.c", 63);
    sub_a66ec0(&v2->field_118, 32);
    sub_a6c2e4(v2, "providers/implementations/signature/slh_dsa_sig.c", 65);
    return 0;
}
