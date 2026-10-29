/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3f3d0..0xa3f490 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3f3d0_0 {
    unsigned long long field_0;
    char padding_8[16];
    struct st_a3f3d0_0 *field_18;
    char padding_20[144];
    struct st_a3f3d0_0 *field_b0;
} st_a3f3d0_0;


st_a3f3d0_0 * sub_a3f3d0(st_a3f3d0_0 **a0, unsigned long long a1, st_a3f3d0_0 *a2)
{
    st_a3f3d0_0 *v2;  // x0
    st_a3f3d0_0 *v3;  // x0
    unsigned int v4;  // w8
    unsigned long long v5;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0[7])
    {
        if (a0[1] && a0[1]->field_b0)
            a0[1]->field_b0();
        a0[7] = 0;
        sub_a50dbc(a0, 2);
    }
    sub_a3f490(a0, a1);
    if ((unsigned int)a1)
        a0[1] = 0;
    v2 = sub_a32e7c(a0[2]);
    a0[2] = 0;
    if (a2)
        return v2;
    v3 = a0[8];
    if (v3 && !(int)v3->field_18)
    {
        do
        {
            /* unsupported instruction */;
            v4 = /* unsupported instruction */;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v5 = arm64g_calculate_condition(19, v4, 1, 0);
        if (!(v5 & 1))
        {
            /* unsupported instruction */;
        }
        else if (1 < (int)v4)
        {
            a0[8] = 0;
            *a0 = 0;
            return v3;
        }
        v3 = sub_a50b58();
    }
    a0[8] = 0;
    *a0 = 0;
    return v3;
}
