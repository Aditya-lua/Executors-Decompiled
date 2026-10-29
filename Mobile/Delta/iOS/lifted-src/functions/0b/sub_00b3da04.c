/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3da04..0xb3daac (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3da04_0 {
    char padding_0[16];
    struct st_b3da04_0 *field_10;
    char padding_18[8];
    struct st_b3da04_0 *field_20;
    char padding_28[8];
    struct st_b3da04_0 *field_30;
} st_b3da04_0;


st_b3da04_0 * sub_b3da04(st_b3da04_0 *a0, long long a1, long long a2)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_b3da04_0 *v12;  // x0
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    if (a0->field_10)
    {
        v12 = sub_a6f968(a1, a2, "priv");
        if (!(unsigned int)v12)
            return v12;
    }
    if (a0->field_20)
    {
        v12 = sub_a6f90c(a1, a2, "cipher", sub_a509dc(a0->field_20));
        if (!(unsigned int)v12)
            return v12;
    }
    if (!a0->field_30)
        return 1;
    v12 = sub_a6f90c(a1, a2, "engine", sub_954340(a0->field_30));
    if (!(unsigned int)v12)
        return v12;
    return 1;
}
