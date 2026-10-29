/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb29640..0xb29768 (296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b29640_0 {
    char padding_0[8];
    long long field_8;
    struct st_b29640_0 *field_10;
} st_b29640_0;


st_b29640_0 * sub_b29640(st_b29640_0 *a0, st_b29640_0 *a1)
{
    st_b29640_0 *v2;  // w0
    st_b29640_0 *v3;  // x22
    st_b29640_0 *v4;  // x23
    st_b29640_0 *v5;  // x0
    long long v6;  // x21
    st_b29640_0 *v7;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (st_b29640_0 *)(unsigned int)sub_a2f9e0();
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
        v3 = sub_9ffdd0(a0->field_8);
        v4 = sub_9ffdd0(a1);
        v5 = sub_9dddcc(sub_a19700(a0->field_8));
        if (v5)
        {
            v6 = v5;
            if (v3 && v4 && !sub_a1adc4(v3, v4, v6))
            {
                sub_9dded4(v6);
                v7 = sub_a18cf0(a1);
                if ((unsigned int)v7)
                {
                    sub_a18c08(a0->field_10);
                    a0->field_10 = a1;
                    return 1;
                }
                return v7;
            }
            sub_a368c8();
            sub_a369bc("providers/implementations/exchange/ecdh_exch.c", 145, "ecdh_match_params");
            sub_a36abc(57, 203, 0);
            sub_9dded4(v6);
        }
        else
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/exchange/ecdh_exch.c", 138, "ecdh_match_params");
            sub_a36abc(57, 0x80003, 0);
        }
        return 0;
    }
    else
    {
        return 0;
    }
}
