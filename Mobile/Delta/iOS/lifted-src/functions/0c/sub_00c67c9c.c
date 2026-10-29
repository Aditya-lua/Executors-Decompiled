/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc67c9c..0xc67d60 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c67c9c_0 {
    char padding_0[32];
    struct st_c67c9c_0 *field_20;
    struct st_c67c9c_0 *field_28;
    char padding_30[8];
    long long field_38;
    char padding_40[32];
    struct st_c67c9c_0 *field_60;
    struct st_c67c9c_0 *field_68;
} st_c67c9c_0;


st_c67c9c_0 * sub_c67c9c(st_c67c9c_0 *a0)
{
    st_c67c9c_0 *v3;  // x20
    st_c67c9c_0 *v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    if (!a0 || !a0->field_20 && !a0->field_68)
        return 0;
    if (!a0->field_60)
    {
        return a0->field_20;
    }
    else if (sub_a7c17c(a0->field_38) && sub_a7c1b4(a0->field_38))
    {
        if (!a0->field_28)
        {
            if (sub_c678c0(&v0, a0) && sub_a7c198(a0->field_38))
            {
                v3 = a0->field_28;
                if (!v3)
                {
                    v3 = v0->field_20;
                    a0->field_28 = v3;
                    v0->field_20 = 0;
                }
                if (!sub_a7c1b4(a0->field_38))
                    v3 = 0;
            }
            else
            {
                v3 = 0;
            }
            sub_a5a4c8(v0);
            return v3;
        }
        else
        {
            return a0->field_28;
        }
    }
    return 0;
}
