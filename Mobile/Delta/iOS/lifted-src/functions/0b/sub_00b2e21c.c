/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2e21c..0xb2e2d4 (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2e21c_0 {
    char padding_0[176];
    unsigned long long field_b0;
    unsigned long long field_b8;
    unsigned long long field_c0;
    unsigned long long field_c8;
    unsigned int field_d0;
} st_b2e21c_0;


int sub_b2e21c(st_b2e21c_0 *a0, unsigned long a1, unsigned long a2, long long a3)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
    {
        return 0;
    }
    else if (!sub_b2e2e0(a0, a3))
    {
        return 0;
    }
    else if (!a0->field_d0)
    {
        if (!a0->field_b0)
        {
            return 0;
        }
        else if (!a0->field_c0)
        {
            return 0;
        }
        else if (!a0->field_b8)
        {
            return 0;
        }
        else if (!a0->field_c8)
        {
            return 0;
        }
        else if (sub_b49c6c(a0))
        {
            a0->field_d0 = 1;
        }
        else
        {
            return 0;
        }
    }
}
