/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3c894..0xb3c9b8 (292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3c894_0 {
    char padding_0[17];
    char field_11;
    char padding_12[62];
    struct st_b3c894_0 *field_50;
    long long field_58;
    struct st_b3c894_0 *field_60;
} st_b3c894_0;


st_b3c894_0 * sub_b3c894(st_b3c894_0 *a0, long long a1, unsigned long a2, unsigned long a3, unsigned long a4)
{
    st_b3c894_0 *v2;  // w0
    st_b3c894_0 *v3;  // w0
    st_b3c894_0 *v4;  // w0
    st_b3c894_0 *v5;  // w0
    st_b3c894_0 *v6;  // w0
    st_b3c894_0 *v7;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a6fbc4(a1, "bits"))
    {
        v2 = (st_b3c894_0 *)(unsigned int)sub_a6fe3c();
        if (!v2)
            return v2;
    }
    if (sub_a6fbc4(a1, "security-bits"))
    {
        v3 = (st_b3c894_0 *)(unsigned int)sub_a6fe3c();
        if (!v3)
            return v3;
    }
    if (sub_a6fbc4(a1, "max-size"))
    {
        v4 = (st_b3c894_0 *)(unsigned int)sub_a6fe3c();
        if (!v4)
            return v4;
    }
    if (sub_a6fbc4(a1, "encoded-pub-key"))
    {
        if (1 >= (unsigned int)(int)a0->field_60)
        {
            v5 = (st_b3c894_0 *)(unsigned int)sub_a715c0();
            if (!v5)
                return v5;
        }
    }
    else
    {
        if (!a0)
            return 0;
    }
    v6 = (st_b3c894_0 *)(unsigned int)sub_a6f968(0, a1, "pub", &a0->field_11, a0->field_58);
    if (!v6)
        return v6;
    if (!a0->field_50)
        return 1;
    v7 = (st_b3c894_0 *)(unsigned int)sub_a6f968(0, a1, "priv");
    if (!v7)
        return v7;
    return 1;
}
