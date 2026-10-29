/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb368c0..0xb36998 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b368c0_0 {
    struct st_b368c0_0 *field_0;
    unsigned int field_8;
    char padding_c[4];
    struct st_b368c0_0 *field_10;
    struct st_b368c0_0 *field_18;
    struct st_b368c0_0 *field_20;
    struct st_b368c0_0 *field_28;
    struct st_b368c0_0 *field_30;
} st_b368c0_0;


st_b368c0_0 * sub_b368c0(st_b368c0_0 *a0, st_b368c0_0 *a1)
{
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    unsigned long long v9;  // x30
    st_b368c0_0 *v10;  // x0
    st_b368c0_0 *v11;  // x0
    st_b368c0_0 *v12;  // x0
    st_b368c0_0 *v13;  // x0
    st_b368c0_0 *v0;  // [bp-0x30]
    st_b368c0_0 *v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0)
        return a0;
    if (!a1 || !a1->field_0)
        return 1;
    v2 = v7;
    v3 = v8;
    v4 = &v6;
    v5 = v9;
    v10 = sub_a6fbc4(a1, "ikme");
    if (v10)
    {
        v0 = 0;
        v1 = 0;
        if (v10->field_10 && v10->field_18)
        {
            v11 = sub_a71440();
            if (!(unsigned int)v11)
                return v11;
        }
        sub_a6c4e8(a0->field_28, a0->field_30, "providers/implementations/kem/ecx_kem.c", 264);
        a0->field_28 = v1;
        a0->field_30 = v0;
    }
    v12 = sub_a6fbc4(a1, "operation");
    if (!v12)
        return 1;
    if (v12->field_8 == 4)
    {
        v13 = sub_b36d98(v12->field_10);
        if (!(unsigned int)v13)
            return v13;
        *(unsigned int *)&a0->field_20 = (unsigned int)v13;
    }
    else
    {
        return 0;
    }
    return 1;
    return 1;
}
