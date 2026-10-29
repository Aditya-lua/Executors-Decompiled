/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb59c00..0xb59ca4 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b59c00_0 {
    struct st_b59c00_0 *field_0;
} st_b59c00_0;


st_b59c00_0 ** sub_b59c00(st_b59c00_0 **a0, st_b59c00_0 **a1)
{
    st_b59c00_0 **v2;  // w0
    st_b59c00_0 **v3;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (st_b59c00_0 **)(unsigned int)sub_a2f9e0();
    if (!v2)
        return v2;
    v3 = (st_b59c00_0 **)(unsigned int)sub_a7d998(a0);
    if (!a0)
    {
        return 0;
    }
    else if (v3)
    {
        if (!a1 || !*a1 || !sub_a6fbc4(a1, "pad-type") || sub_a6ffcc())
            return 1;
        sub_a368c8();
        sub_a369bc("providers/implementations/digests/mdc2_prov.c", 0x33, "mdc2_set_ctx_params");
        sub_a36abc(57, 103, 0);
        return 0;
        return 1;
    }
    else
    {
        return 0;
    }
}
