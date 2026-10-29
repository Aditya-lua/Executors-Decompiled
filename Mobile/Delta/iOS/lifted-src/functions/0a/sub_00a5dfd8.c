/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5dfd8..0xa5e05c (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5dfd8_0 {
    struct st_a5dfd8_0 *field_0;
    char padding_8[24];
    struct st_a5dfd8_0 *field_20;
    struct st_a5dfd8_0 *field_28;
} st_a5dfd8_0;


st_a5dfd8_0 * sub_a5dfd8(st_a5dfd8_0 *a0, st_a5dfd8_0 *a1)
{
    long long v2;  // x0
    st_a5dfd8_0 **v3;  // x22
    st_a5dfd8_0 **v4;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        return 0;
    }
    else if (!a1)
    {
        return 0;
    }
    else if (a0->field_20)
    {
        v2 = sub_a5dd14(a0);
        if (a1->field_0)
        {
            v3 = &a1->field_28;
            do
            {
                v4 = v3;
                if (!sub_a6fbc4(v2))
                    return 0xfffffffe;
            } while ((v3 = v4 + 5, *v4));
        }
    }
}
