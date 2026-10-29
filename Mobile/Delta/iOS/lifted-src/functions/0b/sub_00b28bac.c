/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb28bac..0xb28c78 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b28bac_0 {
    char padding_0[8];
    long long field_8;
    struct st_b28bac_0 *field_10;
} st_b28bac_0;


st_b28bac_0 * sub_b28bac(st_b28bac_0 *a0, st_b28bac_0 *a1)
{
    st_b28bac_0 *v2;  // w0
    st_b28bac_0 *v3;  // x22
    st_b28bac_0 *v4;  // x0
    st_b28bac_0 *v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (st_b28bac_0 *)(unsigned int)sub_a2f9e0();
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
        v3 = sub_12738(a1);
        v4 = sub_12738(a0->field_8);
        if (v3 && v4 && sub_a610f8(v3))
        {
            v5 = sub_9ffbf8(a1);
            if (!(unsigned int)v5)
                return v5;
            sub_9ffb3c(a0->field_10);
            a0->field_10 = a1;
            return 1;
        }
        sub_a368c8();
        sub_a369bc("providers/implementations/exchange/dh_exch.c", 159, "dh_match_params");
        sub_a36abc(57, 203, 0);
        return 0;
    }
    else
    {
        return 0;
    }
}
