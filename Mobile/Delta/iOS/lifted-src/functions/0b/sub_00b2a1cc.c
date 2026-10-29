/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2a1cc..0xb2a234 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2a1cc_0 {
    char padding_0[16];
    struct st_b2a1cc_0 *field_10;
} st_b2a1cc_0;


st_b2a1cc_0 * sub_b2a1cc(st_b2a1cc_0 *a0, st_b2a1cc_0 *a1, unsigned long a2)
{
    st_b2a1cc_0 *v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (st_b2a1cc_0 *)(unsigned int)sub_a2f9e0();
    if (!a1)
    {
        return 0;
    }
    else if (!a0)
    {
        return 0;
    }
    else if (!v2)
    {
        return 0;
    }
    else if (sub_b3cf38(a1))
    {
        a0->field_10 = a1;
    }
    else
    {
        return 0;
    }
}
