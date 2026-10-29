/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa41528..0xa41564 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a41528_0 {
    char padding_0[24];
    struct st_a41528_0 *field_18;
} st_a41528_0;


st_a41528_0 * sub_a41528(st_a41528_0 *a0)
{
    unsigned int v0;  // w8
    unsigned long long v1;  // 4102

    if (!a0)
    {
        return a0;
    }
    else if ((int)a0->field_18)
    {
        return a0;
    }
    else
    {
        do
        {
            /* unsupported instruction */;
            v0 = /* unsupported instruction */;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v1 = arm64g_calculate_condition(19, v0, 1, 0);
        if (!(v1 & 1))
        {
            /* unsupported instruction */;
        }
        else if (1 < (int)v0)
        {
            return a0;
        }
    }
}
