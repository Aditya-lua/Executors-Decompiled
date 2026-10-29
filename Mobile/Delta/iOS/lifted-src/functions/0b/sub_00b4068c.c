/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4068c..0xb40828 (412 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4068c_0 {
    char padding_0[8];
    struct st_b4068c_0 *field_8;
    char padding_10[16];
    unsigned long long field_20;
    struct st_b4068c_0 *field_28;
    struct st_b4068c_0 *field_30;
} st_b4068c_0;


st_b4068c_0 * sub_b4068c(st_b4068c_0 **a0, unsigned int a1)
{
    st_b4068c_0 *v2;  // x0
    st_b4068c_0 **v3;  // x21
    st_b4068c_0 *v4;  // x8
    st_b4068c_0 *v6;  // x8
    long long *v7;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6dac4(a0, 56, "providers/implementations/keymgmt/mlx_kmgmt.c", 745);
    if (!v2)
        return v2;
    v3 = v2;
    v3[4] = 0;
    v3[5] = 0;
    if (!a0[1] || (v4 = sub_a6d9b4(a0[1], "providers/implementations/keymgmt/mlx_kmgmt.c", 751), v2 = v2, v2->field_8 = v4, v4))
    {
        if (a0[4])
        {
            switch (a1 & 3)
            {
            case 3:
                v2 = v2;
                v2->field_20 = sub_a5bbc8(a0[4]);
                v6 = sub_a5bbc8(a0[5]);
                v2->field_28 = v6;
                if (v6 && v3[4])
                    return v2;
                break;
            case 0:
                *(unsigned int *)&v2->field_30 = 0;
                return v2;
            default:
                sub_a368c8();
                sub_a369bc("providers/implementations/keymgmt/mlx_kmgmt.c", 777, "mlx_kem_dup");
                sub_a36abc(57, 250, "duplication of partial key material not supported");
                break;
            }
            v7 = v2;
            sub_a6c2e4(v2->field_8, "providers/implementations/keymgmt/mlx_kmgmt.c", 0x44);
            sub_a5a4c8(v7[4]);
            sub_a5a4c8(v7[5]);
        }
        else if (a0[5])
        {
            sub_a6c2e4(v2->field_8, "providers/implementations/keymgmt/mlx_kmgmt.c", 761);
        }
        else
        {
            return v2;
        }
    }
    sub_a6c2e4();
    return 0;
}
