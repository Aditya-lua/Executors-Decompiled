/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb53498..0xb5355c (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b53498_1 {
    char padding_0[8];
    long long field_8;
    char padding_10[320];
    struct st_b53498_0 *field_150;
} st_b53498_1;

typedef struct st_b53498_0 {
    char padding_0[8];
    struct st_b53498_0 *field_8;
    char padding_10[264];
    char field_118;
    char padding_119[55];
    struct st_b53498_0 *field_150;
} st_b53498_0;


st_b53498_0 * sub_b53498(st_b53498_1 *a0)
{
    st_b53498_0 *v2;  // x19
    st_b53498_0 *v3;  // x0
    st_b53498_0 *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6dac4(a0, 616, "providers/implementations/signature/slh_dsa_sig.c", 0x66);
    if (!v2)
        return v2;
    v2->field_150 = 0;
    v2->field_8 = 0;
    if (!a0->field_150 || (v3 = sub_a6d9b4(a0->field_150, "providers/implementations/signature/slh_dsa_sig.c", 107), v2->field_150 = v3, v3))
    {
        v4 = sub_ac3790(a0->field_8);
        v2->field_8 = v4;
        if (v4)
            return v2;
    }
    sub_ac3738();
    sub_a6c2e4(v2->field_150, "providers/implementations/signature/slh_dsa_sig.c", 63);
    sub_a66ec0(&v2->field_118, 32);
    sub_a6c2e4(v2, "providers/implementations/signature/slh_dsa_sig.c", 65);
    return 0;
}
