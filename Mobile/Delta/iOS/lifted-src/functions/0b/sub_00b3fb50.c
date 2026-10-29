/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3fb50..0xb3fc1c (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3fb50_0 {
    char padding_0[8];
    long long field_8;
} st_b3fb50_0;


st_b3fb50_0 * sub_b3fb50(unsigned long a0, unsigned int a1, unsigned long a2, unsigned int a3)
{
    unsigned int v2;  // w0
    unsigned int idx;  // x0
    st_b3fb50_0 *v4;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!(a1 & 5))
    {
        return 0;
    }
    else if (v2)
    {
        idx = sub_a6bffc(96, "providers/implementations/keymgmt/ml_kem_kmgmt.c", 735);
        if (!idx)
            return idx;
        *(unsigned int *)(idx + 16) = a1;
        *(unsigned int *)(idx + 20) = a3;
        *(unsigned long *)idx = a0;
        v4 = (st_b3fb50_0 *)idx;
        if (sub_b3eddc())
            return v4;
        if (v4[5].field_8)
        {
            sub_a66ec0(v4[5].field_8, 64);
            v4 = v4;
        }
        sub_a6c2e4(v4->field_8, "providers/implementations/keymgmt/ml_kem_kmgmt.c", 811);
        sub_a6c2e4(v4, "providers/implementations/keymgmt/ml_kem_kmgmt.c", 812);
        return 0;
    }
    else
    {
        return 0;
    }
}
