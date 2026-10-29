/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4e584..0xb4e648 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4e584_0 {
    char padding_0[8];
    struct st_b4e584_0 *field_8;
} st_b4e584_0;


st_b4e584_0 * sub_b4e584(st_b4e584_0 *a0)
{
    st_b4e584_0 *v2;  // x0
    st_b4e584_0 *v3;  // x19
    st_b4e584_0 *v4;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
    {
LABEL_b4e638:
        return 0;
    }
    v2 = sub_a6bffc(552, "providers/implementations/signature/eddsa_sig.c", 761);
    if (!v2)
        return v2;
    v3 = v2;
    _memcpy();
    v3->field_8 = 0;
    v4 = a0->field_8;
    if (v4)
    {
        if (sub_a2a930(v4))
        {
            v4 = a0->field_8;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/signature/eddsa_sig.c", 769, "eddsa_dupctx");
            sub_a36abc(57, 0xc0103, 0);
            sub_a2a8a4(0);
            sub_a6c2e4(v3, "providers/implementations/signature/eddsa_sig.c", 750);
            goto LABEL_b4e638;
        }
    }
    v3->field_8 = v4;
    return v3;
}
