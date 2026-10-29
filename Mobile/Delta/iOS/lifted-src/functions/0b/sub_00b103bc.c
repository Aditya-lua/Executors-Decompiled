/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb103bc..0xb1044c (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b103bc_0 {
    struct st_b103bc_0 *field_0;
    unsigned int field_8;
    char padding_c[4];
    long long field_10;
    unsigned int field_18;
} st_b103bc_0;


st_b103bc_0 * sub_b103bc(st_b103bc_0 *a0, st_b103bc_0 *a1)
{
    st_b103bc_0 *v2;  // x0
    st_b103bc_0 *v3;  // w0
    st_b103bc_0 *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!(unsigned int)v2)
        return v2;
    v3 = (st_b103bc_0 *)(unsigned int)sub_a7d734(a0);
    if (!a0)
    {
        return 0;
    }
    else if (v3)
    {
        if (!a1 || !a1->field_0)
            return 1;
        v4 = sub_a6fbc4(a1, "ssl3-ms");
        if (v4 && v4->field_8 == 5)
            return sub_a7d7f4(a0, 29, v4->field_18, v4->field_10) != 0;
        return 1;
    }
    else
    {
        return 0;
    }
}
