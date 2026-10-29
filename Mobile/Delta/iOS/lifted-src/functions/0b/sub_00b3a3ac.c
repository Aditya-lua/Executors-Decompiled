/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3a3ac..0xb3a440 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3a3ac_0 {
    char padding_0[128];
    struct st_b3a3ac_0 *field_80;
} st_b3a3ac_0;


st_b3a3ac_0 * sub_b3a3ac(st_b3a3ac_0 *a0, st_b3a3ac_0 *a1)
{
    st_b3a3ac_0 *v2;  // w0
    st_b3a3ac_0 *v3;  // x0
    st_b3a3ac_0 *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (st_b3a3ac_0 *)(unsigned int)sub_a2f9e0();
    if (!a1)
    {
        return 0;
    }
    else if (!a0)
    {
        return 0;
    }
    else if (v2)
    {
        v3 = sub_9ffdd0(a1);
        if (!v3)
            return v3;
        v4 = sub_a1a70c();
        if (!v4)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/keymgmt/ec_kmgmt.c", 1017, "ec_gen_set_group");
            sub_a36abc(57, 176, 0);
            return 0;
        }
        sub_a1a174(a0->field_80);
        a0->field_80 = v4;
        return 1;
    }
    else
    {
        return 0;
    }
}
