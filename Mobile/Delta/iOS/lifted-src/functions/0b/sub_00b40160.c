/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb40160..0xb402b4 (340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b40160_2 {
    char padding_0[16];
    unsigned long long field_10;
} st_b40160_2;

typedef struct st_b40160_1 {
    char padding_0[24];
    unsigned long long field_18;
} st_b40160_1;

typedef struct st_b40160_4 {
    struct st_b40160_0 *field_0;
    struct st_b40160_1 *field_8;
    struct st_b40160_2 *field_10;
    char padding_18[16];
    struct st_b40160_0 *field_28;
} st_b40160_4;

typedef struct st_b40160_3 {
    char padding_0[8];
    struct st_b40160_0 *field_8;
    struct st_b40160_1 *field_10;
    struct st_b40160_2 *field_18;
    char padding_20[16];
    struct st_b40160_0 *field_30;
} st_b40160_3;

typedef struct st_b40160_0 {
    struct st_b40160_0 *field_0;
} st_b40160_0;


st_b40160_0 ** sub_b40160(st_b40160_3 *a0, st_b40160_0 **a1)
{
    st_b40160_0 **v4;  // x2
    long long v5;  // x1
    st_b40160_0 **v6;  // x0
    st_b40160_0 **v7;  // x0
    st_b40160_4 *v8;  // x21
    st_b40160_0 **v9;  // x0
    st_b40160_0 **v0;  // [bp-0x40]
    st_b40160_0 **v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = 0;
    v1 = 0;
    if (!a1 || !*a1 || !sub_a6fbc4(a1, "encoded-pub-key"))
        return 1;
    if ((int)a0->field_30)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/keymgmt/mlx_kmgmt.c", 614, "mlx_kem_set_params");
        v4 = "keys cannot be mutated";
        v5 = 178;
    }
    else
    {
        v6 = sub_a71cdc();
        if (!(unsigned int)v6)
            return v6;
        v7 = sub_a6fbc4(a1, "properties");
        if (v7)
        {
            v8 = &a0->field_8;
            sub_a6c2e4(a0->field_8, "providers/implementations/keymgmt/mlx_kmgmt.c", 625);
            v8->field_0 = 0;
            v9 = sub_a71220(v7, v8, 0);
            if (!(unsigned int)v9)
                return v9;
        }
        if (v0 == a0->field_18->field_10 + a0->field_10->field_18)
            return sub_b41168(a0, v1);
        sub_a368c8();
        sub_a369bc("providers/implementations/keymgmt/mlx_kmgmt.c", 632, "mlx_kem_set_params");
        v5 = 158;
        v4 = 0;
    }
    sub_a36abc(57, v5, v4);
    return 0;
    return 1;
}
