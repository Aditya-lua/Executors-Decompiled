/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x61d40..0x61eac (364 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_61d40_0 {
    struct st_61d40_0 *field_0;
    struct st_61d40_0 *field_8;
} st_61d40_0;


st_61d40_0 * sub_61d40(st_61d40_0 **a0, st_61d40_0 *a1, st_61d40_0 **a2, st_61d40_0 *a3, long long a4)
{
    st_61d40_0 *v3;  // x20
    st_61d40_0 *v4;  // x24
    st_61d40_0 *v5;  // x0
    st_61d40_0 *v0;  // [bp-0x58]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a1;
    v4 = a0 + 1;
    if (v4 != a1 && !sub_6926c(a0, a4, v3 + 2))
    {
        if (sub_6926c(a0, v3 + 2, a4))
        {
            v0 = v3;
            sub_62fd8(&v0, 1);
            if (v0 != v4 && !sub_6926c(a0, a4, v0 + 2))
                return sub_620ac(a0, a2, a4);
            if (!v3->field_8)
            {
                *a2 = v3;
                return &v3->field_8;
            }
            *a2 = v0;
            return v0;
        }
        else
        {
            *a2 = v3;
            a3->field_0 = v3;
            return a3;
        }
    }
    if (*a0 != v3)
    {
        v5 = sub_62884(v3);
        if (!sub_6926c(a0, v5 + 2, a4))
            return sub_620ac();
    }
    else
    {
        v5 = v3;
    }
    if (!v3->field_0)
    {
        *a2 = v3;
        return v3;
    }
    *a2 = v5;
    return &v5->field_8;
}
