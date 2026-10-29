/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb413dc..0xb414e4 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b413dc_0 {
    char padding_0[8];
    unsigned int field_8;
} st_b413dc_0;


st_b413dc_0 * sub_b413dc(unsigned int a0, unsigned long a1, unsigned int a2, unsigned int a3)
{
    unsigned int v2;  // w0
    unsigned int idx;  // x0
    st_b413dc_0 *v4;  // x19
    unsigned int v5;  // x0
    unsigned int v6;  // x0
    unsigned int v7;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!(a2 & 5))
    {
        return 0;
    }
    else if (v2)
    {
        idx = sub_a6bffc(24, "providers/implementations/keymgmt/mlx_kmgmt.c", 671);
        if (!idx)
            return idx;
        *(unsigned long *)idx = a1;
        *(unsigned int *)(idx + 16) = a2;
        *(unsigned int *)(idx + 20) = a0;
        if (!a3)
        {
            return idx;
        }
        else if (*(long long *)a3)
        {
            v4 = (st_b413dc_0 *)idx;
            v5 = sub_a6fbc4(a3, "properties");
            if (!v5)
                return v4;
            v6 = *(long long *)&v4->field_8;
            if (*(int *)(v5 + 8) == 4)
            {
                sub_a6c2e4(v6, "providers/implementations/keymgmt/mlx_kmgmt.c", 653);
                v7 = sub_a6d9b4(*(long long *)(v5 + 16), "providers/implementations/keymgmt/mlx_kmgmt.c", 654);
                *(unsigned long long *)&v4->field_8 = v7;
                if (v7)
                    return v4;
                v6 = 0;
            }
            sub_a6c2e4(v6, "providers/implementations/keymgmt/mlx_kmgmt.c", 735);
            sub_a6c2e4(v4, "providers/implementations/keymgmt/mlx_kmgmt.c", 736);
            return 0;
        }
        else
        {
            return idx;
        }
    }
    else
    {
        return 0;
    }
}
