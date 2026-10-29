/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4b028..0xb4b158 (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4b028_0 {
    struct st_b4b028_0 *field_0;
} st_b4b028_0;


st_b4b028_0 ** sub_b4b028(st_b4b028_0 **a0, st_b4b028_0 **a1)
{
    st_b4b028_0 **v4;  // w0
    st_b4b028_0 **v5;  // w0
    st_b4b028_0 **v6;  // w0
    st_b4b028_0 **v7;  // w0
    st_b4b028_0 **v8;  // w0
    st_b4b028_0 **v0;  // [bp-0x30]
    st_b4b028_0 **v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = 0;
    v1 = 0;
    if (!a1 || !*a1)
        return 1;
    if (sub_a6fbc4(a1, "strength"))
    {
        v4 = (st_b4b028_0 **)(unsigned int)sub_a6ffcc();
        if (!v4)
            return v4;
    }
    if (sub_a6fbc4(a1, "test_entropy"))
    {
        v5 = (st_b4b028_0 **)(unsigned int)sub_a71440();
        if (!v5)
            return v5;
        sub_a6c2e4(a0[4], "providers/implementations/rands/test_rng.c", 244);
        a0[4] = v1;
        a0[6] = v0;
        a0[7] = 0;
        v1 = 0;
    }
    if (sub_a6fbc4(a1, "test_nonce"))
    {
        v6 = (st_b4b028_0 **)(unsigned int)sub_a71440();
        if (!v6)
            return v6;
        sub_a6c2e4(a0[5], "providers/implementations/rands/test_rng.c", 0xff);
        a0[5] = v1;
        a0[8] = v0;
    }
    if (sub_a6fbc4(a1, "max_request"))
    {
        v7 = (st_b4b028_0 **)(unsigned int)sub_a70ef8();
        if (!v7)
            return v7;
    }
    if (sub_a6fbc4(a1, "generate"))
    {
        v8 = (st_b4b028_0 **)(unsigned int)sub_a6ffcc();
        if (!v8)
            return v8;
    }
    return 1;
}
