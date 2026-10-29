/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4ffa4..0xb500d4 (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4ffa4_0 {
    struct st_b4ffa4_0 *field_0;
    char padding_8[320];
    unsigned int field_148;
    char field_14c;
    char padding_14d[259];
    struct st_b4ffa4_0 *field_250;
    struct st_b4ffa4_0 *field_258;
} st_b4ffa4_0;


st_b4ffa4_0 * sub_b4ffa4(st_b4ffa4_0 *a0, st_b4ffa4_0 *a1, long long a2)
{
    st_b4ffa4_0 *v3;  // x21
    st_b4ffa4_0 *v4;  // w0
    st_b4ffa4_0 *v5;  // x0
    st_b4ffa4_0 **v6;  // x21
    st_b4ffa4_0 *v7;  // x22
    char v0;  // [bp-0x68]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a1;
    v4 = (st_b4ffa4_0 *)(unsigned int)sub_a2f9e0();
    if (!a0)
    {
        return 0;
    }
    else if (v4)
    {
        if (v3)
        {
            a0->field_0 = v3;
        }
        else
        {
            v3 = a0->field_0;
            if (!v3)
            {
                sub_a368c8();
                sub_a369bc("providers/implementations/signature/ml_dsa_sig.c", 0x88, "ml_dsa_signverify_msg_init");
                sub_a36abc(57, 114, 0);
                return 0;
            }
        }
        v5 = sub_a8092c(v3, a0->field_148);
        if (!(unsigned int)v5)
            return v5;
        a0->field_250 = 0;
        if (sub_c688bc(&v0, &a0->field_14c, 0x100) && sub_b5aecc(&v0, 0xffffffff, a0->field_0) && sub_a6eaf8(&v0))
        {
            v6 = &a0->field_250;
            sub_c68eb8(&v0, v6);
            v7 = sub_a6e990(&v0);
            sub_a6ed4c(&v0);
            if (v7 && *v6)
                _memmove(&a0->field_14c, v7);
        }
        else
        {
            sub_a6ed4c(&v0);
        }
        *(unsigned int *)&a0->field_258 = 0;
        return sub_b4fccc(a0, a2);
    }
    else
    {
        return 0;
    }
}
