/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2faa0..0xb2fba8 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2faa0_1 {
    long long field_0;
    char field_8;
    char padding_9[23];
    struct st_b2faa0_0 *field_20;
    struct st_b2faa0_0 *field_28;
    struct st_b2faa0_0 *field_30;
    struct st_b2faa0_0 *field_38;
} st_b2faa0_1;

typedef struct st_b2faa0_0 {
    struct st_b2faa0_0 *field_0;
} st_b2faa0_0;


unsigned long long sub_b2faa0(st_b2faa0_1 *a0, st_b2faa0_0 **a1)
{
    long long v2;  // x0
    unsigned long long v3;  // x0
    st_b2faa0_0 **v4;  // x0
    st_b2faa0_0 **v5;  // x23
    st_b2faa0_0 **v6;  // x23
    unsigned long long v7;  // x0
    st_b2faa0_0 **v8;  // x0
    st_b2faa0_0 **v9;  // x21
    st_b2faa0_0 **v10;  // x21
    unsigned long long v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9f2aec(a0->field_0);
    if (!a1 || !*a1)
        return 1;
    v3 = sub_afde7c(&a0->field_8, a1, v2);
    if (!(unsigned int)v3)
        return v3;
    v4 = sub_a6fbc4(a1, "key");
    if (v4)
    {
        v5 = &a0->field_20;
        v6 = v5 + 1;
        sub_a6c4e8(a0->field_20, v5[1], "providers/implementations/kdfs/krb5kdf.c", 98);
        *v6 = 0;
        *v5 = 0;
        v7 = sub_a71440(v4, v5, 0, v6);
        if (!(unsigned int)v7)
            return v7;
    }
    v8 = sub_a6fbc4(a1, "constant");
    if (v8)
    {
        v9 = &a0->field_30;
        v10 = v9 + 1;
        sub_a6c4e8(a0->field_30, v9[1], "providers/implementations/kdfs/krb5kdf.c", 98);
        *v10 = 0;
        *v9 = 0;
        v11 = sub_a71440(v8, v9, 0, v10);
        if (!(unsigned int)v11)
            return v11;
    }
    return 1;
}
