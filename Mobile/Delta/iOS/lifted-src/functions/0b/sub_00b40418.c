/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb40418..0xb404c0 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b40418_0 {
    struct st_b40418_0 *field_0;
    struct st_b40418_0 *field_8;
    long long field_10;
} st_b40418_0;


st_b40418_0 * sub_b40418(st_b40418_0 *a0, st_b40418_0 *a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_b40418_0 *v12;  // x0
    st_b40418_0 *v13;  // x0
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0)
        return a0;
    if (!a1 || !a1->field_0)
        return 1;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = sub_a6fbc4(a1, "properties");
    if (!v12)
        return 1;
    if ((int)v12->field_8 == 4)
    {
        sub_a6c2e4(a0->field_8, "providers/implementations/keymgmt/mlx_kmgmt.c", 653);
        v13 = sub_a6d9b4(v12->field_10, "providers/implementations/keymgmt/mlx_kmgmt.c", 654);
        a0->field_8 = v13;
        if (!v13)
            return v13;
    }
    else
    {
        return 0;
    }
    return 1;
    return 1;
}
