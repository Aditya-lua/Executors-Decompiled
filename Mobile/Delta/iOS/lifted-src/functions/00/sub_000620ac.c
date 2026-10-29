/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x620ac..0x62144 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_620ac_0 {
    struct st_620ac_0 *field_0;
    struct st_620ac_0 *field_8;
} st_620ac_0;


st_620ac_0 * sub_620ac(st_620ac_0 **a0, st_620ac_0 **a1, long long a2)
{
    st_620ac_0 *v2;  // x8
    st_620ac_0 *v3;  // x20
    st_620ac_0 *v4;  // x23
    st_620ac_0 *v5;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0[1];
    v3 = a0 + 1;
    if (a0[1])
    {
        while (1)
        {
            v4 = v2;
            if (sub_6926c(a0, a2, v2 + 2))
            {
                v2 = v4->field_0;
                v3 = v4;
                if (!v4->field_0)
                    break;
            }
            else if (!sub_6926c(a0, v4 + 2, a2) || !(v5 = v4, v2 = v5->field_8, v3 = &v5->field_8, v5->field_8))
            {
                break;
            }
        }
    }
    else
    {
        v4 = v3;
    }
    *a1 = v4;
    return v3;
}
