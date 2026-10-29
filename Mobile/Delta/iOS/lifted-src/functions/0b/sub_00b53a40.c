/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb53a40..0xb53ae8 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b53a40_0 {
    char padding_0[16];
    struct st_b53a40_0 *field_10;
} st_b53a40_0;


st_b53a40_0 * sub_b53a40(st_b53a40_0 *a0, st_b53a40_0 *a1, unsigned long a2)
{
    st_b53a40_0 *v2;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (st_b53a40_0 *)(unsigned int)sub_a2f9e0();
    if (!a0)
    {
        return 0;
    }
    else if (!v2)
    {
        return 0;
    }
    else if (a1)
    {
        if (sub_a18cf0(a1))
        {
            sub_a18c08(a0->field_10);
            a0->field_10 = a1;
        }
        else
        {
            return 0;
        }
    }
    else
    {
        if (!a0->field_10)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/signature/sm2_sig.c", 147, "sm2sig_signature_init");
            sub_a36abc(57, 114, 0);
            return 0;
        }
    }
}
