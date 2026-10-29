/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb92b0c..0xb92c40 (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b92b0c_0 {
    unsigned long long field_0;
    long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_b92b0c_0;


st_b92b0c_0 * sub_b92b0c(st_b92b0c_0 *a0)
{
    st_b92b0c_0 *v2;  // x0
    unsigned long i;  // x22
    unsigned long long v4;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    if (v2->field_10)
    {
        i = 0;
        do
        {
            v2 = a0->field_8 + 24 * i;
            i += 1;
            if (v2->field_0)
            {
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v4 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                if (!(v4 & 1))
                {
                    /* unsupported instruction */;
                    v2 = sub_b869ec();
                }
            }
        } while (i != a0->field_10);
    }
    if (a0->field_0)
        v2 = _free(a0->field_8);
    if (!a0->field_18)
        return v2;
    return _free();
}
