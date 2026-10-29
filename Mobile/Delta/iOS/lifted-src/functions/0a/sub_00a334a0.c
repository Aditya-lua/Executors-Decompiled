/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa334a0..0xa3355c (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a334a0_0 {
    char padding_0[200];
    struct st_a334a0_0 *field_c8;
    struct st_a334a0_0 *field_d0;
    struct st_a334a0_0 *field_d8;
} st_a334a0_0;

extern long long g_f0d560;
extern st_a334a0_0 *g_f12810;
extern st_a334a0_0 *g_f12818;

st_a334a0_0 * sub_a334a0(st_a334a0_0 *a0, st_a334a0_0 *a1)
{
    st_a334a0_0 *v2;  // x8
    st_a334a0_0 *v3;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        return a0;
    }
    else if (a0->field_d8)
    {
        if (a1 && !sub_a7c198(g_f0d560))
            return a0;
        a0->field_d8 = 0;
        v2 = a0->field_c8;
        v3 = a0->field_d0;
        if (v3)
            v3->field_c8 = v2;
        if (v2)
            v2->field_d0 = v3;
        if (g_f12810 == a0)
            g_f12810 = a0->field_d0;
        if (g_f12818 == a0)
        {
            g_f12818 = v2;
            if (!a1)
                return a0;
        }
        else if (!a1)
        {
            return a0;
        }
    }
    else
    {
        return a0;
    }
}
