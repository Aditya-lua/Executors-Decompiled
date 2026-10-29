/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f2c30..0x9f2c74 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f2c30_0 {
    char padding_0[16];
    struct st_9f2c30_0 *field_10;
} st_9f2c30_0;


st_9f2c30_0 * sub_9f2c30(st_9f2c30_0 *a0, st_9f2c30_0 *a1)
{
    st_9f2c30_0 *v4;  // x0
    st_9f2c30_0 *v0;  // [bp-0x28]
    st_9f2c30_0 *v1;  // [bp-0x20]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (a0 && a1)
    {
        v0 = a1;
        v1 = 0;
        if (a0->field_10)
        {
            v4 = sub_a66b6c(a0->field_10, &v0);
            if (!v4)
                return v4;
            return v4->field_10;
        }
    }
    return 0;
}
