/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f2d14..0x9f2df0 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f2d14_0 {
    char padding_0[16];
    struct st_9f2d14_0 *field_10;
} st_9f2d14_0;


st_9f2d14_0 * sub_9f2d14(st_9f2d14_0 *a0, st_9f2d14_0 *a1, st_9f2d14_0 *a2)
{
    st_9f2d14_0 *v4;  // x8
    st_9f2d14_0 *v5;  // x21
    st_9f2d14_0 *v6;  // x0
    st_9f2d14_0 *v7;  // x8
    st_9f2d14_0 *v0;  // [bp-0x48], Other Possible Types: unsigned long
    st_9f2d14_0 *v1;  // [bp-0x40]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (!a2)
    {
        return 0;
    }
    else if (a0)
    {
        v4 = a0->field_10;
        if (!v4)
            return v4;
        if (a1)
        {
            v5 = a2;
            v0 = a1;
            v1 = a2;
            v6 = sub_a66b6c(v4, &v0);
            if (v6)
                return v6->field_10;
            a2 = v5;
            if (!_strcmp(a1, "ENV"))
            {
                v7 = sub_a6ac44(a2);
                a2 = v5;
                if (v7)
                    return v7;
            }
        }
        v0 = "default";
        v1 = a2;
        v6 = sub_a66b6c(a0->field_10, &v0);
        if (!v6)
            return 0;
        return v6->field_10;
    }
    else
    {
        return sub_a6ac44();
    }
}
