/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3fdcc..0xb3fe6c (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3fdcc_0 {
    struct st_b3fdcc_0 *field_0;
    struct st_b3fdcc_0 *field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    struct st_b3fdcc_0 *field_20;
    struct st_b3fdcc_0 *field_28;
    struct st_b3fdcc_0 *field_30;
} st_b3fdcc_0;

extern char g_eea930;

st_b3fdcc_0 * sub_b3fdcc(st_b3fdcc_0 *a0)
{
    st_b3fdcc_0 *v2;  // x0
    st_b3fdcc_0 *v3;  // x0
    unsigned long long v4;  // x0
    st_b3fdcc_0 *v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0)
    {
        v2 = sub_9f2aec();
        if (sub_a2f9e0(v2))
            goto LABEL_b3fdfc;
    }
    else
    {
        v2 = 0;
        if (sub_a2f9e0())
        {
LABEL_b3fdfc:
            v3 = sub_a6bf4c(56, "providers/implementations/keymgmt/mlx_kmgmt.c", 83);
            if (v3)
            {
                v3->field_0 = v2;
                v4 = sub_a82b74(1455);
                v5 = v3;
                v5->field_20 = 0;
                v5->field_28 = 0;
                v5->field_10 = v4;
                v5->field_18 = &g_eea930;
                *(unsigned int *)&v5->field_30 = 0;
                v5->field_8 = 0;
                return v5;
            }
        }
    }
    sub_a6c2e4(0, "providers/implementations/keymgmt/mlx_kmgmt.c", 96);
    return 0;
}
