/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb53860..0xb5399c (316 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b53860_0 {
    struct st_b53860_0 *field_0;
    struct st_b53860_0 *field_8;
    char padding_10[328];
    long long field_158;
    char field_160;
    char padding_161[255];
    struct st_b53860_0 *field_260;
} st_b53860_0;


st_b53860_0 * sub_b53860(st_b53860_0 *a0, st_b53860_0 *a1, long long a2)
{
    st_b53860_0 *v3;  // w0
    st_b53860_0 *v4;  // x0
    st_b53860_0 *v5;  // x0
    unsigned long v6;  // x21
    st_b53860_0 *v7;  // x22
    char v0;  // [bp-0x68]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = (st_b53860_0 *)(unsigned int)sub_a2f9e0();
    if (!a0)
    {
        return 0;
    }
    else if (v3)
    {
        if (a1)
        {
            v4 = sub_ac3ff0(a1, a0->field_158);
            if (!(unsigned int)v4)
                return v4;
            v5 = sub_ac363c(a1);
            a0->field_8 = v5;
            if (!v5)
                return v5;
            a0->field_0 = a1;
        }
        else if (!a0->field_0)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/signature/slh_dsa_sig.c", 157, "slh_dsa_signverify_msg_init");
            sub_a36abc(57, 114, 0);
            return 0;
        }
        a0->field_260 = 0;
        if (sub_c688bc(&v0, &a0->field_160, 0x100) && sub_b5b058(&v0, 0xffffffff, a0->field_0) && sub_a6eaf8(&v0))
        {
            v6 = &a0->field_260;
            sub_c68eb8(&v0, v6);
            v7 = sub_a6e990(&v0);
            sub_a6ed4c(&v0);
            if (v7 && *(long long *)v6)
                _memmove(&a0->field_160, v7);
        }
        else
        {
            sub_a6ed4c(&v0);
        }
        return sub_b5355c(a0, a2);
    }
    else
    {
        return 0;
    }
}
