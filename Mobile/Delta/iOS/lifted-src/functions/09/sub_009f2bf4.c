/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f2bf4..0x9f2c30 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f2bf4_0 {
    char padding_0[16];
    struct st_9f2bf4_0 *field_10;
} st_9f2bf4_0;


st_9f2bf4_0 * sub_9f2bf4(st_9f2bf4_0 *a0, st_9f2bf4_0 *a1)
{
    unsigned long long v5;  // x30
    st_9f2bf4_0 *v6;  // x0
    st_9f2bf4_0 *v0;  // [bp-0x28]
    st_9f2bf4_0 *v1;  // [bp-0x20]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
    {
        return 0;
    }
    else if (a1)
    {
        v2 = &v4;
        v3 = v5;
        v0 = a1;
        v1 = 0;
        v6 = a0->field_10;
        if (v6)
            v6 = sub_a66b6c(v6, &v0);
        return v6;
    }
    else
    {
        return 0;
    }
}
