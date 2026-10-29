/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4dab0..0xb4db74 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4dab0_0 {
    char padding_0[16];
    struct st_b4dab0_0 *field_10;
    unsigned int field_18;
} st_b4dab0_0;


st_b4dab0_0 * sub_b4dab0(st_b4dab0_0 *a0, st_b4dab0_0 *a1, unsigned long long *a2, unsigned long a3, unsigned int a4)
{
    st_b4dab0_0 *v2;  // w0
    st_b4dab0_0 *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (st_b4dab0_0 *)(unsigned int)sub_a2f9e0();
    if (!a0)
    {
        return 0;
    }
    else if (v2)
    {
        if (a1)
        {
            v3 = sub_a18cf0(a1);
            if (!(unsigned int)v3)
                return v3;
            sub_a18c08(a0->field_10);
            a0->field_10 = a1;
        }
        else if (!a0->field_10)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/signature/ecdsa_sig.c", 282, "ecdsa_signverify_init");
            sub_a36abc(57, 114, 0);
            return 0;
        }
        a0->field_18 = a4;
        a2();
    }
    else
    {
        return 0;
    }
}
