/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c5460..0x9c5520 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c5460_0 {
    struct st_9c5460_0 *field_0;
    struct st_9c5460_0 *field_8;
} st_9c5460_0;


st_9c5460_0 * sub_9c5460(long long a0, long long a1, st_9c5460_0 *a2)
{
    st_9c5460_0 *v3;  // x0
    st_9c5460_0 *v4;  // x19
    st_9c5460_0 *v5;  // x0
    st_9c5460_0 *v6;  // x8
    st_9c5460_0 *v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_9c8d24(a1, a0, 0);
    if (!v3)
        return v3;
    v4 = v3;
    if (a2)
    {
        v5 = a2->field_0;
        if (!v5)
        {
            v5 = sub_9cf1f0(NULL);
            if (!v5)
            {
                sub_9cf0f4(v4);
                return 0;
            }
            a2->field_0 = v5;
        }
    }
    else
    {
        v5 = sub_9cf1f0();
        if (!v5)
        {
            sub_9cf0f4(v4);
            return 0;
        }
    }
    v0 = v5;
    v6 = v5;
    if (((int)v6->field_0 | 4) != 5)
    {
        v6 = v5;
        if (v5->field_8)
        {
            sub_9cdd00(&v0, 0, 0);
            v6 = v0;
        }
    }
    *(unsigned int *)&v6->field_0 = 16;
    v6->field_8 = v4;
    return v5;
}
